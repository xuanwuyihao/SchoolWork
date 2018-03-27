<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table align="center"  style="width:30%">
<tr><td  colspan="2" ><h3 align="center">你已经报名了！</h3></td></tr>
<tr><td align="right" width="50%"><b>姓名</b></td><td>${stu.s_name}</td></tr>
<tr><td align="right"><b>身份证号码</b></td><td>${stu.id_number}</td></tr>
<tr><td align="right"><b>报考专业</b></td><td>${stu.s_content}</td></tr>
<tr><td align="right"><b>报考时间</b></td><td>${stu.s_date}</td></tr>
<tr><td colspan="2" align="center"><a href="index.jsp">返回首页</a></td></tr>
</table>
</body>
</html>