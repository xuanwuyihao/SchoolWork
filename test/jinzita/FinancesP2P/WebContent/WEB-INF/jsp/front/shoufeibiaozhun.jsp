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
	<title>金字塔 - 综合金融服务平台 - 平台收费标准</title>	
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
	<script type="text/javascript" src="js/example.js"></script>
	
	<link rel="stylesheet" href="css/base.css">

		<!--
	作者：383942470@qq.com
	时间：2017-11-08
	描述：图标
-->
		<link href="css/icons.css" rel="stylesheet" type="text/css" />

		<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />

		<link href="css/responsive.css" rel="stylesheet" type="text/css" />
		
		<link href="css/button.css" rel="stylesheet" type="text/css" />


		<script type="text/javascript" src='js/jquery.js'></script>
		<script type="text/javascript" src='js/head.js'></script>
		<link rel="stylesheet" href="css/footer.css">
		<link href="css/help.css" rel="stylesheet" type="text/css" />
		<link href="css/head.css" rel="stylesheet" type="text/css" />
		
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
<div style="height: 80px;"></div>



<!--放置内容-->
<div class="bgFb pdt20"> 

    <div class="wrap"> 


        <!--右部-->
<div id="_content" class="fl rightPart ml15">
           
            <div id="regularContent">
            <!-- 右部分选项卡循环 -->
			<div class="tabSubNav mt20 clear" id="help_cat_0" > 
				<span class="wd140 current" name="5809d181a52ebb128507e0c6" style="color: #000000;" id="38">投资者收费标准</span>
			<span class="wd140 " name="5809d192a52ebb128507e0c7" style="color: #000000;" id="38">借款者收费标准</span>
			</div>
             </div>
        
            
<div id="_content_child" class="wd723 bgFF bdD9 pd30 clear mgt1">



