<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
	src="../script/jquery-easyui-1.5.2/jquery.min.js"></script>

<link rel="stylesheet" type="text/css" href="../css/image_body.css" />

<title>&nbsp;清风教育网 - 成考报名</title>
<link rel="icon" href="../images/logo/logo2.ico" />
<style type="text/css">
body {
	padding: 0;
	margin: 0;
	/* background-image: url(images/bj.jpg); */
	/* background-size:contain; */
	/* background-origin:content-box; */
	background-color:rgba(255, 255, 255, 0.8);
}

.bj {
	/* background-repeat: round; */
	/* width:100%;
	height:100%; */
	
	top:160%;
}

.qj {
	margin-top: 9%;
	margin-left: 30%;
	position: absolute;
	top:37%;
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
	padding-right: 36px;
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
	letter-spacing: 0.3px;
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
	letter-spacing: 0.2px;
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}

/*图片*/
.pic-box div {
	float: left;
	width: 45px;
	height: 768px;
	display: block;
}

.pic-box div.pic-box01 {
	background: url(images/pic01.png) no-repeat right;
}

.pic-box div.pic-box02 {
	background: url(images/pic02.png) no-repeat left;
	width: 0px;
	transition: width 2s;
	-moz-transition: width 2s;
	-webkit-transition: width 2s;
	-o-transition: width 2s;
}

.pic-box div.pic-box03 {
	background: url(images/pic03.png) no-repeat left;
}

.pic-box:hover>div.pic-box02 {
	width: 980px;
}

.pic-tt {
	padding: 0;
	margin: 0;
	position: absolute;
	top: 109%;
	left: 12%;
	width: auto;
}

h1 {
	float: inherit;
	left: 44%;
	position: absolute;
	line-height:45px;
	top:5px;
}

.img {
	position: absolute;
}

ul{
	list-style: none;
	clear:none;
	height:65px;
	margin:5px;
	float:5px;
	line-height:45px;
	top:5px;
	font-stretch:expanded;
}

li{
	width:250xp;
	height:55px;
	float:right;
	padding:5px;
	margin:5px;
	
}

.bz{
	font-size:10px;
	font-family: '楷体';
	position: absolute;
	font:red;
	right:1px;
	margin:15px;
}

input::-webkit-input-placeholder {
	color: #999;
	font-family: '楷体';
	font-size: 16px;
}
input:-ms-input-placeholder { /*IE10+*/
	color: #999;
	font-family: '楷体';
	font-size: 16px;
}
input:-moz-placeholder { /*Firefox4-18*/
	color: #999;
	font-family: '楷体';
	font-size: 16px;
}
input::-moz-placeholder { /*Firefox19+*/
	color: #999;
	font-family: '楷体';
	font-size: 16px;
}

</style>
<script type="text/javascript">
	

$(function() {
	var sel2 = document.getElementById("academy");
	var opt2 = document.createElement("option");
	opt2.text = '选择院校';
	opt2.value = 0;
	sel2.appendChild(opt2);

	var sel = document.getElementById("major");
	var opt = document.createElement("option");
	opt.text = '选择专业';
	opt.value = 0;
	sel.appendChild(opt);
	$.ajax({
		async : true,
		cache : true,
		url : 'GetAcademy_list.action',
		type : 'post',
		data : {
			'id' : 25,
		},
		dataType : 'json',
		success : function(data) {
			$.each(data, function(index, content) {
				// alert("角色名称：" + content.u_name + " ，ID： " + content.u_id)
				var sel2 = document.getElementById("academy");
				var opt2 = document.createElement("option");
				opt2.text = content.a_school;
				opt2.value = content.a_id;

				sel2.appendChild(opt2);

			});
		},
		error : function(XMLHttpRequest, textStatus) {
			alert("系统繁忙,请稍候再试!");
		}
	});

});

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
	
function yy(){
		
		alert("DADSA");
		te_y = "";
		var cd = 4;
		var yzm = document.getElementById("sjm");
		var yzsz = new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'a', 'b', 'c', 'd',
				'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
				'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B',
				'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
				'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
		for (var i = 0; i < cd; i++) {
			var n = Math.floor(Math.random() * 52);
			te_y += yzsz[n];
			
		}
		
		if (yzm) {
			yzm.className = "te_y";
			yzm.innerHTML = te_y;
			alert(te_y);
			$("#sjm").innerHTML=te_y;
		}
		
		var s_phone = $('#s_phone').val();
		
		$.ajax({
			async : true,
			cache : true,
			url : 'yzm.action',
			type : 'post',
			data : {
				's_phone' : s_phone,
				'te_y' :te_y
			},
			dataType : 'text',
			success : function(data) {
				alter("成功向"+s_phone+"发送验证码！");
			
				
			},
			error : function(XMLHttpRequest, textStatus) {
				alert("系统繁忙,请稍候再试!");
			}
		});
	}
	
	/*----------------------------------提交表单------------------------------------*/

	function submitcheck() {
		alert(document.student_form.action);
		var aca = document.getElementById('academy').value;
		var maj = document.getElementById('major').value;
		alert(aca + "......" + maj);
		document.getElementById('aca').value = aca;
		document.getElementById('maj').value = maj;
		alert("改好：" + document.getElementById('aca').value + "....."
				+ document.getElementById('maj').value);

		return true;
		//document.student_form.submit();   //提交form表单
	}
