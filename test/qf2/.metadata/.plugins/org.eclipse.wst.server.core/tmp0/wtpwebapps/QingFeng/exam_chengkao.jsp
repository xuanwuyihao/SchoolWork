<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/jquery.min.js"></script>

<link rel="stylesheet" type="text/css" href="css/image_body.css" />

<title>成考报名</title>
<style type="text/css">
body {
	padding: 0;
	margin: 0;
	/* background-image: url(images/bj.jpg); */
	/* background-size:contain; */
	/* background-origin:content-box; */
}

.bj {
	
	/* background-repeat: round; */
	/* width:100%;
	height:100%; */
}

.qj {
	margin-top: 10%;
	margin-left: 30%;
}

.la {
	top: 20px;
	float: center;
	width: 30%;
	height: 35px;
	border: 0;
	border-radius: 8px;
	border-color: #000;
	word-spacing: normal;
	font-family: '宋体';
	font-size: 25px;
}

.bu {
	border-radius: 6px;
	font-family: '楷体';
	font-size: 22px;
	color: #fff;
	background: rgba(26, 228, 108, 0.52);
	border: 0 solid;
	width: 150px;
	height: 35px;
}

.bu:hover {
	letter-spacing: 1px;
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}

.di {
	width: 500px;
	height: 100%;
	align: center;
	background: rgba(255, 255, 255, 0.5);
}

.bs {
	text-align: center;
	border: 1px solid #0492d6;
	background: rgba(255, 255, 255, 0.3);
	color: red;
	width: 55px;
	height: 35px;
	font-size: 15px;
	border-radius: 5px;
}

.p {
	align: center;
	width: 500px;
	height: 50px;
	background: rgba(233, 233, 233, 0.2);
	padding-top: 18px;
	padding-left: 35px;
	border-radius: 5px;
}

/* .bs {
	font-size: 15px;
	width: 60px;
	height: 35px;
} */
.ff {
	font-size: 25px;
	width: 300px;
	height: 35px;
	color: red;
	padding-bottom: 35px;
}

.te {
	width: 200px;
	height: 35px;
	border-radius: 5px;
	border: 0.5px solid #0492d6;
	padding-left: 5px;
	font-size: 25px;
}

.te_s {
	width: 300px;
	height: 35px;
	border-radius: 5px;
	border: 0.5px solid #0492d6;
	padding-left: 5px;
	font-size: 25px;
}

.te_y {
	width: 130px;
	height: 35px;
	border-radius: 5px;
	border: 0.5px solid #0492d6;
	padding-left: 5px;
	font-size: 25px;
}

.te:focus {
	border: 1px solid rgba(4, 146, 214, 0.28);
	box-shadow: 1px 1px 3px rgba(4, 146, 214, 0.28), 0 1px 2px
		rgba(4, 146, 214, 0.28) inset;
	border-radius: 2px;
	padding-right: 30px;
	-moz-transition: padding .25s;
	-webkit-transition: padding .25s;
	-o-transition: padding .25s;
	transition: padding .25s;
}

.te_s:focus {
	border: 1px solid rgba(4, 146, 214, 0.28);
	box-shadow: 1px 1px 3px rgba(4, 146, 214, 0.28), 0 1px 2px
		rgba(4, 146, 214, 0.28) inset;
	border-radius: 2px;
	padding-right: 30px;
	-moz-transition: padding .25s;
	-webkit-transition: padding .25s;
	-o-transition: padding .25s;
	transition: padding .25s;
}

.te_y:focus {
	border: 1px solid rgba(4, 146, 214, 0.28);
	box-shadow: 1px 1px 3px rgba(4, 146, 214, 0.28), 0 1px 2px
		rgba(4, 146, 214, 0.28) inset;
	border-radius: 2px;
	padding-right: 30px;
	-moz-transition: padding .25s;
	-webkit-transition: padding .25s;
	-o-transition: padding .25s;
	transition: padding .25s;
}

.te:hover {
	letter-spacing: 1px;
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}

.te_s:hover {
	letter-spacing: 1px;
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}

