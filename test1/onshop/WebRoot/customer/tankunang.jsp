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

		<title>My JSP 'ceshi.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link href="<%=path%>/css/bootstrap.min1.css" rel="stylesheet">
		<link href="<%=path%>/css/bootstrap-theme.min1.css" rel="stylesheet">
		<link href="<%=path%>/css/main1.css" rel="stylesheet">
		<script src="<%=path%>/js/jquery.min1.js"></script>
		<script src="<%=path%>/js/bootstrap.min1.js"></script>

	</head>

	<body>

		<!-- Button trigger modal -->
		<input type="button" class="btn btn-primary" data-toggle="modal"
			data-target="#myModal1" value="提交订单" />

		<!-- Modal -->
		<!-- 弹出框 -->
		<div class="modal fade" id="myModal1">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span>&times;</span>
							<tton>
							<h4 class="modal-title" id="myModalLabel">
								标题
							</h4>
					</div>
					<div class="modal-body">
						账号：
						<input type="text" />
						<br />
						密码：
						<input type="password" />
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">
							取消
							<tton>
							<button type="button" class="btn btn-primary"
								onclick="window.location='#'">
								确定支付
								<tton>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
