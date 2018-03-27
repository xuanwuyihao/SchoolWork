<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>金字塔 - 综合金融服务平台 - 安全保障</title>	
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

<!--
	作者：383942470@qq.com
	时间：2017-11-08
	描述：图标
-->
<link href="css/icons.css" rel="stylesheet" type="text/css" />

<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />

<link href="css/responsive.css" rel="stylesheet" type="text/css" />

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
<!-- bootstrap js -->
<script type="text/javascript" src="js/jquery2.1.4.js"></script>
<script type="text/javascript" src="js/script.js"></script>

<style type="text/css">
a{
	cursor: pointer;
}
/* body{
	background: white;
} */
.banner .banner-box {
	width: 1920px;
	position: absolute;
	top: 0;
	left: 50%;
	margin-left: -960px;
	height: 340px;
}

/* 01 项目保障 */
.safety .item-one, .safety .item-three, .safety .item-five {
	width: 100%;
	margin: 0 auto;
	margin-top: 0px;
	margin-right: auto;
	margin-bottom: 0px;
	margin-left: auto;
}

/*  ===========02 项目保障========= */
.safety .item-two {
	width: 100%;
	height: 510px;
	overflow: hidden;
	background: url(img/item4.jpg) top center no-repeat;
}


.safety .item-content2 .center1 {
	width: 955px;
	height: auto;
	margin: 0 auto;
}

/* Css过渡 */
.safety .item-content2 .center1>div {
	/*  overflow: hidden; */
	margin-bottom: 40px;
	transition: .4s;
	-webkit-transition: .4s;
}

.safety .item-content2 .center1>div:hover {
	/* overflow: hidden; */
	margin-bottom: 60px;
}

/*左1*/
.safety .item-two .center1>div.part1>div.left1 {
	background: url(img/j4.png) center center no-repeat;
	background-color: rgba(0, 0, 0, 0.1);
}

.safety .item-two .center1>div.part1>div {
	height: 163px;
}

.safety .item-content2 .center1>div .left1 {
	width: 140px;
	border-radius: 4px 0 0 4px;
	float: left;
}

/*右1*/
.safety .item-two .center1>div.part1>div {
	height: 163px;
}

.safety .item-content2 .center1>div .right1 {
	width: 812px;
	padding-left: 40px;
	background-color: rgba(0, 0, 0, 0.1);
	border-radius: 0 4px 4px 0;
	float: right;
}

/*左2*/
.safety .item-two .center1>div.part2>div.left2 {
	background: url(img/j5.png) center center no-repeat;
	background-color: rgba(0, 0, 0, 0.1);
}

.safety .item-two .center1>div.part2>div {
	height: 163px;
}

.safety .item-content2 .center1>div .left2 {
	width: 140px;
	border-radius: 4px 0 0 4px;
	float: left;
}

/*右2*/
.safety .item-two .center1>div.part2>div {
	height: 163px;
}

.safety .item-content2 .center1>div .right2 {
	width: 812px;
	padding-left: 40px;
	background-color: rgba(0, 0, 0, 0.1);
	border-radius: 0 4px 4px 0;
	float: right;
}

/*===========04 资金保障=============*/
.safety .item-four {
	width: 100%;
	height: 746px;
	overflow: hidden;
	background: url(img/item4.jpg) top center no-repeat;
}

.safety .item-content4 .center2 {
	width: 955px;
	height: auto;
	margin: 0 auto;
}

/* Css过渡 */
.safety .item-content4 .center2>div {
	/* overflow: visible;  */
	margin-bottom: 40px;
	transition: .4s;
	-webkit-transition: .4s;
}

.safety .item-content4 .center2>div:hover {
	/* overflow: hidden; */
	margin-bottom: 60px;
}

/*左1*/
.safety .item-four .center2>div.part1>div.left_1 {
	background: url(img/j1.png) center center no-repeat;
	background-color: rgba(0, 0, 0, 0.1);
}

.safety .item-four .center2>div.part1>div {
	height: 163px;
}

.safety .item-content4 .center2>div .left_1 {
	width: 140px;
	border-radius: 4px 0 0 4px;
	float: left;
}

/*右1*/
.safety .item-four .center2>div.part1>div {
	height: 163px;
}

