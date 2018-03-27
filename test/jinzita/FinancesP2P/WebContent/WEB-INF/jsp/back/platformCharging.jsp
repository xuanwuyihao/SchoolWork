<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>金字塔 - 综合金融服务后台管理 - 媒体报道</title>
<base href="<%=path%>/">
<meta name="renderer" content="webkit">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" href="./css/x-admin.css" media="all">
<link rel="stylesheet" href="../css/jquery.pagination.css" />
<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script src="../js/jquery.pagination.min.js"></script>

</head>
<body>

	<div class="x-nav">
		<span class="layui-breadcrumb"> <a><cite>首页</cite></a> <a><cite>资金管理</cite></a>
			<a><cite>平台收费管理</cite></a>
		</span> <a class="layui-btn layui-btn-small"
			style="line-height: 1.6em; margin-top: 3px; float: right"
			href="back/platformCharging" title="刷新"><i class="layui-icon"
			style="line-height: 30px">ဂ</i></a>
	</div>
	<div class="x-body">
	<table class="layui-table" id="grd">
		<thead>
			<tr>
				<th>序号</th>
				<th>描述</th>
				<th>金额或者金额百分比</th>
				<th>备注</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${platformChargingList}" var="platformCharging">
				<tr id="tr_1">
					<td>${platformCharging.id}</td>
					<td id="ids" class="i">${platformCharging.describe}</td>
					<td id="photo">${platformCharging.percentage}</td>
					<td id="photo">${platformCharging.remarks}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>


	<script src="./lib/layui/layui.js" charset="utf-8"></script>
	<script src="./js/x-layui.js" charset="utf-8"></script>
	<script>
		layui.use([ 'laydate', 'element', 'laypage', 'layer' ], function() {
			$ = layui.jquery;//jquery
			laydate = layui.laydate;//日期插件
			lement = layui.element();//面包导航
			laypage = layui.laypage;//分页
			layer = layui.layer;//弹出层
		});
	</script>
</body>
</html>
