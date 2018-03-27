<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'upload.jsp' starting page</title>
    
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
    <!-- 1、使用post提交 并加上enctype="multipart/form-data" -->
    <form action="UploadServlet" method="post" enctype="multipart/form-data">
    姓名：<input type="text" name="uname"/><br/>
    头像1：<input type="file" name="img1"/><br/>
    <!-- 头像2：<input type="file" name="img2"/><br/> -->
    <input type="submit" value="上传"/>
    </form>
  </body>
</html>
