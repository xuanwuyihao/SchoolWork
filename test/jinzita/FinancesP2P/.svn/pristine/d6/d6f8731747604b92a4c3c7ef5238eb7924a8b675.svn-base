<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>金字塔 - 综合金融服务后台管理 - 标的管理 - 删除</title>
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
  <form class="layui-form" action="notice/notice-add">
    <div class="layui-form-item" >
    <label class="layui-form-label">标题</label>
    <div class="layui-input-block">
      <input type="text" name="title" required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
    </div>
  </div>


<div class="layui-form-item layui-form-text">
    <label class="layui-form-label">内容</label>
    <div class="layui-input-block">
      <textarea name="content" placeholder="请输入内容" class="layui-textarea"></textarea>
    </div>
  </div>


<div class="layui-form-item">
    <label class="layui-form-label">发表人</label>
    <div class="layui-input-block">
      <input type="text" name="people" required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
    </div>
  </div>

    <div class="layui-form-item">
      <label for="L_repass" class="layui-form-label"> </label>
      <button  class="layui-btn" lay-filter="add" lay-submit=""> 增加 </button>
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
            
              //自定义验证规则
              form.verify({
                nikename: function(value){
                  if(value.length < 5){
                    return '昵称至少得5个字符啊';
                  }
                }
                ,pass: [/(.+){6,12}$/, '密码必须6到12位']
                ,repass: function(value){
                    if($('#L_pass').val()!=$('#L_repass').val()){
                        return '两次密码不一致';
                    }
                }
              });

              //监听提交
              form.on('submit(add)', function(data){
            	  
            	   
                console.log(data);
                //发异步，把数据提交给php
                layer.alert(document.getElementById('add').submit(), {icon: 6},function () {
                    // 获得frame索引
                    var index = parent.layer.getFrameIndex(window.name);
                    //关闭当前frame
                    
                   parent.layer.close(1);
                   
                });
                return false;
              });
              

            
              
              
              
              
              
              
            });
        </script>
</body>
</html>