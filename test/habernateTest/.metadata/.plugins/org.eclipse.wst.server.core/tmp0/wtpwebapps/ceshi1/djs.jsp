<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
	function djs(){
		$("#djs").click(function(){
			alert("211");
			setTimeout(60-1,1000);
			$("#tx").attr("disabled","");
		});
	}
	
	$(function(){
		$("#djs").click(function(s){
			//alert("TTTT");
			setTimeout(60-1,1000);
			$("#tx").attr("disabled","");
			$("#tx").val();
			$("#tx").val(s+"fff");
		});
	});
	
	</script>
</head>
<body>

<input type="button" id="djs" value="倒计时"/>
<input type="text" id="tx" value="djs()">
</body>
</html>