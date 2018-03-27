<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
	<script type="text/javascript">
	$(document).ready(function(){
	$('#uname').cilck(function(){
	
	var uame=$('#uanem').val;
	var pwd=$('#pwd').val;
	var age=$('#age').val;
	$.ajax({
	url:'chkName.action',
	type:"post",
	data:{'uname':uname,'pwd':pwd,'age':age},
	dataType:"json",
	success:function(result){
	alter(result);
	var obj="岁数"+result.age+"用户名"+result.uname+"密码"+result.pwd;
	$("#infos").html('<font color="red">'+obj+'</font>');
	}
	});
	});
	});
	

	</script>
  </head>
  
  <body>
  <s:form method="post" action="add">
		<s:textfield label="用户名" name="user.uname" id="uname"/><span id="infos"></span>
		<s:password label = "密码" name="user.pwd" id="pwd"/>
		<s:textfield label = "年龄" name="user.age" id="age"/>
		<s:submit value="提交"/>
	</s:form>
  </body>
</html>
