<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理登录</title>
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/jquery.min.js"></script>
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="script/jquery-easyui-1.5.2/themes/gray/easyui.css" />
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="script/jquery-easyui-1.5.2/themes/icon.css" />
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="script/jquery-easyui-1.5.2/themes/mobile.css" />
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="script/jquery-easyui-1.5.2/themes/color.css" />
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/jquery.easyui.min.js" charset="utf-8"></script>
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js"
	charset="utf-8"></script>
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/jquery.easyui.mobile.js"></script>
<script type="text/javascript" src="script/jquery.js"></script>

<style>
#tm {
	background: url(images/bj.jpg) ;
	background-repeat:round;
}

.qj {
	margin-top: 2%;
	margin-left: 30%;
}

.t {
	width: 110px;
	margin-top: 3px;
	display: inline-block;
	/* float: right; */
	padding: 3px;
	font-family: '楷体';
	font-size: 22px;
	color: aliceblue;
}

.t_s {
	width: 50px;
	margin-top: 3px;
	display: inline-block;
	float: left;
	padding: 3px;
	font-family: '楷体';
	font-size: 22px;
	-webkit-user-select: none;
	-khtml-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none; 
}

.te_y {
	width: 130px;
	height: 35px;
	border-radius: 5px;
	border: 0.5px solid #0492d6;
	padding-left: 5px;
	font-size: 25px;
	background-color: rgba(255, 255, 255, 0.8);
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

.te_y:hover {
	letter-spacing: 1px;
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}

.m {
	width: 120px;
	height: 42px;
	top: 3px;
	border-top: 5px;
	border-left: 2px;
	border-radius: 5px;
	border: 0.5px solid #0492d6;
	padding-left: 5px;
	font-size: 17px;
	/* font-color:#fff; */
	background-color: rgba(255, 255, 255, 0.8);
}

.m:hover {
	/* letter-spacing: 0px; */
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.1);
}
</style>

<script>
	$(function() {
		//自动轮转
		setInterval("$(\".next\").click()", 3000);
		var page = 1;
		//向右滚动 
		$(".next").click(function() { //点击事件 
			var v_wrap = $(this).parents(".scroll"); // 根据当前点击的元素获取到父元素 
			var v_show = v_wrap.find(".scroll_list"); //找到图片展示的区域 
			var v_cont = v_wrap.find(".box"); //找到图片展示区域的外围区域 
			var v_width = v_cont.width();
			var len = v_show.find("li").length; //图片个数 
			var page_count = Math.ceil(len); //只要不是整数，就往大的方向取最小的整数 
			if (!v_show.is(":animated")) {
				if (page == page_count) {
					v_show.animate({
						left : '0px'
					}, "slow");
					page = 1;
				} else {
					v_show.animate({
						left : '-=' + v_width
					}, "slow");
					page++;
				}
			}
		});
		//向左滚动 
		$(".prev").click(function() { //点击事件 
			var v_wrap = $(this).parents(".scroll"); // 根据当前点击的元素获取到父元素 
			var v_show = v_wrap.find(".scroll_list"); //找到图片展示的区域 
			var v_cont = v_wrap.find(".box"); //找到图片展示区域的外围区域 
			var v_width = v_cont.width();
			var len = v_show.find("li").length; //图片个数 
			//只要不是整数，就往大的方向取最小的整数 
			var page_count = Math.ceil(len);
			if (!v_show.is(":animated")) {
				if (page == 1) {
					v_show.animate({
						left : '-=' + v_width * (page_count - 1)
					}, "slow");
					page = page_count;
				} else {
					v_show.animate({
						left : '+=' + v_width
					}, "slow");
					page--;
				}
			}
		});
	});

	/*---------------------------------------------------------------------------*/
	var te_y;
	function yzm() {
		te_y = "";
		var cd = 4;
		var yzm = document.getElementById("yzm");
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
		}
	}

	function yznr() {
		var sr = document.getElementById("sr").value;
		if (sr.length <= 0) {
			
			//alert("请输入验证码");
			$("#mzy").show();
		} else if (sr.toUpperCase() != te_y.toUpperCase()) {
		//	alert("验证码输入错误");
			$("#mzy").show();
			yzm();
			$("#sr").val("").focus();
		} else {
		//	alert("正确");
		}
		
	 var emp_name=$("#empl_name").val();
	 var emp_pwd=$("#emp_pwd").val();
		$.ajax({
			async :true,
			cache : true,
			url : 'Sel_UserAndUser',
			type : 'post',
			data : {
				'empl_name':emp_name,
				'emp_pwd':emp_pwd
			},dataType :'json',
			success: function(data){
				if(data.age=='00'){		
					$("#zh").show();
					$("#mima").show();
				}
				if(data.age=='11'&&sr.toUpperCase() == te_y.toUpperCase()){
				//	alert("成功！");
					$.ajax({
						url:'Sel_UserAndId.action',
						async:true,
						cache:true,
						type:'post',
						data:{
							'empl_name':emp_name,
							'emp_pwd':emp_pwd
						},dataType:'json',
						success:function(data){
							//登录成功
							window.location.href="Goto_indexs.action";

						},error:function(){
							alert("你登入失败！");
						}
					});
					
				}
				if(data.age=='22'){
					$("#mima").show();		
					//document.getElementById("example").value="somethind";
				}
				
				
				
			},error:function(XMLHttpRequest,textStates){
				alert('服务繁忙！');
			}
			
		});
	}
	//隐藏
	$(document).ready(function(){
		
		$("#empl_name").blur(function(){
			alert("tttttttt");
			$("#zh").hide();
		});
		$("#emp_pwd").blur(function(){
			alert("lllllll");
			$("#mima").hide();
		});
		$("#sr").blur(function(){
		//	alert("ppp");
			$("#mzy").hide();
		});
	});
	
	
	/*--------------------------------图片轮播--------------------------------------------*/
	
