<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

		<title>My JSP 'add.jsp' starting page</title>

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
		<h3 align="center">
			商品添加
		</h3>
		<hr />
		${msg }
		<form action="Bookservlet?method=add" method="post">
		<table width="70%" align="center">
			<tr>
				<td>
					图书名称
				</td>
				<td>
					<input type="text" name="bname">
				</td>
			</tr>
			<tr>
				<td>
					图书价格
				</td>
				<td>
					<input type="text" name="bprice">
				</td>
			</tr>
			<tr>
				<td>
					图书作者
				</td>
				<td>
					<input type="text" name="bauthor">
				</td>
			</tr>
			<tr>
				<td>
					图书出版社
				</td>
				<td>
					<input type="text" name="bpress">
				</td>
			</tr>
			<tr>
				<td>
					图书状态
				</td>
				
				<td>
					<input type="radio" name="bstate" value="0" checked />
					出售中
					<input type="radio" name="bstate" value="1" />
					售罄
					<input type="radio" name="bstate" value="3" />
					预售中
				</td>
			</tr>
			<tr>
				<td>
					封面图片
				</td>
				
				<td>
					<img src="img/1.jpg" width="70" hight="100" />
					<input type="radio" value="1.jpg" name="bimg" checked="checked">
					图片一
					<img src="img/2.jpg" width="70" hight="100" />
					<input type="radio" value="2.jpg" name="bimg">
					图片二
					<img src="img/3.jpg" width="70" hight="100" />
					<input type="radio" value="3.jpg" name="bimg">
					图片三
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="新增" />
					<input type="button" onclick="history.go(-1)" value="返回列表" />
				</td>
			</tr>
		</table>
		</form>
	</body>
</html>
