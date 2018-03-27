<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>金字塔 - 综合金融服务平台 - 用户个人中心 - 安全设置</title>	
	<base href="<%=path%>/">	
	<!-- 引入页面Logo小图标 -->
	<link rel="icon" href="img/Logo.png" type="image/x-icon">
		<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/bootstrap.js"></script>
		<link rel="stylesheet" type="text/css" href="css/normalize.css" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<!-- <link rel="stylesheet" href="css/style.css" type="text/css" /> -->
		<link rel="stylesheet" type="text/css" href="css/zzsc.css" />
		<script type="text/javascript" src="js/zzsc.js"></script>

		<!--
	作者：383942470@qq.com
	时间：2017-11-08
	描述：图标
-->
		<link href="css/icons.css" rel="stylesheet" type="text/css" />

		<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />

		<link href="css/responsive.css" rel="stylesheet" type="text/css" />
		<link type="text/css" href="css/lrtk.css" rel="stylesheet" />
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/jquery.color-rgba-patch.js"></script>
	<script type="text/javascript" src="js/example.js"></script>
	<link type="text/css" href="css/safety.css" rel="stylesheet" />
	 <!--提示框样式-->
<link type="text/css" rel="stylesheet" href="css/iosOverlay.css">
  <!-- 弹出框样式 -->      
<link rel="Stylesheet" type="text/css" href="css/loginDialog.css" />
	<script type="text/javascript">
	window.onload=function(){
	    var getImg=document.getElementsByTagName("s1");
	    var setimg=document.getElementsByTagName("s2");
	    for(var i=0;i<getImg.length;i++){
	        getImg.item(i).src="error.jpg";
	    }
	}
	</script>

	<style type="text/css">
	a {
		    text-decoration: none;
		    cursor: pointer;
		    color: #333;
		}
		
		a:hover {
		    text-decoration: none;
		    outline: none
		}
		
		
		
		a:focus {
		text-decoration: none;
		    outline: none
		}
		
		a:active {
		text-decoration: none;
		    outline: none
		}
		
		
		
	</style>
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
a{
	cursor: pointer;
}
</style>
</head>
<body style="height: 900px">
<div class="nav-wrap" >
		
		<div class="group" id="example-one" style="margin-top: -10px;">
		<br>
		<a href="#home" target="_blank" class="btn" data-toggle="tab" style="margin-left: 10px;">
		安全中心</a></div>
		<div style="width: auto;margin-left: 580px;margin-top: -30px;">
		<img src="img/aq.gif" height="30px;">
		<font color="#339900" face="微软雅黑" size="2px;" style="margin-top: 5px;">绑定银行卡前需完成实名认证</font>
		</div>
</div>
	
