<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="s" uri="/struts-tags"%>
	<%@ page import="java.util.*" %>
	<%@ page import="com.qf.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>&nbsp;清风教育网 - 网上报名系统</title>
<link rel="icon" href="images/logo/logo2.ico" />
<link href="css/web.css" rel="stylesheet" type="text/css" />
<link href="css/webs2.css" rel="stylesheet" type="text/css" />
<link href="css/images.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="script/jquery.js"></script>
<script type="text/javascript"
	src="script/jquery.caroufredsel-6.0.4-packed.js"></script>
<script type="text/javascript" src="script/focus.js"></script>
<!-- <script type="text/javascript" src="script/jquery.min.js"></script> -->

<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=2.0&ak=DD279b2a90afdf0ae7a3796787a0742e">
	//v2.0版本的引用方式：src="http://api.map.baidu.com/api?v=2.0&ak=您的密钥"
	//v1.4版本及以前版本的引用方式：src="http://api.map.baidu.com/api?v=1.4&key=您的密钥&callback=initialize"
</script>

<style type="text/css">
.tb {
	border-radius: 6px;
	font-family: '楷体';
	font-size: 22px;
	color: #fff;
	background: rgba(27, 201, 255, 0.52);
	border: 0 solid;
	width: 100px;
	height: 35px;
	float:right;
}

.tb:hover {
	letter-spacing: 1px;
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}

a {
	text-decoration: none;
	/*color: blue;*/
	color: #fff;
}

a:hover {
	color: red;
}

.black_overlay {
	display: none;
	position: absolute;
	top: 0%;
	left: 0%;
	width: 100%;
	height: 100%;
	background-color: rgba(255, 255, 255, 0.1);
	z-index: 1001;
	-moz-opacity: 0.8;
	opacity: .80;
	filter: alpha(opacity = 88);
}

.white_content {
	display: none;
	position: absolute;
	top: 25%;
	left: 25%;
	width: 56%;
	height: 56%;
	padding: 20px;
	border: 10px solid rgba(255, 255, 255, 0.1);
	background-color: rgba(255, 255, 255, 0.1);
	z-index: 1002;
	overflow: auto;
}

.cb {
	position: absolute;
	/* right: 0px; */
	top: 300px;
	display: inline;
	border: 0px #FF00FF solid;
}
@keyframes .cb{
	0%{height: 0; }
	100%{height: 200px; }
	0%{opacity:0;}
	100%{opacity:200px;}
} 
.cb:hover{
	right:200px;
	/* float:left; */
	/* width:150px; */
	/* padding-left:150px; */
	/* border:1px #ff00ff solid; */
}

.im{
	z-index:9999;
}

.ims {
	width: 150px;
	height: 45px;
	display: none;
}

.ims:hover  {
	/* border-left: 150px; */
	display: inline;
	border: 0;
	width: 150px;
	height: 45px;
	font-size: 18px;
	z-index: 99999;
	background: rgba(155, 155, 155, 0.5);
}

/*侧边*/
.contactusdiyou {
	position: fixed; 
	right: -230px; 
	bottom: 0px; 
	_position: absolute; 
	width: 230px; 
	height: 100%; 
	background: #009aff; 
	z-index: 99999999999;  
	_margin-bottom:0px; 
	_top: expression(eval(document.documentElement.scrollTop+document.documentElement.clientHeight-this.offsetHeight-(parseInt(this.currentStyle.marginTop,10)||0)-(parseInt(this.currentStyle.marginBottom,10)||0))); 
	transition:all .5s ease; 
}
.contactusdiyou .hoverbtn{
	width:30px; 
	height:129px; 
	padding-top:20px; 
	cursor: pointer; 
	position:absolute; 
	top:50%; 
	margin-top:-66px;
	left:-30px; 
	font-size:14px; 
	color:#fff; 
	background:#009aff; 
	-webkit-border-radius: 3px 0px  0px 3px; 
	-moz-border-radius: 3px 0px  0px 3px; 
	-o-border-radius: 3px 0px  0px 3px;      
	border-radius: 3px 0px  0px 3px; 
	-moz-box-shadow: -4px 4px 4px -4px #000; 
	-webkit-box-shadow: -4px 4px 4px -4px #000; 
	box-shadow: -4px 4px 4px -4px #000;
}
 .contactusdiyou .hoverbtn span{
	 width:30px; 
	 height:19px;
	 line-height: 19px; 
	 text-align: center; 
	 overflow:hidden; 
	 float:left;
 }
