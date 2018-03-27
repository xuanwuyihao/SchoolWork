<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成人教育报名</title>
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


</style>

<script type="text/javascript">
	$(document).ready(function(){
		$("#xg1").click(function(){
			t.value = $("#ck1").text();
			z.value = $("#ck2").text();
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
			<label class="la">学号：</label><input type="text" id="z" class="ct" />
		</p>
	</div>
	
	<h1>成人教育报名</h1>
	<table>
		<tr class="tr">
		
			<th>
			 	<label>学生编号</label>
			 	<input type="text" class="te">
			 </th>
			 <th>
			 	<label>学生姓名</label>
			 	<input type="text" class="te">
			 </th>
			 <th>
			 	<label>手机号码</label>
			 	<input type="text" class="te" />
			 </th>
			 <th>
			 	<label>老师姓名</label>
			 	<input type="text" class="te" />
			 </th>
			 <td class="thx">
				<label>报考类型:</label>
			 	<select class="xl">
			 		<option>-请选择-</option>
			 		<option>成人教育</option>
			 		<option>开放大学</option>
			 		<option>远程教育</option>
			 	</select>
			 </td>
		
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
			
			<th class="th" id="Im">学生编号</th>
			<th class="th" id="Gxw">学生姓名</th>
			<th class="th" id="Gxw">老师姓名</th>
			<th class="th" id="Gxw">身份证号码</th>
			<th class="th" id="Gxw">手机号码</th>
			<th class="th" id="Gxw">报考院校</th>
			<th class="th" id="Gxw">报考专业</th>
			<th class="th" id="Xtt">报考层次</th>
			<th class="th" id="Gxw">学制</th>
			<th class="th" id="Gxw">报名类型</th>
			<th class="th" id="Gxw">报考日期</th>
			<th class="th" id="SetUp">操作</th>
		</tr>
		
		<tr class="tr">
			
			<td class="td" id="ck1">138812306</td>
			<td class="td" id="ck2">用户名</td>
			<td class="td" id="ck3">班主任</td>
			<td class="td" id="ck4">1388888888888888</td>
			<td class="td" id="ck5">13131313131</td>
			<td class="td" id="ck6">江西中医药大学</td>
			<td class="td" id="ck7">医药营销</td>
			<td class="td" id="ck8">专升本</td>
			<td class="td" id="ck9">四年</td>
			<td class="td" id="ck10">成人教育</td>
			<td class="td" id="ck11">2017-08-23 19:22:32</td>

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