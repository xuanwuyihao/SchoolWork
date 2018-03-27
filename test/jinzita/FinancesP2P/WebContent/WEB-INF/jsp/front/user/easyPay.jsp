<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
%>
<html>
<base href="<%=path%>/">	
<head>
<link rel="icon" href="img/Logo.png" type="image/x-icon">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="layui-v2.2.45/layui/css/layui.css" media="all">
<script src="layui-v2.2.45/layui/layui.js" charset="utf-8"></script>
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!--提示框样式-->
<link type="text/css" rel="stylesheet" href="css/iosOverlay.css">
<title>金字塔 - 综合金融服务平台 - 用户个人中心 - 易支付注册</title>
<style type="text/css">
.layui-btn-primary:hover {
    border-color: #2196F3;
    color: #333;
}
.layui-input:focus {
	border-color:#01AAED !important
}

.recharge-type {
    float: left;
    width: 300px;
    overflow: hidden;
    border: 2px solid #4a82be;
    padding: 23px 20px;
    margin-right: 20px;
    background-repeat: no-repeat;
    background-position: right bottom;
    position: relative;
    visibility: hidden;
}

a, input, select, label {
    outline: none;
}


 a {
    text-decoration: none;
}
</style>
<style>
.card-wrap {
    text-align: left;
    border-radius: 5px;
    border: 2px solid #4a82be;
    width: 280px;
}
.card-title {
    background-color: #f9f9f9;
    border-bottom: 1px solid #ccc;
    color: #333;
    position: relative;
    text-align: left;
    padding: 10px 9px;
}
.card-content {
    display: inline-block;
    line-height: 24px;
    margin: 25px 0 25px 30px;
    text-align: left;
}
.test:hover{
	background-color: white !important;
}
.test1:hover{
	background-color: white !important;
}
.test {
	border-bottom:hidden !important;
}
</style>
</head>
<body>
	<div style="margin-left: 15%;margin-top: 5px;">
		<img alt="" src="img/logos.png">
	</div>
	<div style="margin-left: 15%;margin-top: 15px;">
		易支付支付
	</div>
	<div style="margin-left: 15%">
		<table class="layui-table" lay-skin="line" style="width:80%;border-bottom: none;" >
  			<thead  style="background-color: red">
			<tr>
				<th>
					平台名称: 金字塔 
				</th>
				<th>
					公司名称: 金字塔运营(赣州)有限公司
				</th>
			</tr>
			</thead>
			<tr class="test" style="">
				<td align="right">
					账户余额：
				</td>
				<td>
					${logRecharge.oyh1}元
				</td>
			</tr>
			<tr class="test">
				<td align="right">
					支付金额：
				</td>
				<td>
					${logRecharge.money}元
				</td>
			</tr>
			<tr class="test">
				<td colspan="2">
					<hr style="height:1px;border:none;border-top:1px dashed #ccc;" />
				</td>
			</tr>
			<tr class="test">
				<td colspan="2">
					<div style="margin-left: 50px;">
					<a class="recharge-type" href="javascript:;"  style="visibility: visible;">
						<h2 style="color: #333;font-size: 24px;line-height: 24px;margin-bottom: 5px;">快捷支付</h2>
                      	<p style="color: #666;">无需登录网银，支付更加方便</p>
					</a>
					</div>
				</td>
			</tr>
			<tr class="test">
				<td colspan="2">
					<hr style="height:1px;border:none;border-top:1px dashed #ccc;" />
				</td>
			</tr>
			<tr class="test">
				<td colspan="2">
						<div class="card-wrap " style="margin-left: 50px;">
	                        <div class="card-title">
	                          <img src="https://lab.chinapnr.com/statics/common/images/bank/sml/CCB.png" >
	                          <span><b></b>借记卡</span>
	                        </div>
	                        <div class="card-content">
	                          <h3>${logRecharge.bankcard}</h3>
	                          <span>${userInfo.realname}</span>
	                          <span class="no-border" style="color: #666;">江西 赣州</span>
	                        </div>
	      			 	</div>
				</td>
			</tr>
			<tr class="test">
				<td colspan="2">
					<div style="margin-left: 50px;">如需解绑快捷卡，请至易付官网-P2P账户查询系统进行解绑。</div>
				</td>
			</tr>
			<tr class="test">
				<td colspan="2">
					<hr style="height:1px;border:none;border-top:1px dashed #ccc;" />
				</td>
			</tr>
			<tr class="test">
				<td align="right">
					银行预留手机号：
				</td>
				<td>
					<span id="phone1">${user.phone}</span>
				</td>
			</tr>
			<tr class="test" height="90px">
				<td align="right" >
					短信验证码：
				</td>
				<td>
					<form id="frm">
					<div style="float: left;width: 30%">
						<input type="hidden" name="logRechargeId" value="${logRecharge.id}"/>
						<input type="hidden" id="phone" value="${user.phone}"/>
						<input type="text" class="layui-input" id="code"  >
					</div>
					</form>
					<div style="float: left;margin-left: 20px;">
						<button id="sendCode" class="layui-btn layui-btn-primary">获取验证码</button>
					</div>
					<div>
						<br/><br/><span>短信收不到? 选择手机密令支付</span>
					</div>
					<div style="margin-top: -60px;margin-left: 430px;">
						<span id="codeError" class="layui-btn layui-btn-primary" style="border:1px solid red;colro:red;display: none">请输入正确的短信验证码</span>
					</div>
				</td>
			</tr>
			<tr class="test">
				<td colspan="2">
					<hr style="height:1px;border:none;border-top:1px dashed #ccc;" />
				</td>
			</tr>
			<tr class="test">
				<td colspan="2">
					<div style="margin-left: 50px;">您正在对专属账户进行充值，汇付天下根据您的指令，将资金从您的银行账户划转至专属账户</div>
				</td>
			</tr>
			<tr class="test">
				<td colspan="2">
					<hr style="height:1px;border:none;border-top:1px dashed #ccc;" />
				</td>
			</tr>
			<tr class="test1">
				<td colspan="2">
					<div style="float: left;margin-top: 13px;margin-left: 50px;">
						<span>
							易支付，全面保障您的资金安全
						</span>
					</div>
					<div  style="float: right;">
						<button id="recharge" class="layui-btn layui-btn-primary">确认充值</button>
					</div>
				</td>
			</tr>
		</table>
	</div>
