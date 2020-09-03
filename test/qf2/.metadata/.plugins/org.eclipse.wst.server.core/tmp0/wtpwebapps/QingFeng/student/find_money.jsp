<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
	src="../js/jquery-easyui-1.5.2/jquery.min.js"></script>
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="../js/jquery-easyui-1.5.2/themes/gray/easyui.css" />
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="../js/jquery-easyui-1.5.2/themes/icon.css" />
<script type="text/javascript"
	src="../js/jquery-easyui-1.5.2/jquery.easyui.min.js" charset="utf-8"></script>
<script type="text/javascript"
	src="../js/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js"
	charset="utf-8"></script>


<link rel="stylesheet" type="text/css" href="../css/image_body.css" />

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

<%
	String emp_id = request.getParameter("emp_id");
%>

<script type="text/javascript">
	/*----------------------------------------------------------------------------------*/
	

</script>


<script type="text/javascript">
	/*--------------------------按钮验证码------------------------------------*/

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
	<form  name="Find_money" action="Find_money" method="post" >
		<div class="bj">
			<div class="qj">
		<p><label class="t">姓名：</label><input type="text" id="s_name" name="student.s_name" class="te" /><font id="fon">&nbsp;&nbsp;</font></p>
		<p><label class="t">预留手机号：</label><input type="text" id="s_phone" name="student.s_phone" class="te"/>
			<input class="m" id="yz" type="button" value="获取验证码" onclick="sname_test()"/><font id="fon2">&nbsp;&nbsp;</font>
		</p>
			<p>
				<label class="t">手机验证码：</label><input type="text" value="" class="te_y"
					id="" title="" />
				
				
			</p>	
			
			<p>
				<label class="t"></label><input type="button" value="登录" class="bu" onclick="submittest()"/>
			</p>
			
				</div>
				</div>
		</form>
	
	<script type="text/javascript">
		//填写完姓名时验证
			function sname_test(){
				var s_name = $('#s_name').val();
			
				$.ajax({
					async : true,
					cache : true,
					url : 'Find_stu.action',
					type : 'post',
					data : {
						's_name' : s_name,
					},
					dataType : 'text',
					success : function(data) {
						if(data == '账户名不存在'){
							document.getElementById("fon").style.fontSize="10px";
							$('#fon').html("&nbsp;&nbsp;&nbsp;注册名不存在");
							$('#fon2').html('');
							document.getElementById("fon").style.color="red";
						}else{    //账号存在
							document.getElementById("fon").style.color="green";
							document.getElementById("fon").style.fontSize="20px";
							$('#fon').html("&nbsp;&nbsp;&nbsp;✔");
							sphone_test();
						}
					
						
					},
					error : function(XMLHttpRequest, textStatus) {
						alert("系统繁忙,请稍候再试!");
					}
				});
				
				

			}
			
		//填写完手机号码时验证
	function sphone_test(){
		
		var s_name = $('#s_name').val();
		var s_phone = $('#s_phone').val();
		$.ajax({
			async : true,
			cache : true,
			url : 'Find_sphone.action',
			type : 'post',
			data : {
				's_name' : s_name,
				's_phone' : s_phone,
			},
			dataType : 'text',
			success : function(data) {
				if(data == '✔'){    //账号手机都正确
					document.getElementById("fon2").style.color="green";
					document.getElementById("fon2").style.fontSize="20px";
					$('#fon2').html("&nbsp;&nbsp;&nbsp;✔");
					$("#yz").attr("disabled", "");
					js(60);
				
				}else{
					document.getElementById("fon2").style.color="red";
					document.getElementById("fon2").style.fontSize="10px";
					$('#fon2').html("&nbsp;&nbsp;&nbsp;"+data);
				}
				
			},
			error : function(XMLHttpRequest, textStatus) {
				alert("系统繁忙,请稍候再试!");
			}
		});

	}
		
		//查询缴费提交
		function submittest(){
			var a = document.getElementById("fon").innerHTML;
			var b = document.getElementById("fon2").innerHTML;
			if(a == '&nbsp;&nbsp;&nbsp;✔' && b == '&nbsp;&nbsp;&nbsp;✔'){   //全部验证通过
				//提交form表单
				document.Find_money.submit();
			}
			
		}
	
	</script>
</body>
</html>