</script>
</head>
<body onload="yzm()">

	<div class="easyui-navpanel" id="tm">
		<!-- <header>
			<div class="m-toolbar">
				<span class="m-title">后台登录</span>
			</div>
		</header> -->
		<div style="height: 70px"></div>
		<div
			style="margin: 20px auto; width: 100px; height: 100px; border-radius: 100px; overflow: hidden">
			<img src="images/01.jpg"
				style="margin: 0; width: 100%; height: 100%;">
		</div>
		<div style="padding: 0 20px">
			<div style="margin-bottom: 10px; text-align: center;"  >
			<p  id="zh" style="color:red;display: none">账户错误！</p>
				<input id="empl_name" class="easyui-textbox" 
					data-options="prompt:'输入用户账号',iconCls:'icon-man'"
					style="width: 30%; height: 38px"  />
			</div>
			<div style="text-align: center;">
			<p  id="mima" style="color:red;display: none">密码错误！</p>
				<input id="emp_pwd" class="easyui-passwordbox"
					data-options="prompt:'输入用户密码'"
					style="width: 30%; height: 38px">
			</div>
			<!-- <div style="text-align:center;margin-top:30px">
				<a href="#" class="easyui-linkbutton" plain="true" outline="true" style="width:100px;height:35px;">
				<span style="font-size:16px">验证码</span></a> 
			</div> -->

			<form name="login_form" id="" onsubmit="yznr()">
				<p class="qj">
					<div style="text-align: center;">
					<p  id="mzy" style="color:red;display: none">验证码错误！</p>
						<button class="m" id="yzm" onclick="yzm()" title=""></button>
					
						<input type="text" value="" class="te_y" id="sr" title="账号" /> 
						<span style="width: 50px;"></span>
						<!-- <label class="t_s"></label> -->
						<label class="t_s"></label><label class="t" onclick="yzm()">更换验证码</label>
					</div>
					
				</p>
			</form>

			<div style="text-align: center; margin-top: 30px">
				<a href="#" class="easyui-linkbutton c2"
					style="width: 10%; height: 40px"><span style="font-size: 16px"
					onclick="yznr()" >Login</span></a>
			</div>

		</div>


		<a class="next"></a>
	</div>

</body>
</html>