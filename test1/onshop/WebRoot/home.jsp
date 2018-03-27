<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>osp美食网</title>
		<link href="css/css.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="js/jquery 1.7.1.js"></script>
		<script type="text/javascript" src="js/jquery-ht.js"></script>

	</head>

	<body>
		<div id="top_top">
			<div class="logBox" style="position: fixed; _position: ablolute">
				<div class="login">
					&nbsp;
					<a href="customer/userlogin.jsp" target="_blank">登录</a> &nbsp;
					<a href="customer/uzhuce.jsp" target="_blank">注册</a>&nbsp;
					<a href="#" target="_blank"></a>
					<div class="siderNav">
						<ul class="topmenu" clearfix="" id="jq_topmenu">
							<li>
								<a href="#" target="_blank">我的订单</a>
								
							</li>
							<li>
								<strong>我的OSP</strong>
								<div class="jq_hidebox">
									<div>
										<a> 我的订单</a><br />
										<a> 我的订单</a><br />
										
									</div>
								</div>
							</li>
							<li class="webnav">
								<strong class="icon_arr"> 最近浏览 </strong>
								<div class="jq_hidebox" style="display: none;">
									<a href="javascript:;" onclick="SetHome(window.location)"
										class="red" target="_self"> 设为首页 </a>
									<a class="red" target="_self" onclick="addCookie()"
										href="javascript:;"> 添加收藏 </a>
									<dl class="aSty01">
										<dt>
											<a href="/"> 考试资讯 </a>
										</dt>
										<dd>
											<a href="/"> 报考指导 </a> |
											<a href="/"> 招考信息 </a> |
											<a href="/"> 考试快讯 </a>
											<br/>
											<a href="/"> 职位查询 </a> |
											<a href="/"> 考试时间 </a> |
											<a href="/"> 时政 热点 </a>
										</dd>
										<dt>
											<a href="/"> 备考指导 </a>
										</dt>
										<dd>
											<a href="/"> 行测辅导 </a> |
											<a href="/"> 申论辅导 </a> |
											<a href="/"> 面试辅导 </a>
											<br/>
											<a href="/"> 备考技巧 </a> |
											<a href="/"> 名师指导 </a> |
											<a href="http://www.16sucai.com/"> 历年真题 </a>
										</dd>
										<dt>
											<a href="/"> 网站产品 </a>
										</dt>
										<dd>
											<a href="/"> 公考论坛 </a> |
											<a href="/"> 在线模考 </a> |
											<a href="/"> 申论批改 </a>
											<br/>
											<a href="/"> 在线答疑 </a> |
											<a href="/"> 照片调整 </a> |
											<a href="/"> 信息 预约 </a>
										</dd>
										<dt>
											<a href="/"> 培训大全 </a>
										</dt>
										<dd>
											<a href="/"> 面授课程 </a> |
											<a href="/"> 网校课程 </a> |
											<a href="/"> 图书教材 </a>
											<br/>
											<a href="/"> 直播课堂 </a> |
											<a href="/"> 公考讲堂 </a> |
											<a href="/"> 一对 一 </a>
											<br/>
											<a href="/"> 更多&gt;&gt; </a>
										</dd>
									</dl>
								</div>
							</li>
							<li class="webnav" qxpp="" style="background: none">
								<strong class="icon_arr"> 我是商家 </strong>
								<div class="jq_hidebox" style="display: none;" block;="">
									<a href="business/blogin.jsp"> 登录商家中心 </a> |
									<a href="" target="_blank"> 我想合作 </a> 
									<a href="http://www.16sucai.com/" target="_blank"> </a>
									<br />
									<a href="/" target="_blank"> 手机免费开店 </a> |
									<a href="/" target="_blank"> 商家营销平台 </a> 
									<a href="http://www.16sucai.com/" target="_blank">  </a>
									<br/>
								</div>
							</li>
							<li class="webnav2" qxpp="" style="background: none">
								<strong class="icon_arr"> 联系客服</strong>
								<div class="jq_hidebox" style="display: none;" block;="">
									<a href="http://www.16sucai.com/" target="_blank">申请退款</a> |
									<a href="http://www.16sucai.com/" target="_blank">申请退换货</a> |
									<a href="http://www.16sucai.com/" target="_blank"> 查看点券</a>
									<br />
									<a href="/" target="_blank"> 绑定手机号 </a> |
									<a href="/" target="_blank"> 常见问题 </a> |
									<a href="http://www.16sucai.com/" target="_blank"> 网站地图 </a>
									<br/>
								</div>
							</li>

						</ul>
					</div>
				</div>
			</div>
		</div>
		<br/>
	</body>
</html>
