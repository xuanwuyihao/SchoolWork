<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生学费管理中心</title>
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
	width:100px;
}
[id="ImTx"] {
	width:150px;
}
[id="Gxw"] {
	width:220px;
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
	<h1>学费管理中心</h1>
	<table>
		<tr>
			
			<th id="Im">编号</th>
			<th id="ImTx">学生姓名</th>
			<th id="Gxw">电话号码</th>
			<th id="Gxw">家庭住址</th>
			<th id="Gxw">身份证号</th>
			<th id="Gxw">总计学费</th>
			<th id="Gxw">缴费情况</th>
			<th id="SetUp">操作</th>
		</tr>
		<tr>
			
			<td>01</td>
			<td>用户名</td>
			<td>15555555555</td>
			<td>安徽省芜湖市弋江区第一大道233号</td>
			<td>111111111111111111</td>
			<td>8900</td>
			<td>
				<tt>未交清</tt>
				<tt>-980</tt>
			</td>

			<td><label title="修改信息"><input type="radio" name="st1"
					value="修改" />修改</label> <label title="删除此条"><input type="radio"
					name="st1" value="删除" />删除</label></td>
		</tr>
		
		</table>
</body>
</html>