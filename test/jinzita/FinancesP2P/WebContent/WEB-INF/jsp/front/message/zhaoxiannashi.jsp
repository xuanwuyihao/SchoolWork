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
	<script src="js/jquery.min.js"></script>
	<style type="text/css">
	td{
	font-size: 10px;
	
	}
	</style>
	<script> 
	$(document).ready(function(){
	  $("#flip").click(function(){
	    $("#panel").slideDown("show");
	  });
	  $("#flip").click(function(){
		$("#panel").slideUp();
	  });
	});
	</script>
	 
	<style type="text/css"> 
	#panel,#flip
	{	
	    padding:5px;
	    text-align:center;
	    background-color:#e5eecc;
	    border:solid 1px #c3c3c3;
	}
	#panel
	{
	    padding:50px;
	    display:none;
	}
	</style>
</head>
<body>
		<div class="nav-wrap" >
			<ul class="group" id="example-one">
			<!-- <li><div style="width: 120px"></div></li> -->
				<li class="current_page_item">
				<a href="#xm" target="_blank" class="btn" data-toggle="tab">招贤纳士</a></li>
			</ul>
		</div>
		<p>如果你希望加入最火热的行业--p2p金融……</p>
		<p>如果你希望与年轻人为伍，渴望求得一份激发你热情的职业……</p>
		<p>如果你希望成为高手、或者自认为是才高八斗……</p>
		<p>如果你希望和技术高手为伍，切磋技艺，讨论最前沿的技术、产品……</p>
		<p>如果你希望挥洒自己的创意，创造出最酷的产品，获得亿万网友好评……</p>
		<p>如果你希望努力就能获得回报、学习就能不断成长、有成绩就会有机会……</p>
		<p>如果你希望与公司共同成长，共同收获……</p>
		<p>我们为你提供广阔的职业发展平台，在这里你能够充分感受p2p金融的魅力、实现自己、成就事业的梦想！</p>
		<p>我们为你提供富有竞争力的薪酬待遇、轻松惬意的工作氛围、充满活力的团队文化、完善的培训体系和更多的晋升机会。</p>
		<p>简历发送至yiyun.zhu@jinzita.com，请在邮件标题中注明职位。</p>
		

</body>
</html>