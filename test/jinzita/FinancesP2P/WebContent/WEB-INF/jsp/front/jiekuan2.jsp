<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>金字塔 - 综合金融服务平台 - 我要借款</title>
<!-- 引入页面Logo小图标 -->
<link rel="icon" href="img/Logo.png" type="image/x-icon">
<base href="<%=path%>/">
<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap.js"></script>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/zzsc.css" />
<script type="text/javascript" src="js/zzsc.js"></script>
<link rel="stylesheet" href="css/theme.css" media="all">
<script src="js/sweetalert.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/sweetalert.css">
<script type="text/javascript" src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>

<script src="js/jquery.min.js"></script>
<script>
jQuery(document).ready(function($) {
	$('.theme-login').click(function(){
		$('.theme-popover-mask').fadeIn(100);
		$('.theme-popover').slideDown(200);
	})
	$('.theme-poptit .close').click(function(){
		$('.theme-popover-mask').fadeOut(100);
		$('.theme-popover').slideUp(200);
	})
	$('.theme-poptit3 .close1').click(function(){
		$('.theme-popover-mask').fadeOut(100);
		$('.theme-popover').slideUp(40);
	})

})
jQuery(document).ready(function($) {
	$('.theme-login1').click(function(){
		$('.theme-popover-mask1').fadeIn(100);
		$('.theme-popover1').slideDown(200);
	})
	$('.theme-poptit1 .close').click(function(){
		$('.theme-popover-mask1').fadeOut(100);
		$('.theme-popover1').slideUp(200);
	})
	$('.theme-poptit2 .close1').click(function(){
		$('.theme-popover-mask1').fadeOut(100);
		$('.theme-popover1').slideUp(40);
	})

})
</script>
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
						<img src="img/Logo2.png" />
					</a>
				</div>
				<div class="div-right">
					<ul>
						<li style="list-style-type: none;display: inline-block;">
							<a class="link1" href="front/index" title="首页" style="text-decoration: none;">首页</a>
						</li>
						<li style="list-style-type: none;display: inline-block;">
							<a class="link1" href="front/touzi?lendtime=0&rate=0&type=0&cont=1" title="投资" style="text-decoration: none;">我要投资</a>
						</li>
						<li style="list-style-type: none;display: inline-block;">
							<a class="link1" href="front/jiekuan" title="借款" style="text-decoration: none;">我要借款</a>
						</li>
						<li style="list-style-type: none;display: inline-block;">
							<a class="link1" href="front/anquan" title="安全保障" style="text-decoration: none;">安全保障</a>
						</li>
						<li style="list-style-type: none;display: inline-block;">
							<a class="link1" href="front/our/1" title="关于我们" style="text-decoration: none;">信息披露</a>
						</li>
						<li style="list-style-type: none;display: inline-block;">
							<a class="link1" href="front/xinshou" title="新手引导" style="text-decoration: none;">新手导航</a>
						</li>
						<li style="list-style-type: none; display: inline-block; margin: 0px; padding: 0px;">
							<c:if test="${empty user }">
							
<%-- 							<shiro:guest> --%>
							<!-- 未登录 -->
								<a class="link2" href="user/openLogin" title="未登录，前往登录">我的账户</a>
<%-- 							</shiro:guest> --%>
							</c:if>
							<c:if test="${!empty user }">
<%-- 							<shiro:user> --%>
							<!-- 已登录 -->
								<a class="link2">我的账户</a>
								<ul style="line-height: 30px;">
									<li style="list-style-type: none; display: inline-block;"><a
										class="link1" href="front/user/PersonalCenter" title="个人中心"
										style="text-decoration: none;">个人中心</a></li>
									<li style="list-style-type: none; display: inline-block;"><a
										class="link1" href="user/logout" title="退出"
										style="text-decoration: none;">退出</a></li>
								</ul>
<%-- 							</shiro:user> --%>
							</c:if>
						</li>
					</ul>
				</div>

			</nav>

		</header>

		<div class="theme-layout">
			<div class="responsive-header">
				<div class="responsive-bar">
					<span class="open-menu"><i data-target="menu" class="fa fa-align-justify"></i></span>
					<div class="logo" style="margin-left: 10px;">
						<a href="javascript:;" title="">
							<img src="img/Logo.png" alt="" />
						</a>
					</div>
					<!-- Logo -->
				</div>
				<div class="responsive-links menu">
					<ul>
						<li>
							<a href="front/index" title="首页">首页</a>
						</li>
						<li>
							<a href="front/touzi?lendtime=0&rate=0&type=0&cont=1" title="投资">我要投资</a>
						</li>
						<li>
							<a href="front/jiekuan" title="借款">我要借款</a>
						</li>
						<li>
							<a href="front/anquan" title="安全保障">安全保障</a>
						</li>
						<li>
							<a href="front/our/1" title="关于我们">信息披露</a>
						</li>
						<li>
							<a href="front/xinshou" title="新手引导">新手导航</a>
						</li>
						<li>
							<c:if test="${empty user }">
