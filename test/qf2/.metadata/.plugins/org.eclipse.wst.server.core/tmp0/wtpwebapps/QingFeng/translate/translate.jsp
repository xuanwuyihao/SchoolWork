<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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

<style>
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
</style>

<script type="text/javascript">
	$(document)
			.ready(
					function() {
						$("#tt")
								.datagrid(
										{
											url : 'TranslateList',
											striped : true,
											idField : "T_id",
											pagination : true,
											pageSize : 10,
											pageList : [ 10, 20, 30, 40 ],
											// 		fitColumns : true,
											sortName : "T_id",
											toolbar : "#toolbar",
											sortOrder : 'desc',
											height : 500,
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
														field : 't_id',
														title : '编号',
														width : 200,
														sortable : true
													},
													{
														field : 't_name',
														title : '标题',
														width : 200,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 't_link',
														title : '链接',
														width : 200,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 't_date',
														title : '时间',
														width : 200,
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
														width : $(this).width() * 0.1,

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

	//获取地址栏参数
	function getUrlParam(key) {
		// 获取参数
		var url = window.location.search;
		// 正则筛选地址栏
		var reg = new RegExp("(^|&)" + key + "=([^&]*)(&|$)");
		// 匹配目标参数
		var result = url.substr(1).match(reg);
		//返回参数值
		return result ? decodeURIComponent(result[2]) : null;
	}

	function editUserss(index) {

		$('#tt').datagrid('selectRow', index);// 关键在这里
		var row = $('#tt').datagrid('getSelected');
		//alert('ID:'+row.r_id+" 学校名称:"+row.a_school);
		alert(row.t_date);

		$("#t_id").val(row.t_id);
		$("#t_name").val(row.t_name);
		$("#t_link").val(row.t_link);
		//$("#t_date").html(row.t_date);
		//document.getElementById("t_date").innerText=row.t_date;

		//对话框显示
		$('#dd').dialog({
			title : ' 修 改 ',
			width : 600,
			height : 300,
			closed : false,
			cache : false,
			//href: 'get_content.php',
			modal : true
		});

		//window.location.href="notice2.jsp?n_content="+row.n_content;
	}

	function editUser(index) {

		$('#tt').datagrid('selectRow', index);// 关键在这里
		var row = $('#tt').datagrid('getSelected');
		//alert('ID:'+row.r_id+" 学校名称:"+row.a_school);
		//alert(row.t_id);
		window.location.href = "TranslateDelete.action?t_id=" + row.t_id;

	}

	$(document).ready(function() {
		var vc = getUrlParam("t_id")

		if (vc != null) {
			window.location.href = "translate.jsp";
		}

		//添加
		$("#add").click(function() {

			//对话框显示
			$('#dd2').dialog({
				title : ' 添 加 ',
				width : 600,
				height : 300,
				closed : false,
				cache : false,
				//href: 'get_content.php',
				modal : true
			});

		});

	});
</script>
</head>
<body>

	<div id="dd" style="display: none"
		data-options="
				closed:true,
				buttons: [{
					text:'添加',
					iconCls:'icon-save',
					handler:function(){
						 document.getElementById('add_form').submit(); 
						 
						// window.location.href='translate.jsp';
					//	window.location.href='student_zhikao.jsp';
						
					}
				},{
					text:'取消',
					iconCls:'icon-no',
					handler:function(){
						$('#dd').dialog('close');  //关闭添加窗口
						
					}
				}]">
		<form action="TranslateUP" method="post" id="add_form">
			<!-- <from action="Finance_save"  method="post"> -->
			<!-- <table align="center">

				<input type="text" id="t_id" name="translate.t_id"
					style="display: none">

				<tr>
					<td>标题</td>
					<td><input type="text" id="t_name" name="translate.t_name"></td>
				</tr>

				<tr>
					<td>链接</td>
					<td><input type="text" id="t_link" name="translate.t_link"></td>
				</tr>

				<tr><td>时间</td><td>
				<input id="dd3" type="text" class="easyui-datebox" required="required" style="width: 170px" id="t_date" name="translate.t_date">
				</td></tr>
			</table> -->

			<!-- </from> -->
			
			<p>
				<input type="text" class="ct" id="t_id" name="translate.t_id"
					style="display: none">
				
			</p>
			<p>
				<label class="la">标题</label>
				<input type="text" class="ct" id="t_name" name="translate.t_name">
			</p>
			<p>
				<label class="la">链接</label>
				<input type="text" class="ct" id="t_link" name="translate.t_link">
			</p>
			<p>
				<label class="la">时间</label>
				<input id="dd3" type="text" class="easyui-datebox" required="required" style="width: 350px;height:35px;" id="t_date" name="translate.t_date">
			</p>
		</form>
	</div>


	<!-- 添加 -->
	<div id="dd2" style="display: none"
		data-options="
				closed:true,
				buttons: [{
					text:'添加',
					iconCls:'icon-save',
					handler:function(){
						
						
						
						 document.getElementById('add_forms').submit(); 
						//window.location.href='student_zhikao.jsp';
						
					}
				},{
					text:'取消',
					iconCls:'icon-no',
					handler:function(){
						$('#dd2').dialog('close');  //关闭添加窗口
						
					}
				}]">
		<form action="TranslateSave" method="post" id="add_forms">
			<!-- <from action="Finance_save"  method="post"> -->
			<!-- <table align="center">

				<tr>
					<td>标题</td>
					<td><input type="text" id="t_name" name="translate.t_name"></td>
				</tr>
				<tr>
					<td>链接</td>
					<td><input type="text" id="t_link" name="translate.t_link"></td>
				</tr>
				<input type="text" id="t_date" name="translate.t_date">
				<tr>
					<td>时间</td>
					<td><input id="dd3" type="text" class="easyui-datebox"
						required="required" style="width: 170px" name="translate.t_date">
					</td>
				</tr>

			</table> -->
			
			<p>
				<label class="la">标题</label>
				<input type="text" class="ct" id="t_name" name="translate.t_name">
			</p>
			<p>
				<label class="la">链接</label>
				<input type="text" class="ct" id="t_link" name="translate.t_link">
			</p>
			<p>
				<label class="la">时间</label>
				<input id="dd3" type="text" class="easyui-datebox"
						required="required" style="width: 350px;height:35px;" name="translate.t_date">
			</p>
			
			<!-- </from> -->
		</form>
	</div>



	<div class="easyui-tabs" fit="false">
		<div style="display: none">
			<table id="tt" class="easyui-datagrid">

				<!-- <table id="tt" class="easyui-datagrid" iconCls="icon-save" pagination="false"></table> -->
			</table>
		</div>
	</div>
	<div id="toolbar">
		<a href="#" id="add" class="easyui-linkbutton" iconCls="icon-wj"
			plain="true">
			<label>增加</label>
		</a> 
		<a href="#" class="easyui-linkbutton"
			iconCls="icon-scnr" plain="true" onclick="editUser()">
			<label>Remove User</label>
		</a> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-wjxg" plain="true"
			onclick="destroyUser()">
			<label>Edit User</label>
		</a>
	</div>
</body>
</html>