<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="script/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/yzmstyle2.css" />


<link href="..css/web.css" rel="stylesheet" type="text/css" />
<link href="..css/webs2.css" rel="stylesheet" type="text/css" />
<link href="..css/images.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="script/jquery.js"></script>
<script type="text/javascript"
	src="script/jquery.caroufredsel-6.0.4-packed.js"></script>
<script type="text/javascript" src="script/focus.js"></script>

<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=2.0&ak=DD279b2a90afdf0ae7a3796787a0742e">
	//v2.0版本的引用方式：src="http://api.map.baidu.com/api?v=2.0&ak=您的密钥"
	//v1.4版本及以前版本的引用方式：src="http://api.map.baidu.com/api?v=1.4&key=您的密钥&callback=initialize"
</script>

<style type="text/css">
.tb {
	text-indent: 3px;
	font: "楷体";
	font-size: 18px;
	background: rgba(255, 255, 255, 0.1) no-repeat;
	border-radius: 5px;
	border: 0.5px solid gray;
	letter-spacing: 3px;
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
	border: 10px solid rgba(255, 255, 255, 0.5);
	background-color: rgba(255, 255, 255, 0.8);
	z-index: 1002;
	overflow: auto;
}
</style>
<script type="text/javascript">
$(document).ready(function(){
	$("#dl").click(function(){
		alert("ddddddd");
		window.location.href="user.jsp";
	});
	
});

</script>


