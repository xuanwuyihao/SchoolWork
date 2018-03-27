<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%
	String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>金字塔 - 综合金融服务平台 - 我要投资</title>	
	<!-- 引入页面Logo小图标 -->
	<link rel="icon" href="img/Logo.png" type="image/x-icon">
	<base href="<%=path%>/">
	<link rel="stylesheet" href="lib/layui/css/modules/layui.css"  media="all">
	<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap.js"></script>
	<link rel="stylesheet" type="text/css" href="css/normalize.css" />
	<link rel="stylesheet" href="css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/style.css" type="text/css" />
	<link rel="stylesheet" type="text/css" href="css/zzsc.css" />
	<script type="text/javascript" src="js/zzsc.js"></script>
	<link href="css/icons.css" rel="stylesheet" type="text/css" />

		<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />

		<link href="css/responsive.css" rel="stylesheet" type="text/css" />
		
		<link href="css/button.css" rel="stylesheet" type="text/css" />
		
		<script type="text/javascript" src='js/jquery.js'></script>
		<script type="text/javascript" src='js/head.js'></script>
		<link rel="stylesheet" href="css/footer.css">
		<link href="css/help.css" rel="stylesheet" type="text/css" />
<!-- 去除a标签的下划线 -->
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
a{
	cursor: pointer;
}
</style>	
		