.contactusdiyou .hoverbtn .hoverimg{
	width:13px; 
	height:9px; 
	margin:10px 0px 0px 10px; 
	float:left; 
	display:inline;
	background-repeat: no-repeat;
}
.hoverimg2{
	background:url(../images/hoverbtnbg1.png) no-repeat; 
} 
.contactusdiyou .conter{
	width:186px; 
	height:560px; 
	margin-left:22px;   
	position:absolute; 
	top:55%;
	*margin-top:-140px;
	margin-top:-310px;
}
.contactusdiyou .conter .con1{ 
	border-bottom:1px solid #6a6a6a; 
	padding-bottom:22px;
}
.contactusdiyou .conter .con1 dl dt{
	width:31px; 
	height:31px; 
	float:left;    
	position: relative;
	top: 20px;
}
.contactusdiyou  dl .f1{
	width:142px; 
	height:36px;
	line-height: 36px; 
	float:right; 
	font-size:14px;
	_font-size: 14px;
	*font-size: 15px; 
	color:#fff;
	vertical-align: top; 
	font-weight: bold;
}
.contactusdiyou  dl .f2{ 
	width:142px; 
	float:right; 
	font-size:12px; 
	color:#fff; 
	height:30px;
	line-height: 30px; 
	float:right;
}
.kefuQQ a{ 
	background:url(../images/button-custom-qq.gif)  no-repeat; 
	width:70px; 
	height:30px; 
	display:inline-block; 
	vertical-align:middle;
}
.kefuQQ a:hover{ 
	background:url(../images/button-custom-qq-h.gif)  no-repeat;
}
.contactusdiyou .conter .con1 dl dd .ph_num{ 
	font:18px 'Microsoft yahei';
	*font-size: 16px;
	_font-size: 16px; 
	color:#fff; 
	height:25px;
}

.contactusdiyou .qqcall{
	padding:66px 0px;
	border-bottom:1px solid #6a6a6a;
}
.contactusdiyou .qqcall dl dt{
	width:31px; 
	height:71px; 
	float:left; 
	position: relative;
    top: 11px;
}

.contactusdiyou .weixincall{
	float:right;
	padding:22px 0; 
	border-bottom:1px solid #6a6a6a;
}
.contactusdiyou .weixincall dl dt{
	width:31px; 
	height:31px; 
	float:left; 
	position: relative;
    top: 12px;
}


.contactusdiyou .weixincall .f3{
	float: right;
	width:73px; 
	height:auto; 
	margin-right:69px; 
	display:inline;
}
.contactusdiyou .weixincall .f3 img{
	width: 130px;
	height: 130px;
}
.contactusdiyou .dytimer{    
	float: right; 
	width: 160px; 
	height: 40px; 
	padding: 16px 0px 15px 0px; /* background: #007b77; */ 
	margin: 20px 0px 0px 0px;
} 
.contactusdiyou .dytimer span{
	display:block; 
	height:20px; 
	line-height:20px; 
	font-size:14px; 
	color:#fff;
} 
.diyou{
	_position: absolute; 
	_bottom: auto;
	_margin-bottom:0px; 
	z-index:99999999999; 
	_top: expression(eval(document.documentElement.scrollTop+document.documentElement.clientHeight-this.offsetHeight-(parseInt(this.currentStyle.marginTop,10)||0)-(parseInt(this.currentStyle.marginBottom,10)||0)));
} 
.diyoumask { 
	position:fixed; 
	left: 0; 
	top: 0; 
	z-index: 100000; 
	width:100%; 
	height:100%; 
	opacity:0.3;
	filter:alpha(Opacity=30); 
	background:#000; 
	display:none;
} 
.fn_cle:after {
	visibility: hidden; 
	display: block; 
	font-size: 0; 
	content: " "; 
	clear: both; 
	height: 0; 
} /***联系我们***/

</style>

