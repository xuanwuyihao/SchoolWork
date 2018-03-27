<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>

<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>金字塔 - 综合金融服务平台</title>
<base href="<%=path%>/">
<!-- 引入页面Logo小图标 -->
<link rel="icon" href="img/Logo.png" type="image/x-icon">
<link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css"
	rel="stylesheet">
<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap.js"></script>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/xSlider.js"></script>
<script type="text/javascript" src="js/jquery2.1.4.js"></script>
<link rel="stylesheet" href="css/style.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/zzsc.css" />
<script type="text/javascript" src="js/zzsc.js"></script>

<link rel="stylesheet" type="text/css" href="css/zhuce_extend.css" />


<link href="css/icons.css" rel="stylesheet" type="text/css" />

<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />

<link href="css/responsive.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" href="css/base.css">
<link rel="stylesheet" href="css/component.css">
<link rel="stylesheet" href="css/default.css">

<!-- 百分比长条样式 -->
<link rel="stylesheet" type="text/css" href="css/cs1.css" />

	<style type="text/css">
		a:focus{text-decoration: none}
		a:focus{outline:none;}
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
		</div>
<!--
            	作者：383942470@qq.com
            	时间：2017-11-10
            	描述：锚点
            -->
			<div style="position: absolute;">
				<div class="bottom_tools">
					<div class="qr_tool">二维码</div>
					<a id="feedback" href="front/idea" title="意见反馈">意见反馈</a>
					<a id="scrollUp" href="javascript:;" title="飞回顶部"></a>
					<img class="qr_img" src="images/qr_img.png">
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
        	时间：2017-11-10
        	描述：轮播图
        -->

	<div style="margin-top:60px;">
		<div id="myCarousel" class="carousel slide">
			<!-- 设置轮播图片顺序 -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
				<li data-target="#myCarousel" data-slide-to="3"></li>
				<li data-target="#myCarousel" data-slide-to="4"></li>
			</ol>
			<!-- 设置轮播图片 -->
			<div class="carousel-inner">
				<c:set var="i" value="1"></c:set>
				<c:forEach items="${photos }" var="p">
					<c:choose>
						<c:when test="${i==1 }">
							<div class="item active">
								<img alt="" src="${p.photo }" style="width: 100%; height: 450px">
							</div>
						</c:when>
						<c:otherwise>
							<div class="item">
								<img alt="" src="${p.photo }" style="width: 100%; height: 450px">
							</div>
						</c:otherwise>
					</c:choose>
					<c:set var="i" value="${i+1 }"></c:set>
				</c:forEach>
			</div>

		</div>

	</div>

	<script type="text/javascript">
		$("#myCarousel").carousel('cycle');
	</script>

	
	<div class="abs tdw-reg" style="border-radius: 10px;">
		<c:if test="${empty user }">
<%-- 		<shiro:guest> --%>
			<!-- 未登录 -->
			<div class="tdw-reg-unlogin" style="display: block">
				<div class="text-1 fz12 text-666">
					<strong class="fz24 text-orange mr5 n">${inve }</strong> 聪明投资者选择
				</div>
				<div class="text-1 fz12 text-666">
					<strong class="fz24 text-orange mr5 n">12.00%</strong> 预期最高年化收益
				</div>
				<div class="text-guarantee">
					<a href="javascript:;"> <span
						class="tdw-icons i-guarantee text-orange">10亿</span> 注册资金
					</a> <a href="javascript:;"> <span
						class="tdw-icons i-guarantee text-orange">18亿</span> 新轮融资
					</a> <a href="javascript:;"> <span
						class="tdw-icons i-guarantee text-orange">1亿+</span> 第三方担保
					</a>
				</div>
				<a class="tdw-reg-btn" rel="nofollow" href="user/openRegister">还没账号，前往注册</a>
				<div class="tc mt10">
					<a class="fz14 text-999" rel="nofollow" href="user/openLogin">立即登录</a>
				</div>
			</div>
<%-- 		</shiro:guest> --%>
		</c:if>
		<c:if test="${!empty user }">