</head>

	<body style="background-color: #ebebeb;">
	<input type="text" id="title" value="${title }" style="display: none;" >
	<input type="text" id="lii" value="${list2 }" style="display: none;" >
    <input type="text" id="ll" value="${pages }" style="display: none;" >
   <input type="text" id="lendTime" value="${lendTime }" style="display: none;" >
   <input type="text" id="reate" value="${reate }" style="display: none;" >
   <input type="text" id="type" value="${type }" style="display: none;" >
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

		
		<!--
        	作者：383942470@qq.com
        	时间：2017-11-22
        	描述：类别选择
        -->
       
        <div class="leibie-page">
        	<div style="float: left;width: 56%;margin-top: 30px;">
        	<div style="float: left;display: flex;justify-content: center;">
        		<span style="font-size: 18px;margin-top: 18px;margin-left: 30px;">项目期限：&nbsp;&nbsp;&nbsp;&nbsp;</span>
        	</div>
        	<div style="width: 100%;flex: 1;">
        	<ul class="dowebok">
	        		<li class="dowebok-1"><input type="radio" name="radio" id="radio8" onclick="yf(0);" <c:if test="${lendTime==0 }">checked</c:if>  data-labelauty="全部" value="0"></li>
					<li class="dowebok-1"><input type="radio" name="radio" id="radio9" onclick="yf(1)"  <c:if test="${lendTime==1 }">checked</c:if> data-labelauty="1-3个月" value="1"></li>
					<li class="dowebok-1"><input type="radio" name="radio" id="radio10" onclick="yf(2);" <c:if test="${lendTime==2 }">checked</c:if> data-labelauty="3-6个月" value="2"></li>
					<li class="dowebok-1"><input type="radio" name="radio" id="radio11" onclick="yf(3);" <c:if test="${lendTime==3 }">checked</c:if> data-labelauty="6-9个月" value="3"></li>
					<li class="dowebok-1"><input type="radio" name="radio" id="radio12" onclick="yf(4);" <c:if test="${lendTime==4 }">checked</c:if> data-labelauty="9个月以上" value="4"></li>
			</ul>
			</div>
			<br /><br /><br />
			<div style="float: left;display: flex;justify-content: center;">
        		<span style="font-size: 18px;margin-top: 18px;margin-left: 30px;">年化收益：&nbsp;&nbsp;&nbsp;&nbsp;</span>
        	</div>
        	<div style="width: 100%;flex: 1;">
        	<ul class="dowebok">

        		<li class="dowebok-1"><input type="radio" name="radio1" id="radio4" onclick="ll(0);" <c:if test="${reate==0 }">checked</c:if> data-labelauty="全部" value="0"></li>
				<li class="dowebok-1"><input type="radio" name="radio1" id="radio5" onclick="ll(1);" <c:if test="${reate==1 }">checked</c:if> data-labelauty="<=10%" value="1"></li>
				<li class="dowebok-1"><input type="radio" name="radio1" id="radio6" onclick="ll(2);" <c:if test="${reate==2 }">checked</c:if> data-labelauty="10%-15%" value="2"></li>
				<li class="dowebok-1"><input type="radio" name="radio1" id="radio7" onclick="ll(3);" <c:if test="${reate==3 }">checked</c:if> data-labelauty="15%-25%" value="3"></li>

			</ul>
			</div>
			<br /><br /><br />
			<div style="float: left;display: flex;justify-content: center;">
        		<span style="font-size: 18px;margin-top: 18px;margin-left: 30px;">项目类型：&nbsp;&nbsp;&nbsp;&nbsp;</span>
        	</div>
        	<div style="width: 100%;flex: 1;">
        	<ul class="dowebok">
        		<li class="dowebok-1"><input type="radio" name="radio2" id="radio1" onclick="bd(0);" <c:if test="${type==0 }">checked</c:if> data-labelauty="全部" value="0"></li>
				<li class="dowebok-1"><input type="radio" name="radio2"  id="radio2" onclick="bd(1);" <c:if test="${type==1 }">checked</c:if> data-labelauty="信用标" value="1" ></li>
				<li class="dowebok-1"><input type="radio" name="radio2" id="radio3" onclick="bd(2);" <c:if test="${type==2 }">checked</c:if> data-labelauty="抵押标" value="2"></li>
			</ul>
			</div>
			</div>
			<div style="float: right;width: 44%;margin: 0 auto;">
				<div class="zySearch" id="zySearch" name="zySearch" style="margin-top: 45px;margin-left: 160px;">
				</div>
			</div>
        </div>
        
		
		<!--
        	作者：383942470@qq.com
        	时间：2017-11-22
        	描述：显示标
        -->
  <script src="js/jquery-labelauty.js"></script>
         
        <c:forEach items="${list }" var="list" >
        <div class="xianshi">
        	<div class="xianshi-biao">
        		<div style="height: 50px;"></div>
        		<div>
        			<span style="border:1px solid #F04243;padding: 3px 9px 3px 9px ;font-size: 15px;color: #F04243;">${list.type }</span>
        			<span style="font-size: 18px;">&nbsp;&nbsp;<b>${list.title }</b></span>
        		</div>
        		<div style="width: 88%;height: 150px;margin-top: 20px;float: left;">
        			<ul style="list-style-type: none;display: inline;float: left;">
        				<li style="display: inline;float: left;margin-right: 90px;">
        					<span class="xianshi-biaoti">预期年化收益率 </span>
        				</li>
        				<li style="display: inline;float: left;margin-right: 90px;">
        					<span class="xianshi-biaoti">项目期限</span>
        				</li>
        				<li style="display: inline;float: left;margin-right: 107px;">
        					<span class="xianshi-biaoti">还款方式</span>
        				</li>
        				<li style="display: inline;float: left;margin-right: 180px;">
        					<span class="xianshi-biaoti">可投金额 / 募集总额</span>
        				</li>
        				<li style="display: inline;float: left;margin-right: 50px;">
        					<span class="xianshi-biaoti">募集进度</span>
        				</li>
        				
        			</ul>
        			<ul style="list-style-type: none;display: inline;float: left;width:950px;">
        				<li style="display: inline;float: left;margin-right: 60px;">
        					<span style="font-size: 38px;color: #F04243;">${list.rate}%</span>
        				</li>
        				
        			<c:if test="${list.rate lt 10}">
        				<li style="display: inline;float: left;margin-right: 80px;margin-top: 10px;">
        					<span style="font-size: 22px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${list.lendtime}个月</span>
        				</li>
        			</c:if>
        			<c:if test="${list.rate ge 10}">
        				<li style="display: inline;float: left;margin-right: 68px;margin-top: 10px;">
        					<span style="font-size: 22px;">${list.lendtime}个月</span>
        				</li>
        			</c:if>
        				<li style="display: inline;float: left;margin-top: 15px;margin-right: 45px;">
        					<span style="font-size: 18px;">${list.back_type}</span>
        				</li>
        				<li style="display: inline;float: left;margin-top: 15px;margin-right: 60px;">
        					<span style="font-size: 18px;">${list.have_cast} 元 </span>
        					<span style="font-size: 18px;">/</span>
        					<span style="font-size: 18px;"> ${list.lendmoney}元</span>
        				</li>
        				
        				<li style="display: inline;float: left;margin-top: 20px;">
        					<div class="progress" style="width: 150px;height: 15px;float: left;">
						    <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width:${list.stay1};"></div>
					        </div>${list.stay1}
        				</li>
        				
        			</ul>
        		</div>
        		<div style="float: right;width: 12%;height: 100px;margin-top: 45px;margin-left: 0px;">
        			
					<c:if test="${list.status=='招标中' }">
					<div style="float: right;margin-top: -15px;">
						<input type="button" value="立即投标" onclick="window.open('front/biaodixinxi/${list.id }')" style="background: #F04243;color: white;text-align: center;-webkit-transition-duration: 0.3s;cursor: pointer;border: none;padding: 9px 39px 9px 39px;" />
					</div>
				</c:if>
					
					<c:if test="${list.status=='满标' }">
					<div style="float: right;margin-top: -15px;">
						<input type="button" value="还款中"  style="background: #CDC8B1;color: white;text-align: center;-webkit-transition-duration: 0.3s;cursor: pointer;border: none;padding: 9px 39px 9px 39px;" />
					</div>
				</c:if>
        		</div>
        	</div>
        </div>
        </c:forEach> 
        
        <div class="xianshi" style="height: 50px;">
        	<div class="rptIntfPortlet">  
        <div class="portletBody">  
            <div class="showSection">  
                <div class="showBody">  
                    <div class="showMessage"></div> 
                    <div class="showMore">  
            <input type="text" id="pagesize" name="pagesize" value="${pagesize }" style="display: none;" >
			<input type="text" id="paoin" name="paoin" value="${paoin }" style="display: none;" >
			<input type="text" id="rowsCount" name="rowsCount" value="${rowsCount }" style="display: none;" >
			<input type="text" id="pages" name="pages" value="${pages }" style="display: none;" >
			<input type="text" id="nowpage" name="nowpage" value="${nowpage }" style="display: none;" >
			 <div style="height: 10px;"></div>
                
        		
        		
			<center><div id="demo3" style="margin-top:-5px"></div></center>
		
                    </div>  
                  
                </div>  
            </div>  
        </div>  
    </div>
        </div>
      
        <!--
        	作者：383942470@qq.com
        	时间：2017-11-15
        	描述：底部
        -->
		<div style="width: 100%; height: 200px; background: white; margin-top: 50px;">
		<div class="container">
			<div class="row">
				<div style="width: 90%; margin-top: 40px;">
					<!-- 部分：一 -->
					<div class="col-md-4">
						<div class="row">
							<div class="col-md-6">
								<ul class="dibu">
									<li class="dibu-li">新手帮助</li>
									<li><a href="front/xinshou" class="dibu-a">新手指引</a></li>
									<li><a href="front/xinshou" class="dibu-a">帮助中心</a></li>
									<li><a href="front/xinshou" class="dibu-a">资费介绍</a></li>
								</ul>
							</div>
							<div class="col-md-6">
								<ul class="dibu">
									<li class="dibu-li">安全保障</li>
									<li><a href="front/our/1" class="dibu-a">法律法规</a></li>
									<li><a href="front/anquan" class="dibu-a">安全保障</a></li>
									<li><a href="front/index" class="dibu-a">合作机构</a></li>
								</ul>
							</div>
						</div>
					</div>
					<!-- 部分：二 -->
					<div class="col-md-6">
						<div class="col-md-5">
							<ul class="dibu">
								<li class="dibu-li">如何理财</li>
								<li><a href="front/index" class="dibu-a">投资资讯</a></li>
								<li><a href="front/index" class="dibu-a">贷款问答</a></li>
								<li><a href="front/index" class="dibu-a">贷款百科</a></li>
							</ul>
						</div>
						<div class="col-md-7">
							<img src="img/qrcode_for_gh_0459d30bd1d0_430.jpg"
								style="width: 129px; height: 129px; margin-left: 60px;" />
						</div>
					</div>
					<!-- 部分：三 -->
					<div class="col-md-2">
						<ul class="dibu">
							<li>1010-1218</li>
							<li>客服电话：（服务时间：9:00-22:00)</li>
							<li>
							
								<div class="mt38 tdw-btn-lg" style="margin-top:0px">
								<a class="dibu-aa">
									<span rel="nofollow" class="btn-text" 
											href="javascript:;"target="_blank">
											联系客服</span>
								</a>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>

		<!-- bootstrap js -->
		<script type="text/javascript" src="js/jquery2.1.4.js"></script>
		<script type="text/javascript" src="js/script.js"></script>


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
		</script>
		
		<script>
			$(function(){
				$(':input').labelauty();
			});
		</script>
		<script type="text/javascript" src="js/zySearch.js"></script>
		<script type="text/javascript">
			$("#zySearch").zySearch({
				
				"width":"355",
				"height":"33",
				"parentClass":"pageTitle",
				"callback":function(keyword){
					var title =  $('#searchInput').val();
					var tt = $("input[name='radio']:checked").val();
					var xx = $("input[name='radio2']:checked").val();
					var yy = $("input[name='radio1']:checked").val();
					window.location.href ='front/touzi?title='+title+'&'+'cont=1'+'&'+'lendtime='+tt+'&'+'rate='+yy+'&'+'type='+xx;
					console.info("搜索的关键字");
					console.info(keyword);
				}
			});
		</script>
		
		
  		<script>
  		
  		var tt=0;
  		var yy=0;
  		var xx=0;
  		
  		//月份
  		function yf(t){  		
  			var co=document.getElementById("lii").value;//当前页
  	     tt = t;
  		 yy=$("input[name='radio1']:checked").val();
  		 xx=$("input[name='radio2']:checked").val();
  		
  		 window.location.href='front/touzi?lendtime='+tt+'&'+'rate='+yy+'&'+'type='+xx+'&'+'cont='+co; 
  		}
  		
  		//利率
  		function ll(y){
  			var co=document.getElementById("lii").value;//当前页
  		yy=y;
  		tt=$("input[name='radio']:checked").val();
 		xx=$("input[name='radio2']:checked").val();
 		
  		window.location.href='front/touzi?lendtime='+tt+'&'+'rate='+yy+'&'+'type='+xx+'&'+'cont='+co;	
  		}
  		
  		//标的
  		function bd(x){
  			var co=document.getElementById("lii").value;//当前页
  		xx=x;
  		tt=$("input[name='radio']:checked").val();
  	 	yy=$("input[name='radio1']:checked").val();
  	 	
  		window.location.href='front/touzi?lendtime='+tt+'&'+'rate='+yy+'&'+'type='+xx+'&'+'cont='+co;
  		}
  		</script>
	 
	 <script src="./lib/layui/layui.js" charset="utf-8"></script>
        <script src="./js/x-layui.js" charset="utf-8"></script>
        
         <script type="text/javascript">
        function option(curr){
        	
        	var tt = document.getElementById("lendTime").value;
        	var yy = document.getElementById("reate").value;
        	var xx = document.getElementById("type").value;
        	var	title = document.getElementById("title").value;
			
        	window.location.href='front/touzi?cont='+curr+'&'+'lendtime='+tt+'&'+'rate='+yy+'&'+'type='+xx+'&'+'title='+title;
        	
        }
        </script>
        
  
		

 <script src="lib/layui/layuis.js" charset="utf-8"></script>
 <script>
layui.use(['laypage', 'layer'], function(){
  var laypage = layui.laypage
  ,layer = layui.layer;
  
  var tt = document.getElementById("lendTime").value;
	var yy = document.getElementById("reate").value;
	var xx = document.getElementById("type").value;
	var	title = document.getElementById("title").value;
	
	var dq = document.getElementById("lii").value;
	var pages = document.getElementById("ll").value;
//自定义首页、尾页、上一页、下一页文本
  laypage({
	    cont: 'demo3'
	    ,pages: pages
	    ,first: dq
	    ,last: pages
	    ,curr:dq
	    ,prev: '<em><</em>'
	    ,next: '<em>></em>'
	    ,skin: '#ff0000'
	    ,jump: function(obj, first){
       	 var curr = obj.curr;
         if(!first){ //一定要加此判断，否则初始时会无限刷新
       	//  alert(curr);//curr当前页数
       	  option(curr);//调用方法
         
           }
       }
	  });
  
});
  </script>
	</body>

</html>