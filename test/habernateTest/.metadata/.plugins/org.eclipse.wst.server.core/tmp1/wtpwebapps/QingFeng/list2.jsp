<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工管理</title>
<script type="text/javascript" src="js/jquery-easyui-1.5.2/jquery.min.js"></script>
<link id="easyuiTheme" rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5.2/themes/gray/easyui.css" />
<link id="easyuiTheme" rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5.2/themes/icon.css" />
<script type="text/javascript" src="js/jquery-easyui-1.5.2/jquery.easyui.min.js" charset="utf-8"></script>
<script type="text/javascript" src="js/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js" charset="utf-8"></script>

<script type="text/javascript">
	$(function(){
		$("#cc").datagrid({
			url:"renmenzy",
			striped : true,
			idField : "id",
			pagination : true,
			pageSize : 20,
			pageList : [10, 20, 30, 40],
			fitColumns : true,
			sortName : "id",
			sortOrder : "desc",
			columns : [[
					{field : "a_id",   title : "编号", width : 70, sortable : true},
					{field : "a_school", title : "学院名称", width : 70, sortable : true},
					{field : "a_major",  title : "专业", width : 70, sortable : true},
					{field : "a_flag",  title : "标志位", width : 70, sortable : true}

			     ]],
			
		});
		
		$('#tj').click(function(){
			alert("555");
			
			});
		
	});


</script>


</head>

<body class="easyui-layout">
<div data-options="region:'north',title:'管理中心：',split:true,plain:true,iconCls:'icon-add'" style="height:150px" >
<a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'"  onclick="beforeAdd()">新增</a>
	<input type="button" value="刷新" id="tj"/>
	
</div>
<div data-options="region:'west',title:'树状列表：',split:true" style="width:200px"></div>

<div id="center" data-options="region:'center' ,title:'职员信息：',split:true"  style="padding:5px;background:#eee">
	<div class="easyui-layout" data-options="fit:true">  
		<div id="add" data-options="region:'north',title:'添加：',split:true,plain:true,iconCls:'icon-add'" style="height:10px" ></div>
		<div class="easyui-tabs" fit="true" style="height:250px,width:300px">
		<div class="display:none">
			<table id="cc" class="easyui-datagrid"></table>
		</div>
	</div>
	</div>

</div>
	





   


</body>
</html>