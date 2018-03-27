<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录日志</title>
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
	width:520px;
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




</style>
<script type="text/javascript">

	$(function(){
	

		var n = $('#emp_name').val();
	
		
		$("#jtcz").datagrid({
			
			url:"cz.action?emp_name="+n,
			fit : true,
            striped : true,
            rownumbers : true,
            pagination : true,
            singleSelect : true,
            idField : 'lid',
            pageSize : 10,
			pageList : [10, 20, 30, 40],
			fitColumns : true,
			sortName : "lid",
			sortOrder : "desc",
			columns:[[
			          {title : '编号',width : 50,field : 'lid',sortable:true},
			          {title : '用户名',width : 50,field : 'msg',sortable:true},
			          {title : '类名',width : 50,field : 'isclass',sortable:true},
			          {title : '登录时间',width : 50,field : 'logtime',sortable:true},
			          {title : '日志等级',width : 50,field : 'logLevel',sortable:true},
			          {title : '操作类型',width : 50,field : 'menthod',sortable:true},
			          
			          
					
			    ]],
			   
		});
		$.ajax({
	       	 url:'cz.action',
	       	 traditional: true,
	       	 data:{emp_name:n},
	       	 type:'post',
	       	 success:function(data){
	       		// alert(data);
	       		 $.messager.alert("提示", "成功", "warning");
	       	 },
	       	 error:function(){
	       		 
	       		 $.messager.alert("提示", "失败", "error");
	       	 }
        });
		//emp_name();
	});
	
	/*--------------------------点击按钮取值--------------------------------*/
	 function emp_name(){
		alert("llllll");
		var emp_name=${param.emp_name};
		setTimeout("alert('123!')",3000);
		 window.location.href="cz.action?emp_name="+emp_name;
	}
	 

</script>
</head>
<body>

	<h1>操作日志</h1>
	<table id="jtcz" class="easyui-datagrid" >
	<p><input type="hidden" id="emp_name" value="${param.emp_name}"/></p>
	</table>
	
</body>
</html>