<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>金字塔 - 综合金融服务平台 - 标的信息详情</title>	
	<!-- 引入页面Logo小图标 -->
	<link rel="icon" href="img/Logo.png" type="image/x-icon">
	<base href="<%=path%>/">
		<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/bootstrap.js"></script>
		<link rel="stylesheet" type="text/css" href="css/normalize.css" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/style.css" type="text/css" />
		<link rel="stylesheet" type="text/css" href="css/zzsc.css" />
		<script type="text/javascript" src="js/zzsc.js"></script>
		<!-- 导入layui -->
		<script src="./lib/layui/layui.js" charset="utf-8"></script>
        <script src="./js/x-layui.js" charset="utf-8"></script>

        <link rel="stylesheet" href="./css/x-admin.css" media="all">
         
         
		<!--
	作者：383942470@qq.com
	时间：2017-11-08
	描述：图标
-->
		<link href="css/icons.css" rel="stylesheet" type="text/css" />

		<link href="css/responsive.css" rel="stylesheet" type="text/css" />
		
		<link rel="stylesheet" type="text/css" href="css/cs1.css" />
		
		<script type="text/javascript" src="js/swiper-3.4.0.jquery.min.js" ></script>
		<link rel="stylesheet" href="css/swiper-3.2.7.min.css" />
	
<style type="text/css">
a:link {
text-decoration: none;
}
a:visited {
text-decoration: none;
}
a:hover {
text-decoration: none;
}
a:active {
text-decoration: none;
}
</style>
	
</head>
<body style="background-color: #ebebeb;">
		<header class="header-navigation" id="header">
			<nav>
				<div class="div-left">
					<a class="link" href="front/index" title="金字塔 - 综合金融服务平台">
						<img src="img/Logo2.png" />
					</a>
				</div>
				<div class="div-right">
					<ul>
						<li style="list-style-type: none;display: inline-block;">
							<a class="link1" href="front/index" title="首页" style="text-decoration: none;">首页</a>
						</li>
						<li style="list-style-type: none;display: inline-block;">
							<a class="link1" href="front/touzi?lendtime=0&rate=0&type=0&cont=1" title="投资" style="text-decoration: none;">我要投资</a>
						</li>
						<li style="list-style-type: none;display: inline-block;">
							<a class="link1" href="front/jiekuan" title="借款" style="text-decoration: none;">我要借款</a>
						</li>
						<li style="list-style-type: none;display: inline-block;">
							<a class="link1" href="front/anquan" title="安全保障" style="text-decoration: none;">安全保障</a>
						</li>
						<li style="list-style-type: none;display: inline-block;">
							<a class="link1" href="front/our/1" title="关于我们" style="text-decoration: none;">信息披露</a>
						</li>
						<li style="list-style-type: none;display: inline-block;">
							<a class="link1" href="front/xinshou" title="新手引导" style="text-decoration: none;">新手导航</a>
						</li>
						<li style="list-style-type: none; display: inline-block; margin: 0px; padding: 0px;">
							<c:if test="${empty user }">
							
<%-- 							<shiro:guest> --%>
							<!-- 未登录 -->
								<a class="link2" href="user/openLogin" title="未登录，前往登录">我的账户</a>
<%-- 							</shiro:guest> --%>
							</c:if>
							<c:if test="${!empty user }">
<%-- 							<shiro:user> --%>
							<!-- 已登录 -->
								<a class="link2">我的账户</a>
								<ul style="line-height: 30px;">
									<li style="list-style-type: none; display: inline-block;"><a
										class="link1" href="front/user/PersonalCenter" title="个人中心"
										style="text-decoration: none;">个人中心</a></li>
									<li style="list-style-type: none; display: inline-block;"><a
										class="link1" href="user/logout" title="退出"
										style="text-decoration: none;">退出</a></li>
								</ul>
<%-- 							</shiro:user> --%>
							</c:if>
						</li>
					</ul>
				</div>

			</nav>

		</header>

		<div class="theme-layout">
			<div class="responsive-header">
				<div class="responsive-bar">
					<span class="open-menu"><i data-target="menu" class="fa fa-align-justify"></i></span>
					<div class="logo" style="margin-left: 10px;">
						<a href="javascript:;" title="">
							<img src="img/Logo.png" alt="" />
						</a>
					</div>
					<!-- Logo -->
				</div>
				<div class="responsive-links menu">
					<ul>
						<li>
							<a href="front/index" title="首页">首页</a>
						</li>
						<li>
							<a href="front/touzi?lendtime=0&rate=0&type=0&cont=1" title="投资">我要投资</a>
						</li>
						<li>
							<a href="front/jiekuan" title="借款">我要借款</a>
						</li>
						<li>
							<a href="front/anquan" title="安全保障">安全保障</a>
						</li>
						<li>
							<a href="front/our/1" title="关于我们">信息披露</a>
						</li>
						<li>
							<a href="front/xinshou" title="新手引导">新手导航</a>
						</li>
						<li>
							<c:if test="${empty user }">