.safety .item-content4 .center2>div .right_1 {
	width: 812px;
	padding-left: 40px;
	background-color: rgba(0, 0, 0, 0.1);
	border-radius: 0 4px 4px 0;
	float: right;
}

/*左2*/
.safety .item-four .center2>div.part2>div.left_2 {
	background: url(img/j2.png) center center no-repeat;
	background-color: rgba(0, 0, 0, 0.1);
}

.safety .item-four .center2>div.part2>div {
	height: 163px;
}

.safety .item-content4 .center2>div .left_2 {
	width: 140px;
	border-radius: 4px 0 0 4px;
	float: left;
}

/*右2*/
.safety .item-four .center2>div.part2>div {
	height: 163px;
}

.safety .item-content4 .center2>div .right_2 {
	width: 812px;
	padding-left: 40px;
	background-color: rgba(0, 0, 0, 0.1);
	border-radius: 0 4px 4px 0;
	float: right;
}

/*左1*/
.safety .item-four .center2>div.part1>div.left_1 {
	background: url(img/j1.png) center center no-repeat;
	background-color: rgba(0, 0, 0, 0.1);
}

.safety .item-four .center2>div.part1>div {
	height: 163px;
}

.safety .item-content4 .center2>div .left_1 {
	width: 140px;
	border-radius: 4px 0 0 4px;
	float: left;
}

/*右1*/
.safety .item-four .center2>div.part1>div {
	height: 163px;
}

.safety .item-content4 .center2>div .right_1 {
	width: 812px;
	padding-left: 40px;
	background-color: rgba(0, 0, 0, 0.1);
	border-radius: 0 4px 4px 0;
	float: right;
}

/*左2*/
.safety .item-four .center2>div.part2>div.left_2 {
	background: url(img/j2.png) center center no-repeat;
	background-color: rgba(0, 0, 0, 0.1);
}

.safety .item-four .center2>div.part2>div {
	height: 163px;
}

.safety .item-content4 .center2>div .left_2 {
	width: 140px;
	border-radius: 4px 0 0 4px;
	float: left;
}

/*右2*/
.safety .item-four .center2>div.part2>div {
	height: 163px;
}

.safety .item-content4 .center2>div .right_2 {
	width: 812px;
	padding-left: 40px;
	background-color: rgba(0, 0, 0, 0.1);
	border-radius: 0 4px 4px 0;
	float: right;
}

/*左3*/
.safety .item-four .center2>div.part3>div.left_3 {
	background: url(img/j3.png) center center no-repeat;
	background-color: rgba(0, 0, 0, 0.1);
}

.safety .item-four .center2>div.part3>div {
	height: 163px;
}

.safety .item-content4 .center2>div .left_3 {
	width: 140px;
	border-radius: 4px 0 0 4px;
	float: left;
}

/*右3*/
.safety .item-four .center2>div.part3>div {
	height: 163px;
}

.safety .item-content4 .center2>div .right_3 {
	width: 812px;
	padding-left: 40px;
	background-color: rgba(0, 0, 0, 0.1);
	border-radius: 0 4px 4px 0;
	float: right;
}

/*=========== 05 技术保障 =============*/
/* .safety .item-content5{
	
} */

/*=========== 06 法律保障 =============*/
.safety .item-six {
	width: 100%;
	height: 446px;
	overflow: hidden;
	background: url(img/item4.jpg) top center no-repeat;
}

.safety .item-content6 .center3 {
	width: 955px;
	height: auto;
	margin: 0 auto;
}

/* Css过渡 */
.safety .item-content6 .center3>div {
	/* overflow: visible;  */
	margin-bottom: 40px;
	transition: .4s;
	-webkit-transition: .4s;
}

.safety .item-content6 .center3>div:hover {
	/* overflow: hidden; */
	margin-bottom: 60px;
}

/*左*/
.safety .item-six .center3>div.part>div.left {
	background: url(img/j3.png) center center no-repeat;
	background-color: rgba(0, 0, 0, 0.1);
}

.safety .item-six .center3>div.part>div {
	height: 200px;
}

.safety .item-content6 .center3>div .left {
	width: 200px;
	border-radius: 4px 0 0 4px;
	float: left;
}

/*右*/
.safety .item-six .center3>div.part>div {
	height: 200px;
}

