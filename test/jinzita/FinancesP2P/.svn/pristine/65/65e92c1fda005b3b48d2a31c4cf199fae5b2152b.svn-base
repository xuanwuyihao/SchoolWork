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
	<title>金字塔 - 综合金融服务平台 - 用户个人中心</title>	
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

	<link href="css/icons.css" rel="stylesheet" type="text/css" />

	<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />

	<link href="css/responsive.css" rel="stylesheet" type="text/css" />
	
	
	<style>
	
	a {
	    text-decoration: none;
	    cursor: pointer;
	    color: #333;
	}
	
	a:hover {
	    text-decoration: none;
	    outline: none
	}
	
	a.ie6:hover {
	text-decoration: none;
	    zoom: 1
	}
	
	a:focus {
	text-decoration: none;
	    outline: none
	}
	
	a:hover,
	a:active {
	text-decoration: none;
	    outline: none
	}
	ul li{
	display: inline;
	}
	.panel-heading:hover {
	background-color: #c3c3c3;
	}
	.panel-group{
	 width:80%;
	background-color: white;
	}
	 .container{
	/* font-family:楷体; */
	background-color: white;
	}
	.container i{
	padding: 0 10px;
	}
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
	.col-md-8{
	background-color: black;
	
	}
	</style>
	<script type="text/javascript">
	       $(document).ready(function(){
	           //这是给div的一个初始页面
	      $("#myManu").load(‘${pageContext.request.contextPath}/user/render.do’);
	       })
	       
	        var menuClick = function(menuUrl) {
	           
	            $("#myManu").load(menuUrl);
	        };
	</script>
	<script type="text/javascript">
		$(function () { $('#gdbj').collapse({
			toggle: false
		})});
		$(function () { $('#collapseTwo').collapse('show')});
		$(function () { $('#collapseThree').collapse('toggle')});
		$(function () { $('#collapseOne').collapse('hide')});
		$(function () { $('#gdbj').collapse('toggle')});
	</script> 
	<script type="text/javascript">
	function changeFrameHeight(){
	    var ifm= document.getElementById("ifrem"); 
	    ifm.height=document.documentElement.clientHeight;
	}
	window.onresize=function(){  
	     changeFrameHeight();  
	} 
	</script>
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


<!--左右边框  -->
	<div style="height:100px"></div>
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-3 column">
				<div class="panel-group" id="accordions">
				<div style="height:20px"></div>
			    <iframe src="${pageContext.request.contextPath }/front/user/right.action" scrolling="no" id="ifrem" onload="changeFrameHeight()"   frameborder="0"></iframe>
				</div>
				</div>
				<div class="col-md-9" id="ss">
				  <div>
				  <iframe src="${pageContext.request.contextPath }/front/user/Account.action"  name="cent" height="900px;"  scrolling="no"   id="ifrem"  frameborder="0"></iframe>
				  </div>
				</div>
			</div>
		</div>
	</div>
</div>
<!--end  -->
	
	
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
		

		
		<div style="height: 800px;"></div>
		<!-- bootstrap js -->
		<script type="text/javascript" src="js/jquery2.1.4.js"></script>
		<script type="text/javascript" src="js/script.js"></script>
	</body>
</html>