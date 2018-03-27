<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE>
<html>
	<head>
		<base href="<%=path%>/">
		<title>My JSP 'userList.jsp' starting page</title>
	</head>
	<body>
	<a href="users/adds">新增</a>
	<table border="1">
			<tr>
				<td>编号</td><td>姓名</td><td>年龄</td><td>性别</td><td>操作</td>
			</tr>
			
			
			<c:forEach items="${lists }" var="user">
			<tr>
				<td>${user.id }</td>
				<td>${user.name }</td>
				<td>${user.age }</td>
				<td>${user.sex }</td>
				<td><a href="user/updates/${user.id }">修改</a>|
					<a href="user/deletes/${user.id }">删除</a></td>
			</tr>
			</c:forEach>
			
	</table>
	
	</body>

</html>