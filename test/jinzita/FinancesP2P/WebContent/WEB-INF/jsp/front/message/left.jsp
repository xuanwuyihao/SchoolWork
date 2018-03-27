<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>金字塔 - 综合金融服务平台 - 关于我们</title>	
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

		<!--
	作者：383942470@qq.com
	时间：2017-11-08
	描述：图标
-->
		<link href="css/icons.css" rel="stylesheet" type="text/css" />

		<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />

		<link href="css/responsive.css" rel="stylesheet" type="text/css" />
		
		<style>
		
		a {
		    text-decoration: none;
		    cursor: pointer;
		    color: #333;
		}
		
		a:hover {
		    text-decoration: none;
		    outline: none
		}
		
		a.ie6:hover {
		text-decoration: none;
		    zoom: 1
		}
		
		a:focus {
		text-decoration: none;
		    outline: none
		}
		
		a:hover,
		a:active {
		text-decoration: none;
		    outline: none
		}
		ul li{
		display: inline;
		}
		.panel-heading:hover {
		background-color: #c3c3c3;
		}
		.panel-group{
		 width:80%;
		background-color: white;
		}
		 .container{
		/* font-family:楷体; */
		background-color: white;
		}
		.container i{
		padding: 0 10px;
		}
		/* .panel-heading{
		font-family:楷体;
		}  */
		i{
		margin: 0 10px;
		}
		</style>
	
<script type="text/javascript">
	$(function () { $('#collapseFour').collapse({
		toggle: false
	})});
	$(function () { $('#collapseTwo').collapse('show')});
	$(function () { $('#collapseThree').collapse('toggle')});
	$(function () { $('#collapseOne').collapse('hide')});
	$(function () { $('#').collapse('toggle')});

</script> 

	</head>

	<body style="background-color: white;" >
	<!--左右边框  -->
	<div style="margin: 10px 10px;">
			<div class="panel panel-defaults" style="background-color: white;">
				<div class="panel-heading" style="border-radius: 0">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordions" 
						   href="#collapseOne" >
						 <i><img src="img/xxpl.png" width="16px" height="16px"></i>信息披露
						</a>
					</h4>
				</div>
				<div id="collapseOne" class="panel-collapse collapse in">
					<div class="panel-body">
					<ul>
					<li>
					<div class="panel-heading" style="margin-left: -10px;">
						<h4 class="panel-title">
							<a data-toggle="collapses" data-parent="#accordions" 
							   href="front/congyejigou"  target="cent">
								<i><img src="img/cyjg.png" width="16px" height="16px"></i>从业机构信息
							</a>
						</h4>
					</div>
						</li>
						<li>
						<div class="panel-heading" style="margin-left: -10px;">
						<h4 class="panel-title">
							<a data-toggle="collapses" data-parent="#accordions" 
							   href="front/pingtaiyunying" target="cent">
								<i ><img src="img/ptyyxx.png" width="16px" height="16px"></i>平台运营信息
							</a>
						</h4>
					</div>
						</li>
						<li>
						<div class="panel-heading" style="margin-left: -10px;">
						<h4 class="panel-title">
							<a data-toggle="collapses" data-parent="#accordion" 
							   href="front/jiekuanxiangmu" target="cent">
								 <i><img src="img/jkxm.png" width="16px" height="16px"></i>借款项目信息
							</a>
						</h4>
					</div>
						</li>
						</ul>
					</div>
				</div>
			</div>
			<hr>
			<div class="panel panel-successs" style="margin-top:-21px;">
				<div class="panel-heading" style="border-radius: 0">
					<h4 class="panel-title">
						<a data-toggle="collapses"  data-parent="#accordion" 
						   href="front/gudongbeijing" target="cent">
							<i><img src="img/gdbj.png" width="16px" height="16px"></i>股东背景
						</a>
					</h4>
				</div>
				<div style="height: 10px"></div>
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapses" data-parent="#accordion" 
						   href="front/gongsijianjie" target="cent">
							<i><img src="img/gsjs.png" width="16px" height="16px"></i>公司简介
						</a>
					</h4>
				</div>
				<div style="height: 10px"></div>
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapses" data-parent="#accordion" 
						   href="front/pingtaizizhi" target="cent">
							<i><img src="img/ptzz.png" width="16px" height="16px"></i>平台资质
						</a>
					</h4>
				</div>
				<div style="height: 10px"></div>
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapses" data-parent="#accordion" 
						   href="front/guwentuandui" target="cent">
							<i><img src="img/gwtd.png" width="16px" height="16px"></i>顾问团队
						</a>
					</h4>
				</div>
				<div style="height: 10px"></div>
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapses" data-parent="#accordion" 
						   href="media/meiti" target="cent">
							<i><img src="img/gsdt.png" width="16px" height="16px"></i>公司动态
						</a>
					</h4>
				</div>
				<div style="height: 10px"></div>
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapses" data-parent="#accordion" 
						   href="front/pingtaigonggao" target="cent">
							<i><img src="img/ptgg.png" width="16px" height="16px"></i>平台公告
						</a>
					</h4>
				</div>
				<div style="height: 10px"></div>
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapses" data-parent="#accordion" 
						   href="front/zhaoxiannashi" target="cent">
							<i><img src="img/zxns.png" width="16px" height="16px"></i>招贤纳士
						</a>
					</h4>
				</div>
				<div style="height: 10px"></div>
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapses" data-parent="#accordion" 
						   href="front/lianxi" target="cent">
							<i><img src="img/lxwm.png" width="16px" height="16px"></i>联系我们
						</a>
					</h4>
				</div>
			</div>
			</div>
<!--end  -->
		<!-- bootstrap js -->
		<script type="text/javascript" src="js/jquery2.1.4.js"></script>
		<script type="text/javascript" src="js/script.js"></script>
	</body>

</html>