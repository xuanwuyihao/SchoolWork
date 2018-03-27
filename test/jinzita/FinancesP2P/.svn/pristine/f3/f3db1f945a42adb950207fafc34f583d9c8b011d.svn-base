<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="<%=path%>/">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">		
	<title> 金字塔 - 登录 - 安全可靠专注于供应链金融的国资背景P2P理财平台 </title>
	<!-- 引入页面小图标 -->
	<link rel="icon" href="img/Logo.png" type="image/x-icon">

	<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/bootstrap.js"></script>
		<link rel="stylesheet" type="text/css" href="css/normalize.css" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/style.css" type="text/css" />
		<link rel="stylesheet" type="text/css" href="css/zzsc.css" />
		<link rel="stylesheet" type="text/css" href="assets/less/unlock.css">
		<script type="text/javascript" src="js/zzsc.js"></script>
		<!--提示框样式-->
		<link type="text/css" rel="stylesheet" href="css/iosOverlay.css">

		<!--
	作者：383942470@qq.com
	时间：2017-11-08
	描述：图标
-->
		<link href="css/icons.css" rel="stylesheet" type="text/css" />


		<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />


		<link href="css/responsive.css" rel="stylesheet" type="text/css" />

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

<body style="background-color: #ebebeb;">
	<header class="header-navigation" id="header">

		<nav>
			<div class="div-left">
				<a class="link" href="front/index" title="金字塔 - 综合金融服务平台">
					<img src="img/Logo2.png" style="margin-left: 10px;"/>
				</a>
			</div>
			<div class="div-right">
				<ul>
					<li style="font-size: 18px;list-style-type: none;float: right;text-align: center;margin-right: 70px;color: #9D9D9D;"> 
						<font style="font-family: 微软雅黑">还没有账号?<a href="user/openRegister" style="text-decoration: none;color: #e68513;">立即注册</a></font>
			 		</li>
				</ul>
			</div>

		</nav>

	</header>


			<!-- Responsive Header -->



			<div class="logo-div">
			<div style="height: 30px;"></div>
				<div class="denglu-top">
					<div style="float: left;"><span style="font-size: 20px;color: #9e9e9e;">欢迎登录</span></div>
				</div>
				<div>
					<div style="float: left;width: 50%;">
						<img src="img/未标题-1.png" class="denglu-img"/>
					</div>
					<div style="float: right;width: 50%;">
						
						<div style="margin-top: 100px;margin-left: 150px;">
							<div>
								<span style="font-size: 16px;">账号&nbsp;&nbsp;&nbsp;</span>
								<input type="text" id="phone" style="padding-left: 10px" class="inp-zhanghao"/>
								<input type="hidden" id="bid" value="${bid }"/>
							</div>
							<div style="margin-top: 20px;">
								<span style="font-size: 16px;">密码&nbsp;&nbsp;&nbsp;</span>
								<input type="password" style="padding-left: 10px" id="password" class="pass-mima"/>
							</div>
							<div>
								<div style="float: left;margin-top: 35px;">
									<span style="font-size: 16px;">验证&nbsp;&nbsp;&nbsp;</span>
								</div>
								<div class="wrapper" style="float: right;">
									<div class="bar3 bar"></div>
								</div>
							</div>
						</div>
						
					</div>
					<div class="denglu-btn">
						<input type="button" id="login" value="马上登录" class="denglu-btn1"/>
					</div>
					<div style="margin-top: 10px;">
						<a href="front/openBackPwd" class="denglu-wangji">忘记密码?</a>
					</div>
				</div>
			</div>
			<div style="text-align: center;">
				<hr />
				<p>2010-2017 版权所有 ? 金字塔 赣ICP备12043601号-1 地址：江西省赣州市章贡区沙石镇赣州技师学院 </p>
				<p>赣州金字塔互联网科技服务有限公司</p>
			</div>

		
		<script src='assets/js/unlock.js'></script>
		<script type="text/javascript">
			
			$('.bar3').slideToUnlock({
				text : '滑动以解锁',
				succText : '解锁成功'
			});			
		</script>
		<!-- 提示框 -->
		<script type="text/javascript" src="js/iosOverlay.js"></script>
		<script type="text/javascript" src="js/spin.min.js"></script>
		<script type="text/javascript">
		
			$("#login").click(function(){
				var phone = $("#phone").val();
				var password = $("#password").val();
				var bid = $("#bid").val();
				var text = $('.bar3').text();
				
				if(!(/^1(3|4|5|7|8)\d{9}$/.test(phone))){ 
			        
					iosOverlay({
						  text: "手机号码有误，请重填",
						  duration: 2e3,		
					  });
					return;
			    } 
				
				if(text!='解锁成功'){
					iosOverlay({
						  text: "请拖动验证码到正确的位置",
						  duration: 2e3,		
					  });
					return;
				}
				
				
		
				
				 $.post("user/userLogin",{phone:phone,password:password,bid:bid},function(result){
					
					 if(result=='userError'){
							iosOverlay({
								text: "该用户不存在",
								duration: 2e3,
								
							});
							$("#nameLoginForm").resetForm();
						}
						else if(result=='passwordError'){
							iosOverlay({
								text: "密码错误，请确认密码!",
								duration: 2e3,
							});
							
						}
						else if(result=='success'){
							
							location.href="front/user/PersonalCenter";
							
						}else{
							
							location.href="front/biaodixinxi/"+result;//投标进入
							
						}
				}); 
				
			});
		
		</script>
		<!-- bootstrap js -->
		<script type="text/javascript" src="js/jquery2.1.4.js"></script>
		<script type="text/javascript" src="js/script.js"></script>
	</body>


</html>
