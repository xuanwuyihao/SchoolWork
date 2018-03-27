<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>response</title>
    
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
    <%
    //response是响应客户端请求
    //response.setContentType("text/html;charset=utf-8");//设置响应类型
    //response.sendRedirect();//重定向
    
    request.setAttribute("attle1","value1");
    
   // response.sendRedirect("index.jsp?id=1000");
    
    %>
    
  <%--  <jsp:forward page="index.jsp?id=1000"></jsp:forward>--%>
    <h3>jsp:forward和response.sendRedirect的区别</h3>
    
    <h4>1、jsp:forward是转发、不会改变地址栏路径  response.sendRedirect是重定向 会改变地址栏路径</h4>
    <h4>2、jsp:forward可以获取到request共享的属性 response.sendRedirect不能获取到request共享的属性</h4>
    <h4>3、jsp:forward可以在URL后面或使用jsp:param传递参数 而response.sendRedirect()只能在UR</h4>
    
    
    //2、response的其他方法
    <%
    //让页面5秒刷新一次
    //response.setIntHeader("refresh",5);//单位为秒
    
    //让页面10秒重定向到URL
   // response.setHeader("refresh","10;url=http://www.baidu.com");
    
    %>
    
    <script type="text/javascript">
    //JS让页面每隔五秒刷新一次
    //setInterval("location.href='response.jsp'",5000);
    //setInterval("location.reload()",5000);
    
    //让页面10秒后重定向到其他地址去
    setTimeout("location.href='http://www.baidu.com'",10000)
    </script>
  </body>
</html>
