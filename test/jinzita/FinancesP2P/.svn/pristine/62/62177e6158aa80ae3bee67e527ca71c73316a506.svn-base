<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String path = request.getContextPath();
%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>金字塔 - 综合金融服务后台管理 - 意见反馈 - 修改</title>
 <base href="<%=path%>/">
<meta name="renderer" content="webkit">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" href="./css/x-admin.css" media="all"> 
	<style type="text/css">
		a:focus{text-decoration: none}
		a:focus{outline:none;}
	</style>
</head>

<body>
<div class="x-body">
  <form class="layui-form" id="form1" name="form1">
  <input type="hidden" name="id" value="${user.id }" >
    <div class="layui-form-item" >
    <label class="layui-form-label">用户名</label>
    <div class="layui-input-block">
      <input type="text" name="phone" id="title" value="${user.phone }"  required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
    </div>
  </div>
<div class="layui-form-item layui-form-text">
    <label class="layui-form-label">性别</label>
    <div class="layui-input-block">
      <input type="text" name="content"  value="${user.content }"  placeholder="请输入内容" class="layui-input"/>
    </div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">手机号</label>
    <div class="layui-input-block">
      <input type="text" name="time"   value="<f:formatDate value="${user.time }" pattern="yyyy-MM-dd HH:mm:ss"/>"    required  lay-verify="required" placeholder="请输入发表人" autocomplete="off" class="layui-input">
    </div>
  </div>
    <div class="layui-form-item">
      <label for="L_repass" class="layui-form-label"> </label>
      <button  class="layui-btn" lay-filter="add" lay-submit="" onclick="option();"> 修改 </button>
    </div>
  </form>
</div>
<script src="./lib/layui/layui.js" charset="utf-8">
        </script> 
<script src="./js/x-layui.js" charset="utf-8">
        </script> 
<script>
layui.use(['form','layer'], function(){
    $ = layui.jquery;
  var form = layui.form()
  ,layer = layui.layer;


  
  //  监听提交
  form.on('submit(add)', function(data){
    console.log(data);
    //发异步，把数据提交给php

        var data = new FormData($('#form1')[0]);  
        $.ajax({  
            url: 'opinion/update',  
            type: 'POST',  
            data: data,  
            cache: false,  
            processData: false,  
            contentType: false,
            success : function(data) {
				console.info(data);
				if(data=="success"){
					// 获得frame索引
                    var index = parent.layer.getFrameIndex(window.name);
                    //关闭当前frame    		                    
                   parent.layer.close(index);
                   window.parent.location.reload(); //刷新父页面
				}
				 
		
			}					
		
        });  
        return false;  
     
 
  });
  
  
  
});

            
            
            layui.use('laydate', function(){
            	 
            	 var laydate = layui.laydate;
            	 
            	 var start = {
            	 min: laydate.now()
            	 ,max: '2099-06-16 23:59:59',
            		 format: 'YYYY-MM-DD hh:mm:ss'
            	 ,istoday: false
            	 ,choose: function(datas){
            	  end.min = datas; //开始日选好后，重置结束日的最小日期
            	  end.start = datas //将结束日的初始值设定为开始日
            	 }
            	 };
            	 
            	 var end = {
            	 min: laydate.now()
            	 ,max: '2099-06-16 23:59:59'
            	 ,istoday: false
            	 ,choose: function(datas){
            	  start.max = datas; //结束日选好后，重置开始日的最大日期
            	 }
            	 };
            	 
            	 document.getElementById('time').onclick = function(){
            	 start.elem = this;
            	 laydate(start);
            	 }
            	 document.getElementById('LAY_demorange_e').onclick = function(){
            	 end.elem = this
            	 laydate(end);
            	 }
            	 
            	});


            
        </script>
</body>
</html>