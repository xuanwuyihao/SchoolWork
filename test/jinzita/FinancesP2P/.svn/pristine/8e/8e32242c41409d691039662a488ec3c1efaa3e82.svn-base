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
	<title>金字塔 - 综合金融服务平台 - 新手导航</title>	
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
<div style="height: 80px;"></div>
<div>
	<img src="images/xs1.png"/>
</div>


<!--放置内容-->
<div class="bgFb pdt20"> 

    <div class="wrap"> 


        <!--右部-->
        
<div id="_content" class="fl rightPart ml15">
           
            
            
<div id="_content_child" class="wd723 bgFF bdD9 pd30 clear mgt1">



<div class="bgFb pd20">

	
	<dl class="QA_list">
			<dt style="color: #7b7b7b;"><i>+</i>金字塔的工作原理是什么？</dt>
			<dd >
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;
				金字塔（www.ruisi.shop)是中国最受欢迎的点对点信用网上借贷平台，它创立的目的是提供一个更加安全，高效的平台，让个人对个人之间的借贷行为更加规范，安全，有效；让人们有机会帮助到需要帮助的人。</p>
				<p style="color: #000;">&nbsp;&nbsp;&nbsp;
				金字塔P2P网络借贷平台，提供互联网环境下点对点、个人对个人的借贷服务，平台本身不是借贷主体，而是信息服务者、撮合者以及风险控制者，为大众提供低门槛、能触及、低成本、高效率、安全可靠的融投资新渠道，满足借贷用户的资金需求，同时帮助投资用户实现财富增值，实现双向普惠。</p>
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;<br/></p>
			</dd>
			<dt style="color: #7b7b7b;"><i>+</i>什么是P2P网络借贷平台?</dt>
			<dd >
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;
				P2P借贷是（peer to peer lending)的缩写，peer是个人的意思，所以它是一种个人对个人的信贷模式。网络借贷指的是借贷过程中，资料与资金、合同、手续等全部通过网络技术实现，这也是未来金融服务的发展趋势。
				</p>
			</dd>
			<dt style="color: #7b7b7b;"><i>+</i>利息计算方式(等额本金、等额本息、还本付息)的解释？</dt>
			<dd >
				<div style="color: #000000;">
				等额本金：是指在还款期内把贷款数总额等分，每月偿还同等数额的本金和剩余贷款在该月所产生的利息。<br/>	<br/>	等额本息：是指在还款期内，每月偿还同等数额的贷款(包括本金和利息)。<br/>	&nbsp;
				</div>
				<div style="color: #000000;">	
				还本付息：是指在还款期内，每月偿还等额的利息，最后一个月偿还该月利息及所有本金。
				</div>
				<div style="color: #000000;">	&nbsp;</div>
				<div style="color: #000000;">	
				在“我要借入”频道下的“工具箱”中有利息计算器，可以帮助您体验一下以上三种还款方式的具体不同。
				</div><p style="color: #000000;">&nbsp;&nbsp;&nbsp;<br/></p>
			</dd>
			<dt style="color: #7b7b7b;"><i>+</i>网络借贷最高收益利率是多少？</dt>
			<dd >
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;
				根据《最高人民法院关于人民法院审理借贷案件的若干意见》规定，民间借贷的利率可以适当高于银行的利率，各地人民法院可根据本地区的实际情况具体掌握，但最高不得超过银行同类贷款利率的4倍。当期人民银行一年期基准贷款利率为6.00%，则当期基准贷款利率的4倍为24.00%，金字塔的年化收益率低于24.00%，不超过网络借贷最高利率。
				</p>
			</dd>
			<dt style="color: #7b7b7b;"><i>+</i>什么是债权转让？</dt>
			<dd >
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;
				金字塔根据法律原理加强贷出者风险管理,在完成借入者投标管理后,根据自身情况随时选择进行该笔债权收益的转让,转让债权成立同时系统会通知债权人和债务人,债权转让并不影响原有债务人的债务关系。
				</p>
			</dd>
			<dt style="color: #7b7b7b;"><i>+</i>本站借贷平台主要收费标准？</dt>
			<dd >
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;
					<span style="font-size: 12px;color: #000000;">请参看本网站
						<a href="front/shoufeibiaozhun">
							<span style="text-decoration:underline;">
								<span>平台收费标准</span>
							</span>
						</a>说明。
					</span>
				</p>
			</dd>
			<dt style="color: #7b7b7b;"><i>+</i>什么是站内（站外）黑名单？</dt>
			<dd >
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;
					站内黑名单：在本平台借款逾期未还，并经多次催讨一再拖欠的人员即会被加入到站内黑名单。
				</p>
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;	
					站内黑名单人员操作权限受限，只能进行登陆平台进行还款操作。
				</p>
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;	
					站外黑名单：站外黑名单是网站工作人员由借贷联盟或其他借贷网站收集整理，并添加到本平台的信用不良人员。
				</p>
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;	
					部分是由会员举报，经工作人员核实后加入站外黑名单的人员。
				</p>
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;<br/></p>
			</dd>
			<dt style="color: #7b7b7b;"><i>+</i>电子借条是否有法律效力？</dt>
			<dd >
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;
					根据《电子签名法》的规定，民事活动中的合同或者其他文件、单证等文书，当事人可以约定使用电子签名、数据电文，不能因为合同采用电子签名、数据电文就否定其法律效力。同时，《电子签名法》中还规定，可靠的电子签名与手写签名或者盖章具有同等的法律效力。明确肯定了符合条件的电子签名与手写签名或盖章具有同等的效力。
				</p>
			</dd>
			<dt style="color: #7b7b7b;"><i>+</i>相关法律法规</dt>
			<dd ><p style="color: #000000;">&nbsp;&nbsp;&nbsp;
				1. 关于民间借贷行为<br/>	民间借贷是指自然人之间、自然人与法人之间、自然人与其它组织之间借贷。<br/>	只要双方当事人具有完全民事行为能力且意见表示真实即可认定有效，因借贷产生的担保或抵押也相应有效，但利率不得超过人民银行规定的相关利率。<br/>	民间借贷是一种直接融资渠道，是民间金融的一种表现形式，民间借贷业的发展是对现今金融体系的补充。
				</p>
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;	<br/>	&nbsp;&nbsp;&nbsp;
				2. 关于利率<br/>	本站借贷平台上借入借出的利率严格按照国家相关法律规定执行。
				</p>
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;	
				《中华人民共和国合同法》<br/>	第二百一十一条&nbsp;&nbsp; 自然人之间的借款合同对支付利息没有约定或者约定不明确的，视为不支付利息。自然人之间的借款合同约定支付利息的，借款的利率不得违反国家有关限制借款利率的规定。
				</p>
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;	
				《最高人民法院关于人民法院审理借贷案件的若干意见》<br/>	第六条&nbsp;&nbsp; 民间借贷的利率可以适当高于银行的利率，各地人民法院可根据<br/>	本地区的实际情况具体掌握，但最高不得超过银行同类贷款利率的四倍（包含利率本数）。超出此限度的，超出部分的利息不予保护。
				</p>
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;	<br/>	&nbsp;&nbsp;&nbsp;
				3. 关于居间<br/>	本站借贷是一个民间借贷中介平台，平台不参与借款，更多做的是信息匹配、工具支持和服务等一些功能，起联系、介绍作用，对借贷行为不承担担保责任。
				</p>
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;	
				《中华人民共和国合同法》<br/>	第四百二十四条　居间合同是居间人向委托人报告订立合同的机会或者提供订立合同的媒介服务，委托人支付报酬的合同。
				</p>
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;	
				第四百二十六条　居间人促成合同成立的，委托人应当按照约定支付报酬。对居间人的报酬没有约定或者约定不明确，依照本法第六十一条的规定仍不能确定的，根据居间人的劳务合理确定。因居间人提供订立合同的媒介服务而促成合同成立的，由该合同的当事人平均负担居间人的报酬。<br/>	居间人促成合同成立的，居间活动的费用，由居间人负担。
				</p>
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;	
				《最高人民法院关于人民法院审理借贷案件的若干意见》<br/>	第十三条&nbsp;&nbsp; 在借贷关系中，仅起联系、介绍作用的人，不承担保证责任。<br/>	对债务的履行确有保证意思表示的，应认定为保证人，承担保证责任。
				</p><p style="color: #000000;">&nbsp;&nbsp;&nbsp;<br/></p>
			</dd>
			<dt style="color: #7b7b7b;"><i>+</i>什么是信用等级？</dt>
			<dd >
				<p style="color: #000000;">&nbsp;&nbsp;&nbsp;
					<span style="color: rgb(0, 0, 0); font-family: 微软雅黑, &#39;Microsoft YaHei&#39;, 微软雅黑, 宋体, tahoma, arial; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: 26px; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 1; word-spacing: 0px; -webkit-text-stroke-width: 0px; display: inline !important; float: none; background-color: rgb(251, 251, 251);">
					</span>
					<span style="color: rgb(0, 0, 0); font-family: 微软雅黑, &#39;Microsoft YaHei&#39;, 微软雅黑, 宋体, tahoma, arial; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: 26px; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 1; word-spacing: 0px; -webkit-text-stroke-width: 0px; display: inline !important; float: none; background-color: rgb(251, 251, 251);">
					</span>
					<span style="color: rgb(0, 0, 0); font-family: 微软雅黑, &#39;Microsoft YaHei&#39;, 微软雅黑, 宋体, tahoma, arial; font-size: 12px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: 26px; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 1; word-spacing: 0px; -webkit-text-stroke-width: 0px; display: inline !important; float: none; background-color: rgb(251, 251, 251);">
					</span>
				</p>
				<p style="margin: 0px; padding: 0px; color: rgb(0, 0, 0); font-family: 微软雅黑,&quot;Microsoft YaHei&quot;,微软雅黑,宋体,tahoma,arial; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: 26px; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(251, 251, 251);">
					<span style="color: rgb(0, 0, 0); font-family: 微软雅黑, &#39;Microsoft YaHei&#39;, 微软雅黑, 宋体, tahoma, arial; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: 26px; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 1; word-spacing: 0px; -webkit-text-stroke-width: 0px; display: inline !important; float: none; background-color: rgb(251, 251, 251);">
					</span>
				</p>
				<p style="margin: 0px; padding: 0px; color: rgb(0, 0, 0); font-family: 微软雅黑, &#39;Microsoft YaHei&#39;, 微软雅黑, 宋体, tahoma, arial; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: 26px; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 1; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(251, 251, 251);">
					又称“资信评级”或“信誉评估”。一种金融信息服务业务。
				</p>
				<p style="margin: 0px; padding: 0px; color: rgb(0, 0, 0); font-family: 微软雅黑, &#39;Microsoft YaHei&#39;, 微软雅黑, 宋体, tahoma, arial; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: 26px; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 1; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(251, 251, 251);">
					在西方国家，财务指数是对某一特定的有价证券，从经济、政治、法律以及其他各个角度判断其可能出现的风险，进行测定，并以专门的符号，来标明债券本利按期支付或股票收益的可靠程度。
				</p>
				<p style="margin: 0px; padding: 0px; color: rgb(0, 0, 0); font-family: 微软雅黑, &#39;Microsoft YaHei&#39;, 微软雅黑, 宋体, tahoma, arial; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: 26px; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 1; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(251, 251, 251);">
					我国近年来有些地方把这一业务又运用到工商业或金融业，对其资信状况、负债偿还能力等进行评估，并以一定的符号标示其信用的可靠程度。<br/><br/>信用等级由高到低依次分为：
				</p>
				<table style="border: 1px solid rgb(221, 221, 221); height: 172px;" cellspacing="0" cellpadding="0" border="1">
					<thead>
						<tr class="firstRow">
							<th scope="col" style="text-align: center;word-break: break-all;margin-left: 10%;" width="150">等级名称</th>
							<th scope="col" style="text-align: center;word-break: break-all;" width="150">分值范围</th>
							<th scope="col" style="text-align: center;word-break: break-all;" width="150">贷款额度（竞标）</th>
							<th scope="col" style="text-align: center;word-break: break-all;" width="150">贷款额度（大额）</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td style="text-align: center; word-break: break-all;">AAA</td>
							<td style="text-align: center; word-break: break-all;" width="32">[220,266)</td>
							<td style="text-align: center; word-break: break-all;" width="131"><br/></td>
							<td style="text-align: center; word-break: break-all;" width="131"><br/></td>
						</tr>
						<tr>
							<td style="text-align: center; word-break: break-all;">AA+</td>
							<td style="text-align: center; word-break: break-all;" width="32">[190,220)</td>
							<td style="text-align: center; word-break: break-all;" width="131">&nbsp; &nbsp; &nbsp;</td>
							<td style="text-align: center; word-break: break-all;" width="131"><br/></td>
						</tr>
						<tr>
							<td style="text-align: center; word-break: break-all;">AA</td>
							<td style="text-align: center; word-break: break-all;" width="32">[170,190)</td>
							<td style="text-align: center; word-break: break-all;" width="131"><br/></td>
							<td style="text-align: center" width="131"><br/></td>
						</tr>
						<tr>
							<td style="text-align: center; word-break: break-all;">A+</td>
							<td style="text-align: center; word-break: break-all;" width="32">[150,170)</td><td style="text-align: center" width="131"><br/></td>
							<td style="text-align: center" width="131"><br/></td>
						</tr>
						<tr>
							<td style="text-align: center; word-break: break-all;">A</td>
							<td style="text-align: center; word-break: break-all;" width="32">[140,150)</td>
							<td style="text-align: center" width="131"><br/></td>
							<td style="text-align: center" width="131"><br/></td>
						</tr>
						<tr>
							<td style="text-align: center; word-break: break-all;">BB+</td>
							<td style="text-align: center; word-break: break-all;" width="32">[130,140)</td>
							<td style="text-align: center" width="131"><br/></td>
							<td style="text-align: center" width="131"><br/></td>
						</tr>
						<tr>
							<td style="text-align: center; word-break: break-all;">BB</td>
							<td style="text-align: center; word-break: break-all;" width="32">[120,130)</td>
							<td style="text-align: center" width="131"><br/></td>
							<td style="text-align: center" width="131"><br/></td>
						</tr>
						<tr>
							<td style="text-align: center; word-break: break-all;">B+</td>
							<td style="text-align: center; word-break: break-all;" width="32">[110,120)</td>
							<td style="text-align: center" width="131"><br/></td>
							<td style="text-align: center" width="131"><br/></td>
						</tr>
						<tr>
							<td style="text-align: center; word-break: break-all;">B<br/></td>
							<td style="text-align: center; word-break: break-all;" width="32">[100,110)</td>
							<td style="text-align: center; word-break: break-all;" width="131"><br/></td>
							<td width="131"><br/></td></tr><tr><td style="text-align: center; word-break: break-all;">CC+</td>
							<td style="text-align: center; word-break: break-all;" width="32">[90,100)</td>
							<td style="text-align: center; word-break: break-all;" width="131"><br/></td>
							<td style="text-align: center" width="131"><br/></td>
						</tr>
						<tr>
							<td style="text-align: center; word-break: break-all;">C+</td>
							<td style="text-align: center; word-break: break-all;" width="32">[70,80)</td>
							<td style="text-align: center" width="131"><br/></td>
							<td style="text-align: center" width="131"><br/></td>
						</tr>
						<tr>
							<td style="text-align: center; word-break: break-all;">D</td>
							<td style="text-align: center; word-break: break-all;" width="32">[50,60)</td>
							<td style="text-align: center" width="131"><br/></td>
							<td style="text-align: center" width="131"><br/></td>
						</tr>
						<tr>
							<td style="text-align: center; word-break: break-all;">HR</td>
							<td style="text-align: center; word-break: break-all;" width="32">[0,50)</td>
							<td style="text-align: center" width="131"><br/></td>
							<td width="131"><br/></td>
						</tr>
					</tbody>
				</table>
				<p style="margin: 0px; padding: 0px; color: rgb(0, 0, 0); font-family: 微软雅黑, &#39;Microsoft YaHei&#39;, 微软雅黑, 宋体, tahoma, arial; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: 26px; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 1; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(251, 251, 251);">&nbsp;</p>
				<p style="margin: 0px; padding: 0px; color: rgb(0, 0, 0); font-family: 微软雅黑, &#39;Microsoft YaHei&#39;, 微软雅黑, 宋体, tahoma, arial; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: 26px; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 1; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(251, 251, 251);">
				<span id="ctl00_MainContent_LblContent" style="color: #000000;">信用等级的获得必须首先通过身份证的验证及手机的验证。</span></p>
				<p style="margin: 0px; padding: 0px; color: rgb(0, 0, 0); font-family: 微软雅黑, &#39;Microsoft YaHei&#39;, 微软雅黑, 宋体, tahoma, arial; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: 26px; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(251, 251, 251);"><br/></p>
			</dd>
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
		<div class="container">
			<div class="row">
				<div style="width: 90%; margin-top: 40px;">
					<!-- 部分：一 -->
					<div class="col-md-4">
					<div style="height: 20px;"></div>
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
					<div style="height: 20px;"></div>
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
								style="width: 129px; height: 129px; margin-left: 60px;margin-top: -10px;" />
						</div>
					</div>
					<!-- 部分：三 -->
					<div class="col-md-2">
						<ul class="dibu" style="margin-top: 15px;">
							<li>1010-1218</li>
							<li>客服电话：（服务时间：9:00-22:00)</li>
							<li>
							
								<div class="mt38 tdw-btn-lg" style="margin-top:0px">
								<a class="dibu-aa">
									<span rel="nofollow" class="btn-text" 
											href="javascript:;"target="_blank" style="color:white">
											联系客服</span>
								</a>
								</div>
							</li>
						</ul>
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