</script>

<%
	String emp_id = request.getParameter("emp_id");
%>
</head>
<body>
	<div style="top:10%;height:460px;">
		<h1 style="font-family: '楷体';">合作院校</h1>
		<div style="position: absolute;left:18%;top:7%;">
			<ul>
				<li>
					<img src="../images/school/dx3.png" title="江南大学" style="width:175px;">
					<img src="../images/school/dx11.png" title="电子科技大学" style="width:175px;"> 
					<img src="../images/school/dx2.png" title="东北师范大学" style="width:175px;">
					<img src="../images/school/dx12.png" title="福建师范大学" style="width:175px;">
					<img src="../images/school/dx7.png" title="网上农大" style="width:175px;">
				</li>
			</ul>
			<ul>
				<li> 
					<img src="../images/school/dx20.png" title="厦门大学" style="width:175px;">
					<img src="../images/school/dx5.png" title="四川农业大学" style="width:175px;">
					<img src="../images/school/dx15.png" title="华南师范大学" style="width:175px;"> 
					<img src="../images/school/dx14.png" title="北京外国语大学" style="width:175px;">
					<img src="../images/school/dx9.png" title="西南交通大学" style="width:175px;"> 
				</li>
			</ul>
			<ul>
				<li> 
					<img src="../images/school/dx10.png" title="重庆大学" style="width:175px;">
					<img src="../images/school/dx1.png" title="中国石油大学" style="width:175px;">
					<img src="../images/school/dx17.png" title="北京交通大学" style="width:175px;">
					<img src="../images/school/dx6.png" title="东北财经大学" style="width:175px;">
					<img src="../images/school/dx15.png" title="华南师范大学" style="width:175px;"> 
				</li>
			</ul>
			<ul>
				<li> 
					<img src="../images/school/dx19.png" title="南京大学" style="width:175px;">
					<img src="../images/school/dx4.png" title="中国地质大学(武汉)" style="width:175px;">
					<img src="../images/school/dx13.png" title="吉林大学" style="width:175px;"> 
					<img src="../images/school/dx8.png" title="华南理工大学" style="width:175px;">
					<img src="../images/school/dx18.png" title="北京语言大学" style="width:175px;"> 
				</li>
			</ul>
			<label class="bz" >
				<font color="red">本平台保证数据真实性</font>
			</label>
		</div>
		
	</div>
	<!-- 姓名、手机号、身份证、选择学校or专业(联动)、类型(专升本,直达本)、验证码 -->
		<form name="student_form" action="chengkao_Login" method="post" >
	<div class="bj">
		<div class="qj">
		<p><label class="t">姓名：</label><input type="text" name="student.s_name" class="te"/></p>
		<p><label class="t">身份证：</label><input type="text"  name="student.id_number" class="te"/><br/></p>
		
		<p>
				<label class="t">手机号：</label>
				<input type="text"  name="student.s_phone" class="te_y" id="sjm"/>
				<input class="m" id="s_phone" type="button" value="发送验证码" onclick="yy()" />
				<br/>
			</p>
		<p><label class="t">报考类型：</label>
			<select class="xl"
						name="student.s_gradations">
						<option value="" title="">--请选择--</option>
						<option value="高升专">高升专</option>
						<option value="专升本">专升本</option>
						<option value="直达本">直达本</option>
						
					</select><br/></p>
				<p>
					<label class="t">院校/专业：</label>
					 <select id="academy" name="student.academy_id"
						  onchange="getMajor(value)"  class="xl"></select>

					 <select id="major"  name="student.maj_id" class="xl"></select>
				</p>
				
				<input type="hidden" id="emp" name="emp_id" value="<%=emp_id %>"/><!-- 推荐老师id -->
				
			
				
				<p>
					<label class="t"></label><input type="submit" value="确认" class="bu"/>
				</p>
				</div>
				</div>
		</form>
		
		<div class="pic-tt">
		<h1 style="font-size:45px;font-family: '楷体';">祝:</h1>
		<div class="pic-box">

			<div class="pic-box01"></div>
			<div class="pic-box02"></div>
			<div class="pic-box03"></div>
		</div>
	</div>
	</div>
	<script type="text/javascript">
		function getMajor(value) { //根据院校获取专业
			var majsel = document.getElementById("major");
			var children = majsel.children; //获取select列表的所有子元素。
			for (var i = 0, len = children.length; i < len; i++) {
				majsel.removeChild(children[0]); //循环删除所有子元素
			}
			if (value == 0) {
				var sel = document.getElementById("major");
				var opt = document.createElement("option");
				opt.text = '选择专业';
				opt.value = 0;

				sel.appendChild(opt);
			}

			$.ajax({
				async : true,
				cache : true,
				url : 'GetMajor_list.action',
				type : 'post',
				data : {
					'a_id' : value,
				},
				dataType : 'json',
				success : function(data) {
					$.each(data, function(index, content) {
						var sel = document.getElementById("major");
						var opt = document.createElement("option");
						opt.text = content.maj_name;
						opt.value = content.maj_id;

						sel.appendChild(opt);

					});
				},
				error : function(XMLHttpRequest, textStatus) {
					alert("系统繁忙,请稍候再试!");
				}
			});

		}
	</script>
</body>
</html>