<script type="text/javascript">
	/*---------------------------滚动条------------------------------------------*/
	/* window.onscroll=function(){
		var oDiv=document.getElementById("dd");
		oDiv.style.top=document.body.scrollTop + 300;  //控制上下位置
		oDiv.style.left = document.body.scrollLeft + 300; //控制横向位置

	}  */
	/*  window.onload = function() {
	    if(!window.XMLHttpRequest) {  
	        var qqbar = document.getElementById("dd");  
	        qqbar.style.position = "absolute";  
	        window.onscroll = function() {  
	            qqbar.className = qqbar.className;
	        };  
	    }  
	} */
	/*  $(function () {
	 	  $(window).scroll(function () {
	 	    var top = $(window).scrollTop() + 200;
	 	    var left = $(window).scrollLeft() + 320;
	 	    $("#dd").animate({ "top": top }, 30); //方式一 效果比较理想
	 	    //$("#editInfo").css({ left: left + "px", top: top + "px" }); 方式二 有阴影
	 	  });
	 	}); */
	 	

	$(function() {

		$(window).scroll(function() {

			var top = $(window).scrollTop() + 200;

			var left = $(window).scrollLeft() + 1380;

			$("#dd").css({
				left : left + "px",
				top : top + "px"
			});

		});
		$(window).bind("scroll", function () {
		var sTop = $(window).scrollTop(); 
		var sTop = parseInt(sTop);
		if(sTop >= 570){
			
			if (!$("#dd").is(":visible")) { 
                try { 
                    $("#dd").slideDown(); 
                } catch (e) { 
                    $("#dd").show(); 
                }                       
            }  
			
		}else { 
            if ($("#dd").is(":visible")) { 
                try { 
                    $("#dd").slideUp(); 
                } catch (e) { 
                    $("#dd").hide(); 
                }                        
            } 
        } 
		});
		
		
		$(".contactusdiyou").hover(function() {
			$(".hoverimg").attr("src","images/hoverbtnbg1.gif");
			$('.diyoumask').fadeIn();
			$('.contactusdiyou').animate({right:'0'},300); 
		}, function() {
			$(".hoverimg").attr("src","images/hoverbtnbg.gif");
			$('.contactusdiyou').animate({right:'-230px'},300,function(){});
			$('.diyoumask').fadeOut();
		});
	});
</script>

</head>
<body>

	<a name="toptop"></a>
	<!-- <div id="light" class="white_content">
			<a href="javascript:void(1)"
				style="float: right; font-color: #000; font-size: 25px; border-right: 0px;"
				onclick="document.getElementById('light').style.display='none';document.getElementById('fade').style.display='none'"><img
				src="images/01.jpg" title="点击关闭" style="width: 25px; height: 25px;"></a>
			
	</div> -->
	
	<div style="right:-230px;" class="contactusdiyou">
	<div class="hoverbtn">
		<span>联</span><span>系</span><span>我</span><span>们</span>
		<img class="hoverimg" src="images/02.jpg" height="9" width="13">
	</div>
	<div class="conter">
		<div class="con1"> 
			<dl class="fn_cle">
				<dt><img src="images/03.jpg" height="31" width="31"></dt>
				<dd class="f1">咨询热线：</dd>
				<dd class="f2"><span class="ph_num">152-9775-7475</span></dd>
			</dl>
		</div> 
		<!-- <div class="blank0"></div> -->
		<div class="qqcall"> 
			<dl class="fn_cle">
				<dt><img src="images/04.jpg" height="31" width="31"></dt>
				<dd class="f1 f_s14">在线客服：</dd>
				<dd class="f2 kefuQQ">
					<span>涂总</span>
					<a href="tencent://message/?uin=2644794564&Site=&Menu=yes">
						<img alt="" src="images/qq1.png" style="width:110px;height:15px;margin-top:4px;" />
					</a>
					<br/>
					<span>客服</span>
					<a href="tencent://message/?uin=984208452&Site=&Menu=yes">
						<img alt="" src="images/qq1.png" style="width:110px;height:15px;margin-top:4px;" />
					</a>
					<br/>
					<span>客服</span>
					<a href="tencent://message/?uin=984208452&Site=&Menu=yes">
						<img alt="" src="images/qq1.png" style="width:110px;height:15px;margin-top:4px;" />
					</a>
					
				</dd>
			</dl>
			<!-- <div class="blank0"></div>  -->          
		</div> 
		<!-- <div class="blank0"></div> -->
		<div class="weixincall"> 
			<dl class="fn_cle">
				<dt><img src="images/bj.jpg" height="31" width="31"></dt>
				<dd class="f1">官方微信站：</dd>
				<dd class="f3"><img src="images/lo.jpg" height="153px" width="73px"></dd>
			</dl>
		</div> 
		<!-- <div class="blank0"></div> -->
		<div class="dytimer">
			<!-- <span style="font-weight: bold;">公司官网：</span>
			<span><a href="">www.qingfengjiaoyu.com</a></span> -->
			
			<a href="tencent://message/?uin=2485941850&Site=&Menu=yes">
			<span>意见/投诉</span>
			<img alt="" src="images/qq1.png" style="width:110px;height:15px;margin-top:4px;" />
			</a>
		</div>
	</div>
