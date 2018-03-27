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
        <title>
             金字塔 - 综合金融服务后台管理 - 角色列表
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
              <a><cite>用户管理</cite></a>
              <a><cite>角色管理</cite></a>
            </span>
            <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  href="javascript:location.replace(location.href);" title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
        </div>
        <div class="x-body">
            
            <xblock><button class="layui-btn" onclick="role_add('添加角色','manager/role-add','800','500')"><i class="layui-icon">&#xe608;</i>添加</button><span class="x-right" style="line-height:40px">共有数据：${count } 条</span></xblock>
            <table class="layui-table">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>角色名 </th>
                        <th>别名</th>
                        <th>描述</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <tbody>
	                <c:forEach items="${roles }" var="role">
						<tr>
							<td>${role.id }</td>
							<td>${role.rolename }</td>
							<td>${role.alias }</td>
							<td>${role.description }</td>
							<td class="td-manage">
	                            <a title="编辑" href="javascript:;" onclick="role_edit('编辑','manager/role-edit/${role.id }','4','','510')" class="ml-5" style="text-decoration:none">
	                                <i class="layui-icon">&#xe642;</i>
	                            </a>
	                            <a title="删除" href="javascript:;" onclick="role_del(this,${role.id })" style="text-decoration:none">
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
            });

            
             /*添加*/
            function role_add(title,url,w,h){
                x_admin_show(title,url,w,h);
            }

             
            //编辑
            function role_edit (title,url,id,w,h) {
                x_admin_show(title,url,w,h); 
            }
            /*删除*/
            function role_del(obj,id){
                layer.confirm('确认要删除吗？',function(index){
                	
        	       	$.ajax({
   	    			 async:false,
   	    		 	 cache:true,
   	    		 	 url:'manager/deleteRole',
   	    		 	 type:'post',
   	     		 	data:{
   	     		 		"r_id":id
   	     		 	},
   	    		 	 success:function(result){
   	    		 		layer.msg('已删除!',{icon:1,time:1000});
   	    		 		setTimeout (function(){
   	    		 		location.reload();
   	    		 		},500);//延迟半秒刷新
   	    		 		
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