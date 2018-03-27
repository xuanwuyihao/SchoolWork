<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>热门专业</title>
<link rel="icon" href="images/logo/logo2.ico" />
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
.tr {
	height:50px;
}
.tr:nth-of-type(odd) {
	background-color:#FFF;
}
.tr:nth-of-type(even) {
	background-color:#F2F2F2;
}
.tr:hover {
	color:#F30;
	background-color:#EFFEED;
}
.tr:hover .td:nth-child(1){
	background:url(images/tr-hover-bg.png) no-repeat 3px 8px;
}
.th {
	border-bottom:1px solid #CCC;
	border-top:1px solid #CCC;
	color:#333;
	background-color:#F8F4DA;
}
.td {
	border-bottom:1px solid #CCC;
}


.ths{
	width:35px;
	height:50px;
	border-bottom:1px solid #CCC;
	border-top:1px solid #CCC;
	color:#333;
	background-color:rgba(255,255,255,0.2);
	border:0;
}
/*定义列的宽度*/
[id^="Im"] {
	width:110px;
}
[id="ImTx"] {
	width:110px;
}
[id="Gxw"] {
	width:120px;
}
[id="Xtt"] {
	width:250px;
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
	border: 0.5px solid #0492d6;
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




.bu{
	width: 150px; 
	height: 30px; 
	font-size: 24px;
	font-family:'楷体'; 
	border-radius: 5px; 
	border: 0; 
	color: red; 
	background-color: rgba(0, 0, 0, 0.05);
	bottom:0px;
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
	font-size: 22px;
}


.xl:hover {
	letter-spacing: 1px;
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}


/*文本框*/


.te {
	width: 150px;
	height: 25px;
	border-radius: 5px;
	border: 0.5px solid #0492d6;
	padding-left: 5px;
	font-size: 25px;
}


.te:hover {
	letter-spacing: 1px;
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}


/*特殊TH*/


.the{
	width:200px;
	height:30px;
	bottom:15px;
}


.thx{
	width:355px;
	height:50px;
	border-bottom:1px solid #CCC;
	border-top:1px solid #CCC;
	color:#333;
	background-color:rgba(255,255,255,0.2);
	border:0;
}


/*FILE*/
.report-file {
	display: block;
    position: relative;
    width: 120px;
    height: 28px;
    overflow: hidden;
    border: 1px solid #428bca;
    background: none repeat scroll 0 0 #428bca;
    color: #fff;
    cursor: pointer;
    text-align: center;
    float: left;
    margin-right:5px;
}
.report-file span {
    cursor: pointer;
    display: block;
    line-height: 28px;
}
.file-prew {
    position: absolute;
    top: 0;
    left:0;
	width: 120px;
    height: 30px;
    font-size: 100px; 
    opacity: 0; 
    filter: alpha(opacity=0);
    cursor: pointer;
}




</style>


<script type="text/javascript">
	/* $(document).ready(function(){
		$("#xg1").click(function(){
			t.value = $("#rm1").text();
			textName.value = $("#rm2").text();
			z.value = $("#rm3").text();
		});
		
		$("#xz").click(function(){
			
		});
	}); */
</script>

 <script type="text/javascript">


	
	$(function(){
		alert("888");
		
		 $("#rm").datagrid({
			url:"renmenzy.action",
			
			
			fit : true,
            striped : true,
            rownumbers : true,
            pagination : true,
            singleSelect : true,
            idField : 'hm_id',
            pageSize : 20,
			pageList : [10, 20, 30, 40],
			fitColumns : true,
			sortName : "hm_id",
			sortOrder : "desc",
			
			columns:[[   
						
					   {title : '编号',width : 50,field : 'hm_id',sortable:true},
			           {title : '标题',width:50,field : 'hm_title',sortable:true},
			           {title : '图片',width:80,field : 'hm_picture',sortable:true},
			           {title : '内容',width:60,field : 'hm_content',sortable:true},
			           {
			                field : 'action',
			                title : '操作',
			                width : 130,
			                formatter : function(value, row, index) {
			                    var str = '';
			                            str += '<a href="javascript:void(0)" class="notice-easyui-linkbutton-edit" data-options="plain:true,iconCls:\'fi-pencil icon-blue\'" onclick="editNoticeFun('+index+');" >编辑</a>';
			                            str += '&nbsp;&nbsp;|&nbsp;&nbsp;';
			                            str += '<a href="javascript:void(0)" class="notice-easyui-linkbutton-del" data-options="plain:true,iconCls:\'fi-x icon-red\'" onclick="deleteNoticeFun('+index+');" >删除</a>';
			                    return str;
			                }
			            }
			       
					
			    ]],
			    onLoadSuccess:function(data){
	                $('.notice-easyui-linkbutton-edit').linkbutton({text:'编辑'});
	                $('.notice-easyui-linkbutton-del').linkbutton({text:'删除'});
	            },
	             
		});
	});
	
	/*--------------------------点击按钮取值--------------------------------*/
	function getSelected(){
		var row = $('#rm').datagrid('getSelected');
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
		$('#rm').datagrid('selectRow',index);// 关键在这里
 		var row = $('#rm').datagrid('getSelected');
		alert("456789");
		if (confirm("确定删除？")) {  
            alert("点击了确定");  
            var hm_id=row.hm_id;
            window.location.href="rmdelo.action?hm_id="+hm_id;
            alert("hm_id:"+row.hm_id);
        }  
        else {  
            alert("点击了取消");  
        }  
    }
    
    function editNoticeFun(index) {
    	 $('#rm').datagrid('selectRow',index);// 关键在这里
 		var row = $('#rm').datagrid('getSelected');
    	alert(row.hm_title);
    	 $('#tit').val(row.hm_title);
    	 $('#tp').val(row.hm_picture);
    	 $('#nr').val(row.hm_content);
    	 $('#id').val(row.hm_id);
    	
    	
    	$(function(){  
            $('#dd').dialog({  
               title:'对话框',  
               collapsible:true, //设置可折叠  
               minimizable:true,  
               maximizable:true,  
               resizable:true,  
         
             
          buttons:[{ //设置下方按钮数组  
               text:'确定',   
               iconCls:'icon-ok',  
               handler:function(){  
             alert('ok');  
             document.edit.submit();//提交from表单
               }  
          },{  
               text:'取消',  
               handler:function(){  
             $('#dd').dialog('close');  
               }  
          }]  
            });  
       });  
       function open1(){  
            $('#dd').dialog('open');  
       }  
       function close1(){  
            $('#dd').dialog('close');  
       }  
    	   
          
           
    }
    
    
    
    
	$(document).ready(function(){
		$("#xg1").click(function(){
			t.value = $("#ck1").text();
			z.value = $("#ck2").text();
		});
		
		/*获取时间*/
		$("#b1").click(function(){
			alert($("#date1").val()+"-*-*-*-"+$("#date2").val());
		});
		
		$("#xz").click(function(){
			/*新增*/
		});
	});

	
</script>




</head>
<body class="easyui-layout">
	
	
	<h1>
		热门专业管理
		<div style="float:right">
			<label title="新增数据">
				<a type="radio" id="xz" href="javascript:void(0)" onclick="$('#dlg').dialog('open')"
				 class="role-easyui-linkbutton-edit l-btn l-btn-small l-btn-plain">
				<label>
					<img src="../images/png/xzsj.png" style="width:25px;height:25px;top:2px;" />新增
				</label>
				</a>
			</label>
		</div>
	</h1>
	<div class="easyui-layout" data-options="fit:true,border:false">
	 <div data-options="region:'center',border:true,title:'公告列表'" >
      <table id="rm" class="easyui-datagrid" ></table>
    </div>
    </div>
	 <!-- <table id="rm" class="easyui-datagrid" ></table>  -->
	 

	 <div id="dd" icon="icon-save" style="padding: 5px; width: 400px; height: 200px;">  
	<form name="edit" action="rmup" method="post">
  <p>标题：<input type="text" id="tit" name="hot_major.hm_title"/></p>  
  <p>图片：<input type="text" id="tp" name="hot_major.hm_picture"/></p>  
  <p>内容：<input type="text" id="nr" name="hot_major.hm_content"/></p> 
   
   <!-- 隐藏域传id -->
   <p><input type="hidden" id="id" name="hot_major.hm_id"/></p>
  </form>
 </div>  
			
	<div id="dlg" class="easyui-dialog" title="修改"
		style="width: 80%; height: 400px; max-width: 800px; padding: 2px; display: none;"
		data-options="
				closed:true,
				buttons: [{
					text:'确定',
					iconCls:'icon-ccwjcg',
					handler:function(){
						document.add.submit();
						
					}
				},{
					text:'取消',
					iconCls:'icon-ccwjsb',
					handler:function(){
						alert('cancel');;
					}
				}]
			">
			<form name="add" action="rmadd" method="post">
		<p>
			<label class="la">标题：</label><input type="text" id="t" name="hot_major.hm_title" />
			<br /><br />
			<label class="la">图片：</label>
			<br /><br />
			<div class="report-file">
			      <span>相片</span>
			      <input tabindex="3" size="3" name="report" class="file-prew" type="file" onchange="document.getElementById('textName').value=this.value">
			</div>
			<input type="text" name="hot_major.hm_picture" id="textName" style="height: 28px;border:1px solid #f1f1f1" />
			<br /><br />
			<label class="la">内容：</label>
			<textarea style='width:150px;height:50px;' name="hot_major.hm_content"></textarea>
		</p>
		</form>
	</div>	 
		 
</body>
</html>