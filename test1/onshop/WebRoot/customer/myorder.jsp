<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>我的订单</title>
    
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
     <table width="100%">
     <tr><td>商品信息</td><td>数量</td><td>总价</td><td>订单状态</td><td>操作</td></tr>
     
     <c:forEach items="${map}" var="m">
               <tr><td colspan="5">订单编号：${m.key.oid }</td></tr>
               
               <tr>
               <td >
               
               <table>
               <tr><td rowspan="4"><img src="${m.value.bdesc }" width="100" height="80"/></td></tr>
               <tr><td>${m.value.pname }</td></tr>
               <tr><td>有效期：${m.value.btime }</td></tr>
               <tr><td><a href="homepage.jsp">团购商城</a></td></tr>
               </table>
               </td>
               
               <td>${m.key.ocount }</td>
               <td>${m.key.ototal }</td>
               <td><c:if test="${m.key.ostate==0}">未支付</c:if>
						<c:if test="${m.key.ostate==1}">未消费</c:if>
						<c:if test="${m.key.ostate==2}">已消费</c:if>
						<c:if test="${m.key.ostate==3}">已评价</c:if>
			    </td>
               <td>
                       <c:if test="${m.key.ostate==0}">
							<a href="onshop?method=order&pid=${m.value.pid }&count=${m.key.ocount }" target="_top">去支付</a>
							<br /><!--不应该进ORDER方法了，避免重复下单-->
							<input type="button" value="取消订单" />
						</c:if>
						<c:if test="${m.key.ostate==1}">
							<a href="users?method=selyzm&oid=${m.key.oid }">查看验证码</a>
						</c:if>
						<c:if test="${m.key.ostate==2}">
							<a href="users?method=toassess&pid=${m.value.pid }&oid=${m.key.oid }">去评价</a>
						</c:if>
						<c:if test="${m.key.ostate==3}"></c:if>    
               </td>
               </tr>
               </c:forEach>
     </table>
  </body>
</html>         