.te_y:hover {
	letter-spacing: 1px;
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}

.m {
	width: 130px;
	height: 39px;
	top: 3px;
	border-top: 5px;
	border-left: 2px;
	border-radius: 5px;
	border: 0.5px solid #0492d6;
	padding-left: 5px;
	font-size: 16px;
	/* font-color:#fff; */
	background-color: #fff;
}

option {
	font-weight: normal;
	font-family: '楷体';
	font-size: auto;
	display: block;
	white-space: pre;
	min-height: 1.2em;
	padding: 0px 2px 1px;
}

.m:hover {
	/* letter-spacing: 0px; */
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}

.t {
	width: 150px;
	margin-top: 3px;
	display: inline-block;
	float: left;
	padding: 3px;
	font-family: '楷体';
	font-size: 22px;
}

.xl {
	border: 1;
	border-color: #233;
	padding: 0;
	margin: 0;
	width: 150px;
	height: 35px;
	font-family: '楷体';
	font-size: 22px;
}

.xl:hover {
	letter-spacing: 1px;
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}
</style>
<script type="text/javascript">
	var yx = [ "院校", "江西农大", "南昌大学", "赣南师范", "江西理工" ];
	var zy = [ [ "专业" ], [ "计算机", "林业", "高分子" ], [ "财经", "政法", "历史", "法律" ],
			[ "语文", "英语", "数学", "历史", "地理" ], [ "高分子", "计算机", "物理", "科技" ] ];

	window.onload = function() {
		var xy = document.getElementById("y");
		xy.length = yx.length;
		for (var i = 0; i < yx.length; i++) {
			xy.options[i].text = yx[i];
			xy.options[i].value = yx[i];

		}
		//alert("选择的是："+yx[i]);
		//alert("选择的院校是："+document.getElementById("y").value);
	}

	function xz(index) {
		var x = document.getElementById("lb");
		x.length = zy[index].length;
		for (var i = 0; i < zy[index].length; i++) {
			x.options[i].text = zy[index][i];
			x.options[i].value = zy[index][i];
		}
		alert("选择的专业是：" + document.getElementById("y").value + "的"
				+ document.getElementById("lb").value);
	}

	/*--------------------------按钮验证码------------------------------------*/
	$(function() {
		//$(document).ready(function(){
		$("#yz").click(function() {
			//setTimeout(function(){});
			$("#yz").attr("disabled", "");
			js(60);
			//alert("TTT");
		});
	});
	function js(s) {
		if (s <= 0) {
			$("#yz").val("重新获取");
			$("#yz").removeAttr("disabled");
			return;
		}
		$("#yz").val(s + "秒后重新获取");
		setTimeout("js(" + (s - 1) + ")", 1000);
	}
	
	
</script>
</head>
<body>
	
	<!-- 姓名、手机号、身份证、选择学校or专业(联动)、类型(专升本,直达本)、验证码 -->
	<div class="bj">
		<div class="qj">
			<p></p>
			<p>
				<label class="t">姓名：</label><input type="text" value="" class="te"
					id="" title="" />
			</p>
			<p>
				<label class="t">手机号：</label><input type="text" value="" class="te"
					id="" title="" />
			</p>
			<p>
				<label class="t">身份证号：</label><input type="text" value=""
					class="te_s" id="" title="" />
			</p>

			<p>
				<label class="t">院校/专业：</label> <select id="y"
					onchange="xz(this.selectedIndex)" class="xl">

				</select> <select id="lb" class="xl">

				</select>
			</p>
			<p>
				<label class="t">报考类型：</label> <select class="xl">
					<option value="" title="">--请选择--</option>
					<option value=""> 专升本</option>
					<option value=""> 直达本</option>
				</select>
			</p>
			<p>
				<label class="t">验证码：</label><input type="text" value=""
					class="te_y" id="" title="" /> <input class="m" id="yz"
					type="button" value="发送验证码" />
			</p>
			<p>
				<label class="t"></label><input type="submit" value="确认" class="bu"
					id="" title="" />
			</p>
		</div>
	</div>
</body>
</html>