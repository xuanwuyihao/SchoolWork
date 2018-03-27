<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'menu.jsp' starting page</title>
    <link type="text/css" href="css/lrtk.css" rel="stylesheet" />
    
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/jquery.color-rgba-patch.js"></script>
	<script type="text/javascript" src="js/example.js"></script>
  </head>
  
  <body>
   <!-- 代码开始 -->
<div class="nav-wrap" style="display:none">
	<ul class="group" id="example-one">
		<li class="current_page_item"><a href="http://www.lanrentuku.com" target="_blank">Home</a></li>
		<li><a href="http://www.lanrentuku.com" target="_blank">Buy Tickets</a></li>
		<li><a href="http://www.lanrentuku.com" target="_blank">Group Sales</a></li>
		<li><a href="http://www.lanrentuku.com" target="_blank">Reviews</a></li>
		<li><a href="http://www.lanrentuku.com" target="_blank">The Show</a></li>
		<li><a href="http://www.lanrentuku.com" target="_blank">Videos</a></li>
		<li><a href="http://www.lanrentuku.com" target="_blank">Photos</a></li>
		<li><a href="http://www.lanrentuku.com" target="_blank">Magic Shop</a></li>
	</ul>
</div>
	
<div class="nav-wrap">   
	<ul class="group" id="example-two">
		<li><a rel="#fe4902" href="http://www.lanrentuku.com" target="_blank">首页</a></li>
		<li><a rel="#A41322" href="http://www.lanrentuku.com" target="_blank">					</a></li>
		<li><a rel="#C6AA01" href="http://www.lanrentuku.com" target="_blank">Group Sales</a></li>
		<li><a rel="#900" href="http://www.lanrentuku.com" target="_blank">Reviews</a></li>
		<li><a rel="#D40229" href="http://www.lanrentuku.com" target="_blank">The Show</a></li>
		<li class="current_page_item_two"><a rel="#98CEAA" href="http://www.lanrentuku.com" target="_blank">Videos</a></li>
		<li><a rel="#1B9B93" href="http://www.lanrentuku.com" target="_blank">Photos</a></li>
		<li><a rel="#8DC91E" href="http://www.lanrentuku.com" target="_blank">Magic Shop</a></li>
	</ul>
</div>
  </body>
</html>