</head>
<body>


	<!-- <span style="height:50px;width:100%;"></span> -->
	<!-- 头部 -->
	<div style="height: 800px;">
		<div class=" top-warpper">
			<!-- 头部  begin -->
			<div class="header center">
				<div class="lg fl">
					<img src="images/logo.png" />
				</div>
				<div class="tel fr">
					<!-- <font size="3">登录</font> -->
					<button class="tb" id="dl">登录</button>
					<!-- <font size="3">我的</font> -->
					<button class="tb">我的</button>
	
				</div>
			</div>
		</div>
		<!-- 头部 end -->
		<div id="light" class="white_content">
			<a href="javascript:void(0)" style="float:right;font-color:#000;top:5px;font-size:25px;"
				onclick="document.getElementById('light').style.display='none';document.getElementById('fade').style.display='none'"><img src="images/01.jpg" title="点击关闭" style="width:25px;height:25px;"></a>
			<div id="dt" style="width: 680px; height: 330px;"></div>
			
			
		</div>
		<!--登录  -->
		<div class="md-modal md-effect-1" id="modal-20" >
      <div class="md-content">
        <h3><font face="楷体">用户登录</font></h3>
        <div>
          <p> <font size="6px" face="楷体">请输入您的账户密码: </font> </p>
          <ul>
            <li> <strong> <font size="6px" face="楷体"> 账户: </font> </strong>
            	<input type="text" style="width: 200px; height: 35px; border-radius: 5px;
					border: 0.5px solid #bbc1c5; background-color: rgba(255,255,255,0.9); padding-left: 5px; font-size: 25px;" />
            </li>
            <li> <strong> <font size="6px" face="楷体"> 密码: </font> </strong>
            	<input type="password" style="width: 200px; height: 35px; border-radius: 5px;
					border: 0.5px solid #bbc1c5; background-color: rgba(255,255,255,0.9); padding-left: 5px; font-size: 25px;" />
            </li>
            
          </ul>
          <button class="md-close" id="ss">登录</button>
        </div>
      </div>
    </div>
		
		<div class="submit">
      <button class="md-trigger" id="bu" data-modal="modal-20" onload="alert('oooo')">我的</button>
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
						<nav class="nav03"> <a href="#"><span
							style="color: #fff">首页</span></a> <a href="#"><span
							style="color: #fff">公司简介</span></a> <a href="#"><span
							style="color: #fff">关于我们</span></a> <a href="#"><span
							style="color: #fff">联系我们</span></a> <a href="JavaScript:void(0)"
							onclick="document.getElementById('light').style.display='block';document.getElementById('fade').style.display='block'"><span
							style="color: #fff">网站地图</span></a> </nav>
					</div>
					</section>
				</div>
			</div>
			<!-- 导航 end -->
			<!-- banner begin -->
			<!-- banner end -->
			<div class="banner">
				<div class="banner_show" id="banner_show">
					<a href=" " target="_blank" class="bannger_inbox"> <img
						src="images/banner1.jpg" width="2000" height="572">
					</a> <a href=" " target="_blank" class="bannger_inbox"> <img
						src="images/banner2.jpg" width="2000" height="572">
					</a> <a href=" " target="_blank" class="bannger_inbox"> <img
						src="images/banner3.jpg" width="2000" height="572">
					</a>
					<div class="banner_mag">
						<div class="banner_magbox">
							<div id="banner_magbox0">
								<div class="focus-img">
									<img src="images/txt.png" />
								</div>
								<h4>
									<a href="#">文字1</a>
								</h4>
								<p>Adobe旗下拥有涵盖面极广的软件,欢迎安装以下产品: Adobe Premiere Pro CS6,Adobe
									After Effects CS6, Adobe Audition CS6,Adobe Dreamweaver CS6,
									Adobe Photoshop CS6</p>
							</div>
							<div id="banner_magbox1" class="none">
								<div class="focus-img">
									<img src="images/txt.png" />
								</div>
								<h4>
									<a href="#">文字2</a>
								</h4>
								<p>Apache POI项目的使命是创建和维护Java API， 以根据Office Open
									XML标准（OOXML） 和Microsoft的OLE 2复合文档格式（OLE2）操纵各种文件格式。
									简而言之，您可以使用Java读取和写入MS Excel文件</p>

							</div>
							<div id="banner_magbox2" class="none">
								<div class="focus-img">
									<img src="images/txt.png" />
								</div>
								<h4>
									<a href="#">文字3</a>
								</h4>
								<p>Standard Product Support （简称“SPS”）是用友公司原厂为确保软件产品
									授权许可升级和正常运行而提供的软件产品支持服务。 用友SPS，让企业管理信息系统拥有持久生命力！</p>

							</div>
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
				<!--蓝色文字部分-->
				<div class="focus-news">
					<div class="index-news-title">
						<h2>NEWS/Events</h2>
						<h2>新闻/活动</h2>
						<ul class="index-tabs fix">
							<li id="prev" class="prev"></li>
							<li id="next" class="next"></li>
						</ul>
					</div>
					<div class="index-news-show" id="carousel">
						<ul class="fix">
							<li>
								<h2>新闻1</h2>
								<p>时间：2013.7.25-2013.8.25</p>
								<p>地址：北京朝阳区乐成中心</p>
							</li>
							<li>
								<h2>新闻2</h2>
								<p>时间：2013.7.25-2013.8.25</p>
								<p>地址：北京朝阳区乐成中心</p>
							</li>
							<li>
								<h2>新闻3</h2>
								<p>时间：2013.7.25-2013.8.25</p>
								<p>地址：北京朝阳区乐成中心</p>
							</li>
							<li>
								<h2>新闻4</h2>
								<p>时间：2013.7.25-2013.8.25</p>
								<p>地址：北京朝阳区乐成中心</p>
							</li>
						</ul>
					</div>
					<div class="index-news-tel">4008-89-4008</div>
				</div>
				<!--蓝色文字部分end-->
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
						<li><i class="i-list"></i> <a href="#"
							style="text-decoration: none;">明年成考直达本将取消</a> <time>2017-06-26</time>
						</li>
						<li><i class="i-list"></i> <a href="#"
							style="text-decoration: none;">这是一条最新时讯新闻</a> <time>2017-06-26</time>
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
						<li><a href="exam_chengkao.jsp" target="_blank"
							style="text-decoration: none;">
								<div class="img fl">
									<img src="images/02.jpg" alt="">
								</div>
								<div class="txt fr" style="color: gray">
									<span class="j">成人高考</span> <span>学制：两年</span> <span>名额：空余</span>
								</div>
						</a></li>
						<li><a href="exam_chengkao.jsp" target="_blank"
							style="text-decoration: none;">
								<div class="img fl">
									<img src="images/03.jpg" alt="">
								</div>
								<div class="txt fr" style="color: gray">
									<span class="j">成人高考</span> <span>学制：两年</span> <span>名额：空余</span>
								</div>
						</a></li>
						<li><a href="exam_chengkao.jsp" target="_blank"
							style="text-decoration: none;">
								<div class="img fl">
									<img src="images/04.jpg" alt="">
								</div>
								<div class="txt fr" style="color: gray">
									<span class="j">成人高考</span> <span>学制：两年</span> <span>名额：空余</span>
								</div>
						</a></li>
						<li><a href="exam_zhikao.jsp" target="_blank"
							style="text-decoration: none;">
								<div class="img fl">
									<img src="images/05.jpg" alt="">
								</div>
								<div class="txt fr" style="color: gray">
									<span class="j">职业考试</span> <span>学制：一年</span> <span>名额：空余</span>
								</div>
						</a></li>
						<li><a href="exam_zhikao.jsp" target="_blank"
							style="text-decoration: none;">
								<div class="img fl">
									<img src="images/06.jpg" alt="">
								</div>
								<div class="txt fr" style="color: gray">
									<span class="j">职业考试</span> <span>学制：一年</span> <span>名额：空余</span>
								</div>
						</a></li>
						<li><a href="exam_zhikao.jsp" target="_blank"
							style="text-decoration: none;">
								<div class="img fl">
									<img src="images/10.jpg" alt="">
								</div>
								<div class="txt fr" style="color: gray">
									<span class="j">职业考试</span> <span>学制：一年</span> <span>名额：空余</span>
								</div>
						</a></li>
					</ul>
				</div>
			</div>
			<!-- 信息推荐 end -->

			<!--  信息推荐 begin -->
			<div class="moudle notice notice-down">
				<div class="title">合作院校</div>
				<div class="content">
					<ul>
						<li><a href="table.jsp" target="_blank">
								<div class="img">
									<img src="images/01.jpg">
								</div>
								<div class="txt">
									<h2>江西农业大学</h2>
									<span>1234</span>
								</div>
						</a></li>
						<li title="查看-江西理工大学"><a target="_blank" href="school.jsp">
								<div class="img">
									<img src="images/02.jpg">
								</div>
								<div class="txt">
									<h2>江西理工大学</h2>
									<span>1234</span>
								</div>
						</a></li>
						<li><a href="table.jsp" target="_blank">
								<div class="img">
									<img src="images/03.jpg">
								</div>
								<div class="txt">
									<h2>赣南师范学院</h2>
									<span>1234</span>
								</div>
						</a></li>
						<li><a href="table.jsp" target="_blank">
								<div class="img">
									<img src="images/04.jpg">
								</div>
								<div class="txt">
									<h2>景德镇学院</h2>
									<span>1234</span>
								</div>
						</a></li>

						<li><a href="table.jsp" target="_blank">
								<div class="img">
									<img src="images/05.jpg">
								</div>
								<div class="txt">
									<h2>苏州农业职业技术学院</h2>
									<span>2017</span>
								</div>
						</a></li>
						<li><a href="table.jsp" target="_blank">
								<div class="img">
									<img src="images/06.jpg">
								</div>
								<div class="txt">
									<h2>上海传媒学院</h2>
									<span>1234</span>
								</div>
						</a></li>
						<li><a href="table.jsp" target="_blank">
								<div class="img">
									<img src="images/10.jpg">
								</div>
								<div class="txt">
									<h2>井冈山大学</h2>
									<span>1234</span>
								</div>
						</a></li>
						<li><a href="table.jsp" target="_blank">
								<div class="img">
									<img src="images/01.jpg">
								</div>
								<div class="txt">
									<h2>上饶师范学院</h2>
									<span>1234</span>
								</div>
						</a></li>
					</ul>
				</div>
			</div>
			<!-- 信息 end -->

			<!--  -->
		</div>
		<div class="main-right fr">
			<!-- 快速链接 begin -->
			<div class="links">
				<div class="link01">
					<a>平台介绍</a>
				</div>
				<div class="link02">
					<a>权威认证</a>
				</div>
				<div class="link03">
					<a>诚聘英才</a>
				</div>
				<div class="link04">
					<a>关于我们</a>
				</div>
			</div>
			<!-- 快速链接 end -->
			<!-- 最新消息 begin -->
			<div class="list new">
				<div class="title">合作平台</div>
				<div class="content center">
					<ul>
						<li><i class="i-list"></i> <a>学信网</a> <time>2017-06-28</time>
						</li>
						<li><i class="i-list"></i> <a>**网</a> <time>2017-06-28</time>
						</li>
						<li><i class="i-list"></i> <a>**网</a> <time>2017-06-28</time>
						</li>
						<li><i class="i-list"></i> <a>**网</a> <time>2017-06-28</time>
						</li>
						<li><i class="i-list"></i> <a>**网</a> <time>2017-06-28</time>
						</li>
						<li><i class="i-list"></i> <a>**网</a> <time>2017-06-28</time>
						</li>
						<li><i class="i-list"></i> <a>**网</a> <time>2017-06-28</time>
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
						<li><i class="i-list"></i> <a>界面整合优化-Akops</a> <time>2017-06-21</time>
						</li>
						<li><i class="i-list"></i> <a>界面整合优化-Akops</a> <time>2017-06-21</time>
						</li>
						<li><i class="i-list"></i> <a>界面整合优化-Akops</a> <time>2017-06-21</time>
						</li>
						<li><i class="i-list"></i> <a>界面整合优化-Akops</a> <time>2017-06-21</time>
						</li>
						<li><i class="i-list"></i> <a>界面整合优化-Akops</a> <time>2017-06-21</time>
						</li>
						<li><i class="i-list"></i> <a>界面整合优化-Akops</a> <time>2017-06-21</time>
						</li>
						<li><i class="i-list"></i> <a href="">界面整合优化-Akops</a> <time>2017-06-21</time>
						</li>
					</ul>
				</div>
			</div>
			<!-- 最新消息 end -->

		</div>
	</div>
	<!-- 页面主体 end -->
	<footer>
	<div class="footer-links">
		<a href=""> 首 页 </a> | <a href=""> 公司简介 </a> | <a href=""> 新闻中心 </a> |
		<a href=""> 通知公告 </a> | <a href=""> 产品介绍 </a> | <a href=""> 关于我们 </a>
		| <a href=""> 诚聘英才 </a> | <a href=""> 联系我们 </a>
	</div>
	<div class="copyright">@ www.kyoani.club/wordpress/</div>
	</footer>
</body>

</html>