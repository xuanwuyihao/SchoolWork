<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色管理</title>
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/jquery.min.js"></script>
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="script/jquery-easyui-1.5.2/themes/gray/easyui.css" />
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="script/jquery-easyui-1.5.2/themes/icon.css" />
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="script/jquery-easyui-1.5.2/themes/mobile.css" />
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="script/jquery-easyui-1.5.2/themes/color.css" />
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/jquery.easyui.min.js" charset="utf-8"></script>
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js"
	charset="utf-8"></script>
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/jquery.easyui.mobile.js"></script>


<script>
		/*--------------------------点击按钮取值--------------------------------*/
		function getSelected(){
			var row = $('#tt').datagrid('getSelected');
			if (row){
				alert('Item ID:'+row.itemid+"\nPrice:"+row.listprice);
			}
		}
		function getSelections(){
			var ids = [];
			var rows = $('#tt').datagrid('getSelections');
			for(var i=0; i<rows.length; i++){
				ids.push(rows[i].itemid);
			}
			alert(ids.join('\n'));
		}
		
		/*-----------------------------修改-----------------------------------*/
		
		function formatOper(val,row,index){
			return '<a href="#" onclick="editUser('+index+')">修改</a>';
		}
		
		function editUser(index){
			$('#tt').datagrid('selectRow',index);// 关键在这里
			var row = $('#tt').datagrid('getSelected');
			alert("ID："+row.itemid+" Price："+row.listprice);
			/* if (row){
				$('#dlg').dialog('open').dialog('setTitle','修改学生信息');
				$('#fm').form('load',row);
				url = '${ctx}updateStudent.do?id='+row.id;
			} */
		}
		
		function selectAll(index){  //查询
			alert("来到查询");
		}
	</script>

</head>
<body>
	 
    <h1>DataGrid</h1>
	<div style="margin-bottom:20px">
		<a href="#" onclick="getSelected()">显示单条</a>
		<a href="#" onclick="getSelections()">仅显示ID</a>
		<input type="button" value="查询" onclick="selectAll()"/>
	</div>
	<table id="tt" class="easyui-datagrid" style="width:90%;height:500px"
			url="json/tables.json"
			title="保存" iconCls="icon-save" fitColumns="true">
		<thead>
			<tr>
				<th field="ck" checkbox="true"></th>
				<th field="u_id" width="50" align="center">ID</th>
				<th field="u_name" width="80" align="center">角色名称</th>
				<th field="u_seq" width="80" align="center">排序号</th>
				<th field="u_description" width="80" align="center">描述</th>
				<th field="u_state" width="50" align="center">状态</th>
				<th field="" width="80" formatter="formatOper">操作</th>
			</tr>
		</thead>
	</table>
</body>
</html>