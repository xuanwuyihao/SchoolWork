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
            金字塔 - 综合金融服务后台管理 - 轮播列表 - 修改
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
		
		<style type="text/css">
			a:focus{text-decoration: none}
			a:focus{outline:none;}
		</style>
</head>
    
 <body>
        <div class="x-body">
            <form class="layui-form" id="form1">
                <input type="hidden" id="id" name="id" value="${photo.id}"/>
                <div class="layui-form-item">
                    <label for="link" class="layui-form-label">
                        <span class="x-red">*</span>轮播图
                    </label>
                    <div class="layui-input-inline">
                      <div class="site-demo-upbar">
                       <input type="hidden" id="pd"/>
                       <input type="button" id="btn1" onclick="xdaTanFileImg.click();" value="请选择照片"><input type="text" id="input1" readonly="true" value="${photo.photo}"/>             
                       <input type="file" lable="Image File"  name="photo"  id="xdaTanFileImg" onchange="xmTanUploadImg(this)" style="display:none"/>
                      </div>
                    </div>
                </div>
                <div class="layui-form-item" style="height:190px;">
                    <label  class="layui-form-label">缩略图
                    </label>
                    <img id="xmTanImg" width="380" height="190" src="${photo.photo}"/>
                </div>
              
                <div class="layui-form-item">
                    <label for="link" class="layui-form-label">
                        <span class="x-red">*</span>链接
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="link" name="link" required="" lay-verify="required" value="${photo.link}"
                        autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="desc" class="layui-form-label">
                        <span class="x-red">*</span>描述
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="desc" name="desc" required="" lay-verify="required" value="${photo.description}" 
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="L_repass" class="layui-form-label">
                    </label>
                    <button  class="layui-btn" lay-filter="add" lay-submit="">
                                                   提交
                    </button>
                </div>
            </form>
        </div>
        <script src="./lib/layui/layui.js" charset="utf-8">
        </script>
        <script src="./js/x-layui.js" charset="utf-8">
        </script>
        <script type="text/javascript" src="./js/jquery.min.js"></script>
        <script type="text/javascript" src="./js/jquery.form.js"></script>
        <script>
            layui.use(['form','layer','upload'], function(){
                $ = layui.jquery;
              var form = layui.form()
              ,layer = layui.layer;


              //图片上传接口
              layui.upload({
                url: './upload.json' //上传接口
                ,success: function(res){ //上传成功后的回调
                    console.log(res.code);
                  $('#LAY_demo_upload').attr('src',res.url);
                }
              });
            

              //监听提交
              form.on('submit(add)', function(data){
               
            	var pd=$("#pd").val();     
            	
            	if(pd==1){//修改了图片
            		
            		 var option = {
            					type : "POST",
            					url : "photo/updatep",
            					data : {
            						
            						"id":"id",
            						"fileName":"photo",
            						"link":"link",
            						"desc":"desc"
            					
            					},
            					
            					success : function(data) {
            						console.info(data);
            						if(data=="success"){
            							
            							layer.msg('修改成功!',{icon:1,time:1000});        						
            							
            		                    setTimeout(function(){
            		                    	// 获得frame索引
                		                    var index = parent.layer.getFrameIndex(window.name);
                		                    //关闭当前frame
                		                    parent.layer.close(index);
                		                    window.parent.location.reload(); //刷新父页面
                		                    
                  		                },500);//延迟1000毫米
                  		                
            						}
            						 
            				
            					}					
            				};
            				
            				// ajax表单提交
            				$("#form1").ajaxSubmit(option);
            		
            		
            	}else{//没有修改图片
            		
            		 var option = {
         					type : "POST",
         					url : "photo/updatep",
         					data : {
         						
         						"id":"id",
         						"link":"link",
         						"desc":"desc"
         					
         					},
         					
         					success : function(data) {
         						console.info(data);
         						if(data=="success"){
         							
         							layer.msg('修改成功!',{icon:1,time:1000});        						
         							
         		                    setTimeout(function(){
         		                    	// 获得frame索引
             		                    var index = parent.layer.getFrameIndex(window.name);
             		                    //关闭当前frame
             		                    parent.layer.close(index);
             		                    window.parent.location.reload(); //刷新父页面
             		                    
               		                },500);//延迟1000毫米
               		                
         						}
         						 
         				
         					}					
         				};
         				
         				// ajax表单提交
         				$("#form1").ajaxSubmit(option);
            		
            	}
            	
            	  
            	  
            	  
            	  
                return false;
              });
              
              
            });
            
            //选择图片，马上预览
            function xmTanUploadImg(obj) {
            	
            	$("#pd").val(1);//选图片后标记
            	$("#input1").val(obj.value);
                var file = obj.files[0];
                var reader = new FileReader();
                
                //读取成功后进入该函数
                reader.onload = function (e) {
                    var img = document.getElementById("xmTanImg");
                    img.src = e.target.result;
                    //或者 img.src = this.result;  //e.target == this
                }

                reader.readAsDataURL(file)
            }       
            
        </script>
        
    </body>

</html>