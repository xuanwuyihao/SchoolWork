<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isErrorPage="true"%>
<%
   response.setStatus(HttpServletResponse.SC_OK);
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>404 - Not found</title>
<base href="<%=path%>/">
<link rel="stylesheet" href="css/m404.css" type="text/css" media="screen, projection" /> <!-- main stylesheet -->

<link rel="icon" href="img/Logo.png" type="image/x-icon">
<!--[if lt IE 9]>
	<link rel="stylesheet" type="text/css" href="css/ie8.css" />
<![endif]-->

<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script> <!-- uiToTop implementation -->
<script type="text/javascript" src="js/custom-scripts.js"></script>

<script type="text/javascript">

$(document).ready(function(){
			
	universalPreloader();
						   
});

$(window).load(function(){

	//remove Universal Preloader
	universalPreloaderRemove();
	
	rotate();
    dogRun();
	dogTalk();
	
	//Tipsy implementation
	$('.with-tooltip').tipsy({gravity: $.fn.tipsy.autoNS});
						   
});

</script>
</head>

<body>

<!-- Universal preloader -->
<div id="universal-preloader">
    <div class="preloader">
        <img src="images/universal-preloader.gif" alt="universal-preloader" class="universal-preloader-preloader" />
    </div>
</div>
<!-- Universal preloader -->

<div id="wrapper">

<!-- Not found text -->
	<div class="not-found-text">
    	<h1 class="not-found-text">服务器去火星了，请稍后再试！</h1>
		<div class="back">
		<a href="front/index"><button class="goback" >返回首页</button></a>
		<button class="goback" onclick="history.go(-1)">返回上一页</button>
		</div>
    </div>
<div class="dog-wrapper">
<!-- dog running -->
	<div class="dog"></div>
<!-- dog running -->
	
<!-- dog bubble talking -->
	<div class="dog-bubble">
    	
    </div>
    
    <!-- The dog bubble rotates these -->
    <div class="bubble-options">
    	<p class="dog-bubble">
        	芽,你失去了吗?不用担心，我是一个优秀的导游!!
        </p>
    	<p class="dog-bubble">
	        <br />
        	东盟地区论坛。东盟地区论坛。
        </p>
        <p class="dog-bubble">
        	<br />
        	别担心!我在它!
        </p>
        <p class="dog-bubble">
        	我要是有块饼干就好了<br /><img style="margin-top:8px" src="images/cookie.png" alt="cookie" />
        </p>
        <p class="dog-bubble">
        	<br />
        	天啊!这是很无聊的!
        </p>
        <p class="dog-bubble">
        	<br />
        	我接近吗?
        </p>
        <p class="dog-bubble">
        	或者我只是在兜圈子?不…
        </p>
        <p class="dog-bubble">
        	<br />
            好吧，我现在正式输了…
        </p>
        <p class="dog-bubble">
        	我想我看到了<br /><img style="margin-top:8px" src="images/cat.png" alt="cat" />
        </p>
        <p class="dog-bubble">
        	不管怎样，我们应该找什么?@_@
        </p>
    </div>
    <!-- The dog bubble rotates these -->
<!-- dog bubble talking -->
</div>

<!-- planet at the bottom -->
	<div class="planet"></div>
<!-- planet at the bottom -->
</div>


</body>
</html>