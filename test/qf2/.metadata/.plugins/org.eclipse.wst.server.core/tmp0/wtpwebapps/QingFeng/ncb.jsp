<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>&nbsp;清风教育网 - 权威认证</title>
<link rel="icon" href="images/logo/logo2.ico" />

<script type="text/javascript" src="script/jquery.min.js"></script>
<script type="text/javascript" src="script/ncb/jQuery-easing.js"></script>
<script type="text/javascript" src="script/ncb/jQuery-jcImgScroll.js"></script>

<style type="text/css">
* {
	margin: 0;
	padding: 0;
	list-style-type: none;
}

a, img {
	border: 0;
}

body {
	font: 12px/180% Arial, Helvetica, sans-serif, "新宋体";
}

.blank30 {
	height: 30px;
	overflow: hidden;
}
/* jQuery jcImgScroll */
.jcImgScroll {
	position: relative;
	height: 380px;
	margin: 40px auto 0 auto;
}

.jcImgScroll li {
	border: 1px solid #ccc;
}

.jcImgScroll li a {
	background: #fff;
	display: block;
	position: relative;
	z-index: 99;
}

.jcImgScroll li.loading a {
	background: #fff url(img/ncb/loading.gif) no-repeat center center;
}

.jcImgScroll li img, .jcImgScroll li, .jcImgScroll em, .jcImgScroll dl {
	display: none;
	border: 0 none;
}

.jcImgScroll li img {
	width: 100%;
	height: 100%;
}

.jcImgScroll em.sPrev {
	background: url(images/ncb/arrow-left.png) no-repeat left center;
}

.jcImgScroll em.sNext {
	background: url(images/ncb/arrow-right.png) no-repeat right center;
}

.jcImgScroll dl dd {
	background: url(images/ncb/NumBtn.png) no-repeat 0 bottom;
	text-indent: -9em;
}

.jcImgScroll dl dd:hover, .jcImgScroll dl dd.curr {
	background-position: 0 0;
}
</style>

<script type="text/javascript">
$(function(){
	
	//演示三    ID改变下试试
	$("#demo3").jcImgScroll({
		arrow : {
			width:45,	
			height:400,
			x:60,
			y:0
		},
	    width : 330, //设置图片宽度
		height:469, //设置图片高度
		imgtop:22,//每张图片的上下偏移量
		imgleft:-10,//每张图片的左边偏移量
		imgwidth:30,//每张图片的宽度偏移量
		imgheight:44,//每张图片的高度偏移量
		count : 9,//数量
		offsetX : 60,//位移
		NumBtn : false,
		title:false,
		setZoom:.8,
	});

});
</script>

</head>
<body>
	<div style="text-align:center;clear:both;">
	<script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
	<script src="/follow.js" type="text/javascript"></script>
	</div>
	<div id="demo3" class="jcImgScroll">
		<ul>
			<li><a href="#" path="images/ncb/16.jpg"></a></li>
			<li><a href="#" path="images/ncb/15.jpg"></a></li>
			
			<li><a href="#" path="images/ncb/17.jpg"></a></li>
			<li><a href="#" path="images/ncb/18.jpg"></a></li>
			<li><a href="#" path="images/ncb/20.jpg"></a></li>
			<li><a href="#" path="images/ncb/19.jpg"></a></li>
			
			<li><a href="#" path="images/ncb/21.jpg"></a></li>
			<li><a href="#" path="images/ncb/22.jpg"></a></li>
			<li><a href="#" path="images/ncb/23.jpg"></a></li>
	        <li><a href="#" path="images/ncb/24.jpg"></a></li>
	    
		    </ul>
	    </div>
    </body>
</html>