<%-- 							<shiro:guest> --%>
								<a class="link2" href="user/openLogin" title="未登录，前往登录">我的账户</a>
<%-- 							</shiro:guest> --%>
							</c:if>
							<c:if test="${!empty user }">
<%-- 							<shiro:user> --%>
								<a class="link2" href="front/user/PersonalCenter" title="Contact">我的账户</a>
	
								<ul style="line-height: 30px;">
									<li style="list-style-type: none; display: inline-block;"><a
										class="link1" href="front/user/PersonalCenter" title="个人中心"
										style="text-decoration: none;">个人中心</a></li>
									<li style="list-style-type: none; display: inline-block;"><a
										class="link1" href="user/logout" title="退出"
										style="text-decoration: none;">退出</a></li>
								</ul>
<%-- 							</shiro:user> --%>
							</c:if>
						</li>
					</ul>
				</div>
				<div class="responsive-links other">
					<form>
						<input type="text" placeholder="Enter Your Search" />
						<button><i class="fa fa-search"></i></button>
					</form>

				</div>
			</div>
			<!-- Responsive Header -->
			<div style="height:90px;"></div>
			<div style="margin-left: 70px;width: 100%;">
			<ul class="xl">
			<li class="l" style="display: inline;float: left;">
			<font >您当前所在的位置：</font>
			</li>
			<li class="l" style="display: inline;float: left;margin-left: 10px;">
			<font>></font>
			</li>
			<li class="l" style="display: inline;float: left;margin-left: 10px;">
			<font>金字塔综合金融服务平台</font>
			</li>
			<li class="l" style="display: inline;float: left;margin-left: 10px;">
			<font>></font>
			</li>
			<li class="l" style="display: inline;float: left;margin-left: 10px;">
			<font>标的信息详情</font>
			</li>
			</ul>
			</div>
			<!--//////////////////////////////////////左边界面  -->
			
			<ul class="cs" style="margin-left: 70px;width: 90%;margin-top: 40px;">
			<li class="x" style="float: left;display: inline;">
			<div class="left" style="background-color: white;height: 430px;width: 798px;">
			<div style="height: 10px;"></div>
			<h3>
			<!-- 标id -->
			<input type="hidden" id="b_id" value="${beckonmoney.id }"/>
			<!-- 借款人手机 -->
			<input type="hidden" id="ph" value="${beckonmoney.username }"/>
			<!-- 标名称 -->
			<input type="hidden" id="tb" value="${beckonmoney.title }"/>
			<input type="hidden" id="wb" value="${beckonmoney.billcode }"/>
			<!-- 标利率 -->
			<input type="hidden" id="rate" value="${beckonmoney.rate }"/>
			
			<a class="ss"><font>${beckonmoney.title }(${beckonmoney.billcode })</font></a>
			<c:if test="${beckonmoney.type =='抵押标'}">
				<span class="yellow-tip">无限制投标</span>
			</c:if>
			<c:if test="${beckonmoney.type =='信用标'}">
				<span class="yellow-tip">3个月后可退出</span><span class="yellow-tip">逐月增息</span>
			</c:if>
			</h3>
			<hr class="z1">
			<div style="height: 20px;"></div>
			<ul class="x">
				<li class="xx" style="width: 20%">
					<div>
						<font title="dsdaasfdasd" color="gray">预期年化利率 </font>
					<br>
						<font size="7" color="orange">${beckonmoney.rate }</font><font size="3" color="orange">%</font>
					</div>
				</li>
				<li class="xx">
				<hr class="xs" style="height: 75px;width: 2px;background-color: #f3f3f3;margin-top: 0px;">
				</li>
				<li class="xx"style="width: 15%;margin-left: 0px;">
					<div>
						<font title="dsdaasfdasd" color="gray">计划期限 </font>
					<br>
						<font size="7" color="gray">${beckonmoney.raisetime }</font><font size="3" color="#c3c3c3">个月</font>
					</div>
				</li>
				<li class="xx">
				<hr class="xs" style="height: 75px;width: 2px;background-color: #f3f3f3;margin-top: 0px;">
				</li>
				<li class="xx" style="width: 30%;margin-left: 0px;">
					<div>
						<font title="dsdaasfdasd" color="gray">计划金额 </font>
					<br>
						<font size="3" color="#c3c3c3">￥</font><font size="7" color="gray">${beckonmoney.lendmoney }</font>
					</div>
				</li>
			</ul>
			</div>
			<div style="margin-top: -200px;margin-left: 20px;">
			<ul class="c">
			<li class="cl"style="display: inline;float: left;">
			<div><font color="gray">计划单位：100元</font></div>
			</li>
			<li class="cl"style="display: inline;float: left;margin-left: 170px;">
			<div>
			<font color="gray">
			剩余份数：${fs }份 &nbsp;
			<span class="pro-bg rel">
			<span class="pro-live abs" style="width:${bf };"></span>
			</span> ${bf }
			</font>
			</div>
			</li>
			</ul>
			<br>
			<ul class="c" style="margin-top: 10px;">
			<li class="cl"style="display: inline;float: left;">
			<div><font color="gray">还款方式：${beckonmoney.back_type }</font></div>
			</li>
			<li class="cl"style="display: inline;float: left;margin-left: 154px;">
			<div><font color="gray">保障方式：安全保障计划+第三方担保机构</font></div>
			</li>
			</ul>
			<br>
			
			<ul class="c" style="margin-top: 10px;">
			<li class="cl"style="display: inline;float: left;">
			<div><font color="gray">起投时间：<fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${beckonmoney.releasetime }"/></font></div>
			</li>
			
			</ul>
			
			<br>
				<div style="margin-top: 10px;">
				<c:if test="${beckonmoney.type =='抵押标'}">
					<p><font color="orange">温馨提示：</font>
					<font color="gray">新手奖励仅限注册30日内投资新手标少于3次的用户，每位用户最多可有3次机会，累计限投30000元。</font>
					</p>
					</c:if>
				</div>
			<hr class="z">
			<ul class="l">
			<li class="ll" style="display: inline;float: left;">
			<div>
			<font color="gray">计划表现:</font>
			<img src="img/friend.png" width="35px;" height="35px;" style="margin-left: 20px;">
			</div>
			</li>
			<li class="ll" style="display: inline;float: left;margin-left: 10px;margin-top: -10px;">
			<div>
			<a href="#" class="v">
			<font color="orange" size="3">${PayCount }</font><font size="3">人</font>
			<br>
			<font size="3">已加入人数</font>
			</a>
			</div>
			<div style="height: 40px;"></div>
			</li>
			</ul>
			</div>
			</li>
			<li class="x" style="float: left;display: inline;">
			<!--*********右边界面***************  -->
			<div class="right" style="background-color: white;height: 430px;width: 400px;margin-left:3px;">
			<div style="height: 40px;"></div>
			<div style="height: 30px;">
			<ul class="u">
			<li class="n">
			<p style="margin-left: 30px;color: gray" >可用余额：
			
			<c:if test="${userMoney.needmoney!=null}">
			<span style="color: #999"><font face="微软雅黑" color="orange" style="font-weight: bold;">${userMoney.needmoney }</font>元</span>
			</c:if>
			<c:if test="${userMoney.needmoney==null}">
			<span style="color: #999">登录后可显示余额</span>
			</c:if>
			
			
			</p>
			
			</li>
			<%-- <li class="n" style="margin-left: 80px">
			<shiro:guest><a  href="user/openLogin" ><button class="button">立即登录</button></a></shiro:guest>
			</li> --%>
			</ul>
			</div>
			<br>
			<div style="height: 40px;">
			<font style="margin-left: 30px;" color="gray">我可加入：</font>
			<input type="hidden" id="qe" value="${beckonmoney.have_cast }"/>
			<font face="微软雅黑" color="orange" style="font-weight: bold;">${beckonmoney.have_cast }</font>元
			</div>
			<div style="height: 40px;">
			<font style="margin-left: 30px;" color="gray">加入金额：
			<font face="微软雅黑" color="orange" style="font-weight: bold;">100</font>元</font>
			</div>
			<div style="height: 40px;">
			<font style="margin-left: 30px;" color="gray">预期收益：
			<font face="微软雅黑" color="orange" style="font-weight: bold;">3</font>元</font>
			</div>
			<div style="height: 40px;margin-top: 20px;">
			<input type="text" id="pay" style="height: 30px;margin-left: 30px;border-radius: 5px;width:230px;">
			<a onclick="pay();"><button class="buttons" style="height:30px;">全额</button></a>
			</div>
			<div style="margin-top: 10px;">
			<font color="gray" size="2" style="margin-left: 30px;">团贷网提醒您：投资有风险，安全保障计划来护航</font>
			</div>
			<div>
		
			<c:if test="${beckonmoney.status =='招标中'}">
			    <!-- 已登陆 -->
			    <c:if test="${!empty user }">
			    <button class="sc" onclick="loginTrue();">确认加入</button>
			    </c:if>
			    <!-- 未登录 -->
			    <c:if test="${empty user }">
			    <shiro:guest><button class="sc" onclick="loginFalse();">确认加入</button></shiro:guest>						
			    </c:if>
			</c:if>
			
			<c:if test="${beckonmoney.status =='满标'}">
				<button class="cc">计划已满</button>
			</c:if>
			</div>
			<div style="margin-top: 20px;">
			<ul class="xc" style="margin-left: 30px;">
			<li class="xcc" style="display: inline;float: left;">
			<input type="checkbox" checked="checked">
			</li>
			<li class="xcc" style="display: inline;float: left;">
			<c:if test="${beckonmoney.type =='抵押标'}">
				<font style="color: gray;margin-left: 10px;">我已阅读并同意<a href="front/dybxieyi" target="view_window">《抵押标服务协议》</a></font>
			</c:if>
			<c:if test="${beckonmoney.type =='信用标'}">
				<font style="color: gray;margin-left: 10px;">我已阅读并同意<a href="front/xybxieyi" target="view_window">《信用标服务协议》</a></font>
			</c:if>
			
			</li>
			</ul>
			</div>
			</div>
			</li>
			</ul>
			<!-- 下半部分 -->
			<div style="margin-left:70px;margin-top:480px;height: auto;width: 90%;background-color: white;">
			<div class="container">
			<div class="swiper-container swiper1">
				<div class="swiper-wrapper">
					<div class="swiper-slide selected">项目介绍</div>
					<div class="swiper-slide">加入记录</div>
					<div class="swiper-slide">常见问题</div>
				</div>
				<hr style="margin-top: 0px;">
			</div>
			<!-- swiper2 -->
			<div class="swiper-container swiper2">
				<div class="swiper-wrapper">
					<div class="swiper-slide swiper-no-swiping">
					<div class="container">
					<!-- 1 -->
					<div class="row clearfix">
					<c:if test="${beckonmoney.type =='抵押标'}">
						<div class="col-md-12 column">
						<p class="text" style="font-size: 14px;">“抵押标”是金字塔综合金融服务平台专为新注册投资者推出的新型智能投资工具。
						加入“抵押标”即进入持有期，持有期内“抵押标”在投资者认可的标的范围内，
						对符合要求的标的进行优先自动投标，并由投资者授权系统到期后自动退出。到期后如实际收益高于预期收益，
						超出部分作为服务费由平台收取；到期后如实际收益低于预期收益，平台将补发与差额等值的现金奖励。</p>
							<table style="width: 100%;">
								<tbody>
									<tr  class="l1">
										<td width="20%" align="center">
											<p class="d">开放时间</p>	
										</td>
										<td>
											<p  class="w">
												<fmt:formatDate value="${beckonmoney.releasetime }" pattern="yyyy-MM-dd HH:mm"/> 
											</p>
										</td>
									</tr>
									<tr class="l2">
										<td align="center">
											<p class="d">计划期限</p>
										</td>
										<td>
											<p class="w">${beckonmoney.lendtime }个月（抵押标加入即进入计划期限）</p>
										</td>
									</tr>
									<tr class="l1">
										<td align="center">
										<p class="d" >保障方式	</p>
										</td>
										<td>
										<p class="w">抵押标所投标的适用于安全保障计划。</p>
										</td>
									</tr>
									<tr class="l2">
										<td align="center">
										<p class="d">退出方式	</p>
										</td>
										<td>
										<font class="w">计划到期，系统将自动帮投资者转让债权，并在T+3个自然日内完成退出；
										到期退出时，如实际收益高于预期收益，超出部分作为服务费由平台收取；
										如实际收益低于预期收益，平台将补发与差额等值的现金奖励。</font>
										</td>
									</tr>
									<tr class="l1">
										<td align="center">
										<p class="d">投标范围	</p>
										</td>
										<td>
										<p  class="w">供应链[<a href="front/hetong" target="view_window">合同预览]</a></p>
										<p  class="w">分期宝[<a href="front/hetong" target="view_window">合同预览]</a></p>
										<p  class="w">微团贷[<a href="front/hetong" target="view_window">合同预览]</a></p>
										<p  class="w">小微企业[<a href="front/hetong" target="view_window">合同预览]</a></p>
										</td>
									</tr>
									<tr class="l2">
										<td align="center">
										<p class="d">服务协议</p>	
										</td>
										<td>
										<p class="w">点击查看<a href="front/dybxieyi" target="view_window">《抵押标服务协议》</a></p>
										</td>
									</tr>
									<tr class="l1">
										<td align="center">
										<p class="d">风险告知</p>
										</td>
										<td>
										<p class="w">市场有风险 投资需谨慎 【查看安全保障计划】、查看<a href="front/fengxianshu" target="view_window">《风险揭示书》</a></p>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
					</c:if>
					<c:if test="${beckonmoney.type =='信用标'}">
						<div class="col-md-12 column">
						<p class="text" style="font-size: 14px;">“信用标”是金字塔综合金融服务平台推出的新型智能投资工具。“信用标”在投资者认可的标的范围内，对符合要求的标的进行优先自动投标，并由投资者授权系统到期后自动退出。投资者投资18个月复投宝持有满3个月即可申请提前退出，提前退出按持有时间对应的年化利率结算收益。</p>
							<table style="width: 100%;">
								<tbody>
									<tr  class="l1">
										<td width="20%" align="center">
											<p class="d">开放时间</p>	
										</td>
										<td>
											<p  class="w">
												<fmt:formatDate value="${beckonmoney.releasetime }" pattern="yyyy-MM-dd HH:mm"/>
											</p>
										</td>
									</tr>
									<tr class="l2">
										<td align="center">
											<p class="d">计划期限</p>
										</td>
										<td>
											<p class="w">${beckonmoney.lendtime }个月（信用标加入即进入计划期限）</p>
										</td>
									</tr>
									<tr class="l1">
										<td align="center">
										<p class="d" >保障方式	</p>
										</td>
										<td>
										<p class="w">信用标所投标的适用于安全保障计划。</p>
										</td>
									</tr>
									<tr class="l2">
										<td align="center">
										<p class="d">如何退出	</p>
										</td>
										<td>
										<p class="w">1、到期退出：计划到期，系统将自动帮投资者转让债权，并在T+3个自然日内完成退出；计划到期后以预期年化利率计算并发放收益。</p> 
										<p class="w">2、提前退出：持有满3个月后可随时申请提前退出，转让完成时间视市场交易情况而定。</p>
										</td>
									</tr>
									<tr class="l1">
										<td align="center">
										<p class="d">服务费	</p>
										</td>
										<td>
										<p class="w">提前退出或到期退出后如实际收益高于预期收益，超出部分作为平台服务费由平台收取。</p> 
										</td>
									</tr>
									<tr class="l2">
										<td align="center">
										<p class="d">投标范围	</p>
										</td>
										<td>
										<p  class="w">供应链[<a href="front/hetong">合同预览</a>]</p>
										<p  class="w">分期宝[<a href="front/hetong">合同预览</a>]</p>
										<p  class="w">微团贷[<a href="front/hetong">合同预览</a>]</p>
										<p  class="w">小微企业[<a href="front/hetong">合同预览</a>]</p>
										</td>
									</tr>
									<tr class="l1">
										<td align="center">
										<p class="d">服务协议</p>	
										</td>
										<td>
										<p class="w">点击查看<a href="front/xybxieyi">《信用标服务协议》</a></p>
										</td>
									</tr>
									<tr class="l2">
										<td align="center">
										<p class="d">风险告知</p>
										</td>
										<td>
										<p class="w">市场有风险 投资需谨慎 【查看安全保障计划】、查看<a href="front/fengxianshu">《风险揭示书》</a></p>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
					</c:if>
					</div>
				</div>
				<!-- 1.end -->
					</div>
					<div class="swiper-slide swiper-no-swiping">
						<div class="container">
						<div class="row clearfix" >
							<div class="col-md-12 column" id="rs">
								<table style="width: 100%;">
								<tbody>
									<tr class="l1">
										<td width="20%" align="center">
											<p class="d">序号</p>	
										</td>
										<td width="20%" align="center">
											<p  class="d">加入者</p>
										</td>
										<td width="20%" align="center">
											<p  class="d">加入金额</p>
										</td>
										<td width="20%" align="center">
											<p  class="d">加入时间</p>
										</td>
									</tr>
									
									<c:set var="i" value="1"></c:set>
				                    <c:forEach items="${InList }" var="in">
									
									<tr class="l2" id="${i }">
										<td align="center">
											<p class="d">${i }</p>
										</td>
										<td align="center">
											<p class="d">
											${fn:substring(in.oyh1,0,3)}
											*****
											${fn:substring(in.oyh1,8,11)}
											</p>
										</td>
										<td align="center">
											<p  class="d">¥${in.investmoney }</p>
										</td>
										<td align="center">
											<p class="d">											
											<fmt:formatDate value="${in.investtime }" pattern="yyyy-MM-dd HH:mm"/>
											</p>
										</td>
									</tr>
									
									<c:set var="i" value="${i+1 }"></c:set>
									
									</c:forEach>
									
									
								
								</tbody>
							</table>
							   
							<input type="hidden" id="zrs" value="${PayCount }"/> 
							<input type="hidden" id="zys" value="${zys }"/> 
					       
							<div style="height: 10px;"></div>
							<div id="page"></div>
						
							</div>
						</div>
					</div>
					<div style="height: 20px;"></div>
					<!--2.end  -->
					</div>
					<c:if test="${beckonmoney.type =='抵押标'}">
					<div class="swiper-slide swiper-no-swiping">
						<p style="font-weight: bold;">1、抵押标如何计算收益？</p>
						<p class="text" style="color: gray;font-size: 14px;">抵押标收益按照：加入金额 * 预期年化利率 * 计划期限/12（计划期限以月为单位）
						或加入金额 * 预期年化利率 * 计划期限/365（计划期限以天为单位）</p>
						<p class="text" style="color: gray;font-size: 14px;">计算。
						 计划到期后如实际收益高于预期收益，超出部分作为服务费由平台收取；
						 计划到期后如实际收益低于预期收益，平台将补发与差额等值的现金奖励。</p>
						<p class="text" style="color: gray;font-size: 14px;">举例说明： </p>
						<p class="text" style="color: gray;font-size: 14px;">加入1个月的抵押标10000元，到期后可获收益：
						<p class="text" style="color: gray;font-size: 14px;">10000*11%*1/12=91.67；加入15天的抵押标10000元，到期后可获收益：10000*10%*15/365=41.10</p>
						<p style="font-weight: bold;">2、抵押标安全吗？</p>
						<p class="text" style="color: gray;font-size: 14px;">抵押标所投标的适用于安全保障计划。</p>
						<p style="font-weight: bold;">3、抵押标到期后如何退出？</p>
						<p class="text" style="color: gray;font-size: 14px;">计划到期，系统将自动帮投资者转让债权，并在T+3个自然日内完成退出。</p>
						<p style="font-weight: bold;">4、抵押标是否收取服务费？</p>
						<p class="text" style="color: gray;font-size: 14px;">到期退出后如实际收益高于预期收益，超出部分作为平台服务费由平台收取。</p>
						<p style="font-weight: bold;">5、为什么抵押标的计划期限是1个月，投资标的借款期限不一定是1个月呢？</p>
						<p class="text" style="color: gray;font-size: 14px;">抵押标所投标的借款期限与计划期限无关，如所投标的借款期限比1个月长，系统会在计划到期时自动帮您通过债权转让退出计划；如所投标的借款期限</p>
						<p class="text" style="color: gray;font-size: 14px;">比1个月短，系统会在标的到期后自动帮您匹配新的标的。</p>
						<p style="font-weight: bold;">6、抵押标的计划期限（即持有期）从哪一日开始？</p>
						<p class="text" style="color: gray;font-size: 14px;">抵押标的计划期限（即持有期）自加入之日起算。</p>
						<p style="font-weight: bold;">7、加入抵押标后，相应的待收和授信额度什么时候会增加？</p>
						<p class="text" style="color: gray;font-size: 14px;">抵押标的待收和授信额度按计划的待收计算，系统会在用户加入抵押标后即增加相应的待收和授信额度。</p>
						<p style="font-weight: bold;">8、加入抵押标后，团币是如何发放的？</p>
						<p class="text" style="color: gray;font-size: 14px;">抵押标的团币在加入后即发放。</p>
						<!-- 3c.end -->
					</div>
					</c:if>
					<c:if test="${beckonmoney.type =='信用标'}">
					<div class="swiper-slide swiper-no-swiping">
						<p style="font-weight: bold;">1、信用标如何计算收益？</p>
						<p class="text" style="color: gray;font-size: 14px;">信用标收益按照：加入金额 * 预期年化利率 * 计划期限/12（计划期限以月为单位）
						或加入金额 * 预期年化利率 * 计划期限/365（计划期限以天为单位）</p>
						<p class="text" style="color: gray;font-size: 14px;">计算。
						 计划到期后如实际收益高于预期收益，超出部分作为服务费由平台收取；
						 计划到期后如实际收益低于预期收益，平台将补发与差额等值的现金奖励。</p>
						<p class="text" style="color: gray;font-size: 14px;">举例说明： </p>
						<p class="text" style="color: gray;font-size: 14px;">加入1个月的信用标10000元，到期后可获收益：
						<p class="text" style="color: gray;font-size: 14px;">10000*11%*1/12=91.67；加入15天的信用标10000元，到期后可获收益：10000*10%*15/365=41.10</p>
						<p style="font-weight: bold;">2、信用标安全吗？</p>
						<p class="text" style="color: gray;font-size: 14px;">信用标所投标的适用于安全保障计划。</p>
						<p style="font-weight: bold;">3、信用标到期后如何退出？</p>
						<p class="text" style="color: gray;font-size: 14px;">计划到期，系统将自动帮投资者转让债权，并在T+3个自然日内完成退出。</p>
						<p style="font-weight: bold;">4、信用标是否收取服务费？</p>
						<p class="text" style="color: gray;font-size: 14px;">到期退出后如实际收益高于预期收益，超出部分作为平台服务费由平台收取。</p>
						<p style="font-weight: bold;">5、为什么信用标的计划期限是1个月，投资标的借款期限不一定是1个月呢？</p>
						<p class="text" style="color: gray;font-size: 14px;">信用标所投标的借款期限与计划期限无关，如所投标的借款期限比1个月长，系统会在计划到期时自动帮您通过债权转让退出计划；如所投标的借款期限</p>
						<p class="text" style="color: gray;font-size: 14px;">比1个月短，系统会在标的到期后自动帮您匹配新的标的。</p>
						<p style="font-weight: bold;">6、信用标的计划期限（即持有期）从哪一日开始？</p>
						<p class="text" style="color: gray;font-size: 14px;">信用标的计划期限（即持有期）自加入之日起算。</p>
						<p style="font-weight: bold;">7、加入信用标后，相应的待收和授信额度什么时候会增加？</p>
						<p class="text" style="color: gray;font-size: 14px;">信用标的待收和授信额度按计划的待收计算，系统会在用户加入信用标后即增加相应的待收和授信额度。</p>
						<p style="font-weight: bold;">8、加入信用标后，团币是如何发放的？</p>
						<p class="text" style="color: gray;font-size: 14px;">信用标的团币在加入后即发放。</p>
						<!-- 3c.end -->
					</div>
					</c:if>
				</div>
			</div>
		
		</div>
