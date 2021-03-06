<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <title>
            金字塔 - 综合金融服务后台管理 - 意见反馈
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
      <input type="text" id="lii" value="${list2 }" style="display: none;" >
      <input type="text" id="ll" value="${ll[1] }"  style="display: none;">
        <div class="x-nav">
            <span class="layui-breadcrumb">
              <a><cite>首页</cite></a>
              <a><cite>评论管理</cite></a>
              <a><cite>意见反馈</cite></a>
            </span>
            <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  href="javascript:location.replace(location.href);" title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
        </div>
        <div class="x-body">
           <form class="layui-form x-center" name="frm" action="opinion/useropinion-fy" style="width:800px">
                <div class="layui-form-pane" style="margin-top: 15px;">
                  <div class="layui-form-item">
                    <label class="layui-form-label">手机号</label>
                    <div class="layui-input-inline">
                     
                       <input type="text" id="phone" name="phone" value="${ll[2] }" placeholder="标题" autocomplete="off" class="layui-input">
                    </div>
                     <label class="layui-form-label">反馈内容</label>
                    <div class="layui-input-inline">
                   
                       <input type="text" id="content" name="content" value="${ll[3] }" placeholder="发表人" autocomplete="off" class="layui-input">
                    </div>
                    
                    <div class="layui-input-inline" style="width:80px">
                        <button class="layui-btn"  name="" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
                    </div>
                  </div>
                </div> 
            </form>
            <xblock><button class="layui-btn layui-btn-danger" onclick="delAll ()"><i class="layui-icon">&#xe640;</i>批量删除</button>
            <span class="x-right" style="line-height:40px">共有数据：${ll[0] } 条</span></xblock>
            <table class="layui-table">
                <thead>
                    <tr>
                        <th><input type="checkbox" name="" value="" id="fx" onclick="seltAll();"></th>
                        <th>ID</th>
                        <th>手机</th>
                        <th>反馈内容</th>
                        <th>时间</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <c:forEach items="${list }" var="list">
                <tbody>
                    <tr>
                        <td>
                            <input type="checkbox" value="${list.id }" name="chckBox">
                        </td>
                        <td>
                           ${list.id }
                        </td>
                        <td>
                            ${list.phone }
                        </td>
                        <td >
                            ${list.content }
                        </td>
                        <td >
                        <f:formatDate value="${list.time }" pattern="yyyy-MM-dd HH:mm:ss"/>
                        </td>
                        <td class="td-manage">
                         <%--   <a title="编辑" href="javascript:;" onclick="level_edit('编辑','level-edit.html','${list.id}','600','400')"
                            style="text-decoration:none">
                              <i class="layui-icon">&#xe642;</i>
                            </a> --%>
                            <a title="彻底删除" href="javascript:;" onclick="commemt_del(this,'${list.id}')" 
                            style="text-decoration:none">
                                <i class="layui-icon">&#xe640;</i>
                            </a>
                        </td>
                    </tr>
                </tbody>
                </c:forEach>
            </table>

            <div id="page"></div>
        </div>
        <script src="./lib/layui/layui.js" charset="utf-8"></script>
        <script src="./js/x-layui.js" charset="utf-8"></script>
      <script type="text/javascript">
        function option(curr){
        	var phone=document.getElementById("phone").value;
        	
        	var content=document.getElementById("content").value;
        	window.location.href='opinion/text?cont='+curr+'&'+'title='+phone+'&'+'people='+content;

             
        	
        }
        </script>
        <script>
            layui.use(['laydate','element','laypage','layer'], function(){
                $ = layui.jquery;//jquery
              laydate = layui.laydate;//日期插件
              lement = layui.element();//面包导航
              laypage = layui.laypage;//分页
              layer = layui.layer;//弹出层

              //以上模块根据需要引入
				var co=document.getElementById("lii").value;//$("#lii").Value;
				var co2=document.getElementById("ll").value;
              laypage({
                cont: 'page'
                ,pages: co2
                ,first: 1
                ,curr:co
                ,last: co2
                ,prev: '<em><</em>'
                ,next: '<em>></em>'
                ,jump: function(obj, first){
                	 var curr = obj.curr;
                      if(!first){ //一定要加此判断，否则初始时会无限刷新
                    	  option(curr);//调用方法
                      
                        }
                    }
              }); 
            });
            // 等级-编辑
            function level_edit (title,url,id,w,h) {
            	var url="opinion/edit?id="+id;
                x_admin_show(title,url,w,h); 
            }

            /*用户-彻底删除*/
           function commemt_del(obj,id){
            	var s=id;
            layer.confirm('确认要删除吗？',function(index){
            	 $.ajax({  
                     url: 'opinion/remove',  
                     type: 'POST',  
                     data: {"id":s},  
                     success : function(data) {
 						console.info(data);
 						if(data=="success"){
 						$(obj).parents("tr").remove();
                           layer.msg('已删除!',{icon:1,time:1000}); 
                           location.reload();
 						}
 					}					
                 });
                });
            }
            </script>
            <!--  批量删除-->
            <script type="text/javascript">  
		    function seltAll(){  
		        var chckBoxSign = document.getElementById("fx");       //ckb 全选/反选的选择框id  
		        var chckBox = document.getElementsByName("chckBox");    //所有的选择框其那么都是chckBox  
		        var num = chckBox.length;  
		        if(chckBoxSign.checked){  
		            for(var index =0 ; index<num ; index++){  
		                chckBox[index].checked = true;  
		                }  
		        }else{  
		            for(var index =0 ; index<num ; index++){  
		                chckBox[index].checked = false;  
		                }  
		            }  
		        }  
		  
		    function delAll () {
            	

           	 var des =[];//建立数组
           	 var i=0;

           	 //取得选中复选框值
           	 $('input[name="chckBox"]:checked').each(function(){
           		 
                    var sfruit=$(this).val();//取值
                   
                    des[i]=sfruit;//赋值
                    
                    i++;
                    
                    });
           	 
           	 
           	 layer.confirm('确认要删除吗？',function(index){
           			
           		 $.ajax({
           				
           				async:true,
           				cache:true,
           				url:'opinion/plsc',//自己的地址
           				type:'post',
           				traditional: true,//传数组进后台需要设置该属性
           				data:{
           					
           					'des':des
           				
           				},
           				
           				dataType:'json',
           				
           				success:function(data){
           					
           					if(data.msg == "success") {
           						
           							
           						// location.reload();
           						 window.location.href='opinion/list';		   
           							
           						 layer.close(index);						
           												
           					} else {
           						layer.alert('删除失败！',{
           			               title: '提示框',				
           						icon:1,		
           						  });
           						   layer.close(index);	
           				}
           					
           					
           				},error:function(XMLHttpRequest,textStates){
           				 layer.alert('请至少选择一个！',{
           	              title: '提示框',				
           				icon:1,		
           				  });
           				   layer.close(index);	
           		         }
           			});
           		    
           			layer.msg('已删除!',{icon:1,time:1000});
           		});


            }
		</script>  
    </body>
</html>