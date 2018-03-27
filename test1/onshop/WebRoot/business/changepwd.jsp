<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'changepwd.jsp' starting page</title>
    
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

   ${msg}
  
    <form action="business?method=updpwd" method="post">
    <input type="hidden" name="bid" value="${bsin.bid}">
    <input type="hidden" name="bpwd1" value="${bsin.bpwd}">
    <table>
    <tr height="50px"></tr>
    <tr><td width="50px" height="50"></td><td><b>原密码：</b></td><td width="50px"></td><td><input type="password" name="bpwd" size="70"></td></tr>
    <tr><td width="50px" height="50"></td><td><b>新密码：</b></td><td width="50px"></td><td><input type="password" name="bpwds" size="70"></td></tr>
    <tr><td width="50px" height="50"></td><td><b>确认密码：</b></td><td width="50px"></td><td><input type="password" name="bpwds" size="70"></td></tr>
    
    <tr><td colspan="4" align="center"  height="50"><input type="submit" value="保存修改"></td></tr>
    </table>
    </form>
  </body>
</html>
