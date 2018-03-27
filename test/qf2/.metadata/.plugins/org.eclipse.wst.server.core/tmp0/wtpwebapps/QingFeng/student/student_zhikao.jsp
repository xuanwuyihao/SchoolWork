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
	
<style type="text/css">
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
	$(document).ready(function() {
		$("#tt").datagrid({
			url : 'ListStudent2',
			striped : true,
			rownumbers : true,
			idField : "id",
			pagination : true,
			pageSize : 10,
			pageList : [ 10, 20, 30, 40 ],
			fitColumns : true,
			ShowHeader : true,

			BorderWidth : true,

			sortName : "r_id",
			toolbar : "#toolbar",
			sortOrder : 'desc',
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
					field : 's_id',
					title : '学生编号',
					width : 200,
					sortable : true
				},
				{
					field : 's_name',
					title : '学生姓名',
					width : 200,
					sortable : true,
					formatter:function(value,row){  
			        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
			        		return content;  
			        }
				},
				{
					field : 's_teacher',
					title : '老师姓名',
					width : 200,
					sortable : true,
					formatter:function(value,row){  
			        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
			        		return content;  
			        }
				},
				{
					field : 's_phone',
					title : '手机号码',
					width : 200,
					sortable : true,
					formatter:function(value,row){  
			        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
			        		return content;  
			        }
				},
				{
					field : 's_type',
					title : '报名类型',
					width : 200,
					sortable : true,
					formatter : function(value, row,index) {
						if (value == 2) {
							return '艺考';
						} else {
							return '';
						}

					}
				},
				{
					field : 's_content',
					title : '学习内容',
					width : 200,
					sortable : true,
					formatter:function(value,row){  
			        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
			        		return content;  
			        }
				},
				{
					field : 's_date',
					title : '报名日期',
					width : 200,
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
					width : $(this).width() * 0.1,

					formatter : function(value, row,index) {

						var str = '<a href="#" name="opera" onclick="editUser('
									+ index
									+ ')" id="xg" class="easyui-linkbutton" ></a>';
						var ss = '<a href="#" name="oo" onclick="editUsers('
									+ index
									+ ')" class="easyui-linkbutton" ></a>';
						return str + ss;
					}
				}, ] ]

			});
		});

	function editUsers(index) {

		$('#tt').datagrid('selectRow', index);// 关键在这里
		var row = $('#tt').datagrid('getSelected');
		//alert('ID:'+row.r_id+" 学校名称:"+row.a_school);
		//alert(row.s_id);
		window.location.href = "StudentDelete.action?s_id=" + row.s_id;
	}
	function editUser(index) {

		$('#tt').datagrid('selectRow', index);// 关键在这里
		var row = $('#tt').datagrid('getSelected');
		//alert('ID:'+row.r_id+" 学校名称:"+row.a_school);
		//alert(row.s_phone);
		//swindow.location.href="NoticeDel.action?n_id="+row.n_id;

		$("#s_id").val(row.s_id);
		$("#s_date").val(row.s_date);
		$("#s_name").val(row.s_name);
		$("#s_phone").val(row.s_phone);
		$("#s_content").val(row.s_content);

		$.ajax({
			cache : true,
			async : true,
			url : 'Zhikao_UserAndList',
			type : 'post',
			dataType : 'json',
			success : function(data) {
				$.each(data, function(index, content) {
					$("#sers").append(
							"<option value='" + content.emp_id + "'>"
									+ content.emp_name + "</option>");
				});

			},
			error : function() {
				alert('服务繁忙！');
			}
		});

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

	}

	//增加
	function zhikaoadd() {
		//对话框显示
		$('#dd2').dialog({
			title : ' 新 增 ',
			width : 650,
			height : 350,
			closed : false,
			cache : false,
			//href: 'get_content.php',
			modal : true
		});

	}

	$(document).ready(
			function() {

				//给下拉框赋值
				$("#add").click(
						function() {
							alert("pppppppp");
							$.ajax({
								cache : true,
								async : true,
								url : 'Zhikao_UserAndList',
								type : 'post',
								dataType : 'json',
								success : function(data) {

									$.each(data, function(index, content) {
										$("#tea").append(
												"<option value='" + content.emp_id + "'>"
														+ content.emp_name
														+ "</option>");
									});
								},
								error : function() {
									alert('服务繁忙！');
								}
							});
						});

			});
</script>


