<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>&nbsp;清风教育网 - 学生注册</title>
<link rel="icon" href="images/logo/logo2.ico" />
<script type="text/javascript" src="script/jquery.min.js"></script>
<style type="text/css">
body {
	padding: 0;
	margin: 0;
	/* background-image: url(images/bj.jpg); */
	/* background-size:contain; */
	/* background-origin:content-box; */
}

ul {
	list-style: none;
	padding-left: 0;
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

.m:hover {
	/* letter-spacing: 0px; */
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.9);
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

/*---------------------------------------------------*/
.formbox {
	width: 85%;
	margin: 40px auto;
}

.formcon {
	padding: 10px 0;
	border: solid 1px #ddd
}

.formcon table input {
	width: 200px;
}

.formcon table td {
	padding: 5px;
	line-height: 24px;
}
/* flow_steps */
.flow_steps {
	height: 63px;
	overflow: hidden;
	width:60%;
}

.flow_steps li {
	float: left;
	height: 50px;
	padding: 0 8% 0 30px;
	line-height: 43px;
	font-size: 16px;
	text-align: center;
	background: url(images/barbg2.png) no-repeat 100% 0 #E4E4E4;
	font-weight: bold;
	text-align: center;
}

.flow_steps li.done {
	background-position: 100% -107px;
	background-color: #FFEDA2;
}

.flow_steps li.current_prev {
	background-position: 100% -53px;
	background-color: #FFEDA2;
}

.flow_steps li.current {
	color: #fff;
	background-color: #990D1B;
}

.flow_steps li#qzfs.current, .flow_steps li.last {
	background-image: none;
}

/*================================================================*/

.Scroller {
	line-height: 45px;
	border: 1px solid #D4D4D4;
	padding: 0px 10px;
	height: 45px;
	width: 35%;
	float:right;
}

.Scroller * {
	margin: 0px;
	padding: 0px;
}

.ScrollMid {
	float: left;
}

.ScrollMid .uls {
	width: 800px;
	float: left;
}

