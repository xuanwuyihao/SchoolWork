<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>美食惠注册</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">

		<link type="text/css" rel="stylesheet" href="css/login.css">
		<script type="text/javascript" src="js/jquery.min.js"></script>
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
						<form action="<%=basePath %>szhuceservlet?order=addbuser" method="post"
							name="form1">
							<c:if test="${msg!=null }">
								<script type="text/javascript">
									alert("验证码错误！");
								</script>
							</c:if>
							
							<input name="bacc" type="text" class="kuang_txt phone"
								placeholder="手机号">
							<input name="bname" type="text" class="kuang_txt phone"
								placeholder="昵称">
							<input name="bpwd" type="password" class="kuang_txt possword"
								placeholder="密码">
							<input name="bpwd1" type="password" class="kuang_txt possword"
								placeholder="确认密码">

							<input name="byzm" type="text" id="inputCode"
								class="kuang_txt yanzm" placeholder="验证码" style="width: 132px">
							<img src="${pageContext.request.contextPath }/enimg.jsp"
								width="100" height="26" class="passcode"
								style="height: 32px; cursor: pointer;" id="codes" align="top"
								alt="点击换一张" onclick="refresh();" />
							<div>
								<input name="xy" type="checkbox" value="" />
								<span>已阅读并同意<a href="xieyi.jsp" target="_blank"><span
										class="lan">《美食惠使用协议》</span> </a> </span>
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
							<a href="<%=basePath%>slogin.jsp">立即登录</a>
						</p>

					</div>
				</div>
				<P>
					meishihui.com&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎您加入
					<font style="color: #ff9900"><b>美食惠</b> </font>！
				</P>
			</div>

		</div>

	</body>
</html>
