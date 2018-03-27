<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

		<title>My JSP 'prodadd.jsp' starting page</title>

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
	
		<form action="business?method=" method="post" name="frm"
			enctype="multipart/form-data">
			
			<table width="60%" align="center" cellspacing="1" bgcolor="gray">
				<tr>
					<th colspan="2">
						商品预览
					</th>
				</tr>
				<tr bgcolor="white">
					<td>
						名称：
					</td>
					<td>
						${p.pname }
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						一级分类
					</td>
					<td>
						${p.ptype1 }
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						二级分类
					</td>
					<td>
						${p.ptype2 }
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						团购价：
					</td>
					<td>
						"${p.pprice }"
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						市场价：
					</td>
					<td>
						"${p.pmarket }"
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						商圈
					</td>
					<td>
						${p.btrad}
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						套餐内容
					</td>
					<td>
						${p.bcontent }"
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						使用说明
					</td>
					<td>
						${p.bdesc }
					</td>
				</tr>
				
				<tr bgcolor="white">
					<td>
						有效期
					</td>
					<td>
						${p.btime }"
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						图片
					</td>
					<td>
					
						${imgs.lsrc }
						
					</td>
				</tr>
				<tr bgcolor="white">
					<td colspan="2">
						<a href="business?method=toupdprod&pid=${p.pid }">商品修改</a>
					</td>
					
				</tr>
			</table>
		</form>
	</body>
	<script>
		
		function check(){
			document.frm.submit();
		}
	
	</script>
	
	
</html>
