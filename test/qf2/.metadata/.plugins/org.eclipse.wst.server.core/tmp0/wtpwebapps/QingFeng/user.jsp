<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="s" uri="/struts-tags"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 注意：此测试页面已废弃 -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="script/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/yzmstyle2.css" />
<title>用户登录</title>
							<!-- 11、13 -->
<!-- <style>

body{
	background:url(images/lo.jpg);
}

* {
	padding:0px;
	margin:0px;
}

.lo{
	align:center;
	padding:128px 20px;
	/* width:100%;
	height:100%; */
}

.di {
	width: 500px;
	height: 100%;
	align: center;
	background: rgba(255, 255, 255, 0.5);
	border-radius: 8px;
}

.bs {
	text-align: center;
	border: 1px solid #0492d6;
	background: rgba(255, 255, 255, 0.3);
	color: red;
	width: 55px;
	height: 35px;
	font-size: 15px;
	border-radius: 8px;
}

.p {
	align: center;
	width: 465px;
	height: 50px;
	background: rgba(233, 233, 233, 0.2);
	padding-top: 18px;
	padding-left: 35px;
	border-radius: 5px;
}

.bs {
	font-size: 15px;
	width: 60px;
	height: 35px;
}

.ff {
	font-size: 25px;
	width: 300px;
	height: 35px;
	color: red;
	padding-bottom: 35px;
}

.te {
	width: 200px;
	height: 35px;
	border-radius: 5px;
	border: 0.5px solid #0492d6;
	padding-left: 5px;
	font-size: 25px;
}
</style> -->

<script language="javascript" src="script/jquery-1.5.2.js"></script>
<script type="text/javascript">
		$(document).ready(function(){
			$("#bu").click(function(){
				
			});
		});
	/* $(document).ready(function(){
		$("#but").click(function(){
			var kid = $("#uid").serialize();
			
			var kna = $("#uname").serialize();
			
			var kpw = $("#pwd").serialize();
			
			alert(kid+"----"+kna+"------"+kpw);
			//var kid = $("input").serialize();
			//alert("SDDHSHSDH");
			$.ajax({
				url:"jsonAction",
				type:"post",
				dataType:"json",
				data:(kid,kna,kpw),
				success:show
				
			});
			
		});
	}); */
	
	/* function show(ft){
		alert("输出");
		var json = eval("("+ft+")");
		var jsid = json.id;
		var obje = "UserID:"+jsid+"UserName:"+json.uname+"UserPassWord:"+json.pwd;
		$("#ft").html(obje);
		alert(obje);
	} */
	
</script>
</head>
<body>
	<%-- <s:form action="" method="post"> --%>
		<!-- <div class="lo">
			<div id="div" class="di">
			<p class="p">
				<b>User&nbsp;ID</b>: <span
					style="display: inline-block; width: 95px;"></span> <input
					type="text" id="uid" name="ub.uid" class="te" />
			</p>
			<p class="p">
				<b>User&nbsp;Name</b>: <span
					style="display: inline-block; width: 65px;"></span> <input
					type="text" id="uname" name="ub.uname" class="te" />
			</p>
			<p class="p">
				<b>User&nbsp;PassWord</b>: <span
					style="display: inline-block; width: 35px;"></span> <input
					type="password" id="pwd" name="ub.pwd" class="te" />
			</p>
			<p class="p">
				<span style="display: inline-block; width: 115px;"></span> <font
					id="ft" class="ff">Hello&nbsp;&nbsp;user&nbsp;&nbsp;text</font>
			</p>
			<p class="p">
				<span style="display: inline-block; width: 305px;"></span>
				<button id="but" class="bs">登入</button>
			</p>
		</div>
		</div> -->
	<%-- </s:form> --%>
	<!-- <div style="background-image:url(images/lo.jpg);"> -->
		<div class="md-modal md-effect-1" id="modal-20" >
      <div class="md-content">
        <h3><font face="楷体">用户登录</font></h3>
        <div>
          <p> <font size="6px" face="楷体">请输入您的账户密码: </font> </p>
          <ul>
            <li> <strong> <font size="6px" face="楷体"> 账户: </font> </strong>
            	<input type="text" style="width: 200px; height: 35px; border-radius: 5px;
					border: 0.5px solid #bbc1c5; background-color: rgba(255,255,255,0.9); padding-left: 5px; font-size: 25px;" />
            </li>
            <li> <strong> <font size="6px" face="楷体"> 密码: </font> </strong>
            	<input type="password" style="width: 200px; height: 35px; border-radius: 5px;
					border: 0.5px solid #bbc1c5; background-color: rgba(255,255,255,0.9); padding-left: 5px; font-size: 25px;" />
            </li>
            
          </ul>
          <button class="md-close" id="ss">登录</button>
        </div>
      </div>
    </div>
	<!-- </div> -->
    <div class="submit">
      <button class="md-trigger" id="bu" data-modal="modal-20">我的</button>
    </div>
    <div class="md-overlay"></div>
    
    <!--<div class="submit">
				<input type="button" id="bu" class="submit_but" value="提交" />
			</div>--> 
    <br/>
    
<script>
			// this is important for IEs
			var polyfilter_scriptpath = '/js/';
		</script> 
<script src="script/yzmindex.js"></script> 
</body>
</html>