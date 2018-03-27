<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <title>
            金字塔系统
        </title>
        <base href="<%=path%>/">
        <meta name="renderer" content="webkit">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta name="apple-mobile-web-app-status-bar-style" content="black">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="format-detection" content="telephone=no">
        <link rel="stylesheet" href="./css/x-admin.css" media="all">

		<style type="text/css">
			a:focus{text-decoration: none}
			a:focus{outline:none;}
		</style>
</head>
<body>
        <div class="x-nav">
            <span class="layui-breadcrumb">
              <a><cite>首页</cite></a>
              <a><cite>认证管理</cite></a>
              <a><cite>额度申请</cite></a>
            </span>
            <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  href="javascript:location.replace(location.href);" title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
        </div>
        <div class="x-body">
            <xblock><button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon">&#xe640;</i>批量删除</button><span class="x-right" style="line-height:40px">共有数据：${count } 条</span></xblock>
            <table class="layui-table">
                <thead>
                    <tr>
                    	<th><input type="checkbox" name="" value=""> </th>
                        <th>ID </th>
                        <th>用户</th>
                       	<th>申请额度</th>
                        <th>申请时间</th>
                        <th>审核额度</th>
                        <th>审核时间</th>
                        <th>审核状态</th>
                        <th>审核结果</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <tbody>
                	<c:forEach items="${exanmineList }" var="exanmine">
                    <tr>
                    	<td ><input type="checkbox" value="${exanmine.id }" name="text"></td >
                        <td >${exanmine.id } </td>
                        <td >${exanmine.username } </td>
                        <td >${exanmine.applylimit }</td>
                        <td >
                        	<fmt:formatDate value="${exanmine.applytime }"  pattern="yyyy-MM-dd HH:mm:dd"/>
                        </td>
                        <td >${exanmine.examinelimit } </td>
                        <td >
                        	<fmt:formatDate value="${exanmine.examinetime }" pattern="yyyy-MM-dd HH:mm:dd"/> 
                        </td>
                        <td class="td-status" >
                        	<c:if test="${exanmine.status=='未审核' }">
                        		<span class="layui-btn layui-btn-normal layui-btn-mini">未审核</span>
                        	</c:if>
                        	<c:if test="${exanmine.status=='已审核' }">
                        		<span class="layui-btn layui-btn-disabled layui-btn-mini">已审核</span>
                        	</c:if>
                        </td>
                        <td >${exanmine.result	 } </td>
                        <td class="td-manage">
                        	<c:if test="${exanmine.status=='未审核' }">
                        		<a title="编辑" href="javascript:;" onclick="feedback_edit('编辑','user/feedback-edit/${exanmine.id }','3','','450')"
	                            class="ml-5" style="text-decoration:none">
	                                <i class="layui-icon">&#xe642;</i>
	                            </a>
                        	</c:if>
                            <a title="删除" href="javascript:;" onclick="feedback_del(this,${exanmine.id})" 
                            style="text-decoration:none">
                                <i class="layui-icon">&#xe640;</i>
                            </a>
                        </td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>

            <div id="page"></div>
        </div>
        <script src="./lib/layui/layui.js" charset="utf-8"></script>
        <script src="./js/x-layui.js" charset="utf-8"></script>
        <script>
            layui.use(['element','laypage','layer','form'], function(){
                $ = layui.jquery;//jquery
              lement = layui.element();//面包导航
              laypage = layui.laypage;//分页
              layer = layui.layer;//弹出层
              form = layui.form();//弹出层


          })

              

              //以上模块根据需要引入

            //批量删除提交
             function delAll () {
            	var des =[];//建立数组
           	 var i=0;
           	 //取得选中复选框值
           	 $('input[name="text"]:checked').each(function(){
                    var sfruit=$(this).val();//取值
                    des[i]=sfruit;//赋值
                    i++;
                    });
           	 layer.confirm('确认要删除吗？',function(index){
           		 $.ajax({
           				async:true,
           				cache:true,
           				url:'user/exanmine-removeMany',//自己的地址
           				type:'post',
           				traditional: true,//传数组进后台需要设置该属性
           				data:{
           					'des':des
           				},
           				success:function(data){
           					if(data == "success") {
           						layer.msg('已删除!',{icon:1,time:1000}); 
                                   setTimeout(function(){
                                 	  location.reload();
                                   },500);			
           					} 
           				},error:function(XMLHttpRequest,textStates){
           				 	layer.alert('请至少选择一个！',{title: '提示框',	icon:1,	});
           				    layer.close(index);	
           		         }
           			});
           		});
             }
            
            

            // 编辑
            function feedback_edit (title,url,id,w,h) {
                x_admin_show(title,url,w,h); 
            }
            
            /*删除*/
            function feedback_del(obj,id){
                layer.confirm('确认要删除吗？',function(index){
                	$.ajax({  
                        url: 'user/exanmine-remove',  
                        type: 'POST',  
                        data: {"id":id},  
                        success : function(data) {
    						console.info(data);
    						if(data=="success"){
                              layer.msg('已删除!',{icon:1,time:1000}); 
                              setTimeout(function(){
                            	  location.reload();
                              },500);
    						}
    					}					
                    });
                });
            }
            </script>
            
    </body>
</html>