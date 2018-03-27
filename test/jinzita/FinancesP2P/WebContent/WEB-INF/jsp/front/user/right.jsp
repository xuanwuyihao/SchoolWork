<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<%@page import="java.util.*"%>              
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>金字塔 - 综合金融服务平台 - 用户个人中心 - 导航栏</title>	
		<base href="<%=path%>/">	
		<!-- 引入页面Logo小图标 -->
		<link rel="icon" href="img/Logo.png" type="image/x-icon">
		<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/bootstrap.js"></script>
		<link rel="stylesheet" type="text/css" href="css/normalize.css" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/style.css" type="text/css" />
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
		
		<link href="css/left.css" rel="stylesheet" type="text/css" />
		
		<style>
		
		
		/* .panel-heading{
		font-family:楷体;
		}  */
		@font-face {
		  font-family: 'iconfont';
		  src: url('found/iconfont.eot');
		  src: url('found/iconfont.eot?#iefix') format('embedded-opentype'),
		  url('found/iconfont.woff') format('woff'),
		  url('found/iconfont.ttf') format('truetype'),
		  url('found/iconfont.svg#iconfont') format('svg');
		}
		.iconfont{
		  font-family:"iconfont" !important;
		  font-size:16px;font-style:normal;
		  -webkit-font-smoothing: antialiased;
		  -webkit-text-stroke-width: 0.2px;
		  -moz-osx-font-smoothing: grayscale;
		}
		i{
		margin: 0 10px;
		}
		</style>
	
<script type="text/javascript">
	$(function () { $('#collapseFour').collapse({
		toggle: false
	})});
	$(function () { $('#collapseTwo').collapse('show')});
	$(function () { $('#collapseThree').collapse('toggle')});
	$(function () { $('#collapseOne').collapse('hide')});
	$(function () { $('#').collapse('toggle')});
</script> 

	<style type="text/css">
		a:focus{text-decoration: none}
		a:focus{outline:none;}
	</style>

</head>

<body style="background-color: white;">
	<!--左右边框  -->
	<div style="margin: 10px 10px;">
			<div class="panel panel-defaults" style="background-color: white;">
				<div class="panel-heading" style="border-radius: 0">
					<h4 class="panel-title"style="cursor: default;">
						 <i class="iconfont" >&#xe641;</i>我的账号
					</h4>
				</div>
			</div>
			<div class="panel-heading" style="border-radius: 0">
			<a data-toggle="collapses" data-parent="#accordions" 
							   href="front/user/Account"  target="cent" >
							        <button class="l"><div align="left"style="margin-left: 40px">账户总览</div></button></a></div>
			<div class="panel-heading" style="border-radius: 0"><a data-toggle="collapses" data-parent="#accordions" 
							   href="finance/bankcard/openRecharge"  target="cent">
							   		<button class="l"><div align="left"style="margin-left: 40px">充值</div></button></a></div>
			<div class="panel-heading" style="border-radius: 0"><a data-toggle="collapses" data-parent="#accordions" 
							   href="finance/bankcard/openWithdrawals"  target="cent">
							   		<button class="l"><div align="left"style="margin-left: 40px">提现</div></button></a></div>
			<div class="panel-heading" style="border-radius: 0"><a data-toggle="collapses" data-parent="#accordions" 
							   href="front/user/capital"  target="cent">
							   		<button class="l"><div align="left"style="margin-left: 40px">资金记录</div></button></a></div>
			<hr>
			<div class="panel panel-successs" style="margin-top:-21px;">
				<div class="panel-heading" style="border-radius: 0">
					<h4 class="panel-title"style="cursor: default;">
							<i class="iconfont">&#xe657;</i>我的管理
					</h4>
				</div>
				<div>
				</div>
			</div>
			<div class="panel-heading" style="border-radius: 0"><a data-toggle="collapses" data-parent="#accordions" 
							   href="finance/investment/getUserName/${user.id}"  target="cent">
							   <button class="l"><div align="left"style="margin-left: 40px">投资管理</div></button></a></div>
			<div class="panel-heading" style="border-radius: 0"><a data-toggle="collapses" data-parent="#accordions" 
							   href="finance/investment/selUserName?phone=${user.phone}" target="cent">
							   <button class="l"><div align="left"style="margin-left: 40px">借款管理</div></button></a></div>
			<div style="height: 20px;"></div>
				<div class="panel panel-defaults" style="background-color: white;">
				<div class="panel-heading" style="border-radius: 0">
					<h4 class="panel-title"style="cursor: default;">
						 <i class="iconfont">&#xe61b;</i>账号设置
					</h4>
				</div>
			</div>
			<div class="panel-heading" style="border-radius: 0"><a data-toggle="collapses" data-parent="#accordions" 
							   href="front/user/MyBankCard"  target="cent">
							   <button class="l"><div align="left"style="margin-left: 40px">我的银行卡</div></button></a></div>
			<div class="panel-heading" style="border-radius: 0"><a data-toggle="collapses" data-parent="#accordions" 
							   href="front/user/Safety"  target="cent">
							   <button class="l"><div align="left"style="margin-left: 40px">安全设置</div></button></a></div>
			<div class="panel-heading" style="border-radius: 0"><a data-toggle="collapses" data-parent="#accordions" 
							   href="front/openMessage"  target="cent">
							   <button class="l"><div align="left" style="margin-left: 40px">消息中心</div></button></a></div>
			</div>
			<div class="panel panel-defaults" style="background-color: white;height: 40px;">
				<div class="panel-heading" style="border-radius: 0;height: 40px;">
				<a href="front/user/openInvitingFriends" target="cent">			
					<div style="margin-left: 20px;height: 40px;">
						<h4 class="panel-title" style="height:40px;">
						 <img alt="" src="img/headx.png">&nbsp;&nbsp;邀请好友
						</h4>
					</div>
				</a>
				</div>
			</div>
<!--end  -->
		<!-- bootstrap js -->
		<script type="text/javascript" src="js/jquery2.1.4.js"></script>
		<script type="text/javascript" src="js/script.js"></script>
		<script type="text/javascript">
			function isSession(){
				alert(1);
				<%-- var strSession = <%=session.getAttribute("user")%>;
				alert(strSession); --%>
			}
			window.setInterval(function(){ 
				
				$.post("user/isSession",function(result){
					 if(result=='error'){
						 top.location.href="user/openLogin"
				        }
				});
			}, 3000); 
		</script>
	</body>
</html>