<%-- 		<shiro:user> --%>
			<!-- 已登录 -->
			<div style="width:100%;margin-top:10px;">
			<div style="float:left;width:40%">
			<img alt="mmp" src="img/Logo.png" width="100px" height="80px">
			</div>
			<div style="float:right;width:70%;margin-top:15px;margin-right:-40px;font-size:16px;">
			<p style="color:#999;">${user.phone }</p>
			<p>欢迎来到金字塔</p>
			</div>
			</div>
				<div class="tdw-reg-unlogin" style="display: block;margin-top:55px;">
				<div class="text-1 fz12 text-666">
					<strong class="fz24 text-orange mr5 n">&nbsp;</strong> 
				</div>
				<div class="text-1 fz12 text-666">
				</div>
				<div class="text-guarantee">
					<a href="javascript:;"> <span
						class="tdw-icons i-guarantee text-orange">10亿</span> 注册资金
					</a> <a href="javascript:;"> <span
						class="tdw-icons i-guarantee text-orange">18亿</span> 新轮融资
					</a> <a href="javascript:;"> <span
						class="tdw-icons i-guarantee text-orange">1亿+</span> 第三方担保
					</a>
				</div>
				<div class="text-1 fz12 text-666">
				</div>
				<a class="tdw-reg-btn" rel="nofollow" href="front/user/PersonalCenter" style="margin-top: -20px;">进入我的账户</a>
				
			</div>
