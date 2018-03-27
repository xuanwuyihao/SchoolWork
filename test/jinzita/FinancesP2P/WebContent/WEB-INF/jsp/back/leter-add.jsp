<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="utf-8">
<title>金字塔 - 综合金融服务后台管理 - 站内信 - 添加</title>
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

		<style type="text/css">
			a:focus{text-decoration: none}
			a:focus{outline:none;}
		</style>
</head>

<body>
	<div class="x-body">
		<form class="layui-form" id="form1" name="form1">
			<div class="layui-form-item">
				<label for="L_email" class="layui-form-label"> <span
					class="x-red">*</span>发件人
				</label>
				<div class="layui-input-inline">
					<input type="text" value="admin" name="sendpeople"
						style="width: 300px; cursor: default" id="sendpeople"
						lay-verify="required" disabled="disabled" autocomplete="off"
						class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux">
					<span class="x-red"></span>
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_email" class="layui-form-label"> <span
					class="x-red">*</span>收件人
				</label>
				<div class="layui-input-inline">
					<input type="text" name="receivepeople" style="width: 300px"
						id="receivepeople" lay-verify="required" autocomplete="off"
						class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux">
					<span class="x-red"></span>
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_email" class="layui-form-label"> <span
					class="x-red">*</span>标题
				</label>
				<div class="layui-input-inline">
					<input type="text" name="title" style="width: 300px" id="title"
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux">
					<span class="x-red"></span>
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label"> <span
					class="x-red">*</span>内容
				</label>
				<div class="layui-input-inline">
					<textarea name="content" autocomplete="off" id="content"
						lay-verify="required" class="layui-textarea"
						style="height: 80px; width: 300px"></textarea>
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label"> </label>
				<button class="layui-btn" lay-filter="add" lay-submit="">
					增加</button>
				<!-- <button type="submit"  class="layui-btn" lay-filter="add"> 增加 </button> -->
			</div>
		</form>
	</div>
	<script src="./lib/layui/layui.js" charset="utf-8">
		
	</script>
	<script src="./js/x-layui.js" charset="utf-8">
		
	</script>

	<script type="text/javascript" src="./js/jquery.min.js"></script>
	<script type="text/javascript" src="./js/jquery.form.js"></script>


	<script>
		layui.use([ 'form', 'layer', 'upload' ], function() {
			$ = layui.jquery;
			var form = layui.form(), layer = layui.layer;

			//监听提交
			form.on('submit(add)', function() {
				var title = $("#title").val();
				var sendpeople = $("#sendpeople").val();
				var receivepeople = $("#receivepeople").val();
				var content = $("#content").val();
				$.ajax({
					type : "POST",
					url : "letter/add",
					data : {
						"title" : title,
						"sendpeople" : sendpeople,
						"receivepeople" : receivepeople,
						"content" : content
					},success:function(data) {
						if (data == "success") {
							layer.msg('添加成功!', {
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

</body>

</html>