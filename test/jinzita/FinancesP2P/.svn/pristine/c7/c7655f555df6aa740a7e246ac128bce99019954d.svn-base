<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    
    <head>
        <meta charset="utf-8">
        <title>
            金字塔 - 综合金融服务后台管理 - 管理员 - 修改
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
        <script type="text/javascript" src="js/jquery.min.js"></script>

		<style type="text/css">
			a:focus{text-decoration: none}
			a:focus{outline:none;}
		</style>
</head>

<body>
        <div class="x-body">
            <form class="layui-form" id="form1">
                <div class="layui-form-item">
                    <label for="username" class="layui-form-label">
                        <span class="x-red">*</span>登录名
                    </label>
                    <div class="layui-input-inline">
                    	<input type="hidden" name="id"  value="${manager.id }" />
                        <input type="text" id="username" name="username" required="" lay-verify="required" value="${manager.username }" 
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>将会成为您唯一的登入名
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="phone" class="layui-form-label">
                        <span class="x-red">*</span>手机
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="phone" value="${manager.phone }" name="phone" required="" lay-verify="phone"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="L_email" class="layui-form-label">
                        <span class="x-red">*</span>真实姓名
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="realname" name="realname" required="" lay-verify="realname" value="${manager.realname }"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="L_email" class="layui-form-label">
                        <span class="x-red">*</span>邮箱
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="L_email" name="email" required="" lay-verify="email" value="${manager.email }"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="role" class="layui-form-label">
                        <span class="x-red">*</span>角色
                    </label>
                    <div class="layui-input-inline">
                      <select name="role">
                        <option value="">请选择角色</option>
                        <c:forEach items="${roles }" var="ro">
	                        <c:choose>
					           <c:when test="${ro.rolename==manager.role}">
					                <option value="${ro.rolename }" selected >${ro.rolename }</option>
					           </c:when>
					           <c:otherwise>
					                <option value="${ro.rolename }"  >${ro.rolename }</option>
					           </c:otherwise>
				       	 	</c:choose> 
                        </c:forEach>
                      </select>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="L_repass" class="layui-form-label">
                    </label>
                    <button  class="layui-btn" lay-filter="save" lay-submit="">
                        保存
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
              form.on('submit(save)', function(data){
            	  console.log(data);
                  //发异步，把数据提交给后台
                  var data = new FormData($('#form1')[0]);  
                      $.ajax({  
                          url: 'manager/admin-update',  
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
              
        </script>
        
    </body>

</html>