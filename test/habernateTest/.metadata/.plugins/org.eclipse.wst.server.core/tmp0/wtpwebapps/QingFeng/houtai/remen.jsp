<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>热门专业</title>
<script type="text/javascript"
	src="../script/jquery-easyui-1.5.2/jquery.min.js"></script>
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="../script/jquery-easyui-1.5.2/themes/gray/easyui.css" />
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="../script/jquery-easyui-1.5.2/themes/icon.css" />
<script type="text/javascript"
	src="../script/jquery-easyui-1.5.2/jquery.easyui.min.js" charset="utf-8"></script>
<script type="text/javascript"
	src="../script/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js"
	charset="utf-8"></script>


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
	width:110px;
}
[id="ImTx"] {
	width:310px;
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

.la{
	padding:0;
	margin:0;
	margin:10px;
	font-size:25px;
	color:#F30;
	font-family:'楷体';
	letter-spacing:5px;
	font-weight:600;
}

.ct{
	width:350px;
	height:28px;
	font-size:24px;
	font-family:'楷体';
	background:rgba(255,255,255,0.5); 
	border-radius: 5px;
	border: 0.2; 
}

.cz{
	width: 95%; 
	height: 230px; 
	font-size: 24px;
	font-family:'楷体'; 
	border-radius: 5px; 
	border: 0.2; 
	color: red; 
	background-color: rgba(0, 0, 0, .05);
	font:'楷体';
	font-size:18px;
}

.report-file {
	display: block;
    position: relative;
    width: 120px;
    height: 28px;
    overflow: hidden;
    border: 1px solid #428bca;
    background: none repeat scroll 0 0 #428bca;
    color: #fff;
    cursor: pointer;
    text-align: center;
    float: left;
    margin-right:5px;
}
.report-file span {
    cursor: pointer;
    display: block;
    line-height: 28px;
}
.file-prew {
    position: absolute;
    top: 0;
    left:0;
	width: 120px;
    height: 30px;
    font-size: 100px; 
    opacity: 0; 
    filter: alpha(opacity=0);
    cursor: pointer;
}


td:hover{
	text-overflow:inherit;
	overflow:visible;
}
</style>

<script type="text/javascript">
	$(document).ready(function(){
		$("#xg1").click(function(){
			t.value = $("#rm1").text();
			textName.value = $("#rm2").text();
			z.value = $("#rm3").text();
		});
	});
	
	$(function(){
		$("#rm").datagrid({
			url:"academy_list",
			striped: true,
			 idField: "id",
			 pageination: true,
			 pageSize: 20,
			 pageList: [10,20,30,40],
			 fitColumns: true,
			 sortName: "id",
			 sortOrder: "desc",
			 columns:[[
			           {field : "hm_id",title:"编号",width : 70,sortable :true},
			           {field : "hm_title",title:"标题",width:70,sortable :true},
			           {field : "hm_picture",title:"图片",width:70,sortable:true},
			           {field : "hm_content",title:"内容",width:70,sortable:true}
			           ]],
		});
	});
</script>

</head>
<body>
<div id="dlg" class="easyui-dialog" title="修改"
		style="width: 80%; height: 400px; max-width: 800px; padding: 2px; display: none;"
		data-options="
				closed:true,
				buttons: [{
					text:'确定',
					iconCls:'icon-ok',
					handler:function(){
						alert('ok');
					}
				},{
					text:'取消',
					handler:function(){
						alert('cancel');;
					}
				}]
			">
		<p>
			<label class="la">标题：</label><input type="text" id="t" class="ct" />
			<br />
			<div class="report-file">
			      <span>上传文件</span>
			      <input tabindex="3" size="3" name="report" class="file-prew" type="file" onchange="document.getElementById('textName').value=this.value">
			</div>
			<input type="text" id="textName" style="height: 28px;border:1px solid #f1f1f1" />
			<br />
			<label class="la">内容：</label><textarea rows="10" cols="20" id="z" class="cz" ></textarea>
		</p>
	</div>
	
	<h1>热门专业管理</h1>
	<table id="rm">
		<tr>
			
			<th id="Im">标题</th>
			<th id="Gxw">图片</th>
			<th id="Im">内容</th>
			<th id="SetUp">操作</th>
		</tr>
		
		<tr>
			
			<td id="rm1">01</td>
			<td id="rm2">F:images/logo.jpg</td>
			<td id="rm3">热门专业管理宣传内容,热门专业管理宣传内容,热门专业管理宣传内容,热门专业管理宣传内容,热门专业管理宣传内容,热门专业管理宣传内容,热门专业管理宣传内容,热门专业管理宣传内容,热门专业管理宣传内容</td>
			

			<td><label title="修改信息"> <a type="radio" name="st1"
					value="修改" id="xg1" href="javascript:void(0)"
					onclick="$('#dlg').dialog('open')">修改</a></label> <label title="恢复初始值">
					<a type="radio" name="st1" value="删除" id="sc1" href="">删除</a>
			</label></td>
		</tr>
		
		</table>
</body>
</html>