<div id="myTabContents" class="tab-content">
	<div class="tab-pane fade in active" id="home">
	<center>
		<div class="dj">
		<br>
		<div style="margin: -5px 30px;" align="left">
		<ul>
		<li class="pj">
		<img src="img/dj.png" width="15px" height="15px;" style="margin-top: -5px;">
		<font >请完善资料，提高账号安全保障！</font>
		</li>
		<li class="pj" style="float: right;">
		<div>
		<ul style="margin-left: 200px">
		<li class="pj" style="margin-left: -70px;">
		<font>安全级别</font>
		</li>
		<li class="pj">
		<ul>
			<li class="pj"><img src="img/pj.png" width="20px" height="20px" hidden="hidden">
					<img src="img/dj.png" width="20px" height="20px" >
			</li>
			<li class="pj"><img src="img/pj.png" width="20px" height="20px" hidden="hidden">
					<img src="img/dj.png" width="20px" height="20px" >
			</li>
			<li class="pj">
			<c:if test="${empty(user.email)}">
			<img src="img/pj.png" width="23px" height="23px">
			</c:if>
			<c:if test="${!empty(user.email)}">
				<img src="img/dj.png" width="20px" height="20px" >
			</c:if>
			</li>
			<li class="pj">
			<c:if test="${empty(userInfo.realname)}">
			<img src="img/pj.png" width="23px" height="23px">
			</c:if>
			<c:if test="${!empty(userInfo.realname)}">
				<c:if test="${!empty(userInfo.idcard)}">
				<img src="img/dj.png" width="20px" height="20px" >
				</c:if>
				<c:if test="${empty(userInfo.idcard)}">
				<img src="img/pj.png" width="20px" height="20px" >
				</c:if>
			</c:if>
			</li>
			
			<!-- <li class="pj">
			<img src="img/pj.png" width="23px" height="23px">
			</li>
			<li class="pj">
			<img src="img/pj.png" width="23px" height="23px">
			</li> -->
		</ul>
		</li>
		</ul>
		</div>
		</li>
		</ul>
		</div>
		<table width="96%" style="margin-top: 47px">
				<tr class="x1">
					<td height="80px" width="20%">
					<div style="font-weight: 1;">
					<c:if test="${empty(userInfo.realname)}">
					
					<img  src="img/w.png" width="30px" height="30px" style="margin-top: -5px;">
					</c:if>
					<c:if test="${!empty(userInfo.realname)}">
					<c:if test="${!empty(userBankcard)}">
					<img  src="img/g.png" width="30px" height="30px" style="margin-top: -5px;">
					</c:if>
					<c:if test="${empty(userBankcard)}">
					<img  src="img/w.png" width="30px" height="30px" style="margin-top: -5px;">
					</c:if>
					</c:if>
					<font>身份验证</font>
					</div>
					</td>
					<td>
					<div align="left" style="margin-left: 20px;">
					<c:if test="${empty(userInfo.realname)}">
						<c:if test="${empty(userInfo.idcard)}">
						<font size="2" color="red">未认证</font>
						<font size="1" color="#c3c3c3">完成身份认证才能投标和借款，实名认证后身份证不允许修改、更换或注销</font>
						</c:if>
					</c:if>
					<c:if test="${!empty(userInfo.realname)}">
						<c:if test="${!empty(userInfo.idcard)}">
						<font size="1" color="#c3c3c3" face="Consolas" style="cursor:pointer">${userInfo.realname} | ${userInfo.idcard}</font>
						</c:if>
						<c:if test="${empty(userInfo.idcard)}">
						<font size="2" color="red">未认证</font>
						<font size="1" color="#c3c3c3">完成身份认证才能投标和借款，实名认证后身份证不允许修改、更换或注销</font>
						</c:if>
					</c:if>
					</div>
					</td>
					<td width="15%">
					<c:if test="${empty(userInfo.realname)}">
					<a href=""  style="color: black;" target="view_window">
							
							<button  class="yz" id="test" style="width: 86px;height: 32px;">
									立即验证
							</button>
					</a>
					</c:if>
					<c:if test="${!empty(userInfo.realname)}">
						<c:if test="${!empty(userInfo.idcard)}">
								<font style="cursor:default">已验证</font>
						</c:if>
						<c:if test="${empty(userInfo.idcard)}">
								<a href="javascript:;"  style="color: black;" target="view_window">
							
							<button  class="yz" id="test1" style="width: 86px;height: 32px;background-color: #f6b002;">
									立即验证
							</button>
					</a>
						</c:if>
							</c:if>
					</td>
				</tr>
				<!--//////////  -->
				<tr class="x1">
					<td height="80px" width="20%">
					<div style="font-weight: 1;">
					<c:if test="${empty(user.email)}">
					<img  src="img/w.png" width="30px" height="30px" style="margin-top: -5px;">
					</c:if>
					<c:if test="${!empty(user.email)}">
					<img  src="img/g.png" width="30px" height="30px" style="margin-top: -5px;">
					</c:if>
					<font>邮箱验证</font>
					</div>
					</td>
					<td>
					<div align="left" style="margin-left: 20px;">
						<c:if test="${empty(user.email)}">
							<font size="2" color="red">未认证</font>
							<font size="1" color="#c3c3c3">邮箱验证后可以实时跟踪账户资金变动情况</font>
						</c:if>
						<c:if test="${!empty(user.email)}">
							<font size="1" color="#c3c3c3" face="Consolas">${user.email}</font>
						</c:if>
					</div>
					</td>
					<td width="15%">
					<c:if test="${!empty(user.email)}">
							<font style="cursor:default">已绑定</font>
					</c:if>
					<c:if test="${empty(user.email)}">
							<a href="javascript:;" id="banding" style="color: black;">
							<button class="yz" style="width:86px;height: 32px;background-color: #f6b002;">
									立即验证
							</button>
							</a>
					</c:if>
					
					</td>
				</tr>
				<!-- //////// -->
				<tr class="x1">
					<td height="80px" width="20%">
					<div style="font-weight: 1;">
					<img  src="img/g.png" width="30px" height="30px" style="margin-top: -5px;">
					<font>登录密码</font>
					</div>
					</td>
					<td>
					<div align="left" style="margin-left: 20px;">
					<font size="1" color="#c3c3c3" style="cursor:pointer">已设置</font>
					</div>
					</td>
					<td width="15%">
					<a href="javascript:;" id="updatePwd" style="text-decoration: none;font-size: 10px;color: orange">
									修改
					</a>
					</td>
				</tr>
				<!-- ////////// -->
				<tr class="x1">
					<td height="80px" width="20%">
					<div style="font-weight: 1;">
					<img  src="img/g.png" width="30px" height="30px" style="margin-top: -5px;">
					<font>手机</font>
					</div>
					</td>
					<td>
				<div align="left" style="margin-left: 20px;">
					<font size="1" color="#c3c3c3" face="Consolas">${user.phone}</font>
					</div>
					</td>
					<td width="15%">
					<font style="cursor:default">已绑定</font>
					</td>
				</tr>
				<!-- ///////// -->
		</table>
		</div>
	</center>
	</div>
	</div>
	
	
    
    
    <!-- 绑定邮箱弹框 -->
   <div id="BandingEmail">
        <div class="row1">
            绑定邮箱<a href="javascript:void(0)" title="关闭窗口" class="close_btn" id="closeBtn">×</a>
        </div>
        <table style="margin-top:30px;width:100%;font-family:微软雅黑;">
        
        <tr style="height:60px;">
        <td style="padding: 12px 20px;text-align:right;font-size: 14px;line-height: 48px;">添加邮箱</td>
        <td style="padding: 12px 10px;text-align:left;font-size: 14px;line-height: 48px;">
        <input type="text" id="emailAddress"  placeholder="输入您的邮箱地址" style="width: 300px;height: 46px;line-height: 46px;border: 1px solid #d9d9d9;text-indent: 10px;">
        </td></tr>
        
        <tr><td colspan="2">
        <button id="email" type="button" style="width: 302px;
									margin: 20px auto;
									display: block;
									height: 48px;
									font-size: 20px;
									background-color: #e62538;
									color: #fff;
									line-height: 48px;
									text-align: center;
									-webkit-transition-duration: 0.3s;outline: none;
									cursor: pointer;
									border:1px solid #e62538">
		添加邮箱</button>
        </td></tr>
        </table>
    </div>
    
    <!-- 修改登陆密码 -->
