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
            金字塔 - 综合金融服务后台管理 - 管理员列表
        </title>
        <base href="<%=path%>/">
        <meta name="renderer" content="webkit">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta name="apple-mobile-web-app-status-bar-style" content="black">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="format-detection" content="telephone=no">
        <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
        <script type="text/javascript" src="lib/layui/lay/modules/laypage.js"></script>
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
              <a><cite>用户管理</cite></a>
              <a><cite>管理员列表</cite></a>
            </span>
            <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  href="javascript:location.replace(location.href);" title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
        </div>
        <div class="x-body">
            <form class="layui-form x-center" action="manager/admin-vagueSelect" style="width:80%" id="vagueForm">
                <div class="layui-form-pane" style="margin-top: 15px;">
                <input type="hidden" value="${pages }" id="pageCount" />
		    	<input type="hidden" value="${pageSize }" id="pageSize" name="tow" />
		    	<input type="hidden" value="${current }" id="current" name="fist" />
		    	<input type="hidden" value="${vague }" id="vague" />
		    	<input type="hidden" value="${pd }" name="pd" />
                  <div class="layui-form-item">
                    <label class="layui-form-label">登录名</label>                   
                    <div class="layui-input-inline">
                      <input type="text" name="title" id="title" value="${title }"  placeholder="请输入登录名" autocomplete="off" class="layui-input">
                    </div>
                     <label class="layui-form-label">角色</label>                   
                    <div class="layui-input-inline">
                      <input type="text" name="people" id="people" value="${people }"  placeholder="请输入角色名" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-input-inline" style="width:80px">
                        <button class="layui-btn"  lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
                    </div>
                  </div>
                </div> 
            </form>
            <xblock><button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon">&#xe640;</i>批量删除</button><button class="layui-btn" onclick="admin_add('添加用户','manager/admin-add','600','500')"><i class="layui-icon">&#xe608;</i>添加</button><span class="x-right" style="line-height:40px">共有数据：${count } 条</span></xblock>
            <table class="layui-table">
                <thead>
                    <tr>
                    	<th><input type="checkbox" name="" value=""> </th>
                        <th>ID </th>
                        <th>登录名</th>
                       	<th>真实姓名 </th>
                        <th>角色</th>
                        <th>电话 </th>
                        <th>邮箱</th>
                        <th>上次登录时间 </th>
                        <th>上次登录ip</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <tbody>
                	<c:forEach items="${managers }" var="manager">
                    <tr>
                    	<td ><input type="checkbox" value="${manager.id }" name="text"></td >
                        <td >${manager.id } </td>
                        <td >${manager.username } </td>
                        <td >${manager.realname }</td>
                        <td >${manager.role } </td>
                        <td >${manager.phone } </td>
                        <td >${manager.email }</td>
                        <td ><fmt:formatDate value="${manager.lasttime }" pattern="yyyy-MM-dd HH:mm:dd"/> </td>
                        <td >${manager.lastip	 } </td>
                        <!-- <td class="td-status"><span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span>  </td> -->
                        <td class="td-manage">
                            <!-- <a style="text-decoration:none" onclick="admin_stop(this,'10001')" href="javascript:;" title="停用">
                                <i class="layui-icon">&#xe601;</i>
                            </a> -->
                            <a title="编辑" href="javascript:;" onclick="admin_edit('编辑','manager/admin-edit/${manager.id }','4','','510')"
                            class="ml-5" style="text-decoration:none">
                                <i class="layui-icon">&#xe642;</i>
                            </a>
                            <a title="删除" href="javascript:;" onclick="admin_del(this,${manager.id})" 
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
            layui.use(['laydate','element','laypage','layer'], function(){
                $ = layui.jquery;//jquery
              laydate = layui.laydate;//日期插件
              lement = layui.element();//面包导航
              laypage = layui.laypage;//分页
              layer = layui.layer;//弹出层

              //以上模块根据需要引入
              //总页数
              var pages=$("#pageCount").val() ;  
              //每页行数
        	  var page=$("#pageSize").val();  
              var current = $("#current").val();
			     laypage({
			      cont: 'page',
			      pages: pages,//总页数
			      first: 1,
			      last: pages,//最后一页
			      curr:current,   //当前页数
			      prev: '<em><</em>',
			      next: '<em>></em>',
			      jump: function(obj,first){//点击页码出发的事件  
                      if(first!=true){//是否首次进入页面  
                    	  var vg = $("#vague").val();
                      	  if(vg == 1){//代表为模糊查询的分页
                      		var currentPage = obj.curr;//获取点击的页码 
                      		$("#current").val(currentPage);
                      		$("#pageSize").val(2);                   		
                      		window.location.href ='javascript:document:vagueForm.submit()';
                      	  }else{
                      		var currentPage = obj.curr;//获取点击的页码  
                      	
                            window.location.href ="manager/admin-paging?currentPage="+currentPage+"&page="+page; 
                      	  }
                           
                      }  
          			}  
			    });  
              
              var start = {
                min: laydate.now()
                ,max: '2099-06-16 23:59:59'
                ,istoday: false
                ,choose: function(datas){
                  end.min = datas; //开始日选好后，重置结束日的最小日期
                  end.start = datas //将结束日的初始值设定为开始日
                }
              };
              
              var end = {
                min: laydate.now()
                ,max: '2099-06-16 23:59:59'
                ,istoday: false
                ,choose: function(datas){
                  start.max = datas; //结束日选好后，重置开始日的最大日期
                }
              };
              
              document.getElementById('LAY_demorange_s').onclick = function(){
                start.elem = this;
                laydate(start);
              }
              document.getElementById('LAY_demorange_e').onclick = function(){
                end.elem = this
                laydate(end);
              }
              
            });

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
            				url:'manager/admin-delAll',//自己的地址
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
             /*添加*/
            function admin_add(title,url,w,h){
                x_admin_show(title,url,w,h);
            }

             /*停用*/
            function admin_stop(obj,id){
                layer.confirm('确认要停用吗？',function(index){
                    //发异步把用户状态进行更改
                    $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="admin_start(this,id)" href="javascript:;" title="启用"><i class="layui-icon">&#xe62f;</i></a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="layui-btn layui-btn-disabled layui-btn-mini">已停用</span>');
                    $(obj).remove();
                    layer.msg('已停用!',{icon: 5,time:1000});
                });
            }

            /*启用*/
            function admin_start(obj,id){
                layer.confirm('确认要启用吗？',function(index){
                    //发异步把用户状态进行更改
                    $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="admin_stop(this,id)" href="javascript:;" title="停用"><i class="layui-icon">&#xe601;</i></a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span>');
                    $(obj).remove();
                    layer.msg('已启用!',{icon: 6,time:1000});
                });
            }
            //编辑
            function admin_edit (title,url,id,w,h) {
                x_admin_show(title,url,w,h); 
            }
            /*删除*/
            function admin_del(obj,id){
                layer.confirm('确认要删除吗？',function(index){
                    //发异步删除数据
                     $.ajax({  
                        url: 'manager/admin-remove',  
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