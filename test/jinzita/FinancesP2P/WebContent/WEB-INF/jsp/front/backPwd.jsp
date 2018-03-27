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
<title>金字塔 - 找回密码-手机验证 - 安全可靠专注于供应链金融的国资背景P2P理财平台</title>
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
			</div>
			<div style="width: 100%;margin-top:40px;margin-left: 350px;">
				<div style="float: left;margin-top: 11px;margin-left: 25px;">
				<span>手机号：</span>
				</div>
				<div style="float: left;margin-left: 0px;width:25%;">
				<input id="phone" class="layui-input" maxlength="11" style="width: 100%" placeholder="输入注册时使用的手机号">
				</div>
			</div>
			<br/>
			<div style="margin-top: 60px;width: 100%;margin-left: 350px;">
				<div style="float: left;margin-top: 11px;">
				<span>短信验证码：</span>
				</div>
				<div style="float: left;width:25%;">
				<input id="code" class="layui-input" maxlength="6" style="width: 45%" placeholder="输入短信验证码">
				</div>
				<div style="float: left;margin-left: -120px;">
					<button id="sendCode" class="layui-btn layui-btn-radius layui-btn-primary">获取验证码</button>
				</div>
			</div>
			<br/>
			<div style="margin-top: 60px;margin-left: 450px;">
				<button id="last" class="layui-btn  layui-btn-primary"style="width: 40%;">
					下一步
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
			var obtnLogin=document.getElementById("sendCode")
			obtnLogin.focus();
		}
	}
	var yzm = "652982";
	$("#sendCode").click(function(){
		var phone = $("#phone").val();
		reg=/^1[3|4|5|7|8][0-9]\d{4,8}$/i;//验证手机正则(输入前7位至11位)
		if(phone==""){
			layui.use('layer', function(){
				var layer = layui.layer;
				layer.msg('手机号不能为空');
			});
			return;
		}
		if(!reg.test(phone)){
// 		if(!(/^1(3|4|5|7|8)\d{9}$/.test(phone))){ 
			layui.use('layer', function(){
				var layer = layui.layer;
				layer.msg('输入的手机号格式不正确');
			});
			return;
		} 
		/* $.post("finance/bankcard/proving",{phone:phone},function(result){
			var data= eval('('+result+')');
			alert(data.code);
			yzm=data.code; */
			$("#sendCode").attr("disabled", true);
			var i = 60;
			var timename = setInterval(function(){
				$("#sendCode").text(i);
				i=i-1;
				if(i<0){
					window.clearInterval(timename)
					$("#sendCode").attr("disabled", false);
					$("#sendCode").text("获取验证码");
				}
			},1000);
		/* }); */
		
	});
</script>
<script type="text/javascript">
	$("#last").click(function(){
		
		var phone = $("#phone").val();
		var code = $("#code").val();
		if(phone==""){
			layui.use('layer', function(){
				var layer = layui.layer;
				layer.msg('手机号不能为空');
			});
			return;
		}
	
		if(!(/^1[34578]\d{9}$/.test(phone))){ 
			layui.use('layer', function(){
				var layer = layui.layer;
				layer.msg('输入的手机号格式不正确');
			});
			return;
		}
		
		if(code==""){
			layui.use('layer', function(){
				var layer = layui.layer;
				layer.msg('请输入验证码');
			});
			return;
		}
		if(code!=yzm){
			layui.use('layer', function(){
				var layer = layui.layer;
				layer.msg('验证码不正确');
			});
			return;
		}
		
		$.post("user/isExistence",{phone:phone},function(result){
			
			if(result=="error"){
				layui.use('layer', function(){
					var layer = layui.layer;
					layer.msg('该手机号尚未注册');
				});
				return;
			}else{
				location.href="front/openBackPwd2?phone="+phone;
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