<%-- 							<shiro:guest> --%>
								<a class="link2" href="user/openLogin" title="未登录，前往登录">我的账户</a>
<%-- 							</shiro:guest> --%>
							</c:if>
							<c:if test="${!empty user }">
<%-- 							<shiro:user> --%>
								<a class="link2" href="front/user/PersonalCenter" title="Contact">我的账户</a>
	
								<ul style="line-height: 30px;">
									<li style="list-style-type: none; display: inline-block;"><a
										class="link1" href="front/user/PersonalCenter" title="个人中心"
										style="text-decoration: none;">个人中心</a></li>
									<li style="list-style-type: none; display: inline-block;"><a
										class="link1" href="user/logout" title="退出"
										style="text-decoration: none;">退出</a></li>
								</ul>
<%-- 							</shiro:user> --%>
							</c:if>
						</li>
					</ul>
				</div>
				<div class="responsive-links other">
					<form>
						<input type="text" placeholder="Enter Your Search" />
						<button><i class="fa fa-search"></i></button>
					</form>

				</div>
			</div>
		<!-- Responsive Header -->

		<!--
            	作者：383942470@qq.com
            	时间：2017-11-10
            	描述：锚点
            -->
		<div style="position: absolute;">
			<div class="bottom_tools">
				<div class="qr_tool">二维码</div>
				<a id="feedback" href="front/idea" title="意见反馈">意见反馈</a> <a
					id="scrollUp" href="javascript:;" title="飞回顶部"></a> <img
					class="qr_img" src="images/qr_img.png">
			</div>
		</div>
	</div>

	<script type="text/javascript">
			var new_scroll_position = 0;
			var last_scroll_position;
			var header = document.getElementById("header");

			window.addEventListener('scroll', function(e) {
				last_scroll_position = window.scrollY;
				// Scrolling down
				if(new_scroll_position < last_scroll_position && last_scroll_position > 80) {
					// header.removeClass('slideDown').addClass('slideUp');
					header.classList.remove("slideDown");
					header.classList.add("slideUp");

					// Scrolling up
				} else if(new_scroll_position > last_scroll_position) {
					// header.removeClass('slideUp').addClass('slideDown');
					header.classList.remove("slideUp");
					header.classList.add("slideDown");
				}

				new_scroll_position = last_scroll_position;

			});
		</script>
	<!--
        	作者：383942470@qq.com
        	时间：2017-11-20
        	描述：网贷流程
        -->
	<div>
		<div class="wangdai-liuchen-top1">
			<span>您当前所在的位置：</span><span>金字塔</span><span>&nbsp;>&nbsp;</span><span>综合金融服务平台</span><span>&nbsp;>&nbsp;</span><span>我要借款</span>
		</div>
		<div class="wangdai-liuchen-top">
			<div style="height: 30px;"></div>
			<table style="width: 90%; margin: 0 auto;">
				<tr>
					<td><img src="cooperation/1.png" /></td>
					<td><img src="cooperation/5.png" /></td>
					<td><img src="cooperation/2.png" /></td>
					<td><img src="cooperation/5.png" /></td>
					<td><img src="cooperation/3.png" /></td>
					<td><img src="cooperation/5.png" /></td>
					<td><img src="cooperation/4.png" /></td>
				</tr>
				<tr height="80px">
					<td><p>填写借款申请</p></td>
					<td></td>
					<td><p>平台进行信用调查和审核</p></td>
					<td></td>
					<td><p>借款标通过审核并上线</p></td>
					<td></td>
					<td><p>借款成功，后续管理</p></td>
				</tr>
			</table>
		</div>
	</div>
	<!--
        	作者：383942470@qq.com
        	时间：2017-11-20
        	描述：快速信用借
        -->
	<div class="xinyongjie-top">
		<span>&nbsp;&nbsp;<font size="5">快速信用借</font></span> <span
			style="color: #999999;">该业务由正合普惠金融提供，精准解决资金难题</span>
	</div>
	<div class="xinyongjie-center">
		<div class="xinyong-div1">
			<div class="theme-buy">
				<a class="btn-large1 theme-login1" href="javascript:;"
					style="text-decoration: none; color: black;">
					<div class="xinyong-div1-1">
						<h3 style="color: #cbc282; float: left; margin-top: -10px;">公务员方案</h3>
						<br /> <br /> <span>适用于公务员、事业单位、银行、公立学校、公立医院的职工</span><br /> <br />
						<span>最高可借</span><span style="color: #cbc282;">20万</span>
					</div>
					<div style="width: 100%; margin-left: 30px;">
						<div style="float: left; margin-top: 50px;">
							<span>查看更多</span>
						</div>
						<div style="float: right; margin-right: 10px; margin-top: -60px;">
							<img src="cooperation/xinyong1.png" width="225px" height="225px" />
						</div>
					</div>
			</div>
			</a>
		</div>
		<div class="xinyong-div2">
			<div class="theme-buy">
				<a class="btn-large1 theme-login1" href="javascript:;"
					style="text-decoration: none; color: black;">
					<div class="xinyong-div1-1">
						<h3 style="color: #cbc282; margin-top: -10px;"">精英方案</h3>
						<br /> <span>适用于在本地有社保公积金及需要交纳税金的工薪一族</span><br /> <br /> <span>最高可借</span><span
							style="color: #cbc282;">15万</span>

					</div>
					<div style="width: 100%; margin-left: 30px;">
						<div style="float: left; margin-top: 50px;">
							<span>查看更多</span>
						</div>
						<div style="float: right; margin-right: 10px; margin-top: -68px;">
							<img src="cooperation/xinyong2.png" width="225px" height="225px" />
						</div>
					</div>
			</div>
			</a>
		</div>
		<div class="xinyong-div3">
			<div class="theme-buy">
				<a class="btn-large1 theme-login1" href="javascript:;"
					style="text-decoration: none; color: black;">
					<div class="xinyong-div1-1">
						<h3 style="color: #cbc282; margin-top: -10px;">公积金方案</h3>
						<br /> <span>适用于在本地有公积金及需要交纳税金的申请人</span><br /> <br /> <span>最高可借</span><span
							style="color: #cbc282;">20万</span>
					</div>
					<div style="width: 100%; margin-left: 30px;">
						<div style="float: left; margin-top: 50px;">
							<span>查看更多</span>
						</div>
						<div style="float: right; margin-right: 10px; margin-top: -65px;">
							<img src="cooperation/xinyong3.png" width="215px" height="215px" />
						</div>
					</div>
			</div>
			</a>
		</div>
		<div class="xinyong-div4">
			<div class="theme-buy">
				<a class="btn-large1 theme-login1" href="javascript:;"
					style="text-decoration: none; color: black;">
					<div class="xinyong-div1-1">
						<h3 style="color: #cbc282; margin-top: -10px;">保单方案</h3>
						<br /> <span>适用于有投保人寿险产品及需要交纳税金的投保人</span><br /> <br /> <span>最高可借</span><span
							style="color: #cbc282;">20万</span>
					</div>
					<div style="width: 100%; margin-left: 30px;">
						<div style="float: left; margin-top: 50px;">
							<span>查看更多</span>
						</div>
						<div style="float: right; margin-right: 10px; margin-top: -65px;">
							<img src="cooperation/xinyong4.png" width="210px" height="210px" />
						</div>
					</div>
			</div>
		</div>
		</a>
	</div>
	<!--
        	作者：383942470@qq.com
        	时间：2017-11-20
        	描述：有抵押借款
        -->
	<div class="xinyongjie-top">
		<span>&nbsp;&nbsp;<font size="5">有抵押借款</font></span> <span
			style="color: #999999;">只要有房、有车或其它抵押物，满足条件就能申请</span>
	</div>
	<div class="xinyongjie-center">
		<div class="xinyong-div1">
			<div class="theme-buy">
				<a class="btn-large theme-login" href="javascript:;"
					style="text-decoration: none; color: black;">
					<div class="xinyong-div1-1">
						<h3 style="color: #cbc282;">小微企业</h3>
						<br /> <span>适用于实体小微企业</span><br /> <br /> <span>最高可借</span><span
							style="color: #cbc282;">20万</span>
					</div>
					<div style="width: 100%; margin-left: 30px;">
						<div style="float: left; margin-top: 50px;">
							<span>查看更多</span>
						</div>
						<div style="float: right; margin-right: 10px; margin-top: -105px;">
							<img src="cooperation/wangdai1.png" style="margin-top: 50px;" />
						</div>
					</div>
			</div>
			</a>
		</div>
		<div class="xinyong-div2">
			<div class="theme-buy">
				<a class="btn-large theme-login" href="javascript:;"
					style="text-decoration: none; color: black;">
					<div class="xinyong-div1-1">
						<h3 style="color: #cbc282;">车贷</h3>
						<br /> <span>适用于拥有车辆的个人</span><br /> <br /> <span>最高可借</span><span
							style="color: #cbc282;">20万</span>
					</div>
					<div style="width: 100%; margin-left: 30px;">
						<div style="float: left; margin-top: 50px;">
							<span>查看更多</span>
						</div>
						<div style="float: right; margin-right: 10px; margin-top: -105px;">
							<img src="cooperation/wangdai2.png"
								style="margin-top: 20px; margin-right: 20px;" />
						</div>
					</div>
			</div>
			</a>
		</div>
		<div class="diya-div3">
			<div class="theme-buy">
				<a class="btn-large theme-login" href="javascript:;"
					style="text-decoration: none; color: black;">
					<div class="diya-div3-1">
						<h3 style="color: #cbc282;">房贷</h3>
						<br /> <span>适用于拥有房产的个人</span><br /> <br /> <span>最高可借</span><span
							style="color: #cbc282;">20万</span>
					</div>
					<div style="width: 100%; margin-left: 30px;">
						<div style="float: left; margin-top: 50px;">
							<span>查看更多</span>
						</div>
						<div style="float: right; margin-right: 10px; margin-top: -55px;">
							<img src="cooperation/wangdai3.png" />
						</div>
					</div>
			</div>
			</a>
		</div>
		<div class="diya-div4">
		<div class="theme-buy">
				<a class="btn-large theme-login" href="javascript:;"
					style="text-decoration: none; color: black;">
			<div class="diya-div4-1">
				<div style="width: 80%; margin: 0 auto; cursor: pointer;">
					<h3 style="color: #cbc282;">抵押标</h3>
					<br /> <span>适用于有资产可以抵押的用户</span><br /> <br /> <span
						style="color: #cbc282;">立即申请</span>
				</div>
			</div>
			</div>
			</a>
			<hr style="height: 3px;" />
			<div class="theme-buy">
				<a class="btn-large theme-login" href="javascript:;"
					style="text-decoration: none; color: black;">
			<div class="diya-div4-2">
				<div style="width: 80%; margin: 0 auto;margin-top:-20px; cursor: pointer;">
					<h3 style="color: #cbc282;">信用标</h3>
					<br /> <span>适用于没有不良信用信息的用户</span><br /> <br /> <span
						style="color: #cbc282;">立即申请</span>
				</div>
			</div>
			</div>
			</a>
		</div>
	</div>
	<div class="diya-zichan1"></div>
	<!--
        	作者：383942470@qq.com
        	时间：2017-11-21
        	描述：常见问题
        -->
	<div class="xinyongjie-top">
		<span>&nbsp;&nbsp;<font size="5">常见问题</font></span>
	</div>
	<div class="problem-top">
		<div class="problem-left">
			<img src="cooperation/problem-1.png"
				style="position: absolute; width: 40px; height: 40px; left: 120px; top: 1290px;" />
			<div class="problem-left1">
				<div class="problem-left3">
					<span style="font-size: 26px;">借款审核一般需要多长时间？</span><br /> <br />
					<span>借款资料提交成功后，工作人员会在 2 个工作日内进行审核，审核结果会以电话的形式通知。</span>
				</div>
			</div>
			<div class="problem-left2">
				<img src="cooperation/problem-3.png"
					style="position: absolute; width: 40px; height: 40px; left: 120px; top: 1460px;" />
				<div class="problem-left4">
					<div class="problem-left4-1">
						<span style="font-size: 26px;">还款方式有哪些？</span><br /> <br /> <span>目前根据不同的借款产品支持一次性还本付息，每月付息到期还本、等额本息、等本等息等还款方式。</span>
					</div>
				</div>
			</div>
		</div>
		<div class="problem-right">
			<img src="cooperation/problem-2.png"
				style="position: absolute; width: 40px; height: 40px; left: 700px; top: 1290px;" />
			<div class="problem-right1">
				<div class="problem-right3">
					<div class="problem-right3-1">
						<span style="font-size: 26px;">借款额度是多少？</span><br /> <br /> <span>不同的借款产品额度范围有一定差别，各产品详情页中有详细说明。</span>
					</div>
				</div>
			</div>
			<div class="problem-right2">
				<img src="cooperation/problem-4.png"
					style="position: absolute; width: 40px; height: 40px; left: 700px; top: 1460px;" />
				<div class="problem-right4">
					<div class="problem-right4-1">
						<span style="font-size: 26px;">借款需要支付哪些费用？</span><br /> <br /> <span>借款人借款成功后需要支付给投资人的利息费用，以及支付给团贷网平台和团贷网平台合作伙伴的服务费用。</span>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--
        	作者：383942470@qq.com
        	时间：2017-11-15
        	描述：底部
        -->
	<div style="width: 100%; height: 200px; background: white; margin-top: 50px;">
		<div class="container">
			<div class="row">
				<div style="width: 90%; margin-top: 40px;">
					<!-- 部分：一 -->
					<div class="col-md-4">
						<div class="row">
							<div class="col-md-6">
								<ul class="dibu">
									<li class="dibu-li">新手帮助</li>
									<li><a href="front/xinshou" class="dibu-a">新手指引</a></li>
									<li><a href="front/xinshou" class="dibu-a">帮助中心</a></li>
									<li><a href="front/xinshou" class="dibu-a">资费介绍</a></li>
								</ul>
							</div>
							<div class="col-md-6">
								<ul class="dibu">
									<li class="dibu-li">安全保障</li>
									<li><a href="front/our/1" class="dibu-a">法律法规</a></li>
									<li><a href="front/anquan" class="dibu-a">安全保障</a></li>
									<li><a href="front/index" class="dibu-a">合作机构</a></li>
								</ul>
							</div>
						</div>
					</div>
					<!-- 部分：二 -->
					<div class="col-md-6">
						<div class="col-md-5">
							<ul class="dibu">
								<li class="dibu-li">如何理财</li>
								<li><a href="front/index" class="dibu-a">投资资讯</a></li>
								<li><a href="front/index" class="dibu-a">贷款问答</a></li>
								<li><a href="front/index" class="dibu-a">贷款百科</a></li>
							</ul>
						</div>
						<div class="col-md-7">
							<img src="img/qrcode_for_gh_0459d30bd1d0_430.jpg"
								style="width: 129px; height: 129px; margin-left: 60px;" />
						</div>
					</div>
					<!-- 部分：三 -->
					<div class="col-md-2">
						<ul class="dibu">
							<li>1010-1218</li>
							<li>客服电话：（服务时间：9:00-22:00)</li>
							<li>
							
								<div class="mt38 tdw-btn-lg" style="margin-top:0px">
								<a class="dibu-aa">
									<span rel="nofollow" class="btn-text" 
											href="javascript:;"target="_blank">
											联系客服</span>
								</a>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!--
	作者：383942470@qq.com
	时间：2017-11-24
	描述：弹框
