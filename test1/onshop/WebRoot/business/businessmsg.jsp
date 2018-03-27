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

		<title>My JSP 'businessmsg.jsp' starting page</title>

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
	
	${mag }
	 
		<form action="business?method=businessmsg" method="post" target="_top"
			enctype="multipart/form-data">
			<input type="hidden" name="bid" value="${bsin.bid}">
			<table>
				<tr>
					<td width="50px" height="60"></td>
					<td>
						<b>营业执照：</b>
					</td>
					<td width="60px"></td>
					<td>
						<img src="files/${bsin.byyzz }" width="150" height="80">
					</td>
					<td>
						<input type="file" name="byyzz" align="left" />
					</td>
				</tr>
				<tr>
					<td width="50px" height="60"></td>
					<td>
						<b>租赁合同：</b>
					</td>
					<td width="60px"></td>
					<td>
						<img src="files/${bsin.bzlht }" width="150" height="80">
					</td>
					<td>
						<input type="file" name="bzlht" align="left" />
					</td>
				</tr>
				<tr>
					<td width="50px" height="60"></td>
					<td>
						<b>身份证：</b>
					</td>
					<td width="60px"></td>
					<td>
						<input type="text" name="bcard" value="${bsin.bcard }" size="70">
					</td>
				</tr>
				<tr>
					<td width="50px" height="60"></td>
					<td>
						<b>店铺地址：</b>
					</td>
					<td width="60px"></td>
					<td>
						<input type="text" name="badrr" value="${bsin.badrr }" size="70">
					</td>
				</tr>
				<tr>
					<td width="50px" height="60"></td>
					<td>
						<b>总营业额：</b>
					</td>
					<td width="60px"></td>
					<td>
						"${bsin.btotal }" 
					</td>
				</tr>
				<tr>
					<td width="50px" height="60"></td>
					<td>
						<b>入驻时间：</b>
					</td>
					<td width="60px"></td>
					<td>
						${bsin.bdate }
					</td>
				</tr>
				<tr>
					<td width="50px" height="60"></td>
					<td width="60px"></td>
					<td>
						<input type="submit" value="保存修改" size="70">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
