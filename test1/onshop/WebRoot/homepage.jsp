<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

		<title>首页</title>

		<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
		<link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css" />

		<link href="basic/css/demo.css" rel="stylesheet" type="text/css" />

		<link href="css/hmstyle.css" rel="stylesheet" type="text/css" />
		<script src="AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
		<script src="AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>
		
		<link rel="icon" href="images1/onshop.jpg" type="image/x-icon">
		
		
		

	</head>
	
	<body>
		<div class="hmtop">
			<!--顶部导航条 -->
			<div class="am-container header">
				<ul class="message-l">
					<div class="topMessage">
						<div class="menu-hd">
							<c:if test="${empty  user}">
							<a href="customer/userlogin.jsp" target="_blank">用户登录</a> &nbsp;
							<a href="customer/uzhuce.jsp" target="_blank">用户注册</a>&nbsp;
							<a href="#" target="_blank"></a></c:if>	
					         <c:if test="${!empty user}">欢迎您，<b>${user.unickname }</b>(<b>${user.uaccount }</b>)</c:if>
						</div>
					</div>
				</ul>
				<ul class="message-r">
					<div class="topMessage home">
						<div class="menu-hd"><a href="homepage.jsp" target="_top" class="h">商城首页</a></div>
					</div>
					<div class="topMessage my-shangcheng">
						<div class="menu-hd MyShangcheng"><a href="customer/personal.jsp" target="_top"><i class="am-icon-user am-icon-fw"></i>用户个人中心</a></div>
					</div>
					<div class="topMessage mini-cart">
						<div class="menu-hd"><a id="mc-menu-hd" href="business/bzhuce.jsp" target="_top"><i></i><span>商家入驻</span><strong id="J_MiniCartNum" class="h"></strong></a></div>
					</div>
					<div class="topMessage favorite">
						<div class="menu-hd"><a href="#" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
				</ul>
				</div>

				<!--悬浮搜索框-->

				<div class="nav white">
					<div class="logo"><img src="images/logo.jpg" /></div>
					<div class="logoBig">
						<li><img src="images/logo.jpg" /></li>
					</div>

					<div class="search-bar pr">
						<a name="index_none_header_sysc" href=""></a>
						<form action="onshop?method=list2" method="post">
							<input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
							<input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" name="keyword" type="submit">
						</form>
					</div>
				</div>

				<div class="clear"></div>
			</div>
             <b class="line"></b>
			<div class="shopNav">
				<div class="slideall" style="height: auto;">
			        
					   <div class="long-title"><span class="all-goods">全部分类</span></div>
					   <div class="nav-cont">
							<ul>
								<li class="index"><a href="index.jsp">首页</a></li>
                                <li class="qc"><a href="#">闪购</a></li>
                                <li class="qc"><a href="#">限时抢</a></li>
                                <li class="qc"><a href="#">团购</a></li>
                                <li class="qc last"><a href="#">大包装</a></li>
							</ul>
						    <div class="nav-extra">
						    	<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
						    	<i class="am-icon-angle-right" style="padding-left: 10px;"></i>
						    </div>
						</div>
                
			    <div class="bannerTwo">
                      <!--轮播 -->
						<div class="am-slider am-slider-default scoll" data-am-flexslider id="demo-slider-0">
							<ul class="am-slides">
								<li class="banner1"><a href="introduction.html"><img src="images/ad5.jpg" /></a></li>
								<li class="banner2"><a><img src="images/ad6.jpg" /></a></li>
								<li class="banner3"><a><img src="images/ad7.jpg" /></a></li>
								<li class="banner4"><a><img src="images/ad8.jpg" /></a></li>
							</ul>
						</div>
						<div class="clear"></div>	
			    </div>

						<!--侧边导航 -->
						<div id="nav" class="navfull" style="position: static;">
							<div class="area clearfix">
								<div class="category-content" id="guide_2">
									
									<div class="category" style="box-shadow:none ;margin-top: 2px;">
										<ul class="category-list navTwo" id="js_climit_li">
											<li>
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="images/cake.png"></i><a class="ml-22" title="点心" href="onshop?method=list2&index_none_header_sysc='点心'">点心/蛋糕</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="sort-side">
																	<dl class="dl-sort">
																		<dt><span title="蛋糕">蛋糕</span></dt>
																		<dd><a title="蒸蛋糕" href="#"><span>蒸蛋糕</span></a></dd>
																		<dd><a title="脱水蛋糕" href="#"><span>脱水蛋糕</span></a></dd>
																		<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>
																		<dd><a title="软面包" href="#"><span>软面包</span></a></dd>
																		<dd><a title="马卡龙" href="#"><span>马卡龙</span></a></dd>
																		<dd><a title="千层饼" href="#"><span>千层饼</span></a></dd>
																		<dd><a title="甜甜圈" href="#"><span>甜甜圈</span></a></dd>
																		<dd><a title="蒸三明治" href="#"><span>蒸三明治</span></a></dd>
																		<dd><a title="铜锣烧" href="#"><span>铜锣烧</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="蛋糕">点心</span></dt>
																		<dd><a title="蒸蛋糕" href="#"><span>蒸蛋糕</span></a></dd>
																		<dd><a title="脱水蛋糕" href="#"><span>脱水蛋糕</span></a></dd>
																		<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>
																		<dd><a title="软面包" href="#"><span>软面包</span></a></dd>
																		<dd><a title="马卡龙" href="#"><span>马卡龙</span></a></dd>
																		<dd><a title="千层饼" href="#"><span>千层饼</span></a></dd>
																		<dd><a title="甜甜圈" href="#"><span>甜甜圈</span></a></dd>
																		<dd><a title="蒸三明治" href="#"><span>蒸三明治</span></a></dd>
																		<dd><a title="铜锣烧" href="#"><span>铜锣烧</span></a></dd>
																	</dl>

																</div>
																<div class="brand-side">
																	<dl class="dl-sort"><dt><span>实力商家</span></dt>
																		<dd><a rel="nofollow" title="美诚美食" target="_blank" href="#" rel="nofollow"><span  class="red" >美诚美食</span></a></dd>
																		<dd><a rel="nofollow" title="格瑞旗舰店" target="_blank" href="#" rel="nofollow"><span >格瑞旗舰店</span></a></dd>
																		<dd><a rel="nofollow" title="飞彦大厂直供" target="_blank" href="#" rel="nofollow"><span  class="red" >飞彦大厂直供</span></a></dd>
																		<dd><a rel="nofollow" title="红e·艾菲妮" target="_blank" href="#" rel="nofollow"><span >红e·艾菲妮</span></a></dd>
																		<dd><a rel="nofollow" title="本真旗舰店" target="_blank" href="#" rel="nofollow"><span  class="red" >本真旗舰店</span></a></dd>
																		<dd><a rel="nofollow" title="好街坊蛋糕" target="_blank" href="#" rel="nofollow"><span  class="red" >好街坊蛋糕</span></a></dd>
																	</dl>
																</div>
															</div>
														</div>
													</div>
												</div>
											<b class="arrow"></b>	
											</li>
											c
											<li >
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="images/meat.png"></i><a class="ml-22" title="熟食/肉类" onclick="document.getElementById('index_none_header_sysc').name=this.title">熟食/肉类</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="sort-side">
																	<dl class="dl-sort">
																		<dt><span title="猪肉脯">猪肉脯</span></dt>
																		<dd><a title="三只松鼠 猪肉脯" href="#"><span>三只松鼠 猪肉脯</span></a></dd>
																		<dd><a title="百草味 猪肉干" href="#"><span>百草味 猪肉干</span></a></dd>
																		<dd><a title="蜀道香" href="#"><span>蜀道香</span></a></dd>
																		<dd><a title="良品铺子" href="#"><span>良品铺子</span></a></dd>
																		<dd><a title="宏香记" href="#"><span>宏香记</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="牛肉丝">牛肉丝</span></dt>
																		<dd><a title="科尔沁灯影牛肉丝" href="#"><span>科尔沁灯影牛肉丝</span></a></dd>
																		<dd><a title="蜀道香麻辣灯影牛肉丝" href="#"><span>蜀道香麻辣灯影牛肉丝</span></a></dd>
																		<dd><a title="四川特产棒棒娃麻牛肉丝" href="#"><span>四川特产棒棒娃麻牛肉丝</span></a></dd>
																		<dd><a title="科尔沁灯影牛肉丝" href="#"><span>科尔沁灯影牛肉丝</span></a></dd>
																		<dd><a title="老川东灯影牛肉丝" href="#"><span>老川东灯影牛肉丝</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="小香肠">小香肠</span></dt>
																		<dd><a title="百草味 炭烤小香肠" href="#"><span>百草味 炭烤小香肠</span></a></dd>
																		<dd><a title="宏香记原味猪肉肠" href="#"><span>宏香记原味猪肉肠</span></a></dd>
																		<dd><a title="力诚火腿肠" href="#"><span>力诚火腿肠</span></a></dd>
																		<dd><a title="金锣 玉米热狗香肠" href="#"><span>金锣 玉米热狗香肠</span></a></dd>
																		<dd><a title="双汇香酥小香肠" href="#"><span>双汇香酥小香肠</span></a></dd>
																	</dl>
																</div>
																<div class="brand-side">
																	<dl class="dl-sort"><dt><span>实力商家</span></dt>
																		<dd><a rel="nofollow" title="双汇 " target="_blank" href="#" rel="nofollow"><span  class="red" >双汇 </span></a></dd>
																		<dd><a rel="nofollow" title="金锣" target="_blank" href="#" rel="nofollow"><span >金锣</span></a></dd>
																		<dd><a rel="nofollow" title="力诚  " target="_blank" href="#" rel="nofollow"><span  class="red" >力诚  </span></a></dd>
																		<dd><a rel="nofollow" title="老川东灯影 " target="_blank" href="#" rel="nofollow"><span >老川东灯影 </span></a></dd>
																		<dd><a rel="nofollow" title="良品铺子" target="_blank" href="#" rel="nofollow"><span >良品铺子 </span></a></dd>
																		<dd><a rel="nofollow" title="三只松鼠" target="_blank" href="#" rel="nofollow"><span >三只松鼠</span></a></dd>
																		<dd><a rel="nofollow" title="蜀道香" target="_blank" href="#" rel="nofollow"><span  class="red" >蜀道香</span></a></dd>
																		<dd><a rel="nofollow" title="科尔沁灯影 " target="_blank" href="#" rel="nofollow"><span >科尔沁灯影 </span></a></dd>
																		
																	</dl>
																</div>
															</div>
														</div>
													</div>
												</div>
                                            <b class="arrow"></b>
											</li>
											<li >
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="images/cookies.png"></i><a class="ml-22" title="饼干/膨化" onclick="document.getElementById('index_none_header_sysc').name=this.title">饼干/膨化</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="sort-side">
																	<dl class="dl-sort">
																		<dt><span title="饼干">饼干</span></dt>
																		<dd><a title="梳打饼干" href="#"><span>梳打饼干</span></a></dd>
																		<dd><a title="奥利奥" href="#"><span>奥利奥</span></a></dd>
																		<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>
																		<dd><a title="猴姑猴头" href="#"><span>猴姑猴头</span></a></dd>
																		<dd><a title="优冠" href="#"><span>优冠</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="薯片">薯片</span></dt>
																		<dd><a title="乐事真脆薯条" href="#"><span>乐事真脆薯条</span></a></dd>
																		<dd><a title="五味园薯片薯条" href="#"><span>五味园薯片薯条</span></a></dd>
																		<dd><a title="良品铺子沙拉薯条" href="#"><span>良品铺子沙拉薯条</span></a></dd>
																		<dd><a title="百草味蜂蜜黄油味薯条" href="#"><span>百草味蜂蜜黄油味薯条</span></a></dd>
																		<dd><a title="良品铺子薯条" href="#"><span>良品铺子薯条</span></a></dd>
																		<dd><a title="Lay’s/乐事真脆薯条" href="#"><span>Lay’s/乐事真脆薯条</span></a></dd>
																		<dd><a title="菲奥娜薯条" href="#"><span>菲奥娜薯条</span></a></dd>
																		<dd><a title="好丽友 呀！土豆 " href="#"><span>好丽友 呀！土豆 </span></a></dd>
																		<dd><a title="上好佳薯条" href="#"><span>上好佳薯条</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="蛋糕">虾条</span></dt>
																		<dd><a title="爱尚咪咪虾条" href="#"><span>爱尚咪咪虾条</span></a></dd>
																		<dd><a title="亲亲虾条虾片10包" href="#"><span>亲亲虾条虾片10包</span></a></dd>
																		<dd><a title="泰国进口 卡乐美" href="#"><span>泰国进口 卡乐美</span></a></dd>
																		<dd><a title="上好佳鲜虾条" href="#"><span>上好佳鲜虾条</span></a></dd>
																		<dd><a title="四洲原味虾条" href="#"><span>四洲原味虾条</span></a></dd>
																		<dd><a title="农心 辣味鲜虾条" href="#"><span>农心 辣味鲜虾条</span></a></dd>
																		<dd><a title="咪咪虾条" href="#"><span>咪咪虾条</span></a></dd>
																		<dd><a title="光裕膨化食品Q仔" href="#"><span>光裕膨化食品Q仔</span></a></dd>
																		<dd><a title="正宗咪咪虾条" href="#"><span>正宗咪咪虾条</span></a></dd>
																	</dl>
																</div>
																<div class="brand-side">
																	<dl class="dl-sort"><dt><span>实力商家</span></dt>
																		<dd><a rel="nofollow" title="上好佳" target="_blank" href="#" rel="nofollow"><span  class ="red" >上好佳</span></a></dd>
																		<dd><a rel="nofollow" title="农心" target="_blank" href="#" rel="nofollow"><span  class ="red" >农心</span></a></dd>
																		<dd><a rel="nofollow" title="亲亲" target="_blank" href="#" rel="nofollow"><span >亲亲</span></a></dd>
																		<dd><a rel="nofollow" title="好丽友" target="_blank" href="#" rel="nofollow"><span >好丽友</span></a></dd>
																		<dd><a rel="nofollow" title="卡乐美" target="_blank" href="#" rel="nofollow"><span  class ="red" >卡乐美</span></a></dd>
																		<dd><a rel="nofollow" title="咪咪" target="_blank" href="#" rel="nofollow"><span >咪咪</span></a></dd>
																		
																	</dl>
																</div>
															</div>
														</div>
													</div>
												</div>
                                             <b class="arrow"></b>
											</li>
											<li >
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="images/cookies.png"></i><a class="ml-22" title="饼干/膨化" onclick="document.getElementById('index_none_header_sysc').name=this.title">饼干/膨化</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="sort-side">
																	<dl class="dl-sort">
																		<dt><span title="饼干">饼干</span></dt>
																		<dd><a title="梳打饼干" href="#"><span>梳打饼干</span></a></dd>
																		<dd><a title="奥利奥" href="#"><span>奥利奥</span></a></dd>
																		<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>
																		<dd><a title="猴姑猴头" href="#"><span>猴姑猴头</span></a></dd>
																		<dd><a title="优冠" href="#"><span>优冠</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="薯片">薯片</span></dt>
																		<dd><a title="乐事真脆薯条" href="#"><span>乐事真脆薯条</span></a></dd>
																		<dd><a title="五味园薯片薯条" href="#"><span>五味园薯片薯条</span></a></dd>
																		<dd><a title="良品铺子沙拉薯条" href="#"><span>良品铺子沙拉薯条</span></a></dd>
																		<dd><a title="百草味蜂蜜黄油味薯条" href="#"><span>百草味蜂蜜黄油味薯条</span></a></dd>
																		<dd><a title="良品铺子薯条" href="#"><span>良品铺子薯条</span></a></dd>
																		<dd><a title="Lay’s/乐事真脆薯条" href="#"><span>Lay’s/乐事真脆薯条</span></a></dd>
																		<dd><a title="菲奥娜薯条" href="#"><span>菲奥娜薯条</span></a></dd>
																		<dd><a title="好丽友 呀！土豆 " href="#"><span>好丽友 呀！土豆 </span></a></dd>
																		<dd><a title="上好佳薯条" href="#"><span>上好佳薯条</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="蛋糕">虾条</span></dt>
																		<dd><a title="爱尚咪咪虾条" href="#"><span>爱尚咪咪虾条</span></a></dd>
																		<dd><a title="亲亲虾条虾片10包" href="#"><span>亲亲虾条虾片10包</span></a></dd>
																		<dd><a title="泰国进口 卡乐美" href="#"><span>泰国进口 卡乐美</span></a></dd>
																		<dd><a title="上好佳鲜虾条" href="#"><span>上好佳鲜虾条</span></a></dd>
																		<dd><a title="四洲原味虾条" href="#"><span>四洲原味虾条</span></a></dd>
																		<dd><a title="农心 辣味鲜虾条" href="#"><span>农心 辣味鲜虾条</span></a></dd>
																		<dd><a title="咪咪虾条" href="#"><span>咪咪虾条</span></a></dd>
																		<dd><a title="光裕膨化食品Q仔" href="#"><span>光裕膨化食品Q仔</span></a></dd>
																		<dd><a title="正宗咪咪虾条" href="#"><span>正宗咪咪虾条</span></a></dd>
																	</dl>
																</div>
																<div class="brand-side">
																	<dl class="dl-sort"><dt><span>实力商家</span></dt>
																		<dd><a rel="nofollow" title="上好佳" target="_blank" href="#" rel="nofollow"><span  class ="red" >上好佳</span></a></dd>
																		<dd><a rel="nofollow" title="农心" target="_blank" href="#" rel="nofollow"><span  class ="red" >农心</span></a></dd>
																		<dd><a rel="nofollow" title="亲亲" target="_blank" href="#" rel="nofollow"><span >亲亲</span></a></dd>
																		<dd><a rel="nofollow" title="好丽友" target="_blank" href="#" rel="nofollow"><span >好丽友</span></a></dd>
																		<dd><a rel="nofollow" title="卡乐美" target="_blank" href="#" rel="nofollow"><span  class ="red" >卡乐美</span></a></dd>
																		<dd><a rel="nofollow" title="咪咪" target="_blank" href="#" rel="nofollow"><span >咪咪</span></a></dd>
																		
																	</dl>
																</div>
															</div>
														</div>
													</div>
												</div>
                                             <b class="arrow"></b>
											</li>
											<li >
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="images/cookies.png"></i><a class="ml-22" title="饼干/膨化" onclick="document.getElementById('index_none_header_sysc').name=this.title">饼干/膨化</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="sort-side">
																	<dl class="dl-sort">
																		<dt><span title="饼干">饼干</span></dt>
																		<dd><a title="梳打饼干" href="#"><span>梳打饼干</span></a></dd>
																		<dd><a title="奥利奥" href="#"><span>奥利奥</span></a></dd>
																		<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>
																		<dd><a title="猴姑猴头" href="#"><span>猴姑猴头</span></a></dd>
																		<dd><a title="优冠" href="#"><span>优冠</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="薯片">薯片</span></dt>
																		<dd><a title="乐事真脆薯条" href="#"><span>乐事真脆薯条</span></a></dd>
																		<dd><a title="五味园薯片薯条" href="#"><span>五味园薯片薯条</span></a></dd>
																		<dd><a title="良品铺子沙拉薯条" href="#"><span>良品铺子沙拉薯条</span></a></dd>
																		<dd><a title="百草味蜂蜜黄油味薯条" href="#"><span>百草味蜂蜜黄油味薯条</span></a></dd>
																		<dd><a title="良品铺子薯条" href="#"><span>良品铺子薯条</span></a></dd>
																		<dd><a title="Lay’s/乐事真脆薯条" href="#"><span>Lay’s/乐事真脆薯条</span></a></dd>
																		<dd><a title="菲奥娜薯条" href="#"><span>菲奥娜薯条</span></a></dd>
																		<dd><a title="好丽友 呀！土豆 " href="#"><span>好丽友 呀！土豆 </span></a></dd>
																		<dd><a title="上好佳薯条" href="#"><span>上好佳薯条</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="蛋糕">虾条</span></dt>
																		<dd><a title="爱尚咪咪虾条" href="#"><span>爱尚咪咪虾条</span></a></dd>
																		<dd><a title="亲亲虾条虾片10包" href="#"><span>亲亲虾条虾片10包</span></a></dd>
																		<dd><a title="泰国进口 卡乐美" href="#"><span>泰国进口 卡乐美</span></a></dd>
																		<dd><a title="上好佳鲜虾条" href="#"><span>上好佳鲜虾条</span></a></dd>
																		<dd><a title="四洲原味虾条" href="#"><span>四洲原味虾条</span></a></dd>
																		<dd><a title="农心 辣味鲜虾条" href="#"><span>农心 辣味鲜虾条</span></a></dd>
																		<dd><a title="咪咪虾条" href="#"><span>咪咪虾条</span></a></dd>
																		<dd><a title="光裕膨化食品Q仔" href="#"><span>光裕膨化食品Q仔</span></a></dd>
																		<dd><a title="正宗咪咪虾条" href="#"><span>正宗咪咪虾条</span></a></dd>
																	</dl>
																</div>
																<div class="brand-side">
																	<dl class="dl-sort"><dt><span>实力商家</span></dt>
																		<dd><a rel="nofollow" title="上好佳" target="_blank" href="#" rel="nofollow"><span  class ="red" >上好佳</span></a></dd>
																		<dd><a rel="nofollow" title="农心" target="_blank" href="#" rel="nofollow"><span  class ="red" >农心</span></a></dd>
																		<dd><a rel="nofollow" title="亲亲" target="_blank" href="#" rel="nofollow"><span >亲亲</span></a></dd>
																		<dd><a rel="nofollow" title="好丽友" target="_blank" href="#" rel="nofollow"><span >好丽友</span></a></dd>
																		<dd><a rel="nofollow" title="卡乐美" target="_blank" href="#" rel="nofollow"><span  class ="red" >卡乐美</span></a></dd>
																		<dd><a rel="nofollow" title="咪咪" target="_blank" href="#" rel="nofollow"><span >咪咪</span></a></dd>
																		
																	</dl>
																</div>
															</div>
														</div>
													</div>
												</div>
                                             <b class="arrow"></b>
											</li>
											<li >
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="images/cookies.png"></i><a class="ml-22" title="饼干/膨化" onclick="document.getElementById('index_none_header_sysc').name=this.title">饼干/膨化</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="sort-side">
																	<dl class="dl-sort">
																		<dt><span title="饼干">饼干</span></dt>
																		<dd><a title="梳打饼干" href="#"><span>梳打饼干</span></a></dd>
																		<dd><a title="奥利奥" href="#"><span>奥利奥</span></a></dd>
																		<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>
																		<dd><a title="猴姑猴头" href="#"><span>猴姑猴头</span></a></dd>
																		<dd><a title="优冠" href="#"><span>优冠</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="薯片">薯片</span></dt>
																		<dd><a title="乐事真脆薯条" href="#"><span>乐事真脆薯条</span></a></dd>
																		<dd><a title="五味园薯片薯条" href="#"><span>五味园薯片薯条</span></a></dd>
																		<dd><a title="良品铺子沙拉薯条" href="#"><span>良品铺子沙拉薯条</span></a></dd>
																		<dd><a title="百草味蜂蜜黄油味薯条" href="#"><span>百草味蜂蜜黄油味薯条</span></a></dd>
																		<dd><a title="良品铺子薯条" href="#"><span>良品铺子薯条</span></a></dd>
																		<dd><a title="Lay’s/乐事真脆薯条" href="#"><span>Lay’s/乐事真脆薯条</span></a></dd>
																		<dd><a title="菲奥娜薯条" href="#"><span>菲奥娜薯条</span></a></dd>
																		<dd><a title="好丽友 呀！土豆 " href="#"><span>好丽友 呀！土豆 </span></a></dd>
																		<dd><a title="上好佳薯条" href="#"><span>上好佳薯条</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="蛋糕">虾条</span></dt>
																		<dd><a title="爱尚咪咪虾条" href="#"><span>爱尚咪咪虾条</span></a></dd>
																		<dd><a title="亲亲虾条虾片10包" href="#"><span>亲亲虾条虾片10包</span></a></dd>
																		<dd><a title="泰国进口 卡乐美" href="#"><span>泰国进口 卡乐美</span></a></dd>
																		<dd><a title="上好佳鲜虾条" href="#"><span>上好佳鲜虾条</span></a></dd>
																		<dd><a title="四洲原味虾条" href="#"><span>四洲原味虾条</span></a></dd>
																		<dd><a title="农心 辣味鲜虾条" href="#"><span>农心 辣味鲜虾条</span></a></dd>
																		<dd><a title="咪咪虾条" href="#"><span>咪咪虾条</span></a></dd>
																		<dd><a title="光裕膨化食品Q仔" href="#"><span>光裕膨化食品Q仔</span></a></dd>
																		<dd><a title="正宗咪咪虾条" href="#"><span>正宗咪咪虾条</span></a></dd>
																	</dl>
																</div>
																<div class="brand-side">
																	<dl class="dl-sort"><dt><span>实力商家</span></dt>
																		<dd><a rel="nofollow" title="上好佳" target="_blank" href="#" rel="nofollow"><span  class ="red" >上好佳</span></a></dd>
																		<dd><a rel="nofollow" title="农心" target="_blank" href="#" rel="nofollow"><span  class ="red" >农心</span></a></dd>
																		<dd><a rel="nofollow" title="亲亲" target="_blank" href="#" rel="nofollow"><span >亲亲</span></a></dd>
																		<dd><a rel="nofollow" title="好丽友" target="_blank" href="#" rel="nofollow"><span >好丽友</span></a></dd>
																		<dd><a rel="nofollow" title="卡乐美" target="_blank" href="#" rel="nofollow"><span  class ="red" >卡乐美</span></a></dd>
																		<dd><a rel="nofollow" title="咪咪" target="_blank" href="#" rel="nofollow"><span >咪咪</span></a></dd>
																		
																	</dl>
																</div>
															</div>
														</div>
													</div>
												</div>
                                             <b class="arrow"></b>
											</li>
											<li >
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="images/cookies.png"></i><a class="ml-22" title="饼干/膨化" onclick="document.getElementById('index_none_header_sysc').name=this.title">饼干/膨化</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="sort-side">
																	<dl class="dl-sort">
																		<dt><span title="饼干">饼干</span></dt>
																		<dd><a title="梳打饼干" href="#"><span>梳打饼干</span></a></dd>
																		<dd><a title="奥利奥" href="#"><span>奥利奥</span></a></dd>
																		<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>
																		<dd><a title="猴姑猴头" href="#"><span>猴姑猴头</span></a></dd>
																		<dd><a title="优冠" href="#"><span>优冠</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="薯片">薯片</span></dt>
																		<dd><a title="乐事真脆薯条" href="#"><span>乐事真脆薯条</span></a></dd>
																		<dd><a title="五味园薯片薯条" href="#"><span>五味园薯片薯条</span></a></dd>
																		<dd><a title="良品铺子沙拉薯条" href="#"><span>良品铺子沙拉薯条</span></a></dd>
																		<dd><a title="百草味蜂蜜黄油味薯条" href="#"><span>百草味蜂蜜黄油味薯条</span></a></dd>
																		<dd><a title="良品铺子薯条" href="#"><span>良品铺子薯条</span></a></dd>
																		<dd><a title="Lay’s/乐事真脆薯条" href="#"><span>Lay’s/乐事真脆薯条</span></a></dd>
																		<dd><a title="菲奥娜薯条" href="#"><span>菲奥娜薯条</span></a></dd>
																		<dd><a title="好丽友 呀！土豆 " href="#"><span>好丽友 呀！土豆 </span></a></dd>
																		<dd><a title="上好佳薯条" href="#"><span>上好佳薯条</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="蛋糕">虾条</span></dt>
																		<dd><a title="爱尚咪咪虾条" href="#"><span>爱尚咪咪虾条</span></a></dd>
																		<dd><a title="亲亲虾条虾片10包" href="#"><span>亲亲虾条虾片10包</span></a></dd>
																		<dd><a title="泰国进口 卡乐美" href="#"><span>泰国进口 卡乐美</span></a></dd>
																		<dd><a title="上好佳鲜虾条" href="#"><span>上好佳鲜虾条</span></a></dd>
																		<dd><a title="四洲原味虾条" href="#"><span>四洲原味虾条</span></a></dd>
																		<dd><a title="农心 辣味鲜虾条" href="#"><span>农心 辣味鲜虾条</span></a></dd>
																		<dd><a title="咪咪虾条" href="#"><span>咪咪虾条</span></a></dd>
																		<dd><a title="光裕膨化食品Q仔" href="#"><span>光裕膨化食品Q仔</span></a></dd>
																		<dd><a title="正宗咪咪虾条" href="#"><span>正宗咪咪虾条</span></a></dd>
																	</dl>
																</div>
																<div class="brand-side">
																	<dl class="dl-sort"><dt><span>实力商家</span></dt>
																		<dd><a rel="nofollow" title="上好佳" target="_blank" href="#" rel="nofollow"><span  class ="red" >上好佳</span></a></dd>
																		<dd><a rel="nofollow" title="农心" target="_blank" href="#" rel="nofollow"><span  class ="red" >农心</span></a></dd>
																		<dd><a rel="nofollow" title="亲亲" target="_blank" href="#" rel="nofollow"><span >亲亲</span></a></dd>
																		<dd><a rel="nofollow" title="好丽友" target="_blank" href="#" rel="nofollow"><span >好丽友</span></a></dd>
																		<dd><a rel="nofollow" title="卡乐美" target="_blank" href="#" rel="nofollow"><span  class ="red" >卡乐美</span></a></dd>
																		<dd><a rel="nofollow" title="咪咪" target="_blank" href="#" rel="nofollow"><span >咪咪</span></a></dd>
																		
																	</dl>
																</div>
															</div>
														</div>
													</div>
												</div>
                                             <b class="arrow"></b>
											</li>
											<li >
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="images/cookies.png"></i><a class="ml-22" title="饼干/膨化" onclick="document.getElementById('index_none_header_sysc').name=this.title">饼干/膨化</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="sort-side">
																	<dl class="dl-sort">
																		<dt><span title="饼干">饼干</span></dt>
																		<dd><a title="梳打饼干" href="#"><span>梳打饼干</span></a></dd>
																		<dd><a title="奥利奥" href="#"><span>奥利奥</span></a></dd>
																		<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>
																		<dd><a title="猴姑猴头" href="#"><span>猴姑猴头</span></a></dd>
																		<dd><a title="优冠" href="#"><span>优冠</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="薯片">薯片</span></dt>
																		<dd><a title="乐事真脆薯条" href="#"><span>乐事真脆薯条</span></a></dd>
																		<dd><a title="五味园薯片薯条" href="#"><span>五味园薯片薯条</span></a></dd>
																		<dd><a title="良品铺子沙拉薯条" href="#"><span>良品铺子沙拉薯条</span></a></dd>
																		<dd><a title="百草味蜂蜜黄油味薯条" href="#"><span>百草味蜂蜜黄油味薯条</span></a></dd>
																		<dd><a title="良品铺子薯条" href="#"><span>良品铺子薯条</span></a></dd>
																		<dd><a title="Lay’s/乐事真脆薯条" href="#"><span>Lay’s/乐事真脆薯条</span></a></dd>
																		<dd><a title="菲奥娜薯条" href="#"><span>菲奥娜薯条</span></a></dd>
																		<dd><a title="好丽友 呀！土豆 " href="#"><span>好丽友 呀！土豆 </span></a></dd>
																		<dd><a title="上好佳薯条" href="#"><span>上好佳薯条</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="蛋糕">虾条</span></dt>
																		<dd><a title="爱尚咪咪虾条" href="#"><span>爱尚咪咪虾条</span></a></dd>
																		<dd><a title="亲亲虾条虾片10包" href="#"><span>亲亲虾条虾片10包</span></a></dd>
																		<dd><a title="泰国进口 卡乐美" href="#"><span>泰国进口 卡乐美</span></a></dd>
																		<dd><a title="上好佳鲜虾条" href="#"><span>上好佳鲜虾条</span></a></dd>
																		<dd><a title="四洲原味虾条" href="#"><span>四洲原味虾条</span></a></dd>
																		<dd><a title="农心 辣味鲜虾条" href="#"><span>农心 辣味鲜虾条</span></a></dd>
																		<dd><a title="咪咪虾条" href="#"><span>咪咪虾条</span></a></dd>
																		<dd><a title="光裕膨化食品Q仔" href="#"><span>光裕膨化食品Q仔</span></a></dd>
																		<dd><a title="正宗咪咪虾条" href="#"><span>正宗咪咪虾条</span></a></dd>
																	</dl>
																</div>
																<div class="brand-side">
																	<dl class="dl-sort"><dt><span>实力商家</span></dt>
																		<dd><a rel="nofollow" title="上好佳" target="_blank" href="#" rel="nofollow"><span  class ="red" >上好佳</span></a></dd>
																		<dd><a rel="nofollow" title="农心" target="_blank" href="#" rel="nofollow"><span  class ="red" >农心</span></a></dd>
																		<dd><a rel="nofollow" title="亲亲" target="_blank" href="#" rel="nofollow"><span >亲亲</span></a></dd>
																		<dd><a rel="nofollow" title="好丽友" target="_blank" href="#" rel="nofollow"><span >好丽友</span></a></dd>
																		<dd><a rel="nofollow" title="卡乐美" target="_blank" href="#" rel="nofollow"><span  class ="red" >卡乐美</span></a></dd>
																		<dd><a rel="nofollow" title="咪咪" target="_blank" href="#" rel="nofollow"><span >咪咪</span></a></dd>
																		
																	</dl>
																</div>
															</div>
														</div>
													</div>
												</div>
                                             <b class="arrow"></b>
											</li>
											<li >
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="images/cookies.png"></i><a class="ml-22" title="饼干/膨化" onclick="document.getElementById('index_none_header_sysc').name=this.title">饼干/膨化</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="sort-side">
																	<dl class="dl-sort">
																		<dt><span title="饼干">饼干</span></dt>
																		<dd><a title="梳打饼干" href="#"><span>梳打饼干</span></a></dd>
																		<dd><a title="奥利奥" href="#"><span>奥利奥</span></a></dd>
																		<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>
																		<dd><a title="猴姑猴头" href="#"><span>猴姑猴头</span></a></dd>
																		<dd><a title="优冠" href="#"><span>优冠</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="薯片">薯片</span></dt>
																		<dd><a title="乐事真脆薯条" href="#"><span>乐事真脆薯条</span></a></dd>
																		<dd><a title="五味园薯片薯条" href="#"><span>五味园薯片薯条</span></a></dd>
																		<dd><a title="良品铺子沙拉薯条" href="#"><span>良品铺子沙拉薯条</span></a></dd>
																		<dd><a title="百草味蜂蜜黄油味薯条" href="#"><span>百草味蜂蜜黄油味薯条</span></a></dd>
																		<dd><a title="良品铺子薯条" href="#"><span>良品铺子薯条</span></a></dd>
																		<dd><a title="Lay’s/乐事真脆薯条" href="#"><span>Lay’s/乐事真脆薯条</span></a></dd>
																		<dd><a title="菲奥娜薯条" href="#"><span>菲奥娜薯条</span></a></dd>
																		<dd><a title="好丽友 呀！土豆 " href="#"><span>好丽友 呀！土豆 </span></a></dd>
																		<dd><a title="上好佳薯条" href="#"><span>上好佳薯条</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="蛋糕">虾条</span></dt>
																		<dd><a title="爱尚咪咪虾条" href="#"><span>爱尚咪咪虾条</span></a></dd>
																		<dd><a title="亲亲虾条虾片10包" href="#"><span>亲亲虾条虾片10包</span></a></dd>
																		<dd><a title="泰国进口 卡乐美" href="#"><span>泰国进口 卡乐美</span></a></dd>
																		<dd><a title="上好佳鲜虾条" href="#"><span>上好佳鲜虾条</span></a></dd>
																		<dd><a title="四洲原味虾条" href="#"><span>四洲原味虾条</span></a></dd>
																		<dd><a title="农心 辣味鲜虾条" href="#"><span>农心 辣味鲜虾条</span></a></dd>
																		<dd><a title="咪咪虾条" href="#"><span>咪咪虾条</span></a></dd>
																		<dd><a title="光裕膨化食品Q仔" href="#"><span>光裕膨化食品Q仔</span></a></dd>
																		<dd><a title="正宗咪咪虾条" href="#"><span>正宗咪咪虾条</span></a></dd>
																	</dl>
																</div>
																<div class="brand-side">
																	<dl class="dl-sort"><dt><span>实力商家</span></dt>
																		<dd><a rel="nofollow" title="上好佳" target="_blank" href="#" rel="nofollow"><span  class ="red" >上好佳</span></a></dd>
																		<dd><a rel="nofollow" title="农心" target="_blank" href="#" rel="nofollow"><span  class ="red" >农心</span></a></dd>
																		<dd><a rel="nofollow" title="亲亲" target="_blank" href="#" rel="nofollow"><span >亲亲</span></a></dd>
																		<dd><a rel="nofollow" title="好丽友" target="_blank" href="#" rel="nofollow"><span >好丽友</span></a></dd>
																		<dd><a rel="nofollow" title="卡乐美" target="_blank" href="#" rel="nofollow"><span  class ="red" >卡乐美</span></a></dd>
																		<dd><a rel="nofollow" title="咪咪" target="_blank" href="#" rel="nofollow"><span >咪咪</span></a></dd>
																		
																	</dl>
																</div>
															</div>
														</div>
													</div>
												</div>
                                             <b class="arrow"></b>
											</li>
											<li >
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="images/bamboo.png"></i><a class="ml-22" title="素食/卤味" onclick="document.getElementById('index_none_header_sysc').name=this.title">素食/卤味</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="sort-side">
																	<dl class="dl-sort">
																		<dt><span title="豆干">豆干</span></dt>
																		<dd><a title="卫龙小面筋" href="#"><span>卫龙小面筋</span></a></dd>
																		<dd><a title="徽记好巴食豆腐干" href="#"><span>徽记好巴食豆腐干</span></a></dd>
																		<dd><a title="良品铺子甜辣薄豆干" href="#"><span>良品铺子甜辣薄豆干</span></a></dd>
																		<dd><a title="炎亭渔夫鱼豆腐烧" href="#"><span>炎亭渔夫鱼豆腐烧</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="干笋">笋干</span></dt>
																		<dd><a title="良品铺子笋干泡椒" href="#"><span>良品铺子笋干泡椒</span></a></dd>
																		<dd><a title="杨生记 山椒竹笋" href="#"><span>杨生记 山椒竹笋</span></a></dd>
																		<dd><a title="徽记好巴食笋片" href="#"><span>徽记好巴食笋片</span></a></dd>
																		<dd><a title="博鸿小菜梅菜笋" href="#"><span>博鸿小菜梅菜笋</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="鸭脖">鸭脖</span></dt>
																		<dd><a title="周黑鸭" href="#"><span>周黑鸭</span></a></dd>
																		<dd><a title="良品铺子甜辣鸭脖" href="#"><span>良品铺子甜辣鸭脖</span></a></dd>
																		<dd><a title="善味阁鲜卤鸭脖" href="#"><span>善味阁鲜卤鸭脖</span></a></dd>
																		<dd><a title="绝味鸭脖" href="#"><span>绝味鸭脖</span></a></dd>
																		<dd><a title="精武鸭脖" href="#"><span>精武鸭脖</span></a></dd>
																		<dd><a title="三只松鼠 鸭脖" href="#"><span>三只松鼠 鸭脖</span></a></dd>
																		<dd><a title="姚太太 香辣鸭脖" href="#"><span>姚太太 香辣鸭脖</span></a></dd>
																		<dd><a title="善味阁鲜卤鸭脖" href="#"><span>善味阁鲜卤鸭脖</span></a></dd>
																		<dd><a title="小胡鸭鸭脖" href="#"><span>小胡鸭鸭脖</span></a></dd>
																	</dl>
																</div>
																<div class="brand-side">
																	<dl class="dl-sort"><dt><span>实力商家</span></dt>
																		<dd><a rel="nofollow" title="良平铺子" target="_blank" href="#" rel="nofollow"><span  class="red" >歌芙品牌旗舰店</span></a></dd>
																		<dd><a rel="nofollow" title="三只松鼠" target="_blank" href="#" rel="nofollow"><span >爱丝蓝内衣厂</span></a></dd>
																		<dd><a rel="nofollow" title="小胡鸭" target="_blank" href="#" rel="nofollow"><span >香港优蓓尔防辐射</span></a></dd>
																		<dd><a rel="nofollow" title="姚太太" target="_blank" href="#" rel="nofollow"><span >蓉莉娜内衣批发</span></a></dd>
																	</dl>
																</div>
															</div>
														</div>
													</div>
												</div>
                                             <b class="arrow"></b>
											</li>
											<li >
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="images/nut.png"></i><a class="ml-22" title="坚果、炒货" onclick="document.getElementById('index_none_header_sysc').name=this.title">坚果/炒货</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="sort-side">
																	<dl class="dl-sort">
																		<dt><span title="蛋糕">坚果</span></dt>
																		<dd><a title="沃隆每日坚果" href="#"><span>沃隆每日坚果</span></a></dd>
																		<dd><a title="三只松鼠 夏威夷坚果" href="#"><span>三只松鼠 夏威夷坚果</span></a></dd>
																		<dd><a title="百草味 坚果炒货 " href="#"><span>百草味 坚果炒货 </span></a></dd>
															
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="蛋糕">锅巴</span></dt>
																		<dd><a title="三只松鼠 脆米锅巴" href="#"><span>三只松鼠 脆米锅巴</span></a></dd>
																		<dd><a title="良品铺子小米锅巴" href="#"><span>良品铺子小米锅巴</span></a></dd>
																		<dd><a title="太阳锅巴" href="#"><span>太阳锅巴</span></a></dd>
																		<dd><a title="琥珀锅巴" href="#"><span>琥珀锅巴</span></a></dd>
																		<dd><a title="粮悦大吃兄锅巴" href="#"><span>粮悦大吃兄锅巴</span></a></dd>
																		<dd><a title="傻二哥 粗粮锅巴" href="#"><span>傻二哥 粗粮锅巴</span></a></dd>
																		<dd><a title="慕滋小米锅巴" href="#"><span>慕滋小米锅巴</span></a></dd>
																		<dd><a title="百草味 麻辣味小锅巴" href="#"><span>百草味 麻辣味小锅巴</span></a></dd>
																		<dd><a title="卧龙手工大米老灶锅巴" href="#"><span>卧龙手工大米老灶锅巴</span></a></dd>
																	</dl>
																</div>
																<div class="brand-side">
																	<dl class="dl-sort"><dt><span>实力商家</span></dt>
																		<dd><a rel="nofollow" title="三只松鼠" target="_blank" href="#" rel="nofollow"><span  class="red" >呵呵嘿官方旗舰店</span></a></dd>
																		<dd><a rel="nofollow" title="良品铺子" target="_blank" href="#" rel="nofollow"><span >格瑞旗舰店</span></a></dd>
																		<dd><a rel="nofollow" title="粮悦大吃兄" target="_blank" href="#" rel="nofollow"><span  class="red" >飞彦大厂直供</span></a></dd>
																		<dd><a rel="nofollow" title="沃隆" target="_blank" href="#" rel="nofollow"><span >红e·艾菲妮</span></a></dd>
																		<dd><a rel="nofollow" title="傻二哥" target="_blank" href="#" rel="nofollow"><span  class="red" >本真旗舰店</span></a></dd>
																		<dd><a rel="nofollow" title="百草味" target="_blank" href="#" rel="nofollow"><span  class="red" >杭派女装批发网</span></a></dd>
																		
																	</dl>
																</div>
															</div>
														</div>
													</div>
												</div>
												<b class="arrow"></b>
											</li>
											<li >
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="images/candy.png"></i><a class="ml-22" title="糖果/蜜饯" onclick="document.getElementById('index_none_header_sysc').name=this.title">糖果/蜜饯</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="sort-side">
																	<dl class="dl-sort">
																		<dt><span title="糖果">糖果</span></dt>
																		<dd><a title="大白兔原味奶糖" href="#"><span>大白兔原味奶糖</span></a></dd>
																		<dd><a title="不二家果味棒棒糖" href="#"><span>不二家果味棒棒糖</span></a></dd>
																		<dd><a title="旺旺 旺仔牛奶糖 " href="#"><span>旺旺 旺仔牛奶糖 </span></a></dd>
																		<dd><a title="宏源陈皮糖" href="#"><span>宏源陈皮糖</span></a></dd>
																		<dd><a title="小样酸Q糖" href="#"><span>小样酸Q糖</span></a></dd>
																		<dd><a title="阿尔卑斯棒棒糖" href="#"><span>阿尔卑斯棒棒糖</span></a></dd>
																		<dd><a title="箭牌真知棒水果味棒棒糖" href="#"><span>箭牌真知棒水果味棒棒糖</span></a></dd>
																		<dd><a title="雅伯黑糖话梅糖" href="#"><span>雅伯黑糖话梅糖</span></a></dd>
																		<dd><a title="亿滋 糖果" href="#"><span>亿滋 糖果</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="蜜饯">蜜饯</span></dt>
																		<dd><a title="良品铺子芒果干" href="#"><span>良品铺子芒果干</span></a></dd>
																		<dd><a title="三只松鼠 芒果干" href="#"><span>三只松鼠 芒果干</span></a></dd>
																		<dd><a title="百草味 黄桃干" href="#"><span>百草味 黄桃干</span></a></dd>
																		<dd><a title="三只松鼠 杨梅干" href="#"><span>三只松鼠 杨梅干</span></a></dd>
																		<dd><a title="华味亨铁山楂" href="#"><span>华味亨铁山楂</span></a></dd>
																		<dd><a title="百草味 草莓干" href="#"><span>百草味 草莓干</span></a></dd>
																		<dd><a title="三只松鼠 红杏干" href="#"><span>三只松鼠 红杏干</span></a></dd>
																	
																	</dl>
																</div>
																<div class="brand-side">
																	<dl class="dl-sort"><dt><span>实力商家</span></dt>
																		<dd><a rel="nofollow" title="三只松鼠" target="_blank" href="#" rel="nofollow"><span  class ="red" >三只松鼠</span></a></dd>
																		<dd><a rel="nofollow" title="百草味" target="_blank" href="#" rel="nofollow"><span  class ="red" >百草味</span></a></dd>
																		<dd><a rel="nofollow" title="不二家" target="_blank" href="#" rel="nofollow"><span >不二家</span></a></dd>
																		<dd><a rel="nofollow" title="阿尔卑斯" target="_blank" href="#" rel="nofollow"><span >阿尔卑斯</span></a></dd>
																		<dd><a rel="nofollow" title="良品铺子" target="_blank" href="#" rel="nofollow"><span  class ="red" >良品铺子</span></a></dd>
																	</dl>
																</div>
															</div>
														</div>
													</div>
												</div>
                                            <b class="arrow"></b>
											</li>
											<li >
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="images/chocolate.png"></i><a class="ml-22" title="巧克力" onclick="document.getElementById('index_none_header_sysc').name=this.title">巧克力</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="sort-side">
																	<dl class="dl-sort">
																		<dt><span title="蛋糕">巧克力</span></dt>
																		<dd><a title="德芙巧克力" href="#"><span>德芙巧克力</span></a></dd>
																		<dd><a title="德芙巧克力礼盒 " href="#"><span>德芙巧克力礼盒 </span></a></dd>
																		
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="蛋糕">果冻</span></dt>
																		<dd><a title="喜之郎蜜桔果肉果冻" href="#"><span>喜之郎蜜桔果肉果冻</span></a></dd>
																		<dd><a title="喜之郎什锦果冻" href="#"><span>喜之郎什锦果冻</span></a></dd>
																		<dd><a title="台湾进口果冻" href="#"><span>台湾进口果冻</span></a></dd>
																		<dd><a title="马来西亚进口果冻" href="#"><span>马来西亚进口果冻</span></a></dd>
																		
																	</dl>
																</div>
																<div class="brand-side">
																	<dl class="dl-sort"><dt><span>实力商家</span></dt>
																		<dd><a rel="nofollow" title="喜之郎 " target="_blank" href="#" rel="nofollow"><span  class="red" >喜之郎 </span></a></dd>
																		<dd><a rel="nofollow" title="德芙" target="_blank" href="#" rel="nofollow"><span >德芙</span></a></dd>
																		
																	</dl>
																</div>
															</div>
														</div>
													</div>
												</div>
												<b class="arrow"></b>
											</li>
											<li >
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="images/fish.png"></i><a class="ml-22" title="海味/河鲜" onclick="document.getElementById('index_none_header_sysc').name=this.title">海味/河鲜</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="sort-side">
																	<dl class="dl-sort">
																		<dt><span title="海带丝">海带丝</span></dt>
																		<dd><a title="蒸蛋糕" href="#"><span>蒸蛋糕</span></a></dd>
																		<dd><a title="脱水蛋糕" href="#"><span>脱水蛋糕</span></a></dd>
																		<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>
																		<dd><a title="软面包" href="#"><span>软面包</span></a></dd>
																		<dd><a title="马卡龙" href="#"><span>马卡龙</span></a></dd>
																		<dd><a title="千层饼" href="#"><span>千层饼</span></a></dd>
																		<dd><a title="甜甜圈" href="#"><span>甜甜圈</span></a></dd>
																		<dd><a title="蒸三明治" href="#"><span>蒸三明治</span></a></dd>
																		<dd><a title="铜锣烧" href="#"><span>铜锣烧</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="小鱼干">小鱼干</span></dt>
																		<dd><a title="蒸蛋糕" href="#"><span>蒸蛋糕</span></a></dd>
																		<dd><a title="脱水蛋糕" href="#"><span>脱水蛋糕</span></a></dd>
																		<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>
																		<dd><a title="软面包" href="#"><span>软面包</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="鱿鱼丝">鱿鱼丝</span></dt>
																		<dd><a title="蒸蛋糕" href="#"><span>蒸蛋糕</span></a></dd>
																		<dd><a title="脱水蛋糕" href="#"><span>脱水蛋糕</span></a></dd>
																		<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>
																		<dd><a title="软面包" href="#"><span>软面包</span></a></dd>
																	</dl>
																</div>
																<div class="brand-side">
																	<dl class="dl-sort"><dt><span>实力商家</span></dt>
																		<dd><a rel="nofollow" title="歌芙品牌旗舰店" target="_blank" href="#" rel="nofollow"><span  class="red" >歌芙品牌旗舰店</span></a></dd>
																		<dd><a rel="nofollow" title="爱丝蓝内衣厂" target="_blank" href="#" rel="nofollow"><span >爱丝蓝内衣厂</span></a></dd>
																		<dd><a rel="nofollow" title="炫点服饰" target="_blank" href="#" rel="nofollow"><span >炫点服饰</span></a></dd>
																		<dd><a rel="nofollow" title="雪茵美内衣厂批发" target="_blank" href="#" rel="nofollow"><span >雪茵美内衣厂批发</span></a></dd>
																		<dd><a rel="nofollow" title="金钻夫人" target="_blank" href="#" rel="nofollow"><span >金钻夫人</span></a></dd>
																		<dd><a rel="nofollow" title="伊美莎内衣" target="_blank" href="#" rel="nofollow"><span  class="red" >伊美莎内衣</span></a></dd>
																		<dd><a rel="nofollow" title="粉客内衣旗舰店" target="_blank" href="#" rel="nofollow"><span >粉客内衣旗舰店</span></a></dd>
																		<dd><a rel="nofollow" title="泽芳行旗舰店" target="_blank" href="#" rel="nofollow"><span >泽芳行旗舰店</span></a></dd>
																		<dd><a rel="nofollow" title="彩婷" target="_blank" href="#" rel="nofollow"><span  class="red" >彩婷</span></a></dd>
																		<dd><a rel="nofollow" title="黛兰希" target="_blank" href="#" rel="nofollow"><span >黛兰希</span></a></dd>
																		<dd><a rel="nofollow" title="香港优蓓尔防辐射" target="_blank" href="#" rel="nofollow"><span >香港优蓓尔防辐射</span></a></dd>
																		<dd><a rel="nofollow" title="蓉莉娜内衣批发" target="_blank" href="#" rel="nofollow"><span >蓉莉娜内衣批发</span></a></dd>
																	</dl>
																</div>
															</div>
														</div>
													</div>
												</div>
                                             <b class="arrow"></b>
											</li>
											<li >
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="images/tea.png"></i><a class="ml-22" title="花茶/果茶" onclick="document.getElementById('index_none_header_sysc').name=this.title">花茶/果茶</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="sort-side">
																	<dl class="dl-sort">
																		<dt><span title="蛋糕">蛋糕</span></dt>
																		<dd><a title="蒸蛋糕" href="#"><span>蒸蛋糕</span></a></dd>
																		<dd><a title="脱水蛋糕" href="#"><span>脱水蛋糕</span></a></dd>
																		<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>
																		<dd><a title="软面包" href="#"><span>软面包</span></a></dd>
																		<dd><a title="马卡龙" href="#"><span>马卡龙</span></a></dd>
																		<dd><a title="千层饼" href="#"><span>千层饼</span></a></dd>
																		<dd><a title="甜甜圈" href="#"><span>甜甜圈</span></a></dd>
																		<dd><a title="蒸三明治" href="#"><span>蒸三明治</span></a></dd>
																		<dd><a title="铜锣烧" href="#"><span>铜锣烧</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="蛋糕">点心</span></dt>
																		<dd><a title="蒸蛋糕" href="#"><span>蒸蛋糕</span></a></dd>
																		<dd><a title="脱水蛋糕" href="#"><span>脱水蛋糕</span></a></dd>
																		<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>
																		<dd><a title="软面包" href="#"><span>软面包</span></a></dd>
																		<dd><a title="马卡龙" href="#"><span>马卡龙</span></a></dd>
																		<dd><a title="千层饼" href="#"><span>千层饼</span></a></dd>
																		<dd><a title="甜甜圈" href="#"><span>甜甜圈</span></a></dd>
																		<dd><a title="蒸三明治" href="#"><span>蒸三明治</span></a></dd>
																		<dd><a title="铜锣烧" href="#"><span>铜锣烧</span></a></dd>
																	</dl>
																</div>
																<div class="brand-side">
																	<dl class="dl-sort"><dt><span>实力商家</span></dt>
																		<dd><a title="今生只围你" target="_blank" href="#" rel="nofollow"><span >今生只围你</span></a></dd>
																		<dd><a title="忆佳人" target="_blank" href="#" rel="nofollow"><span  class="red" >忆佳人</span></a></dd>
																		<dd><a title="斐洱普斯" target="_blank" href="#" rel="nofollow"><span  class="red" >斐洱普斯</span></a></dd>
																		<dd><a title="聚百坊" target="_blank" href="#" rel="nofollow"><span  class="red" >聚百坊</span></a></dd>
																		<dd><a title="朵朵棉织直营店" target="_blank" href="#" rel="nofollow"><span >朵朵棉织直营店</span></a></dd>
																	</dl>
																</div>
															</div>
														</div>
													</div>
												</div>
												<b class="arrow"></b>
											</li>
											<li>
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="images/package.png"></i><a class="ml-22" title="品牌、礼包" onclick="document.getElementById('index_none_header_sysc').name=this.title">品牌/礼包</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="sort-side">
																	<dl class="dl-sort">
																		<dt><span title="大包装">大包装</span></dt>
																		<dd><a title="蒸蛋糕" href="#"><span>蒸蛋糕</span></a></dd>
																		<dd><a title="脱水蛋糕" href="#"><span>脱水蛋糕</span></a></dd>
																		<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>
																		<dd><a title="软面包" href="#"><span>软面包</span></a></dd>
																		<dd><a title="马卡龙" href="#"><span>马卡龙</span></a></dd>
																		<dd><a title="千层饼" href="#"><span>千层饼</span></a></dd>
																		<dd><a title="甜甜圈" href="#"><span>甜甜圈</span></a></dd>
																		<dd><a title="蒸三明治" href="#"><span>蒸三明治</span></a></dd>
																		<dd><a title="铜锣烧" href="#"><span>铜锣烧</span></a></dd>
																	</dl>
																	<dl class="dl-sort">
																		<dt><span title="两件套">两件套</span></dt>
																		<dd><a title="蒸蛋糕" href="#"><span>蒸蛋糕</span></a></dd>
																		<dd><a title="脱水蛋糕" href="#"><span>脱水蛋糕</span></a></dd>
																		<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>
																		<dd><a title="软面包" href="#"><span>软面包</span></a></dd>
																		<dd><a title="马卡龙" href="#"><span>马卡龙</span></a></dd>
																		<dd><a title="千层饼" href="#"><span>千层饼</span></a></dd>
																		<dd><a title="甜甜圈" href="#"><span>甜甜圈</span></a></dd>
																		<dd><a title="蒸三明治" href="#"><span>蒸三明治</span></a></dd>
																		<dd><a title="铜锣烧" href="#"><span>铜锣烧</span></a></dd>
																	</dl>
																</div>
																<div class="brand-side">
																	<dl class="dl-sort"><dt><span>实力商家</span></dt>
																		<dd><a title="琳琅鞋业" target="_blank" href="#" rel="nofollow"><span >琳琅鞋业</span></a></dd>
																		<dd><a title="宏利鞋业" target="_blank" href="#" rel="nofollow"><span >宏利鞋业</span></a></dd>
																		<dd><a title="比爱靓点鞋业" target="_blank" href="#" rel="nofollow"><span >比爱靓点鞋业</span></a></dd>
																		<dd><a title="浪人怪怪" target="_blank" href="#" rel="nofollow"><span >浪人怪怪</span></a></dd>
																	</dl>
																</div>
															</div>
														</div>
													</div>
												</div>

											</li>
											
                                 <!--比较多的导航	-->										
											
														
											
										</ul>
									</div>
								</div>

							</div>
						</div>
						<!--导航 -->
						<script type="text/javascript">
							(function() {
								$('.am-slider').flexslider();
							});
							$(document).ready(function() {
								$("li").hover(function() {
									$(".category-content .category-list li.first .menu-in").css("display", "none");
									$(".category-content .category-list li.first").removeClass("hover");
									$(this).addClass("hover");
									$(this).children("div.menu-in").css("display", "block")
								}, function() {
									$(this).removeClass("hover")
									$(this).children("div.menu-in").css("display", "none")
								});
							})
						</script>


					<!--小导航 -->
					<div class="am-g am-g-fixed smallnav">
						<div class="am-u-sm-3">
							<a href="sort.html"><img src="images/navsmall.jpg" />
								<div class="title">商品分类</div>
							</a>
						</div>
						<div class="am-u-sm-3">
							<a href="#"><img src="images/huismall.jpg" />
								<div class="title">大聚惠</div>
							</a>
						</div>
						<div class="am-u-sm-3">
							<a href="#"><img src="images/mansmall.jpg" />
								<div class="title">个人中心</div>
							</a>
						</div>
						<div class="am-u-sm-3">
							<a href="#"><img src="images/moneysmall.jpg" />
								<div class="title">投资理财</div>
							</a>
						</div>
					</div>

					
				<!--各类活动-->
				<div class="row">
					<li><a><img src="images/row1.jpg"/></a></li>
					<li><a><img src="images/row2.jpg"/></a></li>
					<li><a><img src="images/row3.jpg"/></a></li>
					<li><a><img src="images/row4.jpg"/></a></li>
				</div>
				<div class="clear"></div>	
					<!--走马灯 -->

					<div class="marqueenTwo">
						<span class="marqueen-title"><i class="am-icon-volume-up am-icon-fw"></i>商城头条<em class="am-icon-angle-double-right"></em></span>
						<div class="demo">

							<ul>
								<li class="title-first"><a target="_blank" href="#">
									<img src="images/TJ2.jpg"></img>
									<span>[特惠]</span>洋河年末大促，低至两件五折							
								</a></li>
								<li class="title-first"><a target="_blank" href="#">
									<span>[公告]</span>商城与广州市签署战略合作协议
								     <img src="images/TJ.jpg"></img>
								     <p>XXXXXXXXXXXXXXXXXX</p>
							    </a></li>																    							    
								<li><a target="_blank" href="#"><span>[特惠]</span>女生节商城爆品1分秒	</a></li>
								<li><a target="_blank" href="#"><span>[公告]</span>华北、华中部分地区配送延迟</a></li>
								<li><a target="_blank" href="#"><span>[特惠]</span>家电狂欢千亿礼券 买1送1！</a></li>
								<li><a target="_blank" href="#"><span>[特惠]</span>洋河年末大促，低至两件五折</a></li>
								<li><a target="_blank" href="#"><span>[公告]</span>华北、华中部分地区配送延迟</a></li>
						
							</ul>
                       
						</div>
					</div>
					<div class="clear"></div>
				
				</div>
				
				
							
				<script type="text/javascript">
					if ($(window).width() < 640) {
						function autoScroll(obj) {
							$(obj).find("ul").animate({
								marginTop: "-39px"
							}, 500, function() {
								$(this).css({
									marginTop: "0px"
								}).find("li:first").appendTo(this);
							})
						}
						$(function() {
							setInterval('autoScroll(".demo")', 3000);
						})
					}
				</script>
			</div>
			<div class="shopMainbg">
				<div class="shopMain" id="shopmain">

