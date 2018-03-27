<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
	request.setCharacterEncoding("UTF-8");
%>
<title>角色管理</title>
<script type="text/javascript"
	src="../js/jquery-easyui-1.5.2/jquery.min.js"></script>
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="../js/jquery-easyui-1.5.2/themes/gray/easyui.css" />
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="../js/jquery-easyui-1.5.2/themes/icon.css" />
<script type="text/javascript"
	src="../js/jquery-easyui-1.5.2/jquery.easyui.min.js" charset="utf-8"></script>
<script type="text/javascript"
	src="../js/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js"
	charset="utf-8"></script>
<style>
a {
	text-decoration: none;
}

.la {
	padding: 0;
	margin: 0;
	margin: 10px;
	font-size: 25px;
	color: #F30;
	font-family: '楷体';
	letter-spacing: 5px;
	font-weight: 600;
}

.ct {
	width: 350px;
	height: 28px;
	font-size: 24px;
	font-family: '楷体';
	background: rgba(255, 255, 255, 0.5);
	border-radius: 5px;
	border: 0.5px solid #0492d6;
}

h1 {
	margin: 10px;
	font-size: 25px;
	color: #F30;
	font-family: '楷体';
	letter-spacing: 5px;
	font-weight: 600;
}

label{
	font-size:16px;
	font-family:'楷体';
	margin-left: 15px;
}

</style>
<script type="text/javascript">
	$(function() {
		$("#cc")
				.datagrid(
						{
							url : "User_list",
							striped : true,
							idField : "id",
							pagination : true,

							pageSize : 20,
							pageList : [ 10, 20, 30, 40 ],
							fitColumns : true,
							sortName : "id",
							sortOrder : "desc",

							toolbar : "#toolbar",

							height : 500,

							onLoadSuccess : function(data) {
								$("a[name='opera']").linkbutton({
									text : '修改',
									plain : true,
									iconCls : 'icon-edit'
								});
								$("a[name='oo']").linkbutton({
									text : '删除',
									plain : true,
									iconCls : 'icon-remove'
								});
								$("a[name='sqq']").linkbutton({
									text : '授权',
									plain : true,
									iconCls : 'icon-edit'
								});
								$(".tip").tooltip({  
				                    onShow: function(){  
				                        $(this).tooltip('tip').css({   
				                            width:auto,  
				                            boxShadow: '1px 1px 3px #292929',
				                        });
				                        
				                    },
				    				onPosition: function(){
				    					$(this).tooltip('tip').css('left', $(this).offset().left);
				    					$(this).tooltip('arrow').css('left', 20);
				    				}
				                });
							},
							columns : [ [
									{
										field : "ck",
										checkbox : true,
										title : "选择",
										width : 70,
										sortable : true
									},
									{
										field : "u_id",
										title : "编号",
										width : 70,
										sortable : true
									},
									{
										field : "u_name",
										title : "角色名称",
										width : 70,
										sortable : true,
										formatter:function(value,row){  
								        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
								        		return content;  
								        }
									},
									{
										field : "u_seq",
										title : "排序号",
										width : 70,
										sortable : true,
										formatter:function(value,row){  
								        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
								        		return content;  
								        }
									},
									{
										field : "u_description",
										title : "描述",
										width : 170,
										sortable : true,
										formatter:function(value,row){  
								        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
								        		return content;  
								        }
									},
									{
										field : "u_state",
										title : "状态",
										width : 70,
										sortable : true,
										formatter:function(value,row){  
								        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
								        		return content;  
								        }
									},

									{
										field : 'operate',
										field : 'operate',
										title : '操作',
										align : 'center',
										formatter : delectId,
										width : $(this).width() * 0.1,
										formatter : function(value, row, index) {
											var str = '<a href="#" onclick="editUser('
													+ index
													+ ')" name="opera" class="easyui-linkbutton" ></a>';
											var ss = '<a href="#" onclick="delect('
													+ index
													+ ')"name="oo" class="easyui-linkbutton" ></a>';
											var sq = '<a href="#" onclick="sq('
													+ index
													+ ')"name="sqq" class="easyui-linkbutton" ></a>';

											return str + ss + sq;
										}
									},

							] ],

						});

	});

	function doRow() {
		alert("ttt");
		var row = $('#cc').datagrid('getSelected');
		if (row) {
			alert('ID:' + row.a_id + " 学校名称:" + row.u_name);
		}

	}

	/*-------------------------------------------------------------------------------*/
	function delectId(val, row, index) {
		return '&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:"icon-remove"" onclick="editUser('
				+ index
				+ ')">编辑</a>'
				+ '&nbsp;&nbsp;<a href="#" onclick="delect('
				+ index
				+ ')">删除</a>';

	}

	function editUser(index) { //修改方法
		$('#cc').datagrid('selectRow', index);// 关键在这里
		var row = $('#cc').datagrid('getSelected');
		$('#u_name').val(row.u_name);
		$('#u_seq').val(row.u_seq);
		$('#u_description').val(row.u_description);
		$('#u_state').val(row.u_state);
		$('#u_id').val(row.u_id);

		$('#dlg').dialog('open');

	}

	function delect(index) { //删除方法
		$('#cc').datagrid('selectRow', index);// 关键在这里
		var row = $('#cc').datagrid('getSelected');
		alert('确认删除该角色信息?');
		var u_id = row.u_id;
		window.location.href = "Delete_user.action?u_id=" + u_id;
	}

	//授权方法
	function sq(index) {
		$('#cc').datagrid('selectRow', index);
		var row = $('#cc').datagrid('getSelected');
		alert(row.u_id);
		$('#ws').window('open');

		$('#ws').window('refresh', 'shouquan?id=' + row.u_id + '');
	}

	/*--------------------------点击按钮取值--------------------------------*/
	function getSelected() {
		var row = $('#cc').datagrid('getSelected');
		if (row) {
			alert('ID:' + row.a_id + " 角色名称:" + row.u_name);
		}
	}
	function getSelections() {
		var ids = [];
		var rows = $('#cc').datagrid('getSelections');
		for (var i = 0; i < rows.length; i++) {
			ids.push(rows[i].itemid);
		}
		alert(ids.join('\n'));
	}

	/* --------新增----------------------------------------------------------------------- */
	function Add() {
		$('#add_dlg').dialog('open') //打开添加窗口
	}