-->

	<c:if test="${empty user }">

		<!-- 未登录 -->
		<div class="theme-popover"
			style="width: 400px; height: 200px; left: 62%; top: 60%">
			<div class="theme-poptit">
				<a href="javascript:;" title="关闭" class="close">x</a> <span>未登录</span>
			</div>
			<div>
				<div style="text-align: center; margin-top: 40px; font-size: 16px;">
					<span>须注册本平台且用户登录后才可进行借款</span>
				</div>
				<div style="margin-top: 30px; text-align: center;">
					<a href="user/openLogin"
						style="padding: 6px 20px 6px 20px; background: #ffb700; border: 1px solid #ffb700; color: white; text-decoration: none; cursor: pointer">
						确定 </a>
				</div>
			</div>
		</div>
		<div class="theme-popover-mask"></div>
		
		<!-- 未登录 -->
		<div class="theme-popover1"
			style="width: 400px; height: 200px; left: 62%; top: 60%">
			<div class="theme-poptit1">
				<a href="javascript:;" title="关闭" class="close">x</a> <span>未登录</span>
			</div>
			<div>
				<div style="text-align: center; margin-top: 40px; font-size: 16px;">
					<span>须注册本平台且用户登录后才可进行借款</span>
				</div>
				<div style="margin-top: 30px; text-align: center;">
					<a href="user/openLogin"
						style="padding: 6px 20px 6px 20px; background: #ffb700; border: 1px solid #ffb700; color: white; text-decoration: none; cursor: pointer">
						确定 </a>
				</div>
			</div>
		</div>
		<div class="theme-popover-mask1"></div>