<div id="UpdLoginPwd">
        <div class="row1">
            修改密码<a href="javascript:void(0)" title="关闭窗口" class="close_btn" id="closeBtn">×</a>
        </div>
        <table style="margin-top:30px;width:100%;font-family:微软雅黑;">
        <tr style="height:60px;">
        <td style="padding: 12px 20px;width:22%;text-align:right;font-size: 14px;line-height: 48px;">原始密码</td>
        <td style="padding: 12px 20px;text-align:left;font-size: 14px;line-height: 48px;">
        <input type="password" id="oldPwd"  placeholder="输入原始密码" style="width: 300px;height: 46px;line-height: 46px;border: 1px solid #d9d9d9;text-indent: 10px;">
        </td></tr>
        
        <tr style="height:60px;">
        <td style="padding: 12px 20px;text-align:right;font-size: 14px;line-height: 48px;">新密码</td>
        <td style="padding: 12px 20px;text-align:left;font-size: 14px;line-height: 48px;">
        <input type="password" id="newPwd"  placeholder="输入新密码" style="width: 300px;height: 46px;line-height: 46px;border: 1px solid #d9d9d9;text-indent: 10px;">
        </td></tr>
        
        <tr style="height:60px;">
        <td style="padding: 12px 20px;text-align:right;font-size: 14px;line-height: 48px;">确认密码</td>
        <td style="padding: 12px 20px;text-align:left;font-size: 14px;line-height: 48px;">
        <input type="password" id="newPwd2"  placeholder="再次输入新密码" style="width: 300px;height: 46px;line-height: 46px;border: 1px solid #d9d9d9;text-indent: 10px;">
        </td></tr>
        
        <tr><td colspan="2">
        <button id="pasword" type="button" style="width: 302px;
									margin: 20px auto;
									display: block;
									height: 48px;
									font-size: 20px;
									background-color: #e62538;
									color: #fff;
									line-height: 48px;
									text-align: center;
									-webkit-transition-duration: 0.3s;outline: none;
									cursor: pointer;
									border:1px solid #e62538">
		确定</button>
        </td></tr>
        </table>
    </div>
	
	<script type="text/javascript" src="js/jquery1-1.8.3.min.js"></script>
	<script type="text/javascript">
	$(function ($) {
		
		
		//弹出绑定邮箱
		$("#banding").hover(function () {
			$(this).stop().animate({
				opacity: '1'
			}, 600);
		}, function () {
			$(this).stop().animate({
				opacity: '0.6'
			}, 1000);
		}).on('click', function () {
			$("body").append("<div id='mask'></div>");
			$("#mask").addClass("mask").fadeIn("slow");
			$("#BandingEmail").fadeIn("slow");
		});
		
		//弹出修改登陆密码
		$("#updatePwd").hover(function () {
			$(this).stop().animate({
				opacity: '1'
			}, 600);
		}, function () {
			$(this).stop().animate({
				opacity: '0.6'
			}, 1000);
		}).on('click', function () {
			$("body").append("<div id='mask'></div>");
			$("#mask").addClass("mask").fadeIn("slow");
			$("#UpdLoginPwd").fadeIn("slow");
		});
		//关闭
		$(".close_btn").hover(function () { $(this).css({ color: 'black'}) }, function () { $(this).css({ color: '#999' }) }).on('click', function () {
			$("#LoginBox").fadeOut("fast");
			$("#BandingEmail").fadeOut("fast");
			$("#UpdLoginPwd").fadeOut("fast");
			$("#mask").css({ display: 'none' });
		});
	});
	</script>
	<!-- 提示框 -->
