<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
	<s:form action="update">
	
		<tr>
			<td>轮播图片一</td>
			<td><img src="${home_content_Service.getpicture_one}"></td>
			<td><input type="submit" value="修改"></td>
		</tr>
		<tr>
			<td>轮播图片二</td>
			<td><img src="${home_content_Service.getpicture_two}"/></td>
			<td><a>修改</a></td>
		</tr>
		<tr>
			<td>轮播图片三</td>
			<td><img src="${home_content_Service.getpicture_three}"></td>
			<td><a>修改</a><a>删除</a></td>
		</tr>
		<tr>
			<td>二维码一</td>
			<td><img src="${home_content_Service.getqrcode_one}"></td>
			<td><a>修改</a><a>删除</a></td>
		</tr>
		<tr>
			<td>二维码二</td>
			<td><img src="${home_content_Service.getqrcode_two}"></td>
			<td><a>修改</a><a>删除</a></td>
		</tr>
		<tr>
			<td>联系电话</td>
			<td><input type="text" value="${home_content_Service.gethc_phone}"></td>
			<td><a>修改</a><a>删除</a></td>
		</tr>
		<tr>
			<td>地址</td>
			<td><input type="text" value="${home_content_Service.gethc_address}"></td>
			<td><a>修改</a><a>删除</a></td>
		</tr>
		<tr>
			<td>链接一</td>
			<td><input type="text" value="${home_content_Service.getinterlinkage_one}"></td>
			<td><a>修改</a><a>删除</a></td>
		</tr>
		<tr>
			<td>链接二</td>
			<td><input type="text" value="${home_content_Service.getinterlinkage_two}"></td>
			<td><a>修改</a><a>删除</a></td>
		</tr>
		<tr>
			<td>链接三</td>
			<td><input type="text" value="${home_content_Service.getinterlinkage_three}"></td>
			<td><a>修改</a><a>删除</a></td>
		</tr>
		<tr>
			<td>链接四</td>
			<td><input type="text" value="${home_content_Service.getinterlinkage_four}"></td>
			<td><a>修改</a><a>删除</a></td>
		</tr>
		</s:form>

	</table>

</body>
</html>