.ScrollMid .lis {
	list-style: none;
	float: left;
	width: 390px;
	padding-left: 10px;
	line-height: 45px;
}
</style>
<script type="text/javascript">
	/* var $ = function(id) {
		return "string" == typeof id ? document.getElementById(id) : id;
	};
	var Class = {
		create : function() {
			return function() {
				this.initialize.apply(this, arguments);
			}
		}
	}
	Object.extend = function(destination, source) {
		for ( var property in source) {
			destination[property] = source[property];
		}
		return destination;
	}
	function addEventHandler(oTarget, sEventType, fnHandler) {
		if (oTarget.addEventListener) {
			oTarget.addEventListener(sEventType, fnHandler, false);
		} else if (oTarget.attachEvent) {
			oTarget.attachEvent("on" + sEventType, fnHandler);
		} else {
			oTarget["on" + sEventType] = fnHandler;
		}
	};
	var Scroller = Class.create();
	Scroller.prototype = {
		initialize : function(idScroller, idScrollMid, options) {
			var oThis = this, oScroller = $(idScroller), oScrollMid = $(idScrollMid);
			this.SetOptions(options);
			this.Side = this.options.Side || [ "up" ];//方向 
			this.scroller = oScroller; //对象 
			this.speed = this.options.Speed; //速度 
			this.timer = null; //时间 
			this.pauseHeight = 0; //定高 
			this.pauseWidth = 0; //定宽 
			this.pause = 0; //定高(宽) 
			this.side = 0; //参数 
			//用于上下滚动 
			this.heightScroller = parseInt(oScroller.style.height)
					|| oScroller.offsetHeight;
			this.heightList = oScrollMid.offsetHeight;
			//用于左右滚动 
			this.widthScroller = parseInt(oScroller.style.width)
					|| oScroller.offsetWidth;
			this.widthList = oScrollMid.offsetWidth;
			//js取不到css设置的height和width 
			oScroller.style.overflow = "hidden";
			oScrollMid.appendChild(oScrollMid.cloneNode(true));
			oScrollMid.appendChild(oScrollMid.cloneNode(true));
			addEventHandler(oScroller, "mouseover", function() {
				oThis.Stop();
			});
			addEventHandler(oScroller, "mouseout", function() {
				oThis.Start();
			});
			this.Start();
		},
		//设置默认属性 
		SetOptions : function(options) {
			this.options = {//默认值 
				Step : 1,//每次变化的px量 
				Speed : 20,//速度(越大越慢) 
				Side : [ "up" ],//滚动方向:"up"是上，"down"是下，"left"是左，"right"是右 
				PauseHeight : 0,//隔多高停一次 
				PauseWidth : 0,//隔多宽停一次 
				//当上下和左右一起使用时必须设置PauseHeight和PauseWidth来设置转向位置 
				PauseStep : 3000
			//停顿时间(PauseHeight或PauseWidth大于0该参数才有效) 
			};
			Object.extend(this.options, options || {});
		},
		//转向 
		Turn : function() {
			//通过设置方向数组的排列来转向 
			this.Side.push(this.Side.shift().toLowerCase());
		},
		//上下滚动 
		ScrollUpDown : function() {
			this.pause = this.pauseHeight;
			this.scroller.scrollTop = this.GetScroll(this.scroller.scrollTop,
					this.heightScroller, this.heightList,
					this.options.PauseHeight);
			this.pauseHeight = this.pause;
			var oThis = this;
			this.timer = window.setTimeout(function() {
				oThis.Start();
			}, this.speed);
		},
		//左右滚动 
		ScrollLeftRight : function() {
			this.pause = this.pauseWidth;
			//注意:scrollLeft超过1400会自动变回1400 注意长度 
			this.scroller.scrollLeft = this
					.GetScroll(this.scroller.scrollLeft, this.widthScroller,
							this.widthList, this.options.PauseWidth);
			this.pauseWidth = this.pause;
			var oThis = this;
			this.timer = window.setTimeout(function() {
				oThis.Start();
			}, this.speed);
		},
		//获取设置滚动数据 
		GetScroll : function(iScroll, iScroller, iList, iPause) {
			var iStep = this.options.Step * this.side;
			if (this.side > 0) {
				if (iScroll >= (iList * 2 - iScroller)) {
					iScroll -= iList;
				}
			} else {
				if (iScroll <= 0) {
					iScroll += iList;
				}
			}
			this.speed = this.options.Speed;
			if (iPause > 0) {
				if (Math.abs(this.pause) >= iPause) {
					this.speed = this.options.PauseStep;
					this.pause = iStep = 0;
					this.Turn();
				} else {
					this.pause += iStep;
				}
			}
			return (iScroll + iStep);
		},
		//开始 
		Start : function() {
			//document.getElementById("test").innerHTML+=sTurn+","; 
			//方向设置 
			switch (this.Side[0].toLowerCase()) {
			case "right":
				if (this.widthList < this.widthScroller)
					return;
				this.side = -1;
				this.ScrollLeftRight();
				break;
			case "left":
				if (this.widthList < this.widthScroller)
					return;
				this.side = 1;
				this.ScrollLeftRight();
				break;
			case "down":
				if (this.heightList < this.heightScroller)
					return;
				this.side = -1;
				this.ScrollUpDown();
				break;
			case "up":
			default:
				if (this.heightList < this.heightScroller)
					return;
				this.side = 1;
				this.ScrollUpDown();
			}
		},
		//停止 
		Stop : function() {
			clearTimeout(this.timer);
		}
	}; */
	/*----------------------------------------------------------*/

	
	
	
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
	
</script>
</head>
<body>
<div class="bj">
					<div class="qj">
						<p>
							<label class="t">姓名：</label><input type="text" id="s_name"
								name="" class="te" /><font id="fon">&nbsp;&nbsp;</font>
						</p>
						<p>
							<label class="t">身份证号码：</label><input type="text" id=""
								name="" class="te_s" /><font id="fon">&nbsp;&nbsp;</font>
						</p>
						<!-- <p>
							<label class="t">姓名：</label><input type="text" id="s_name"
								name="" class="te" /><font id="fon">&nbsp;&nbsp;</font>
						</p>
						<p>
							<label class="t">姓名：</label><input type="text" id="s_name"
								name="" class="te" /><font id="fon">&nbsp;&nbsp;</font>
						</p> -->
						<p>
							<label class="t">预留手机号：</label><input type="text" id="s_phone"
								name="" class="te" />

						</p>
						<p>
							<label class="t">手机验证码：</label><input type="text" value=""
								class="te_y" id="" title="" /> 
							<input class="m" id="yz" type="button" value="发送验证码" onclick="yy()" />

						</p>

						<p>
							<label class="t"></label>
							<button type="button" class="bu" onclick="one()">提交</button>
						</p>
					</div>
				</div>
	
</body>
<script type="text/javascript">
	
</script>
</html>