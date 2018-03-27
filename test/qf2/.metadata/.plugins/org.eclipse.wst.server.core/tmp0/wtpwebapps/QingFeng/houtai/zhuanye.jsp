<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>&nbsp;清风教育网 - 专业管理</title>
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
	border: 0.5px solid #0492d6;
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

</style>

<script type="text/javascript">
	$(document).ready(function(){
		$("#xg1").click(function(){
			t.value = $("#zy1").text();
			z.value = $("#zy2").text();
		});
		
		$("#xz").click(function(){
			/*新增*/
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
					iconCls:'icon-ccwjcg',
					handler:function(){
						alert('ok');
					}
				},{
					text:'取消',
					iconCls:'icon-ccwjsb',
					handler:function(){
						alert('cancel');;
					}
				}]
			">
		<p>
			<label class="la">标题：</label><input type="text" id="t" class="ct" />
			<br /><br />
			<label class="la">内容：</label><input type="text" id="z" class="ct" />
		</p>
	</div>
	
	<h1>
		部门管理
		<div style="float:right">
			<label title="新增数据">
				<a type="radio" id="xz" href="javascript:void(0)" onclick="$('#dlg').dialog('open')"
				 class="role-easyui-linkbutton-edit l-btn l-btn-small l-btn-plain">
				<label>
					<img src="../images/png/xzsj.png" style="width:25px;height:25px;top:2px;" />新增
				</label>
				</a>
			</label>
		</div>
	</h1>
	<table>
		<tr>
			
			<th id="ImTx">学校</th>
			<th id="ImTx">隶属种类</th>
			<th id="ImTx">操作</th>
		</tr>
		
		<tr>
			
			<td id="zy1">北京外国语大学</td>
			<td id="zy2">国家开发大学</td>

			<td>
				<label title="修改信息"> 
					<a type="radio" name="st1" class="role-easyui-linkbutton-edit l-btn l-btn-small l-btn-plain"
					value="修改" id="xg1" href="javascript:void(0)" onclick="$('#dlg').dialog('open')">
						<label>
							<img src="../images/png/xg.png" style="width:15px;height:15px;" />
						</label>
						修改
					</a>
				</label> 
				<label title="恢复初始值">
					<a type="radio" name="st1" value="删除" id="sc1" class="role-easyui-linkbutton-edit l-btn l-btn-small l-btn-plain">
						<label>
							<img src="../images/png/sc.png" style="width:15px;height:15px;" />
						</label>
						删除
					</a>
				</label>
			</td>
		</tr>
		
		</table>
</body>
</html>