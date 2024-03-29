<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>招生简章</title>
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
			textName1.value = $("#zs1").text();
			textName2.value = $("#zs3").text();
			textName3.value = $("#zs5").text();
			textName4.value = $("#zs6").text();
			jj.value = $("#zs2").text();
			nr.value = $("#zs4").text();
			lx.value = $("#zs7").text();
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
			<div class="report-file">
			      <span>图标</span>
			      <input tabindex="3" size="3" name="report" class="file-prew" type="file" onchange="document.getElementById('textName1').value=this.value">
			</div>
			<input type="text" id="textName1" style="height: 28px;border:1px solid #f1f1f1" />
			<br />
			<div class="report-file">
			      <span>院校图片</span>
			      <input tabindex="3" size="3" name="report" class="file-prew" type="file" onchange="document.getElementById('textName2').value=this.value">
			</div>
			<input type="text" id="textName2" style="height: 28px;border:1px solid #f1f1f1" />
			<br />
			<div class="report-file">
			      <span>专业图片</span>
			      <input tabindex="3" size="3" name="report" class="file-prew" type="file" onchange="document.getElementById('textName3').value=this.value">
			</div>
			<input type="text" id="textName3" style="height: 28px;border:1px solid #f1f1f1" />
			<br />
			<div class="report-file">
			      <span>毕业证图片</span>
			      <input tabindex="3" size="3" name="report" class="file-prew" type="file" onchange="document.getElementById('textName4').value=this.value">
			</div>
			<input type="text" id="textName4" style="height: 28px;border:1px solid #f1f1f1" />
			<br />
			
			<label class="la">学校简介：</label><textarea rows="10" cols="20" id="jj" class="cz" ></textarea>
			<br />
			<label class="la">介绍内容：</label><textarea rows="10" cols="20" id="nr" class="cz" ></textarea>
			<br />
			
			<label class="la">类型：</label><input type="text" id="lx" class="ct" />
			
		</p>
	</div>
	
	

	<h1>首页新闻管理</h1>
	<table>
		<tr>
			
			<th id="Gxw">图标</th>
			<th id="Gxw">学校简介</th>
			<th id="Gxw">院校图片</th>
			<th id="Gxw">介绍内容</th>
			<th id="Xtt">专业图片</th>
			<th id="Xtt">毕业证图片</th>
			<th id="Xtt">类型</th>
			<th id="SetUp">操作</th>
		</tr>
		
		<tr>
			
			<td id="zs1">s1.png</td>
			<td id="zs2">北京外国语大学，简称北外，由中华人民共和国教育部直属，位列国家首批“211工程”，入选“985工程优势学科创新平台”、"2011计划"</td>
			<td id="zs3">school.jpg</td>
			<td id="zs4">北京外国语大学（Beijing Foreign Studies University），简称北外，由中华人民共和国教育部直属，位列国家首批“211工程”，入选“985工程优势学科创新平台”、“2011计划”，为财政部6所“小规模试点高校“之一，国际大学翻译学院联合会成员，设有研究生院，是中国外国语类高等院校中历史悠久、教授语种最多、办学层次齐全的全国重点大学，被誉为“共和国外交官摇篮”。 北京外国语大学前身是1941年成立于延安的中国人民抗日军事政治大学三分校俄文大队，后发展为延安外国语学校，建校始隶属于中国共产党领导。新中国成立后，学校归外交部领导。1954年，更名为北京外国语学院；1959年，与北京俄语学院合并组建新的北京外国语学院。1980年后直属国家教育部领导。1994年，正式更名为北京外国语大学。</td>
			<td id="zs5">zy.png</td>
			<td id="zs6">byz.jpg</td>
			<td id="zs7">北京大学</td>

			<td><label title="修改信息"> <a type="radio" name="st1"
					value="修改" id="xg1" href="javascript:void(0)"
					onclick="$('#dlg').dialog('open')">修改</a></label> <label title="恢复初始值">
					<a type="radio" name="st1" value="删除" id="sc1" href="">删除</a>
			</label></td>
		</tr>
		
		</table>
</body>
</html>