<script type="text/javascript" src="js/iosOverlay.js"></script>
<script type="text/javascript" src="js/spin.min.js"></script>
<script type="text/javascript">


$(document).on("click", "#email", function(e) {
	
	var emailReg=/^\w{3,}(\.\w+)*@[A-z0-9]+(\.[A-z]{2,5}){1,2}$/;
	
	var emailAddress=$("#emailAddress").val();
	if(emailAddress==''){
		iosOverlay({
			text: "邮箱不能为空!",
			duration: 2e3,	
		});
		return;
	}
	if(!(emailReg.test(emailAddress))){
		iosOverlay({
			text: "邮箱格式不正确!",
			duration: 2e3,	
		});
		return;
	}
	alert(emailAddress);
	$.post("user/editProfile",{'email':emailAddress},function(result){
		if(result=='success'){
			iosOverlay({
				text: "绑定成功",
				duration: 2e3,	
			});
			window.setTimeout(function(){
				location.reload();
			},3000);
		}
	});
});
$(document).on("click", "#pasword", function(e) {
	
	var oldPwd=$("#oldPwd").val();
	var newPwd=$("#newPwd").val();
	var newPwd2=$("#newPwd2").val();
	
	if(oldPwd==''){
		iosOverlay({
			text: "原始密码不能为空!",
			duration: 2e3,
		});
		return;
	}
	if(newPwd==''){
		iosOverlay({
			text: "新密码不能为空!",
			duration: 2e3,
		});
		return;
	}
	if(newPwd2==''){
		iosOverlay({
			text: "确认密码不能为空!",
			duration: 2e3,
		});
		return;
	}
	if(newPwd!=newPwd2){
		iosOverlay({
			text: "两次密码不一样!",
			duration: 2e3,
		});
		return;
	}
	
	
	$.post("user/editProfile",{'oldPwd':oldPwd,'newPwd':newPwd},function(result){
		if(result=='success'){
			iosOverlay({
				text: "修改成功",
				duration: 2e3,	
			});
			window.setTimeout(function(){
				location.href="user/openLogin"
			},3000);
			
		}else{
			iosOverlay({
				text: "修改失败",
				duration: 2e3,
			});
			window.setTimeout(function(){
				location.reload();
			},3000);
		}
		
	});
});



$("#test1,#test").click(function(){
	
	top.location.href="finance/bankcard/openRegister";
});
</script>	
</body>
</html>