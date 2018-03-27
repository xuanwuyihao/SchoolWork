<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String path = request.getContextPath();
%>
<base href="<%=path%>/">	
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>金字塔 - 找回密码-确认新密码 - 安全可靠专注于供应链金融的国资背景P2P理财平台</title>
<!-- 引入页面小图标 -->
<link rel="icon" href="img/Logo.png" type="image/x-icon">
<link rel="stylesheet" href="layui-v2.2.45/layui/css/layui.css" media="all">
<script src="layui-v2.2.45/layui/layui.js" charset="utf-8"></script>
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- 去除a标签的下划线 -->
<style type="text/css">
a:link {
text-decoration: none;
}
a:visited {
text-decoration: none;
}
a:hover {
text-decoration: none;
}
a:active {
text-decoration: none;
}
</style>
</head>
<body >
	<div style="">
		<div style="margin-left: 80px;margin-top: 20px;">
			<img src="img/Logo2.png">
		</div>
		<div style="margin-top: -55px;margin-left: 1140px;">
			<button id="home" class="layui-btn  layui-btn-primary">
			<i class="layui-icon" style="font-size: 20px; color: #d9d9d9;">&#xe68e;</i>  
			金字塔首页
			</button>			
		</div>		
	</div>
	<div style="height: 400px;background: #d9d9d9;margin-top: 40px;">
		<br/>
		<div style="background-color: white;width: 80%; margin: 0px auto;height: 360px;">
			<br/>
			<div style="margin-left:450px;margin-top: 20px;">
				<span style="font-size: 18px;">手 机 找 回 登 录 密 码</span>
				<input type="hidden" id="phone" value="${phone}">
			</div>
			<div style="width: 100%;margin-top:40px;margin-left: 350px;">
				<div style="float: left;margin-top: 11px;margin-left: 25px;">
				<span>新密码：</span>
				</div>
				<div style="float: left;margin-left: 0px;width:25%;">
				<input id="newPwd" type="password" class="layui-input" maxlength="16" style="width: 100%" placeholder="请输入新密码">
				</div>
			</div>
			<br/>
			<div style="margin-top: 60px;width: 100%;margin-left: 350px;">
				<div style="float: left;margin-top: 11px;">
				<span>确认新密码：</span>
				</div>
				<div style="float: left;margin-left: 0px;width:25%;">
				<input id="newPwd1" type="password" class="layui-input" maxlength="16" style="width: 100%" placeholder="请确认密码">
				</div>
			</div>
			<br/>
			<div style="margin-top: 60px;margin-left: 450px;">
				<button id="last" class="layui-btn  layui-btn-primary"style="width: 40%;">
					提交
				</button>
			</div>
		</div>	
	</div>
	<div style="width: 100%">
		<dir style="margin-left: 370px;margin-top: 60px;">
			<span>版权所有 © 金字塔运营（赣州）有限公司 All rights reserved 备案确认书：赣ICP备16004010号</span>
		</dir>
	</div>
</body>

<script type="text/javascript">
	//支持Enter键登录
	document.onkeydown = function(e){
		if(!e) e = window.event;
		if((e.keyCode || e.which) == 11){
			var obtnLogin=document.getElementById("last")
			obtnLogin.focus();
		}
	}
	$("#last").click(function(){
		var newPwd = $("#newPwd").val();
		var newPwd1 = $("#newPwd1").val();
		var phone = $("#phone").val();
		if(newPwd==""){
			layui.use('layer', function(){
				var layer = layui.layer;
				layer.msg('密码不能为空');
			});
			return;
		}
		
		if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(newPwd)){ 
			layui.use('layer', function(){
				var layer = layui.layer;
				layer.msg('密码不能有特殊字符');
			});
			return;
		}
		
		if(/^\d+\d+\d$/.test(newPwd)){
			layui.use('layer', function(){
				var layer = layui.layer;
				layer.msg('密码由数字、字母或符号组成');
			});
			return;
		}
		if(!/^[\S]{8,16}$/.test(newPwd)){
			layui.use('layer', function(){
				var layer = layui.layer;
				layer.msg('密码必须8到16位，区分大小写，且不能出现空格');
			});
			return;
		}
		if(newPwd!=newPwd1){
			layui.use('layer', function(){
				var layer = layui.layer;
				layer.msg('新密码与确认密码不一致');
			});
			return;
		}
		$.post("user/backPwd",{phone:phone,newPwd:newPwd},function(result){
			if(result="success"){
				layui.use('layer', function(){
					layer.msg('密码找回成功', {
						 btn: ['登录'],
						 offset: ['210px','500px'],
						 btnAlign: 'c',
						 time : 0,
						 yes: function(index, layero){
							 	layer.close(index);
							 	top.location.href="user/openLogin";
							  }
					});
					return;
				});
				
			}
		});
	});
</script>
<script type="text/javascript">
$("#home").click(function(){
	location.href="front/index"
});
</script>
</html>