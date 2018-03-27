<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>商家注册</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">

		<link type="text/css" rel="stylesheet" href="MSHhoutai/css/login.css">
		<script type="text/javascript">
		function refresh(){
			document.getElementById("codes").src= '${pageContext.request.contextPath }/enimg.jsp?'+Math.random();
		}
		function check(){
			var bacc=form1.bacc.value;
			var bname=form1.bname.value;
			var bpwd=form1.bpwd.value;
			var bpwd1=form1.bpwd1.value;
			if(bacc==""){
				alert("手机号不能为空！");
				return false;
			}
			if(bacc.length!=11){
				alert("手机号位数只能为11位");
				return false;
			}
			if(isNaN(bacc)){
				alert("手机号含有非法字符！");
				return false;
			}
			if(bname==""){
				alert("昵称不能为空！");
				return false;
			}
			if(bpwd==""){
				alert("密码不能为空！");
				return false;
			}
			if(bpwd1==""){
				alert("确认密码不能为空！");
				return false;
			}
			if(bpwd!=bpwd1){
				alert("两次密码输入不一致！");
				return false;
			}
			return true;
		}
	</script>
	</head>
	<body class=""><!--
	背景图片
	-->
	
	<jsp:include page="dr.jsp"></jsp:include>
		<div class="zhuce_body">
			<div class="logo">
				<a><img src="MSHhoutai/images/logos.png"
						width="150" height="80" border="0"> </a>
			</div>
			<div class="zhuce_kong">
				<div class="zc">
					<div class="bj_bai">
						<h3>
							欢迎注册
						</h3>
						<form action="<%=basePath %>business?method=bzhuce" method="post"
							name="form1">
							
							</c:if>
							
							<input name="btel" type="text" class="kuang_txt phone"
								placeholder="手机号">
							<input name="bacc" type="text" class="kuang_txt phone"
								placeholder="账号">
							<input name="bpwd" type="password" class="kuang_txt possword"
								placeholder="密码">
							<input name="bpwd1" type="password" class="kuang_txt possword"
								placeholder="确认密码">

							
							<div>
								<input name="xy" type="checkbox" value="" />
								<span>已阅读并同意<a href="xieyi.jsp" target="_blank"><span
										class="lan">《onshop使用协议》</span> </a> </span>
							</div>
							<input name="注册" type="submit" class="btn_zhuce" value="注册"
								onclick="return check();" />

						</form>
					</div>
					<div class="bj_right">
						<p>
							使用以下账号直接登录
						</p>
						<a class="zhuce_qq">QQ注册</a>
						<a class="zhuce_wb">微博注册</a>
						<a class="zhuce_wx">微信注册</a>
						<p>
							已有账号？
							<a href="business/blogin.jsp">立即登录</a>
						</p>

					</div>
				</div>
				<P>
					欢迎您加入
					<font style="color: #ff9900"><b>onshop</b> </font>！
				</P>
			</div>

		</div>

	</body>
</html>
