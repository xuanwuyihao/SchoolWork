<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录日志</title>
<script type="text/javascript"
	src="../script/jquery-easyui-1.5.2/jquery.min.js"></script>
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="../script/jquery-easyui-1.5.2/themes/gray/easyui.css" />
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="../script/jquery-easyui-1.5.2/themes/icon.css" />
<script type="text/javascript"
	src="../script/jquery-easyui-1.5.2/jquery.easyui.min.js" charset="utf-8"></script>
<script type="text/javascript"
	src="../script/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js"
	charset="utf-8"></script>


<style type="text/css">

body {
	margin:30px auto;
	text-align:center;
	
	color:#666;
}
h1 {
	margin:10px;
	font-size:25px;
	color:#F30;
	font-family:'楷体';
	letter-spacing:5px;
	font-weight:600;
}
table {
	margin:0px auto;
	border-collapse:collapse;
	font-size:13px;
}
tr {
	height:50px;
}
tr:nth-of-type(odd) {
	background-color:#FFF;
}
tr:nth-of-type(even) {
	background-color:#F2F2F2;
}
tr:hover {
	color:#F30;
	background-color:#EFFEED;
}
tr:hover td:nth-child(1){
	background:url(images/tr-hover-bg.png) no-repeat 3px 8px;
}
th {
	border-bottom:1px solid #CCC;
	border-top:1px solid #CCC;
	color:#333;
	background-color:#F8F4DA;
}
td {
	border-bottom:1px solid #CCC;
}
/*定义列的宽度*/
[id^="Im"] {
	width:110px;
}
[id="ImTx"] {
	width:310px;
}
[id="Gxw"] {
	width:520px;
}
[id="Xtt"] {
	width:120px;
}

[id="SetUp"] {
	width:120px;
}
.dc{
	width:250px;
	
}
[id="ld"] {
	text-indent:3px;
	font:"楷体";
	font-size:18px;
	background: rgba(255,255,255,0.1) no-repeat;
	border-radius: 5px;
	border: 0.5px solid gray;
	letter-spacing:3px;
	
}
#ld:hover{
	letter-spacing:2px;
	border: 0.5px solid red;
	color:red;
	background-color:rgba(255,255,255,0.5);
	
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
	border: 0.2; 
}

.cz{
	width: 95%; 
	height: 230px; 
	font-size: 24px;
	font-family:'楷体'; 
	border-radius: 5px; 
	border: 0.2; 
	color: red; 
	background-color: rgba(0, 0, 0, .05);
	font:'楷体';
	font-size:18px;
}




</style>
<script type="text/javascript">

	$(function(){
	alert("ooooooooo");
		
		$("#Log").datagrid({
			
			url:"Log.action",
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
			          {title : '登录名',width : 50,field : 'emp_Account',sortable:true,
			        	  formatter:function(value,row){  
					        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
					        		return content;  
					       }
			          },
			          {title : '用户名',width : 50,field : 'emp_name',sortable:true,
			        	  formatter:function(value,row){  
					        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
					        		return content;  
					        }
			          },
			          {title : 'ip地址',width : 50,field : 'ip_address',sortable:true,
			        	  formatter:function(value,row){  
					        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
					        		return content;  
					        }
			          },
			          {title : '登录时间',width : 50,field : 'log_data',sortable:true,
			        	  formatter:function(value,row){  
					        	var content = '<li title="' + value + '" class="tip" data-html="true" style="list-style:none;nowrap : false">' +value + '</li>';  
					        		return content;  
					        }
			          },
			          
			          {
			                field : 'action',
			                title : '操作',
			                width : 130,
			                formatter : function(value, row, index) {
			                    var str = '';
			                            str += '<a href="javascript:void(0)" class="notice-easyui-linkbutton-del" data-options="plain:true,iconCls:\'fi-x icon-red\'" onclick="deleteNoticeFun('+index+');" >删除</a>';
			                            str += '<a href="javascript:void(0)" class="notice-easyui-linkbutton-cz" data-options="plain:true,iconCls:\'fi-x icon-red\'" onclick="czNoticeFun('+index+');" >操作</a>';
			                            
			                    return str;
			                }
			                
			            }
			       
					
			    ]],
			    onLoadSuccess:function(data){
	                $('.notice-easyui-linkbutton-del').linkbutton({text:'删除'});
	                $('.notice-easyui-linkbutton-cz').linkbutton({text:'操作'});
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
	             
		
		});
		
	});
	
	/*--------------------------点击按钮取值--------------------------------*/
	function getSelected(){
		var row = $('#Log').datagrid('getSelected');
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
		 $('#id').val(row.log_id);
		if (confirm("确定删除？")) {  
            alert("点击了确定");  
            var log_id=row.log_id;
            window.location.href="logdel.action?log_id="+log_id;
            alert("log_id:"+row.log_id);
        }  
        else {  
            alert("点击了取消");  
        }  
    }
	
	function czNoticeFun(index) {
 		 $('#Log').datagrid('selectRow',index);// 关键在这里
  		 var row = $('#Log').datagrid('getSelected');
		
  		 var emp_name=row.emp_name;
         window.location.href="jtcz.jsp?emp_name="+emp_name;
         alert("emp_name:"+row.emp_name);
        //addTab("登录日志2",houtai/jtcz.jsp);
	}
	
	

</script>
</head>
<body>

	<h1>登录日志</h1>
	<table id="Log" class="easyui-datagrid" ></table>
	<p><input type="hidden" id="id" name="Log.log_id"/></p>
</body>
</html>