<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userinfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <form action="users?method=info" method="post">
   <table height="40px">
    <tr><td height="20px">&nbsp;&nbsp;&nbsp;&nbsp;<b>账号：</b>&nbsp;${user.uaccount }</td></tr><br/>
    <tr><td height="20px">&nbsp;&nbsp;&nbsp;&nbsp;<b>昵称：</b>&nbsp;${user.unickname }</td></tr>
    </table>
    <hr/>
       <table align="center" border="1" width="90%">
         <tr><td>账号：</td><td><input type="text" name="account" value="${user.uaccount }"></td></tr>
         <tr><td>昵称：</td><td><input type="text" name="nickname" value="${user.unickname }"></td></tr>
         <tr><td>头像：</td><td>${user.uface }</td></tr>
         <tr><td>账户余额：</td><td>${user.umoney }</td></tr>
         <tr><td>生日：</td><td><input type="text" name="birth" value="${user.ubirth }"></td></tr>
         <tr><td>性别：</td><td><input type="text" name="six" value="${user.usix }"></td></tr>
         <tr><td>邮箱：</td><td><input type="text" name="mail" value="${user.umail }"></td></tr>
         <tr><td colspan="2" align="center"><input type="submit" value="确定"></td></tr>
       </table>
    </form>
  </body>
</html>