<%-- 		</shiro:user> --%>
		</c:if>
	</div>
		<!--
        	作者：383942470@qq.com
        	时间：2017-11-11
        	描述：平台公告
        -->
			<div class="gonggao">
				<div class="apple" style="float: left;">
					<div style="float: left;"><img src="images/speaker.png" class="img-1" /></div>
					<ul style="list-style-type: none;">
					<c:forEach items="${list}" var="list">
						<li>
							<a href="front/gonggaoxinxi/${list.id }" target="_blank"><span class="sp1">平台公告  &nbsp;&nbsp;丨&nbsp;&nbsp;</span>
							<span class="sp2">${list.title } </span>    
							(<fmt:formatDate value="${list.time }" pattern="yyyy-MM-dd"/> )</a>
						</li>
					</c:forEach>
				</ul>
				
			</div>
			<div style="float:right;margin-top:-40px;margin-right:40px;font-size:15px;">
				<a href="front/rongyu" >
				<span>
					<img src="images/f78.png"  width=30px height=30px/>
					投资、推荐排行榜</span>
				</a>
			</div>
		</div>
	<script type="text/javascript">
			function autoScroll(obj) {
				$(obj).find("ul").animate({
					marginTop: "-39px"
				}, 500, function() {
					$(this).css({
						marginTop: "0px"
					}).find("li:first").appendTo(this);
				})
			}
			$(function() {
				setInterval('autoScroll(".maquee")', 3000);
				setInterval('autoScroll(".apple")', 2000);

			})
		</script>
	<!--
        	作者：383942470@qq.com
        	时间：2017-11-11
        	描述：平台简介
       -->
	<div class="div-jianjie">
		<div class="jianjie">

			<div style="flex: 1; margin-top: 2.2%;">
				<span style="font-size: 16px; color: #a1a1a1;">金字塔高收益网络借贷信息中介平台</span>
			</div>
			<div style="flex: 1; margin-top: 1%;">
				<span style="font-size: 16px; color: #a1a1a1;">累计投资金额：</span> <span
					style="font-size: 26px; color: #eb2a2b;" class="value"></span>
					 <span style="font-size: 14px; color: #eb2a2b;">元</span>
			</div>
			<div style="flex: 1; margin-top: 1%;">
				<span style="font-size: 16px; color: #a1a1a1;">累计注册用户数：</span> <span
					style="font-size: 26px; color: #eb2a2b;" class="value1"></span> <span
					style="font-size: 14px; color: #eb2a2b;">人</span>
			</div>
			<input type="hidden" id="je" value="${countMoney }"/>
			<input type="hidden" id="rs" value="${zcCount }"/>
			
		</div>
		<!--
        	作者：383942470@qq.com
        	时间：2017-11-11
        	描述：平台简介图标
       -->
		<div class="container-fluid">
			<div class="row-fluid div-jianjie-center">
				<div class="span3" style="flex: 1;">
					<a href="front/our/1">
						<div style="display: flex; justify-content: center;">
							<img alt="140x140" src="img/t1.png" class="img-rounded"
								style="width: 100px; height: 100px; margin: 40px;" /> <span>
								<p style="margin-left: -60px; margin-top: 50px; font-size: 20px; color: black;">实力雄厚</p>
								<p style="color: #a1a1a1; margin-left: -25px;">国资背景,抱柱之信</p>
								<p style="color: #a1a1a1;">赣州城投旗下参股企业</p>
							</span>
						</div>
					</a>
				</div>
				<div class="span3" style="flex: 1;">
					<a href="front/anquan">
						<div style="display: flex; justify-content: center;">
							<img alt="140x140" src="img/t2.png" class="img-rounded"
								style="width: 100px; height: 100px; margin: 40px;" /> <span>
								<p style="margin-left: -70px; margin-top: 50px; font-size: 20px; color: black;">安全稳健</p>
								<p style="color: #a1a1a1; margin-left: 5px;">专注城投供应链金融服务</p>
								<p style="color: #a1a1a1;">银行级风控措施+大数据</p>
							</span>
						</div>
					</a>
				</div>

				<div class="span3" style="flex: 1;">
					<a href="front/calculator">
					<div style="display: flex; justify-content: center;">
					 <img alt="140x140" src="img/t4.png"
						class="img-rounded"
						style="width: 100px; height: 100px; margin: 40px;" />
						 <span>
								<p style=" margin-top: 50px; font-size: 20px; color: black;">高效灵活</p>
								<p style="color: #a1a1a1; margin-left: 5px;">持有15天可转</p>
								<p style="color: #a1a1a1;margin-left: -10px;">长期变活期</p>
						</span>
						</div>
					</a>
				</div>
			</div>

		</div>
	</div>
	<script src="js/jquery-1.8.3.min.js"></script>
	<!-- BASIC JQUERY 1.8.3 LIB. JS -->
	<script src="js/count.js"></script>
		<script> 
			$(".value").numberRock({
				speed: 20,
				count: $("#je").val()
			})
			$(".value1").numberRock({
				speed: 20,
				count: $("#rs").val()
			})
		</script>

	<!--
        	作者：383942470@qq.com
        	时间：2017-11-12
        	描述：抵押标
        -->
	<div class="xinshou-title1">
		<div style="float: left">
			<span style="font-size: 28px; color: #000000;">抵押标</span>&nbsp;&nbsp;<span
				style="color: #999;">新手特享&nbsp;先到先得</span>
		</div>
		<div style="float: right; margin-top: 1%;">
			<span style="color: #999;"><a href="front/touzi?lendtime=0&rate=0&type=1&cont=1" style="color: #a1a1a1;">查看更多</a></span>
		</div>
	</div>
	<!--
            	作者：383942470@qq.com
            	时间：2017-11-13
            	描述：抵押标内容
            -->
	<section>
	<div class="container" style="width: 93%; margin-right: 65px;">
		<div class="row">
			<div style="">
				<c:forEach items="${dylist}" var="dylist">
					<div class="col-md-3 col-sm-6">
						<div class="xinshou-content1 col-xs-12">

							<div style="margin-top: 27px; font-size: 20px; color: #000000;">
								<center>${dylist.title }</center>
							</div>
							<div style="margin-top: 8px; font-size: 12px;">
								<center>
									<span
										style="margin: 1px; border: 1px solid #ffb700; color: #ff7800;">限投3次，累计限额3万</span>
								</center>
							</div>
							<div style="margin-top: 18px; font-size: 12px; color: #ff7800;">
								<center>
									<span style="font-size: 45px; color: #ff7800;">${dylist.rate }</span>%
								</center>
							</div>
							<div style="margin-top: 3px; font-size: 12px; color: #a1a1a1;">
								<center>预期年化率利</center>
							</div>
							<div style="margin-top: 25px; font-size: 20px;">
								<center>
									<span class="pro-bg rel">
			                            <span class="pro-live abs" style="width:${dylist.stay1 };"></span>
			                        </span>&nbsp;<font size="3">${dylist.stay1 }</font>
								</center>
							</div>
							<div style="margin-top: 10px; font-size: 12px;">
								<center>
									<font style="color: #a1a1a1;">期限：</font><font
										style="color: #000000">${dylist.lendtime }个月</font><font
										style="margin-left: 40px; color: #a1a1a1;">剩余：</font><font
										style="color: #000000;">${dylist.have_cast }元</font>
								</center>
							</div>
							<a href="front/biaodixinxi/${dylist.id }" target="_blank"> 
								<c:if test="${dylist.status =='招标中'}">
									<div class="mt38 tdw-btn-lg"
										style="margin-top: 26px; margin-left: 50px; margin-right: 55px; font-size: 18px;">
										<span rel="nofollow" class="btn-text" href="javascript:;"
											target="_blank">马上加入</span>
									</div>
								</c:if> 
								<c:if test="${dylist.status =='满标'}">
									<div class="mt38 tdw-btn-gray-lg"
										style="margin-top: 26px; margin-left: 50px; margin-right: 55px; font-size: 18px;">
										<span style="color: #a1a1a1;" rel="nofollow" class="btn-text"
											href="javascript:;" target="_blank">已满额</span>
									</div>
								</c:if> 
							</a>
						</div>
					</div>
				</c:forEach>

			</div>
		</div>
	</div>
	</section> <!--
        	作者：383942470@qq.com
        	时间：2017-11-12
        	描述：信用标
        -->
	<div class="xinshou-title1">
		<div style="float: left">
			<span style="font-size: 28px; color: #000000;">信用标</span>&nbsp;&nbsp;<span
				style="color: #999;">该业务由正合普惠金融提供，精准解决资金难题</span>
		</div>
		<div style="float: right; margin-top: 1%;">
			<span style="color: #999;"><a href="front/touzi?lendtime=0&rate=0&type=2&cont=1" style="color: #a1a1a1;">查看更多</a></span>
		</div>
	</div>
	<!--
            	作者：383942470@qq.com
            	时间：2017-11-13
            	描述：信用标内容
            --> <section>
	<div class="container" style="width: 93%; margin-right: 65px;">
		<div class="row">
			<div style="">
				<c:forEach items="${xylist}" var="xylist">
					<div class="col-md-3 col-sm-6">
						<div class="xinshou-content1 col-xs-12">

							<div style="margin-top: 27px; font-size: 20px; color: #000000;">
								<center>${xylist.title }</center>
							</div>
							<div style="margin-top: 8px; font-size: 12px;">
								<center>
									<span
										style="margin: 1px; border: 1px solid #ffb700; color: #ff7800;">1个月后可退出</span>
								</center>
							</div>
							<div style="margin-top: 18px; font-size: 12px; color: #ff7800;">
								<center>
									<span style="font-size: 45px; color: #ff7800;">${xylist.rate }</span>%
								</center>
							</div>
							<div style="margin-top: 3px; font-size: 12px; color: #a1a1a1;">
								<center>预期年化率利</center>
							</div>
							<div style="margin-top: 25px; font-size: 20px;">
								<center>
									<span class="pro-bg rel">
			                            <span class="pro-live abs" style="width:${xylist.stay1 };"></span>
			                        </span>&nbsp;<font size="3">${xylist.stay1 }</font>
								</center>
							</div>
							<div style="margin-top: 10px; font-size: 12px;">
								<center>
									<font style="color: #a1a1a1;">期限：</font><font
										style="color: #000000">${xylist.lendtime }个月</font><font
										style="margin-left: 40px; color: #a1a1a1;">剩余：</font><font
										style="color: #000000;">${xylist.have_cast }元</font>
								</center>
							</div>
							<a href="front/biaodixinxi/${xylist.id }" target="_blank"> <c:if
									test="${xylist.status =='招标中'}">
									<div class="mt38 tdw-btn-lg"
										style="margin-top: 26px; margin-left: 50px; margin-right: 55px; font-size: 18px;">
										<span rel="nofollow" class="btn-text" href="javascript:;"
											target="_blank">马上加入</span>
									</div>
								</c:if> <c:if test="${xylist.status =='满标'}">
									<div class="mt38 tdw-btn-gray-lg"
										style="margin-top: 26px; margin-left: 50px; margin-right: 55px; font-size: 18px;">
										<span style="color: #a1a1a1;" rel="nofollow" class="btn-text"
											href="javascript:;" target="_blank">已满额</span>
									</div>
								</c:if> <%-- 	            				<div style="margin-top: 27px;font-size: 20px;color: #000000;"><center>信用标1</center></div> --%>
								<%-- 	            				<div style="margin-top: 8px;font-size: 12px;"><center><span style="margin:1px;border:1px solid #ffb700;">1个月后可退出</span></center></div> --%>
								<%-- 	            				<div style="margin-top: 18px;font-size: 12px;color: #ff7800;"><center><span style="font-size: 45px;color: #ff7800;">12.6</span>%</center></div> --%>
								<%-- 	            				<div style="margin-top: 3px;font-size: 12px;color: #a1a1a1;"><center>预期年化率利</center></div> --%>
								<%-- 	            				<div style="margin-top: 25px;font-size: 20px;"><center><hr style="height: 2px;margin-left: 40px;margin-right: 40px;border-top:3px solid  #ffb700;"/></center></div> --%>
								<%-- 	            				<div style="margin-top: 10px;font-size: 12px;"><center><font style="color: #a1a1a1;">期限：</font><font style="color: #000000">6个月</font><font style="margin-left:40px;color: #a1a1a1;">剩余：</font><font style="color: #000000;">10万</font></center></div> --%>
								<%-- 	            				<div class="mt38 tdw-btn-lg" style="margin-top: 26px;margin-left: 50px;margin-right: 55px;font-size: 20px;"><span rel="nofollow" class="btn-text" href="javascript:;" target="_blank">马上加入</span></div> --%>
							</a>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>
	</section>

	<div class="container-fluid" style="width: 96%;">
		<div class="col-md-6 col-sm-6">
			<div style="width: 100%; height: 50px;">
				<div style="float: left;">
					<span style="font-size: 28px; color: #000000;">政府关怀</span>
				</div>
				<div style="float: right; margin-top: 20px;">
					<span><a href="front/our/3"
						style="text-decoration: none; color: #aaa;">查看更多</a></span>
				</div>
			</div>
			<div
				style="width: 100%; height: 300px; background: white; border-radius: 10px;">
				<div class="tdw-news-box">
					<dl>
						<dt class="l">
							<a rel="nofollow" href="javascript:;" target="_blank"><img
								src="https://infoimage.tuandai.com/ad/1511317339525.jpg?2017-11-22T10:25:11"
								alt="赣州市市人大常委会副主任廖成铭一行到访金字塔"></a>
						</dt>
						<dd class="l">
							<a class="fz20 text-333" rel="nofollow" href="javascript:;"
								target="_blank">赣州市市人大常委会副主任廖成铭一行到访金字塔</a> <span
								class="news-date">2017-11-22</span>
						</dd>
					</dl>

					<ul class="tdw-news-list">

						<li><i class="new-circle-type"></i><a rel="nofollow"
							href="javascript:;" style="color: #a1a1a1;"
							title="赣州市副市长何福洲一行莅临金字塔集团总部参观交流" target="_blank">赣州市副市长何福洲一行莅临金字塔集团总部参观交流</a><span
							class="news-date">2017-11-03</span></li>

						<li><i class="new-circle-type"></i><a rel="nofollow"
							href="javascript:;" style="color: #a1a1a1;"
							title="赣州经济技术开发区社会组织党工委书记刘昌平一行莅临金字塔调研" target="_blank">赣州经济技术开发区社会组织党工委书记刘昌平一行莅临金字塔调研</a><span
							class="news-date">2017-02-28</span></li>

						<li><i class="new-circle-type"></i><a rel="nofollow"
							href="javascript:;" style="color: #a1a1a1;"
							title="民进赣州市委会秘书长杨刚一行莅临金字塔调研" target="_blank">民进赣州市委会秘书长杨刚一行莅临金字塔调研</a><span
							class="news-date">2017-03-08</span></li>

					</ul>
				</div>
			</div>
		</div>

		<div class="col-md-6 col-sm-6">
			<div style="width: 100%; height: 50px;">
				<div style="float: left;">
					<span style="font-size: 28px; color: #000000;">媒体报道</span>
				</div>
				<div style="float: right; margin-top: 20px;">
					<span><a href="front/our/3" 
						style="text-decoration: none; color: #aaa;">查看更多</a></span>
				</div>
			</div>
			<div
				style="width: 100%; height: 300px; background: white; border-radius: 10px;">
				<div class="tdw-news-box">
					<dl>
						<dt class="l">
							<a rel="nofollow" href="javascript:;" target="_blank"><img
								src="https://infoimage.tuandai.com/ad/1511314504968.jpg?2017-11-22T09:35:06"
								alt="派生集团捐款2000万元帮助孤残儿童"></a>
						</dt>
						<dd class="l">
							<a rel="nofollow" class="fz20 text-333" href="javascript:;"
								target="_blank">金字塔集团捐款2000万元帮助孤残儿童</a> <span class="news-date">2017-11-22</span>
						</dd>
					</dl>

					<ul class="tdw-news-list">

						<li><i class="new-circle-type"></i><a rel="nofollow"
							href="javascript:;" style="color: #a1a1a1;" target="_blank">关爱&quot;城市美容师&quot;
								金字塔助力2017赣州环卫工人运动会</a><span class="news-date">2017-11-14</span></li>

						<li><i class="new-circle-type"></i><a rel="nofollow"
							href="javascript:;" style="color: #a1a1a1;" target="_blank">文明城市•携手同行
								赣州第一届志愿者大型公益徒步活动隆重举行</a><span class="news-date">2017-11-14</span></li>

						<li><i class="new-circle-type"></i><a rel="nofollow"
							href="javascript:;" style="color: #a1a1a1;" target="_blank">金字塔助推电商发展当选赣州开发区电子商务协会副会长单位</a><span
							class="news-date">2017-11-07</span></li>

					</ul>
				</div>
			</div>
		</div>
	</div>
	</section> <!--
        	作者：383942470@qq.com
        	时间：2017-11-15
        	描述：合作伙伴
        -->
	<div class="hezuo">
		<ul class="cooperation-ul" >
			<li class="cooperation-li"><a href="https://www.pycredit.cn/" target="_blank"><img
					src="cooperation/0569cd60-e3eb-465d-9b29-f64c641fdcdb.jpg"
					class="cooperation-img" /></a></li>
			<li class="cooperation-li"><a href="http://www.100credit.com/" target="_blank"><img
				src="cooperation/1cceaf84-5580-4aba-adf6-bc14f85e296c.jpg"
				class="cooperation-img" /></a></li>
			<li class="cooperation-li"><a href="http://www.p2peye.com/" target="_blank"><img
				src="cooperation/434eee56-3534-4a1b-b47e-0d6530a84332.png"
				class="cooperation-img" /></a></li>
			<li class="cooperation-li"><a href="http://www.xmccb.com/" target="_blank"><img
				src="cooperation/442aabf6-f384-4c43-8394-e7b951dc0305.png"
				class="cooperation-img" /></a></li>
			<li class="cooperation-li"><a href="http://www.cebbank.com/" target="_blank"><img src="cooperation/guangda.png"
				class="cooperation-img" /></a></li>
			<li class="cooperation-li"><a href="https://www.tongdun.cn/" target="_blank"><img
				src="cooperation/c51846c0-2aed-4422-98d2-d9d213d74c0d.jpg"
				class="cooperation-img" /></a></li>
			<li class="cooperation-li"><a href="https://www.bestsign.cn/" target="_blank"><img
				src="cooperation/fadada-logo.png" class="cooperation-img" /></a></li>
			<li class="cooperation-li"><a href="http://www.cgbchina.com.cn/" target="_blank"><img src="cooperation/guangfa.png"
				class="cooperation-img" /></a></li>
			<li class="cooperation-li"><a href="http://www.shjyjk.com/" target="_blank"><img src="cooperation/jiayin.png"
				class="cooperation-img" /></a></li>
			<li class="cooperation-li"><a href="http://www.shanghai-cis.com.cn/" target="_blank"><img
				src="cooperation/shanghaizixin.png" class="cooperation-img" /></a></li>
			<li class="cooperation-li"><a href="https://www.tongbanjie.com/" target="_blank"><img src="cooperation/tongban.png"
				class="cooperation-img" /></a></li>
			<li class="cooperation-li"><a href="http://www.wacai.com/" target="_blank"><img src="cooperation/wacai.png"
				class="cooperation-img" /></a></li>
		</ul>
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
									<li><a href="front/shoufeibiaozhun" class="dibu-a">资费介绍</a></li>
								</ul>
							</div>
							<div class="col-md-6">
								<ul class="dibu">
									<li class="dibu-li">安全保障</li>
									<li><a href="front/anquan" class="dibu-a">法律法规</a></li>
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
								<a>
									<span rel="nofollow" class="btn-text" 
											href="javascript:;"target="_blank">
											<img alt="" src="images/8cac943f5c2dd2b1f0487ce3a294ce921.png" width=13px height=13px class="xiaoxi">
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
	<!-- bootstrap js --> <script type="text/javascript"
		src="js/jquery2.1.4.js"></script> <script type="text/javascript"
		src="js/script.js"></script>
</body>
</html>