<%-- 	</shiro:guest> --%>
	</c:if>
	
	<c:if test="${!empty user }">

		<!-- 已登录 -->
		<div class="theme-popover" style="height:450px;top:52%;">
			<div class="theme-poptit">
				<a href="javascript:;" title="关闭" class="close"><font size="5">x</font></a> <span>申请小微企业</span>
			</div>
			<div style="margin-top: 20px; ">
				<div style="float: left; width: 52%; margin-top: 20px; border-right: 1px dashed #EAE9E9; text-align: center;">
				<form  method="post"name="form1" id="form1">
					<div>
							<span style="margin-left:18px;">所在城市&nbsp;&nbsp;&nbsp;</span>
							<select name="title" id="province" onchange="changeSelect(this.selectedIndex)" class="select-chengshi"></select>
			         		<select name="backType" id="city"class="select-chengshi"></select>
			   		 </div>
			   		 <div>
							<span>借款人姓名&nbsp;&nbsp;&nbsp;&nbsp;</span>
							<input type="text"class="ipu" name="realname" maxlength="18"/>
					</div>
					<span style="margin-left: 15px;">手机号码&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
					<input type="text" class="ipu" name="phone" id="phone2" maxlength="11"/><br /> <br />
					<span style="margin-left: -60px;">性别&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
					<label class="demo--label">
						<input type="radio" class="ipu demo--radio" name="sex" checked="checked" value="男士" />
						<span class="demo--radioInput"></span>男士
    				</label>
    				<label class="demo--label">
						<input type="radio" class="ipu demo--radio" name="sex" value="女士" />
						<span class="demo--radioInput"></span>女士
    				</label>
						<br /> 
					<span style="margin-left: 15px;">借款金额&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
						<input type="text" class="ipu" name="lendmoney" /><br />
					<div class="theme-poptit3" style="margin-top: 20px; text-align: center;">
						<input type="button" value="提交申请意向" style="padding: 6px 20px 6px 20px;" onclick="refer1();" class="close1"/>
					</div>
					</form>
				</div>
				<div style="float: right; width: 45%; margin-top: 20px;">
					<p>适用对象：</p>
					<span>为小微企业提供快速融资通道、提高资金利用率的信贷业务产品，以企业固定资产、设备、应收账款等作为授信的反担保物申请借款。</span> <br /> <br />
					<p>申请条件：</p>
					<span>申请企业需成立1年以上，行业从业经验3年以上，无不良信用记录；借款人家庭实物净资产不低于50万，同时须经团贷网信贷人员的线下审核和评估后，对借款人进行授信。</span> <br />
					<br />
					<p>最高额度：1000万</p>
					<p>可选期限：1/3/6/12期</p>
				</div>
			</div>
		</div>
		<div class="theme-popover-mask"></div>
		
		<div class="theme-popover1">
			<div class="theme-poptit1">
				<a href="javascript:;" title="关闭" class="close">x</a> <span>申请公务员方案</span>
			</div>
			<div style="height: 400px;margin-top: 20px; ">
				<div style="float: left; width: 52%; margin-top: 20px; border-right: 1px dashed #EAE9E9; text-align: center;">
				<form  method="post" name="form2" id="form2">
					<div>
							<span style="margin-left:18px;">所在城市&nbsp;&nbsp;&nbsp;&nbsp;</span>
							<select name="title" id="province" onchange="changeSelect1(this.selectedIndex)" class="select-chengshi"></select>
			         		<select name="backType" id="city"class="select-chengshi"></select>
			   		 </div>
			   		 <div>
							<span>借款人姓名&nbsp;&nbsp;&nbsp;&nbsp;</span>
							<input type="text"class="ipu" name="realname" maxlength="18"/>
					</div>
					<span style="margin-left: 15px;">手机号码&nbsp;&nbsp;&nbsp;&nbsp;</span>
					<input type="text" class="ipu" name="phone" id="phone1" maxlength="11"/><br /> <br />
					<span style="margin-left: -65px;">性别&nbsp;&nbsp;&nbsp;&nbsp;</span>
						<label class="demo--label">
						<input type="radio" class="ipu demo--radio" name="sex" checked="checked" value="男士" />
						<span class="demo--radioInput"></span>男士
    				</label>
    				<label class="demo--label">
						<input type="radio" class="ipu demo--radio" name="sex" value="女士" />
						<span class="demo--radioInput"></span>女士
    				</label><br />
					<div class="theme-poptit2" style="margin-top: 20px; text-align: center;">
						<input type="button" value="提交申请意向" style="padding: 6px 20px 6px 20px;" onclick="refer2();" class="close1"/>
					</div>
					</form>
				</div>

				<div style="float: right; width: 45%; margin-top: 20px;">
					<p>适用对象：</p>
					<span>专为事业单位、银行、公立学校、公立医院的正式员工提供的资金服务，审核简便，借款快捷。</span> <br /> <br />
					<br />
					<p>申请条件：</p>
					<span>年龄在20周岁至60周岁之间的中国境内公民（不含港澳台）；申请人在本单位连续工作6个月以上。</span> <br />
					<br /> <br />
					<p>最高额度：20万</p>
					<p>可选期限：18/24/36/48期</p>
				</div>
			</div>
			</div>
			<div class="theme-popover-mask1"></div>

