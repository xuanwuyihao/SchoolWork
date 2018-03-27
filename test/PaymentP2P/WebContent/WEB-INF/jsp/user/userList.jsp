<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%
String path = request.getContextPath();
%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=path%>/">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
        <h3 align="center">不知道什么表</h2>
		<table border="1" bgcolor="pink" align="center">
			<tr bgcolor="white" align="center">
				<td>编号</td><td>姓名</td><td>年龄</td><td>性别</td><td>创建时间</td><td>操作</td>
			</tr>
			
			<c:forEach items="${userList }" var="user">
			<tr bgcolor="white" align="center">
				<td>${user.id }</td>
				<td>${user.name }</td>
				<td>${user.age }</td>
				<td>${user.sex }</td>
				<td>${user.createTime }</td>
				<td><a href="user/openUsers/${user.id }">修改</a>|
					<a href="user/delete/${user.id }">删除</a></td>
			</tr>
			</c:forEach>
			<tr bgcolor="white" align="center"><td colspan="6"><a href="user/save">添加</a></td></tr>
		</table>

</div>
</body>
</html>