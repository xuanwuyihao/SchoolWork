<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>金字塔 - 综合金融服务后台管理系统</title>
<!-- 引入页面Logo小图标 -->
<link rel="icon" href="img/Logo.png" type="image/x-icon">
<base href="<%=path%>/">
<meta name="renderer" content="webkit">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" href="./css/x-admin.css" media="all">

		<style type="text/css">
			a:focus{text-decoration: none}
			a:focus{outline:none;}
		</style>
</head>
<body>
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header header header-demo">
			<div class="layui-main">
				<div class="admin-logo-box">
					<a class="logo" href="javascript:;" title="logo">金字塔后台管理系统</a>
					<div class="larry-side-menu" >
						<i class="fa fa-th-large" aria-hidden="true" ></i>
					</div>
				</div>

		<ul class="layui-nav" lay-filter="">

        <li class="layui-nav-item"><img src="./images/logo.png" class="layui-circle" style="border: 2px solid #A9B7B7;" width="35px" alt=""></li>
        <li class="layui-nav-item"> 
        	<a href="javascript:;">${manager.username }</a>
          <dl class="layui-nav-child">
            <!-- 二级菜单 -->
            <a onclick="$('#xg').click();">修改密码</a>
            <a href="manager/logout">退出</a>
          </dl>
        </li>
        <li class="layui-nav-item x-index"><a href="front/index">前台首页</a></li>
      </ul>
    </div>
  </div>
  <div class="layui-side layui-bg-black x-side" style="left:-200px;">
    <div class="layui-side-scroll">
      <ul class="layui-nav layui-nav-tree site-demo-nav" lay-filter="side">
      <shiro:hasPermission name="page">
        <li class="layui-nav-item"> <a class="javascript:;" href="javascript:;"> <i class="layui-icon" style="top: 3px;">&#xe606;</i><cite>首页管理</cite> </a>
          <dl class="layui-nav-child">
           <shiro:hasPermission name="modify"> <dd class=""> <a href="javascript:;" _href="back/modifyPassword" id="xg"> <cite>修改密码</cite> </a> </dd>
			</shiro:hasPermission>
          </dl>
        </li>
        </shiro:hasPermission>
        <shiro:hasPermission name="loan">
        <li class="layui-nav-item"> <a class="javascript:;" href="javascript:;"> <i class="layui-icon" style="top: 3px;">&#xe62d;</i><cite>借款管理</cite> </a>
          <dl class="layui-nav-child">
          	<shiro:hasPermission name="apply">
          	<dd class=""> <a href="javascript:;" _href="lendApply/list"> <cite>借款申请</cite> </a> </dd>
          	</shiro:hasPermission>
          	
          	<shiro:hasPermission name="trial">
          	<dd class=""> <a href="javascript:;" _href="lendApplyInfo/list"> <cite>借款审核</cite> </a> </dd>
           	</shiro:hasPermission>
           	
           	<shiro:hasPermission name="loans">
            <dd class=""> <a href="javascript:;" _href="lendbeckonmoney/lendbeckonmoney-list"> <cite>所有借款</cite> </a> </dd>
          	</shiro:hasPermission>
          	
          	<shiro:hasPermission name="tender">
          	<dd class=""> <a href="javascript:;" _href="lendbeckonmoney/lendbeckon-list"> <cite>招标中的借款</cite> </a> </dd>
            </shiro:hasPermission>
            
            <shiro:hasPermission name="repayment">
            <dd class=""> <a href="javascript:;" _href="photo/still-list"> <cite>收款还款</cite> </a> </dd>
            </shiro:hasPermission>
           
            <dd class="" style="display: none;"> <a href="javascript:;" _href="gathering/list" id="gathering2"> <cite>收款表</cite> </a> </dd>

           
            <shiro:hasPermission name="manual">
             <dd class=""> <a href="javascript:;" _href="userMoney/hand_money"> <cite>手工放款</cite> </a> </dd>
             </shiro:hasPermission>
             
			<shiro:hasPermission name="beoverdue">
            <dd class=""> <a href="javascript:;" _href="stayStill/stayStill-list"> <cite>逾期借款</cite> </a> </dd>
         	</shiro:hasPermission>
         	
          </dl>
        </li>
        </shiro:hasPermission>
        <shiro:hasPermission name="fund">
        <li class="layui-nav-item"> <a class="javascript:;" href="javascript:;"> <i class="layui-icon" style="top: 3px;">&#xe630;</i><cite>资金管理</cite> </a>
		  <dl class="layui-nav-child">
		  <shiro:hasPermission name="funds">
			<dd class="" > <a href="javascript:;" _href="userMoney/userMoney-list"> <cite>用户资金管理</cite> </a> </dd>
			</shiro:hasPermission>
			<shiro:hasPermission name="recharge">
			<dd class="" > <a href="javascript:;" _href="logRecharge/logRecharge-list" id="logRecharge2"> <cite>充值记录表</cite> </a> </dd>
			</shiro:hasPermission>
			<shiro:hasPermission name="withdrawals">
			<dd class="" > <a href="javascript:;" _href="logLift/logLift-list" id="logLift2"> <cite>提现记录表</cite> </a> </dd>
			</shiro:hasPermission>
			<shiro:hasPermission name="flow">
			<dd class="" > <a href="javascript:;" _href="logMoney/logMoney-list" id="log_money2"> <cite>资金流向记录表</cite> </a> </dd>
          	</shiro:hasPermission>
          	<shiro:hasPermission name="bankcard">
          	<dd class=""> <a href="javascript:;" _href="bankCard/list"> <cite>银行卡管理</cite> </a> </dd>
            </shiro:hasPermission>
            <shiro:hasPermission name="platform">
            <dd class=""> <a href="javascript:;" _href="back/platformCharging"> <cite>平台收费管理</cite> </a> </dd>
		  	</shiro:hasPermission>
		  </dl>
		</li>
		</shiro:hasPermission>
		
		<shiro:hasPermission name="authentication">
		<li class="layui-nav-item"> <a class="javascript:;" href="javascript:;"> <i class="layui-icon" style="top: 3px;">&#xe642;</i><cite>认证管理</cite> </a>
          <dl class="layui-nav-child">
           <shiro:hasPermission name="quota">
            <dd class=""> <a href="javascript:;" _href="user/feedback-list"> <cite>额度申请</cite> </a> </dd>
          	</shiro:hasPermission>
          </dl>
        </li>
        </shiro:hasPermission>
        <shiro:hasPermission name="user">
        <li class="layui-nav-item"> <a class="javascript:;" href="javascript:;"> <i class="layui-icon" style="top: 3px;">&#xe612;</i><cite>用户管理</cite> </a>
          <dl class="layui-nav-child">
          	<shiro:hasPermission name="users">
         	<dd class=""> <a href="javascript:;" _href="user/user-list"> <cite>用户管理</cite> </a> </dd>
         	</shiro:hasPermission>
         	<shiro:hasPermission name="keeppushing">
         	<dd class=""> <a href="javascript:;" _href="userRecommend/userRecommend-list"> <cite>推荐人管理</cite> </a> </dd>
            </shiro:hasPermission>
            <shiro:hasPermission name="managers">
            <dd class=""> <a href="javascript:;" _href="manager/admin-list"> <cite>管理员列表</cite> </a> </dd>
            </shiro:hasPermission>
            <shiro:hasPermission name="role">
            <dd class=""> <a href="javascript:;" _href="manager/admin-role"> <cite>角色管理</cite> </a> </dd>
            </shiro:hasPermission>
            <shiro:hasPermission name="journal">
            <dd class=""> <a href="javascript:;" _href="back/openSys-log"> <cite>系统日志</cite> </a> </dd>
         	</shiro:hasPermission>
          </dl>
        </li>
		</shiro:hasPermission>
		<shiro:hasPermission name="propaganda">
        <li class="layui-nav-item"> <a class="javascript:;" href="javascript:;"> <i class="layui-icon" style="top: 3px;">&#xe634;</i><cite>宣传管理</cite> </a>
          <dl class="layui-nav-child">
          	<shiro:hasPermission name="notice">
          	<dd class=""> <a href="javascript:;" _href="notice/notice-list"> <cite>平台公告</cite> </a> </dd>
           	</shiro:hasPermission>
           	<shiro:hasPermission name="media">
           	<dd class=""> <a href="javascript:;" _href="media/list"> <cite>媒体报道</cite> </a> </dd>
            </shiro:hasPermission>
            <shiro:hasPermission name="carousel">
            <dd class=""> <a href="javascript:;" _href="photo/list"> <cite>轮播列表</cite> </a> </dd>
            </shiro:hasPermission>
            <shiro:hasPermission name="opinion">
            <dd class=""> <a href="javascript:;" _href="opinion/list"> <cite>意见反馈</cite> </a> </dd>
             </shiro:hasPermission>
             <shiro:hasPermission name="mail">
             <dd class=""> <a href="javascript:;" _href="letter/list"> <cite>站内信</cite> </a> </dd>
          	 </shiro:hasPermission>
          </dl>
        </li>
   		</shiro:hasPermission>
   		<shiro:hasPermission name="system">
        <li class="layui-nav-item"> <a class="javascript:;" href="javascript:;"> <i class="layui-icon" style="top: 3px;">&#xe629;</i><cite>系统统计</cite> </a>
          <dl class="layui-nav-child">
          	<shiro:hasPermission name="report">
            <dd class=""> <a href="javascript:;" _href="reportForm/reportForm-bao2"> <cite>统计报表</cite> </a> </dd>
            </shiro:hasPermission>
            <shiro:hasPermission name="reward2">
            <dd class=""> <a href="javascript:;" _href="investAword/list"> <cite>奖励统计</cite> </a> </dd>
            </shiro:hasPermission>
            <shiro:hasPermission name="operate2">
            <dd class=""> <a href="javascript:;" _href="monthOperate/monthoperate-list"> <cite>平台运营数据</cite> </a> </dd>
         	</shiro:hasPermission>
          </dl>
        </li>
        </shiro:hasPermission>
	  </ul>
	</div>
  </div>
		<div class="layui-tab layui-tab-card site-demo-title x-main"
			 lay-filter="x-tab" lay-allowclose="true"
			style="left: 0px; border-left: solid 2px #2299ee;">
			<ul class="layui-tab-title" >
				<li class="layui-this" >我的桌面 <i
					class="layui-icon layui-unselect layui-tab-close" >ဆ</i>
				</li>
