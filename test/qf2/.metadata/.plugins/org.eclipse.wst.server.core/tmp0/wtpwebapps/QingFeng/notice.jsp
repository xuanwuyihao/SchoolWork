<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript"
	src="js/jquery-easyui-1.5.2/jquery.min.js"></script>
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="js/jquery-easyui-1.5.2/themes/gray/easyui.css" />
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="js/jquery-easyui-1.5.2/themes/icon.css" />
<script type="text/javascript"
	src="js/jquery-easyui-1.5.2/jquery.easyui.min.js" charset="utf-8"></script>
<script type="text/javascript"
	src="js/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js"
	charset="utf-8"></script>
	
	
<style type="text/css">
.label{
	width: 150px;
	margin-top: 3px;
	display: inline-block;
	/* float: right; */
	padding: 3px;
	font-family: '楷体';
	font-size: 22px;
	/* color: aliceblue; */
	font-color: #000;
	float: left;
	left: 2%;
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

.t {
	width: 150px;
	margin-top: 3px;
	display: inline-block;
	/* float: right; */
	padding: 3px;
	font-family: '楷体';
	font-size: 22px;
	/* color: aliceblue; */
	font-color: #000;
	float: left;
	left: 2%;
}

.t:hover {
	/* font-color:red; */
	/* margin:50px auto 100px; */
	/* font-size: 26px; */
	-webkit-text-stroke-width: 2px;
	-webkit-text-stroke-color: red;
}

label{
	font-size:16px;
	font-family:'楷体';
	margin-left: 15px;
}
</style>

<script type="text/javascript">
	// $(function () {

	//     $('#win').window({
	//         onBeforeClose: function () { //当面板关闭之前触发的事件
	//             if (confirm('pppppppppp')) {
	//                 $('#win').window('close', true); //这里调用close 方法，true 表示面板被关闭的时候忽略onBeforeClose 回调函数。
	//                 window.location.href="notice.jsp";
	//             } else{
	//                 return false;
	//         }
	//         }
	//     });

	function lx(value, row, index) {
		$('#tt').datagrid('selectRow', index);// 关键在这里
		var row = $('#tt').datagrid('getSelected');

	}

	$(document).ready(function() {

		//关闭窗口
		$('#win').window('close');
		$('#winadd').window('close');
		$("#add").click(function() {

			//window.location.href="user.jsp";
			$('#winadd').window('open');
		});

	});

	$(document)
			.ready(
					function() {
						$("#tt")
								.datagrid(
										{
											url : 'NoticeSel',
											striped : true,
											idField : "id",
											pagination : true,
											pageSize : 10,
											pageList : [ 10, 20, 30, 40 ],
											// 		fitColumns : true,
											sortName : "r_id",
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
														field : 'n_id',
														title : '编号',
														width : 200,
														sortable : true
													},
													{
														field : 'n_title',
														title : '标题',
														width : 200,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 'n_content',
														title : '内容',
														width : 200,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 'n_date',
														title : '时间',
														width : 200,
														sortable : true,
														formatter:function(value,row){  
												        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
												        		return content;  
												        }
													},
													{
														field : 'n_flag',
														title : '类型',
														width : 200,
														sortable : true,
														formatter : function(
																value, row,
																index) {
															if (value == 0) {
																return '公告';
															} else {
																return '简章';
															}

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

						function delectId(val, row, index) {
							return '<a href="#" onclick="editUser(' + index
									+ ')">删除</a>';
						}

						function getParentId(id) {
							var arr = new Array();
							$
									.each(
											json,
											function(i, item) {
												if (item.Id == id
														&& item.ParentId != 0) {
													arr.push(item.ParentId);
													arr = arr
															.concat(getParentId(item.ParentId));
												}
											});
							return arr;
						}

					});

	function editUser(index) {

		$('#tt').datagrid('selectRow', index);// 关键在这里
		var row = $('#tt').datagrid('getSelected');
		//alert('ID:'+row.r_id+" 学校名称:"+row.a_school);
		alert(row.n_id);
		window.location.href = "NoticeDel.action?n_id=" + row.n_id;

	}

	function editUserss(index) {


function editUser(index){
	
	$('#tt').datagrid('selectRow',index);// 关键在这里s
	var row = $('#tt').datagrid('getSelected');
	//alert('ID:'+row.r_id+" 学校名称:"+row.a_school);
	//alert(row.n_id);
	window.location.href="NoticeDel.action?n_id="+row.n_id;
	
	
	
}

function editUser(index){
	
	$('#tt').datagrid('selectRow',index);// 关键在这里
	var row = $('#tt').datagrid('getSelected');
	//alert('ID:'+row.r_id+" 学校名称:"+row.a_school);
	alert(row.n_id);
	window.location.href="NoticeDel.action?n_id="+row.n_id;
	
	
	
}

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


		//对话框显示
		$('#dd').dialog({
			title : ' 修 改 ',
			width : 650,
			height : 470,
			closed : false,
			cache : false,
			//href: 'get_content.php',
			modal : true
		});

	}

	$(document).ready(function() {
		$("#add").click(function() {

			//对话框显示
			$('#dd2').dialog({
				title : ' 添 加 ',
				width : 650,
				height : 470,
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

	<!-- 修改 -->
	<div id="dd"
		style="width: 80%; height: 450px; max-width: 700px; padding: 2px; display: none;"
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
		<s:form action="NoticeUp" method="post" id="add_form">
			<%-- <table>
				<s:textfield id="n_id" name="notice.n_id" style="display: none"></s:textfield>
				<s:textfield id="n_title" name="notice.n_title" label="标题"
					value="%{#session.notice.n_title}"></s:textfield>
				<s:select list="#{'0':'公告', '1':'简章'}" id="n_flag"
					name="notice.n_flag" label="类型" value="%{#session.notice.n_flag}"></s:select>
				<s:textarea id="n_content" name="notice.n_content" label="内容"
					cols="40" rows="10" />
				<s:textfield id="n_date" name="notice.n_date"
					value="%{#session.notice.n_date}" style="display: none"></s:textfield>
			</table> --%>
			
			<p>
				<s:textfield id="n_id" name="notice.n_id" style="display: none"></s:textfield>
			</p>
			<p style="font-size:22px">
				<s:textfield id="n_title" name="notice.n_title" label="标题"
					value="%{#session.notice.n_title}" class="ct" style="width: 350px;
					height: 28px;font-size: 24px;font-family: '楷体';background: rgba(255, 255, 255, 0.5);
					border-radius: 5px;border: 0.5px solid #0492d6;" >
					<!-- <label class="t"></label> -->
				</s:textfield>
			</p>
			<p>
				<s:select list="#{'0':'公告', '1':'简章'}" id="n_flag" label="类型"
					name="notice.n_flag" value="%{#session.notice.n_flag}" class="xl" 
					style="border: 1;border-color: #233;padding: 0;margin: 0;width: 130px;height: 35px;
					font-family: '楷体';font-size: samller;" >
					<!-- <label class="t"></label> -->
				</s:select>
			</p>
			<p>
				<s:textarea id="n_content" name="notice.n_content" label="内容"
					cols="40" rows="10" class="cz" style="width: 95%; height: 230px; font-size: 24px;
					font-family:'楷体'; border-radius: 5px; border: 0.2; color: red; background-color: rgba(0, 0, 0, .05);
					font:'楷体';font-size:18px;" >
					<!-- <label class="t"></label> -->
				</s:textarea>
			</p>
			<p>
				<s:textfield id="n_date" name="notice.n_date" class="ct" label="时间"
					value="%{#session.notice.n_date}" style="width: 350px;
					height: 28px;font-size: 24px;font-family: '楷体';background: rgba(255, 255, 255, 0.5);
					border-radius: 5px;border: 0.5px solid #0492d6;" >
					<!-- <label class="t"></label> -->
				</s:textfield>
			</p>
		</s:form>
	</div>



	<!--增加  -->
	<div id="dd2"
	style="width: 80%; height: 450px; max-width: 700px; padding: 2px; display: none;"
		data-options="
				closed:true,
				buttons: [{
					text:'添加',
					iconCls:'icon-save',
					handler:function(){
						 document.getElementById('add_form2').submit(); 
					//	window.location.href='student_zhikao.jsp';
						
					}
				},{
					text:'取消',
					iconCls:'icon-no',
					handler:function(){
						$('#dd2').dialog('close');  //关闭添加窗口
						
					}
				}]">
		<s:form action="NoticeAdd" method="post" id="add_form2">
			<%-- <table>
				<s:textfield id="n_id" name="notice.n_id" style="display: none"></s:textfield>
				<s:textfield id="n_title" name="notice.n_title" label="标题"
					value="%{#session.notice.n_title}"></s:textfield>
				<s:select list="#{'0':'公告', '1':'简章'}" name="notice.n_flag"
					label="类型" value="%{#session.notice.n_flag}"></s:select>
				<s:textarea id="n_content" name="notice.n_content" label="内容"
					cols="40" rows="10" value="%{#session.notice.n_content}" />

			</table> --%>
			
			<p>
				<s:textfield id="n_id" name="notice.n_id" style="display: none"></s:textfield>
			</p>
			<p>
				<s:textfield id="n_title" name="notice.n_title" label="标题"
					value="%{#session.notice.n_title}" class="ct" style="width: 350px;
					height: 28px;font-size: 24px;font-family: '楷体';background: rgba(255, 255, 255, 0.5);
					border-radius: 5px;border: 0.5px solid #0492d6;" ></s:textfield>
			</p>
			<p>
				<s:select list="#{'0':'公告', '1':'简章'}" name="notice.n_flag"
					label="类型" value="%{#session.notice.n_flag}" class="xl"
					style="border: 1;border-color: #233;padding: 0;margin: 0;width: 130px;height: 35px;
					font-family: '楷体';font-size: samller;" ></s:select>
			</p>
			<p>
				<s:textarea id="n_content" name="notice.n_content" label="内容"
					cols="40" rows="10" value="%{#session.notice.n_content}" class="ct"
					 style="width: 95%; height: 230px; font-size: 24px;
					font-family:'楷体'; border-radius: 5px; border: 0.2; color: red; background-color: rgba(0, 0, 0, .05);
					font:'楷体';font-size:18px;"  />
			</p>
			<p>
				<%-- <s:textfield id="n_date" name="notice.n_date" class="ct"
					value="%{#session.notice.n_date}" style="display: none"></s:textfield> --%>
			</p>
			
		</s:form>
	</div>


<div class="easyui-tabs" fit="true">
<div style="display:none">
<!-- <table id="tt" class="easyui-datagrid"> -->
<table id="tt" class="easyui-datagrid" iconCls="icon-save" pagination="true" style="height:90%"></table>

<div class="easyui-tabs" fit="true">
<div style="display:none">
<!-- <table id="tt" class="easyui-datagrid"> -->
<table id="tt" class="easyui-datagrid" iconCls="icon-save" pagination="true"></table>

	<div class="easyui-tabs" fit="true">
		<div style="display: none">
			<!-- <table id="tt" class="easyui-datagrid"> -->
			<table id="tt" class="easyui-datagrid" iconCls="icon-save"
				pagination="true"></table>




			<!-- </table> -->
		</div>
	</div>
	<div id="toolbar">
		<a href="#" id="add" class="easyui-linkbutton" iconCls="icon-wj"
			plain="true""> 
			<label>增加</label>
		</a> 
		<a href="#" class="easyui-linkbutton"
			iconCls="icon-scnr" plain="true" onclick="editUser()">
			 <label> 删 除 </label>
		</a> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-wjxg" plain="true"
			onclick="destroyUser()">
			<label>Edit User</label>
		</a>
	</div>

</body>
</html>