<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    
    <head>
        <meta charset="utf-8">
        <title>
            金字塔 - 综合金融服务后台管理 -  - 
        </title>
        <base href="<%=path%>/">
        <meta name="renderer" content="webkit">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">        
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta name="apple-mobile-web-app-status-bar-style" content="black">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="format-detection" content="telephone=no">
        <!-- <link rel="stylesheet" href="layui-v2.2.45/layui/css/layui.css"  media="all"> -->
        <link rel="stylesheet" href="./css/x-admin.css" media="all">
     	
    </head>
    
    <body>
<div class="x-body">
 
     <form nam="form1" id="form1" >
 
    <input type="text" name="id" id="id" value="${lendApplyInfo.id }"   autocomplete="off" class="layui-input" style="display: none;">
    <div class="layui-form-item">
      <label for="L_username" class="layui-form-label">身份证 </label>
      <div class="layui-input-inline">
      
      <c:if test="${list.cardphoto==null || list.cardphoto=='' }">
      <input type="file" name="file1"  id="xdaTanFileImg" onchange="xmTanUploadImg(this)"/>
       </c:if>      
       
        <c:if test="${list.cardphoto!=null && list.cardphoto!=''}">
      
      <input type="button" id="btn1" onclick="xdaTanFileImg.click();" value="请选择照片">
      <input type="text" id="input1" readonly="true" value="${list.cardphoto}"/>             
     <input type="file" lable="Image File"  name="file1"  id="xdaTanFileImg" onchange="xmTanUploadImg(this)" style="display:none"/>
     
       </c:if>       
      </div>
       <div class="layui-form-item">
                    <label  class="layui-form-label">缩略图
                    </label>
                    <img id="xmTanImg" width="100" src="${list.cardphoto}">
                </div>
    </div>
  
  <div class="layui-form-item">
      <label for="L_username" class="layui-form-label">营业执照 </label>
      <div class="layui-input-inline">
      <c:if test="${list.license==null || list.license=='' }">
      <input type="file" name="file1"  id="yinyeFileImg" onchange="yinyeUploadImg(this)"/>
       </c:if>    
      
      <c:if test="${list.license!=null && list.license!=''}">
       <input type="button" id="btn2" onclick="yinyeFileImg.click();" value="请选择照片">
        <input type="text" id="input2" readonly="true" value="${list.license}"/> 
      <input type="file" name="file1" id="yinyeFileImg" onchange="yinyeUploadImg(this)" style="display:none"/>
        </c:if>
                        
      </div>
       <div class="layui-form-item">
                    <label  class="layui-form-label">缩略图
                    </label>
                    <img id="yinyeImg" width="100" src="${list.license}">
                </div>
    </div>
    
    <div class="layui-form-item">
      <label for="L_username" class="layui-form-label">银行账户</label>
      <div class="layui-input-inline">
      <c:if test="${list.backaccount==null || list.backaccount=='' }">
      <input type="file" name="file1"  id="backaccountFileImg" onchange="backaccountUploadImg(this)"/>
       </c:if>    
      
      <c:if test="${list.backaccount!=null && list.backaccount!=''}">
       <input type="button" id="btn3" onclick="backaccountFileImg.click();" value="请选择照片">
        <input type="text" id="input3" readonly="true" value="${list.backaccount}"/> 
      <input type="file" name="file1" id="backaccountFileImg" onchange="backaccountUploadImg(this)" style="display:none"/>
        </c:if>
                        
      </div>
       <div class="layui-form-item">
                    <label  class="layui-form-label">缩略图
                    </label>
                    <img id="backaccountImg" width="100" src="${list.backaccount}">
                </div>
    </div>
    <div class="layui-form-item">
    <c:if test="${lists!='1'}">
      <label for="L_repass" class="layui-form-label"> </label>
      <button class="layui-btn" lay-filter="add" lay-submit="">增加 </button>
      </c:if>
    </div> 
   </form>
</div>
	<!-- <script src="layui-v2.2.45/layui/layui.js" charset="utf-8"></script> -->
      <script src="./lib/layui/layui.js" charset="utf-8"></script> 
        <script src="./js/x-layui.js" charset="utf-8"></script>
        
        <script type="text/javascript" src="./js/jquery.min.js"></script>
        <script type="text/javascript" src="./js/jquery.form.js"></script>
        
     
        
        <script>
     
        layui.use(['form','layer','upload'], function(){
            $ = layui.jquery;
            var form = layui.form()
            ,layer = layui.layer,
            upload = layui.upload;
            
            
            
          
          //监听提交
            form.on('submit(add)', function(data){
    
          		 var option = {
          					type : "POST",
          					url : "lendApplyInfo/text",
          					data : {
          						"id":"id",
          						"file":"file1"
          					},
          					
          					success : function(data) {
          						
          						console.info(data);
          						if(data=="succees"){
          					
          							layer.open({
          							  title: '提示'
          							  ,content: '修改成功',
          								yes: function(layero, index){
                  						    console.log(layero, index);
                  						  window.parent.location.reload();
                  						  }
          							});     
          						}
          					}					
          				};
          				
          				// ajax表单提交
          				$("#form1").ajaxSubmit(option);
          		
          				return false;
            });
          
            
          }); 
          
          
          //选择图片，马上预览
          function xmTanUploadImg(obj) {
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

          function yinyeUploadImg(obj) {
              var file = obj.files[0];
              var reader = new FileReader();
              
              //读取成功后进入该函数
              reader.onload = function (e) {
                  var img = document.getElementById("yinyeImg");
                  img.src = e.target.result;
                  //或者 img.src = this.result;  //e.target == this
              }

              reader.readAsDataURL(file)
          } 
          
          function backaccountUploadImg(obj) {
              var file = obj.files[0];
              var reader = new FileReader();
              
              //读取成功后进入该函数
              reader.onload = function (e) {
                  var img = document.getElementById("backaccountImg");
                  img.src = e.target.result;
                  //或者 img.src = this.result;  //e.target == this
              }

              reader.readAsDataURL(file)
          } 
            
        </script> 
        
    </body>

</html>