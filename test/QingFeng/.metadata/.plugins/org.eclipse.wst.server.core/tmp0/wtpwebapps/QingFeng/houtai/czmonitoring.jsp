<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

	$(function(){
		
		$("logf").datagrid({
			
			url:"Logf.ation",
			fit : true,
            striped : true,
            rownumbers : true,
            pagination : true,
            singleSelect : true,
            idField : 'log_id',
            pageSize : 20,
			pageList : [10, 20, 30, 40],
			fitColumns : true,
			sortName : "log_id",
			sortOrder : "desc",
			columns:[[
			          {title : '编号',width : 50,field : 'log_id',sortable:true},
			          {title : '登录名',width : 50,field : 'emp_Account',sortable:true},
			          {title : '用户名',width : 50,field : 'emp_name',sortable:true},
			          {title : 'ip地址',width : 50,field : 'ip_address',sortable:true},
			          {title : '登录时间',width : 50,field : 'log_data',sortable:true},
			          
			          {
			                field : 'action',
			                title : '操作',
			                width : 130,
			                formatter : function(value, row, index) {
			                    var str = '';
			                            str += '<a href="javascript:void(0)" class="notice-easyui-linkbutton-del" data-options="plain:true,iconCls:\'fi-x icon-red\'" onclick="deleteNoticeFun('+index+');" >删除</a>';
			                    return str;
			                }
			            }
			       
					
			    ]],
			    onLoadSuccess:function(data){
	                $('.notice-easyui-linkbutton-del').linkbutton({text:'删除'});
	            },
	             
		
		});
		
	});
	
	/*--------------------------点击按钮取值--------------------------------*/
	function getSelected(){
		var row = $('#Logf').datagrid('getSelected');
		if (row){
			
		}
	}
	function getSelections(){
		
		for(var i=0; i<rows.length; i++){
			ids.push(rows[i].itemid);
		}
		alert(ids.join('\n'));
	}
	
	
	function deleteNoticeFun(index) {
		$('#Log').datagrid('selectRow',index);// 关键在这里
 		var row = $('#Log').datagrid('getSelected');
		alert("456789");
		if (confirm("确定删除？")) {  
            alert("点击了确定");  
            var log_id=row.log_id;
            window.location.href="rmdelo.action?log_id="+log_id;
            alert("log_id:"+row.log_id);
        }  
        else {  
            alert("点击了取消");  
        }  
    }

</script>
</head>
<body>

	<table id="Log" class="easyui-datagrid" ></table>
</body>
</html>