<!-- !!!!!!!!!!!!!!1end -->
			</div>
			</div>
			<!--////end  -->
			<script>
	$(function() {
		function setCurrentSlide(ele, index) {
			$(".swiper1 .swiper-slide").removeClass("selected");
			ele.addClass("selected");
			//swiper1.initialSlide=index;
		}

		var swiper1 = new Swiper('.swiper1', {
//					设置slider容器能够同时显示的slides数量(carousel模式)。
//					可以设置为number或者 'auto'则自动根据slides的宽度来设定数量。
//					loop模式下如果设置为'auto'还需要设置另外一个参数loopedSlides。
			slidesPerView: 5.5,
			paginationClickable: true,//此参数设置为true时，点击分页器的指示点分页器会控制Swiper切换。
			spaceBetween: 10,//slide之间的距离（单位px）。
			freeMode: true,//默认为false，普通模式：slide滑动时只滑动一格，并自动贴合wrapper，设置为true则变为free模式，slide会根据惯性滑动且不会贴合。
			loop: false,//是否可循环
			onTab: function(swiper) {
				var n = swiper1.clickedIndex;
			}
		});
		swiper1.slides.each(function(index, val) {
			var ele = $(this);
			ele.on("click", function() {
				setCurrentSlide(ele, index);
				swiper2.slideTo(index, 500, false);
				//mySwiper.initialSlide=index;
			});
		});

		var swiper2 = new Swiper('.swiper2', {
			//freeModeSticky  设置为true 滑动会自动贴合  
			direction: 'horizontal',//Slides的滑动方向，可设置水平(horizontal)或垂直(vertical)。
			loop: false,
//					effect : 'fade',//淡入
			//effect : 'cube',//方块
			//effect : 'coverflow',//3D流
//					effect : 'flip',//3D翻转
			autoHeight: true,//自动高度。设置为true时，wrapper和container会随着当前slide的高度而发生变化。
			onSlideChangeEnd: function(swiper) {  //回调函数，swiper从一个slide过渡到另一个slide结束时执行。
				var n = swiper.activeIndex;
				setCurrentSlide($(".swiper1 .swiper-slide").eq(n), n);
				swiper1.slideTo(n, 500, false);
			}
		});
	});
