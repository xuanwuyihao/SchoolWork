<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    
    <head>
        <meta charset="utf-8">
        <title>
            金字塔系统
        </title>
        <base href="<%=path%>/">
        <meta name="renderer" content="webkit">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta name="apple-mobile-web-app-status-bar-style" content="black">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="format-detection" content="telephone=no">
        <link rel="stylesheet" href="./css/x-admin.css" media="all">
        <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>

		<style type="text/css">
			a:focus{text-decoration: none}
			a:focus{outline:none;}
		</style>
</head>
    
<body>
        <div class="x-body">
            <form id="form1"  class="layui-form layui-form-pane">
            	<input type="hidden" name="id" value="${exanmine.id }">
                <div class="layui-form-item">
                    <label for="username" class="layui-form-label">
                        申请人
                    </label>
                    <div class="layui-input-inline">
                        <input type="text"  name="username" required lay-verify="required" value="${exanmine.username }"
                        autocomplete="off"  disabled="" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="username" class="layui-form-label">
                        申请额度
                    </label>
                    <div class="layui-input-inline">
                        <input type="text"  name="username" required lay-verify="required" value="${exanmine.applylimit }"
                        autocomplete="off"  disabled="" class="layui-input">
                    </div>
                </div>
                <div  class="layui-form-item">
                    <label for="username" class="layui-form-label">
                        审核额度
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" name="examinelimit" required lay-verify="required"
                        autocomplete="off"  class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item layui-form-text">
                    <label for="replay" class="layui-form-label">
                        回复
                    </label>
                    <div class="layui-input-block">
                        <textarea placeholder="不符合要求或通过" name="result" autocomplete="off"
                        class="layui-textarea" style="height: 60px;"></textarea>
                    </div>
                </div>
                <div class="layui-form-item">
                    <button class="layui-btn" key="set-mine" lay-filter="save" lay-submit="">
                        处理
                    </button>
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
            	   examinelimit: function(value){
                   if(value.length < 0){
                     return '审核额度不能为空';
                   }
                 },
                 result: function(value){
                     if(value.length < 0){
                       return '回复不能为空';
                     }
                   }
               });
              //监听提交
              form.on('submit(save)', function(data){
                console.log(data);
                //发异步，把数据提交给后台
                var data = new FormData($('#form1')[0]);  
                    $.ajax({  
                        url: 'user/examineEdit',  
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
    		                    layer.msg('已处理!',{icon:1,time:1000}); 
                                setTimeout(function(){
                              	  location.reload();
                                },500);		
    		                   window.parent.location.reload(); //刷新父页面
    						}
    					}					
                    });  
                    return false;  
              });
              
              
            });
        </script>
        
    </body>

</html>