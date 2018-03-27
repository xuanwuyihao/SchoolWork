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

		<title>My JSP 'add.jsp' starting page</title>

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
		<h3 align="center">
			图书信息修改
		</h3>
		<hr />
		<form action="Bookservlet?method=upd" method="post">
		<input type="hidden" name="bid" value="${b.bid }">
		<table width="70%" align="center">
			<tr>
				<td>
					图书名称
				</td>
				<td>
					<input type="text" name="bname" value="${b.bname }">
				</td>
			</tr>
			<tr>
				<td>
					图书价格
				</td>
				<td>
					<input type="text" name="bprice" value="${b.bprice }">
				</td>
			</tr>
			<tr>
				<td>
					图书作者
				</td>
				<td>
					<input type="text" name="bauthor" value="${b.bauthor }">
				</td>
			</tr>
			<tr>
				<td>
					图书出版社
				</td>
				<td>
					<input type="text" name="bpress" value="${b.bpress }">
				</td>
			</tr>
			<tr>
				<td>
					图书状态
				</td>
				
				<td>
					<input type="radio" name="bstate" value="0" ${b.bstate==0?'checked':'' }/>
					出售中
					<input type="radio" name="bstate" value="1" ${b.bstate==1?'checked':'' }/>
					售罄
					<input type="radio" name="bstate" value="3" ${b.bstate==3?'checked':'' }/>
					预售中
				</td>
			</tr>
			<tr>
				<td>
					封面图片
				</td>
				
				<td>
					<img src="img/1.jpg" width="70" height="100" />
					<input type="radio" value="1.jpg" name="bimg" ${b.bimg=='1.jpg'?'checked':'' } />
					图片一
					<img src="img/2.jpg" width="70" height="100" />
					<input type="radio" value="2.jpg" name="bimg" ${b.bimg=='2.jpg'?'checked':'' } />
					图片二
					<img src="img/3.jpg" width="70" height="100" />
					<input type="radio" value="3.jpg" name="bimg" ${b.bimg=='3.jpg'?'checked':'' } />
					图片三
					<img src="img/4.jpg" width="70" height="100" />
					<input type="radio" value="4.jpg" name="bimg" ${b.bimg=='4.jpg'?'checked':'' } />
					图片三
					<img src="img/5.jpg" width="70" height="100" />
					<input type="radio" value="5.jpg" name="bimg" ${b.bimg=='5.jpg'?'checked':'' } />
					图片三
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="修改" />
					<input type="button" onclick="history.go(-1)" value="返回列表" />
				</td>
			</tr>
		</table>
		</form>
	</body>
</html>