</div>

<div class="diyoumask" ></div>
	<!-- <div id="dd" class="cb">	
			<a id="im" class="im"><img alt=""
			width="50px" title="TTTTT" height="50px" src="images/06.jpg">
			</a>
			<div class="ims">TTTTTTT</div>
	</div> -->

	<!-- <span style="height:50px;width:100%;"></span> -->
	<!-- 头部 -->
	<div style="height: 800px;">
		<div class=" top-warpper">
			<!-- 头部  begin -->
			<div class="header center">
				<div class="lg fl">
					<span style="display:inline-block;width:100%; height:10px;"></span>
					<img src="images/logo/qingfengjiaoyu1.2.png" style="width:250px;height:55px;" />
				</div>
				<!-- 没有员或学生登录 -->
				
					<c:if test="${empty employee}">
					<!-- <font size="3">登录</font> -->
					<a href="indexsdl.jsp" target="_blank">
						<button class="tb" title="后台登入">后台登录</button>
					</a></c:if>
					<c:if test="${empty student}">
					<a href="student/stuLogin.jsp" target="_blank">
						<button class="tb" title="学生登入">学生登录</button>
					</a>
						
					</c:if>
					<c:if test="${!empty student}">
						欢迎：${sessionScope.student.s_name}
						<button class="tb" title="退出" onclick="rmstudent()">退出登录</button>
					</c:if>
					<c:if test="${!empty employee}">
						欢迎：${sessionScope.employee.emp_name}<button class="tb" title="退出">退出登录</button>
					</c:if>
			</div>
		</div>
		<!-- 头部 end -->
		<div id="light" class="white_content">
			<a href="javascript:void(0)"
				style="float: right; font-color: #000; top: 5px; font-size: 25px; border-right: 0px;"
				onclick="document.getElementById('light').style.display='none';document.getElementById('fade').style.display='none'"><img
				src="images/png/gbck.png" title="点击关闭" style="width: 25px; height: 25px;"></a>
			<div id="dt" style="width: 95%; height: 100%;"></div>
		</div>

		<script type="text/javascript">
			var map = new BMap.Map("dt"); // 创建地图实例  
			var point = new BMap.Point(114.948840, 25.805070); // 创建点坐标  
			map.centerAndZoom(point, 15); // 初始化地图，设置中心点坐标和地图级别  

			map.enableScrollWheelZoom(true); //开启鼠标滚轮缩放
			var navigationControl = new BMap.NavigationControl({
				// 靠左上角位置
				anchor : BMAP_ANCHOR_TOP_LEFT,
				// LARGE类型
				type : BMAP_NAVIGATION_CONTROL_LARGE,
				// 启用显示定位
				enableGeolocation : false

			});
			map.addControl(navigationControl);
		</script>
		<!-- 导航 begin -->
		<div class=" top-warpper">
			<div class="nav">
				<div class="center st">
					<section class="color-3" style="background:rgba(51, 204, 255, 1)">
					<div style="width: 100%; left: 75px;">
						<nav class="nav03"> 
							<a href="#">
								<span style="color: #fff">首页</span></a> 
							<a href="ncb.jsp" target="_blank">
								<span style="color: #fff">机构认证</span></a> 
							<a href="aboutus.jsp" target="_blank">
								<span style="color: #fff">关于我们</span></a> 
							<a href="teamwork.jsp" target="_blank">
								<span style="color: #fff">合作</span>
							</a> 
							<a href="JavaScript:void(0)" style="color: #fff"
							onclick="document.getElementById('light').style.display='block';document.getElementById('fade').style.display='block'">
								<span>网站地图</span>
							</a>
						</nav>
					</div>
					</section>
				</div>
			</div>
			<!-- 导航 end 輪播圖-->
			<!-- banner begin -->
			<!-- banner end -->
			<div class="banner">
				<div class="banner_show" id="banner_show">
				<s:iterator value="cflist">
					<a class="bannger_inbox"> 
						<img src="Myfiles/<s:property value="img_src"/>" width="2000" height="572">
					</a> 
						</s:iterator>
					<div class="banner_mag">
						<div class="banner_magbox">
						<s:iterator value="cflist">
							
							<div id="banner_magbox1">
								<div class="focus-img">
									<img src="images/txt.png" />
								</div>
								
								<h4 style="height:50px;font-family: '楷体';font-size: 28px;">
									<a href="">文字</a>
								</h4>
								<div>
									<span style="display:inline-block;width:100%; height:70%;"></span>
								</div>
								<p style="height:290px;font-family: '楷体';font-size: 22px;">
									<lable style="">
										<s:property value="cf_context"/>
									</lable>
								</p>
								
							</div>
							<%-- <span style="display:inline-block;width:100%; height:70%;"></span> --%>
							</s:iterator>
						</div>
						<div class="yq_banner_list" id="yq_banner_list">
							<a href="javascript:;" rel="0" class="hover">&nbsp;</a> <a
								href="javascript:;" rel="1">&nbsp;</a> <a href="javascript:;"
								rel="2">&nbsp;</a>
						</div>
					</div>
					<div class="banner_pre_next">
						<a href="javascript:;" class="banner_btn_left">上一个</a> <a
							href="javascript:;" class="banner_btn_right">下一个</a>
					</div>
				</div>
			
			</div>
		</div>
	</div>
	<!-- 页面主体 -->
	<div class="main center">
	
		<div class="main-left fl">
		
			<!-- 信息推荐 begin-->
			<div class="moudle info">
				<div class="title">新闻中心</div>
				<div class="content">
					<ul>
						<li><i class="i-list"></i> <a href=""
							style="text-decoration: none;">明年成考直达本相关规定</a> <time>2017-09-16</time>
						</li>
						<li><i class="i-list"></i> <a href=""
							style="text-decoration: none;">获取最新成考信息发展趋势</a> <time>2017-09-16</time>
						</li>

					</ul>
				</div>
			</div>
			<!-- END -->

			<!-- 信息推荐 begin -->
			<div class="moudle people">
				<div class="title">报考类型</div>
				<div class="content">
					<ul>
						<li>
							<a href="student/exam_chengkao.jsp?emp_id=1" target="_blank"
							style="text-decoration: none;">
								<div class="img fl">
									<img src="images/kaoimg/02.jpg" alt="">
								</div>
								<div class="txt fr" style="color: gray">
									<span class="j">成人高考</span> <span>学制：两年</span> <span>名额：空余</span>
								</div>
							</a>
						</li>
						<li>
							<a href="student/exam_chengkao.jsp?emp_id=1" target="_blank"
							style="text-decoration: none;">
								<div class="img fl">
									<img src="images/kaoimg/03.jpg" alt="">
								</div>
								<div class="txt fr" style="color: gray">
									<span class="j">国家大学</span> <span>学制：两年</span> <span>名额：空余</span>
								</div>
							</a>
						</li>
						<li>
							<a href="student/exam_chengkao.jsp?emp_id=1" target="_blank"
							style="text-decoration: none;">
								<div class="img fl">
									<img src="images/kaoimg/04.jpg" alt="">
								</div>
								<div class="txt fr" style="color: gray">
									<span class="j">远程教育</span> <span>学制：两年</span> <span>名额：空余</span>
								</div>
							</a>
						</li>
						<li>
							<a href="exam_zhikao.jsp" target="_blank"
							style="text-decoration: none;">
								<div class="img fl">
									<img src="images/kaoimg/05.jpg" alt="">
								</div>
								<div class="txt fr" style="color: gray">
									<span class="j">会计</span> <span>学制：一年</span> <span>名额：空余</span>
								</div>
							</a>
						</li>
						<li>
							<a href="exam_zhikao.jsp" target="_blank"
							style="text-decoration: none;">
								<div class="img fl">
									<img src="images/kaoimg/06.jpg" alt="">
								</div>
								<div class="txt fr" style="color: gray">
									<span class="j">艺考</span> <span>学制：一年</span> <span>名额：空余</span>
								</div>
							</a>
						</li>
						<li>
							<a href="exam_zhikao.jsp" target="_blank"
							style="text-decoration: none;">
								<div class="img fl">
									<img src="images/kaoimg/10.jpg" alt="">
								</div>
								<div class="txt fr" style="color: gray">
									<span class="j">职业证书</span> <span>学制：一年</span> <span>名额：空余</span>
								</div>
							</a>
						</li>
					</ul>
				</div>
			</div>
			<!-- 信息推荐 end -->

			<!--  信息推荐 begin -->
			<div class="moudle notice notice-down">
				<div class="title">合作院校</div>
				<div class="content">
					<ul>
						<li>
							<a href="school.jsp" target="_blank">
								<div class="img">
									<img src="images/next1.jpg">
								</div>
								<div class="txt">
									<h2>江西农业大学</h2>
									<span>2014</span>
								</div>
							</a>
						</li>
						<li title="查看-江西理工大学">
							<a target="_blank" href="school.jsp">
								<div class="img">
									<img src="images/next2.jpg">
								</div>
								<div class="txt">
									<h2>江西理工大学</h2>
									<span>2015</span>
								</div>
							</a>
						</li>
						<li>
							<a href="school.jsp" target="_blank">
								<div class="img">
									<img src="images/next3.jpg">
								</div>
								<div class="txt">
									<h2>赣南师范大学</h2>
									<span>2014</span>
								</div>
							</a>
						</li>
						<li>
							<a href="school.jsp" target="_blank">
								<div class="img">
									<img src="images/next4.jpg">
								</div>
								<div class="txt">
									<h2>景德镇陶瓷大学</h2>
									<span>2016</span>
								</div>
							</a>
						</li>

						<li>
							<a href="school.jsp" target="_blank">
								<div class="img">
									<img src="images/next5.jpg">
								</div>
								<div class="txt">
									<h2>苏州农业职业技术学院</h2>
									<span>2017</span>
								</div>
							</a>
						</li>
						<li>
							<a href="school.jsp" target="_blank">
								<div class="img">
									<img src="images/next6.jpg">
								</div>
								<div class="txt">
									<h2>上海传媒学院</h2>
									<span>2016</span>
								</div>
							</a>
						</li>
						<li>
							<a href="school.jsp" target="_blank">
								<div class="img">
									<img src="images/next7.jpg">
								</div>
								<div class="txt">
									<h2>井冈山大学</h2>
									<span>2017</span>
								</div>
							</a>
						</li>
						<li>
							<a href="school.jsp" target="_blank">
								<div class="img">
									<img src="images/next8.jpg">
								</div>
								<div class="txt">
									<h2>上饶师范学院</h2>
									<span>2015</span>
								</div>
							</a>
						</li>
					</ul>
				</div>
			</div>
			<!-- 信息 end -->

			<!--  -->
		</div>
		<div class="main-right fr">
			<!-- 快速链接begin -->
			<div class="links">
			<div class="link01">
			<c:if test="${!empty student}">
					<a href="find_moneys.action">缴费查询</a>
			</c:if>
			<c:if test="${empty student}"><!-- 没有登录 -->
					<a onclick="jfcx()">缴费查询</a>
			</c:if>
				</div>
				
				<div class="link02">
					<a href="stu_file/upload.jsp" title="Authorized Certification" target="_blank">文件上传</a>
				</div>
				<div class="link03">
					<a>诚聘英才</a>
				</div>
				<div class="link04">
					<a href="aboutus.jsp" target="_blank">关于我们</a>
				</div>
			</div>
			<!-- 快速链接 end -->
			<!-- 最新消息 begin -->
			<div class="list new">
				<div class="title">合作平台</div>
				<div class="content center">
					<ul>
						<li><i class="i-list"></i> <a href="http://www.chsi.com.cn">学信网</a> <time>2017-09-16</time>
						</li>
						<li><i class="i-list"></i> <a href="http://www.bjsxt.com">尚学堂</a> <time>2017-09-16</time>
						</li>
						<li><i class="i-list"></i> <a href="http://www.xihe8.com/">艺术网</a> <time>2017-09-16</time>
						</li>
						<li><i class="i-list"></i> <a href="http://www.gzu521.com/xueli/chengkao/wangxiao/">成考学习资源网</a> <time>2017-09-16</time>
						</li>
						<li><i class="i-list"></i> <a href="http://www.chinaacc.com/">中华会计网</a> <time>2017-09-16</time>
						</li>
						<li><i class="i-list"></i> <a href="http://www.cdce.cn/">远程教育网</a> <time>2017-06-28</time>
						</li>
						<li><i class="i-list"></i> <a href="http://hd.eastmoney.com/">投资网</a> <time>2017-06-28</time>
						</li>
					</ul>
				</div>
			</div>
			<!-- 最新消息 end -->
			<!-- 最新消息 begin -->
			<div class="list new">
				<div class="title">通知公告</div>
				<div class="content center">
					<ul>
						<li><i class="i-list"></i> <a href="http://www.mhjsl.com/zuixin/2017/3147054.html">2017最新域名紧急大通知升级</a> <time>2017-09-12</time>
						</li>
						<li><i class="i-list"></i> <a href="http://www.ouchn.cn/">国家开发大学最新资讯</a> <time>2017-08-12</time>
						</li>
						<li><i class="i-list"></i> <a href="http://politics.people.com.cn/n1/2017/0320/c1001-29156093.html">追寻习总书记的初心·正定篇</a> <time>2017-06-21</time>
						</li>
						<li><i class="i-list"></i> <a href="http://www.gkstk.com/article/wk-78500001554421.html">中国经济形势分析</a> <time>2017-01-19</time>
						</li>
						<li><i class="i-list"></i> <a href="http://qiutian.zqnf.com/33564.html">2017市场环境分析</a><time>2017-01-18</time>
						</li>
						<li><i class="i-list"></i> <a href="https://www.suibi8.com/jihua/216978-zhiyeshengyaguihua.html">2016职业生涯规划</a> <time>2016-09-21</time>
						</li>
						<li><i class="i-list"></i> <a href="http://www.jxsdjy.com/ck/0R51132014.html">关于2014年成考报名事宜的通知</a> <time>2014-7-23</time>
						</li>
					</ul>
					