<%-- 				<c:set value="0" scope="+1"></c:set> --%>
			</ul>
			<div class="layui-tab-content site-demo site-demo-body"
				>
				<div class="layui-tab-item layui-show" >
					<iframe frameborder="0" src="reportForm/reportForm-bao" class="x-iframe"
						name="clic" id="iff" longdesc="1"></iframe>
				</div>
			</div>
		</div>
		<div class="site-mobile-shade" ></div>
	</div>
	<script src="./lib/layui/layui.js" charset="utf-8"></script>
	<script src="./js/x-admin.js"></script>

	<script type="text/javascript"> 
	
	 function iFrame2(add){
		 var iFrame = this.parent.document.getElementsByTagName('iframe');
		 var i= iFrame.length;
		 var _url =add;
		 while(i--){
		 if(iFrame[i].id==_url){
		 return i;
		 }
		 }
	 }

		function log_money() {
			$("#log_money2").click();
			var i=iFrame2('log_money2');
			 window.frames[i].gettid();
		}

		function option(add) {
			var dd = add;
			$.ajax({
				url : "logRecharge/session",
				type : 'POST',
				data : {
					username : dd,
				},
				cache : false,
				success : function(data) {
					console.info(data);
					if (data == "success") {
						$("#logRecharge2").click();
						var i2=iFrame2('logRecharge2');
						 window.frames[i2].ddc(dd);						
					}
				}

			});

		}

		function lift(add) {
			var dd = add;
			$.ajax({
				url : "logLift/session",
				type : 'POST',
				data : {
					username : dd,
				},
				cache : false,
				success : function(data) {
					console.info(data);
					if (data == "success") {
						$("#logLift2").click();
						var i3=iFrame2('logLift2');
						window.frames[i3].frames();
					}
				}
			});
		}
		function log_money2(add) {
			var dd = add;
			$.ajax({
				url : "logMoney/session",
				type : 'POST',
				data : {
					username : dd,
				},
				cache : false,
				success : function(data) {
					console.info(data);
					if (data == "success") {
						$("#log_money2").click();
						var i4=iFrame2('log_money2');
						window.frames[i4].frames();
					}
				}

			});
		}
		function gathering(add) {
			var dd = add;
			$.ajax({
				url : "gathering/session",
				type : 'POST',
				data : {
					realname : dd,
				},
				cache : false,
				success : function(data) {
					console.info(data);
					if (data == "success") {
						$("#gathering2").click();
						var i2=iFrame2('gathering2');
						 window.frames[i2].gath();						
					}
				}

			});

		}
	</script>

        
</body>
</html>