<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String path = request.getContextPath();
%>
<base href="<%=path%>/">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>金字塔 - 注册 - 安全可靠专注于供应链金融的P2P理财平台</title>
<!-- 引入页面小图标 -->
<link rel="icon" href="img/Logo.png" type="image/x-icon">
<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap.js"></script>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/zzsc.css" />
<link rel="stylesheet" type="text/css" href="css/style1.css" />
<link href="css/drag.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="js/zzsc.js"></script>
<!--提示框样式-->
<link type="text/css" rel="stylesheet" href="css/iosOverlay.css">
<style type="text/css">
    .btn_tab_login{float: right; margin-top: 48px;}
    .btn_tab_login li{display: inline-block; margin-left:30px; font-size: 14px;}
    .btn_tab_login li.cur a{color:#d00;}
</style>
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<script src="js/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="js/drag.js" type="text/javascript"></script>

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
input.zhuce-yanzhengma{
				width: 135px;
				height: 35px;
				font-size: 18px;
				border:  1px solid #e4e4e4;
			}
			.yanzheng-button{
				width: 100px;
				height: 35px;
				border-radius: 4px;
				background: white;
				border:   1px solid #e4e4e4;
			}
			.yanzheng-button:focus{outline:none;}
</style>
	
</head>
<body style="background-color: #ebebeb;">






	<header class="header-navigation" id="header">

		<nav>
			<div class="div-left">
				<a class="link" href="front/index" title="金字塔 - 综合金融服务平台">
					<img src="img/Logo001.png" style="margin-left: 10px;"/>
				</a>
			</div>
			<div class="div-right">
				<ul>
					<li style="font-size: 18px;list-style-type: none;float: right;text-align: center;margin-right: 70px;color: #9D9D9D;"> 
						<font style="font-family: 微软雅黑">已有账号?<a href="user/openLogin" style="text-decoration: none;color: #e68513;">立即登录</a></font>
			 		</li>
				</ul>
			</div>

		</nav>

	</header>

<form action="user/userRegister" method="post">		
	<div class="zhuce">
		<div style="height: 30px;"></div>
		<div class="zhuce-top">
			<div style="float: left;"><span style="font-size: 20px;color: #9e9e9e;">欢迎注册</span></div>
<!-- 			<div style="float: right;"><span style="color: #9e9e9e;">我已注册,<a style="color: #67B168;" href="user/openLogin">现在登录</a></span></div> -->
		</div>
		<div class="zhuce-center">
		<div>
			<span style="font-size: 16px;">手机号码&nbsp;&nbsp;&nbsp;</span>
			<input type="text" class="phone" name="phone" style="padding-left: 10px" maxlength="11" id="phones"/>
			<span class="error1"></span>
		</div><br />
		<div>
			<div style="margin-left: 15px;">
					<span style="font-size: 16px;">验证码&nbsp;&nbsp;&nbsp;</span>
					<input type="text" id="code" style="padding-left: 10px" class="zhuce-yanzhengma"  maxlength="6"/>
					<!--<button class="yanzheng-button" id="sendButton" onclick="timer(30)">获取验证码</button>-->
					<input type="button" class="yanzheng-button" id="sendButton" value="获取验证码" onclick="timer(60)" />
					
				</div><br />
		</div>
		<div>
				<span style="font-size: 16px;">登录密码&nbsp;&nbsp;&nbsp;</span>
				<input type="password" name="password" style="padding-left: 10px" class="password" maxlength="16" id="passwords"/ >
				<span class="error2"></span>
		</div>
			
			<div class="tuijian-shouji">
				<span id="tuijian" style="cursor: pointer;">推荐人手机号码（选填）</span>
				<div id="phones1" class="tuijian-shouji1">
				<span style="font-size: 15px;">推荐人手机号码&nbsp;&nbsp;&nbsp;</span>
				<input type="text" name="referrerno" value="${referrerno}" style="padding-left: 10px" class="phone1"  maxlength="11" id="phones2"/>
				<input type="hidden" id="message" value="${message}">
				<span class="error3"></span>
				</div>
			</div>
			<div class="fuwu-tiaokuan">
				<input type="checkbox" checked="checked"/>
				<span>我已阅读并同意</span>
				<span style="color: #67B168;"><a href="front/pingtaixieyi"  target="view_window" style="color: #00d07d;">《金字塔服务协议》</a></span>
			</div>
			<div class="zhuce-btn">
				<input type="submit" id="submit_btn" value="马上注册" class="zhuce-btn1"/>
			</div>
		</div>
		<div class="zhuce-center1">
		<img src="cooperation/zhuce1.png" />
	</div>
		<div style="height: 100px;"></div>
	</div>
</form>	
				
	<div style="text-align: center;">
		<hr />
		<p>2010-2017 版权所有 © 金字塔 赣ICP备12043601号-1 地址：江西省赣州市章贡区沙石镇赣州技师学院 </p>
		<p>赣州金字塔互联网科技服务有限公司</p>
	</div>
	<script>
			var yzm = "981213";
			function timer(time) {
				var phone = $(".phone").val();
				
				if( $(".phone").val()=="")
    			{ 
    				phones.style.border="1px solid red";
    				$(".phone").parent().addClass("errorC");
    				$(".error1").html("请输入手机号");
    				$('.phone').focus();
    			}
    			 if($(".phone").val().length<11)
    	        {   
    	        	phones.style.border="1px solid red";
    	            $(".error1").html("手机号长度有误！");
    	            $('.phone').focus();
    	        }
    	         if(!reg.test($(".phone").val()))
    	        {   
    	        	phones.style.border="1px solid red";
    	        	$(".phone").parent().addClass("errorC");
    	            $(".error1").html("请输入正确的手机号！");
    	            $('.phone').focus();
    	        }
				
			    /* $.post("finance/bankcard/proving",{phone: phone},function(result){
			    	var data= eval('('+result+')');
					//alert(data.code);
					yzm=data.code; */
			    	var btn = $("#sendButton");
				    btn.attr("disabled", true);  //按钮禁止点击
				    btn.val(time <= 0 ? "发送动态密码" : ("" + (time) + "秒后可发送"));
				    var hander = setInterval(function() {
				        if (time <= 0) {
				            clearInterval(hander); //清除倒计时
				            btn.val("发送动态密码");
				            btn.attr("disabled", false);
				            return false;
				        }else {
				            btn.val("" + (time--) + "秒后可发送");
				        }
				    }, 1000);
			   /*  }); */
			}
 
		</script>
<!-- 	<script type="text/javascript" src="js/zhuce.js"></script> -->
	<!-- bootstrap js -->
	<script type="text/javascript" src="js/jquery2.1.4.js"></script>
	<script type="text/javascript" src="js/script.js"></script>
	<script type="text/javascript">
		//支持Enter键登录
		document.onkeydown = function(e){
			if(!e) e = window.event;
			if((e.keyCode || e.which) == 11){
				var obtnLogin=document.getElementById("submit_btn")
				obtnLogin.focus();
			}
		}

    	$(function(){
    		$(".phone").blur(function(){
    			reg=/^1[3|4|5|7|8][0-9]\d{4,8}$/i;//验证手机正则(输入前7位至11位)
    			var aa=document.getElementById("phones");
    			if( $(".phone").val()=="")
    			{ 
    				phones.style.border="1px solid red";
    				$(".phone").parent().addClass("errorC");
    				$(".error1").html("请输入手机号");
    				$('.phone').focus();
    			}
    			else if($(".phone").val().length<11)
    	        {   
    	        	phones.style.border="1px solid red";
    	            $(".error1").html("手机号长度有误！");
    	            $('.phone').focus();
    	        }
    	        else if(!reg.test($(".phone").val()))
    	        {   
    	        	phones.style.border="1px solid red";
    	        	$(".phone").parent().addClass("errorC");
    	            $(".error1").html("请输入正确的手机号！");
    	            $('.phone').focus();
    	        }else{
    	        	aa.style.border="1px solid #67B168";
    	        	$(".phone").parent().addClass("errorC");
    	            $(".error1").html("");
    	        }
    	        
    		});
    		$(".phone1").blur(function(){
    			reg=/^1[3|4|5|7|8][0-9]\d{4,8}$/i;//验证手机正则(输入前7位至11位)
    			var aa=document.getElementById("phones2");
    			if( $(".phone1").val()=="")
    			{ 
    				phones2.style.border="1px solid red";
    				$(".phone1").parent().addClass("errorC");
    				$(".error3").html("请输入手机号");
    			}
    			else if($(".phone1").val().length<11)
    	        {   
    	        	phones2.style.border="1px solid red";
    	            $(".error3").html("手机号长度有误！");
    	        }
    	        else if(!reg.test($(".phone1").val()))
    	        {   
    	        	phones2.style.border="1px solid red";
    	        	$(".phone1").parent().addClass("errorC");
    	            $(".error3").html("请输入正确的手机号！");
    	        }else{
    	        	aa.style.border="1px solid #67B168";
    	        	$(".phone1").parent().addClass("errorC");
    	            $(".error3").html("");
    	        }
    	        
    		});
    		$(".password").blur(function(){
    			reg1=/^.*[\d]+.*$/;
    			reg2=/^.*[A-Za-z]+.*$/;
    			reg3=/^.*[_@#%&^+-/*\/\\]+.*$/;//验证密码
    			var Pval = $(".password").val();
    			var aa=document.getElementById("passwords");
    			if( Pval =="")
    			{
    				passwords.style.border="1px solid red";
    				$(".password").parent().addClass("errorC");
    				$(".error2").html("请填写密码");
    				$('.password').focus();
    			}
    	        else if(Pval.length>16 || Pval.length<8)
    	        {   
    	        	passwords.style.border="1px solid red";
    	        	$(".password").parent().addClass("errorC");
    	            $(".error2").html("密码应为8-16个字符，区分大小写");
    	            $('.password').focus();
    	        }
    	        else if(!((reg1.test(Pval) && reg2.test(Pval)) || (reg1.test(Pval) && reg3.test(Pval)) || (reg2.test(Pval) && reg3.test(Pval)) ))
    	        {
    	        	passwords.style.border="1px solid red";
    	        	$(".password").parent().addClass("errorC");
    	            $(".error2").html("密码由数字、字母或符号组成");
    	            $('.password').focus();
    	        }
    	        else{
    	        	passwords.style.border="1px solid #67B168";
    	        	$(".password").parent().addClass("errorC");
    	            $(".error2").html("");
    	        }
    		});
    		
    		$(document).ready(function(){
    			var aa=document.getElementById("tuijian");
    			var bb=document.getElementById("phones1");
    		  	$(aa).click(function(cc){
    			  	$(bb).toggle(500);
    		  	});
    		});
			//提交表单
			$('.zhuce-btn1').click(function(){
				reg=/^1[3|4|5|7|8][0-9]\d{4,8}$/i;//验证手机正则(输入前7位至11位)
    			var aa=document.getElementById("phones");
    			if( $(".phone").val()=="")
    			{ 
    				phones.style.border="1px solid red";
    				$(".phone").parent().addClass("errorC");
    				$(".error1").html("请输入手机号");
    				$('.phone').focus();
    				return false;
    			}
    			else if($(".phone").val().length<11)
    	        {   
    	        	phones.style.border="1px solid red";
    	            $(".error1").html("手机号长度有误！");
    	            $('.phone').focus();
    	            return false;
    	        }
    	        else if(!reg.test($(".phone").val()))
    	        {   
    	        	phones.style.border="1px solid red";
    	        	$(".phone").parent().addClass("errorC");
    	            $(".error1").html("逗我呢吧，你确定这是你的手机号!!");
    	            $('.phone').focus();
    	            return false;
    	        }else{
    	        	aa.style.border="1px solid #67B168";
    	        	$(".phone").parent().addClass("errorC");
    	            $(".error1").html("");
    	        }
    			
    			/* if(yzm==''){
    				iosOverlay({
    					  text: "请先获取验证码",
    					  duration: 2e3,		
    				  });
    	            return false;
    			} */
    			
    			if(yzm!=$("#code").val()){
    				iosOverlay({
  					  text: "验证码不正确",
  					  duration: 2e3,		
  				  });
    				$("#code").css("border","1px solid red")
    				$("#code").focus();
    	            return false;
    			}
    			
    			reg1=/^.*[\d]+.*$/;
    			reg2=/^.*[A-Za-z]+.*$/;
    			reg3=/^.*[_@#%&^+-/*\/\\]+.*$/;//验证密码
    			var Pval = $(".password").val();
    			var bb=document.getElementById("passwords");
    			if( Pval =="")
    			{
    				passwords.style.border="1px solid red";
    				$(".password").parent().addClass("errorC");
    				$(".error2").html("请填写密码");
    				$('.password').focus();
    				return false;
    			}
    	        else if(Pval.length>16 || Pval.length<8)
    	        {   
    	        	passwords.style.border="1px solid red";
    	        	$(".password").parent().addClass("errorC");
    	            $(".error2").html("密码应为8-16个字符，区分大小写");
    	            $('.password').focus();
    	            return false;
    	        }
    	        else if(!((reg1.test(Pval) && reg2.test(Pval)) || (reg1.test(Pval) && reg3.test(Pval)) || (reg2.test(Pval) && reg3.test(Pval)) ))
    	        {
    	        	passwords.style.border="1px solid red";
    	        	$(".password").parent().addClass("errorC");
    	            $(".error2").html("密码由数字、字母或符号组成");
    	            $('.password').focus();
    	            return false;
    	        }
    	        else{
    	        	passwords.style.border="1px solid #67B168";
    	        	$(".password").parent().addClass("errorC");
    	            $(".error2").html("");
    	        }
			});
		});
    </script>
    <!-- 提示框 -->
	<script type="text/javascript" src="js/iosOverlay.js"></script>
	<script type="text/javascript" src="js/spin.min.js"></script>
    <script type="text/javascript">
    	var message = $("#message").val();
    	
    	if(message=='error'){
    		iosOverlay({
				  text: "手机号已经注册",
				  duration: 2e3,		
			  });
    	}
    </script>
</body>
</html>