<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@taglib prefix="s" uri="/struts-tags" %>
	<%@ page import="java.util.*" %>
	<%@ page import="com.qf.model.Employee" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>工作助手</title>

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

<style type="text/css">

label{
	font-size:16px;
	font-family:'楷体';
	margin-left: 15px;
}

h1 {
	margin:10px;
	font-size:25px;
	color:#F30;
	font-family:'楷体';
	letter-spacing:5px;
	font-weight:600;
}

.la{
	/* padding:0;
	margin:0;
	margin:10px;
	font-size:25px;
	color:#F30;
	font-family:'楷体';
	letter-spacing:5px;
	font-weight:600; */
	width: 180px;
	margin-top: 3px;
	display: inline-block;
	float: left;
	padding: 3px;
	font-family: '楷体';
	font-size: 22px;
}

.las{
	padding:0;
	margin:0;
	margin:10px;
	font-family: '楷体';
	font-size: 22px;
	/* letter-spacing:5px;
	font-weight:600; */ 
	/* width: 180px;
	margin-top: 3px;
	display: inline-block;
	float: left;
	padding: 3px;
	font-family: '楷体';
	font-size: 22px; */
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

.bu{
	border-radius: 6px;
	font-family: '楷体';
	font-size: 22px;
	color: #fff;
	background: rgba(26, 228, 108, 0.52);
	border: 0 solid;
	width: 150px;
	height: 35px;
}
.bu:hover {
	
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}

.cz{
	width: 75%; 
	height: 130px; 
	font-size: 24px;
	font-family:'楷体'; 
	border-radius: 5px; 
	border: 0.2; 
	color: red; 
	background-color: rgba(0, 0, 0, .05);
	font:'楷体';
	font-size:18px;
	float:right;
	right:2%;
	top:0;
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
</style>

<% Employee emp = (Employee)session.getAttribute("employee"); %>

<script type="text/javascript">
	$(document).ready(function() {
		$("#tt").datagrid({
			url : 'Work_list',
			striped : true,
			rownumbers : true,
			idField : "s_id",
			pagination : true,
			pageSize : 10,
			pageList : [ 10, 20, 30, 40 ],
			fitColumns : true,
			sortName : "s_id",
			toolbar : "#toolbar",
			sortOrder : 'desc',
			singleSelect : true,
			height:500,
			onLoadSuccess : function(data) {
				$("a[name='opera']").linkbutton({
					text : '编辑',
					plain : true,
					iconCls : 'icon-edit'
				});
				$("a[name='oo']").linkbutton({
					text : '删除',
					plain : true,
					iconCls : 'icon-remove'
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
					field : 'work_id',
					title : '编号',
					width : 50,
					sortable : true,
					hidden : true
				},
				{
					field : 'founder',
					title : '创建者',
					width : 100,
					sortable : true,
					formatter:function(value,row){  
			        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
			        		return content;  
			        }
				},
				{
					field : 'plan_title',
					title : '标题',
					width : 100,
					sortable : true,
					formatter:function(value,row){  
			        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
			        		return content;  
			        }
				},
				{
					field : 'plan_content',
					title : '工作内容',
					width : 350,
					sortable : true,
					formatter:function(value,row){  
			        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
			        		return content;  
			        }
				},
				{
					field : 'emp_name',
					title : '负责人',
					width : 100,
					sortable : true,
					formatter:function(value,row){  
			        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
			        		return content;  
			        }
				},
				{
					field : 'create_time',
					title : '创建时间',
					width : 100,
					sortable : true,
					formatter:function(value,row){  
			        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
			        		return content;  
			        }
				},
				{
					field : 'end_time',
					title : '完成时间',
					width : 120,
					sortable : true,
					formatter:function(value,row){  
			        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
			        		return content;  
			        }
				},
				{
					field : 'work_state',
					title : '完成状态',
					width : 100,
					sortable : true,
					formatter:function(value,row){  
			        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
			        		return content;  
			        }
				},
				{

					field : 'operate',
					title : '操作',
					align : 'center',
					width : 200,

					formatter : function(value, row,index) {
						var str = '<a href="#" name="opera" onclick="editUserss('
									+ index
									+ ')" class="easyui-linkbutton" ></a>';
						var ss = '<a href="#" name="oo" onclick="editUser('
									+ index
									+ ')" class="easyui-linkbutton" ></a>';
						return str + ss;
					}
				}, ] ]

			});
		});

	$(document).ready(function() {
		//添加窗口打开
		$("#add").click(function() {
		//	alert('bbbbbbbbbb');
			$('#emp_name2').val('admin');
			$('#add_tab').window('open');
			//$('#dd').dialog('refresh', 'new_content.php');
		});
		/*=================================================================================*/

	});
	


	function wsjl() {
		$('#dd').dialog({
			title : '缴费记录填写',
			width : 350,
			height : 300,
			closed : false,
			cache : false,
			//href: 'get_content.php',
			modal : true
		});
	}

	function editUser(index) { //删除

		$('#tt').datagrid('selectRow', index);// 关键在这里
		var row = $('#tt').datagrid('getSelected');
		if(confirm("确认删除该项工作提醒？")){
			
			window.location.href = "Work_delete.action?work_id=" + row.work_id;
		}
		
	}

	function editUserss(index) { //修改

		$('#tt').datagrid('selectRow', index);// 关键在这里
		var row = $('#tt').datagrid('getSelected');
		$("#emp_name").val(row.emp_name);
		$("#plan_title").val(row.plan_title);
		$("#plan_content").val(row.plan_content);
		$("#work_state").val(row.work_state);
		$("#work_id").val(row.work_id);
	
		$('#upd_dlg').window('open');
		//window.location.href="notice2.jsp?n_content="+row.n_content;
		
	}

	function ttion() {

		//alert("QQQQQQQQQ");
		document.getElementById("alers").submit();
		//alert("oooooo");

	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	function xzyg(){
		$("#tt2")
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
					singleSelect: true,    //只选中一条数据
					
					columns : [ [
						
							{
								field : "emp_id",
								title : "编号",
								width : 30,
								sortable : true
							},
							
							{
								field : "emp_name",
								title : "姓名",
								width : 70,
								sortable : true
							},
							{
								field : "dep_name",
								title : "所属部门",
								width : 70,
								sortable : true
							},
							
							{
								field : "user_name",
								title : "角色",
								width : 70,
								sortable : true
							},
							{
								field : "user_description",
								title : "用户类型",
								width : 70,
								sortable : true
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

							

					] ],

				});
		
		$('#dd2').dialog({
			title : '请选择添加缴费记录的学生',
			width : 700,
			height : 500,
			closed : false,
			cache : false,
			//  href: 'get_content.php',
			modal : true
		});

	}
	

	

</script>
</head>
<body>

	<!-- ================================================================================================== -->

	<div id="dd2" style="display: none"
		data-options="
				closed:true,
				buttons: [{
					text:'确认选择',
					iconCls:'icon-save',
					handler:function(){
						var row = $('#tt2').datagrid('getSelected');
					
					
						$('#emp_name').val(row.emp_name);
						$('#emp_name2').val(row.emp_name);
						
					
						$('#dd2').dialog('close')  //关闭选择学生窗口窗口
						
						 
					}
				},{
					text:'取消',
					iconCls:'icon-no',
					handler:function(){
					$('#emp_name2').val('admin');
						$('#dd2').dialog('close');  //关闭添加窗口
						
					}
				}]">
		<div class="easyui-tabs" fit="true">
			<table id="tt2" class="easyui-datagrid" iconCls="icon-ok"
				pagination="true" style="title: poiu"></table>
			<!-- </table> -->
		</div>

	</div>

	<div class="easyui-tabs" fit="true">
		<!-- <div style="display:none"> -->
		<!-- <table id="tt" class="easyui-datagrid"> -->
		<table id="tt" class="easyui-datagrid" iconCls="icon-save"
			pagination="true"></table>
		<!-- </table> -->
	</div>
	<div id="toolbar">
		<a href="#" id="add" class="easyui-linkbutton" iconCls="icon-wj"
			plain="true"">
			<label>添加工作项</label>
		</a> 
		<a href="#" class="easyui-linkbutton"
			iconCls="icon-scnr" plain="true" onclick="editUser()">
			<label>删除工作项</label>
		</a> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-wjxg" plain="true"
			onclick="destroyUser()">
			<label>Remove User</label>
		</a>
	</div>

	<!-- ======================================================================================================= -->

	<!-- -----修改窗口----------------------------------------------------------------------------------------- -->

	<div id="upd_dlg" class="easyui-dialog" title="编辑工作"
		style="width: 80%; height: 480px; max-width: 800px; padding: 2px; display: none;"
		data-options="
				closed:true,
				buttons: [{
					text:'保存',
					iconCls:'icon-save',
					handler:function(){
					//	alert('修改成功！');
						document.upd_form.submit();   //提交添加form表单
						
					}
				},{
					text:'取消',
					iconCls:'icon-no',
					handler:function(){
						$('#upd_dlg').dialog('close')  //关闭修改窗口
					}
				}]
			">
		<center>
			<form name="upd_form" action="Work_update">
				<%-- <table>
					<tr>
						<td><label class="la">负责人：</label></td>
						<td><input type="text" id="emp_name" name="work_assistant.emp_name"/>
						<input type="button" onclick="xzyg()" value="选择职员" /></td>
					</tr>
					<tr>	
					</tr>
					<tr>
						<td><label class="la">标题：</label></td>
						<td><input type="text" id="plan_title" name="work_assistant.plan_title" class="ct" /></td>
					</tr>
					<tr>	
					</tr>
					<tr>
						<td><label class="la">内容：</label></td>
						<td><textarea rows="5" cols="40" id="plan_content" name="work_assistant.plan_content"></textarea><br/></td>
						
					</tr>
					<tr>
					</tr>
					<tr>
						<td><label class="la">计划时间：</label></td>
						<td><input class="easyui-datetimebox" name="work_assistant.end_time"
   					 data-options="required:true,showSeconds:false" value="18/9/2017 9:3" style="width:150px"></td>
					</tr>
					<tr>
						<td><label class="la">状态：</label></td>
						<td><select id="work_state" name="work_assistant.work_state">
							<option value="未完成">未完成</option>
							<option value="已完成">已完成</option>
						</select></td>
						<td><input type="hidden" id="work_id" name="work_assistant.work_id"/></td>
					</tr>

				</table> --%>
				<p>
					<h1>编辑工作</h1>
				</p>
				<p>
					<label class="la">负责人：</label>
					
					<input type="text" class="ct" id="emp_name" name="work_assistant.emp_name"/>
					<input type="button" onclick="xzyg()" value="选择职员" class="bu" />
				</p>
				<p>
					<label class="la">标题：</label>
					<input type="text" id="plan_title" name="work_assistant.plan_title" class="ct" />
				</p>
				
				
				<p>
					<label class="la">计划时间<%=emp.getEmp_name() %>：</label>
					<input class="easyui-datetimebox" name="birthday" style="width:250px;height:35px;font-size:30px;"
   					 data-options="required:true,showSeconds:false" value="18/9/2017 9:3" >
				</p>
				<p>
					<label class="la">状态：</label>
					<select id="work_state" name="work_assistant.work_state" class="xl">
						<option value="未完成">未完成</option>
						<option value="已完成">已完成</option>
					</select>
				</p>
				
				<p>
					<input type="hidden" id="work_id" name="work_assistant.work_id"/>
				</p>
				<p>
					<label class="las">内容：</label>
					
					<textarea rows="5" cols="40" class="cz" id="plan_content" name="work_assistant.plan_content"></textarea>
				</p>
			</form>
		</center>
	</div>
	<!-- -----添加窗口----------------------------------------------------------------------------------------- -->

	<div id="add_tab" class="easyui-dialog" title="添加工作助手"
		style="width: 80%; height: 480px; max-width: 800px; padding: 2px; display: none;"
		data-options="
				closed:true,
				buttons: [{
					text:'保存',
					iconCls:'icon-save',
					handler:function(){
						//alert('添加成功！');
						document.add_form.submit();   //提交添加form表单
						
					}
				},{
					text:'取消',
					iconCls:'icon-no',
					handler:function(){
						$('#add_tab').dialog('close')  //关闭修改窗口
					}
				}]
			">
		<center>
			<form name="add_form" action="Work_save">
				<%-- <table>
					<tr>
						<td><label class="la">负责人：</label></td>
						<td><input type="text" id="emp_name2" value="admin" name="work_assistant.emp_name"/>
						<input type="button" onclick="xzyg()" value="选择职员" /></td>
					</tr>
					<tr>	
					</tr>
					<tr>
						<td><label class="la">标题：</label></td>
						<td><input type="text" name="work_assistant.plan_title" class="ct" /></td>
					</tr>
					<tr>	
					</tr>
					<tr>
						<td><label class="la">内容：</label></td>
						<td><textarea rows="5" cols="40"  name="work_assistant.plan_content"></textarea><br/></td>
						
					</tr>
					<tr>
					</tr>
					<tr>
						<td><label class="la">计划时间<%=emp.getEmp_name() %>：</label></td>
						<td><input class="easyui-datetimebox" name="birthday"
   					 data-options="required:true,showSeconds:false" value="18/9/2017 9:3" style="width:150px"></td>
					</tr>
					<tr>
						<td><label class="la">状态：</label></td>
						<td><select id="work_state" name="work_assistant.work_state">
							<option value="未完成">未完成</option>
							<option value="已完成">已完成</option>
						</select></td>
						<td><input type="hidden" name="work_assistant.founder" value="<%=emp.getEmp_name() %>"/></td>
					</tr>

				</table> --%>
				<p><h1>添加工作助手</h1></p>
				
				<p>
					<label class="la">负责人：</label>
					<input type="text" id="emp_name2" class="ct" value="admin" name="work_assistant.emp_name"/>
					<input type="button" onclick="xzyg()" value="选择职员" class="bu" />
				</p>
				<p>
					<label class="la">标题：</label>
					<input type="text" name="work_assistant.plan_title" class="ct" />
				</p>
				
				<p>
					<label class="la">计划时间<%=emp.getEmp_name() %>：</label>
					<input class="easyui-datetimebox" name="birthday"
   					 data-options="required:true,showSeconds:false" value="18/9/2017 9:3" style="width:250px;height:35px;font-size:30px;">
				</p>
				<p>
					<label class="la">状态：</label>
					<select id="work_state" name="work_assistant.work_state" class="xl">
						<option value="未完成">未完成</option>
						<option value="已完成">已完成</option>
					</select>
				</p>
				<p>
					<label class="las">内容：</label>
					<textarea rows="5" cols="40" class="cz" name="work_assistant.plan_content"></textarea>
				</p>
				<p>
					<input type="hidden" name="work_assistant.founder" value="<%=emp.getEmp_name() %>"/>
				</p>
			</form>
		</center>
	</div>
</body>
</html>