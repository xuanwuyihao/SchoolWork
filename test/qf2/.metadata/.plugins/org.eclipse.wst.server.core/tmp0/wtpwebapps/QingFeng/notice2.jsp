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

$(document).ready(function(){
	

	function getUrlParam(key){
	    // 获取参数
	    var url = window.location.search;
	    // 正则筛选地址栏
	    var reg = new RegExp("(^|&)"+ key +"=([^&]*)(&|$)");
	    // 匹配目标参数
	    var result = url.substr(1).match(reg);
	    //返回参数值
	    return result ? decodeURIComponent(result[2]) : null;
	}
	
	
	var va=getUrlParam('n_content')
// 	alert('url='+getUrlParam('n_content'));
	$("#rrr").html(va);
	$(".pp").val(va);
	
});





// alert(GetQueryString("参数名3"));
</script>
</head>


<!-- <div style="background:red;width:300px;height:300px;text-align: center;margin-top: 20px;margin-left:250px"> -->
<!-- <!-- <p id="rrr" align="center">高房价的三个环节可能就能解决就觉得很烦感很好回房间的课老师看了你就可能就看比较放的开了十几年的借口来江南风光你发你的简单描述了你离开那就快废了你快乐的不能借饭卡掉了脑袋进口粮分阶段地加快了少年时代就看了你的借口来发那就肯定废了你速度加快了</p> -->
<!-- </div> -->


<div style="border:;width:800px;height:380px;position:absolute;left:40%;margin-left:-250px;top:50%;margin-top:-190px;"><h2 align="center">通知</h2><p id="rrr" align="center"/></p></div>


</body>
</html>