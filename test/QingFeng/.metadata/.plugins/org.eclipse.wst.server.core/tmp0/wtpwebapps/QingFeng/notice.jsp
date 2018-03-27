<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
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





	function lx(value, row, index){
		$('#tt').datagrid('selectRow',index);// 关键在这里
		var row = $('#tt').datagrid('getSelected');
		
		
	}

$(document).ready(function(){
	
	//关闭窗口
	$('#win').window('close');
	$('#winadd').window('close');
	$("#add").click(function(){
		
		//window.location.href="user.jsp";
		$('#winadd').window('open'); 
	});
	
	
	
});


$(document).ready(function() {
	$("#tt").datagrid({
		url : 'NoticeSel',
		striped : true,
		idField : "id",
 		pagination : true,
		pageSize : 10,
		pageList : [ 10, 20, 30 ,40],
// 		fitColumns : true,
		sortName : "r_id",
		toolbar:"#toolbar",
		sortOrder : 'desc',
		onLoadSuccess:function(data){    
	        $("a[name='opera']").linkbutton({text:'查看',plain:true,iconCls:'icon-edit'});
	        $("a[name='oo']").linkbutton({text:'删除',plain:true,iconCls:'icon-remove'});  
	}, 
		 columns : [ [ {
			field : 'n_id',
			title : '编号',
			width : 200,
			sortable : true
		}, {
			field : 'n_title',
			title : '标题',
			width : 200,
			sortable : true
		}, {
			field : 'n_content',
			title : '内容',
			width : 200,
			sortable : true
		}, {
			field : 'n_date',
			title : '时间',
			width : 200,
			sortable : true
		},{
			field :  'n_flag',
			title : '类型',
			width : 200,
			sortable : true,
			formatter:function(value, row, index){ 
				if(value==0){
					return '公告';
				}else{
					return '简章';
				}
		       
		}
		},{
			field:'operate',field:'operate',title:'操作',align:'center', width:$(this).width()*0.1,  

			formatter:function(value, row, index){ 
				
		        var str = '<a href="#" name="opera" onclick="editUserss('+index+')" class="easyui-linkbutton" ></a>';  
		        var ss = '<a href="#" name="oo" onclick="editUser('+index+')" class="easyui-linkbutton" ></a>';
		        return str+ss;
		}
		}, ] ]



	});
	
	function delectId(val,row,index){
		return '<a href="#" onclick="editUser('+index+')">删除</a>';
	}
	

     function getParentId(id){
		  var arr = new Array();
		  $.each(json, function(i,item){
		    if(item.Id==id && item.ParentId!=0){
		      arr.push(item.ParentId);
		      arr = arr.concat(getParentId(item.ParentId));
		    }
		  });
		  return arr;
		}
	
	
	
});

function editUser(index){
	
	$('#tt').datagrid('selectRow',index);// 关键在这里
	var row = $('#tt').datagrid('getSelected');
	//alert('ID:'+row.r_id+" 学校名称:"+row.a_school);
	alert(row.n_id);
	window.location.href="NoticeDel.action?n_id="+row.n_id;
}

function editUserss(index){
	
	$('#tt').datagrid('selectRow',index);// 关键在这里
	var row = $('#tt').datagrid('getSelected');
	//alert('ID:'+row.r_id+" 学校名称:"+row.a_school);
	//alert(row.n_id);
// 	$("#n_id").val(row.n_id);
// 	$("#n_title").val(row.n_title);
// 	$("#n_date").val(row.n_date);
// 	$("#n_flag").val(row.n_flag);
// 	$("#n_content").val(row.n_content);
// 	$('#win').window('open');
	window.location.href="notice2.jsp?n_content="+row.n_content;
}


</script>
</head>
<body>

<!-- 修改 -->
<!-- <div id="win" class="easyui-window"  style="width:600px;height:400px"> -->
<%-- <s:form action="NoticeUp" method="post"> --%>
<!-- <table> -->
<%-- <s:textfield id="n_id" name="notice.n_id" style="display: none"></s:textfield> --%>
<%-- <s:textfield id="n_title" name="notice.n_title" label="标题" value="%{#session.notice.n_title}"></s:textfield> --%>
<%-- <s:select list="#{'0':'公告', '1':'简章'}"  name="notice.n_flag" label="类型" value="%{#session.notice.n_flag}"></s:select> --%>
<%-- <s:textarea id="n_content"  name="notice.n_content" label="内容"  cols="40" rows="10"/> --%>
<%-- <tr><td></td><td><s:submit  ></s:submit></td></tr> --%>
<!-- </table>		 -->
<%-- </s:form> --%>
<!-- </div> -->

<!--增加  -->
<div id="winadd" class="easyui-window"  style="width:600px;height:400px">

<s:form action="NoticeAdd" method="post">
<table>
<s:textfield id="n_id" name="notice.n_id" style="display: none" ></s:textfield>
<s:textfield id="n_title" name="notice.n_title" label="标题" value="%{#session.notice.n_title}"></s:textfield>
<s:select list="#{'0':'公告', '1':'简章'}"  name="notice.n_flag" label="类型" value="%{#session.notice.n_flag}"></s:select>
<s:textarea id="n_content"  name="notice.n_content" label="内容"  cols="40" rows="10" value="%{#session.notice.n_content}"/>
<tr><td></td><td><s:submit  ></s:submit></td></tr>
</table>		
</s:form>
</div>

<div class="easyui-tabs" fit="true">
<div style="display:none">
<!-- <table id="tt" class="easyui-datagrid"> -->
<table id="tt" class="easyui-datagrid" iconCls="icon-save" pagination="true"></table>



<!-- </table> -->
</div>
</div>
<div id="toolbar">
	<a href="#" id="add" class="easyui-linkbutton" iconCls="icon-add" plain="true" ">增加</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">Remove User</a>
</div>

</body>
</html>