<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="bean.prod"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'produpd.jsp' starting page</title>
    
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
 	//获取去修改封装单个商品的信息
 	prod p=(prod)request.getAttribute("prod");
 	%>
   
   <form action="prod?method=upd" method="post">
   <!--用隐藏域保存ID  -->
   <input type="hidden" name="pid" value="<%=p.getId() %>">
   <table align="center">
   <tr><td colspan="2"><h3>修改商品</h3></td></tr>
   <tr><td>商品名称:</td><td><input type="text" name="pname" value="<%=p.getPname() %>"/></td></tr>
   <tr><td>商品价格:</td><td><input type="text" name="price" value="<%=p.getPrice() %>"/></td></tr>
   <tr><td>生产日期:</td><td><input type="text" name="pricty" value="<%=p.getPricty() %>"/></td></tr>
   <tr><td>生产地址:</td><td><input type="text" name="pdate" value="<%=p.getPdate() %>"/></td></tr>
   <tr><td>库存:</td><td><input type="text" name="pcount" value="<%=p.getPcount() %>"/></td></tr>
   <tr><td colspan="2"><input type="submit" value="修改"></td></tr>
   
   
   
   </table>
   
   </form>
  </body>
</html>
