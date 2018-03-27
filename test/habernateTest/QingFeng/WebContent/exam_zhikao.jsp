<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>职考报名</title>
<link type="text/css" href="css/exam_c.css" />
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/jquery.min.js"></script>
<script type="text/javascript"
	src="script/jquery.min.js"></script>
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="script/jquery-easyui-1.5.2/themes/gray/easyui.css" />
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="script/jquery-easyui-1.5.2/themes/icon.css" />
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/jquery.easyui.min.js" charset="utf-8"></script>
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js"
	charset="utf-8"></script>
	
<link type="text/css" href="css/formimg.css" />
<style type="text/css">
body {
	padding: 0;
	margin: 10;
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

.bs {
	font-size: 15px;
	width: 60px;
	height: 35px;
}

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

.te:focus{
	border:1px solid rgba(4, 146, 214, 0.28);
	box-shadow:1px 1px 3px rgba(4, 146, 214, 0.28), 0 1px 2px rgba(4, 146, 214, 0.28) inset;
	border-radius:2px;
	padding-right:30px;
	-moz-transition:padding .25s;
	-webkit-transition:padding .25s;
	-o-transition:padding .25s;
	transition:padding .25s;
}

.te:hover{
	letter-spacing: 1px;
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}

.te_s {
	width: 300px;
	height: 35px;
	border-radius: 5px;
	border: 0.5px solid #0492d6;
	padding-left: 5px;
	font-size: 25px;
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

.te_s:hover {
	letter-spacing: 1px;
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}

.te_y {
	width: 130px;
	height: 35px;
	border-radius: 5px;
	border: 0.5px solid #0492d6;
	padding-left: 5px;
	font-size: 25px;
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

.t {
	width: 150px;
	margin-top: 3px;
	display: inline-block;
	float: left;
	padding: 3px;
	font-family: '楷体';
	font-size: 22px;
}

.m {
	width: 130px;
	height: 39px;
	/* top: 3px; */
	border-top: 5px;
	border-left: 2px;
	border-radius: 5px;
	border: 0.5px solid #0492d6;
	padding-left: 5px;
	font-size: 16px;
	/* font-color:#fff; */
	background-color: #fff;
}

.m:hover {
	/* letter-spacing: 0px; */
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}
</style>

<script type="text/javascript">
	$(function () {
	//$(document).ready(function(){
		$("#yz").click(function(){
			//setTimeout(function(){});
			$("#yz").attr("disabled","");
			js(60);
			//alert("TTT");
		});
	}); 
	function js(s){
		if(s <= 0){
			$("#yz").val("重新获取");
			$("#yz").removeAttr("disabled");
			return;
		}
		$("#yz").val(s+"秒后重新获取");
		setTimeout("js("+(s-1)+")",1000);
	}
	
	$(function(){
        
        var defaultInd = 0;
        var list = $('#js_ban_content').children();
        var count = 0;
        var change = function(newInd, callback){
            if(count) return;
            count = 2;
            $(list[defaultInd]).fadeOut(400, function(){
                count--;
                if(count <= 0){
                    if(start.timer) window.clearTimeout(start.timer);
                    callback && callback();
                }
            });
            $(list[newInd]).fadeIn(400, function(){
                defaultInd = newInd;
                count--;
                if(count <= 0){
                    if(start.timer) window.clearTimeout(start.timer);
                    callback && callback();
                }
            });
        }
        
        var next = function(callback){
            var newInd = defaultInd + 1;
            if(newInd >= list.length){
                newInd = 0;
            }
            change(newInd, callback);
        }
        
        var start = function(){
            if(start.timer) window.clearTimeout(start.timer);
            start.timer = window.setTimeout(function(){
                next(function(){
                    start();
                });
            }, 8000);
        }
        
        start();
        
        $('#js_ban_button_box').on('click', 'a', function(){
            var btn = $(this);
            if(btn.hasClass('right')){
                //next
                next(function(){
                    start();
                });
            }
            else{
                //prev
                var newInd = defaultInd - 1;
                if(newInd < 0){
                    newInd = list.length - 1;
                }
                change(newInd, function(){
                    start();
                });
            }
            return false;
        });
        
    })();
</script>
	
</head>
<body style="">
	<!-- 姓名、身份证、手机号、报考职业类型、验证码 -->
	
	<form action="" style="">
		<div class="qj">
			<p>
				<label class="t">姓名：</label><input type="text" value="" class="te"
					id="" title="" />
			</p>
			<p>
				<label class="t">手机号：</label><input type="text" value="" class="te"
					id="" title="" />
			</p>
			<p>
				<label class="t">身份证号：</label><input type="text" value="" class="te_s"
					id="" title="" />
			</p>
			<p>
				<label class="t">报考证书：</label><input type="text" value="" class="te"
					id="" title="" />
			</p>
			<p>
				<label class="t">验证码：</label><input type="text" value="" class="te_y"
					id="" title="" />
				<!-- <button class="m" id="yz" title="点一点切换">点击获取验证码</button> -->
				<input class="m" id="yz" type="button" value="发送验证码" />
			</p>
			<p>
				<label class="t"></label><input type="submit" value="确认" class="bu"
					id="" title="" />
			</p>
		</div>
	</form>
	
</body>
</html>