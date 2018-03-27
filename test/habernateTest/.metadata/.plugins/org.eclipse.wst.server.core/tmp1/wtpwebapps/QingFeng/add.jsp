<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<s:form  action="saveStudent" method="post">
<s:textfield name="student.s_name" label="姓名"></s:textfield>
<s:textfield name="student.id_number" label="身份证"></s:textfield>
<s:textfield name="student.s_phone" label="电话"></s:textfield>
<s:textfield name="student.s_systme" label="学制"></s:textfield>
<s:textfield name="student.s_type" label="报考类型"></s:textfield>
<s:submit value="提交"></s:submit>

</s:form>

</body>
</html>