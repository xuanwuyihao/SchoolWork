<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

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
	a {
	text-decoration: none;
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

h1 {
	margin:10px;
	font-size:25px;
	color:#F30;
	font-family:'楷体';
	letter-spacing:5px;
	font-weight:600;
}

label{
	font-size:16px;
	font-family:'楷体';
	margin-left: 15px;
}
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

<script type="text/javascript">
	$(document)
			.ready(
					function() {

						$("#tt")
								.datagrid(
										{
											url : 'Payment_list2',
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
											singleSelect: true,
											height:500,
											onLoadSuccess : function(data) {
												$("a[name='opera']")
														.linkbutton(
																{
																	text : '修改',
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
														title : '编号',
														width : 80,
														sortable : true
													},
													{
														field : 'stu_name',
														title : '姓名',
														width : 150,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
// 													{
// 														field : 'aca_name',
// 														title : '学校',
// 														width : 150,
// 														sortable : true
// 													},
// 													{
// 														field : 'maj_name',
// 														title : '专业',
// 														width : 150,
// 														sortable : true
// 													},
// 													{
// 														field : 's_gradations',
// 														title : '层次',
// 														width : 150,
// 														sortable : true
// 													},
													{
														field : 'emp_name',
														title : '合作人',
														width : 150,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 'practical_money',
														title : '本次缴费',
														width : 150,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 'need_money',
														title : '还需缴费',
														width : 150,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 'date',
														title : '缴费时间',
														width : 200,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 'f_way',
														title : '支付方式',
														width : 150,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 'f_accumulative',
														title : '累计金额',
														width : 150,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 'pay_state',
														title : '缴费状态',
														width : 100,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 's_type',
														title : '报考类型',
														width : 150,
														sortable : true,
														formatter : function(
																value, row,
																index) {
															if (value == 0) {
																return '公告';
															} else {
																return '简章';
															}

														},

														field : 'operate',
														field : 'operate',
														title : '操作',
														align : 'center',
														width : 250,

														formatter : function(
																value, row,
																index) {

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
		//选择完学生后打开填写缴费窗口
		$("#addss").click(function() {
		//	alert("sds");
			$('#dd').dialog({
				title : '缴费记录填写',
				width : 600,
				height : 300,
				closed : false,
				cache : false,
				//href: 'get_content.php',
				modal : true
			});
			//$('#dd').dialog('refresh', 'new_content.php');
		});
		/*=================================================================================*/

		//打开选择缴费学生窗口 
		$("#add").click(function() {
		//	alert("ppppppppp");
			$("#tt2").datagrid({
				url : 'Finance_list2',
				striped : true,
				rownumbers : true,
				idField : "s_id",
				pagination : true,
				pageSize : 10,
				pageList : [ 10, 20, 30, 40 ],
				fitColumns : true,
				sortName : "s__id",

				sortOrder : 'desc',
				singleSelect: true,
				
				columns : [ [
								{
									field : 'f_way',
									title : '学号',
									width : 80,
									sortable : true
								},
								{
									field : 'stu_name',
									title : '姓名',
									width : 150,
									sortable : true
								},
// 								{
// 									field : 'aca_name',
// 									title : '学校',
// 									width : 150,
// 									sortable : true
// 								},
// 								{
// 									field : 'maj_name',
// 									title : '专业',
// 									width : 150,
// 									sortable : true
// 								},
// 								{
// 									field : 's_gradations',
// 									title : '层次',
// 									width : 150,
// 									sortable : true
// 								},
								{
									field : 'emp_name',
									title : '合作人',
									width : 150,
									sortable : true
								},
								{
									field : 'date',
									title : '报名时间',
									width : 150,
									sortable : true
								},
								{
									field : 'need_money',
									title : '还需缴费',
									width : 150,
									sortable : true
								},
								{
									field : 'pay_state',
									title : '缴费状态',
									width : 100,
									sortable : true
								},
								 ] ]
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

		});

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

	function editUser(index) {     //删除

		$('#tt').datagrid('selectRow', index);// 关键在这里
		var row = $('#tt').datagrid('getSelected');
	//	alert(" 学校名称:"+row.aca_name);
		//alert(row.n_id);
		//window.location.href = "NoticeDel.action?n_id=" + row.n_id;
	}

	function editUserss(index) {       //修改

		$('#tt').datagrid('selectRow', index);// 关键在这里
		var row = $('#tt').datagrid('getSelected');
		//alert('ID:'+row.r_id+" 学校名称:"+row.a_school);
		//alert(row.n_id);
		$("#n_id").val(row.n_id);
		$("#n_title").val(row.n_title);
		$("#n_date").val(row.n_date);
		$("#n_flag").val(row.n_flag);
		$("#n_content").val(row.n_content);
		$('#win').window('open');
		//window.location.href="notice2.jsp?n_content="+row.n_content;
	}
	function ttion() {

		
		document.getElementById("alers").submit();
	//	alert("oooooo");
		
	
		
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
					
						$('#stu_no').html(row.f_way); 
						$('#s_name').html(row.stu_name);
						$('#p_money').html(row.need_money);
						$('#emp_name').html(row.emp_name);
						$('#pay_state').html(row.pay_state);
						$('#stu_id').val(row.f_way);
					
						$('#dd2').dialog('close')  //关闭选择学生窗口窗口
						//打开完善缴费表
						wsjl();
						 
					}
				},{
					text:'取消',
					iconCls:'icon-no',
					handler:function(){
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
			pagination="true" style="height: 90%"></table>
		<!-- </table> -->
	</div>
	</div>
	<div id="toolbar">
		<a href="#" id="add" class="easyui-linkbutton" iconCls="icon-wj"
			plain="true"">
			<label>增加缴费记录</label>
		</a> 
		<a href="#" class="easyui-linkbutton"
			iconCls="icon-scnr" plain="true" onclick="editUser()">
			<label>Edit User</label>
		</a> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-scnr" plain="true"
			onclick="destroyUser()">
			<label>Remove User</label>
		</a>
	</div>

	<!-- ======================================================================================================= -->

	<div id="dd" style="display: none"
		data-options="
				closed:true,
				buttons: [{
					text:'提交',
					iconCls:'icon-save',
					handler:function(){      //提交缴费表单
						//alert('添加成功！');
						document.saveform.submit();
						
					}
				},{
					text:'取消',
					iconCls:'icon-no',
					handler:function(){
						$('#dd').dialog('close');  //关闭添加窗口
						
					}
				}]">
		<s:form action="Save_payment2" name="saveform" method="post">
			<table align="center">
				<tr>
					<td>学生学号:</td>
					<td><label id="stu_no"></label></td> <label></label>
					</tr><tr>
					<td>学生姓名：</td>
					<td> <label id="s_name"></label></td>
				</tr>
				<tr>
					<td>缴费状态：</td>
					<td> <label id="pay_state"></label></td>
				</tr>

				<tr>
					<td>还需缴费:</td>
					<td> <label id="p_money" ></label></td>
					</tr><tr>
					<td>合作人:</td>
					<td> <label id="emp_name" ></label></td>
				</tr>

				<tr>
					<td>本次缴费金额:</td>
					<td><input type="text" id="p_amount"
						name="payment.p_money"></td>
				</tr>
				<tr>
					<td>缴费时间:</td>
					<td><input class="easyui-datetimebox" name="birthday"
   					 data-options="required:true,showSeconds:false" value="3/4/2010 2:3" style="width:150px"></td>
				</tr>
				<tr>
					<td>缴费方式:</td>
					<td><select name="payment.pay_pattern">
							<option value="支付宝">支付宝</option>
							<option value="微信">微信</option>
							<option value="银行转账">银行转账</option>
							<option value="现金">现金</option>
					</select></td>
					
				</tr>
				
					<!-- 隐藏域保存id -->
					<tr><td><input type="hidden" id="stu_id" name="payment.s_id"/></td></tr>
			
			</table>

		</s:form>
	</div>
</body>
</html>