<!------------------------------------热门活动 ------------------------------------->

				

					<div class="am-container">
					
                     <div class="sale-mt">
		                   <i></i>
		                   <em class="sale-title">限时秒杀</em>
		                   <div class="s-time" id="countdown">
		                   
			                    <span class="hh">01</span>
			                    <span class="mm">20</span>
			                    <span class="ss">59</span>
		                   </div>
	                  </div>

					
					  <div class="am-g am-g-fixed sale">
						<div class="am-u-sm-3 sale-item">
							<div class="s-img">
								<a href="# "><img src="images/sale3.jpg" /></a>
							</div>
                           <div class="s-info">
                           	   <a href="#"><p class="s-title">ZEK 原味海苔</p></a>
                           	   <div class="s-price">￥<b>19.90</b>
                           	   	  <a class="s-buy" href="#">秒杀</a>
                           	   </div>                          	  
                           </div>								
						</div>
						
						<div class="am-u-sm-3 sale-item">
							<div class="s-img">
								<a href="# "><img src="images/sale2.jpg" /></a>
							</div>
                           <div class="s-info">
                           	   <a href="#"><p class="s-title">ZEK 原味海苔</p></a>
                           	   <div class="s-price">￥<b>9.90</b>
                           	   	  <a class="s-buy" href="#">秒杀</a>
                           	   </div>                          	  
                           </div>								
						</div>					
						
						<div class="am-u-sm-3 sale-item">
							<div class="s-img">
								<a href="# "><img src="images/sale1.jpg" /></a>
							</div>
                           <div class="s-info">
                           	   <a href="#"><p class="s-title">ZEK 原味海苔</p></a>
                           	   <div class="s-price">￥<b>9.90</b>
                           	   	  <a class="s-buy" href="#">秒杀</a>
                           	   </div>                          	  
                           </div>								
						</div>
						
						<div class="am-u-sm-3 sale-item">
							<div class="s-img">
								<a href="# "><img src="images/sale2.jpg " /></a>
							</div>
                           <div class="s-info">
                           	   <a href="#"><p class="s-title">ZEK 原味海苔</p></a>
                           	   <div class="s-price">￥<b>9.90</b>
                           	   	  <a class="s-buy" href="#">秒杀</a>
                           	   </div>                          	  
                           </div>								
						</div>
						
					  </div>
                   </div>
					<div class="clear "></div>
            <div class="f1">
					<!--甜点-->
					
					<div class="am-container " >
						<div class="shopTitle ">
							<h4 class="floor-title">甜品</h4>
							<div class="floor-subtitle"><em class="am-icon-caret-left"></em><h3>每一道甜品都有一个故事</h3></div>
							<div class="today-brands " style="right:0px ;top:13px;">
								<a href="# ">桂花糕</a>|
								<a href="# ">奶皮酥</a>|
								<a href="# ">栗子糕 </a>|
								<a href="# ">马卡龙</a>|
								<a href="# ">铜锣烧</a>|
								<a href="# ">豌豆黄</a>
							</div>

						</div>
					</div>
					
					<div class="am-g am-g-fixed floodSix ">				
						<div class="am-u-sm-5 am-u-md-3 text-one list">
							<div class="word">
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>	
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>	
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>								
							</div>							
							<a href="# ">
								<img src="images/5.jpg" />
								<div class="outer-con ">
									<div class="title ">
										零食大礼包开抢啦
									</div>
									<div class="sub-title ">
										当小鱼儿恋上软豆腐
									</div>
								</div>
							</a>
							<div class="triangle-topright"></div>	
						</div>
						
						<div class="am-u-sm-7 am-u-md-5 am-u-lg-2 text-two big">
							
								<div class="outer-con ">
									<div class="title ">
										雪之恋和风大福
									</div>
									<div class="sub-title ">
										 
									</div>
									
								</div>
								<a href=""><img src="images/act1.png" /></a>						
						</div>

						<li>
						<div class="am-u-md-2 am-u-lg-2 text-three">
							<div class="boxLi"></div>
							<div class="outer-con ">
								<div class="title ">
									${prodlist[0].pname}
								</div>								
								<div class="sub-title ">
									¥${prodlist[0].pprice}
								</div>
								
							</div>
							<a href="onshop?method=selprodbyid&pid=${prodlist[0].pid}"><img src="${prodlist[0].bdesc}" /></a>
						</div>
						</li>
						<li>
						<div class="am-u-md-2 am-u-lg-2 text-three sug">
							<div class="boxLi"></div>
							<div class="outer-con ">
								<div class="title ">
									${prodlist[1].pname}
								</div>
								<div class="sub-title ">
									¥${prodlist[1].pprice}
								</div>
								
							</div>
							<a href="onshop?method=selprodbyid&pid=${prodlist[1].pid}"><img src="${prodlist[1].bdesc}" /></a>
						</div>
						</li>
						<li>
						<div class="am-u-sm-4 am-u-md-5 am-u-lg-4 text-five">
							<div class="boxLi"></div>
							<div class="outer-con ">
								<div class="title ">
								<br/>
									${prodlist[2].pname}
								</div>								
								<div class="sub-title ">
									¥${prodlist[2].pprice}
								</div>
								
							</div>
							<a href="onshop?method=selprodbyid&pid=${prodlist[2].pid}"><img src="${prodlist[2].bdesc}" /></a>
						</div>	
