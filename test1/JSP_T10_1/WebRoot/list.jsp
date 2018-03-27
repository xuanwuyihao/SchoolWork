<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>图书购物城</title>

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
		<h2 align="center">
			欢迎来到购书城
		</h2>
		<c:if test="${empty user}">
		<h4 align="right"><a href="login.jsp">请登录</a>&nbsp;<a>注册</a></h4>
		</c:if>
		<c:if test="${!empty user}">
		<h4 align="right">欢迎${user.uname },<a href="UserServlet?method=loginout">退出</a></h4>
		</c:if>
		<h4 align="right"><a href="shoppingcart.jsp">购物车(${cartsize }) </a></h4>
		<marquee>
			特价销售！全场购物一律八折！
		</marquee>
		
		<table width="100%">
			<tr>
				<td>
					<ul>
						<c:forEach items="${list}" var="b">
							<li style="float: left; width: 25%; list-style-type: none;">
								<table width="220">
									<tr align="center">
										<td>
											<img src="img/${b.bimg }" width="150" height="100" />
										</td>
									</tr>
									<tr>
										<td>
											<b>${b.bname }</b>
											<font color="#ff0099">￥${b.bprice}</font>
										</td>
									</tr>
									<tr>
										<td>
											<font color="gray">作者：</font>${b.bauthor }
											<c:if test="${b.bstate==0}">
												<font color="green">出售中</font>
											</c:if>
											<c:if test="${b.bstate==1}">
												<font color="red">售罄</font>
											</c:if>
											<c:if test="${b.bstate==3}">
					预售中
				</c:if>
										</td>
									</tr>
									<tr>
										<td>
											<a href="Bookservlet?method=toupd&id=${b.bid }">修改</a>
											<a href="Bookservlet?method=del&id=${b.bid }"
												onclick="return confirm('是否删除?')">删除</a>
											<a href="Bookservlet?method=shoppingcart&id=${b.bid }">添加到购物车</a>
										</td>
									</tr>
									<tr>
										<td height="20px">
											&nbsp;
										</td>
									</tr>
								</table>
							</li>
						</c:forEach>
					</ul>
				</td>
			</tr>
			<tr>
				<td>
					<hr />
					<a href="Bookservlet?method=list&cpage=1">首页</a>
					<a href="Bookservlet?method=list&cpage=${currpage+1 }">下一页</a>
					<a href="Bookservlet?method=list&cpage=${currpage-1 }">上一页</a>
					<a href="Bookservlet?method=list&cpage=${totalpage }">尾页</a>
				</td>
			</tr>
			<tr><td><a href="add.jsp">商品添加</td></tr>
		</table>
	</body>
</html>
