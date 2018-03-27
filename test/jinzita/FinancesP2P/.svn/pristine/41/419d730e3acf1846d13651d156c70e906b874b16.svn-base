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
<title>金字塔 - 综合金融服务平台 - 用户个人中心 - 易支付注册</title>
<style type="text/css">
.layui-btn-primary:hover {
    border-color: #2196F3;
    color: #333;
}
.layui-input:focus {
	border-color:#01AAED !important
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
		易支付新用户注册
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
			<tr>
				<th colspan="2">
					您正在开户易支付专属账户，并授权汇付天下获取您的相关信息用于开户身份验证，您已充分阅读开户协议并了解账户规则及相关责任限制。<br/>
					友情提示：<span style="color:red;">未满18周岁</span>的用户将无法开户！
				</th>
			</tr>
			</thead>
			<tr class="test">
				<td align="right">
					完善个人信息
				</td>
				<td>
					手机号将用于找回密码，请正确填写
				</td>
			</tr>
			<tr class="test">
				<td align="right">
					真实姓名：
				</td>
				<td>
					${map.username}
				</td>
			</tr>
			<tr class="test">
				<td align="right">
					证件号码：
				</td>
				<td>
					${map.idCard}
				</td>
			</tr>
			<tr class="test">
				<td align="right">
					手机号码：
				</td>
				<td>
					<span id="phone">${user.phone}</span>
				</td>
			</tr>
			<tr height="90px" class="test">
				<td align="right" >
					短信验证码：
				</td>
				<td>
					<div style="float: left;width: 30%">
						<input type="text" class="layui-input" id="code"  >
					</div>
					<div style="float: left;margin-left: 20px;">
						<button id="sendCode" class="layui-btn layui-btn-primary">获取验证码</button>
					</div>
					<div>
						<br/><br/><span> 若您一直未收到短信，可联系易支付客服热线：400-820-2819</span>
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
				<td align="right">
					设置交易密码
				</td>
				<td>
					为了确保您的资金安全，请设置独立交易密码，在<span style="color:red;">取现、充值、付款、绑卡</span>时会需要您输入
				</td>
			</tr>
			<tr class="test">
				<td align="right">
					易支付交易密码：
				</td>
				<td>
					<div style="float: left;width: 50%">
						<form id="frm" method="post" action="finance/bankcard/cardAdd">
						<input type="password" class="layui-input" id="password" name="pwd">
						<input type="hidden" name="username" value="${map.username}">
						<input type="hidden" name="idno" value="${map.idCard}">
						<input type="hidden" name="userphone" value="${user.phone}">
						</form>
					</div>
				</td>
			</tr>
			<tr class="test">
				<td align="right">
					确认交易密码：
				</td>
				<td>
					<div style="float: left;width: 50%">
						<input type="password" class="layui-input" id="password1">
					</div>
				</td>
			</tr>
			<tr class="test">
				<td colspan="2">
					<hr style="height:1px;border:none;border-top:1px dashed #ccc;" />
				</td>
			</tr>
			<tr class="test1">
				<td colspan="2">
					<div style="float: left;margin-top: 13px;">
						<input type="checkbox" checked>
						<span>
							<a href="#">已阅读并同意《专属账户开户协议》</a>
						</span>
					</div>
					<div  style="float: right;">
						<button id="recharge" class="layui-btn layui-btn-primary">同意注册</button>
					</div>
				</td>
			</tr>
		</table>
	</div>
<script type="text/javascript">
	var yzm = "980801";
	$("#sendCode").click(function(){
		var phone = $("#phone").text();
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
<script type="text/javascript">
	$("#recharge").click(function(){
		
		var code = $("#code").val();
		var pwd = $("#password").val();
		var pwd1 = $("#password1").val();
		 if(yzm==''){
			layui.use('layer', function(){
				 var layer = layui.layer;
				  layer.msg('请先获取短信验证');
			});
			return;
		}
		 if(code==''){
			layui.use('layer', function(){
				 var layer = layui.layer;
				  layer.msg('请先获取短信验证');
			});
			return;
		}
		 if(code!=yzm){
			layui.use('layer', function(){
				 var layer = layui.layer;
				  layer.msg('短信验证码不正确');
			});
			return;
		}
		
		if(pwd==''){
			layui.use('layer', function(){
				 var layer = layui.layer;
				  layer.msg('交易密码不能为空');
			});
			return;
		}
		if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(pwd)){
			layui.use('layer', function(){
				 var layer = layui.layer;
				  layer.msg('交易密码不能有特殊字符');
			});
			return;
		}
		if(/^\d+\d+\d$/.test(pwd)){
			layui.use('layer', function(){
				 var layer = layui.layer;
				  layer.msg('交易密码不能全为数字');
			});
			return;
		}
		if(!/^[\S]{6,12}$/.test(pwd)){
			layui.use('layer', function(){
				 var layer = layui.layer;
				  layer.msg('交易密码必须6到12位，且不能出现空格');
			});
			return;
		}
		if(pwd!=pwd1){
			layui.use('layer', function(){
				 var layer = layui.layer;
				  layer.msg('交易密码与确认密码不一致');
			});
			return;
		} 
		$("#frm").submit();
		
	});
</script>
</body>
</html>