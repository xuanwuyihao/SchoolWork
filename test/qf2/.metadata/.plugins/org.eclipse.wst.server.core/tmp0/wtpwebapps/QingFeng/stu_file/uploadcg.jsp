<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传成功</title>
</head>
<body>

<div style="padding:5px;border:1px solid #cccccc;text-align:center">

	<table>
		<tr>
			<td><img alt="" src="../Myfiles/<s:property value='stu_file.sf_photo'/>"  height="200" width="200"/></td>
			<td><img alt="" src="../Myfiles/<s:property value='stu_file.sf_paper'/>"  height="200" width="200"/></td>
			<td><img alt="" src="../Myfiles/<s:property value='stu_file.Sf_voucher'/>" height="200" width="200"/></td>
		</tr>
		<tr>
			<td>相片</td>
			<td>论文</td>
			<td>缴费凭证</td>
		</tr>
	</table>



</div>
</body>
</html>