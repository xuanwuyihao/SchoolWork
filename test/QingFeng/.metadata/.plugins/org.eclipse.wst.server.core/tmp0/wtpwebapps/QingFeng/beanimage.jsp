<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
		<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/beanimage.css" />
<link href="css/uploadbut.css" rel="stylesheet" type="text/css" />
<title>首页轮播图管理中心</title>
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/jquery.min.js"></script>
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="script/jquery-easyui-1.5.2/themes/gray/easyui.css" />
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="script/jquery-easyui-1.5.2/themes/icon.css" />
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/jquery.easyui.min.js" charset="utf-8"></script>
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js"
	charset="utf-8"></script>

<style type="text/css">
body {
	margin: 30px auto;
	text-align: center;
	color: #666;
}

h1 {
	margin: 10px;
	font-size: 25px;
	color: #F30;
	font-family: '楷体';
	letter-spacing: 5px;
	font-weight: 600;
}

table {
	margin: 0px auto;
	border-collapse: collapse;
	font-size: 13px;
}

tr {
	height: 50px;
}

tr:nth-of-type(odd) {
	background-color: #FFF;
}

tr:nth-of-type(even) {
	background-color: #F2F2F2;
}

tr:hover {
	color: #F30;
	background-color: #EFFEED;
}

tr:hover td:nth-child(1) {
	background: url(images/tr-hover-bg.png) no-repeat 3px 8px;
}

th {
	border-bottom: 1px solid #CCC;
	border-top: 1px solid #CCC;
	color: #333;
	background-color: #F8F4DA;
}

td {
	border-bottom: 1px solid #CCC;
}

a {
	text-decoration: none;
	color: blue;
}

a:hover {
	color: red;
}

/*定义列的宽度*/
[id^="Im"] {
	width: 300px;
}

[id="ImTx"] {
	width: 510px;
}

[id="Gxw"] {
	width: 120px;
}

[id="Xtt"] {
	width: 120px;
}

[id="SetUp"] {
	width: 120px;
}

.dc {
	width: 250px;
}

[id="ld"] {
	text-indent: 3px;
	font: "楷体";
	font-size: 18px;
	background: rgba(255, 255, 255, 0.1) no-repeat;
	border-radius: 5px;
	border: 0.5px solid gray;
	letter-spacing: 3px;
}

#ld:hover {
	letter-spacing: 2px;
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}
/* 
.file {
    position: relative;
    display: inline-block;
    background: #D0EEFF;
    border: 1px solid #99D3F5;
    border-radius: 4px;
    padding: 4px 12px;
    overflow: hidden;
    color: #1E88C7;
    text-decoration: none;
    text-indent: 0;
    line-height: 20px;
    top:10px;
    font:"楷体";
	font-size:18px;
}
.file input {
    position: absolute;
    font-size: 100px;
    right: 0;
    top: 0;
    opacity: 0;
}
.file:hover {
    background: #AADFFD;
    border-color: #78C3F3;
    color: #004974;
    text-decoration: none;
} */
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
<!-- 			iconCls: 'icon-save',
				toolbar: [{
					text:'Add',
					iconCls:'icon-add',
					handler:function(){
						alert('add')
					}
				},'-',{
					text:'Save',
					iconCls:'icon-save',
					handler:function(){
						alert('save')
					}
				}],
 -->
<script type="text/javascript">
	var s = $("#m1_i").text();
	var m = $("#m1_t").text();
	$(document).ready(function() {
		
	
	
	});
	/* 
	$(".a-upload").on("change","input[type='file']",function(){
	    var filePath=$(this).val();
	    if(filePath.indexOf("jpg")!=-1 || filePath.indexOf("png")!=-1){
	        $(".fileerrorTip").html("").hide();
	        var arr=filePath.split('\\');
	        var fileName=arr[arr.length-1];
	        $(".showFileName").html(fileName);
	    }else{
	        $(".showFileName").html("");
	        $(".fileerrorTip").html("您未上传文件，或者您上传文件类型有误！").show();
	        return false 
	    }
	    
	    <a href="javascript:;" class="file">上传图片
		<input type="file" name="report" id=""  onchange="filechan(this)">
		</a>
	    
	}); */