</script>
			<!--
            	作者：383942470@qq.com
            	时间：2017-11-10
            	描述：锚点
            -->
			<div style="position: absolute;">
				<div class="bottom_tools">
					<div class="qr_tool">二维码</div>
					<a id="feedback" href="front/idea" title="意见反馈">意见反馈</a>
					<a id="scrollUp" href="javascript:;" title="飞回顶部"></a>
					<img class="qr_img" src="images/qr_img.png">
				</div>
			</div>
		</div>

		<script type="text/javascript">
			var new_scroll_position = 0;
			var last_scroll_position;
			var header = document.getElementById("header");

			window.addEventListener('scroll', function(e) {
				last_scroll_position = window.scrollY;
				// Scrolling down
				if(new_scroll_position < last_scroll_position && last_scroll_position > 80) {
					// header.removeClass('slideDown').addClass('slideUp');
					header.classList.remove("slideDown");
					header.classList.add("slideUp");

					// Scrolling up
				} else if(new_scroll_position > last_scroll_position) {
					// header.removeClass('slideUp').addClass('slideDown');
					header.classList.remove("slideUp");
					header.classList.add("slideDown");
				}

				new_scroll_position = last_scroll_position;

			});
		
		var zrs=$("#zrs").val();
		
		for(var i=6;i<=zrs;i++){
			
			$("#"+i).hide();
		}
		
			
        var layer;
  
        layui.use(['layer','laypage'], function(){
               
              layer = layui.layer;//弹出层
              laypage = layui.laypage;//分页
              
              laypage({
                  cont:'page'
                  ,pages:$("#zys").val()
                  ,first: 1
                  ,last: $("#zys").val()
                  ,curr: 1
                  ,prev: '<em><</em>'
                  ,next: '<em>></em>'
                  ,jump: function(obj,first){ //触发分页后的回调
                  	
                  	  if(!first){//点击
                  		    
                  		  
                  		var curr=obj.curr;  
                  	  
                  	    var fir=(curr-1)*5+1;//开头
                  	    var las=fir+4;//结尾
                  	    
                  	    for(var i=1;i<=zrs;i++){//先所有隐藏
                  	    	
                  	    	$("#"+i).hide();	
                        	
                        }
                  	    
                  	    if(zrs<=las){//如果最后一个小于算出来的
                  	    	
                  	    	las=zrs;
                  	    }
                  	
                  	    for(var i=fir;i<=las;i++){//显示要显示的
                      	
                      	   
                      	    $("#"+i).show();
                      	
                        } 
                  	   
                        
                  	  }
                 
                  
                     }
                }); 
        });		
        
        
          
        
        
        
        
        
        
        
        
        
        
			
		function loginTrue(){//去投资
						
			var money=$("#pay").val();//投资金额
			var bphone=$("#ph").val();//借款人电话
		    var bid=$("#b_id").val();//标id
		    var title=$("#tb").val()+"("+$("#wb").val()+")";
		    var rate=$("#rate").val();//标利率
			
			if(money==''){
				
				
			  layer.msg('请输入金额!',{icon:7,time:1000});
			 
				
			}else if(isNaN(money)){
				
				
			  layer.msg('请输入正确金额格式!',{icon:3,time:1000});	
				
				
			}else{
							
		        $.ajax({
					async:true,
					cache:true,
					url:'front/moneyTF',
					type:'post',
					data:{
						
						'money':money,
						'bphone':bphone,
						'bid':bid,
						'title':title,
						'rate':rate
					},
					success:function(data){
						console.info(data);
						if(data == "true") {
							
														
							location.href="front/user/pay";
							
							
			              /*   setTimeout(function(){
			                    //add your code
			                	location.reload();
			                },500);//延迟1000毫米 */
						} else {
							
														
							layer.confirm('余额不足! 是否充值？',function(index){
					    		
					    		location.href="finance/bankcard/openRecharge";
					    		
					    	});
							
							
					    }
					
					},error:function(XMLHttpRequest,textStates){
					 layer.alert('错误！',{
		              title: '提示框',				
					icon:1,		
					  });
					   layer.close(index);	
			         }
				});	
				
				
				
			}
			
			
			
    
		
		
		
		
		
			
		}
		
			
	    function loginFalse(){//去登录
	     
	    	var bid=$("#b_id").val();
	    	
	    	layer.confirm('未登录,确定要登陆吗？',function(index){
	    		
	    		location.href="user/openLogin?bid="+bid;
	    		
	    	});
	    	
	    
	    }
			
           
	   function pay(){
		   
		   var qe=$("#qe").val();
		   $("#pay").val(qe);
		
	   }
	   
	   
	      
			
		</script>
		
