<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%request.setCharacterEncoding("UTF-8"); %>
<title>员工管理</title>
<script type="text/javascript" src="../js/jquery-easyui-1.5.2/jquery.min.js"></script>
<link id="easyuiTheme" rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.5.2/themes/gray/easyui.css" />
<link id="easyuiTheme" rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.5.2/themes/icon.css" />
<script type="text/javascript" src="../js/jquery-easyui-1.5.2/jquery.easyui.min.js" charset="utf-8"></script>
<script type="text/javascript" src="../js/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js" charset="utf-8"></script>

<script type="text/javascript">
	$(function(){
		$("#cc").datagrid({
			url:"Department_list",
			striped : true,
			idField : "id",
			pagination : true,
			pageSize : 20,
			pageList : [10, 20, 30, 40],
			fitColumns : true,
			sortName : "id",
			sortOrder : "desc",
			onLoadSuccess:function(data){    
		        $("a[name='opera']").linkbutton({text:'修改',plain:true,iconCls:'icon-edit'});
		        $("a[name='oo']").linkbutton({text:'删除',plain:true,iconCls:'icon-remove'});  
				}, 
			columns : [[   
					{field : "ck", checkbox : true, title : "选择", width : 70, sortable : true},
					{field : "dep_id",   title : "编号", width : 20, sortable : true},
					{field : "dep_name", title : "部门名称", width : 70, sortable : true},
					{field : "dep_seq",  title : "排序号", width : 70, sortable : true},
					{field : "dep_icon",  title : "图标", width : 70, sortable : true},
					{field : "dep_time",  title : "创建时间", width : 100, sortable : true},
					{field : "dep_address",  title : "地址", width : 120, sortable : true},
					
					{
						field:'operate',field:'operate',title:'操作',align:'center',formatter : delectId, width:$(this).width()*0.1,   
						formatter:function(value, row, index){ 
					        var str = '<a href="#" onclick="editUser('+index+')" name="opera" class="easyui-linkbutton" ></a>';  
					        var ss = '<a href="#" onclick="delect('+index+')"name="oo" class="easyui-linkbutton" ></a>';
					        return str+ss;
						}
					},
					
			     ]],

			 
				
		});

	});
	
	function doRow(){
		alert("ttt");
		var row = $('#cc').datagrid('getSelected');
		if (row){
			alert('ID:'+row.a_id+" 学校名称:"+row.u_name);
		}
		
	}
	
	/*-------------------------------------------------------------------------------*/
	function delectId(val,row,index){
		return '&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:"icon-remove"" onclick="editUser('+index+')">编辑</a>'+'&nbsp;&nbsp;<a href="#" onclick="delect('+index+')">删除</a>';
		
		
	}
	
	function editUser(index){		//修改方法
		 $('#cc').datagrid('selectRow',index);// 关键在这里
			var row = $('#cc').datagrid('getSelected');
		 $('#dep_name').val(row.dep_name);
		 $('#dep_seq').val(row.dep_seq);
		 $('#dep_icon').val(row.dep_icon);
		 $('#dep_address').val(row.dep_address);
		 $('#dep_id').val(row.dep_id);
		 $('#dep_time').val(row.dep_time);
		 alert("时间："+row.dep_time);
		$('#dlg').dialog('open')
		
	}
	
	function delect(index){		//删除方法
		$('#cc').datagrid('selectRow',index);// 关键在这里
		var row = $('#cc').datagrid('getSelected');
		alert('确认删除该部门信息?');
		var dep_id = row.dep_id;
		window.location.href ="Delete_department.action?dep_id="+dep_id;
	}
	
	/*--------------------------点击按钮取值--------------------------------*/
	function getSelected(){
		var row = $('#cc').datagrid('getSelected');
		if (row){
			alert('ID:'+row.a_id+" 角色名称:"+row.u_name);
		}
	}
	function getSelections(){
		var ids = [];
		var rows = $('#cc').datagrid('getSelections');
		for(var i=0; i<rows.length; i++){
			ids.push(rows[i].itemid);
		}
		alert(ids.join('\n'));
	}

	/* --------新增----------------------------------------------------------------------- */