</head>
<body>

	<div id="dd" class="easyui-dialog" title="添加"
	style="width: 80%; height: 400px; max-width: 600px; padding: 2px; display: none;"
		data-options="
				closed:true,
				buttons: [{
					text:'添加',
					iconCls:'icon-save',
					handler:function(){
						 document.getElementById('add_form').submit(); 
					//	window.location.href='student_zhikao.jsp';
						
					}
				},{
					text:'取消',
					iconCls:'icon-no',
					handler:function(){
						$('#dd').dialog('close');  //关闭添加窗口
						
					}
				}]">
		<form action="StudentUpdate" method="post" id="add_form">
			<!-- <from action="Finance_save"  method="post"> -->
			<!-- <table align="center">

				<input type="text" id="s_id" name="student.s_id"
					style="display: none">
				<input type="text" id="s_type" value="2" name="student.s_type"
					style="display: none">
				<tr>
					<td>学生姓名</td>
					<td><input type="text" id="s_name" name="student.s_name"></td>
				</tr>
				<tr>
					<td>老师姓名</td>
					<td>
						<input type="text" id="s_teacher" name="student.emp_id">
						<select name="student.emp_id" runat="server" id="sers"></select>
					</td>
				</tr>
				<tr>
					<td>手机号码</td>
					<td><input type="text" id="s_phone" name="student.s_phone"></td>
				</tr>
				<tr>
					<td>学习内容</td>
					<td><input type="text" id="s_content" name="student.s_content"></td>
				</tr>
				<tr>
					<td>时间</td>
					<td><input type="text" id="s_date" name="student.s_date"></td>
				</tr>
			</table> -->
			<p>
				<input type="text" id="s_id" name="student.s_id"
					style="display: none">
				<input type="text" id="s_type" value="2" name="student.s_type"
					style="display: none">
			</p>
			<p>
				<label class="la">学生姓名</label>
				<input type="text" class="ct" id="s_name" name="student.s_name">
			</p>
			<p>
				<label class="la">老师姓名</label>
				<select name="student.emp_id" runat="server" class="xl" id="sers"></select>
			</p>
			<p>
				<label class="la">手机号码</label>
				<input type="text" class="ct" id="s_phone" name="student.s_phone">
			</p>
			<p>
				<label class="la">学习内容</label>
				<input type="text" class="ct" id="s_content" name="student.s_content">
			</p>
			<p>
				<label class="la">时间</label>
				<input type="text" class="ct" id="s_date" name="student.s_date">
			</p>
			<!-- </from> -->
		</form>
	</div>


	<!-- 添加 -->
	<div id="dd2" class="easyui-dialog" title="添加"
	style="width: 80%; height: 400px; max-width: 600px; padding: 2px; display: none;"
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
		<form action="Student_Save" method="post" id="add_forms">
			<!-- <from action="Finance_save"  method="post"> -->
			<!-- <table align="center">
				<input type="text" id="s_name" value="2" name="student.s_type"
					style="display: none">
				<tr>
					<td>学生姓名</td>
					<td><input type="text" id="s_name" name="student.s_name"></td>
				</tr>
				<tr>
					<td>身份证号</td>
					<td><input type="text" id="s_teacher" name="student.id_number"></td>
				</tr>
				<tr>
					<td>老师姓名</td>
					<td><select name="student.emp_id" runat="server" id="tea">
							<option value="1">涂梅城</option>
							<option value="2">jhg</option>
							<option value="3">方法</option>
					</select></td>
				</tr>
				<tr>
					<td>手机号码</td>
					<td><input type="text" id="s_phone" name="student.s_phone"></td>
				</tr>
				<tr>
					<td>学习内容</td>
					<td><input type="text" id="s_content" name="student.s_content"></td>
				</tr>
			</table> -->
			<p>
				<input type="text" id="s_name" class="ct" value="2" name="student.s_type"
					style="display: none">
			</p>
			<p>
				<label class="la">学生姓名</label>
				<input type="text" id="s_name" class="ct" name="student.s_name">
			</p>
			<p>
				<label class="la">身份证号</label>
				<input type="text" id="s_teacher" class="ct" name="student.id_number">
			</p>
			<p>
				<label class="la">老师姓名</label>
				<select name="student.emp_id" runat="server" class="xl" id="tea">
							<!-- <option value="1">涂梅城</option> -->
							<!-- <option value="2">jhg</option> -->
							<!-- <option value="3">方法</option> -->
				</select>
			</p>
			<p>
				<label class="la">手机号码</label>
				<input type="text" class="ct" id="s_phone" name="student.s_phone">
			</p>
			<p>
				<label class="la">学习内容</label>
				<input type="text" class="ct" id="s_content" name="student.s_content">
			</p>
			<!-- </from> -->
		</form>
	</div>

	<div class="easyui-tabs" fit="true">
		<div style="display: none">
			<!-- <table id="tt" class="easyui-datagrid">  -->

			<table id="tt" class="easyui-datagrid" iconCls="icon-save"
				pagination="true"></table>
			<!-- </table> -->
		</div>
	</div>


	<div id="toolbar">
		<a href="#" id="add" class="easyui-linkbutton" iconCls="icon-wj"
			plain="true" onclick="zhikaoadd();">
			<label>增加</label>
		</a>
	</div>

</body>
</html>