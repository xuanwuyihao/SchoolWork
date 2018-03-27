<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 注意：此测试页面已废弃 -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<script type="text/javascript" src="script/tcjquery-1.4.4.min.js"></script>
<script type="text/javascript" src="script/tcjquery.reveal.js"></script>

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
/* reveal-modal */
.reveal-modal-bg {
	position: fixed;
	height: 100%;
	width: 100%;
	background-color: #000;
	z-index: 100;
	display: none;
	top: 0;
	left: 0;
}

.reveal-modal {
	visibility: hidden;
	top: 100px;
	left: 50%;
	margin-left: -300px;
	width: 520px;
	height: 350px;
	background: #eee url(images/10.jpg) no-repeat -70px 0px ;
	position: absolute;
	z-index: 101;
	padding: 30px 40px 34px;
	-moz-border-radius: 5px;
	-webkit-border-radius: 5px;
	border-radius: 5px;
	-moz-box-shadow: 0 0 10px rgba(0, 0, 0, .4);
	-webkit-box-shadow: 0 0 10px rgba(0, 0, 0, .4);
	-box-shadow: 0 0 10px rgba(0, 0, 0, .4);
	/*background-image:url(../../dy08.jpg)*/;
}

.reveal-modal .close-reveal-modal {
	font-size: 22px;
	line-height: .5;
	position: absolute;
	top: 8px;
	right: 11px;
	color: #aaa;
	text-shadow: 0 -1px 1px rbga(0, 0, 0, .6);
	font-weight: bold;
	cursor: pointer;
	font-size: 24px;
}

.reveal-modal h2 {
	font-size: 18px;
	color: #990000;
	padding: 0 0 20px 0;
}

.reveal-modal p {
	padding: 0 0 15px 0;
}

.bu {
	margin-left: 400px;
	margin-top: 5px;
	margin-bottom: 5px;
	width: 105px;
	height: 35px;
	border-radius: 5px;
	text-indent:3px;
	font:"楷体";
	font-size:18px;
	background: rgba(255,255,255,0.1) no-repeat;
	border: 0.5px solid gray;
	letter-spacing:3px;
}

.bu:hover{
	letter-spacing:1px;
	border: 0.5px solid red;
	color:red;
	background-color:rgba(255,255,255,0.5);
}

.input {
	width: 280px;
	height: 35px;
	margin-left: 60px;
	border-radius: 5px;
	border: 0.5px solid #0492d6;
	padding-left: 5px;
	font-size: 25px;
}

.input:focus{
	border:1px solid #F00;
	background-color:#FFC;
	color:#F00;
}

.ft {
	font-style: inherit;
	font: "华文行楷";
	font-size: 16px;
}

#dl{
	margin-top: 315px;
}
</style>
<script type="text/javascript">
	$(document).ready(function(){
		$("#bu").click(function(){
			alert("DDDD");
			//$("#myModal").close();
			
		});
	});
</script>
</head>
<body>
	<a
		style="display: block; width: 300px; margin: 50px auto; text-align: center; font-size: 18px; color: #5e5e5e; text-decoration: none;"
		href="javascript:void(0);" data-reveal-id="myModal"> 点击弹出-模拟帐户申请</a>
	<div id="myModal" class="reveal-modal">
		<h2>模拟帐户申请</h2>
		<p>
			<font class="ft">用户姓名：</font> <input name="111" type="text"
				class="input" size="20">
		</p>
		<p>
			<font class="ft">手机号码：</font> <input name="111" type="text"
				class="input" size="20">
		</p>
		<p>
			<font class="ft">身份证号：</font> <input name="111" type="text"
				class="input" size="35">
		</p>
		<p>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a class="close-reveal-modal" id="dl"><!--  -->
				<input name="sub" type="button" value="提交申请" class="bu" id="bu" />
			</a><!--  -->
		</p>
		<a class="close-reveal-modal">X</a>
	</div>

</body>
</html>