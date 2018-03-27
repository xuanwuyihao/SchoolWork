<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
	
	<link rel="stylesheet" type="text/css" href="css/cs1.css" />
	<link rel="stylesheet" type="text/css" href="css/normalize.css" />
	<link rel="stylesheet" href="lib/layui/css/layui.css">
	
	<style type="text/css">
/* 	table{ */
/* 	border-collapse: collapse; */
/* 	} */
/* 	tr{ */
/* 	border-bottom: 1px solid red; */
/* 	} */
/* 	td{ */
/* 	font-size: 10px; */
	
/* 	} */
	a:focus{outline:none;}
	</style>
</head>
<body>
		<div class="nav-wrap" >
			<ul class="group" id="example-one">
			<!-- <li><div style="width: 120px"></div></li> -->
				<li class="current_page_item">
				<a href="#xm" target="_blank" class="btn" data-toggle="tab">平台公告</a></li>
			</ul>
		</div>
		
		<div id="myTabContents" class="tab-content">
			<div class="tab-pane fade in active" id="xm">
				<table lay-even="" lay-skin="row">	
				<c:forEach items="${list}" var="list">
					<tr class="l1" height="25px">
						<td style="width: 60%;font-size: 14px;">
							<a rel="nofollow" href="front/gonggaoxinxi/${list.id }" style="color: #333;float: left;margin-left: 40px;" title="${list.title }" target="_blank">
								${list.title }
							</a>
						</td>
						<td>
							<span class="news-date" style="font-size: 14px;color: #999;float: right;margin-right: 40px;">
								<fmt:formatDate value="${list.time }" pattern="yyyy-MM-dd"/>
							</span>
						</td>
					</tr>
					<tr height="10px"><td></td><td></td></tr>
				</c:forEach>
<%-- 					<tr height="50px"><td style="width: 60%;font-size: 14px;"><a rel="nofollow" href="javascript:;" style="color: #333;margin-left: -90px;" title="宜宾市副市长王力平一行莅临团贷网集团总部参观交流"target="_blank">宜宾市副市长王力平一行莅临团贷网集团总部参观交流1</a></td><td><span class="news-date" style="font-size: 14px;color: #999;margin-right: -200px;">2017-11-03</span></td></tr> --%>
<%-- 					<tr class="l1" height="50px"><td style="width: 60%;font-size: 14px;"><a rel="nofollow" href="javascript:;" style="color: #333;margin-left: -90px;" title="宜宾市副市长王力平一行莅临团贷网集团总部参观交流"target="_blank">宜宾市副市长王力平一行莅临团贷网集团总部参观交流1</a></td><td><span class="news-date" style="font-size: 14px;color: #999;margin-right: -200px;">2017-11-03</span></td></tr> --%>
				</table>
			</div>
		</div>
		
</body>
</html>