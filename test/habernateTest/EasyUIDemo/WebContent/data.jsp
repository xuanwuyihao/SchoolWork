<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
	$(function() {

		//url:从远程站点请求数据的 URL。
		//striped:设置为 true，则把行条纹化。（即奇偶行使用不同背景色）
		//idField:指示哪个字段是标识字段。
		//pagination:设置为 true，则在数据网格（datagrid）底部显示分页工具栏。
		//singleSelect:设置为 true，则只允许选中一行。
		//pageSize:当设置了 pagination 属性时，初始化页面尺寸。
		//pageList:当设置了 pagination 属性时，初始化页面尺寸的选择列表。
		//fitColumns:设置为 true，则会自动扩大或缩小列的尺寸以适应网格的宽度并且防止水平滚动。
		//sortName:定义可以排序的列。
		//sortOrder:定义列的排序顺序，只能用 'asc' 或 'desc'。
		//columns:数据网格（datagrid）的列（column）的配置对象，更多细节请参见列（column）属性。
		$(function() {
			$("#dg").datagrid({
				url : "grid",
				striped : true,
				idField : "id",
				pagination : true,
				pageSize : 10,
				pageList : [10, 20, 30, 40],
				fitColumns : true,
				sortName : "id",
				sortOrder : "desc",
				columns : [[
					{field : "id", title : "编号", width : 200, sortable : true},
					{field : "name", title : "姓名", width : 200,sortable : true},
					{field : "age", title : "年龄", width : 200,sortable : true},
				]]
			});
		});
	});
</script>
</head>
<body class="easyui-layout"> 
<div split="false" data-options="region:'north',title:'north-title',split:true" style="height:100px"></div>
<div split="false" data-options="region:'west',title:'west-title',split:true" style="width:100px"></div>   
<div split="false" data-options="region:'center',title:'center-title',split:true" style="padding:5px;background:#eee;">
<div border="true" fit="true" id="tt" class="easyui-tabs" style="width:500px;height:250px;">  
<div title="Tab1" style="padding:20px;display:none">
<table id="dg" class="easyui-datagrid">

</table>
</div>
</div>
</div>
</body>
</html>