</script>
	<!-- --------------------------------------------------------------------------------- -->
<script type="text/javascript">
		//查询
			/*$(function(){
				alert('查询轮播图');
				 $.ajax({
			         async: true,
			         cache: true,
			         url:'getCar.action',
			         type: 'post',
			         data: {
			             'id': 20,
			         },
			         dataType: 'text',
			         success: function (data) { 
			        	alert('成功');
			         },
			         error: function (XMLHttpRequest, textStatus) {
			             alert("系统繁忙,请稍候再试!");
			         }
			     });
			});*/
	
			//第一组图片和文字
			function xiugai(id) {
				var nn = document.getElementById("img"+id).src;
				var scc = document.getElementById("scc"+id).value;   //如果未上传文件保存原来的图片路径
			
				$("#textName").val(nn);
				$("#cf_id").val(id);
				$("#cf_src2").val(scc);
				z.value = $("#area"+id).text();
				$('#dlg').dialog('open')

			}
			
			//当文件上传改变时
			function filechan(val){
				$("#cf_state").val(2);
				document.getElementById('textName').value=val.value
				
			}


</script>

</head>
<body>
	<!-- 直接点击删除操作时恢复被删除图文的初始数据 -->
	<!-- 弹窗 -->
	<div id="dlg" class="easyui-dialog" title="修改"
		style="width: 80%; height: 400px; max-width: 800px; padding: 2px; display: none;"
		data-options="
				closed:true,
				buttons: [{
					text:'确定',
					iconCls:'icon-ok',
					handler:function(){
						document.updateCar.submit();  //提交修改后的表单
					}
				},{
					text:'取消',
					iconCls:'fi-x',
					handler:function(){
						$('#dlg').dialog('close')
					}
				}]
			">
			
			<p>
			<form name="updateCar" action="UpdateCar" enctype="multipart/form-data" method="post">
			<textarea rows="10" cols="20" name="cf_context"  id="z" style="width: 95%; height: 230px; font-size: 16px; border-radius: 5px; border: 0.2; color: red; background-color: rgba(0, 0, 0, .05)；font:'楷体';font-size:18px;"></textarea>
			<br />
			<div class="report-file">
			      <span>上传文件</span>
			      <input tabindex="3" size="3" name="report" class="file-prew" type="file" onchange="filechan(this)">
			</div>
			<input type="text" id="textName" style="height: 28px;border:1px solid #f1f1f1" />
			<input type="hidden" name="cf_id" id="cf_id"/>
			<input type="hidden" name="cf_state" id="cf_state" value="1"/>
			<input type="hidden" name="cf_src2" id="cf_src2"/>  <!-- 未上传文件是保存原来的图片路径 -->
			</form>
			</p>
		
		
	</div>
	
	<h1>首页轮播图管理</h1>
	
	<%String as[] ={"一","二","三","四","五"} ;
		int i=0;
	%>
	<s:iterator value="cflist">
	<table>
		<tr>
			<th id="Im">轮播图<%=as[i]%><%i++; %></th>
			<th id="ImTx">图片配字</th>
			<th id="SetUp">操作</th>
		</tr>
		<tr id="mt<s:property value="cf_id"/>">
			<td id="src<s:property value="cf_id"/>" width="300px;"><img id="img<s:property value="cf_id"/>" alt="" src="Myfiles/<s:property value="img_src"/>" width="150" height="100"> </td>
			<td id="area<s:property value="cf_id"/>" width="520px;">	<s:property value="cf_context"/></td>

			<td><label title="修改信息"> <a type="radio" name="st1" class="role-easyui-linkbutton-edit l-btn l-btn-small l-btn-plain"
					value="修改" onclick="xiugai(<s:property value="cf_id"/>)" data-options="plain:true,iconCls:'fi-pencil icon-blue'"
					onclick="">修改</a></label> <label title="恢复初始值">
					
			</label></td>
		</tr>
	
	</table>
	<input type="hidden" id="scc<s:property value="cf_id"/>" value="<s:property value="img_src"/>"/>
	</s:iterator>
	<br/>
	


</body>
</html>