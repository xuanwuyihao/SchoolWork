<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

		<title>商品发布</title>

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
		<h3>
			店铺商品列表
		</h3>
		<table width="100%" cellspacing="1" bgcolor="silver">
			<tr bgcolor="gray">
				<th>
					图片
				</th>
				<th>
					商品名称
				</th>
				<th>
					一级类别
				</th>
				<th>
					二级类别
				</th>
				<th>
					团购价格
				</th>
				<th>
					市场价
				</th>
				
				<th>
					操作
				</th>
			</tr>
			<c:forEach items="${list}" var="prod">
				<tr bgcolor="white">
					<td>
						<img src="${prod.bdesc }" width="100" hight="90">
					</td>
					<td>
						${prod.pname }
					</td>
					<td>
						${prod.ptype1 }
					</td>
					<td>
						${prod.ptype2 }
					</td>
					<td>
						${prod.pprice }
					</td>
					<td>
						${prod.pmarket }
					</td>
					<td>
						<a href="business?method=previewprod&pid=${prod.pid}">预览</a>
						
						<a href="business?method=del&pid=${prod.pid }"
												onclick="return confirm('是否删除?')">删除</a>
					</td>
				</tr>
				
			</c:forEach>
			
			<tr bgcolor="white" height="50px"><td align="right" colspan="7"><a href="business/prodadd.jsp" >添加团购</a></td></tr>
		</table>
		
	</body>
</html>
