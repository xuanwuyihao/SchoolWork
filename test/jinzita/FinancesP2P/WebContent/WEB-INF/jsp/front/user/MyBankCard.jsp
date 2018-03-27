<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<%
	String path = request.getContextPath();
%>
<base href="<%=path%>/">	
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="layui-v2.2.45/layui/css/layui.css" media="all">
<script src="layui-v2.2.45/layui/layui.js" charset="utf-8"></script>
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!--提示框样式-->
<link type="text/css" rel="stylesheet" href="css/iosOverlay.css">
<style type="text/css">
	li.layui-this:after, .layui-tab-brief>.layui-tab-title .layui-this:after {
    border: none;
    border-radius: 0;
    border-bottom: 2px solid red;
}
.layui-tab-brief>.layui-tab-title .layui-this {
    color: orange;
}
.layui-btn-primary:hover {
    border-color: black;
    color: #333;
}
</style>
</head>
<body>
<div class="layui-tab layui-tab-brief" lay-filter="docDemoTabBrief">
  <ul class="layui-tab-title"> 
    <li class="layui-this">我的银行卡</li>
  </ul>
  <input type="hidden" id="oyh1" value="${user.oyh1}">
  <div class="layui-tab-content" style="height: 500px;">
    <div class="layui-tab-item layui-show"  style="margin-top: 15px;margin-left: -10px;">
    	<c:if test="${not empty userBankcard}">
    	<div style="background-image: url('img/easyCard.png');width: 30%;float: left;height: 160px;">
    		<div style="margin-top: 60px;margin-left: 24px;">
    			<font id="realname" color="white">${userInfo.realname}</font>
    		</div>
    		<div style="margin-top: 6px;margin-left: 24px;">
    			<input type="hidden" id="card" value="${userBankcard.bankcard}">
    			<font  id="number1" color="white"></font>
    			<font  id="number2" style="margin-left: 10px;" color="white"></font>
    			<font  id="number3" style="margin-left: 10px;" color="white"></font>
    			<font  id="number4" style="margin-left: 10px;" color="white"></font>
    			<font  id="number5" style="margin-left: 10px;" color="white"></font>
    		</div>
    	</div>
    	</c:if>
		<div style="float: left;margin-left: 20px;width: 30%" id="addCard">
			<div class="layui-upload-drag" id="test10" style="width: 100%">
  				<img src="img/add.png"><br/><br/>
  				<p>添 加 银 行 卡</p>
			</div>
		</div>
    </div>
  </div>
</div> 
</body>
<script>
layui.use('element', function(){
  var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
  
  //监听导航点击
  element.on('nav(demo)', function(elem){
    //console.log(elem)
    layer.msg(elem.text());
  });
});
</script>         
<script type="text/javascript">
	var card = $("#card").val();
	if(card!=''&&card!=null){
		var number1 = card.substring(0,4);
		var number2 = card.substring(4,8);
		var number3 = card.substring(8,12);
		var number4 = card.substring(12,16);
		$("#number1").text(number1);
		$("#number2").text(number2);
		$("#number3").text(number3);
		$("#number4").text(number4);
	}
</script>
 <script type="text/javascript">
	$("#addCard").click(function(){
		var oyh1 = $("#oyh1").val();
		if(oyh1=='0'){
			alert('您已绑定过一张银行卡');
			return;
		}else{
			layui.use('layer', function(){
				layer.msg('尚未身份验证，<br/>请先身份验证注册易支付<br/>再进行操作！', {
					 btn: ['明白了'],
					 offset: ['100px','250px'],					
					 btnAlign: 'c',
					 time : 0,
					 yes: function(index, layero){
						 	layer.close(index);
						 	top.location.href="finance/bankcard/openRegister";
						  }
				});
				return;
			});   
		}
		
	});
</script>
<!-- <script type="text/javascript">
	$("#addCard").click(function(){
		alert(1);
		 var card = $("#card").val();
		 alert(card);
		if(card!=''){
			alert('您已绑定过一张银行卡');
			return;
		}
		/*var realname = $("#realname").text();
		if(realname==''){
			layui.use('layer', function(){
				layer.msg('尚未身份验证，<br/>请先身份验证注册易支付<br/>再进行操作！', {
					 btn: ['明白了'],
					 offset: ['100px','250px'],
					
					 btnAlign: 'c',
					 time : 0,
					 yes: function(index, layero){
						 	layer.close(index);
						 	top.location.href="finance/bankcard/openRegister";
						  }
				});
				return;
			});   
		}
		
		} */
		
	});
</script> -->

</html>