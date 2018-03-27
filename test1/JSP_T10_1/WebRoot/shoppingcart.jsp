<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'shoppingcart.jsp' starting page</title>
    
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
    <h2>我的购物车</h2>
    <he/>
    <c:set var="total" value="0"></c:set>
    <table width="100%">
    <tr><td>图片</td>
    <td>商品编号</td>
    <td>商品名称</td>
    <td>说明</td>
    <td>单价</td>
    <td>数量</td>
    <td>小计</td></tr>
    <tr><td colspan="7"><hr/></td></tr>
    <c:forEach items="${cartlist}" var="cart">
				<tr>
					<td>
						<img src="img/${cart.prodimg }" width="50" height="40">
					</td>
					<td>
						${cart.prodcode }
					</td>
					<td>
						<b>${cart.prodname }</b>
					</td>
					<td>
						${cart.proddesc }
					</td>
					<td>
						￥${cart.prodprice }
					</td>
					<td>
						${cart.prodcount }
					</td>
					<td>
						<font color="red">￥<f:formatNumber value="${cart.prodprice*cart.prodcount}" pattern="###,###.##"/></font>
						<!-- 给变量累加值 -->
						<c:set var="total" value="${total+cart.prodprice*cart.prodcount}"></c:set>
					</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="7" align="right"><hr/>总计：￥<f:formatNumber value="${total }" pattern="###,###.##"/></td>
			</tr>
    </table>
  </body>
</html>
