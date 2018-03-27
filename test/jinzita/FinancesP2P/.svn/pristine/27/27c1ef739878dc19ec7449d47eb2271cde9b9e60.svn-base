<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>金字塔 - 综合金融服务平台 - 关于我们</title>	
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
		<link href="css/xz.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
		<!--
	作者：383942470@qq.com
	时间：2017-11-08
	描述：图标
-->
		<link href="css/icons.css" rel="stylesheet" type="text/css" />

		<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />

		<link href="css/responsive.css" rel="stylesheet" type="text/css" />
	<link type="text/css" href="css/lrtk.css" rel="stylesheet" />
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/jquery.color-rgba-patch.js"></script>
	<script type="text/javascript" src="js/example.js"></script>
</head>
<body >
		<div class="nav-wrap">
			<ul class="group" id="example-one" style="width: 848px;margin-left: -20px;">
			<!-- <li><div style="width: 120px"></div></li> -->
				<li class="current_page_item">
				<a href="#xx" target="_blank" class="btn" data-toggle="tab">运营信息</a></li>
			</ul>
		</div>
		<!-- title -->
		<div>
		<p style="font-size: 10px;color: gray;">说明：为进一步加强平台透明化建设与信息公示披露，金字塔将定期向金粉们推出运营月报、季报、半年报、年报，欢迎查看！</p> 
		</div>	
		
			<div class="w1200" style="width: 848px;height: 900px;">
			<ul class="important cl" style="margin-top: -20px;">
				 <li class="rcsp_1" style="margin-left:190px;">
					<p style="font-size: 30px;">2017</p>
					<strong><i></i></strong>
				 </li>
				 <li class="rcsp_2" style="margin-left:30px;">
					<p style="font-size: 30px;">2016</p>
					<strong style="display:none"><i></i></strong>
				</li>
				 <li class="rcsp_3" style="margin-left:30px;">
					<p style="font-size: 30px;">2015</p>
					<strong style="display:none"><i></i></strong>
				</li>
				 <li class="rcsp_4" style="margin-left:30px;">
					<p style="font-size: 30px;">2014</p>
					<strong style="display:none"><i></i></strong>
				</li>
			</ul>
			<!-- 对应内容 -->
			<div class="contents">
			  <div class="cl">
			  <div style="height: 20px;"></div>
			  <ul class="l1">
			  <li class="l">
			  	<a href="front/December" target="_blank">
			  		<button class="xl" style="background:url(img/remember.png);"></button>
			 	</a>
			  </li>
			  <li class="l">
			  	<a href="front/November" target="_blank">
			    	<button class="xl" style="background:url(img/remember1.png);"></button>
			  	</a>
			  </li>
				</ul>
			   </div>
			   <!-- 、、、、、、、、、、、、、、、、、、、、、、 -->
				<div class="cl" style="display: none">
				 <div style="height: 20px;"></div>
			  		<p>2016年平台暂未运营</p>
			  </div>
			  <!--、、、、、、、、、、、、、、、、、、、  -->
			  <div class="cl" style="display: none">
			     <div style="height: 20px;"></div>
			  		<p>2015年平台暂未运营</p>
			  </div>
			  <!--、、、、、、、、、、、、、、、、、、、  -->
			<div class="cl" style="display: none">
			<div style="height: 20px;"></div>
			  	<p>2014年平台暂未运营</p>
			  </div>
			</div>
			</div>
<script type="text/javascript">
$(function(){
    var tabNum=$(".important").find("li");
    var contentNum=$(".contents").children();
    var timer;
    $(tabNum).each(function(index){
        $(this).hover(function(){
            var that=$(this)
             timer=window.setTimeout(function(){
                $(contentNum).eq(index).css({"display":"block"});
                $(contentNum).eq(index).siblings().css({"display":"none"});
                 that.find("a").css({"background":"#FFF","color":"#fff"});
                 that.find("strong").show();
                 that.siblings().find("strong").hide();
                 that.siblings().find("a").css({"background":"#fff","color":"black"});
            },100)
        },function(){
            window.clearTimeout(timer);
        })
    })
})
</script>
</body>
</html>