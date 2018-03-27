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
		<link type="text/css" href="css/lrtk.css" rel="stylesheet" />
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/jquery.color-rgba-patch.js"></script>
	<script type="text/javascript" src="js/example.js"></script>
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
		.sub-a-nav{
		font-family: 宋体;
		font-size: 20px;
		}
		div{
		height: auto;
		}
		.jumbotrons a{
		border-bottom-color:rgba(0,0,0,0.1);
		border-left-color:rgba(0,0,0,0.1);
		border-right-color:rgba(0,0,0,0.1);
		border-top-color:rgba(0,0,0,0.1);
		background-color: white;
		color: black;
		border-radius: 0 ;
		
		}
		.jumbotrons a:hover{
		border-bottom-color:rgba(0,0,0,0.1);
		border-left-color:rgba(0,0,0,0.1);
		border-right-color:rgba(0,0,0,0.1);
		border-top-color:rgba(0,0,0,0.1);
		background-color: white;
		color: black;
		margin: 0 50 0 0;
		}
		.jumbotrons ul li{
		display: inline;
		}
		.jumbotrons a:focus {
		border-bottom-color:rgba(0,0,0,0.1);
		border-left-color:rgba(0,0,0,0.1);
		border-right-color:rgba(0,0,0,0.1);
		border-top-color:rgba(0,0,0,0.1);
		background-color: orange;
		color: white;
		}
		.cs{
		border-bottom-color:white;
		border-left-color:white;
		border-right-color:white;
		border-top-color:white;
		}
		.text{text-indent:2em;}
	</style>
</head>
<body>
<div class="nav-wrap" >
	<ul class="group" id="example-one">
	<!-- <li><div style="width: 120px"></div></li> -->
		<li class="current_page_item">
		<a href="#" target="_blank" class="btn" data-toggle="tab">顾问团队</a></li>
	</ul>
</div>
	
<div class="jumbotrons">
	<ul>
	<li class="cs">
  		<span style="visibility:hidden"><a  class="btn" data-toggle="tab" style="width: 200px;cursor:default"></a></span>
 	</li>
	<li>
  		<a  href="#home" class="btn" data-toggle="tab" style="width: 150px;">法律顾问</a>
 	</li>
  	<li>
 		 <a href="#ios" class="btn" data-toggle="tab" style="width: 150px;">律师事务所</a>
 		 </li>
 	 </ul>
</div>
<div style="height: 20px;"></div>
<div id="myTabContents" class="tab-content">
	<div class="tab-pane fade in active" id="home">
		
	<p>就读于江西财经大学EMBA，2005始进入南芳律师事务所做专职律师，2014年5月至今在北京市中银（赣州）律师事务所工作。
	先后担任赣州市规划建设局、赣州市交通局、瑞金市人民政府、龙南县人民政府、赣州外商协会、赣江源商会、赣州市盐业局、赣州市公路局大余分局、青峰药业、
	谱赛科（江西）生物技术有限公司、江西百福房地产、赣州长发置业有限公司、赣州华大置业有限公司、赣州新起点工贸有限公司、南康鑫南投资有限公司、赣州金地实业有限公司、
	江西贵竹房地产开发有限公司、赣州君嘉酒店集团、江西兴万家现代农业有限公司、赣州名忠汽车有限公司、赣州锦城建设开发有限公司、《赣南社会科学》杂志、
	《城市经纬》杂志、《赣州民营企业》杂志等四十余家行政、企事业单位的常年法律顾问。</p>
	</div>
	<div class="tab-pane fade" id="ios">
		<p class="text">中银律师事务所成立于1993年1月，是经司法部门批准的我国最早的合伙制律师事务所之一，
		也是我国最早从事证券法律业务的律师事务所，目前可在金融证券和公司法律风险管理、建筑与房地产、知识产权、
		国际业务领域提供全面的法律服务，在律师界和金融证券界已经牢固树立了“中银律师”的品牌。迄今，
		中银律师已为中国300余家企业的IPO及上市公司的配股、增发、并购与资产重组提供了优质法律服务。</p>
		<p class="text">中银律师总部设在北京，目前已在上海、天津、深圳等27个城市设有分支机构，现有律师和工作人员一千余人，
		绝大部分律师获得国内及国外著名学府的硕士和博士学位，且多数律师具有在政府、企业、知名律师事务所工作或执业的经历，
		在法律和商业领域具备了丰富的实务经验。中银律师事务所规模位列全国第三位。</p>
		中银赣州团队近30人，秉承总所办所宗旨，长期致力于金融资本法律业务与企业法律风险管理实务，
		<p class="text">先后为40余家市重点企业提供常年法律顾问服务，与政府经济职能部门、当地司法资源保持着良好、健康的合作关系
		；赢得了业内外的良好口碑及品牌影响力。本所实施专业分工、团队合作运作模式，即每位律师专攻1-2个专业领域，
		以达到“因为专注、所以专业”，再由全所集中统筹，形成团队合力，组成有机团队为委托方提供全方位的法律服务。
		本所现设：金融法律事务部、法律风险管理事务部、人力资源法律事务部、
		知识产权法律事务部、房地产建设工程法律事务部及民商事争议解决中心等专业部门。</p>
	</div>
	</div>
</body>
</html>