<div class="bgFb pd20">

	
	<dl id="5809d181a52ebb128507e0c6" class="QA_list">
			<style>td { border:1px solid black; }</style>
			<p><span style="color: #000000;font-size: 14px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">1、通用收费，对所有投资用户的共同收费详细说明</span></p><p><span style="color: #000000;font-size: 14px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;"></span></p><table><tbody><tr class="firstRow"><td style="color: #000000;padding: 0px 7px; border: 1px solid rgb(215, 215, 215);" width="79" valign="center"><p style="color: #000000;text-align:center"><span style="color: #000000;font-size: 14px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">实名认证</span></p></td><td style="color: #000000;padding: 0px 7px; border-style: solid; border-width: 1px; border-right-color: rgb(215, 215, 215); border-top-color: rgb(215, 215, 215); border-bottom-color: rgb(215, 215, 215);" width="707" valign="top"><p><span style="color: #000000;font-size: 14px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;"><br/></span></p><p><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;">身份认证前五次免费。</span><br/></p><p><span style="color: #000000;font-size: 14px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;"><br/></span></p></td></tr><tr><td style="color: #000000;padding: 0px 7px; border-width: 1px; border-left-color: rgb(215, 215, 215); border-right-color: rgb(215, 215, 215); border-style: solid; border-bottom-color: rgb(215, 215, 215);" width="85" valign="center"><p style="color: #000000;text-align:center"><span style="color: #000000;font-size: 14px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">充值</span></p></td><td style="color: #000000;padding: 0px 7px; border-style: solid; border-width: 1px; border-right-color: rgb(215, 215, 215); border-bottom-color: rgb(215, 215, 215);" width="707" valign="top"><p><span style="color: #000000;font-size: 12px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;"><br/></span></p><p><span style="color: #000000;font-size: 14px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">所有用于投资的资金，在充值时都免费</span></p><p><span style="color: #000000;font-size: 12px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;"><br/></span></p></td></tr><tr><td style="color: #000000;padding: 0px 7px; border-width: 1px; border-left-color: rgb(215, 215, 215); border-right-color: rgb(215, 215, 215); border-style: solid; border-bottom-color: rgb(215, 215, 215);" width="85" valign="center"><p style="color: #000000;text-align:center"><span style="color: #000000;font-size: 14px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">提现</span></p></td><td style="color: #000000;padding: 0px 7px; border-style: solid; border-width: 1px; border-right-color: rgb(215, 215, 215); border-bottom-color: rgb(215, 215, 215); word-break: break-all;" width="707" valign="top"><p><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px; white-space: nowrap;">投资成功后提现：</span><br/></p><p style="color: #000000;text-indent: 2em;"><span style="color: #000000;white-space: nowrap; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;">限免额度 = 购买总金额 + 总收益 - 已提现额度（未包括之前已扣除手续费的限免额度）</span></p><p style="color: #000000;text-indent: 2em;"><span style="color: #000000;white-space: nowrap; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;"><br/></span></p><p style="color: #000000;text-indent: 2em;"><strong><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px; white-space: nowrap; text-indent: 2em;">普通提现（T+1）：</span></strong></p><p style="color: #000000;text-indent: 2em;"><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px; white-space: nowrap;">提现金额≤限免额度：免费提现；</span></p><p style="color: #000000;text-indent: 2em;"><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px; white-space: nowrap;">提现金额＞限免额度：未超出限免额度部分，免费提现；</span><span style="color: #000000;text-indent: 2em; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px; white-space: nowrap;">超出限免额度部分，超出提现</span></p><p style="color: #000000;text-indent: 2em;"><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px; white-space: nowrap; text-indent: 2em;">金额的0.2%，最低2元。</span></p><p style="color: #000000;text-indent: 2em;"><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px; white-space: nowrap;"><br/></span></p><p style="color: #000000;text-indent: 2em;"><strong><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px; white-space: nowrap;">快速提现（T+0）：</span></strong></p><p style="color: #000000;text-indent: 2em;"><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px; white-space: nowrap;">提现金额的0.05%，最低1元；</span><br/></p><p><br/><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px; white-space: nowrap;"></span></p></td></tr></tbody></table><p><br/></p><p><br/></p><p><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;">2、产品债权转让收取的费用</span><br/></p><p><strong><span style="color: #000000;font-size: 14px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">一、私人定制债权转让费用：</span></strong><span style="color: #000000;font-size: 14px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">根据债权的还款方式不同，转让费收取方式也不同。</span></p><p><strong><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;">1）还本付息：</span></strong><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;">按照债权剩余天数收取转让费，转让费=转让本金*转让费率* [（已持有期数+当期持有天数/当期天数）/ 12]</span></p><p><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;">转让费率：</span></p><table><tbody><tr class="firstRow"><td width="154" valign="center" style="color: #000000;padding: 0px; border-width: 1px; border-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">剩余天数</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-width: 1px; border-top-color: rgb(231, 230, 230); border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">转让费率</span></p></td></tr><tr><td width="154" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 15px">（</span><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">0,30]</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">0.90%</span></p></td></tr><tr><td width="154" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">（30,60]</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">1.10%</span></p></td></tr><tr><td width="154" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">（60,120]</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">1.50%</span></p></td></tr><tr><td width="154" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">（120,180]</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">1.90%</span></p></td></tr><tr><td width="154" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">（180,240]</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">2.60%</span></p></td></tr><tr><td width="154" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">（240,300]</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">2.90%</span></p></td></tr><tr><td width="154" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">（300,360]</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">3.00%</span></p></td></tr><tr><td width="154" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">（360,450]</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">3.20%</span></p></td></tr><tr><td width="154" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">（450,540]</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">3.60%</span></p></td></tr><tr><td width="154" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">（540,720]</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">3.90%</span></p></td></tr><tr><td width="154" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">（720,900]</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">4.20%</span></p></td></tr><tr><td width="154" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">（900,1080]</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">4.40%</span></p></td></tr><tr><td width="154" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 15px">（1080,~]</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">5.00%</span></p></td></tr></tbody></table><p><strong style="color: #000000;white-space: normal;"><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;">2）等额本金、等额本息：</span></strong><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;">转让费=剩余本金*1.5%</span><br/></p><p><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;"><br/></span></p><p><strong><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;">二、芝麻开花债权转让费用：</span></strong><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;">根据持有时间收取转让费</span></p><p><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;">转让费率：</span></p><p><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; letter-spacing: 0px; font-size: 14px; background: rgb(255, 255, 255);"></span></p><p><span style="color: #000000;font-family: 宋体;letter-spacing: 0;font-size: 15px;background: rgb(255, 255, 255)"></span></p><table><tbody><tr class="firstRow"><td width="156" valign="center" style="color: #000000;padding: 0px; border-width: 1px; border-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">持有时间</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-width: 1px; border-top-color: rgb(231, 230, 230); border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">转让费率</span></p></td></tr><tr><td width="156" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">1个月</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">2.80%</span></p></td></tr><tr><td width="156" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">2个月</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">2.50%</span></p></td></tr><tr><td width="156" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">3个月</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">2.40%</span></p></td></tr><tr><td width="156" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">4个月</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">2.10%</span></p></td></tr><tr><td width="156" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">5个月</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">1.80%</span></p></td></tr><tr><td width="156" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">6个月</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">1.40%</span></p></td></tr><tr><td width="156" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">7个月</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px;background: rgb(255, 255, 255)">1.20%</span></p></td></tr><tr><td width="156" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">8个月</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">1.00%</span></p></td></tr><tr><td width="156" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">9个月</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">0.80%</span></p></td></tr><tr><td width="156" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">10个月</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">0.60%</span></p></td></tr><tr><td width="156" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">11个月</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">0.40%</span></p></td></tr><tr><td width="156" valign="center" style="color: #000000;padding: 0px; border-left-width: 1px; border-left-color: rgb(231, 230, 230); border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">12个月</span></p></td><td width="147" valign="center" style="color: #000000;padding: 0px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(231, 230, 230); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(231, 230, 230);"><p style="color: #000000;margin-top:0;margin-right:0;margin-bottom:0;margin-left:0;text-indent:0;text-align:center"><span style="color: #000000;font-family: 微软雅黑;letter-spacing: 0;font-size: 14px">0.00%</span></p></td></tr></tbody></table><br/><p><br/></p>
	</dl>
	
	<dl id="5809d192a52ebb128507e0c7" class="QA_list" style="color: #000000;display: none;">
			<p class="font12 lineh24"><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;">1、通用费用</span><br/></p><table><tbody><tr style="color: #000000;height:45px" class="firstRow"><td width="56" valign="center" style="color: #000000;padding: 1px; border-width: 1px; border-color: rgb(207, 206, 206); background: rgb(174, 170, 170);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">序列</span></p></td><td width="100" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-width: 1px; border-top-color: rgb(207, 206, 206); border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206); background: rgb(174, 170, 170);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">收费类目</span></p></td><td width="475" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-width: 1px; border-top-color: rgb(207, 206, 206); border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206); background: rgb(174, 170, 170);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">收费明细</span></p></td></tr><tr style="color: #000000;height:45px"><td width="56" valign="center" style="color: #000000;padding: 1px; border-left-width: 1px; border-left-color: rgb(207, 206, 206); border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">1</span></p></td><td width="118" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">实名认证费</span></p></td><td width="475" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">身份认证前五次免费</span></p></td></tr><tr style="color: #000000;height:45px"><td width="56" valign="center" style="color: #000000;padding: 1px; border-left-width: 1px; border-left-color: rgb(207, 206, 206); border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">2</span></p></td><td width="118" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">充值手续费</span></p></td><td width="475" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">暂免</span></p></td></tr><tr style="color: #000000;height:126px"><td width="56" valign="center" style="color: #000000;padding: 1px; border-left-width: 1px; border-left-color: rgb(207, 206, 206); border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">3</span></p></td><td width="118" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">提现手续费</span></p></td><td width="475" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206); word-break: break-all;"><p style="color: #000000;;text-align:justify;text-justify:inter-ideograph;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">提现金额最低3元，提现金额大于等于3元，小于10万，收取提现费用2元。之后以10万为单位，递增2元手续费。比如提现金额大于等于10万，小于20万，收取提现费用4元，以此类推。</span></p></td></tr></tbody></table><p><span style="color: #000000;;font-family:微软雅黑;font-size:14px"><br/></span></p><p><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;">2、借款成交费用</span></p><table width="666"><tbody><tr style="color: #000000;height:53px" class="firstRow"><td width="51" valign="center" rowspan="2" style="color: #000000;padding: 1px; border-width: 1px; border-color: rgb(207, 206, 206); background: rgb(174, 170, 170);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">序目</span></p></td><td width="120" valign="center" rowspan="2" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-width: 1px; border-top-color: rgb(207, 206, 206); border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206); background: rgb(174, 170, 170);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">收费类目</span></p></td><td width="495" valign="center" colspan="3" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-width: 1px; border-top-color: rgb(207, 206, 206); border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206); background: rgb(174, 170, 170);" height="35"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">收费明细</span></p></td></tr><tr style="color: #000000;height:22px"><td width="109" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206); background: rgb(174, 170, 170);" height="34"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">借贷产品</span></p></td><td width="199" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-width: 1px; border-top-color: rgb(207, 206, 206); border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206); background: rgb(174, 170, 170);" height="34"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">首次贷</span></p></td><td width="187" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-width: 1px; border-top-color: rgb(207, 206, 206); border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206); background: rgb(174, 170, 170);" height="34"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">二次贷及以上</span></p></td></tr><tr style="color: #000000;height:44px"><td width="51" valign="center" rowspan="4" style="color: #000000;padding: 1px; border-left-width: 1px; border-left-color: rgb(207, 206, 206); border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">1</span></p></td><td width="120" valign="center" rowspan="4" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">平台成交服务费</span></p></td><td width="109" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">农、商</span></p></td><td width="199" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">成交额 *（3% ~6%）</span></p></td><td width="187" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">成交额 *（ 0%~6%）</span></p></td></tr><tr style="color: #000000;height:19px"><td width="109" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">企</span></p></td><td width="386" valign="center" colspan="2" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">成交额 * 5.5%</span></p></td></tr><tr style="color: #000000;height:22px"><td width="109" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">房</span></p></td><td width="386" valign="center" colspan="2" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:bottom"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">成交额*6%</span></p></td></tr><tr style="color: #000000;height:22px"><td width="109" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">供应链</span></p></td><td width="386" valign="center" colspan="2" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:bottom"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">成交额*（5%-7%）</span></p></td></tr><tr style="color: #000000;height:53px"><td width="51" valign="center" style="color: #000000;padding: 1px; border-left-width: 1px; border-left-color: rgb(207, 206, 206); border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">2</span></p></td><td width="120" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">代扣保险费</span></p></td><td width="495" valign="center" colspan="3" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">信用标（企贷除外），借款成功后，平台代扣保险费；</span><span style="color: #000000;font-family: 微软雅黑;font-size: 14px"><br/></span><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">保险费算法：0.0015/12*借款期数*（借款本金+借款计划利息）；</span></p></td></tr></tbody></table><p><span style="color: #000000;font-family: 微软雅黑; font-size: 14px;"><br/></span></p><p><span style="color: #000000;font-family: 微软雅黑; font-size: 14px;">3、还款费用</span><br/></p><p><span style="color: #000000;;font-family:微软雅黑;font-size:14px">3.1、若您想提前还清本金，缴清本月利息等费用即可；</span> &nbsp;</p><p><span style="color: #000000;;font-family:微软雅黑;font-size:14px">3.2、正常还款和逾期还款费用明细如下：</span></p><p><span style="color: #000000;;font-family:微软雅黑;font-size:14px"></span></p><table width="667"><tbody><tr style="color: #000000;height:22px" class="firstRow"><td width="52" valign="center" style="color: #000000;padding: 1px; border-width: 1px; border-color: rgb(207, 206, 206); background: rgb(174, 170, 170);" height="34"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">序目</span></p></td><td width="138" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-width: 1px; border-top-color: rgb(207, 206, 206); border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206); background: rgb(174, 170, 170);" height="34"><p style="color: #000000;;text-align:center;vertical-align:bottom"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">收费类目</span></p></td><td width="477" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-width: 1px; border-top-color: rgb(207, 206, 206); border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206); background: rgb(174, 170, 170);" height="34"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">收费明细</span></p></td></tr><tr style="color: #000000;height:22px"><td width="52" valign="center" style="color: #000000;padding: 1px; border-left-width: 1px; border-left-color: rgb(207, 206, 206); border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);" height="38"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">1</span></p></td><td width="138" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);" height="38"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">还款代扣费</span></p></td><td width="477" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);" height="38"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">暂免</span></p></td></tr><tr style="color: #000000;height:160px"><td width="52" valign="center" style="color: #000000;padding: 1px; border-left-width: 1px; border-left-color: rgb(207, 206, 206); border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);" height="114"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">2</span></p></td><td width="138" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);" height="114"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">平台逾期催收费或者家访费</span></p></td><td width="477" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);" height="114"><p style="color: #000000;;text-align:justify;text-justify:inter-ideograph;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">如果借入者一旦产生逾期，金字塔将收取最低50元人民币或剩余待还本金的1% 的催收费用。（两者取其中多的。比如借入者需要还款10000元，那么会收取 100元；如果是需要还款1000元，那么收取50元）并以借款期次为单位最多收取3期作为网站电话提醒和催收服务的费用。</span></p></td></tr><tr style="color: #000000;height:284px"><td width="52" valign="center" style="color: #000000;padding: 1px; border-left-width: 1px; border-left-color: rgb(207, 206, 206); border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">3</span></p></td><td width="138" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">逾期利息违约金</span></p></td><td width="477" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);"><p style="color: #000000;;text-align:justify;text-justify:inter-ideograph;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">若您某期还款利息逾期，发生在2017年12月26日之前，则金字塔帮贷出者按原规则收取逾期罚息；</span><span style="color: #000000;font-family: 微软雅黑;font-size: 14px"><br/></span><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">注：逾期罚息=借款人未还全部本金*0.0005*逾期天数；</span><span style="color: #000000;font-family: 微软雅黑;font-size: 14px"><br/></span><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">散标无论利息什么时候逾期，都按以上逾期公式计算；</span><span style="color: #000000;font-family: 微软雅黑;font-size: 14px"><br/></span><span style="color: #000000;font-family: 微软雅黑;font-size: 14px"><br/></span><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">若您某期还款利息逾期，发生在2017年12月26日之后，则金字塔帮贷出者收取逾期利息违约金；</span><span style="color: #000000;font-family: 微软雅黑;font-size: 14px"><br/></span><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">注：逾期利息违约金=逾期利息*逾期天数*0.05%；</span></p></td></tr><tr style="color: #000000;height:286px"><td width="52" valign="center" style="color: #000000;padding: 1px; border-left-width: 1px; border-left-color: rgb(207, 206, 206); border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);" height="242"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">4</span></p></td><td width="138" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);" height="242"><p style="color: #000000;;text-align:center;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">逾期本金违约金</span></p></td><td width="477" valign="center" style="color: #000000;padding: 1px; border-left-style: none; border-right-width: 1px; border-right-color: rgb(207, 206, 206); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(207, 206, 206);" height="242"><p style="color: #000000;;text-align:justify;text-justify:inter-ideograph;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">若您最后一期还款逾期，发生在2017年12月26日之前，则金字塔帮贷出者按原规则收取逾期超息；</span><span style="color: #000000;font-family: 微软雅黑;font-size: 14px"><br/></span><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">注：逾期超息=借款人未还全部本金*天息（年利率/365或366天）*逾期天数；</span><span style="color: #000000;font-family: 微软雅黑;font-size: 14px"><br/></span><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">散标无论本金什么时候逾期，都按以上逾期公式计算；</span></p><p style="color: #000000;;text-align:justify;text-justify:inter-ideograph;vertical-align:middle"><span style="color: #000000;font-family: 微软雅黑;font-size: 14px"><br/></span><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">若您某期还款本金逾期，发生在2017年12月26日之后，则金字塔帮贷出者收取逾期本金违约金；</span><span style="color: #000000;font-family: 微软雅黑;font-size: 14px"><br/></span><span style="color: #000000;font-family: 微软雅黑;font-size: 14px">注：逾期本金违约金==逾期本金*逾期天数*年利率/365或366天*1.5；</span></p></td></tr></tbody></table><p><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;"><br/></span></p><p><span style="color: #000000;font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;">注意：如果由于优惠政策或特殊原因，费用产生变化的，以实际盟商收费为准；</span><br/></p><p><br/></p>
	</dl>
