<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="utf-8">
<title>金字塔 - 综合金融服务后台管理 - 银行卡管理 - 修改</title>
<base href="<%=path%>/">
<meta name="renderer" content="webkit">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
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
		
			<div class="layui-form-item">
				<label for="L_email" class="layui-form-label" style="width: 98px"> <span
					class="x-red"></span>用户注册手机号
				</label>
				<div class="layui-input-inline">
					
					<input type="text" value="${userBankcard.oyh1}" name="sendpeople"
						style="width: 300px; cursor: default" id="sendpeople"
						lay-verify="required" disabled="disabled" autocomplete="off"
						class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux">
					<span class="x-red"></span>
				</div>
			</div>
			<div class="layui-form-item" >
				<label for="L_email" class="layui-form-label" style="width: 98px"> <span
					class="x-red"></span>真实姓名
				</label>
				<div class="layui-input-inline">
					<input type="text" name="receivepeople" style="width: 300px; cursor: default"
						id="receivepeople" disabled="disabled" value="${userBankcard.oyh2}" lay-verify="required" autocomplete="off"
						class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux">
					<span class="x-red"></span>
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_email" class="layui-form-label" style="width: 98px"> <span
					class="x-red"></span>身份证号
				</label>
				<div class="layui-input-inline">
					<input type="text" name="title" value="${userBankcard.oyh3}" style="width: 300px; cursor: default" id="title"
						lay-verify="required" disabled="disabled" autocomplete="off" class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux">
					<span class="x-red"></span>
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label" style="width: 98px"> <span
					class="x-red"></span>开户银行
				</label>
				<div class="layui-input-inline">
					<input type="text" name="title" value="${userBankcard.placebank}" style="width: 300px; cursor: default" id="title"
						lay-verify="required" disabled="disabled" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_email" class="layui-form-label" style="width: 98px"> <span
					class="x-red"></span>银行卡号
				</label>
				<div class="layui-input-inline">
					<input type="text" name="title" value="${userBankcard.bankcard}" style="width: 300px; cursor: default" id="title"
						lay-verify="required" disabled="disabled" autocomplete="off" class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux">
					<span class="x-red"></span>
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_email" class="layui-form-label" style="width: 98px"> <span
					class="x-red"></span>绑定时间
				</label>
				<div class="layui-input-inline">
					<input type="text" name="title" value="<fmt:formatDate value="${userBankcard.bindingtime}" pattern="yyyy-MM-dd HH:mm:ss"/>" style="width: 300px; cursor: default" id="title"
						lay-verify="required" disabled="disabled" autocomplete="off" class="layui-input">
				</div>
				
				<div class="layui-form-mid layui-word-aux">
					<span class="x-red"></span>
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label" style="width: 98px"> </label>
				<button class="layui-btn" lay-filter="add" lay-submit="">
					关闭</button>
				<!-- <button type="submit"  class="layui-btn" lay-filter="add"> 增加 </button> -->
			</div>
		
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
				
				// 获得frame索引
				var index = parent.layer
						.getFrameIndex(window.name);
				//关闭当前frame
				parent.layer.close(index);
			});
			 
		});
	</script>
	<script type="text/javascript">
		var text = $("#content1").val();
		$("#content").text(text);
	</script>

</body>

</html>