</script>

<!-- <input type="button" value="ss" /> -->

</head>

<body class="easyui-layout">


	<div data-options="region:'center'" style="height: 550px, width:300px">
		<div class="easyui-tabs" fit="true" style="height: 550px, width:300px">

			<table id="cc" class="easyui-datagrid" pagination="true"></table>

			

		</div>
	</div>
	<div id="toolbar">
		
		<a href="#" id="add" class="easyui-linkbutton" iconCls="icon-wj"
			plain="true" onclick="Add();">
			<label>增加</label>
		</a>
	</div>

	<!-- =================== -->

	<div id="dlg" class="easyui-dialog" title="修改"
		style="width: 80%; height: 350px; max-width: 550px; padding: 2px; display: none;"
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
				<!-- <table>
					<tr>
						<td><label class="la">角色名称：</label></td>
						<td><input type="text" id="u_name" name="user.u_name"
							class="ct" /></td>
					</tr>
					<tr>
						<td><label class="la">排序号：</label></td>
						<td><input type="text" id="u_seq" name="user.u_seq"
							class="ct" /></td>
					</tr>
					<tr>
						<td><label class="la">状态：</label></td>
						<td><input type="text" id="u_state" name="user.u_state"
							class="ct" /></td>
					</tr>
					<tr>
						<td><label class="la">描述：</label></td>
						<td><input type="text" id="u_description"
							name="user.u_description" class="ct" /></td>
					</tr>
					<tr>
						隐藏域保存ID主键
						<td><input type="hidden" id="u_id" name="user.u_id"
							class="ct" /></td>
					</tr>

				</table> -->

				<p>
				<h1>修改</h1>
				</p>
				<p>
					<label class="la">名称：</label> <input type="text" id="u_name"
						name="user.u_name" class="ct" />
				</p>
				<p>
					<label class="la">序号：</label> <input type="text" id="u_seq"
						name="user.u_seq" class="ct" />
				</p>
				<p>
					<label class="la">状态：</label> <input type="text" id="u_state"
						name="user.u_state" class="ct" />
				</p>
				<p>
					<label class="la">描述：</label> <input type="text" id="u_description"
						name="user.u_description" class="ct" />
				</p>
				<p>
					<input type="hidden" id="u_id" name="user.u_id" class="ct" />
				</p>
			</form>
		</center>
	</div>

	<!-- -----添加窗口----------------------------------------------------------------------------------------- -->

	<div id="add_dlg" class="easyui-dialog" title="添加院校"
		style="width: 80%; height: 350px; max-width: 550px; padding: 2px; display: none;"
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
				<!-- <table>
					<tr>
						<td><label class="la">角色名称：</label></td>
						<td><input type="text" name="user.u_name" class="ct" /></td>
					</tr>
					<tr>
						<td><label class="la">排序：</label></td>
						<td><input type="text" name="user.u_seq" class="ct" /></td>
					</tr>
					<tr>
						<td><label class="la">状态：</label></td>
						<td><input type="text" name="user.u_state" class="ct" /></td>
					</tr>
					<tr>
						<td><label class="la">描述：</label></td>
						<td><input type="text" name="user.u_description" class="ct" /></td>
					</tr>

				</table> -->

				<p>
				<h1>修改</h1>
				</p>
				<p>
					<label class="la">名称：</label> <input type="text" name="user.u_name"
						class="ct" />
				</p>
				<p>
					<label class="la">序号：</label> <input type="text" name="user.u_seq"
						class="ct" />
				</p>
				<p>
					<label class="la">状态：</label> <input type="text"
						name="user.u_state" class="ct" />
				</p>
				<p>
					<label class="la">描述：</label> <input type="text"
						name="user.u_description" class="ct" />
				</p>

			</form>
		</center>
	</div>


	<!-- window框 -->
	<div id="ws" class="easyui-window" title="授权"
		data-options="modal:true,closed:true,collapsible:false,minimizable:false,maximizable:false,border:false"
		style="width: 400px; height: 450px; padding: 5px;"></div>
</body>
</html>