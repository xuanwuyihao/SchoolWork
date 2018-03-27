<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

  <meta charset="utf-8">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>金字塔 - 综合金融服务后台管理系统登录</title>
  <!-- 引入页面Logo小图标 -->
  <link rel="icon" href="img/Logo.png" type="image/x-icon">
  <base href="<%=path%>/">
  <link rel="stylesheet" href="css/login.css">
  <!-- Javascript -->
  <script type="text/javascript" src="js/jquery-1.9.1.js"></script>
  <!-- <script type="text/javascript" src="js/jquery.min.js"></script> -->
  <script type="text/javascript" src="js/index.js"></script>
  <script src="./lib/layui/layui.js" charset="utf-8"></script>
  
</head>
<body class="login-bg">
    <canvas id="fullstarbg">你的浏览器不支持canvas标签</canvas>
    <div class="login">
        <div class="message">金字塔后台管理系统登录</div>
        <div id="darkbannerwrap"></div> 
        <input type="hidden" name="msg" id="msg" value="${message_login }"/>  
        <form action="manager/login" method="post" class="layui-form" >
            <input name="username" id="username" placeholder="用户名"  type="text" lay-verify="required" class="layui-input" >
            <hr class="hr15">
            <input name="password" id="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input">
            <hr class="hr15">
            <input value="登录" id="submit_btn" class="submit_btn" lay-submit lay-filter="login" style="width:100%;" type="submit">
            <hr class="hr20" >
        </form>
    </div>
   <!--  <script>
            layui.use(['form'],
            function() {
                $ = layui.jquery;
                var form = layui.form(),
                layer = layui.layer;

                //监听提交
                form.on('submit(login)',
                function(data) {
                    console.log(data);
                    layer.alert(JSON.stringify(data.field), {
                      title: '最终的提交信息'
                    },function  () {
                        location.href = "manager/login";
                    })
                    return false;
                });

            });

        </script> -->
        
	 <div class="alert" style="display:none;">
			<h2>提示</h2>
			<div class="alert_con">
				<p id="ts"></p>
				<p style="li6tne-height:45px"><a class="btn">确定</a></p>
			</div>
		</div>
	
        
        
        
		<script>
		
		 //支持Enter键登录
		document.onkeydown = function(e){
			if(!e) e = window.event;
			if((e.keyCode || e.which) == 11){
				var obtnLogin=document.getElementById("submit_btn")
				obtnLogin.focus();
			}
		}
		
		 $(".btn").click(function(){
			is_hide();
		}); 
		var msg = $("#msg").val();
		var u = $("#username");
		var p = $("#password");
		if(msg != ''){
			$("#ts").html(msg);
			is_show();
		}
		 $("#submit_btn").live('click',function(){
			if(u.val() == '' || p.val() =='')
			{
				$("#ts").html("用户名或密码不能为空~");
				is_show();
				return false;
			}
			
			return true;
		});
		window.onload = function()
		{
			$(".connect p").eq(0).animate({"left":"0%"}, 600);
			$(".connect p").eq(1).animate({"left":"0%"}, 400);
		}
		function is_hide(){ $(".alert").animate({"top":"-40%"}, 300) }
		function is_show(){ $(".alert").show().animate({"top":"15%"}, 300) }  
		</script>
    
    <!-- 底部结束 -->
    
</body>
</html>