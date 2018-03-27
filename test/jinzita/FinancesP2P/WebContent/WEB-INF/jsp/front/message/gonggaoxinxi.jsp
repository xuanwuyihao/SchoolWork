<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
	<title>金字塔 - 综合金融服务平台 - 公告信息</title>	
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


<!-- bootstrap js -->
<script type="text/javascript" src="js/jquery2.1.4.js"></script>
<script type="text/javascript" src="js/script.js"></script>

<link rel="stylesheet" href="css/about.css">


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
				<a id="feedback" href="http://sc.chinaz.com" title="意见反馈">意见反馈</a> <a
					id="scrollUp" href="javascript:;" title="飞回顶部"></a> <img
					class="qr_img" src="images/qr_img.png">
			</div>
		</div>
	</div>

		<div class="newc-contents" style="display: block;">
			<h3 id="newc-title">${notice.title}</h3>
			<div class="newc-contents-top">
				<div>
					<a href="front/our/2" style="float: right;margin-right: 30px;">返回列表</a>
					<span style="float: right;margin-right:50px;">
						<fmt:formatDate value="${notice.time}" pattern="yyyy-MM-dd HH:mm:ss"/>
					</span>
				</div>
				
			</div>
			<div class="newc-contents-bottom">
				${notice.content}<br>
				<br>
				<div style="text-align:right;">
					<span></span><span> ${notice.people}</span> 
				</div>
				<div style="text-align:right;">
					<span> 
						<fmt:formatDate value="${notice.time}" pattern="yyyy年MM月dd日"/>
					</span> 
				</div>
			</div>
		</div>

<!--
        	作者：383942470@qq.com
        	时间：2017-11-15
        	描述：底部
        -->
		<div style="width: 100%; height: 200px; background: white;margin-top: 5px;">
		<div class="container">
  <div class="row">
  	<div style="width: 90%;margin-top: 40px;">
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

</body>

</html>