<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userinpwd.jsp' starting page</title>
    
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
  <h2>修改密码</h2>
  <hr/>
  <form action="users?method=inpwd" method="post">
   <table  align="center" width="45%" height="250">
      <tr>
      <td width="33%"><b>请输入原密码：</b></td><td><input type="password" name="oldpwd"></td>
      </tr>
      <tr>
      <td><b>请输入新密码：</b></td><td><input type="password" name="newpwd"></td>
      </tr>
      <tr>
       <td><b>请再次确认新密码:</b></td><td><input type="password" name="newpwd2"></td>
       </tr>
       <tr>
       <td colspan="2" align="center"><input type="submit" value="确认修改"></td>
      </tr>
   </table>
   </form>
  </body>
</html>
