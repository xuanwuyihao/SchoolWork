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
<title>员工管理</title>
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
<style >
h1 {
	margin:10px;
	font-size:25px;
	color:#F30;
	font-family:'楷体';
	letter-spacing:5px;
	font-weight:600;
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
	border: 0.5px solid #0492d6;
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
	font-size: samller;
}

.xl:hover {
	letter-spacing: 1px;
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}

.op{
	
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

label{
	font-size:16px;
	font-family:'楷体';
	margin-left: 15px;
}
/*radio*/
label {font-size:12px;cursor:pointer;}
label i {font-size:12px;font-style:normal;display:inline-block;width:12px;height:12px;text-align:center;line-height:12px;color:#fff;vertical-align:middle;margin:-2px 2px 1px 0px;border:#2489c5 1px solid;}
input[type="checkbox"],input[type="radio"] {display:none;}
input[type="radio"] + i {border-radius:7px;}
input[type="checkbox"]:checked + i,input[type="radio"]:checked + i {background:#2489c5;}
input[type="checkbox"]:disabled + i,input[type="radio"]:disabled + i {border-color:#ccc;}
input[type="checkbox"]:checked:disabled + i,input[type="radio"]:checked:disabled + i {background:#ccc;}

</style>

<script type="text/javascript">
	$(function(){
		test();
		

	});
	
	function test(){
		$("#cc")
		.datagrid(
				{
					url : "Employee_list",
					striped : true,
					idField : "id",
					pagination : true,
					pageSize : 20,
					pageList : [ 10, 20, 30, 40 ],
					fitColumns : true,
					sortName : "id",
					sortOrder : "desc",
					toolbar:"#toolbar",
					singleSelect: true,    //只选中一条数据
					height:455,
					onLoadSuccess : function(data) {
						$("a[name='opera']").linkbutton({
							text : '修改',
							plain : true,
							iconCls : 'icon-edit'
						});
						$("a[name='oo']").linkbutton({
							text : '删除',
							plain : true,
							iconCls : 'icon-no'
						});
						$("a[name='reset']").linkbutton({
							text : '重置密码',
							plain : true,
							iconCls : 'icon-undo'  //reload双箭头，search放大镜，print打印机，
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
								field : "emp_id",
								title : "编号",
								width : 50,
								sortable : true
							},
							{
								field : "emp_name",
								title : "登录名",
								width : 70,
								sortable : true,
								formatter:function(value,row){  
						        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
						        		return content;  
						        }
							},
							{
								field : "emp_Account",
								title : "姓名",
								width : 70,
								sortable : true,
								formatter:function(value,row){  
						        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
						        		return content;  
						        }
							},
							{
								field : "dep_name",
								title : "所属部门",
								width : 70,
								sortable : true,
								formatter:function(value,row){  
						        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
						        		return content;  
						        }
							},
							{
								field : "emp_time",
								title : "创建时间",
								width : 100,
								sortable : true,
								formatter:function(value,row){  
						        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
						        		return content;  
						        }
							},
							{
								field : "sex",
								title : "性别",
								width : 40,
								sortable : true,
								formatter:function(value,row){  
						        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
						        		return content;  
						        }
							},
							{
								field : "age",
								title : "年龄",
								width : 40,
								sortable : true,
								formatter:function(value,row){  
						        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
						        		return content;  
						        }
							},
							{
								field : "emp_phone",
								title : "联系电话",
								width : 100,
								sortable : true,
								formatter:function(value,row){  
						        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
						        		return content;  
						        }
							},
							{
								field : "user_name",
								title : "角色",
								width : 70,
								sortable : true,
								formatter:function(value,row){  
						        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
						        		return content;  
						        }
							},
							{
								field : "user_description",
								title : "用户类型",
								width : 70,
								sortable : true,
								formatter:function(value,row){  
						        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
						        		return content;  
						        }
							},
							{
								field : "emp_state",
								title : "状态",
								width : 50,
								sortable : true,
								formatter : function(value, row, index) {
									if (value == 1) {
										return '正常';
									} else {
										return '停用';
									}
								}
							},

							{
								field : 'operate',
								field : 'operate',
								title : '操作',
								align : 'center',
								width : 200,
								formatter : function(value, row, index){
									var str = '<a href="#" onclick="editUser('
											+ index
											+ ')" name="opera" class="easyui-linkbutton" ></a>';
									var ss = '<a href="#" onclick="delect('
											+ index
											+ ')"name="oo" class="easyui-linkbutton" ></a>';
									var cz = '<a href="#" onclick="reset_pwd('
											+ index
											+ ')"name="reset" class="easyui-linkbutton" ></a>';		
									return str + ss+ cz;
								}
							},

					] ],

				});
		
		hh();
	}

	/*-------------------------------------------------------------------------------*/

	function editUser(index) { //修改方法
		$('#cc').datagrid('selectRow', index);// 关键在这里
		var row = $('#cc').datagrid('getSelected');
		$('#emp_Account').val(row.emp_Account);
		$('#emp_name').val(row.emp_name);
		$('#dep_name').val(row.dep_name);
		$('#emp_time').val(row.emp_time);
		$('#sex').val(row.sex);
		$('#age').val(row.age);
		$('#emp_phone').val(row.emp_phone);
		$('#user_name').val(row.user_name);
		$('#user_description').val(row.user_description);
		$('#emp_state').val(row.emp_state);
		$('#emp_id').val(row.emp_id);
		$('#emp_time').val(row.emp_time);
		hh2(row.dep_name,row.user_name);
		$('#dlg').dialog('open');

	}

	function delect(index) { //删除方法
		$('#cc').datagrid('selectRow', index);
		var row = $('#cc').datagrid('getSelected');
		//alert('确认删除该职员信息?');
		var emp_id = row.emp_id;
		 $.ajax({
	         async: true,
	         cache: true,
	         url:'Delete_employee.action',
	         type: 'post',
	         data: {
	             'emp_id': emp_id,
	         },
	         dataType: 'text',
	         success: function (data) { 
	        	//alert(data);
	        	test();
	         },
	         error: function (XMLHttpRequest, textStatus) {
	          //   alert("系统繁忙,请稍候再试!");
	         }
	     });
		 
		 
	}
	
	function aas(){
	//	alert("aassssssssssssss");
	}
	
	function reset_pwd(index){
		$('#cc').datagrid('selectRow', index);
		var row = $('#cc').datagrid('getSelected');
		var emp_id = row.emp_id;
		var result = confirm('确认重置该用户密码为：123456？');
		if(result){
			ajax_resetPwd(index,emp_id);   //去重置密码的ajax方法
		}
	}

	/*--------------------------点击按钮取值--------------------------------*/
	function getSelected() {
		var row = $('#cc').datagrid('getSelected');
		if (row) {
			//alert('ID:' + row.a_id + " 角色名称:" + row.u_name);
		}
	}
	function getSelections() {
		var ids = [];
		var rows = $('#cc').datagrid('getSelections');
		for (var i = 0; i < rows.length; i++) {
			ids.push(rows[i].itemid);
		}
		//alert(ids.join('\n'));
	}

	/* --------新增----------------------------------------------------------------------- */
	function Add() {
		$('#add_dlg').dialog('open') //打开添加窗口
	}
</script>



</head>

<body class="easyui-layout">

	<div id="center"
		data-options="region:'center' ,title:'角色信息：',split:true"
		style="padding: 5px; background: #eee">
		<div class="easyui-layout" data-options="fit:true">
			<div data-options="region:'north',title:'表格信息' " style="height: 60px">
				<a href="#" class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-add'" onclick="Add()">新增</a>
					
					<a href="#" class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-add'" onclick="getemp()">查询部门联机</a>
			</div>

	<div id="center"
		data-options="region:'center',split:true"
		style="padding: 5px; background: #eee">
		<div class="easyui-layout" data-options="fit:true">
			<div data-options="region:'north'" style="height: 5%">
				<a href="#" class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-wj'" onclick="Add()">
					<label>新增</label>
				</a>
					
				<a href="#" class="easyui-linkbutton"
				data-options="plain:true,iconCls:'icon-add'" onclick="getemp()">
					查询部门联机
				</a>
			</div>

			<div data-options="region:'center',title:'南方：' "
				style="height: 550px, width:300px">
				<div class="easyui-tabs" fit="true"
					style="height: 550px, width:300px">
					<div>
						<table id="cc" class="easyui-datagrid" pagination="true" width="100%" height="100%"></table>
					</div>
				</div>
			</div>

			<div data-options="region:'center'"
				style="height: 550px, width:300px">
				<div class="easyui-tabs" fit="true"
					style="height: 550px, width:300px">
					<div>
						<table id="cc" class="easyui-datagrid" pagination="true" width="100%" height="100%"></table>
					</div>
				</div>
			</div>


<!-- ======================== -->

<div class="easyui-tabs" fit="true" style="height: 700px;">
<div style="display:none">
<!-- <table id="tt" class="easyui-datagrid">  -->

<table id="cc" class="easyui-datagrid" iconCls="icon-save" pagination="true" style="height: 90%;"></table>
<!-- </table> -->
</div>
</div>


<div id="toolbar">
<!-- <a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'" onclick="Add()">新增</a> -->
	<a href="#" id="add" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="Add();">增加</a>
</div>


<!-- ==================== -->


	<div id="dlg" class="easyui-dialog" title="修改"
		style="width: 80%; height: 500px; max-width: 700px; padding: 2px; display: none;"
		data-options="
				closed:true,
				buttons: [{
					text:'保存',
					iconCls:'icon-save',
					handler:function(){
						$('#dlg').dialog('close')  //关闭修改窗口
					//	alert('修改成功!');
						document.edit_form.submit();   //提交修改form表单
						
					}
				},{
					text:'取消',
					iconCls:'icon-no',
					handler:function(){
						$('#dlg').dialog('close')  //关闭修改窗口
						removeSel(); //清空下拉框选项
					}
				}]
			">
		<center>
			<form name="edit_form" action="Edit_employee">
				<%-- <table>
					<tr>
						<td><label class="la">登录名：</label></td>
						<td><input type="text" name="employee.emp_Account" id="emp_Account" class="ct" /></td>

						<td><label class="la">姓名：</label></td>
						<td><input type="text" name="employee.emp_name" id="emp_name" class="ct" /></td>
					</tr>
					<tr>
						
						<td><label class="la">性别：</label></td>
						<td><input type="radio" name="employee.sex" id="sex" checked="checked" value='男'>男</input>
							<input type="radio" name="employee.sex" id="sex" value='女'>女</input>
						</td>
					</tr>
					<tr>
						<td><label class="la">年龄：</label></td>
						<td><input type="text" name="employee.age" id="age" class="ct" /></td>

						<td><label class="la">联系电话：</label></td>
						<td><input type="text" name="employee.emp_phone" id="emp_phone" class="ct" /></td>
					</tr>
					
					<tr>
						<td><label class="la">状态：</label></td>
						<td>
							<select onchange="alert(value)" id="emp_state" name="employee.emp_state">
								<option value=1>正常</option>
								<option value=0>停用</option>
							</select>
						</td>

						<td><label class="la">所属部门：</label></td>
						<td><select id="dep_sel2" onchange="alert(value)" name="dep_id"></select></td>
					</tr>
					<tr>
						<td><label class="la">角色名称：</label></td>
						<td><select id="user_sel2" onchange="alert(value)" name="user_id"></select></td>
					</tr>
					<tr>
						<!-- 隐藏域保存主键id -->
						<td><input type="hidden" id="emp_id" name="employee.emp_id"
							class="ct" /></td>
						<!-- 隐藏域保存创建时间 -->
						<td><input type="hidden" id="emp_time"
							name="employee.emp_time" class="ct" /></td>
					</tr>

				</table> --%>
				<p>
					<h1>修改</h1>
				</p>
				<br />
				<p>
					<label class="la">登录名：</label>
					<input type="text" name="employee.emp_Account" id="emp_Account" class="ct" />
				</p>
				<br />
				<p>
					<label class="la">姓名：</label>
					<input type="text" name="employee.emp_name" id="emp_name" class="ct" />
				</p>
				<br />
				<p>
					<label class="la">年龄：</label>
					<input type="text" name="employee.age" id="age" class="ct" />
				</p>
				<br />
				<p>
					<label class="la">联系电话：</label>
					<input type="text" name="employee.emp_phone" id="emp_phone" class="ct" />
				</p>
				<br />
				<p>
				
					<label class="la">所属部门：</label>
					<select id="dep_sel2" onchange="alert(value)" name="dep_id" class="xl"></select>
				
					<label class="la">角色名称：</label>
					<select id="user_sel2" onchange="alert(value)" name="user_id" class="xl"></select>
				</p>
				<br />
				<p>
					<label class="la">性别：</label>
					<label><input type="radio" name="employee.sex" id="sex" value='男' ><i>✓</i>男</label>
					
					<label><input type="radio" name="employee.sex" id="sex" value='女'><i>✓</i>女</label>
					
					
					<label class="la">状态：</label>
					<select onchange="alert(value)" id="emp_state" name="employee.emp_state" class="xl">
						<option value="1" class="op">正常</option>
						<option value="0" class="op">停用</option>
					</select>
				</p>
				<br />
				<p>
					<!-- 隐藏域保存主键id -->
					<input type="hidden" id="emp_id" name="employee.emp_id" class="ct" />
					<!-- 隐藏域保存创建时间 -->
					<input type="hidden" id="emp_time" name="employee.emp_time" class="ct" />
				</p>
			</form>
		</center>
	</div>

	<!-- -----添加窗口----------------------------------------------------------------------------------------- -->

	<div id="add_dlg" class="easyui-dialog" title="添加院校"
		style="width: 80%; height: 500px; max-width: 700px; padding: 2px; display: none;"
		data-options="
				closed:true,
				buttons: [{
					text:'添加',
					iconCls:'icon-save',
					handler:function(){
						//alert('修改成功！');
						document.add_form.submit();   //提交添加form表单
						
					}
				},{
					text:'取消',
					iconCls:'icon-no',
					handler:function(){
						$('#add_dlg').dialog('close');  //关闭添加窗口
						
					}
				}]
			">
		<center>
			<form name="add_form" action="Save_employee">

				<%-- <table>
					<tr>
						<td><label class="la">登录名：</label></td>
						<td><input type="text" name="employee.emp_Account" class="ct" /></td>

						<td><label class="la">姓名：</label></td>
						<td><input type="text" name="employee.emp_name" class="ct" /></td>
					</tr>
					<tr>
						
						<td><label class="la">性别：</label></td>
						<td><input type="radio" name="employee.sex" checked="checked" value='男'>男</input>
							<input type="radio" name="employee.sex" value='女'>女</input>
						</td>
					</tr>
					<tr>
						<td><label class="la">年龄：</label></td>
						<td><input type="text" name="employee.age" class="ct" /></td>

						<td><label class="la">联系电话：</label></td>
						<td><input type="text" name="employee.emp_phone" class="ct" /></td>
					</tr>
					
					<tr>
						<td><label class="la">状态：</label></td>
						<td>
							<select onchange="alert(value)" name="employee.emp_state">
								<option value=1>正常</option>
								<option value=0>停用</option>
							</select>
						</td>

						<td><label class="la">所属部门：</label></td>
						<td><select id="dep_sel" onchange="alert(value)" name="dep_id"></select></td>
					</tr>
					<tr>
						<td><label class="la">角色名称：</label></td>
						<td><select id="user_sel" onchange="alert(value)" name="user_id"></select></td>
					</tr>

				</table> --%>
				<p>
					<h1>新增</h1>
				</p>
				<br />
				<p>
					<label class="la">登录名：</label>
					<input type="text" name="employee.emp_Account" class="ct" />
				</p>
				<br />
				<p>
					<label class="la">姓名：</label>
					<input type="text" name="employee.emp_name" class="ct" />
				</p>
				<br />
				<p>
					<label class="la">年龄：</label>
					<input type="text" name="employee.age" class="ct" />
				</p>
				<br />
				<p>
					<label class="la">联系电话：</label>
					<input type="text" name="employee.emp_phone" class="ct" />
				</p>
				<br />
				<p>
				
					<label class="la">所属部门：</label>
					
					<select id="dep_sel" onchange="alert(value)" name="dep_id"  class="xl" ></select>
					<label class="la">角色名称：</label>
					<select id="user_sel" onchange="alert(value)" name="user_id"  class="xl" ></select>
				</p>
				<br />
				<p>
					<label class="la">性别：</label>
					<label><input type="radio" name="employee.sex" value='男' ><i>✓</i>男</label>
					
					<label><input type="radio" name="employee.sex" value='女'><i>✓</i>女</label>
					
					
					<label class="la">状态：</label>
					
					<select onchange="alert(value)" name="employee.emp_state" class="xl">
						<option value="1" class="op">正常</option>
						<option value="0" class="op">停用</option>
					</select>
				</p>
				<br />
				<p>
					<!-- 隐藏域保存主键id -->
					<input type="hidden" id="emp_id" name="employee.emp_id" class="ct" />
					<!-- 隐藏域保存创建时间 -->
					<input type="hidden" id="emp_time" name="employee.emp_time" class="ct" />
				</p>
			</form>
		</center>
	</div>

	<script type="text/javascript">
		//ajax方法
		function hh(){
			 $.ajax({
		         async: true,
		         cache: true,
		         url:'Sel_UserAndDep.action',
		         type: 'post',
		         data: {
		        	 'method': 'user',
		         },
		         dataType: 'json',
		         success: function (data) { 
		        	 $.each( data, function(index, content)
		        			 {  
		        			 // alert("角色名称：" + content.u_name + " ，ID： " + content.u_id); 
		        			  var sel = document.getElementById("user_sel");
		        			  var opt = document.createElement("option");
		  						opt.text = content.u_name;
		  						opt.value=content.u_id;
		  						sel.appendChild(opt);
		  						

		        			 });
		         },
		         error: function (XMLHttpRequest, textStatus) {
		             alert("系统繁忙,请稍候再试!");
		         }
		     });
			 
			//获取部门的值
			 $.ajax({
		         async: true,
		         cache: true,
		         url:'Sel_UserAndDep.action',
		         type: 'post',
		         data: {
		             'method': 'dep',
		         },
		         dataType: 'json',
		         success: function (data) { 
		        	 $.each( data, function(index, content)
		        			 {  
		        			 // alert("角色名称：" + content.u_name + " ，ID： " + content.u_id); 
		        			  var sel = document.getElementById("dep_sel");
		        			  var opt = document.createElement("option");
		  						opt.text = content.dep_name;
		  						opt.value=content.dep_id;
		  						sel.appendChild(opt);
		  						
		        			 });
		         },
		         error: function (XMLHttpRequest, textStatus) {
		            // alert("系统繁忙,请稍候再试!");
		         }
		     });


		}
		
		function hh2(dep_name,user_name){
				//获取角色
			 $.ajax({
		         async: true,
		         cache: true,
		         url:'Sel_UserAndDep.action',
		         type: 'post',
		         data: {
		        	 'method': 'user',
		         },
		         dataType: 'json',
		         success: function (data) { 
		        	 $.each( data, function(index, content)
		        			 {  
		        			 // alert("角色名称：" + content.u_name + " ，ID： " + content.u_id); 
		  						 var sel2 = document.getElementById("user_sel2");
		  						 var opt2 = document.createElement("option");
			  						opt2.text = content.u_name;
			  						opt2.value=content.u_id;
			  						sel2.appendChild(opt2);
			  						if(user_name == content.u_name){
			  							opt2.selected="selected"
			  						}

		        			 });
		         },
		         error: function (XMLHttpRequest, textStatus) {
		           //  alert("系统繁忙,请稍候再试!");
		         }
		     });
			 
			//获取部门的值
			 $.ajax({
		         async: true,
		         cache: true,
		         url:'Sel_UserAndDep.action',
		         type: 'post',
		         data: {
		             'method': 'dep',
		         },
		         dataType: 'json',
		         success: function (data) { 
		        	 $.each( data, function(index, content)
		        			 {  
		        			 // alert("角色名称：" + content.u_name + " ，ID： " + content.u_id)
		  						 var sel2 = document.getElementById("dep_sel2");
		  						  var opt2 = document.createElement("option");
			  						opt2.text = content.dep_name;
			  						opt2.value=content.dep_id;
			  						if(dep_name == content.dep_name){
			  							opt2.selected="selected"
			  						}
			  					 sel2.appendChild(opt2);
						
		        			 });
		         },
		         error: function (XMLHttpRequest, textStatus) {
		           //  alert("系统繁忙,请稍候再试!");
		         }
		     });


		}
		
	//清空下拉框
		function removeSel(){
			 var sel2 = document.getElementById("dep_sel2");
			 var children = sel2.children;        //获取select列表的所有子元素。
			    for(var i=0,len = children.length;i<len;i++)   
			    {
			    	sel2.removeChild(children[0]);  //循环删除所有子元素
			    }
			 //-----------------------------------------------------------------
			  var sel = document.getElementById("user_sel2");
			 var children2 = sel.children;        //获取select列表的所有子元素。
			    for(var i=0,len = children2.length;i<len;i++)   
			    {
			    	sel.removeChild(children2[0]);  //循环删除所有子元素
			    }
			
		}
	
	//重置密码
	function ajax_resetPwd(index, emp_id){
		 $.ajax({
	         async: true,
	         cache: true,
	         url:'Reset_Pwd.action',
	         type: 'post',
	         data: {
	             'emp_id': emp_id,
	         },
	         dataType: 'text',
	         success: function (data) { 
	        	//alert(data);
	         },
	         error: function (XMLHttpRequest, textStatus) {
	           //  alert("系统繁忙,请稍候再试!");
	         }
	     });


	}
	
	//查询部们下的所有员
	function getemp(){
		//alert('查询部们下的所有员');
		 $.ajax({
	         async: true,
	         cache: true,
	         url:'getEmp.action',
	         type: 'post',
	         data: {
	             'emp_id': 20,
	         },
	         dataType: 'text',
	         success: function (data) { 
	        //	alert('成功');
	         },
	         error: function (XMLHttpRequest, textStatus) {
	          //   alert("系统繁忙,请稍候再试!");
	         }
	     });
	}
	

	</script>


</body>
</html>