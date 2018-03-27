<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>商品详情</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet"
			type="text/css" />
		<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet"
			type="text/css" />
		<link href="basic/css/demo.css" rel="stylesheet" type="text/css" />
		<link type="text/css" href="css/optstyle.css" rel="stylesheet" />
		<link type="text/css" href="css/style1.css" rel="stylesheet" />

		<script type="text/javascript" src="basic/js/jquery-1.7.min.js"></script>
		<script type="text/javascript" src="basic/js/quick_links.js"></script>

		<script type="text/javascript"
			src="AmazeUI-2.4.2/assets/js/amazeui.js"></script>
		<script type="text/javascript" src="js/jquery.imagezoom.min.js"></script>
		<script type="text/javascript" src="js/jquery.flexslider.js"></script>
		<script type="text/javascript" src="js/list.js"></script>

		<link rel="icon" href="images1/onshop.jpg" type="image/x-icon">
	</head>

	<body>


		<!--顶部导航条 -->
		<div class="am-container header">
			<ul class="message-l">
				<div class="topMessage">
					<div class="menu-hd">
						<c:if test="${empty  user}">
							<a href="customer/userlogin.jsp" target="_blank">用户登录</a> &nbsp;
							<a hre="customer/userenroll.jsp" target="_blank">用户注册</a>&nbsp;
							<a href="#" target="_blank"></a></c:if>	
					         <c:if test="${!empty user}">欢迎您，<b>${user.unickname }</b>(<b>${user.uaccount }</b>)</c:if>
					</div>
				</div>
			</ul>
			<ul class="message-r">
				<div class="topMessage home">
					<div class="menu-hd">
						<a href="#" target="_top" class="h">商城首页</a>
					</div>
				</div>
				<div class="topMessage my-shangcheng">
					<div class="menu-hd MyShangcheng">
						<a href="#" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a>
					</div>
				</div>
				<div class="topMessage mini-cart">
					<div class="menu-hd">
						<a id="mc-menu-hd" href="#" target="_top"><i
							></i><span>商家入驻</span><strong
							id="J_MiniCartNum" class="h"></strong>
						</a>
					</div>
				</div>
				<div class="topMessage favorite">
					<div class="menu-hd">
						<a href="#" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span>
						</a>
					</div>
			</ul>
		</div>

		<!--悬浮搜索框-->

		<div class="nav white">
			
			<div class="search-bar pr">
				<a name="index_none_header_sysc" href="#"></a>
				<form>
					<input id="searchInput" name="index_none_header_sysc" type="text"
						placeholder="搜索" autocomplete="off">
					<input id="ai-topsearch" class="submit am-btn" value="搜索" index="1"
						type="submit">
				</form>
			</div>
		</div>

		<div class="clear"></div>
		<b class="line"></b>
		<div class="listMain">

			<!--分类-->
			<div class="nav-table">
				<div class="long-title">
					<span class="all-goods">全部分类</span>
				</div>
				<div class="nav-cont">
					<ul>
						<li class="index">
							<a href="#">首页</a>
						</li>
						<li class="qc">
							<a href="#">闪购</a>
						</li>
						<li class="qc">
							<a href="#">限时抢</a>
						</li>
						<li class="qc">
							<a href="#">团购</a>
						</li>
						<li class="qc last">
							<a href="#">大包装</a>
						</li>
					</ul>
					<div class="nav-extra">
						<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
						<i class="am-icon-angle-right" style="padding-left: 10px;"></i>
					</div>
				</div>
			</div>
			<ol class="am-breadcrumb am-breadcrumb-slash">
				<li>
					<a href="#">首页</a>
				</li>
				<li>
					<a href="#">分类</a>
				</li>
				<li class="am-active">
					内容
				</li>
			</ol>
			<script type="text/javascript">
					$(function() {});
					$(window).load(function() {
						$('.flexslider').flexslider({
							animation: "slide",
							start: function(slider) {
								$('body').removeClass('loading');
							}
						});
					});
				</script>
			<div class="scoll">
				<section class="slider">
				<div class="flexslider">
					<ul class="slides">
						<li>
							<img src="images/01.jpg" title="pic" />
						</li>
						<li>
							<img src="images/02.jpg" />
						</li>
						<li>
							<img src="images/03.jpg" />
						</li>
					</ul>
				</div>
				</section>
			</div>

			<!--放大镜-->

			<div class="item-inform">
				<div class="clearfixLeft" id="clearcontent">

					<div class="box">
						<script type="text/javascript">
								$(document).ready(function() {
									$(".jqzoom").imagezoom();
									$("#thumblist li a").click(function() {
										$(this).parents("li").addClass("tb-selected").siblings().removeClass("tb-selected");
										$(".jqzoom").attr('src', $(this).find("img").attr("mid"));
										$(".jqzoom").attr('rel', $(this).find("img").attr("big"));
									});
								});
							</script>

						<div class="tb-booth tb-pic tb-s310">
							<a href="images/01.jpg"><img src="${imglist[0] }"
									alt="细节展示放大镜特效" rel="${imglist[0] }" class="jqzoom" id="prodid" />
							</a>
						</div>
						<ul class="tb-thumb" id="thumblist">
							<c:forEach items="${imglist}" var="imgs">
								<li class="tb-selected">
									<div class="tb-pic tb-s40">
										<img src="${imgs}"
											onmouseover="document.getElementById('prodid').src=this.src" />
									</div>
								</li>
							</c:forEach>
						</ul>
					</div>

					<div class="clear"></div>
				</div>

				<div class="clearfixRight">

					<!--规格属性-->
					<!--名称-->
					<div class="tb-detail-hd">
						<h1>
							${product.pname }
						</h1>
					</div>
					<div class="tb-detail-list">
						<!--价格-->
						<div class="tb-detail-price">
							<li class="price iteminfo_price">
								<dt>
									促销价
								</dt>
								<dd>
									<em>¥</em><b class="sys_item_price">${product.pprice }</b>
								</dd>
							</li>
							<li class="price iteminfo_mktprice">
								<dt>
									原价
								</dt>
								<dd>
									<em>¥</em><b class="sys_item_mktprice">${product.pmarket }</b>
								</dd>
							</li>
							<div class="clear"></div>
						</div>

					

						<!--销量-->
						<ul class="tm-ind-panel">
							<li class="tm-ind-item tm-ind-sellCount canClick">
								<div class="tm-indcon">
									<span class="tm-label"></span><span class="tm-count"></span>
								</div>
							</li>
							<li class="tm-ind-item tm-ind-sumCount canClick">
								<div class="tm-indcon">
									<span class="tm-label">累计销量</span><span class="tm-count">${product.bcount
										}</span>
								</div>
							</li>
							<li class="tm-ind-item tm-ind-reviewCount canClick tm-line3">
								<div class="tm-indcon">
									<span class="tm-label"></span><span class="tm-count"></span>
								</div>
							</li>
						</ul>
						<div class="clear"></div>

						<!--各种规格-->
						<dl class="iteminfo_parameter sys_item_specpara">
							<dt class="theme-login">
								<div class="cart-title">
									可选规格
									<span class="am-icon-angle-right"></span>
								</div>
							</dt>
							<dd>
								<!--操作页面-->

								<div class="theme-popover-mask"></div>

								<div class="theme-popover">
									<div class="theme-span"></div>
									<div class="theme-poptit">
										<a href="javascript:;" title="关闭" class="close">×</a>
									</div>
									<div class="theme-popbod dform">
										<form class="theme-signin" name="loginform" action=""
											method="post">

											<div class="theme-signin-left">

												<div class="theme-options">
													<div class="cart-title">
														口味
													</div>
													<ul>
														<li class="sku-line selected">
															原味
															<i></i>
														</li>
														<li class="sku-line">
															商家推荐
															<i></i>
														</li>
														
													</ul>
												</div>
												<div class="theme-options">
													<div class="cart-title">
														包装
													</div>
													<ul>
														<li class="sku-line selected">
															手袋单人份
															<i></i>
														</li>
														<li class="sku-line">
															礼盒双人份
															<i></i>
														</li>
														<li class="sku-line">
															全家福礼包
															<i></i>
														</li>
													</ul>
												</div>
												<div class="theme-options">
													<div class="cart-title number">
														数量
													</div>
													<dd>
														<b>
														<a href="javascript:setcount(0)">-</a>
														</b>&nbsp;
														<input type="text" style="width: 40px" value="1" id="cou"
															onblur="checkcount(this.value);"
															onchange="checkcount(this.value);" />
														&nbsp;
														<b><a href="javascript:setcount(1)">+</a>
														</b>
														<span id="Stock" class="tb-hidden">库存<span
															class="stock">1000</span>件</span>
													</dd>

												</div>
												<div class="clear"></div>

												<div class="btn-op">
													<div class="btn am-btn am-btn-warning">
														确认
													</div>
													<div class="btn close am-btn am-btn-warning">
														取消
													</div>
												</div>
											</div>
											<div class="theme-signin-right">
												<div class="img-info">
													<img src="../images/songzi.jpg" />
												</div>
												<div class="text-info">
													<span class="J_Price price-now">¥39.00</span>
													<span id="Stock" class="tb-hidden">库存<span
														class="stock">1000</span>件</span>
												</div>
											</div>

										</form>
									</div>
								</div>

							</dd>
						</dl>
						<div class="clear"></div>
						<!--活动	-->
						<div class="shopPromotion gold">
							<div class="hot">
								<dt class="tb-metatit">
									店铺优惠
								</dt>
								<div class="gold-list">
									<p>
										购物满2件打8折，满3件7折
										<span>点击领券<i class="am-icon-sort-down"></i>
										</span>
									</p>
								</div>
							</div>
							<div class="clear"></div>
							<div class="coupon">
								<dt class="tb-metatit">
									优惠券
								</dt>
								<div class="gold-list">
									<ul>
										<li>
											125减5
										</li>
										<li>
											198减10
										</li>
										<li>
											298减20
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>

					<div class="pay">
						<div class="pay-opt">
							<a href="home.html"><span class="am-icon-home am-icon-fw">首页</span>
							</a>
							<a><span class="am-icon-heart am-icon-fw">收藏</span>
							</a>

						</div>
						<li>
							<div class="clearfix tb-btn tb-btn-buy theme-login">
								<a id="LikBuy" 
									href="javascript:tocollect(${product.pid});">收藏</a>
							</div>
						</li>
						<li>
							<div class="clearfix tb-btn tb-btn-basket theme-login">
								<a id="LikBasket" title="立即购买"
									href="javascript:toorder(${product.pid});">立即购买</a>
							</div>
						</li>
					</div>

				</div>

				<div class="clear"></div>

			</div>


			<!-- introduce-->

			<div class="introduce">
				<div class="browse">
					<div class="mc">
						<ul>
							<div class="mt">
								<h2>
									看了又看
								</h2>
							</div>

							<li class="first">
								<div class="p-img">
									<a href="#"> <img class="" src="images/browse1.jpg">
									</a>
								</div>
								<div class="p-name">
									<a href="#"> 【三只松鼠_开口松子】零食坚果特产炒货东北红松子原味 </a>
								</div>
								<div class="p-price">
									<strong>￥35.90</strong>
								</div>
							</li>
							<li>
								<div class="p-img">
									<a href="#"> <img class="" src="images/browse1.jpg">
									</a>
								</div>
								<div class="p-name">
									<a href="#"> 【三只松鼠_开口松子】零食坚果特产炒货东北红松子原味 </a>
								</div>
								<div class="p-price">
									<strong>￥35.90</strong>
								</div>
							</li>
							<li>
								<div class="p-img">
									<a href="#"> <img class="" src="images/browse1.jpg">
									</a>
								</div>
								<div class="p-name">
									<a href="#"> 【三只松鼠_开口松子】零食坚果特产炒货东北红松子原味 </a>
								</div>
								<div class="p-price">
									<strong>￥35.90</strong>
								</div>
							</li>
							<li>
								<div class="p-img">
									<a href="#"> <img class="" src="images/browse1.jpg">
									</a>
								</div>
								<div class="p-name">
									<a href="#"> 【三只松鼠_开口松子】零食坚果特产炒货东北红松子原味 </a>
								</div>
								<div class="p-price">
									<strong>￥35.90</strong>
								</div>
							</li>
							<li>
								<div class="p-img">
									<a href="#"> <img class="" src="images/browse1.jpg">
									</a>
								</div>
								<div class="p-name">
									<a href="#"> 【三只松鼠_开口松子218g】零食坚果特产炒货东北红松子原味 </a>
								</div>
								<div class="p-price">
									<strong>￥35.90</strong>
								</div>
							</li>

						</ul>
					</div>
				</div>
				<div class="introduceMain">
					<div class="am-tabs" data-am-tabs>
						<ul class="am-avg-sm-3 am-tabs-nav am-nav am-nav-tabs">
							<li class="am-active">
								<a href="#"> <span class="index-needs-dt-txt">宝贝详情</span>
								</a>

							</li>

							<li>
								<a href="#"> <span class="index-needs-dt-txt">全部评价</span>
								</a>

							</li>

							<li>
								<a href="#"> <span class="index-needs-dt-txt">猜你喜欢</span>
								</a>
							</li>
						</ul>

						<div class="am-tabs-bd">

							<div class="am-tab-panel am-fade am-in am-active">
								<div class="J_Brand">

									<div class="attr-list-hd tm-clear">
										<h4>
											产品参数：
										</h4>
									</div>
									<div class="clear"></div>
									<ul id="J_AttrUL">
										<li title="">
											产品类型:&nbsp;烘炒类
										</li>
										<li title="">
											原料产地:&nbsp;巴基斯坦
										</li>
										<li title="">
											产地:&nbsp;湖北省武汉市
										</li>
										<li title="">
											配料表:&nbsp;进口小吃、食用盐
										</li>
										<li title="">
											产品规格:&nbsp;210g
										</li>
										<li title="">
											保质期:&nbsp;180天
										</li>
										<li title="">
											产品标准号:&nbsp;GB/T 22165
										</li>
										<li title="">
											生产许可证编号：&nbsp;QS4201 1801 0226
										</li>
										<li title="">
											储存方法：&nbsp;请放置于常温、阴凉、通风、干燥处保存
										</li>
										<li title="">
											食用方法：&nbsp;开袋即食
										</li>
									</ul>
									<div class="clear"></div>
								</div>

								<div class="details">
									<div class="attr-list-hd after-market-hd">
										<h4>
											商品细节
										</h4>
									</div>
									<div class="twlistNews">
										<img src="${imglist[0] }" />
									
										<img src="${imglist[1] }" />
										<img src="${imglist[2] }" />
										
										
									</div>
								</div>
								<div class="clear"></div>

							</div>

							<div class="am-tab-panel am-fade">

								<div class="actor-new">
									<div class="rate">
										<strong>100<span>%</span>
										</strong>
										<br>
										<span>好评度</span>
									</div>
									<dl>
										<dt>
											买家印象
										</dt>
										<dd class="p-bfc">
											<q class="comm-tags"><span>味道不错</span><em>(2177)</em>
											</q>
											<q class="comm-tags"><span>颗粒饱满</span><em>(1860)</em>
											</q>
											<q class="comm-tags"><span>口感好</span><em>(1823)</em>
											</q>
											<q class="comm-tags"><span>商品不错</span><em>(1689)</em>
											</q>
											<q class="comm-tags"><span>香脆可口</span><em>(1488)</em>
											</q>
											<q class="comm-tags"><span>个个开口</span><em>(1392)</em>
											</q>
											<q class="comm-tags"><span>价格便宜</span><em>(1119)</em>
											</q>
											<q class="comm-tags"><span>特价买的</span><em>(865)</em>
											</q>
											<q class="comm-tags"><span>皮很薄</span><em>(831)</em>
											</q>
										</dd>
									</dl>
								</div>
								<div class="clear"></div>
								<div class="tb-r-filter-bar">
									<ul class=" tb-taglist am-avg-sm-4">
										<li class="tb-taglist-li tb-taglist-li-current">
											<div class="comment-info">
												<span>全部评价</span>
												<span class="tb-tbcr-num">(32)</span>
											</div>
										</li>

										<li class="tb-taglist-li tb-taglist-li-1">
											<div class="comment-info">
												<span>好评</span>
												<span class="tb-tbcr-num">(32)</span>
											</div>
										</li>

										<li class="tb-taglist-li tb-taglist-li-0">
											<div class="comment-info">
												<span>中评</span>
												<span class="tb-tbcr-num">(32)</span>
											</div>
										</li>

										<li class="tb-taglist-li tb-taglist-li--1">
											<div class="comment-info">
												<span>差评</span>
												<span class="tb-tbcr-num">(32)</span>
											</div>
										</li>
									</ul>
								</div>
								<div class="clear"></div>

								<ul class="am-comments-list am-comments-list-flip">
									<li class="am-comment">
										
										<!-- 评论容器 -->
										<a href=""> <img class="am-comment-avatar"
												src="images/hwbn40x40.jpg" /> <!-- 评论者头像 --> </a>

										<div class="am-comment-main">
											<!-- 评论内容容器 -->
											<header class="am-comment-hd">
											<!--<h3 class="am-comment-title">评论标题</h3>-->
											<div class="am-comment-meta">
												<!-- 评论元数据 -->
												<a href="#link-to-user" class="am-comment-author">
												用户${ass.uid}
													</a>
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	
												<!-- 评论者 -->
												${ass.astar }颗星
												<time datetime="">
												
												</time>
											</div>
											</header>

											<div class="am-comment-bd">
												<div class="tb-rev-item " data-id="258040417670">
													<div class="J_TbcRate_ReviewContent tb-tbcr-content ">
														${ass.acontent }
													</div>
													<div class="tb-r-act-bar">
														
													</div>
												</div>
											</div>
											<!-- 评论内容 -->
										</div>
									</li>

								</ul>

								<div class="clear"></div>

								<!--分页 -->
								<ul class="am-pagination am-pagination-right">
									<li class="am-disabled">
										<a href="#">&laquo;</a>
									</li>
									<li class="am-active">
										<a href="#">1</a>
									</li>
									<li>
										<a href="#">2</a>
									</li>
									<li>
										<a href="#">3</a>
									</li>
									<li>
										<a href="#">4</a>
									</li>
									<li>
										<a href="#">5</a>
									</li>
									<li>
										<a href="#">&raquo;</a>
									</li>
								</ul>
								<div class="clear"></div>

								<div class="tb-reviewsft">
									<div class="tb-rate-alert type-attention">
										购买前请查看该商品的
										<a href="#" target="_blank">购物保障</a>，明确您的售后保障权益。
									</div>
								</div>

							</div>

							<div class="am-tab-panel am-fade">
								<div class="like">
									<ul class="am-avg-sm-2 am-avg-md-3 am-avg-lg-4 boxes">
										<li>
											<div class="i-pic limit">
												<img src="images/imgsearch1.jpg" />
												<p>
													【良品铺子_开口松子】零食坚果特产炒货
													<span>东北红松子奶油味</span>
												</p>
												<p class="price fl">
													<b>¥</b>
													<strong>298.00</strong>
												</p>
											</div>
										</li>
										<li>
											<div class="i-pic limit">
												<img src="images/imgsearch1.jpg" />
												<p>
													【良品铺子_开口松子】零食坚果特产炒货
													<span>东北红松子奶油味</span>
												</p>
												<p class="price fl">
													<b>¥</b>
													<strong>298.00</strong>
												</p>
											</div>
										</li>
										<li>
											<div class="i-pic limit">
												<img src="images/imgsearch1.jpg" />
												<p>
													【良品铺子_开口松子】零食坚果特产炒货
													<span>东北红松子奶油味</span>
												</p>
												<p class="price fl">
													<b>¥</b>
													<strong>298.00</strong>
												</p>
											</div>
										</li>
										<li>
											<div class="i-pic limit">
												<img src="images/imgsearch1.jpg" />
												<p>
													【良品铺子_开口松子】零食坚果特产炒货
													<span>东北红松子奶油味</span>
												</p>
												<p class="price fl">
													<b>¥</b>
													<strong>298.00</strong>
												</p>
											</div>
										</li>
										<li>
											<div class="i-pic limit">
												<img src="images/imgsearch1.jpg" />
												<p>
													【良品铺子_开口松子】零食坚果特产炒货
													<span>东北红松子奶油味</span>
												</p>
												<p class="price fl">
													<b>¥</b>
													<strong>298.00</strong>
												</p>
											</div>
										</li>
										<li>
											<div class="i-pic limit">
												<img src="images/imgsearch1.jpg" />
												<p>
													【良品铺子_开口松子】零食坚果特产炒货
													<span>东北红松子奶油味</span>
												</p>
												<p class="price fl">
													<b>¥</b>
													<strong>298.00</strong>
												</p>
											</div>
										</li>
										<li>
											<div class="i-pic limit">
												<img src="images/imgsearch1.jpg" />
												<p>
													【良品铺子_开口松子】零食坚果特产炒货
													<span>东北红松子奶油味</span>
												</p>
												<p class="price fl">
													<b>¥</b>
													<strong>298.00</strong>
												</p>
											</div>
										</li>
										<li>
											<div class="i-pic limit">
												<img src="images/imgsearch1.jpg" />
												<p>
													【良品铺子_开口松子】零食坚果特产炒货
													<span>东北红松子奶油味</span>
												</p>
												<p class="price fl">
													<b>¥</b>
													<strong>298.00</strong>
												</p>
											</div>
										</li>
										<li>
											<div class="i-pic limit">
												<img src="images/imgsearch1.jpg" />
												<p>
													【良品铺子_开口松子】零食坚果特产炒货
													<span>东北红松子奶油味</span>
												</p>
												<p class="price fl">
													<b>¥</b>
													<strong>298.00</strong>
												</p>
											</div>
										</li>
										<li>
											<div class="i-pic limit">
												<img src="images/imgsearch1.jpg" />
												<p>
													【良品铺子_开口松子】零食坚果特产炒货
													<span>东北红松子奶油味</span>
												</p>
												<p class="price fl">
													<b>¥</b>
													<strong>298.00</strong>
												</p>
											</div>
										</li>
										<li>
											<div class="i-pic limit">
												<img src="images/imgsearch1.jpg" />
												<p>
													【良品铺子_开口松子】零食坚果特产炒货
													<span>东北红松子奶油味</span>
												</p>
												<p class="price fl">
													<b>¥</b>
													<strong>298.00</strong>
												</p>
											</div>
										</li>
										<li>
											<div class="i-pic limit">
												<img src="images/imgsearch1.jpg" />
												<p>
													【良品铺子_开口松子】零食坚果特产炒货
													<span>东北红松子奶油味</span>
												</p>
												<p class="price fl">
													<b>¥</b>
													<strong>298.00</strong>
												</p>
											</div>
										</li>
									</ul>
								</div>
								<div class="clear"></div>

								<!--分页 -->
								<ul class="am-pagination am-pagination-right">
									<li class="am-disabled">
										<a href="#">&laquo;</a>
									</li>
									<li class="am-active">
										<a href="#">1</a>
									</li>
									<li>
										<a href="#">2</a>
									</li>
									<li>
										<a href="#">3</a>
									</li>
									<li>
										<a href="#">4</a>
									</li>
									<li>
										<a href="#">5</a>
									</li>
									<li>
										<a href="#">&raquo;</a>
									</li>
								</ul>
								<div class="clear"></div>

							</div>

						</div>

					</div>

					<div class="clear"></div>

					<div class="footer">
						<div class="footer-hd">
							<p>
								<a href="#">onshop</a>
								<b>|</b>
								<a href="#">商城首页</a>
								<b>|</b>
								<a href="#">支付宝</a>
								<b>|</b>
								<a href="#">客服</a>
							</p>
						</div>
						<div class="footer-bd">
							<p>
								<a href="#">关于onshop</a>
								<a href="#">合作伙伴</a>
								<a href="#">联系我们</a>
								<a href="#">网站地图</a>
								<em>onshop 版权所有</em>
							</p>
						</div>
					</div>
				</div>

			</div>
		</div>
		<!--菜单 -->
		<div class=tip>
			<div id="sidebar">
				<div id="wrap">
					<div id="prof" class="item">
						<a href="#"> <span class="setting"></span> </a>
						<div class="ibar_login_box status_login">
							<div class="avatar_box">
								<p class="avatar_imgbox">
									<img src="../images/no-img_mid_.jpg" />
								</p>
								<ul class="user_info">
									<li>
										用户名：sl1903
									</li>
									<li>
										级&nbsp;别：普通会员
									</li>
								</ul>
							</div>
							<div class="login_btnbox">
								<a href="#" class="login_order">我的订单</a>
								<a href="#" class="login_favorite">我的收藏</a>
							</div>
							<i class="icon_arrow_white"></i>
						</div>

					</div>

					<div id="asset" class="item">
						<a href="#"> <span class="view"></span> </a>
						<div class="mp_tooltip">
							我的资产
							<i class="icon_arrow_right_black"></i>
						</div>
					</div>

					<div id="foot" class="item">
						<a href="#"> <span class="zuji"></span> </a>
						<div class="mp_tooltip">
							我的足迹
							<i class="icon_arrow_right_black"></i>
						</div>
					</div>

					<div id="brand" class="item">
						<a href="#"> <span class="wdsc"><img
									src="images/wdsc.png" />
						</span> </a>
						<div class="mp_tooltip">
							我的收藏
							<i class="icon_arrow_right_black"></i>
						</div>
					</div>

					<div id="broadcast" class="item">
						<a href="#"> <span class="chongzhi"><img
									src="images/chongzhi.png" />
						</span> </a>
						<div class="mp_tooltip">
							我要充值
							<i class="icon_arrow_right_black"></i>
						</div>
					</div>

					<div class="quick_toggle">
						<li class="qtitem">
							<a href="#"><span class="kfzx"></span>
							</a>
							<div class="mp_tooltip">
								客服中心
								<i class="icon_arrow_right_black"></i>
							</div>
						</li>
						<!--二维码 -->
						<li class="qtitem">
							<a href="#none"><span class="mpbtn_qrcode"></span>
							</a>
							<div class="mp_qrcode" style="display: none;">
								<img src="../images/weixin_code_145.png" />
								<i class="icon_arrow_white"></i>
							</div>
						</li>
						<li class="qtitem">
							<a href="#top" class="return_top"><span class="top"></span>
							</a>
						</li>
					</div>

					<!--回到顶部 -->
					<div id="quick_links_pop" class="quick_links_pop hide"></div>

				</div>

			</div>
			<div id="prof-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					我
				</div>
			</div>

			<div id="asset-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					资产
				</div>

				<div class="ia-head-list">
					<a href="#" target="_blank" class="pl">
						<div class="num">
							0
						</div>
						<div class="text">
							优惠券
						</div> </a>
					<a href="#" target="_blank" class="pl">
						<div class="num">
							0
						</div>
						<div class="text">
							红包
						</div> </a>
					<a href="#" target="_blank" class="pl money">
						<div class="num">
							￥0
						</div>
						<div class="text">
							余额
						</div> </a>
				</div>

			</div>
			<div id="foot-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					足迹
				</div>
			</div>
			<div id="brand-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					收藏
				</div>
			</div>
			<div id="broadcast-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					充值
				</div>
			</div>
		</div>


		<script type="text/javascript">
      function toorder(pid){
       var count =document.getElementById("cou").value;     
       location.href="onshop?method=toorder&pid="+pid+"&count="+count;
      }
      
       function tocollect(pid){ 
        var d = new Date();
			var year = d.getFullYear();//年
	        var month = d.getMonth()+1;//月份+1
	        var day = d.getDate();//日
			var tim = year+"-"+month+"-"+day;
       location.href="onshop?method=tocollect&pid="+pid+"&time="+tim;
      }
    
       function setcount(v){
              var count =document.getElementById("cou").value;
              count=parseInt(count);
              if(v==0){
                    if(count>1){
                    document.getElementById("cou").value=count-1;
                    }
              }else{
                  if(count<99){
                  document.getElementById("cou").value=count+1;
                  }
              }
       }
       function checkcount(c){
        if(c>99){
           document.getElementById("fnt").innerHTML="最多只能购买99份";
        }else{
          document.getElementById("fnt").innerHTML="";
        }
       }
    </script>
	</body>
</html>
