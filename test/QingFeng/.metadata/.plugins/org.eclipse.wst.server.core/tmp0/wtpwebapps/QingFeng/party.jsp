<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
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
$(document).ready(function(){
	/*  $('#dd').dialog({
	    title: 'My Dialog',
	    width: 400,
	    height: 200,
	     closed: false,
	    cache: false,
	     /* href: 'user.jsp', 
	    modal: true
	}); */
	/* $('#dd').dialog('refresh', 'new_content.php');  */
	
	
	//$('#win').window('close'); 
	
	$("#butt").click(function(){
		$('#win').window('open'); // open a window
	});
	
});



</script>
</head>
<body>
<s:form action="" mothod="post">
<s:textfield label="用户"  type="height:10px"></s:textfield>
<s:password label="密码" ></s:password>
<s:submit value="确认"></s:submit><button>注册</button>
</s:form>
<!-- <div id="dd">Dialog Content.</div> -->

<button id="butt">ffff</button>
<div id="win" class="easyui-window"  style="width:600px;height:400px" 
    >
    Window Content
</div>

</body>
</html>