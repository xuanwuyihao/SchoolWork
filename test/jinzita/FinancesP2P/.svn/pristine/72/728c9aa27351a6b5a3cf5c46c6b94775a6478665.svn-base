<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
		
		<link href="css/gongsidongtai.css" rel="stylesheet" type="text/css" />

		<link href="css/responsive.css" rel="stylesheet" type="text/css" />
	<link type="text/css" href="css/lrtk.css" rel="stylesheet" />
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/jquery.color-rgba-patch.js"></script>
	<script type="text/javascript" src="js/example.js"></script>
	<style type="text/css">
	td{
	font-size: 10px;
	
	}
	</style>
</head>
<body>
		<div class="nav-wrap" >
			<ul class="group" id="example-one">
			<!-- <li><div style="width: 120px"></div></li> -->
				<li class="current_page_item">
					<a  href="#xmjs" target="_blank" class="btn" data-toggle="tab">媒体报道</a>
				</li>
				<li>
					<a href="#xm" target="_blank" class="btn" data-toggle="tab">公司动态</a>
				</li>
			</ul>
		</div>
		
	<div id="myTabContents" class="tab-content">
	<div class="tab-pane fade  in active" id="xmjs">
		<div style="width: 848px;height: auto;">
		<center>
			<c:forEach items="${list }" var="com">
				<div style="width: 95%;height: 150px;border-bottom: 1px dashed #c3c3c3;">
				<ul>
					<li style="display: inline;float: left;margin-top: 10px">
					<img src="${com.photo }" width="200px" height="120px">
					</li>
					<li style="display: inline;float: left;margin-left: 30px;margin-top: 10px;">
					<div align="left" style="height: 40px;">
						<font size="4px" style="font-weight: 1px;">
						${com.title }
						</font>
					</div>
					<div align="left" style="height: 55px;width: 550px;">
					<p>${com.content }</p>
					</div>
					<div align="left" style="margin-top: 10px;">
					<img src="img/time.png" width="20px" height="20px" style="margin-top: -5px;">
					<font color="gray">
					<fmt:formatDate value="${com.time }" pattern="yyyy-MM-dd"/>
					</font>
					</div>
					</li>
				</ul>
				</div>
			</c:forEach>
		</center>
		</div>
	</div>
	
	
	<div class="tab-pane fade" id="xm">
	<center>
		<div class="x1">
			<ul>
				<li class="m1" style="width: 30%;">
					<div class="nr" align="left">
					<div style="height: 15px;"></div>
						<div style="margin-left: 20px;">信息内容</div>
					</div>
				</li>
				<li class="m1" style="width: 70%">
					<div class="sm" align="left">
						<div style="height: 15px;"></div>
							<div style="margin-left: 20px;">信息说明</div>
						</div>
				</li>
			</ul>
			<ul>
				<li class="m1" style="width: 30%;">
					<div class="nr2" align="left">
					<div style="height: 15px;"></div>
						<div style="margin-left: 20px;">项目名称</div>
					</div>
				</li>
				<li class="m1" style="width: 70%">
					<div class="sm2" align="left">
						<div style="height: 15px;"></div>
							<div style="margin-left: 20px;">平台命名的项目名称，须代表项目的唯一性</div>
						</div>
				</li>
			</ul>
			<ul>
				<li class="m1" style="width: 30%;">
					<div class="nr2" align="left">
					<div style="height: 15px;"></div>
						<div style="margin-left: 20px;">项目简介</div>
					</div>
				</li>
				<li class="m1" style="width: 70%">
					<div class="sm2" align="left">
						<div style="height: 15px;"></div>
							<div style="margin-left: 20px;">指单笔借款项目的基本情况介绍</div>
						</div>
				</li>
			</ul>
			<ul>
				<li class="m1" style="width: 30%;">
					<div class="nr2" align="left">
					<div style="height: 15px;"></div>
						<div style="margin-left: 20px;">项目金额</div>
					</div>
				</li>
				<li class="m1" style="width: 70%">
					<div class="sm2" align="left">
						<div style="height: 15px;"></div>
							<div style="margin-left: 20px;">指标的总金额</div>
						</div>
				</li>
			</ul>
			<ul>
				<li class="m1" style="width: 30%;">
					<div class="nr2" align="left">
					<div style="height: 15px;"></div>
						<div style="margin-left: 20px;">项目期限</div>
					</div>
				</li>
				<li class="m1" style="width: 70%">
					<div class="sm2" align="left">
						<div style="height: 15px;"></div>
							<div style="margin-left: 20px;">指借款人借款的时间</div>
						</div>
				</li>
			</ul>
			<ul>
				<li class="m1" style="width: 30%;">
					<div class="nr2" align="left">
					<div style="height: 15px;"></div>
						<div style="margin-left: 20px;">起投金额</div>
					</div>
				</li>
				<li class="m1" style="width: 70%">
					<div class="sm2" align="left">
						<div style="height: 15px;"></div>
							<div style="margin-left: 20px;">指出借人对本项目的最低出借额度</div>
						</div>
				</li>
			</ul>
			<ul>
				<li class="m1" style="width: 30%;">
					<div class="nr2" align="left">
					<div style="height: 15px;"></div>
						<div style="margin-left: 20px;">预期收益率</div>
					</div>
				</li>
				<li class="m1" style="width: 70%">
					<div class="sm2" align="left">
						<div style="height: 15px;"></div>
							<div style="margin-left: 20px;">一般采用年化收益率表示</div>
						</div>
				</li>
			</ul>
			<ul>
				<li class="m1" style="width: 30%;">
					<div class="nr2" align="left">
					<div style="height: 15px;"></div>
						<div style="margin-left: 20px;">预计起息日</div>
					</div>
				</li>
				<li class="m1" style="width: 70%">
					<div class="sm2" align="left">
						<div style="height: 15px;"></div>
							<div style="margin-left: 20px;">指项目预计开始计算利息的日期</div>
						</div>
				</li>
			</ul>
			<ul>
				<li class="m1" style="width: 30%;">
					<div class="nr2" align="left">
					<div style="height: 15px;"></div>
						<div style="margin-left: 20px;">还款方式</div>
					</div>
				</li>
				<li class="m1" style="width: 70%">
					<div class="sm2" align="left">
						<div style="height: 15px;"></div>
							<div style="margin-left: 20px;">指借款人在合同中约定的还款方式</div>
						</div>
				</li>
			</ul>
			<ul>
				<li class="m1" style="width: 30%;">
					<div class="nr2" align="left">
					<div style="height: 15px;"></div>
						<div style="margin-left: 20px;">项目状态</div>
					</div>
				</li>
				<li class="m1" style="width: 70%">
					<div class="sm2" align="left">
						<div style="height: 15px;"></div>
							<div style="margin-left: 20px;">指项目实施的状态</div>
						</div>
				</li>
			</ul>
			<ul>
				<li class="m1" style="width: 30%;">
					<div class="nr2" align="left">
					<div style="height: 15px;"></div>
						<div style="margin-left: 20px;">项目融资进度</div>
					</div>
				</li>
				<li class="m1" style="width: 70%">
					<div class="sm2" align="left">
						<div style="height: 15px;"></div>
							<div style="margin-left: 20px;">指项目融资的进展情况，一般采用已参与融资项目金额占比或剩余可出借占比的方式表示</div>
						</div>
				</li>
			</ul>
			<ul>
				<li class="m1" style="width: 30%;">
					<div class="nr2" align="left">
					<div style="height: 15px;"></div>
						<div style="margin-left: 20px;">还款保障措施</div>
					</div>
				</li>
				<li class="m1" style="width: 70%">
					<div class="sm2" align="left">
						<div style="height: 15px;"></div>
							<div style="margin-left: 20px;">指为单笔融资项目提供的还款保障措施，如抵押、质押、保证、保险等措施</div>
						</div>
				</li>
			</ul>
			<ul>
				<li class="m1" style="width: 30%;">
					<div class="nr2" align="left">
					<div style="height: 15px;"></div>
						<div style="margin-left: 20px;">项目风险提示</div>
					</div>
				</li>
				<li class="m1" style="width: 70%">
					<div class="sm2" align="left">
						<div style="height: 15px;"></div>
							<div style="margin-left: 20px;">指针对单笔借款项目的风险出借人的风险提示信息</div>
						</div>
				</li>
			</ul>
			<ul>
				<li class="m1" style="width: 30%;">
					<div class="nr2" align="left">
					<div style="height: 15px;"></div>
						<div style="margin-left: 20px;">资金用途</div>
					</div>
				</li>
				<li class="m1" style="width: 70%">
					<div class="sm2" align="left">
						<div style="height: 15px;"></div>
							<div style="margin-left: 20px;">指获贷资金流向信息、使用信息及计划</div>
						</div>
				</li>
			</ul>
			<ul>
				<li class="m1" style="width: 30%;">
					<div class="nr2" align="left">
					<div style="height: 15px;"></div>
						<div style="margin-left: 20px;">相关费用</div>
					</div>
				</li>
				<li class="m1" style="width: 70%">
					<div class="sm2" align="left">
						<div style="height: 15px;"></div>
							<div style="margin-left: 20px;">指投资人投资该项目可能被收取的费用</div>
						</div>
				</li>
			</ul>
			<ul>
				<li class="m1" style="width: 30%;">
					<div class="nr2" align="left" style="border-bottom: none;">
					<div style="height: 15px;"></div>
						<div style="margin-left: 20px;">合同模板</div>
					</div>
				</li>
				<li class="m1" style="width: 70%">
					<div class="sm2" align="left" style="border-bottom: none;">
						<div style="height: 15px;"></div>
							<div style="margin-left: 20px;">指项目借款合同模板</div>
						</div>
				</li>
			</ul>
		</div>
	</center>
	</div>
	</div>
<%-- <script type="text/javascript">
	function meiti(){
		window.location.href="media/meiti";
	} --%>
</body>
</html>