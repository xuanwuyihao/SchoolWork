<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="utf-8">
<title></title>
<base href="<%=path%>/">
<meta name="renderer" content="webkit">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" href="./css/x-admin.css" media="all">

</head>

<body>
	<div class="x-body">
		<form class="layui-form" id="form1" name="form1">
			<div class="layui-form-item">
				<label for="L_email" class="layui-form-label">用户账号
				</label>
				<div class="layui-input-inline">
					<input type="hidden" id="id" value="${lendApplyInfo.id}">
					<input type="text" value="${lendApplyInfo.username}" name="username"
						style="width: 300px; cursor: default" id="username"
						lay-verify="required" disabled="disabled" autocomplete="off"
						class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux">
					<span class="x-red"></span>
				</div>
			</div>
			
			<div class="layui-form-item">
				<label for="L_email" class="layui-form-label">借款金额
				</label>
				<div class="layui-input-inline">
					<input type="text" name="lendmoney" style="width: 300px"
						id="lendmoney" value="${lendApplyInfo.lendmoney}" lay-verify="required" autocomplete="off"
						class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux">
					<span class="x-red"></span>
				</div>
			</div>
			

			
			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label"> </label>
				<button class="layui-btn" lay-filter="add" lay-submit="">
					保存</button>
			</div>
			
		</form>
	</div>
	
	
	<script src="./lib/layui/layui.js" charset="utf-8"></script>
	<script src="./js/x-layui.js" charset="utf-8"></script>

	<script type="text/javascript" src="./js/jquery.min.js"></script>
	<script type="text/javascript" src="./js/jquery.form.js"></script>


	<script>
		layui.use([ 'form', 'layer', 'upload' ], function() {
			$ = layui.jquery;
			var form = layui.form(), layer = layui.layer;

			//监听提交
			form.on('submit(add)', function() {
				var username = $("#username").val();
				var lendmoney = $("#lendmoney").val();
				var id = $("#id").val();
				$.ajax({
					type : "POST",
					url : "lendApplyInfo/update",
					data : {
						"id" : id,
						"username" : username,
						"lendmoney" : lendmoney
					
					},success:function(data) {
						if (data == "success") {
							layer.msg('修改成功!', {
								icon : 1,
								time : 1000
							});
							setTimeout(function() {
								// 获得frame索引
								var index = parent.layer
										.getFrameIndex(window.name);
								//关闭当前frame
								parent.layer.close(index);
								window.parent.location.reload(); //刷新父页面

							}, 500);//延迟1000毫米
						}
					}
				});
				return false;
			});
			 
		});
	</script>
	
	<script type="text/javascript">
		var text = $("#content1").val();
		$("#content").text(text);
	</script>

</body>

</html>