<!--
        	作者：383942470@qq.com
        	时间：2017-11-15
        	描述：底部
        -->
<div style="width: 92%; height: ; background: white;margin-top: 50px;margin-left: 50px;">
<div style="margin-top: 80px;">&nbsp;</div>
<div class="container">
  <div class="row">
  	<div style="width: 90%;margin-top: 0px;margin-left: 55px;">
    <!-- 部分：一 -->
    <div class="col-md-4">
      <div class="row">
        <div class="col-md-6">
          <ul class="dibu">
            <li class="dibu-li">新手帮助</li>
            <li><a href="index" class="dibu-a">新手指引</a></li>
            <li><a href="index" class="dibu-a">帮助中心</a></li>
            <li><a href="index" class="dibu-a">资费介绍</a></li>
          </ul>
        </div>
        <div class="col-md-6">
          <ul class="dibu">
            <li class="dibu-li">安全保障</li>
            <li><a href="index" class="dibu-a">法律法规</a></li>
            <li><a href="index" class="dibu-a">安全保障</a></li>
            <li><a href="index" class="dibu-a">合作机构</a></li>
          </ul>
        </div>
      </div>
    </div>
    <!-- 部分：二 -->
    <div class="col-md-6">
    	<div class="col-md-5">
      <ul class="dibu">
        <li class="dibu-li">如何理财</li>
        <li><a href="index" class="dibu-a">投资资讯</a></li>
        <li><a href="index" class="dibu-a">贷款问答</a></li>
        <li><a href="index" class="dibu-a">贷款百科</a></li>
      </ul>
      </div>
      <div class="col-md-7">
          		<img src="img/qrcode_for_gh_0459d30bd1d0_430.jpg" style="width: 129px;height: 129px;margin-left: 60px;"/>
        </div>
    </div>
    <!-- 部分：三 -->
    <div class="col-md-2" >
      <ul class="dibu">
        <li>1010-1218</li>
        <li>客服电话：（服务时间：9:00-22:00)</li>
        <li><input type="button" value="在线客服"/></li>
      </ul>
    </div>
  </div>
  </div>
</div>
</div>
		<!-- bootstrap js -->
		<script type="text/javascript" src="js/jquery2.1.4.js"></script>
		<script type="text/javascript" src="js/script.js"></script>
</body>
</html>