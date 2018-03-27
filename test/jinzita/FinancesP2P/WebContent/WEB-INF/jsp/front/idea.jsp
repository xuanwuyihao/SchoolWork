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
	<title>金字塔 - 综合金融服务平台 - 意见反馈</title>	
	<!-- 引入页面Logo小图标 -->
	<link rel="icon" href="img/Logo.png" type="image/x-icon">
	<base href="<%=path%>/">
	<link rel="stylesheet" href="layui-v2.2.45/layui/css/layui.css" media="all">
	<script src="layui-v2.2.45/layui/layui.js" charset="utf-8"></script>
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap.js"></script>
	<link rel="stylesheet" type="text/css" href="css/normalize.css" />
	<link rel="stylesheet" href="css/bootstrap.min.css" />
	
	<link rel="stylesheet" type="text/css" href="css/zzsc.css" />
	<script type="text/javascript" src="js/zzsc.js"></script>
	<script type="text/javascript" src="js/example.js"></script>
	

		<!--
	作者：383942470@qq.com
	时间：2017-11-08
	描述：图标
-->
		<link href="css/icons.css" rel="stylesheet" type="text/css" />

		<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />

		<script type="text/javascript" src='js/jquery.js'></script>
		<script type="text/javascript" src='js/head.js'></script>
	
<style>
			.feedback{
				width: 560px;
				height: 400px;
				background-color:white;
				display: block;
				margin: 150px auto 0px;
				box-shadow: #666 0px 0px 10px;
			}
			.feedtitle{
				width: 560px;
				height: 35px;
				background-color: #81d08e;
			}
			#feedbtn{
				width: 82px;
				height: 32px;
				cursor: pointer;
				font-size: 14px;
			    color: #fff;
			    font-weight: bold;
			    line-height: 32px;
			    background-color: #81d08e;
			    border: 1px solid #81d08e;
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
		</div>
			<!-- Responsive Header -->
<!-- <div style="height: 80px;"></div> -->
<div class="feedback">
			<div class="feedtitle">
				<span style="padding: 10px 10px;color: white;">意见反馈</span>
			</div>
			<form action="opinion/insert" method="post">
				<table style="width: 100%;margin:20px auto 0px;">
					<tr><td style="padding: 12px 20px;text-align:right;">您的电话:</td><td><input style="height: 30px;line-height: 10px;width: 200px;padding: 0 10px;" placeholder="请输入您的电话" type="text" id="phone" name="phone" maxlength="11"/></td></tr>
					<tr><td style="padding: 12px 20px;text-align:right;">意见建议:</td><td><textarea style="width: 380px;height: 150px;color: #999999;font-size: 14px;line-height: 18px;padding: 10px 10px;" placeholder="请在这里输入内容" id="content" name="content" maxlength="200"></textarea></td></tr>
					<tr><td colspan="2" style="padding-left: 120px;height:40px;color:#999999;font-size: 12px;">反馈内容请控制在200字以内，并请勿包含违法信息</td></tr>
					<tr><td colspan="2" style="padding-left: 120px;height:50px;"><button id="feedbtn" type="submit">提   交</button></td></tr>
				</table>
			</form>
		</div>
<!--放置内容-->




			<!--
            	作者：383942470@qq.com
            	时间：2017-11-10
            	描述：锚点
            -->
			<div style="position: absolute;">
				<div class="bottom_tools">
					<div class="qr_tool">二维码</div>
					
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
<script type="text/javascript">
	//支持Enter键登录
	document.onkeydown = function(e){
		if(!e) e = window.event;
		if((e.keyCode || e.which) == 11){
			var obtnLogin=document.getElementById("feedbtn")
			obtnLogin.focus();
		}
	}
	$("#feedbtn").click(function(){
		var content = $("#content").val();
		var phone = $("#phone").val();
		reg=/^1[3|4|5|7|8][0-9]\d{4,8}$/i;//验证手机正则(输入前7位至11位)
		if(phone==""){
			layui.use('layer', function(){
				var layer = layui.layer;
				layer.msg('手机号不能为空');
			});
			return false;
		}
// 		if(!reg.test(phone)){
		if(!(/^1(3|4|5|7|8)\d{9}$/.test(phone))){ 
			layui.use('layer', function(){
				var layer = layui.layer;
				layer.msg('输入的手机号格式不正确');
			});
			return false;
		}
		if(content==""){
			layui.use('layer', function(){
				var layer = layui.layer;
				layer.msg('反馈内容不能为空');
			});
			return false;
		}
		
		if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(content)){ 
			layui.use('layer', function(){
				var layer = layui.layer;
				layer.msg('反馈内容不能有特殊字符');
			});
			return false;
		}
		
		if(!new RegExp("^.{5,200}$").test(content)){
			layui.use('layer', function(){
				var layer = layui.layer;
				layer.msg('反馈内容必须5到200个字');
			});
			return false;
		}
		
	});
</script>




	</body>

</html>