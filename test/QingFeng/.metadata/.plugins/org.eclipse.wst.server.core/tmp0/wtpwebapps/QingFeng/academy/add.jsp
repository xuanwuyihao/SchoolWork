<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    <%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>编辑院校</title>
</head>
<body>
<s:form action="save_Academy" >
<s:textfield name="academy.a_school" label="学院名称：" ></s:textfield>
<s:textfield name="academy.a_major" label="专业名称：" ></s:textfield>
<s:textfield name="academy.a_flag" label="标志位：" ></s:textfield>
<s:submit value="提交"></s:submit>
</s:form>


</body>
</html>