function Add(){
	$('#add_dlg').dialog('open')  //打开添加窗口
	}

</script>

<input type="button" value="ss"/>

</head>

<body class="easyui-layout">
<div  data-options="region:'north',title:'表格信息' " style="height:13%" >
			<a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'"  onclick="Add()">新增</a>
		</div>
<div data-options="region:'south',title:'管理中心：',split:true,plain:true,iconCls:'icon-remove'" style="height:86%" >
	<div class="easyui-tabs" fit="true" style="height:250px,width:300px" >
		<div>
			<table id="cc" class="easyui-datagrid" pagination="true"></table>
		</div>
	</div>
	
	
</div>



<div id="dlg" class="easyui-dialog" title="编辑部门"
		style="width: 80%; height: 300px; max-width: 300px; padding: 2px; display: none;"
		data-options="
				closed:true,
				buttons: [{
					text:'保存',
					iconCls:'icon-save',
					handler:function(){
						$('#dlg').dialog('close')  //关闭修改窗口
						alert('修改成功!');
						document.edit_form.submit();   //提交修改form表单
						
					}
				},{
					text:'取消',
					iconCls:'icon-no',
					handler:function(){
						$('#dlg').dialog('close')  //关闭修改窗口
					}
				}]
			">
	<center>
		<form name="edit_form" action="Edit_department" method="post">
		<table>
			<tr>
				<td><label class="la">部门名称：</label></td>
				<td><input type="text" id="dep_name"  name="department.dep_name" class="ct" /></td>
			</tr>
			<tr>
				<td><label class="la">排序：</label></td>
				<td><input type="text" id="dep_seq"  name="department.dep_seq"  class="ct" /></td>
			</tr>
			<tr>
				<td><label class="la">图标：</label></td>
				<td><input type="text" id="dep_icon"  name="department.dep_icon"   class="ct" /></td>
			</tr>
			<tr>
				<td><label class="la">地址：</label></td>
				<td><input type="text" id="dep_address"  name="department.dep_address"   class="ct" /></td>
			</tr>
			<tr>
				<!-- 隐藏域保存ID主键 -->
				<td><input type="hidden" id="dep_id"  name="department.dep_id"  class="ct" /></td>
				<td><input type="hidden" id="dep_time" name="department.dep_time"  class="ct" /></td>
			</tr>
		</table>
		</form>
		</center>
	</div>
	
	<!-- -----添加窗口----------------------------------------------------------------------------------------- -->
	
	<div id="add_dlg" class="easyui-dialog" title="添加部门"
		style="width: 80%; height: 300px; max-width: 300px; padding: 2px; display: none;"
		data-options="
				closed:true,
				buttons: [{
					text:'添加',
					iconCls:'icon-save',
					handler:function(){
						alert('修改成功！');
						document.add_form.submit();   //提交添加form表单
						
					}
				},{
					text:'取消',
					iconCls:'icon-no',
					handler:function(){
						$('#add_dlg').dialog('close')  //关闭添加窗口
					}
				}]
			">
	<center>
		<form name="add_form" action="Save_department" method="post">
			<table>
			<tr>
				<td><label class="la">部门名称：</label></td>
				<td><input type="text" name="department.dep_name" class="ct" /></td>
			</tr>
			<tr>
				<td><label class="la">排序：</label></td>
				<td><input type="text"   name="department.dep_seq"  class="ct" /></td>
			</tr>
			<tr>
				<td><label class="la">图标：</label></td>
				<td><input type="text"  name="department.dep_icon"   class="ct" /></td>
			</tr>
			<tr>
				<td><label class="la">地址：</label></td>
				<td><input type="text"  name="department.dep_address"   class="ct" /></td>
			</tr>
			<tr>
				<!-- 隐藏域保存ID主键 -->
				<td><input type="hidden"  name="department.dep_id"  class="ct" /></td>
			</tr>
		</table>
		</form>
		</center>
	</div>

</body>
</html>