<%-- 			</shiro:user> --%>
		</c:if>

		

			<script type="text/javascript">
				function refer1(){
					var uu=${user.phone};
					var ph2=document.getElementById("phone2").value;
					
					if(uu!=ph2){
						swal("手机号码不正确!", "请您重新提交", "error");
						return false;
					}
					 $.ajax({  
		                    url: 'lendApply/lendApply-len',  
		                    type: 'POST',  
		                    data: {
		                    	username:uu
		                    },  
		                    cache: false,  
		                   
		                    success : function(data) {
		                    	if(data=="error1"){
									swal("你提交了申请!", "我们会尽快与您联系", "error");
									return false;
								}
								if(data=="error2"){
									swal("正在审核!", "我们会尽快与您联系", "error");
									return false;
								}
								if(data=="error3"){
									swal("你正在借款中！！！", "我们会尽快与您联系", "error");
									return false;
								}
		                    	
								if(data=="success"){
									var data = new FormData(document.form1);  
					                $.ajax({  
					                    url: 'lendApply/lendApply-add',  
					                    type: 'POST',  
					                    data: data,
					                    cache: false,  
					                    processData: false,  
				                        contentType: false,
					                    success : function(data) {
											if(data=="success"){
												swal("提交成功!", "我们会尽快与您联系", "success");
											}
										}, error: function(XMLHttpRequest,textStatus) {
											swal("提交失败!", "请您重新提交", "error");
						                }				
									
					                }); 
								}
// 								else{
// 									swal("提交失败!", "你正在借款中！！！", "error");
// 								}
							}					
						
		                }); 
				}
				
				function refer2(){
					
					var uu=${user.phone};
					
					var ph1=document.getElementById("phone1").value;
			
					if(uu!=ph1){
						swal("手机号码不正确!", "请您重新提交", "error");
						return false;
					}
					 $.ajax({  
		                    url: 'lendApply/lendApply-len',  
		                    type: 'POST',  
		                    data: {
		                    	username:uu
		                    },  
		                    cache: false,  
		                   
		                    success : function(data) {
		                    	
								if(data=="error1"){
									swal("你提交了申请!", "我们会尽快与您联系", "error");
									return false;
								}
								if(data=="error2"){
									swal("正在审核!", "我们会尽快与您联系", "error");
									return false;
								}
								if(data=="error3"){
									swal("你正在借款中！！！", "我们会尽快与您联系", "error");
									return false;
								}
		                    	
								if(data=="success"){
									var data = new FormData(document.form2);  
									$.ajax({  
				 	                    url: 'lendApply/lendApply-add',  
				 	                    type: 'POST',  
				 	                    data: data,  
				 	                    cache: false,  
				 	                    processData: false,  
				 	                    contentType: false,
				 	                    success : function(data) {
				 							if(data=="success"){
				 								swal("提交成功!", "我们会尽快与您联系", "success");
				 							}
				 						}, error: function(XMLHttpRequest,textStatus) {
				 								swal("提交失败!", "请您重新提交", "error");
				 		                }						
									
				 	                }); 
								}
// 								else{
// 									swal("提交失败!", "你正在借款中！！！", "error");
// 								}
							}					
						
		                }); 
					
					
// 	                $.ajax({  
// 	                    url: 'lendApply/lendApply-add',  
// 	                    type: 'POST',  
// 	                    data: data,  
// 	                    cache: false,  
// 	                    processData: false,  
// 	                    contentType: false,
// 	                    success : function(data) {
// 							if(data=="success"){
// 								swal("提交成功!", "我们会尽快与您联系", "success");
// 							}
// 						}, error: function(XMLHttpRequest,textStatus) {
// 								swal("提交失败!", "请您重新提交", "error");
// 		                }						
					
// 	                }); 
				}
			
			</script>
			
		<script type="text/javascript">
     var arr_province = ["请选择","北京市","上海市","天津市","重庆市","深圳市","广东省"];
     var arr_city = [
                     ["请选择"],
                     ["东城区","西城区","朝阳区","宣武区","昌平区","大兴区","丰台区","海淀区"],
                     ['宝山区','长宁区','丰贤区', '虹口区','黄浦区','青浦区','南汇区','徐汇区','卢湾区'],
                     ['和平区', '河西区', '南开区', '河北区', '河东区', '红桥区', '塘古区', '开发区'],
                     ['俞中区', '南岸区', '江北区', '沙坪坝区', '九龙坡区', '渝北区', '大渡口区', '北碚区'],
                     ['福田区', '罗湖区', '盐田区', '宝安区', '龙岗区', '南山区', '深圳周边'],

                     ['广州市','惠州市','汕头市','珠海市','佛山市','中山市','东莞市']
                 ];
     //网页加载完成，初始化菜单
     /* window.onload = init;//传入函数地址 */
     window.onload=function(){init();init1();}    
     function init(){
         //首先获取对象
         var province = document.form1.title;
         var city = document.form1.backType;
 
        //指定省份中<option>标记的个数
         province.length = arr_province.length;
 
         //循环将数组中的数据写入<option>标记中
        for(var i=0;i<arr_province.length;i++){
            province.options[i].text = arr_province[i];
            province.options[i].value = arr_province[i];
         }
 
        //修改省份列表的默认选择项
         var index = 0;
         province.selectedIndex = index;
 
         //指定城市中<option>标记的个数
         city.length = arr_city[index].length;
 
         //循环将数组中的数据写入<option>标记中
         for (var j = 0; j<arr_city[index].length;j++) {
             city.options[j].text = arr_city[index][j];
             city.options[j].value = arr_city[index][j];
         }
 
     }
 
     function  changeSelect(index){
    	 
        //选择对象
         var city = document.form1.backType;
         //修改省份列表的选择项
         province.selectedIndex = index;
 
         //指定城市中<option>标记的个数
         city.length = arr_city[index].length;
 
         //循环将数组中的数据写入<option>标记中
         for (var j = 0; j<arr_city[index].length;j++) {
             city.options[j].text = arr_city[index][j];
             city.options[j].value = arr_city[index][j];
         }
     }
 

     function init1(){
         //首先获取对象
         //首先获取对象
         var province = document.form2.title;
         var city = document.form2.backType;
 
        //指定省份中<option>标记的个数
         province.length = arr_province.length;
 
         //循环将数组中的数据写入<option>标记中
        for(var i=0;i<arr_province.length;i++){
            province.options[i].text = arr_province[i];
             province.options[i].value = arr_province[i];
         }
 
        //修改省份列表的默认选择项
         var index = 0;
         province.selectedIndex = index;
 
         //指定城市中<option>标记的个数
         city.length = arr_city[index].length;
 
         //循环将数组中的数据写入<option>标记中
         for (var j = 0; j<arr_city[index].length;j++) {
             city.options[j].text = arr_city[index][j];
             city.options[j].value = arr_city[index][j];
         }
 
     }
 
     function  changeSelect1(index){
    	 
        //选择对象
         var city = document.form2.backType; 
         //修改省份列表的选择项
         province.selectedIndex = index;
 
         //指定城市中<option>标记的个数
         city.length = arr_city[index].length;
 
         //循环将数组中的数据写入<option>标记中
         for (var j = 0; j<arr_city[index].length;j++) {
             city.options[j].text = arr_city[index][j];
             city.options[j].value = arr_city[index][j];
         }
     }
 
 </script>
	

 
	<!-- the overlay element -->
	<script src="js/classie.js"></script>
	<!-- bootstrap js -->
	<script type="text/javascript" src="js/jquery2.1.4.js"></script>
	<script type="text/javascript" src="js/script.js"></script>
</body>

</html>