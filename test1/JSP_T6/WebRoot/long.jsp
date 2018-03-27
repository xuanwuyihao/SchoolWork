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

		<title>My JSP 'long.jsp' starting page</title>

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
		<form action="userbean1.jsp" method="post">
			<table cellspacing="1" bgcolor="yellow" align="center" width="50%">
				<tr bgcolor="white">
					<td colspan="2" align="center">
						用户注册
					</td>
				</tr>
				<tr bgcolor="white">
					<td align="center">
						编号：
					</td>
					<td>
						<input type="text" name="id">
					</td>
				</tr>
				<tr bgcolor="white">
					<td align="center">
						名字：
					</td>
					<td>
						<input type="text" name="uname">
					</td>
				</tr>
				<tr bgcolor="white">
					<td align="center">
						年齡：
					</td>
					<td>
						<input type="text" name="age">
					</td>
				</tr>
				<tr bgcolor="white">
					<td align="center">
						已婚：
					</td>
					<td>
						<input type="radio" name="marry" value="true">
						是
						<input type="radio" name="marry" value="false">
						否
					</td>
				</tr>
				<tr bgcolor="white">
					<td align="center">
						爱好：
					</td>
					<td>
						<input type="checkbox" name="aihao" value="音乐">
						音乐
						<input type="checkbox" name="aihao" value="体育">
						体育
						<input type="checkbox" name="aihao" value="旅游">
						旅游
						<input type="checkbox" name="aihao" value="购物">
						购物
						<input type="checkbox" name="aihao" value="游戏">
						游戏
					</td>
				</tr>
				<tr bgcolor="white">
					<td colspan="2" align="center">
						<input type="submit" name="提交">
					</td>
				</tr>


			</table>

		</form>
	</body>
</html>