<script type="text/javascript">
	var yzm = "168524";
	$("#sendCode").click(function(){
		var phone = $("#phone1").text();
		/* $.post("finance/bankcard/proving",{phone:phone},function(result){
			var data= eval('('+result+')');
			yzm = data.code; */
			$("#sendCode").attr("disabled", true);
			var i = 60;
			var timename = setInterval(function(){
				$("#sendCode").text(i);
				i=i-1;
				if(i<0){
					window.clearInterval(timename)
					$("#sendCode").attr("disabled", false);
					$("#sendCode").text("获取验证码");
				}
			},1000);
		/* }); */
	});
</script>
<script type="text/javascript" src="js/iosOverlay.js"></script>
<script type="text/javascript" src="js/spin.min.js"></script>
<script type="text/javascript">
	$("#recharge").click(function(){
		
		var code = $("#code").val();
		 if(yzm==''){
			layui.use('layer', function(){
				 var layer = layui.layer;
				  layer.msg('请先获取短信验证');
			});
			return;
		}
		 /* if(code==''){
			layui.use('layer', function(){
				 var layer = layui.layer;
				  layer.msg('请先获取短信验证');
			});
			return;
		} */
		 if(code!=yzm){
			layui.use('layer', function(){
				 var layer = layui.layer;
				  layer.msg('短信验证码不正确');
			});
			return;
		}	
		 $.post("finance/bankcard/recharge",$("#frm").serialize(),function(result){
				if(result=="success"){
					iosOverlay({
						  text: "充值成功",
						  duration: 2e3,		
					  });
					window.setTimeout(function(){
						location.href="front/user/PersonalCenter"
					},3000);
					return;
				}
				if(result="error"){
					iosOverlay({
						  text: "充值失败",
						  duration: 2e3,		
					  });
					window.setTimeout(function(){
						location.href="front/user/PersonalCenter"
					},3000);
				}
			});
		
	});
</script>
</body>
</html>