.safety .item-content6 .center3>div .right {
	width: 750px;
	padding-left: 40px;
	background-color: rgba(0, 0, 0, 0.1);
	border-radius: 0 4px 4px 0;
	float: right;
}

/*  */
.safety .item-seven {
	height: 150px;
	background: #dbdbdb;
}
</style>

	<style type="text/css">
		a:focus{text-decoration: none}
		a:focus{outline:none;}
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

	<div class="container-fluid" style="background: white;">
		<div class="banner">
			<div class="banner_t">
				<img src="img/item1.jpg" style="width: 103%; height: 340px;margin-top: 82px;margin-left: -15px;">
			</div>
		</div>

		<div class="safety">
			<div class="item-one">
				<div class="item-title1" style="margin-top: 50px;">
					<h3 align="center">⊱⊱⊱⊱⊱⊱ 01 项目保障 ⊰⊰⊰⊰⊰⊰</h3>

				</div>
				<div class="item-content1" style="margin-top: 50px;">
					<h1 class="title" align="center">所有金字塔上线项目，必须经过五级过滤！</h1>
					<img class="img" src="img/item2.png"
						style="width: 100%; height: auto;" />
				</div>
			</div>

			<div class="item-two">
				<div class="wrap1">
					<div class="item-title2" style="margin-top: 40px;">
						<h3 class="title" align="center" style="color: white">⊱⊱⊱⊱⊱⊱ 02 项目保障 ⊰⊰⊰⊰⊰⊰</h3>
					</div>
					<div style="margin-top: 30px;">
						<h5 class="text" align="center" style="color: white">供应链金融：基于城投集团供应链上下游的采购贸易，为采购方或项目方提供融资，融资方以应收账款质押、保证金担保、第三方机构担保等形式为借款提供担保</h5>
					</div>
					<br />
					<div class="item-content2">
						<div class="center1">
							<div class="part1">
								<div class="left1"></div>
								<div class="right1">
									<h2 class="top1" style="color: white">国资</h2>
									<h5 class="bottom1" style="color: white">作为一家国资参股互联网金融平台，依托城投集团在本土的优势地位及多年的行业沉淀，通过业务及第三方的市场信息交互对接，对借款项目方的信息流、资金流、现金流拥有更全面的掌握，能够建立包含多个关键指标的风险预警机制，从而具备提高风控效果的实质价值。</h5>
								</div>
							</div>
							<div class="part2">
								<div class="left2"></div>
								<div class="right2">
									<h2 class="top2" style="color: white">金融</h2>
									<h5 class="bottom2" style="color: white">借助赣州盛汇资产管理公司产业投资、资产收处风控体系，以严谨专业的风控模型，通过严密的审核流程和严格的审核标准，对借款项目进行层层把关。</h5>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="item-three">
				<div class="item-title3" style="margin-top: 60px;">
					<h3 align="center">⊱⊱⊱⊱⊱⊱ 03 风控流程 ⊰⊰⊰⊰⊰⊰</h3>
				</div>
				<div class="item-content3" align="center" style="margin-top: 50px;">
					<img class="img" src="img/item3.png" />
				</div>
			</div>

			<div class="item-four" style="margin-top: 70px;">
				<div class="wrap2">
					<div class="item-title4">
						<br />
						<h3 class="title" align="center" style="color: white">⊱⊱⊱⊱⊱⊱ 04 资金保障 ⊰⊰⊰⊰⊰⊰</h3>
					</div>
					<div style="margin-top: 30px;">
						<h5 class="text" align="center" style="color: white">金字塔作为金融信息服务平台，绝不触碰投资人的资金！</h5>
					</div>
					<br />
					<div class="item-content4" style="margin-top: 50px;">
						<div class="center2">
							<div class="part1">
								<div class="left_1"></div>
								<div class="right_1">
									<h2 class="top" style="color: white">易支付（第三方支付托管）</h2>
									<h5 class="bottom" style="color: white">金字塔作为纯中介性质的互联网金融平台，绝不触碰投资人的资金。为了保证投资资金与平台完全隔离，金字塔与易支付合作，实现合规化资金托管，确保您的资金来去清晰、来去自由。</h5>
								</div>
							</div>

							<div class="part2">
								<div class="left_2"></div>
								<div class="right_2">
									<h2 class="top" style="color: white">身份认证体系</h2>
									<h5 class="bottom" style="color: white">金字塔建立手机认证、实名认证、银行卡认证等全方位认证体系，资金只能转出到本人实名认证及绑定的银行账户。</h5>
								</div>
							</div>

							<div class="part3">
								<div class="left_3"></div>
								<div class="right_3">
									<h2 class="top" style="color: white">资金账户查询</h2>
									<h5 class="bottom" style="color: white">投资人可实时查看资金账户的详情。</h5>
								</div>
							</div>

						</div>
					</div>
				</div>
			</div>

			<div class="item-five">
				<div class="item-title5" style="margin-top: 60px;">
					<h3 align="center">⊱⊱⊱⊱⊱⊱ 05 技术保障 ⊰⊰⊰⊰⊰⊰</h3>
				</div>

				<div class="item-content5" style="margin-top: 50px;margin-left: 160px;">
					<div class="row1">
						<div class="col-xs-9 col-xs-push-2">
							<h2 class="top">网络安全</h2>
							<h5 class="bottom">投资人可实时查看资金账户的详情。</h5>
						</div>
						<div class="col-xs-2 col-xs-pull-9">
							<img alt="img1" src="img/h1.png" style="margin-top: 10px;margin-left: 0px;">
						</div>
					</div>

					<div class="row2">
						<div class="col-xs-9 col-xs-push-2">
							<h2 class="top">数据安全</h2>
							<h5 class="bottom">使用阿里云服务，实时同步系统在云端的容灾备份点，每份数据具有多个副本，对于SQL注入攻击采用了严格的防范措施，确保用户信息的安全性和完整性。</h5>
						</div>
						<div class="col-xs-2 col-xs-pull-9">
							<img alt="img2" src="img/h2.png" style="margin-top: 25px;margin-left: 5px;">
						</div>
					</div>

					<div class="row3">
						<div class="col-xs-9 col-xs-push-2">
							<h2 class="top">加密验证</h2>
							<h5 class="bottom">数据库采用多重备份及恢复机制，提供专业的数据优化。防止数据被恶意修改，系统自动验证备份数据的可用性、完整性，确保系统历史数据的永久保存和绝对安全。</h5>
						</div>
						<div class="col-xs-2 col-xs-pull-9">
							<img alt="img3" src="img/h3.png" style="margin-top: 15px;margin-left: 0px;">
						</div>
					</div>

					<div class="row4">
						<div class="col-xs-9 col-xs-push-2">
							<h2 class="top">内控管理</h2>
							<h5 class="bottom">已有完善的内部管理机制和加密系统，从而确保工作人员不能在任何场合和任何时间下擅自披露、修改、删除系统的相关数据。严格遵守国家相关的法律法规，对用户的隐私信息进行保护。未经用户的同意，我们不会向任何第三方公司、组织和个人披露用户的个人信息、账户信息以及交易信息（法律法规另有规定除外）。</h5>
						</div>
						<div class="col-xs-2 col-xs-pull-9">
							<img alt="img4" src="img/h4.png" style="margin-top: 15px;margin-left: 0px;">
						</div>
					</div>

				</div>
			</div>

			<div style="margin-top: 70px;"></div>			

			<div class="item-six">
				<div class="wrap3" style="margin-top: 50px;">
					<div class="item-title6">
						<h3 class="title" align="center" style="color: white">⊱⊱⊱⊱⊱⊱ 06 法律保障 ⊰⊰⊰⊰⊰⊰</h3>
					</div>

					<div style="margin-top: 30px;">
						<h5 class="text" align="center" style="color: white">金字塔是依法设立的网络借贷中介平台，为借贷双方提供信息撮合服务，属民间借贷范畴，受合同法、民法通则等法律法规及最高人民法院相关司法解释规范。</h5>
					</div>
					<br /> <br />

					<div class="item-content6">
						<div class="center3">
							<div class="part">
								<div class="left"></div>
								<div class="right">
									<h2 class="top" style="color: white">相关法律法规</h2>
									<h5 class="bottom" style="color: white">
										· 关于网络借贷合法性<br>· 关于投资人及借款人双方民间借贷的合法性<br>·
										关于金字塔提供撮合服务的合法性<br>· 关于电子合同的有效性<br>· 金字塔法律顾问
									</h5>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div style="margin-top: 70px;"></div>
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





</body>

</html>