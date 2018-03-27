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
<title>金字塔 - 综合金融服务后台管理系统 - 修改密码</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="layui-v2.2.45/layui/css/layui.css"  media="all">
<script src="layui-v2.2.45/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script src="js/jquery-1.9.1.min.js" charset="utf-8"></script>
	<style type="text/css">
		a:focus{text-decoration: none}
		a:focus{outline:none;}
	</style>
</head>
<body>
<div class="layui-col-md4  layui-col-md-offset4" style="margin-top: 100px">
<form class="layui-form" id="frm" >
  <div class="layui-form-item">
    <label class="layui-form-label">旧密码</label>
    <div class="layui-input-inline">
      <input type="password" name="pwdNow" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
    </div>
    
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">新密码</label>
    <div class="layui-input-inline">
      <input type="password" id="pwdFuture" name="pwdFuture" required lay-verify="pass" placeholder="请输入密码" autocomplete="off" class="layui-input">
    </div>
    
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">确认密码</label>
    <div class="layui-input-inline">
      <input type="password" required lay-verify="confirmPass" placeholder="请输入密码" autocomplete="off" class="layui-input">
    </div>
    
  </div>
  
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="add">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>
</div>
<script>
//Demo
layui.use('form', function(){
  var form = layui.form;
  //监听提交
  form.on('submit(add)', function(data){
	 
	  $.post("manager/modifyPassword",$("#frm").serialize(),function(result){
		  if(result=="success"){
			  alert("修改密码成功，即将跳转至登录界面，请重新登录...");
			  top.location.href="back/login";
		  }else{
			  alert("修改密码失败，请确认密码是否正确");
		  }
		 
	  });
  });
  
   form.verify({
	  pass: function(value, item){ //value：表单的值、item：表单的DOM对象
		if(value==''){
			return '密码不能为空';
		}
		if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)){
			return '密码不能有特殊字符';
	    }
	   
	    if(/^\d+\d+\d$/.test(value)){
	      return '密码不能全为数字';
	    }
	    if(!/^[\S]{6,12}$/.test(value)){
	    	return '密码必须6到12位，且不能出现空格'
	    }
	  },confirmPass : function(value, item){
		  var pwdFuture = $("#pwdFuture").val();
		  if(pwdFuture!=value){
			  return '新密码与确认密码不一致'
		  }
	  }

	});   
});
    
</script>
</body>
</html>