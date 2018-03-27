<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%request.setCharacterEncoding("UTF-8"); %>
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
			onLoadSuccess:function(data){    
		        $("a[name='opera']").linkbutton({text:'修改',plain:true,iconCls:'icon-edit'});
		        $("a[name='oo']").linkbutton({text:'删除',plain:true,iconCls:'icon-remove'});  
				}, 
			columns : [[   
					{field : "list.hm_id",title:"编号",width : 70,sortable :true},
			           {field : "list.hm_title",title:"标题",width:70,sortable :true},
			           {field : "list.hm_picture",title:"图片",width:70,sortable:true},
			           {field : "list.hm_content",title:"内容",width:70,sortable:true},
					
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
		 $('#u_name').val(row.u_name);
		 $('#u_seq').val(row.u_seq);
		 $('#u_description').val(row.u_description);
		 $('#u_state').val(row.u_state);
		 $('#u_id').val(row.u_id);
			
		$('#dlg').dialog('open')
		
	}
	
	function delect(index){		//删除方法
		$('#cc').datagrid('selectRow',index);// 关键在这里
		var row = $('#cc').datagrid('getSelected');
		alert('确认删除该角色信息?');
		var u_id = row.u_id;
		window.location.href ="Delete_user.action?u_id="+u_id;
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
<div data-options="region:'north',title:'管理中心：',split:true,plain:true,iconCls:'icon-remove'" style="height:150px" >
<a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-remove'"  onclick="alert('vfss')">新增</a>
	
</div>
<div data-options="region:'west',title:'树状列表：',split:true" style="width:200px"></div>

<div id="center" data-options="region:'center' ,title:'角色信息：',split:true"  style="padding:5px;background:#eee">
	<div class="easyui-layout" data-options="fit:true">  
		<div  data-options="region:'north',title:'表格信息' " style="height:60px" >
			<a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'"  onclick="Add()">新增</a>
		</div>
		
		<div data-options="region:'center',title:'南方：' " >
			<div class="easyui-tabs" fit="true" style="height:250px,width:300px" >
		<div>
			<table id="cc" class="easyui-datagrid" pagination="true"></table>
		</div>
	</div>
		</div>
		
		
	</div>

</div>
	

<div id="dlg" class="easyui-dialog" title="修改"
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
		<form name="edit_form" action="Edit_user">
		<table>
			<tr>
				<td><label class="la">角色名称：</label></td>
				<td><input type="text" id="u_name"  name="user.u_name" class="ct" /></td>
			</tr>
			<tr>
				<td><label class="la">排序号：</label></td>
				<td><input type="text" id="u_seq"  name="user.u_seq"  class="ct" /></td>
			</tr>
			<tr>
				<td><label class="la">状态：</label></td>
				<td><input type="text" id="u_state"  name="user.u_state"   class="ct" /></td>
			</tr>
			<tr>
				<td><label class="la">描述：</label></td>
				<td><input type="text" id="u_description"  name="user.u_description"   class="ct" /></td>
			</tr>
			<tr>
				<!-- 隐藏域保存ID主键 -->
				<td><input type="hidden" id="u_id"  name="user.u_id"  class="ct" /></td>
			</tr>
		
		</table>
		</form>
		</center>
	</div>
	
	<!-- -----添加窗口----------------------------------------------------------------------------------------- -->
	
	<div id="add_dlg" class="easyui-dialog" title="添加院校"
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
		<form name="add_form" action="Save_user">
		<table>
			<tr>
				<td><label class="la">角色名称：</label></td>
				<td><input type="text"  name="user.u_name" class="ct" /></td>
			</tr>
			<tr>
				<td><label class="la">排序：</label></td>
				<td><input type="text"  name="user.u_seq"  class="ct" /></td>
			</tr>
			<tr>
				<td><label class="la">状态：</label></td>
				<td><input type="text"   name="user.u_state"   class="ct" /></td>
			</tr>
			<tr>
				<td><label class="la">描述：</label></td>
				<td><input type="text"   name="user.u_description"   class="ct" /></td>
			</tr>
			
		</table>
		</form>
		</center>
	</div>

</body>
</html>