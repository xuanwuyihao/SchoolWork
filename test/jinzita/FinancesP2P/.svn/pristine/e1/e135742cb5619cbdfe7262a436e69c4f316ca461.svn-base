<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>金字塔 - 综合金融服务后台管理 - 轮播列表</title>
<base href="<%=path%>/">
<meta name="renderer" content="webkit">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
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
		<span class="layui-breadcrumb"> <a><cite>首页</cite></a> <a><cite>会员管理</cite></a>
			<a><cite>轮播列表</cite></a>
		</span> <a class="layui-btn layui-btn-small"
			style="line-height: 1.6em; margin-top: 3px; float: right"
			href="javascript:location.replace(location.href);" title="刷新"><i
			class="layui-icon" style="line-height: 30px">ဂ</i></a>
	</div>
	<div class="x-body">
		<input type="hidden" value="${pages }" id="pages" /> 
		<input type="hidden" value="${current }" id="current" />
		<input type="hidden" value="${pageSize }" id="pageSize" />
		<button class="layui-btn"
			onclick="banner_add('添加轮播图','back/banner-add','','510')">
			<i class="layui-icon">&#xe608;</i>添加
		</button>
		<span class="x-right" style="line-height: 40px">共有数据：${count }
			条</span>
		</xblock>
		<table class="layui-table">
			<thead>
				<tr>
					<th>ID</th>
					<th>缩略图</th>
					<th>链接</th>
					<th>描述</th>
					<th>显示状态</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody id="x-img">
				<c:forEach items="${photoList }" var="p">
					<tr>
						<td>${p.id }</td>
						<td><img src="${p.photo }" width="200" height="100" alt="">点击图片试试</td>
						<td>${p.link }</td>
						<td>${p.description }</td>
						<td class="td-status"><c:if test="${p.status=='已显示' }">
								<span class="layui-btn layui-btn-normal layui-btn-mini">
									${p.status } </span>
							</c:if> <c:if test="${p.status=='不显示' }">
								<span class="layui-btn layui-btn-disabled layui-btn-mini">
									${p.status } </span>
							</c:if></td>
						<td class="td-manage"><c:if test="${p.status=='已显示' }">
								<a style="text-decoration: none"
									onClick="banner_stop(this,${p.id })" href="javascript:;"
									title="不显示"><i class="layui-icon">&#xe601;</i></a>
							</c:if> <c:if test="${p.status=='不显示' }">
								<a style="text-decoration: none"
									onClick="banner_start(this,${p.id })" href="javascript:;"
									title="显示"><i class="layui-icon">&#xe62f;</i></a>
							</c:if> <a title="编辑" href="javascript:;"
							onclick="banner_edit('编辑','photo/banner-edit/${p.id }','','510')"
							class="ml-5" style="text-decoration: none"> <i
								class="layui-icon">&#xe642;</i>
						</a> <a title="删除" href="javascript:;"
							onclick="banner_del(this,${p.id })" style="text-decoration: none">
								<i class="layui-icon">&#xe640;</i>
						</a></td>
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
              
              layer.ready(function(){ //为了layer.ext.js加载完毕再执行
                  layer.photos({
                    photos: '#x-img'
                    //,shift: 5 //0-6的选择，指定弹出图片动画类型，默认随机
                  });
                });

              //以上模块根据需要引入
               //总页数
              var pages=$("#pages").val() ;  
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
                      		var currentPage = obj.curr;//获取点击的页码  
                            window.location.href ="photo/list?currentPage="+currentPage+"&page="+page; 
                      }  
          			}  
			    });  
              
            });

             /*添加*/
            function banner_add(title,url,w,h){
                x_admin_show(title,url,w,h);
            }
             /*不显示*/
            function banner_stop(obj,id){
                layer.confirm('确认不显示吗？',function(index){
                    $.ajax({
        				async:true,
        				cache:true,
        				url:'photo/updatep1',
        				type:'post',
        				data:{
        					'id':id,
        					"status":"不显示"
        				},
        				success:function(data){
        					console.info(data);
        					if(data == "success") {
        						layer.msg('不显示!',{icon: 5,time:1000});
        		                setTimeout(function(){
        		                    //add your code
        		                	location.reload();
        		                },500);//延迟1000毫米
        					} else {
        						layer.alert('删除失败！',{
        			               title: '提示框',				
        						icon:1,		
        						  });
        						   layer.close(index);	
        				}
        				},error:function(XMLHttpRequest,textStates){
        				 layer.alert('错误！',{
        	              title: '提示框',				
        				icon:1,		
        				  });
        				   layer.close(index);	
        		         }
        			});
                });
            }
            /*显示*/
            function banner_start(obj,id){
                layer.confirm('确认要显示吗？',function(index){
                    $.ajax({
        				async:true,
        				cache:true,
        				url:'photo/updatep1',
        				type:'post',
        				data:{
        					'id':id,
        					"status":"已显示"
        				},
        				success:function(data){
        					console.info(data);
        					if(data == "success") {
        						layer.msg('已显示!',{icon: 6,time:1000});
        		                setTimeout(function(){
        		                    //add your code
        		                	location.reload();
        		                },500);//延迟1000毫米
        					} else {
        						layer.alert('删除失败！',{
        			               title: '提示框',				
        						icon:1,		
        						  });
        						   layer.close(index);	
        				}
        				},error:function(XMLHttpRequest,textStates){
        				 layer.alert('错误！',{
        	              title: '提示框',				
        				icon:1,		
        				  });
        				   layer.close(index);	
        		         }
        			});
                });
            }
            
            // 编辑
            function banner_edit (title,url,w,h) {
                x_admin_show(title,url,w,h); 
            }
           
            /*删除*/
            function banner_del(obj,id){
                layer.confirm('确认要删除吗？',function(index){
                	$.ajax({ 
           	         async: false,//要求同步 不是不需看你的需求
           	         url : "photo/remove",  
           	         type : 'POST',
           	         data : {
    						"id":id
    					 },
           	         success : function(data) {
      						console.info(data);
     						if(data=="success"){
      		                  layer.msg('已删除!',{icon:1,time:1000});
      		                  setTimeout(function(){
      		                    //add your code
      		                	location.reload();
      		                  },500);//延迟1000毫米
     						}
     					},
     	    		 	 error:function(XMLHttpRequest,textStatus){
     	    		 		 alert("错误");
     	    		 	 }		
                       });
                });
            }
            </script>
</body>
</html>