<!-- 	
	$("#btn1").click(function(){
               $("p").append(<"<b>追加文本</b>");
               });
                            -->
				</div>
			</div>
			<!-- 最新消息 end -->

		</div>
	</div>
	<!-- 页面主体 end -->
	<footer>
	<div class="footer-links">
		<a href="">首 页 </a> | <a href=""> 公司简介 </a> | <a href=""> 新闻中心 </a> |
		<a href="">通知公告 </a> | <a href=""> 产品介绍 </a> | <a href=""> 关于我们 </a>
		| <a href=""> 诚聘英才 </a> | <a href=""> 联系我们 </a>
	</div>
	<div class="copyright">@ www.kyoani.club/wordpress/</div>
	</footer>
<script type="text/javascript">
	function rmstudent(){
		alert("hg");
		 $.ajax({
	         async: true,
	         cache: true,
	         url:'RemoveStudent.action',
	         type: 'post',
	         data: {
	             'emp_id': 22,
	         },
	         dataType: 'text',
	         success: function (data) { 
	        	alert(data);
	        	location.href = "MaingetCar.action";
	         },
	         error: function (XMLHttpRequest, textStatus) {
	             alert("系统繁忙,请稍候再试!");
	         }
	     });
	}
	function jfcx(){
		if(confirm("您尚未登录，是否前往登录")){
			location.href = "http://localhost:8080/QingFeng/student/stuLogin.jsp";
		}
		
	}
</script>
</body>

</html>