<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="s" uri="/struts-tags"%>
	<%@ page import="java.util.*" %>
	<%@ page import="com.qf.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传</title>
<link href="../css/uploadbut.css" rel="stylesheet" type="text/css" />

</head>
<body>
<c:if test="${empty student}">
	<script type="text/javascript">
	//没有登录，去登录界面
	alert("您还未登录，请先登录。");
	location.href = "http://localhost:8080/QingFeng/student/stuLogin.jsp";
	</script>
</c:if>
<c:if test="${!empty student}">
	<s:form action="Save_stu_File" enctype="multipart/form-data"
		method="post">
		<table border="0">
		<tr><th colspan="3" align="center">姓名：${sessionScope.student.s_name }</th></tr>
			<tr>
				<td>相片：</td>
				<td><input type="text" style="height:22px" id="tid1"/></td>
				<td><a href="javascript:;" class="file">浏览... 
					<input type="file" name="image" id="" onchange="settext(this,1)">
					</a>
				</td>
			</tr>
			<tr>
				<td>缴费凭证：</td>
				<td><input type="text" style="height:22px" id="tid2"/></td>
				<td><a href="javascript:;" class="file">浏览... 
					<input type="file" name="image" id=""  onchange="settext(this,2)">
					</a>
				</td>
			</tr>
			<tr>
				<td>论文：</td>
				<td><input type="text" style="height:22px" id="tid3"/></td>
				<td><a href="javascript:;" class="file">浏览... 
					<input type="file" name="image" id=""  onchange="settext(this,3)">
					</a>
				</td>
			</tr>
			
			<tr>
				<td colspan="3" align="center">
					<input type="hidden" value="${sessionScope.student.s_id }" name="stu_id"/>					
				</td>
			</tr>
			<tr>
				<td colspan="3" align="center">
					
					<a href="javascript:;" class="file">确认上传${sessionScope.student.s_id }
					<input type="submit"  id="">
					</a>
				</td>
			</tr>
		</table>
	</s:form>
</c:if>
	<br />


	<script type="text/javascript">

		function settext(val,id) {
			document.getElementById("tid"+id).value = val.value;

		}
	</script>
</body>
</html>