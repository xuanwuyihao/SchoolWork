<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传管理</title>
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
.tr {
	height:50px;
}
.tr:nth-of-type(odd) {
	background-color:#FFF;
}
.tr:nth-of-type(even) {
	background-color:#F2F2F2;
}
.tr:hover {
	color:#F30;
	background-color:#EFFEED;
}
.tr:hover .td:nth-child(1){
	background:url(images/tr-hover-bg.png) no-repeat 3px 8px;
}
.th {
	border-bottom:1px solid #CCC;
	border-top:1px solid #CCC;
	color:#333;
	background-color:#F8F4DA;
}
.td {
	border-bottom:1px solid #CCC;
}

.ths{
	width:35px;
	height:50px;
	border-bottom:1px solid #CCC;
	border-top:1px solid #CCC;
	color:#333;
	background-color:rgba(255,255,255,0.2);
	border:0;
}
/*定义列的宽度*/
[id^="Im"] {
	width:110px;
}
[id="ImTx"] {
	width:110px;
}
[id="Gxw"] {
	width:120px;
}
[id="Xtt"] {
	width:250px;
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


.bu{
	width: 150px; 
	height: 30px; 
	font-size: 24px;
	font-family:'楷体'; 
	border-radius: 5px; 
	border: 0; 
	color: red; 
	background-color: rgba(0, 0, 0, 0.05);
	bottom:0px;
}

/*下拉框*/
.xl {
	border: 1;
	border-color: #233;
	padding: 0;
	margin: 0;
	width: 130px;
	height: 35px;
	font-family: '楷体';
	font-size: 22px;
}

.xl:hover {
	letter-spacing: 1px;
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}

/*文本框*/

.te {
	width: 150px;
	height: 25px;
	border-radius: 5px;
	border: 0.5px solid #0492d6;
	padding-left: 5px;
	font-size: 25px;
}

.te:hover {
	letter-spacing: 1px;
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}

/*特殊TH*/

.the{
	width:200px;
	height:30px;
	bottom:15px;
}

.thx{
	width:355px;
	height:50px;
	border-bottom:1px solid #CCC;
	border-top:1px solid #CCC;
	color:#333;
	background-color:rgba(255,255,255,0.2);
	border:0;
}

/*FILE*/
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


</style>

<script type="text/javascript">
	$(document).ready(function(){
		$("#xg1").click(function(){
			t.value = $("#ck1").text();
			textName.value = $("#ck2").text();
		});
		
		/*获取时间*/
		$("#b1").click(function(){
			alert($("#date1").val()+"-*-*-*-"+$("#date2").val());
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
			<label class="la">姓名：</label><input type="text" id="t" class="ct" />
			<br />
			<div class="report-file">
			      <span>相片</span>
			      <input tabindex="3" size="3" name="report" class="file-prew" type="file" onchange="document.getElementById('textName').value=this.value">
			</div>
			<input type="text" id="textName" style="height: 28px;border:1px solid #f1f1f1" />
		</p>
	</div>
	
	<h1>文件上传管理</h1>
	<table>
		<tr class="tr">
		
			<th>
			 	<label>姓名</label>
			 	<input type="text" class="te">
			 </th>
			
			<th class="the"> 
		        <input class="easyui-datetimebox" id="date1" data-options="formatter:ww4,parser:w4" ></input>
			 </th>
			 <th class="ths">至:</th>
			 <th class="the" > 
		        <input class="easyui-datetimebox" id="date2" data-options="formatter:ww4,parser:w4" ></input>
			 </th>
			 <th><input type="button" id="b1" value="获取时间" class="bu" /></th>
		
		</tr>
	</table>
	<hr />
	<table class="table">
		<tr class="tr">
			
			<th class="th" id="Im">姓名</th>
			<th class="th" id="Gxw">相片</th>
			<th class="th" id="Gxw">缴费凭证</th>
			<th class="th" id="Gxw">论文</th>
			<th class="th" id="Gxw">上传时间</th>
			<th class="th" id="SetUp">操作</th>
		</tr>
		
		<tr class="tr">
			
			<td class="td" id="ck1">用户名</td>
			<td class="td" id="ck2">f:images/01.jpg</td>
			<td class="td" id="ck3">机打发票</td>
			<td class="td" id="ck4">IT行业</td>
			<td class="td" id="ck5">2017-08-23 19:22:32</td>

			<td class="td"><label title="修改信息"> <a type="radio" name="st1"
					value="修改" id="xg1" href="javascript:void(0)"
					onclick="$('#dlg').dialog('open')">修改</a></label> <label title="恢复初始值">
					<a type="radio" name="st1" value="删除" id="sc1" href="">删除</a>
			</label></td>
		</tr>
		
		</table>
		
		
		<!-- ****************************时间控件************************************** -->
	<script type="text/javascript">  
            function ww4(date){  
                var y = date.getFullYear();  
                var m = date.getMonth()+1;  
                var d = date.getDate();  
                var h = date.getHours();  
                return  y+'年'+(m<10?('0'+m):m)+'月'+(d<10?('0'+d):d)+'日'+(h<10?('0'+h):h)+'点';  
                 
            }  
            function w4(s){  
                var reg=/[\u4e00-\u9fa5]/  //利用正则表达式分隔  
                var ss = (s.split(reg));  
                var y = parseInt(ss[0],10);  
                var m = parseInt(ss[1],10);  
                var d = parseInt(ss[2],10);  
                var h = parseInt(ss[3],10);  
                if (!isNaN(y) && !isNaN(m) && !isNaN(d) && !isNaN(h)){  
                    return new Date(y,m-1,d,h);  
                } else {  
                    return new Date();  
                }  
            }  
        </script>
</body>
</html>