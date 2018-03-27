<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%request.setCharacterEncoding("UTF-8"); %>
<title>专业管理</title>
<script type="text/javascript" src="js/jquery-easyui-1.5.2/jquery.min.js"></script>
<link id="easyuiTheme" rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5.2/themes/gray/easyui.css" />
<link id="easyuiTheme" rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5.2/themes/icon.css" />
<script type="text/javascript" src="js/jquery-easyui-1.5.2/jquery.easyui.min.js" charset="utf-8"></script>
<script type="text/javascript" src="js/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js" charset="utf-8"></script>

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
	$(function(){
		$("#cc").datagrid({
			url:"Academy_list",
			striped : true,
			idField : "id",
			pagination : true,
			pageSize : 20,
			pageList : [10, 20, 30, 40],
			fitColumns : true,
			sortName : "id",
			sortOrder : "desc",
			onLoadSuccess:function(data){
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
			columns : [[   
					{field : "ck", checkbox : true, title : "修改", width : 70, sortable : true},
					{field : "a_id",   title : "编号", width : 70, sortable : true},
					{field : "a_school", title : "学院名称", width : 70, sortable : true,
						formatter:function(value,row){  
				        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
				        		return content;  
				        }
					},
					{field : "a_major",  title : "专业", width : 70, sortable : true,
						formatter:function(value,row){  
				        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
				        		return content;  
				        }
					},
					{field : "cz",  title : "操作", formatter : delectId , width : 50, sortable : true,align:center},
					
					
			     ]],

			    
			
		});
		
		$('#tj').click(function(){
			alert("555");
		
			});

	});
	
	function doRow(){
		alert("ttt");
		var row = $('#cc').datagrid('getSelected');
		if (row){
			alert('ID:'+row.a_id+" 学校名称:"+row.a_school);
		}
		
	}
	
	/*-------------------------------------------------------------------------------*/
	function delectId(val,row,index){
		
		return '&nbsp;&nbsp;<a href="#" class="notice-easyui-linkbutton-edit" data-options="plain:true,iconCls:\'icon-wjxg\'" onclick="editUser('+index+')">编辑</a>'
		+'&nbsp;&nbsp;<a href="#" class="notice-easyui-linkbutton-del" data-options="plain:true,iconCls:\'icon-scnr\'" onclick="delect('+index+')">删除</a>';
	
		
		
	}
	
	function editUser(index){		//修改方法
		 $('#cc').datagrid('selectRow',index);// 关键在这里
			var row = $('#cc').datagrid('getSelected');
		 $('#xymc').val(row.a_school);
		 $('#zy').val(row.a_major);
		 $('#bzw').val(row.a_flag);
		 $('#hid').val(row.a_id);
			
		$('#dlg').dialog('open')
		
	}
	
	function delect(index){		//删除方法
		$('#cc').datagrid('selectRow',index);// 关键在这里
		var row = $('#cc').datagrid('getSelected');
		alert('确认删除该专业信息?');
		var a_id = row.a_id;
		window.location.href ="Delete_Academy.action?a_id="+a_id;
	}
	
	/*--------------------------点击按钮取值--------------------------------*/
	function getSelected(){
		var row = $('#cc').datagrid('getSelected');
		if (row){
			alert('ID:'+row.a_id+" 学校名称:"+row.a_school);
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



<div id="center" data-options="region:'center',split:true"  style="padding:5px;background:#eee">
	<div class="easyui-layout" data-options="fit:true">  
		<div  data-options="region:'north',title:'表格信息' " style="height:60px" >
			<a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-wj'"  onclick="Add()">
				<label>增加</label>
			</a>
		</div>
		
		<div data-options="region:'center'" >
			<div class="easyui-tabs" fit="true" style="height:250px,width:300px" >
				<div>
					<table id="cc" class="easyui-datagrid" pagination="true"></table>
				</div>
			</div>
		</div>
		
		
	</div>

</div>
	

<div id="dlg" class="easyui-dialog" title="修改"
		style="width: 80%; height: 300px; max-width: 700px; padding: 2px; display: none;"
		data-options="
				closed:true,
				buttons: [{
					text:'保存',
					iconCls:'icon-save',
					handler:function(){
						alert('修改成功！');
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
		<form name="edit_form" action="Edit_academy">
		<!-- <table>
			<tr>
				<td><label class="la">学院名称：</label></td>
				<td><input type="text" id="xymc"  name="school.a_school" class="ct" /></td>
			</tr>
			<tr>
				<td><label class="la">专业：</label></td>
				<td><input type="text" id="zy"  name="school.a_major"  class="ct" /></td>
			</tr>
			<tr>
				<td><label class="la">标志位：</label></td>
				<td><input type="text" id="bzw"  name="school.a_flag"   class="ct" /></td>
			</tr>
			<tr>
				隐藏域保存ID主键
				<td><input type="hidden" id="hid"  name="school.a_id"  class="ct" /></td>
			</tr>
		</table> -->
		<p>
					<h1>修改</h1>
				</p>
				<p>
					<br />
				</p>
				<p>
					<label class="la">学院名称：</label>
					<input type="text" id="xymc" name="school.a_school" class="ct" />
				</p>
				<p>
					<label class="la">&nbsp;专 业 ：</label>
					<input type="text" id="zy" name="school.a_major" class="ct" />
				</p>
				<p>
					<label class="la"> 标 志 位：</label>
					<input type="text" id="bzw" name="school.a_flag" class="ct" />
				</p>
				<p>
					<input type="hidden" id="hid" name="school.a_id" class="ct" />
				</p>
		</form>
		</center>
	</div>
	
	<!-- -----添加窗口----------------------------------------------------------------------------------------- -->
	
	<div id="add_dlg" class="easyui-dialog" title="添加院校"
		style="width: 80%; height: 300px; max-width: 700px; padding: 2px; display: none;"
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
		<form name="add_form" action="Save_academy">
		<!-- <table>
			<tr>
				<td><label class="la">学院名称：</label></td>
				<td><input type="text"  name="school.a_school" class="ct" /></td>
			</tr>
			<tr>
				<td><label class="la">专业：</label></td>
				<td><input type="text"  name="school.a_major"  class="ct" /></td>
			</tr>
			<tr>
				<td><label class="la">标志位：</label></td>
				<td><input type="text"   name="school.a_flag"   class="ct" /></td>
			</tr>
			
		</table> -->
		<p>
					<h1>新增院校/专业</h1>
				</p>
				<p>
					<br />
				</p>
				<p>
					<label class="la">学院名称：</label>
					<input type="text" name="school.a_school" class="ct" />
				</p>
				<p>
					<label class="la">&nbsp;专 业 ：</label>
					<input type="text" name="school.a_major" class="ct" />
				</p>
				<p>
					<label class="la"> 标 志 位：</label>
					<input type="text" name="school.a_flag" class="ct" />
				</p>
		</form>
		</center>
	</div>

</body>
</html>