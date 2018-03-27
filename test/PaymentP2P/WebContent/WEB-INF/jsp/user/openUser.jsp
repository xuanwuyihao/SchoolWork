<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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


    <form action="user/update" method="post">
    <input type="hidden" name="id" value="${user.id }" />
          姓名:<input type="text" name="name" value="${user.name }"/>
          年龄:<input type="text" name="age" value="${user.age }"/>
          性别:<input type="text" name="sex" value="${user.sex }"/>
          时间:<input type="text" name="createTime" value="${user.createTime }"/>     
    
    <input type="submit" value="提交"/>
    
    </form>




</body>
</html>