5					</li>
						<li>
						<div class="am-u-sm-4 am-u-md-2 am-u-lg-2 text-six">
							<div class="boxLi"></div>
							<div class="outer-con ">
								<div class="title ">
									${prodlist[3].pname}
								</div>
								<div class="sub-title ">
									¥${prodlist[3].pprice}
								</div>
								
							</div>
							<a href="onshop?method=selprodbyid&pid=${prodlist[3].pid}"><img src="${prodlist[3].bdesc}" /></a>
						</div>	
						</li>
						<li>
						<div class="am-u-sm-4 am-u-md-2 am-u-lg-4 text-six">
							<div class="boxLi"></div>
							<div class="outer-con ">
								<div class="title ">
									${prodlist[4].pname}
								</div>
								<div class="sub-title ">
									¥${prodlist[4].pprice}
								</div>
								
							</div>
							<a href="onshop?method=selprodbyid&pid=${prodlist[4].pid}"><img src="${prodlist[4].bdesc}" /></a>
						</div>	
						</li>						
					</div>

					<div class="clear "></div>
            </div>
            <div class="f2">

					<!--坚果-->
					<div class="am-container ">
						<div class="shopTitle ">
							<h4 class="floor-title">坚果</h4>
							<div class="floor-subtitle"><em class="am-icon-caret-left"></em><h3>酥酥脆脆，回味无穷</h3></div>
							<div class="today-brands " style="right:0px ;top:13px">
								<a href="# ">腰果</a>|
								<a href="# ">松子</a>|
								<a href="# ">夏威夷果 </a>|
								<a href="# ">碧根果</a>|
								<a href="# ">开心果</a>|
								<a href="# ">核桃仁</a>
							</div>
						</div>
					</div>
					<div class="am-g am-g-fixed floodSeven">
						<div class="am-u-sm-5 am-u-md-4 text-one list ">
							<div class="word">
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>	
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>								
							</div>
							<a href="# ">
								<div class="outer-con ">
									<div class="title ">
									零食大礼包开抢啦！
									</div>
									<div class="sub-title ">
										零食大礼包
									</div>									
								</div>
                                  <img src="images/11.jpg" />								
							</a>
							<div class="triangle-topright"></div>						
						</div>
						
							<div class="am-u-sm-7 am-u-md-4 text-two big">
								
								<div class="outer-con ">
									<div class="title ">
										邂逅是生生世世的爱恋
									</div>									
									<div class="sub-title ">
										
									</div>
									
								</div>
								<a href="# "><img src="images/act2.png " /></a>
								
							</div>
                        
                        <li>
							<div class="am-u-sm-7 am-u-md-4 text-two">
								<div class="boxLi"></div>
								<div class="outer-con ">
									<div class="title ">
										${prodlist[5].pname }
									</div>
									<div class="sub-title ">
										¥${prodlist[5].pprice }
									</div>
									
								</div>
								<a href="onshop?method=selprodbyid&pid=${prodlist[5].pid}"><img src="${prodlist[5].bdesc}" /></a>
							</div>
                        </li>
                        <li>
						<div class="am-u-sm-3 am-u-md-2 text-three sug">
							<div class="boxLi"></div>
							<div class="outer-con ">
								<div class="title ">
									${prodlist[6].pname }
								</div>
								<div class="sub-title ">
									¥${prodlist[6].pprice }
								</div>
								
							</div>
							<a href="onshop?method=selprodbyid&pid=${prodlist[6].pid}"><img src="${prodlist[6].bdesc}" /></a>
						</div>
                        </li>
                        <li>
						<div class="am-u-sm-3 am-u-md-2 text-three big">
							<div class="boxLi"></div>
							<div class="outer-con ">
								<div class="title ">
								<br/>
									${prodlist[7].pname }
								</div>
								<div class="sub-title ">
									¥${prodlist[7].pprice }
								</div>
								
							</div>
							<a href="onshop?method=selprodbyid&pid=${prodlist[7].pid}"><img src="${prodlist[7].bdesc}" /></a>
						</div>
                        </li>
                        <li>
						<div class="am-u-sm-3 am-u-md-2 text-three ">
							<div class="boxLi"></div>
							<div class="outer-con ">
								<div class="title ">
									${prodlist[8].pname }
								</div>
								<div class="sub-title ">
									¥${prodlist[8].pprice }
								</div>
								
							</div>
							<a href="onshop?method=selprodbyid&pid=${prodlist[8].pid}"><img src="${prodlist[8].bdesc}" /></a>
						</div>
                        </li>
                        <li>
						<div class="am-u-sm-3 am-u-md-2 text-three ">
							<div class="boxLi"></div>
							<div class="outer-con ">
								<div class="title ">
									${prodlist[9].pname }
								</div>
								<div class="sub-title ">
									¥${prodlist[9].pprice }
								</div>
								
							</div>
							<a href="onshop?method=selprodbyid&pid=${prodlist[9].pid}"><img src="${prodlist[9].bdesc}" /></a>
						</div>
						</li>
					</div>
                 <div class="clear "></div>                 
            </div>               						

            <div class="f3">
					<!--甜点-->
					
					<div class="am-container " >
						<div class="shopTitle ">
							<h4 class="floor-title">甜品</h4>
							<div class="floor-subtitle"><em class="am-icon-caret-left"></em><h3>每一道甜品都有一个故事</h3></div>
							<div class="today-brands " style="right:0px ;top:13px;">
								<a href="# ">桂花糕</a>|
								<a href="# ">奶皮酥</a>|
								<a href="# ">栗子糕 </a>|
								<a href="# ">马卡龙</a>|
								<a href="# ">铜锣烧</a>|
								<a href="# ">豌豆黄</a>
							</div>

						</div>
					</div>
					
					<div class="am-g am-g-fixed floodSix ">
												
						<div class="am-u-sm-5 am-u-md-3 text-one list">
							<div class="word">
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>	
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>								
							</div>							
							<a href="# ">
								<img src="images/5.jpg" />
								<div class="outer-con ">
									<div class="title ">
										零食大礼包开抢啦
									</div>
									<div class="sub-title ">
										当小鱼儿恋上软豆腐
									</div>
								</div>
							</a>
							<div class="triangle-topright"></div>	
						</div>
						
						<div class="am-u-sm-7 am-u-md-5 am-u-lg-2 text-two big">
							
								<div class="outer-con ">
									<div class="title ">
										雪之恋和风大福
									</div>
									<div class="sub-title ">
										
									</div>
									
								</div>
								<a href="# "><img src="images/act1.png" /></a>						
						</div>

						<li>
						<div class="am-u-md-2 am-u-lg-2 text-three">
							<div class="boxLi"></div>
							<div class="outer-con ">
								<div class="title ">
									${prodlist[10].pname }
								</div>								
								<div class="sub-title ">
									¥${prodlist[10].pprice }
								</div>
								
							</div>
							<a href="onshop?method=selprodbyid&pid=${prodlist[10].pid}"><img src="${prodlist[10].bdesc}" /></a>
						</div>
						</li>
						<li>
						<div class="am-u-md-2 am-u-lg-2 text-three sug">
							<div class="boxLi"></div>
							<div class="outer-con ">
								<div class="title ">
									${prodlist[11].pname }
								</div>
								<div class="sub-title ">
									¥${prodlist[11].pprice }
								</div>
								
							</div>
							<a href="onshop?method=selprodbyid&pid=${prodlist[11].pid}"><img src="${prodlist[11].bdesc}" /></a>
						</div>
						</li>
						<li>
						<div class="am-u-sm-4 am-u-md-5 am-u-lg-4 text-five">
							<div class="boxLi"></div>
							<div class="outer-con ">
								<div class="title ">
								<br/>
									${prodlist[12].pname }
								</div>								
								<div class="sub-title ">
									¥${prodlist[12].pprice }
								</div>
								
							</div>
							<a href="onshop?method=selprodbyid&pid=${prodlist[12].pid}"><img src="${prodlist[12].bdesc}" /></a>
						</div>	
						</li>
						<li>
						<div class="am-u-sm-4 am-u-md-2 am-u-lg-2 text-six">
							<div class="boxLi"></div>
							<div class="outer-con ">
								<div class="title ">
									${prodlist[13].pname }
								</div>
								<div class="sub-title ">
									¥${prodlist[13].pprice }
								</div>
								
							</div>
							<a href="onshop?method=selprodbyid&pid=${prodlist[13].pid}"><img src="${prodlist[13].bdesc}" /></a>
						</div>	
						</li>
						<li>
						<div class="am-u-sm-4 am-u-md-2 am-u-lg-4 text-six">
							<div class="boxLi"></div>
							<div class="outer-con ">
								<div class="title ">
									${prodlist[14].pname }
								</div>
								<div class="sub-title ">
									¥${prodlist[14].pprice }
								</div>
								
							</div>
							<a href="onshop?method=selprodbyid&pid=${prodlist[14].pid}"><img src="${prodlist[14].bdesc}" /></a>
						</div>	
						</li>						
					</div>
					<div class="clear "></div>
            </div>
            <div class="f4">

					<!--坚果-->
					<div class="am-container ">
						<div class="shopTitle ">
							<h4 class="floor-title">坚果</h4>
							<div class="floor-subtitle"><em class="am-icon-caret-left"></em><h3>酥酥脆脆，回味无穷</h3></div>
							<div class="today-brands " style="right:0px ;top:13px">
								<a href="# ">腰果</a>|
								<a href="# ">松子</a>|
								<a href="# ">夏威夷果 </a>|
								<a href="# ">碧根果</a>|
								<a href="# ">开心果</a>|
								<a href="# ">核桃仁</a>
							</div>
						</div>
					</div>
					<div class="am-g am-g-fixed floodSeven">
						<div class="am-u-sm-5 am-u-md-4 text-one list ">
							<div class="word">
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>	
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text"></b></span></a>								
							</div>
							<a href="# ">
								<div class="outer-con ">
									<div class="title ">
									零食大礼包开抢啦！
									</div>
									<div class="sub-title ">
										零食大礼包
									</div>									
								</div>
                                  <img src="images/11.jpg" />								
							</a>
							<div class="triangle-topright"></div>						
						</div>
						
							<div class="am-u-sm-7 am-u-md-4 text-two big">
								
								<div class="outer-con ">
									<div class="title ">
										雪之恋和风大福
									</div>									
									<div class="sub-title ">
										
									</div>
									
								</div>
								<a href="# "><img src="images/act2.png " /></a>
								
							</div>
                        
                        <li>
							<div class="am-u-sm-7 am-u-md-4 text-two">
								<div class="boxLi"></div>
								<div class="outer-con ">
									<div class="title ">
										${prodlist[15].pname }
									</div>
									<div class="sub-title ">
										¥${prodlist[15].pprice }
									</div>
									
								</div>
								<a href="onshop?method=selprodbyid&pid=${prodlist[15].pid}"><img src="${prodlist[15].bdesc}" /></a>
							</div>
                        </li>
                        <li>
						<div class="am-u-sm-3 am-u-md-2 text-three sug">
							<div class="boxLi"></div>
							<div class="outer-con ">
								<div class="title ">
									${prodlist[16].pname }
								</div>
								<div class="sub-title ">
									¥${prodlist[16].pprice }
								</div>
								
							</div>
							<a href="onshop?method=selprodbyid&pid=${prodlist[16].pid}"><img src="${prodlist[16].bdesc}" /></a>
						</div>
                        </li>
                        <li>
						<div class="am-u-sm-3 am-u-md-2 text-three big">
							<div class="boxLi"></div>
							<div class="outer-con ">
								<div class="title ">
								<br/>
									${prodlist[17].pname }
								</div>
								<div class="sub-title ">
									¥${prodlist[17].pprice }
								</div>
								
							</div>
							<a href="onshop?method=selprodbyid&pid=${prodlist[17].pid}"><img src="${prodlist[17].bdesc}" /></a>
						</div>
                        </li>
                        <li>
						<div class="am-u-sm-3 am-u-md-2 text-three ">
							<div class="boxLi"></div>
							<div class="outer-con ">
								<div class="title ">
									${prodlist[18].pname }
								</div>
								<div class="sub-title ">
									¥${prodlist[18].pprice }
								</div>
								
							</div>
							<a href="onshop?method=selprodbyid&pid=${prodlist[18].pid}"><img src="${prodlist[18].bdesc}" /></a>
						</div>
                        </li>
                        <li>
						<div class="am-u-sm-3 am-u-md-2 text-three ">
							<div class="boxLi"></div>
							<div class="outer-con ">
								<div class="title ">
									${prodlist[19].pname }
								</div>
								<div class="sub-title ">
									¥${prodlist[19].pprice }
								</div>
								
							</div>
							<a href="onshop?method=selprodbyid&pid=${prodlist[19].pid}"><img src="${prodlist[19].bdesc}" /></a>
						</div>
						</li>
					</div>
                 <div class="clear "></div>                 
            </div>                    
	
                     
            
            
            
					<div class="footer ">
						<div class="footer-hd ">
							<p>
								<a href="# ">onshop</a>
								<b>|</b>
								<a href="homepage.jsp ">商城首页</a>
								<b>|</b>
								<a href="# ">支付宝</a>
								<b>|</b>
								<a href="# ">物流</a>
							</p>
						</div>
						<div class="footer-bd ">
							<p>
								<a href="# ">关于onshop</a>
								<a href="# ">合作伙伴</a>
								<a href="# ">联系我们</a>
								<a href="# ">网站地图</a>
								<em>© 2017-2037 onshop.com 版权所有</em>
							</p>
						</div>
					</div>
				</div>
			</div>

		<!--引导 -->
		<div class="navCir">
			<li class="active"><a href="homepage.jsp"><i class="am-icon-home "></i>首页</a></li>
			<li><a href="sort.html"><i class="am-icon-list"></i>分类</a></li>
			<li><a href="shopcart.html"><i class="am-icon-shopping-basket"></i>购物车</a></li>	
			<li><a href="../person/index.html"><i class="am-icon-user"></i>我的</a></li>					
		</div>
		<!--菜单 -->
		<div class=tip>
			<div id="sidebar">
				<div id="wrap">
					<div id="prof" class="item ">
						<a href="business/blogin.jsp">
							<span class="setting "></span>
						</a>
						<div class="ibar_login_box status_login ">
							<div class="avatar_box ">
								<p class="avatar_imgbox "><img src="images/no-img_mid_.jpg " /></p>
								<ul class="user_info ">
									<li>
									
									</li>
									<li></li>
								</ul>
							</div>
							<div class="login_btnbox ">
							
							
								
							<a href="business/blogin.jsp" class="login_order ">商家登录</a>
							<a href="business/blogin.jsp" class="login_favorite ">商家中心</a>
							</div>
							<i class="icon_arrow_white "></i>
						</div>

					</div>
					<div id="shopCart " >
						<a href="# ">
							<span class="message "></span>
						</a>
						<p>
							
						</p>
						<p></p>
					</div>
					<div id="asset " class="item ">
						<a href="# ">
							<span class="view "></span>
						</a>
						<div class="mp_tooltip ">
							我的资产
							<i class="icon_arrow_right_black "></i>
						</div>
					</div>

					<div id="foot " class="item ">
						<a href="# ">
							<span class="zuji "></span>
						</a>
						<div class="mp_tooltip ">
							我的足迹
							<i class="icon_arrow_right_black "></i>
						</div>
					</div>

					<div id="brand " class="item ">
						<a href="#">
							<span class="wdsc "><img src="images/wdsc.png " /></span>
						</a>
						<div class="mp_tooltip ">
							我的收藏
							<i class="icon_arrow_right_black "></i>
						</div>
					</div>

					<div id="broadcast " class="item ">
						<a href="customer/urecharge.jsp">
							<span class="chongzhi "><img src="images/chongzhi.png " /></span>
						</a>
						<div class="mp_tooltip ">
							我要充值
							<i class="icon_arrow_right_black "></i>
						</div>
					</div>

					<div class="quick_toggle ">
						<li class="qtitem ">
							<a href="# "><span class="kfzx "></span></a>
							<div class="mp_tooltip ">客服中心<i class="icon_arrow_right_black "></i></div>
						</li>
						<!--二维码 -->
						<li class="qtitem ">
							<a href="#none "><span class="mpbtn_qrcode "></span></a>
							<div class="mp_qrcode " style="display:none; "><img src="images/weixin_code_145.png " /><i class="icon_arrow_white "></i></div>
						</li>
						<li class="qtitem ">
							<a href="#top " class="return_top "><span class="top "></span></a>
						</li>
					</div>

					<!--回到顶部 -->
					<div id="quick_links_pop " class="quick_links_pop hide "></div>

				</div>

			</div>
			<div id="prof-content " class="nav-content ">
				<div class="nav-con-close ">
					<i class="am-icon-angle-right am-icon-fw "></i>
				</div>
				<div>
					我
				</div>
			</div>
			<div id="shopCart-content " class="nav-content ">
				<div class="nav-con-close ">
					<i class="am-icon-angle-right am-icon-fw "></i>
				</div>
				<div>
					购物车
				</div>
			</div>
			<div id="asset-content " class="nav-content ">
				<div class="nav-con-close ">
					<i class="am-icon-angle-right am-icon-fw "></i>
				</div>
				<div>
					资产
				</div>

				<div class="ia-head-list ">
					<a href="# " target="_blank " class="pl ">
						<div class="num ">0</div>
						<div class="text ">优惠券</div>
					</a>
					<a href="# " target="_blank " class="pl ">
						<div class="num ">0</div>
						<div class="text ">红包</div>
					</a>
					<a href="# " target="_blank " class="pl money ">
						<div class="num ">￥0</div>
						<div class="text ">余额</div>
					</a>
				</div>

			</div>
			<div id="foot-content " class="nav-content ">
				<div class="nav-con-close ">
					<i class="am-icon-angle-right am-icon-fw "></i>
				</div>
				<div>
					足迹
				</div>
			</div>
			<div id="brand-content " class="nav-content ">
				<div class="nav-con-close ">
					<i class="am-icon-angle-right am-icon-fw "></i>
				</div>
				<div>
					收藏
				</div>
			</div>
			<div id="broadcast-content " class="nav-content ">
				<div class="nav-con-close ">
					<i class="am-icon-angle-right am-icon-fw "></i>
				</div>
				<div>
					充值
				</div>
			</div>
		</div>
		<script>
			window.jQuery || document.write('<script src="basic/js/jquery.min.js "><\/script>');
		</script>
		<script type="text/javascript " src="basic/js/quick_links.js "></script>
	</body>

</html>