<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>通知公告管理中心</title>
<style type="text/css">

body {
	margin:30px auto;
	text-align:center;
	
	color:#666;
}
h1 {
	margin:10px;
	font-size:25px;
	color:#F30;
	font-family:'楷体';
	letter-spacing:5px;
	font-weight:600;
}
table {
	margin:0px auto;
	border-collapse:collapse;
	font-size:13px;
}
tr {
	height:50px;
}
tr:nth-of-type(odd) {
	background-color:#FFF;
}
tr:nth-of-type(even) {
	background-color:#F2F2F2;
}
tr:hover {
	color:#F30;
	background-color:#EFFEED;
}
tr:hover td:nth-child(1){
	background:url(images/tr-hover-bg.png) no-repeat 3px 8px;
}
th {
	border-bottom:1px solid #CCC;
	border-top:1px solid #CCC;
	color:#333;
	background-color:#F8F4DA;
}
td {
	border-bottom:1px solid #CCC;
}
/*定义列的宽度*/
[id^="Im"] {
	width:500px;
}
[id="ImTx"] {
	width:510px;
}
[id="Gxw"] {
	width:120px;
}
[id="Xtt"] {
	width:120px;
}

[id="SetUp"] {
	width:120px;
}
.dc{
	width:250px;
	
}
[id="ld"] {
	text-indent:3px;
	font:"楷体";
	font-size:18px;
	background: rgba(255,255,255,0.1) no-repeat;
	border-radius: 5px;
	border: 0.5px solid gray;
	letter-spacing:3px;
	
}
#ld:hover{
	letter-spacing:2px;
	border: 0.5px solid red;
	color:red;
	background-color:rgba(255,255,255,0.5);
	
}
</style>
</head>
<body>
<h1>通知公告管理中心</h1>
	<table>
		<tr>
			
			<th id="Gxw">通知公告1</th>
			<th id="Gxw">通知公告2</th>
			<th id="Gxw">通知公告3</th>
			<th id="Gxw">通知公告4</th>
			<th id="Gxw">通知公告5</th>
			<th id="Gxw">通知公告6</th>
			<th id="Gxw">通知公告7</th>
			<th id="SetUp">操作</th>
		</tr>
		<tr>
			
			<td>通知公告1</td>
			<td>通知公告2</td>
			<td>通知公告3</td>
			<td>通知公告4</td>
			<td>通知公告5</td>
			<td>通知公告6</td>
			<td>通知公告7</td>

			<td><label title="修改信息"><input type="radio" name="st1"
					value="修改" />修改</label> <label title="删除此条"><input type="radio"
					name="st1" value="删除" />删除</label></td>
		</tr>
		
		</table>
</body>
</html>