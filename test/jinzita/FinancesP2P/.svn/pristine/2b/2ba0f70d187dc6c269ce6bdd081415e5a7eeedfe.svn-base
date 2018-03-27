<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app='LoanCalculator'>

<head>
	<title>计算器</title>
	<!-- 引入页面Logo小图标 -->
	<link rel="icon" href="img/Logo.png" type="image/x-icon">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<base href="<%=path%>/">	
	<link rel="stylesheet" type="text/css" href="bootstrap-3.3.4-dist/css/bootstrap.min.css">
	<script type="text/javascript" src='js/lib/angular/angular.js'></script>
	<script type="text/javascript" src='js/controllers.js'></script>
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
			<style type="text/css">
		span{
		font-size: 30px;
		}
		#name{
		width: 200px;
		height: 40px;
		margin: 10px 0;
		outline:none;
		text-indent: 10px;
		border: 1px solid #c3c3c3;
		}
		#button{
		/* width: 300px;
		height: 40px; */
		background-color: #27bc6a;
		outline: none;
		color:white;
		font-size:20px;
		font-family:微软雅黑;
		border: 1px solid white; 
		}
		#name:focus{
		 border-style:solid;
   		 border-color:#ecd326;
		}
	
		/* h3{
		color:orange;
		} */
		</style>
		<link href="css/icons.css" rel="stylesheet" type="text/css" />

		<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />

		<link href="css/responsive.css" rel="stylesheet" type="text/css" />
		
	<style type="text/css">
		a:focus{text-decoration: none}
		a:focus{outline:none;}
	</style>
</head>

<body  style="background-color: #ebebeb;">
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
		<div style="height: 100px;"></div>
		
		
		<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column" style="background-color: white;">
			<h3>收益计算器</h3>
		<hr>
		<!--<div class="row clearfix">-->
		 <form  class="form-horizontal"  role="form" ng-controller="LoanCalculatorController" >
		 
			<div class="col-md-4 column">
				<div class="form-group">
			<label style="font-family: 微软雅黑;font-size: 16px;">贷款本金：</label>
				<input id="name" name="test" type="corpus" class="form-control" ng-model="loan.corpus" placeholder="请输入贷款本金" onfocus="this.placeholder=''" onclick="document.getElementById('name').value=''" onblur="this.placeholder='请输入贷款本金'">
				</div>
			</div>
				
			<div class="col-md-4 column">
				<div class="form-group">
			<label style="font-family: 微软雅黑;font-size: 16px;">年利率:</label>
				<input id="name" type="mrate" class="form-control" ng-model="loan.mrate" placeholder="请输入年利率" onfocus="this.placeholder=''" onblur="this.placeholder='请输入年利率'">
				</div>
			</div>
			
			<div class="col-md-4 column">
				<div class="form-group">
			<label style="font-family: 微软雅黑;font-size: 16px;">贷款期(年):</label>
				<input id="name" type="period" class="form-control" ng-model="loan.period" placeholder="请输入贷款期" onfocus="this.placeholder=''" onblur="this.placeholder='请输入贷款期">
				</div>
			</div>
		
			<!--</div>-->
			<div class="form-group">
		<button id="button" style="margin-left: 430px;margin-top: 20px;" class="btn btn-default" ng-click="loan.getDetailPerMsByBenxi()">
			<font size="3" face="微软雅黑">等额本息</font>
		</button>
		<button id="button"  style="margin-top: 20px;margin-left: 20px;" class="btn btn-default" ng-click="loan.getDetailPerMsByBenjin()">
			<font size="3" face="微软雅黑">等额本金</font>
		</button>
		</div>
		
		
		<br><hr>
		<p><font size="3">还款总额：</font><font size="5" style="font-weight:bolder;" color="#dacc69">{{loan.total | number : 2}}</font></p>
		<p><font size="3">总利息：  </font><font size="5" style="font-weight:bolder;" color="#dacc69">{{loan.rateTotal | number : 2}}</font></p>

		<hr>
		<h3>每月还款明细：</h3>
		<table class="table table-striped">
			<thead>
			<tr>
				<th>月份</th>
				<th>本月还款</th>
				<th>本月本金</th>
				<th>本月利息</th>
				<th>已还本金总额</th>
				<th>已还利息总额</th>
				<th>累计还款</th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat='detailPerM in loan.detailPerMs'>
					<td>第{{$index + 1}}个月</td>
					<td>{{detailPerM.corpusThisM | number : 2}}</td>
					<td>{{detailPerM.benjin | number : 2}}</td>
					<td>{{detailPerM.lixi | number : 2}}</td>
					<td>{{detailPerM.benjinTotal | number : 2}}</td>
					<td>{{detailPerM.lixiTotal | number : 2}}</td>
					<td>{{detailPerM.leiji | number : 2}}</td>
				</tr>
			</tbody>
		</table>
		
		</form>
		
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
		
		<!-- bootstrap js -->
		<script type="text/javascript" src="js/jquery2.1.4.js"></script>
		<script type="text/javascript" src="js/script.js"></script>
</body>

</html>
