<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ page import="java.util.*"%>
<%@ page import="com.qf.model.Employee"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>成考学生报名管理</title>

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

label{
	font-size:16px;
	font-family:'楷体';
	margin-left: 15px;
}

</style>

<script type="text/javascript">
	$(document)
			.ready(
					function() {

						$("#tt")
								.datagrid(
										{
											url : 'Ckstudent',
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
												$("a[name='opera']")
														.linkbutton(
																{
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
														field : 'pay_id',
														title : '学号',
														width : 50,
														sortable : true,
														hidden : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 'stu_name',
														title : '姓名',
														width : 100,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 'emp_name',
														title : '合作人',
														width : 100,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 'cardid',
														title : '身份证号码',
														width : 150,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 'phone',
														title : '手机号码',
														width : 100,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 'aca_name',
														title : '报考院校',
														width : 100,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 'maj_name',
														title : '专业',
														width : 120,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 's_gradations',
														title : '报考层次',
														width : 100,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 's_systme',
														title : '学制',
														width : 100,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 'date',
														title : '报名时间',
														width : 120,
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

														formatter : function(
																value, row,
																index) {

															var str = '<a href="#" name="opera" onclick="Upd('
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
			//alert('bbbbbbbbbb');
			$('#add_dlg').window('open');
			//$('#dd').dialog('refresh', 'new_content.php');
		});
		/*=================================================================================*/

	});

	$(function() {
		var sel2 = document.getElementById("academy");
		var opt2 = document.createElement("option");
		
		opt2.text = '选择院校';
		opt2.value = 0;
		
		sel2.appendChild(opt2);
		
		var sel = document.getElementById("major");
		var opt = document.createElement("option");
		opt.text = '选择专业';
		opt.value = 0;
		sel.appendChild(opt);
	
		$.ajax({
			async : true,
			cache : true,
			url : 'GetAcademy_list.action',
			type : 'post',
			data : {
				'id' : 25,
			},
			dataType : 'json',
			success : function(data) {
				$.each(data, function(index, content) {
					// alert("角色名称：" + content.u_name + " ，ID： " + content.u_id)
					var sel2 = document.getElementById("academy");
					var opt2 = document.createElement("option");
					opt2.text = content.a_school;
					opt2.value = content.a_id;
		
					sel2.appendChild(opt2);
				
				});
			},
			error : function(XMLHttpRequest, textStatus) {
				alert("系统繁忙,请稍候再试!");
			}
		});
		
		$.ajax({
			cache:true,
			async:true,
			url:'Zhikao_UserAndList',
			type:'post',
			dataType:'json',
			success:function(data){
	 			 $.each( data, function(index, content)
				 {  
				  $("#empt").append("<option value='" + content.emp_id + "'>" + content.emp_name + "</option>");
				  $("#empt2").append("<option value='" + content.emp_id + "'>" + content.emp_name + "</option>");
				 });
				
			},error:function(){
				alert('服务繁忙！');
			}
		});

	});

	/* --------新增----------------------------------------------------------------------- */
	function Add() {
		$('#add_dlg').dialog('open') //打开添加窗口
	}
	
	/* --------修改----------------------------------------------------------------------- */
	function Upd(index) {
		alert('呵呵');
		$('#tt').datagrid('selectRow', index);// 关键在这里
		var row = $('#tt').datagrid('getSelected');
		
		$('#s_name').val(row.stu_name);
		$('#id_number').val(row.cardid);
		$('#s_phone').val(row.phone);
		$('#empt2').val(row.emp_name);
		alert(row.emp_name+row.aca_name+row.maj_name);
		$('#s_gradations').val(row.s_gradations);
		$('#academy_id').val(row.aca_name);
		$('#major').val(row.maj_name);
		$('#s_date').val(row.date);
		$('#stuid').val(row.pay_id);
		defaultemp(row.emp_name,row.aca_name,row.maj_name);
		
	
		$('#upd_dlg').dialog('open') //打开修改窗口
	}
</script>

<script type="text/javascript">
	function getMajor(value) { //根据院校获取专业
		var majsel = document.getElementById("major");
		var children = majsel.children; //获取select列表的所有子元素。
		for (var i = 0, len = children.length; i < len; i++) {
			majsel.removeChild(children[0]); //循环删除所有子元素
		}
		if (value == 0) {
			var sel = document.getElementById("major");
			var opt = document.createElement("option");
			opt.text = '选择专业';
			opt.value = 0;

			sel.appendChild(opt);
		}

		$.ajax({
			async : true,
			cache : true,
			url : 'GetMajor_list.action',
			type : 'post',
			data : {
				'a_id' : value,
			},
			dataType : 'json',
			success : function(data) {
				$.each(data, function(index, content) {
					var sel = document.getElementById("major");
					var opt = document.createElement("option");
					opt.text = content.maj_name;
					opt.value = content.maj_id;

					sel.appendChild(opt);

				});
			},
			error : function(XMLHttpRequest, textStatus) {
				alert("系统繁忙,请稍候再试!");
			}
		});

	}
	
	//-------------------------------------------------------------------------------------------
	function getMajor2(value) { //根据院校获取专业2
		alert('sg');
		var majsel = document.getElementById("major_id");
		var children = majsel.children; //获取select列表的所有子元素。
		for (var i = 0, len = children.length; i < len; i++) {
			majsel.removeChild(children[0]); //循环删除所有子元素
		}
		alert('sg'+value);
		
		$.ajax({
			async : true,
			cache : true,
			url : 'GetMajor_list.action',
			type : 'post',
			data : {
				'a_id' : value,
			},
			dataType : 'json',
			success : function(data) {
				$.each(data, function(index, content) {
			
					var opt = document.createElement("option");
					opt.text = content.maj_name;
					opt.value = content.maj_id;

					majsel.appendChild(opt);

				});
			},
			error : function(XMLHttpRequest, textStatus) {
				alert("系统繁忙,请稍候再试!");
			}
		});

	}
	

	function  defaultemp(emp_name,aca_name,maj_name){
		//默认老师
		var empsel = document.getElementById("empt2");
		var acasel = document.getElementById("academy_id");
		var majsel =  document.getElementById("major_id");
		
		var children = empsel.children; //获取select列表的所有子元素。
		for (var i = 0, len = children.length; i < len; i++) {
			if(children[i].text ==emp_name){
				children[i].selected="selected";  //设定默认老师
			}
		}
		var ch2 = acasel.children; //获取select列表的所有子元素。
		for (var i = 0, len = ch2.length; i < len; i++) {
			acasel.removeChild(ch2[0]);  //循环删除所有子元素
		}
		var ch3 = majsel.children; //获取select列表的所有子元素。
		for (var i = 0, len = ch3.length; i < len; i++) {
			majsel.removeChild(ch3[0]);  //循环删除所有子元素
		}
		
		//----------------------------------------------------------------------------
		//默认院校
		$.ajax({
			async : true,
			cache : true,
			url : 'GetAcademy_list.action',
			type : 'post',
			data : {
				'id' : 25,
			},
			dataType : 'json',
			success : function(data) {
				$.each(data, function(index, content) {
					// alert("角色名称：" + content.u_name + " ，ID： " + content.u_id)
					
					var opt3 = document.createElement("option");
					opt3.text = content.a_school;
					opt3.value = content.a_id;
					if(content.a_school == aca_name){
							opt3.selected="selected"   //设置默认学校
							//-根据默认院校加载默认专业------------------------------------------------------------------------
								$.ajax({
									async : true,
									cache : true,
									url : 'GetMajor_list.action',
									type : 'post',
									data : {
										'a_id' : content.a_id,  //传默认学校的id
									},
									dataType : 'json',
									success : function(data) {
										$.each(data, function(index, content) {
											var opt = document.createElement("option");
											opt.text = content.maj_name;
											opt.value = content.maj_id;
											if(content.maj_name == maj_name){
												opt.selected="selected"   //设置默认专业
												}
											majsel.appendChild(opt);
										});
									},
									error : function(XMLHttpRequest, textStatus) {
										alert("系统繁忙,请稍候再试!");
									}
								});

						}
					acasel.appendChild(opt3);
				
				});
			},
			error : function(XMLHttpRequest, textStatus) {
				alert("系统繁忙,请稍候再试!");
			}
		});
	}
</script>
</head>
<body>


	<div class="easyui-tabs" fit="true">
		<!-- <div style="display:none"> -->
		<!-- <table id="tt" class="easyui-datagrid"> -->
		<table id="tt" class="easyui-datagrid" iconCls="icon-save"
			pagination="true" style="height: 90%"></table>
		<!-- </table> -->
	</div>
	<div id="toolbar">
		<a href="#" id="add" class="easyui-linkbutton" iconCls="icon-wj"
			plain="true"">
			<label>添加</label>
		</a> 
		<a href="#" class="easyui-linkbutton"
			iconCls="icon-scnr" plain="true" onclick="Add()">
			<label> 删 除 </label> 
		</a> 
		<a
			href="#" class="easyui-linkbutton" iconCls="icon-wjxg" plain="true"
			onclick="destroyUser()">
			<label>Edit User</label>
		</a>
	</div>

	<!-- 添加学生--------------------------------------------------------------------------------------- -->
	<div id="add_dlg" class="easyui-dialog" title="添加学生"
		style="width: 80%; height: 450px; max-width: 850px; padding: 2px; display: none;"
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
						$('#add_dlg').dialog('close');  //关闭添加窗口
						
					}
				}]
			">
		<center>
			<form name="add_form" action="Save_ck">

				<%-- <table border="0">
					<tr>
						<td ><label class="la">姓名：</label></td>
						<td colspan="3"><input type="text" name="student.s_name" class="ct" /></td>
					</tr>
					<tr>
						<td ><label class="la">身份证：</label></td>
						<td colspan="3"><input type="text" name="student.id_number" class="ct" /></td>
					</tr>

					<tr>
						<td><label class="la">联系电话：</label></td>
						<td colspan="3"><input type="text" name="student.s_phone" class="ct" /></td>
					</tr>
					<tr>

						<td><label class="la">推荐老师：</label></td>
						<td><select  name="student.emp_id" id="empt">
						</select></td>
						
					</tr>
					<tr>
						<td><label class="la">报考类型：</label></td>
						<td ><select class="xl" name="student.s_gradations">
								<option value="" title="">--请选择--</option>
								<option value="高升专">高升专</option>
								<option value="专升本">专升本</option>
								<option value="直达本">直达本</option>

						</select><br /></td>
					</tr>

					<tr>
						<td><label class="t">院校/专业：</label></td>
						<td><select id="academy" name="student.academy_id"
							onchange="getMajor(value)"></select> <select id="major"
							name="student.maj_id"></select></td>
					</tr>
					<tr><td><label class="la">报名时间：</label></td>
					<td><input class="easyui-datetimebox" name="student.s_date"
   					 data-options="required:true,showSeconds:false" value="3/4/2010 2:3" style="width:150px"></td></tr>

				</table> --%>
				
				<p>
					<label class="la">姓名：</label>
					<input type="text" name="student.s_name" class="ct" />
				</p>
				<p>
					<label class="la">身份证：</label>
					<input type="text" name="student.id_number" class="ct" />
				</p>
				<p>
					<label class="la">联系电话：</label>
					<input type="text" name="student.s_phone" class="ct" />
				</p>
				<p>
					<label class="la">推荐老师：</label>
					<select  name="student.emp_id" id="empt" class="xl" >
					</select>
				</p>
				<p>
					<label class="la">报考类型：</label>
					<select class="xl" name="student.s_gradations">
						<option value="" title="">--请选择--</option>
						<option value="高升专">高升专</option>
						<option value="专升本">专升本</option>
						<option value="直达本">直达本</option>
					</select>
				</p>
				<p>
					<label class="la">院校/专业：</label>
					<select id="academy" name="student.academy_id"
							onchange="getMajor(value)" class="xl"></select> 
					<select id="major" name="student.maj_id" class="xl"></select>
				</p>
				<p>
					<label class="la">报名时间：</label>
					<input class="easyui-datetimebox" name="student.s_date"
   					 data-options="required:true,showSeconds:false" value="3/4/2010 2:3" style="width:350px;height:35px;">
				</p>
			</form>
		</center>
	</div>
	
	<!-- 修改学生--------------------------------------------------------------------------------------- -->
	<div id="upd_dlg" class="easyui-dialog" title="修改学生"
		style="width: 80%; height: 450px; max-width: 850px; padding: 2px; display: none;"
		data-options="
				closed:true,
				buttons: [{
					text:'修改',
					iconCls:'icon-save',
					handler:function(){
						alert('修改成功！');
						document.upd_form.submit();   //提交添加form表单
						
					}
				},{
					text:'取消',
					iconCls:'icon-no',
					handler:function(){
						$('#upd_dlg').dialog('close');  //关闭添加窗口
						
					}
				}]
			">
		<center>
			<form name="upd_form" action="Update_ck">

				<%-- <table border="0">
					<tr>
						<td ><label class="la">姓名：</label></td>
						<td colspan="3"><input type="text" name="student.s_name" id="s_name" class="ct" /></td>
					</tr>
					<tr>
						<td ><label class="la">身份证：</label></td>
						<td colspan="3"><input type="text" name="student.id_number" id="id_number" class="ct" /></td>
					</tr>

					<tr>
						<td><label class="la">联系电话：</label></td>
						<td colspan="3"><input type="text" name="student.s_phone" id="s_phone" class="ct" /></td>
					</tr>
					<tr>

						<td><label class="la">推荐老师：</label></td>
						<td><select  name="student.emp_id" id="empt2">
						</select></td>
						
					</tr>
					<tr>
						<td><label class="la">报考类型：</label></td>
						<td ><select class="xl" name="student.s_gradations" id="s_gradations">
								<option value="" title="">--请选择--</option>
								<option value="高升专">高升专</option>
								<option value="专升本">专升本</option>
								<option value="直达本">直达本</option>

						</select><br /></td>
					</tr>

					<tr>
						<td><label class="t">院校/专业：</label></td>
						<td><select name="student.academy_id" id="academy_id"
							onchange="getMajor2(value)"></select> <select id="major_id"
							name="student.maj_id"></select></td>
					</tr>
					<tr><td><label class="la">报名时间：</label></td>
					<td><input class="easyui-datetimebox" name="student.s_date" id="s_date"
   					 data-options="required:true,showSeconds:false" value="3/4/2010 2:3" style="width:150px"></td></tr>
					
					<input type="hidden" id="stuid" name="student.s_id"/>
				</table> --%>
				
				<p>
					<label class="la">姓名：</label>
					<input type="text" name="student.s_name" id="s_name" class="ct" />
				</p>
				<p>
					<label class="la">身份证：</label>
					<input type="text" name="student.id_number" id="id_number" class="ct" />
				</p>
				<p>
					<label class="la">联系电话：</label>
					<input type="text" name="student.s_phone" id="s_phone" class="ct" />
				</p>
				<p>
					<label class="la">推荐老师：</label>
					<select  name="student.emp_id" id="empt2" class="xl">
					</select>
				</p>
				<p>
					<label class="la">报考类型：</label>
					<select class="xl" name="student.s_gradations" id="s_gradations">
						<option value="" title="">--请选择--</option>
						<option value="高升专">高升专</option>
						<option value="专升本">专升本</option>
						<option value="直达本">直达本</option>
					</select>
				</p>
				<p>
					<label class="la">院校/专业：</label>
					<select name="student.academy_id" id="academy_id"
						class="xl" onchange="getMajor2(value)"></select> 
					<select id="major_id" class="xl" name="student.maj_id"></select>
				</p>
				<p>
					<label class="la">报名时间：</label>
					<input class="easyui-datetimebox" name="student.s_date" id="s_date"
   					 data-options="required:true,showSeconds:false" value="3/4/2010 2:3" style="width:350px;height:35px;">
				</p>
				<p>
					
					<input type="hidden" id="stuid" name="student.s_id"/>
				</p>
				
			</form>
		</center>
	</div>
</body>
</html>