</div>

</div>
        </div>

        <!--右部 end--> 
    </div>
	<div class="pagebott clearfix">
        <div id="Pagination">
            <ul id="pagelist" class="pages clearfix">
              
            </ul>
        </div>

    </div>
	
	
	
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
        	时间：2017-11-15
        	描述：底部
        -->
<div style="width: 100%; height: ; background: #f0f0f0;margin-top: 50px;margin-left: 0px;">
<div class="container">
  <div class="row">
  	<div style="width: 100%;margin-top: 40px;">
    <!-- 部分：一 -->
    <div class="col-md-4">
      <div class="row">
        <div class="col-md-6">
          <ul class="dibu">
            <li class="dibu-li">新手帮助</li>
            <li><a href="front/index" class="dibu-a">新手指引</a></li>
            <li><a href="front/index" class="dibu-a">帮助中心</a></li>
            <li><a href="front/index" class="dibu-a">资费介绍</a></li>
          </ul>
        </div>
        <div class="col-md-6">
          <ul class="dibu">
            <li class="dibu-li">安全保障</li>
            <li><a href="front/index" class="dibu-a">法律法规</a></li>
            <li><a href="front/index" class="dibu-a">安全保障</a></li>
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
          		<img src="img/qrcode_for_gh_0459d30bd1d0_430.jpg" style="width: 129px;height: 129px;margin-left: 60px;"/>
        </div>
    </div>
    <!-- 部分：三 -->
    <div class="col-md-2" >
      <ul class="dibu">
        <li>1010-1218</li>
        <li>客服电话：（服务时间：9:00-22:00)</li>
        <li><input type="button" value="在线客服"/></li>
      </ul>
    </div>
  </div>
  </div>
</div>
</div>
		<!-- bootstrap js -->
		<script type="text/javascript" src="js/jquery2.1.4.js"></script>
		<script type="text/javascript" src="js/script.js"></script>

 <script type="text/javascript">
		$("#goToTop").click(function(){$("body,html").animate({scrollTop:0},500);return false;});
		function shouItems(id){
		$(".QA_list").hide();
		$("#"+id).show();
		}
   	//右侧子标签点击事件
			$(".tabSubNav span").click(function(){
				$(this).siblings().removeClass("current");
				$(this).addClass("current");
				//var cid=$(this).attr("id");
				//加载详情
				$(".QA_list").hide();
				var id = $(this).attr("name");
				$("#"+id).show();
			});
           
           
			$(document).ready(function(e) {
	    $(".QA_list dt").toggle(function(){
			$(this).next().show();
			$(this).addClass("current");
			$(this).children("i").text("-");
			},function(){
			$(this).next().hide();
			$(this).removeClass("current");
			$(this).children("i").text("+");
			});
});	
        </script>





	</body>

</html>