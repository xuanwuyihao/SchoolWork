2017-08-23 10:41:20

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
$(document).ready(function(){
	
	//关闭窗口
	$('#win').window('close');
	$('#winadd').window('close');
	$("#adds").click(function(){
		
		//window.location.href="user.jsp";
		$('#winadd').window('open'); 
	});
	
	$("form").submit(function(e){
		  alert("Submitted");
		});
	
	
	
	
// 	var p = $('#cc').datagrid('getPager');
// 	$(p)
// 	.pagination(
// 	{
// 	pageSize : 10,// 每页显示的记录条数，默认为10
// 	pageList : [ 10, 15, 20, 25, 30 ],// 可以设置每页记录条数的列表
// 	beforePageText : '跳到',// 页数文本框前显示的汉字
// 	afterPageText : '页 <input type="button" value="go" onclick="enterClick()"> 共 {pages} 页',
// 	displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
// 	});
	
	
// 	$("#cc").pagination({
//         pageSize:defaultPageSize, //每页显示的记录条数，默认为10
//         pageList:[5, 10, 15], //可以设置每页记录条数的列表
//         beforePageText:'第', //页数文本框前显示的汉字
//         afterPageText:'页    共 {pages} 页',
//         displayMsg:'当前显示 {from} - {to} 条记录   共 {total} 条记录',
//         showRefresh:false,
//         onSelectPage:function(pageNumber,pageSize){
//         	queryList();
        	
//         }
//     });
	
});




	$(function(){
		$("#cc").datagrid({
			url:"Relation",
			striped : true,
			rownumbers: true,
			idField : "id",
			pagination : true,
			pageSize : 5,
			pageList : [5, 20, 30, 40],
			fitColumns : true,
			toolbar:"#toolbar",
			sortName : "id",
			sortOrder : "desc",
			onLoadSuccess:function(data){    
		        $("a[name='opera']").linkbutton({text:'修改',plain:true,iconCls:'icon-edit'});
		        $("a[name='oo']").linkbutton({text:'删除',plain:true,iconCls:'icon-remove'});  
		}, 
			columns : [[  		


					{field : "r_id", title : "	编号", width : 70, sortable : true},
					{field : "r_qq",   title : "QQ号码", width : 70, sortable : true},
					{field : "r_phone", title : "电话	", width : 70, sortable : true},
					{field : "r_content",  title : "姓名", width : 70, sortable : true},
					{field : "r_effect",  title : "标志位", width : 70, sortable : true,
					formatter:function(value, row, index){ 
						if(value==1){
							return '成考';
						}else if(value==2){
							return '远程';
						}else if(value==3){
							return '财务';
						}else{
							return '学籍';		
						}
					}	
					},
					
					{
						field:'operate',title:'操作',align:'center', width:$(this).width()*0.1,  

						formatter:function(value, row, index){ 
							
					        var str = '<a href="#" name="opera" onclick="editUsersss('+index+')" class="easyui-linkbutton" ></a>';  
					        var ss = '<a href="#" name="oo" onclick="editUser('+index+')" class="easyui-linkbutton" ></a>';
					        return str+ss;
					}
					},

			     ]],


			    
			
		});
		
		$('#tj').click(function(){
			$("#r_qq").val();
			$("#r_phone").val();
			$("#r_content").val();
		
			});

		
		
		
		
		

	});
//添加
	
		
		
		
		
		
	

	
	
	
	
	function editUser(index){
		$('#cc').datagrid('selectRow',index);// 关键在这里
		var row = $('#cc').datagrid('getSelected');
		//alert('ID:'+row.r_id+" 学校名称:"+row.a_school);
		
		window.location.href="Relations.action?r_id="+row.r_id;
	}
	
	
	
	 function editUsersss(index){
		$('#cc').datagrid('selectRow',index);// 关键在这里
		var row = $('#cc').datagrid('getSelected');
// 		alert('ID:'+row.r_id+" 学校名称:"+row.a_school);
		$("#r_id").val(row.r_id);
		$("#r_qq").val(row.r_qq);
		$("#r_phone").val(row.r_phone);
		$("#r_content").val(row.r_content);
		$("#r_effect").val(row.r_effect);
		$('#win').window('open'); // open a window
		//window.location.href="RelationSel.action?r_id="+row.r_id;
	} 
	 
	
	
	
	
	/*--------------------------点击按钮取值--------------------------------*/
	function getSelected(){
		var row = $('#cc').datagrid('getSelected');
		if (row){
			alert('ID:'+row.a_id+" 学校名s称:"+row.a_school);
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


	
	/* ------------------------------------------------------------------------------- */




</script>


<input type="button" value="ss"/>


</head>


<body class="easyui-layout">

<div id="win" class="easyui-window"  style="width:600px;height:400px">
<s:form action="RelationUp" method="post">
<table>
<s:textfield id="r_id" name="relation.r_id" style="display: none"></s:textfield>
<s:textfield id="r_content" name="relation.r_content" label="姓名" value="%{#session.relation.r_content}"></s:textfield>
<s:textfield id="r_qq"  name="relation.r_qq" label="QQ：" value="%{#session.relation.r_qq}"></s:textfield>
<s:textfield id="r_phone"  name="relation.r_phone" label="电话：" value="%{#session.relation.r_phone}"></s:textfield>
<%-- <s:textfield id="r_effect" name="relation.r_effect" label="类型："></s:textfield> --%>
<s:select list="#{'1':'成考', '2':'远程', '3':'财务', '4':'学籍'}"  name="relation.r_effect" label="类型"></s:select>
<tr><td></td><td><s:submit ></s:submit></td></tr>
</table>
</s:form>
</div>
	
<div id="winadd" class="easyui-window"  style="width:600px;height:400px">

<s:form action="RelationIns" method="post">

<s:textfield id="r_contents" name="relation.r_content" label="姓名:" value="%{#session.relation.r_content}"></s:textfield>
<s:textfield id="r_qqs"  name="relation.r_qq" label="QQ:" value="%{#session.relation.r_qq}"></s:textfield>
<s:textfield id="r_phones"  name="relation.r_phone" label="电话:" value="%{#session.relation.r_phone}"></s:textfield>
<s:select list="#{'1':'成考', '2':'远程', '3':'财务', '4':'学籍'}"  name="relation.r_effect" label="类型"></s:select>
<s:submit ></s:submit>
</s:form>			

</div>
	
	
				
<div data-options="region:'north',title:'管理中心：',split:true,plain:true,iconCls:'icon-add'" style="height:150px" >
<a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'"  onclick="beforeAdd()">新增</a>
	<input type="button" value="刷新" id="tjs"/>
	
	<p>json:<s:property value="json"/></p>
	<s:textfield name="sjgjsjdjs" label="json:" />
</div>
<div data-options="region:'west',title:'树状列表：',split:true" style="width:200px"></div>


<div id="center" data-options="region:'center' ,title:'职员信息：',split:true"  style="padding:5px;background:#eee">
	<div class="easyui-layout" data-options="fit:true">  
	
		 <div id="add" data-options="region:'north',title:'添加：',split:true,plain:true,iconCls:'icon-add'" style="height:10px" ></div>
	
	
		<div class="easyui-tabs" fit="true" style="height:250px,width:300px">
		<div class="display:none">
			<table id="cc" class="easyui-datagrid" iconCls="icon-save" pagination="true"></table>
		</div>
	</div>
	</div>
	<div id="toolbar">
	<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" id="adds">New User</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">Remove User</a>
</div>

</div>
	






   




</body>
</html>