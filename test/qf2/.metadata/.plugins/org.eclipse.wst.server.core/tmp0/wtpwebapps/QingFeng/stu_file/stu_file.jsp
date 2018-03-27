<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@taglib prefix="s" uri="/struts-tags" %>
	<%@ page import="java.util.*" %>
	<%@ page import="com.qf.model.*" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>文件上传管理</title>

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



</head>
<body>


	
	<s:iterator value="flist">
	<table>
		<tr>
			<th id="ImTx">学生</th>
			<th id="Im">相片</th>
			<th id="Im">论文</th>
			<th id="Im">缴费凭证</th>
			<th id="SetUp">上传时间</th>
			<th id="SetUp">操作</th>
		</tr>
		<tr id="mt<s:property value="cf_id"/>">
			<td id="area" width="80px;">	<s:property value="stu_name"/></td>
			<td width="180" align="center"><img id="img" alt="" src="Myfiles/<s:property value="sf_photo"/>" width="150" height="100"> </td>
			<td width="180" align="center"><img id="img" alt="" src="Myfiles/<s:property value="sf_voucher"/>" width="150" height="100"> </td>
			<td width="180" align="center"><img id="img" alt="" src="Myfiles/<s:property value="sf_paper"/>" width="150" height="100"> </td>
			<td width="200" align="center"><s:property value="sf_date"/></td>
			<td><label title="修改信息"> <a type="radio" name="st1" class="role-easyui-linkbutton-edit l-btn l-btn-small l-btn-plain"
					value="删除" onclick="xiugai()" data-options="plain:true,iconCls:'fi-pencil icon-blue'"
					onclick="">修改</a></label> <label title="恢复初始值">
					
			</label></td>
		</tr>
	
	</table>
	<input type="hidden" id="scc<s:property value="cf_id"/>" value="<s:property value="img_src"/>"/>
	</s:iterator>
</body>
</html>