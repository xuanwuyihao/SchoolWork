<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=path%>/">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>金字塔-投资支付</title>
<link href="css/zf.css" rel="stylesheet" type="text/css" />
<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
<!-- 导入layui -->
<script src="./lib/layui/layui.js" charset="utf-8"></script>
<script src="./js/x-layui.js" charset="utf-8"></script>
<link rel="icon" href="img/Logo.png" type="image/x-icon">
</head>
<body background="img/jt1.png">
<div><a href="front/index" style="position:absolute;top:30px;left:50px;width:300px;height:100px"></a></div>
<div style="height: 50px;"></div>
<center>
<div class="q" style="width: 80%;">
	<form action="" action="">
	<br>
	<div class="xx" align="left"><font size="4">支付信息</font></div>
	<br>
	<div class="tb">
	<div style="height: 1px;"></div><!-- 空的div -->
	<div style="margin-top: -7px;margin-left: -15px;">
		<ul>
			<li  style="float: left;display: inline;">
			<img  src="img/biao.png" width="100px" height="80px">
			</li>
			<li  style="float: left;display: inline;margin: 5px 10px;">
			<font size="4">
			 ${pay.ordstatus } 
			</font>
			</li>
			<li style="float: right;display: inline;margin: 50px 100px;">
			<span>
			所投金额：<font color="red">￥${pay.transamt }</font>
			</span>
			</li>
		</ul>
	</div>
	</div>
	<div class="zx"><hr class="z"></div>
	<div class="m" style="margin-top: 20px;">
	<font>输入支付密码：</font>
	<input type="password" name="pwd" id="pwd" class="sr" placeholder="输入支付密码" 
	       onfocus="this.placeholder=''" onblur="this.placeholder='输入支付密码'" >
	</div>
	<br>
	<div style="width: 90%;" align="right">
	支付金额：
	<font size="5" color="red">￥${pay.transamt }</font>
	</div>
	<div style="width: 90%;" align="right">
	
	<input type="button" onclick="pay();" value="立即支付" class="zf" style="width: 100px;"/>
	
	</div>
	</form>
</div>
</center>
</body>

<script type="text/javascript">

var layer;
layui.use(['layer'], function(){
       
      layer = layui.layer;//弹出层	
});		




function pay(){
	
var pwd=$("#pwd").val();


$.ajax({
	async:true,
	cache:true,
	url:'front/pdmm',
	type:'post',
	data:{
		
		'pwd':pwd
	},
	success:function(data){
		console.info(data);
		if(data == "true") {
			
			layer.msg('投资成功!',{icon: 1,time:1000});
			
			location.href="front/payMoney";										
		
		} else {
			
										
			layer.msg('支付密码错误!',{icon: 4,time:1000});
			
			$("#pwd").focus();
			
			
	    }
	
	},error:function(XMLHttpRequest,textStates){
	 layer.alert('错误！',{
      title: '提示框',				
	icon:1,		
	  });
	   layer.close(index);	
     }
});

}

</script>


</html>