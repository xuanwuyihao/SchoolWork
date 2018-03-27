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
<title>金字塔 - 综合金融服务后台管理 - 借款申请记录 - 修改</title>
 <base href="<%=path%>/">
<meta name="renderer" content="webkit">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" href="./css/x-admin.css" media="all"> 

</head>

<body>
<div class="x-body" >
	<form class="layui-form" id="form1" name="form1">
		<input type="text" name="id" id="id" value="${userinfo.id }"  required  lay-verify="required" autocomplete="off" class="layui-input" style="display: none;">
		<input type="text" name="userId" id="userId" value="${userinfo.userId }"  required  lay-verify="required" autocomplete="off" class="layui-input" style="display: none;">
	<input type="text" name="oyh1" id="oyh1" value="${userinfo.oyh1 }"  required  lay-verify="required" autocomplete="off" class="layui-input" style="display: none;">
		<input type="text" name="username" id="username " value="${username }"  required  lay-verify="required" autocomplete="off" class="layui-input" style="display: none;">
		<div class="layui-form-item" style="margin-right: 30px;margin-left: -10px;">
			<label class="layui-form-label">真实姓名</label>
			<div class="layui-input-block" style="width: 160px;">
				<input type="text" name="realname" id="realname"  value="${userinfo.realname }"  required  lay-verify="required" autocomplete="off" class="layui-input">
		  	</div>
		  	<label class="layui-form-label" style="margin-top: -35px;margin-left: 260px;">身份证</label>
			<div class="layui-input-block" style="width: 160px;margin-top: -38px;margin-left: 370px;">
				<input type="text" name="idcard" id="idcard"  value="${userinfo.idcard }"  required  lay-verify="required" autocomplete="off" class="layui-input">
		  	</div>
		</div>
		
		<div class="layui-form-item" style="margin-right: 30px;margin-left: -10px;">
		  	<label class="layui-form-label">出生年月</label>
			<%-- <div class="layui-input-block" style="width: 160px;">
				<input type="text" name="birthdate" id="birthdate"  value="<fmt:parseDate value="${userinfo.birthdate}" pattern="yyyy-MM-dd" var="test" /><fmt:formatDate value="${test}" pattern="yyyy-MM-dd"/> "  required  lay-verify="required" autocomplete="off" class="layui-input">
		  	</div> --%>
		  	<div class="layui-input-inline" style="width: 160px;">
                      <input class="layui-input"  name="birthdate" id="birthdate" value="<fmt:parseDate value="${userinfo.birthdate}" pattern="yyyy-MM-dd" var="test" /><fmt:formatDate value="${test}" pattern="yyyy-MM-dd"/> "  required  lay-verify="required" autocomplete="off" class="layui-input">
                    </div>
		  	
			<label class="layui-form-label" style="margin-top: -35px;margin-left: 260px;">性别</label>
			<div class="layui-input-block" style="width: 135px;margin-top: -38px;margin-left: 370px;">
				 <input type="radio" name="sex" id="sex" value="男"  <c:if test="${userinfo.sex=='男'}">checked</c:if> /><span class="layui-btn layui-btn-normal layui-btn-mini" style="margin-left: -20px;">男士</span>
			    <input type="radio" name="sex" id="sex1" value="女" <c:if test="${userinfo.sex=='女'}">checked</c:if> style="margin-left: 20px;"/><span class="layui-btn layui-btn-normal layui-btn-mini" style="margin-top: 0px;margin-left: -20px;">女士</span>
		  	</div>
		</div>
		
		<div class="layui-form-item" style="margin-right: 30px;margin-left: -10px;">
			<label class="layui-form-label">学历</label>
			<div class="layui-input-block" style="width: 160px;">
				<input type="text" name="education" id="education"  value="${userinfo.education}"  required  lay-verify="required" autocomplete="off" class="layui-input">
		  	</div>
		  	<label class="layui-form-label" style="margin-top: -35px;margin-left: 260px;">婚姻状态</label>
			<div class="layui-input-block" style="width: 135px;margin-top: -38px;margin-left: 370px;">
				 <input type="radio" name="marriage" id="marriage" value="已婚" <c:if test="${userinfo.marriage=='已婚'}">checked</c:if>  /><span class="layui-btn layui-btn-normal layui-btn-mini" style="margin-left: -20px;">是</span>
			    <input type="radio" name="marriage" id="marriage1" value="未婚" <c:if test="${userinfo.marriage=='未婚'}">checked</c:if> style="margin-left: 20px;"/><span class="layui-btn layui-btn-normal layui-btn-mini" style="margin-top: 0px;margin-left: -20px;">否</span>
		  	</div>
		</div>
		
		<div class="layui-form-item" style="margin-right: 30px;margin-left: -10px;">
			<label class="layui-form-label">毕业学校</label>
			<div class="layui-input-block" style="width: 160px;">
				<input type="text" name="school" id="school"  value="${userinfo.school }"  required  lay-verify="required" autocomplete="off" class="layui-input">
		  	</div>
			<label class="layui-form-label" style="margin-top: -35px;margin-left: 260px;">是否有子女</label>
			<div class="layui-input-block" style="width: 135px;margin-top: -38px;margin-left: 370px;">
				 <input type="radio" name="children" id="children" value="有" <c:if test="${userinfo.children=='有'}">checked</c:if>/><span class="layui-btn layui-btn-normal layui-btn-mini" style="margin-left: -20px;">是</span>
			    <input type="radio" name="children" id="children1" value="无" <c:if test="${userinfo.children=='无'}">checked</c:if> style="margin-left: 20px;"/><span class="layui-btn layui-btn-normal layui-btn-mini" style="margin-top: 0px;margin-left: -20px;">否</span>
		  	</div>
		</div>
		
		<div class="layui-form-item" style="margin-right: 30px;margin-left: -10px;">
		  <label class="layui-form-label">是否有房</label>
		  <div class="layui-input-block" style="width: 135px;margin-top: -38px;margin-left: 100px;">
				 <input type="radio" name="whetherhouse" id="whetherhouse" value="有" <c:if test="${userinfo.whetherhouse=='有'}">checked</c:if> /><span class="layui-btn layui-btn-normal layui-btn-mini" style="margin-left: -20px;">是</span>
			    <input type="radio" name="whetherhouse" id="whetherhouse1" value="无" <c:if test="${userinfo.whetherhouse=='无'}">checked</c:if>  style="margin-left: 20px;"/><span class="layui-btn layui-btn-normal layui-btn-mini" style="margin-top: 0px;margin-left: -20px;">否</span>
		  	</div>
		  <label class="layui-form-label" style="margin-top: -35px;margin-left: 150px;">是否有车</label>
		  <div class="layui-input-block" style="width: 135px;margin-top: -38px;margin-left: 370px;">
				 <input type="radio" name="whethercar" id="whethercar" value="有" <c:if test="${userinfo.whethercar=='有'}">checked</c:if> /><span class="layui-btn layui-btn-normal layui-btn-mini" style="margin-left: -20px;">是</span>
			    <input type="radio" name="whethercar" id="whethercar1" value="无" <c:if test="${userinfo.whethercar=='无'}">checked</c:if> style="margin-left: 20px;"/><span class="layui-btn layui-btn-normal layui-btn-mini" style="margin-top: 0px;margin-left: -20px;">否</span>
		  	</div>
		</div>

		<div class="layui-form-item" style="margin-right: 30px;margin-left: -10px;">
		  <label class="layui-form-label">籍贯省/市</label>
		  <div class="layui-input-block" style="width: 160px;">
				<input type="text" name="nativeplace" id="nativeplace"  value="${userinfo.nativeplace}"  required  lay-verify="required" autocomplete="off" class="layui-input">
		  	</div>
		  <label class="layui-form-label" style="margin-top: -35px;margin-left: 260px;">户口所在地</label>
		  <div class="layui-input-block" style="width: 160px;margin-top: -38px;margin-left: 370px;">
				<input type="text" name="hukaddress" id="hukaddress"  value="${userinfo.hukaddress }"  required  lay-verify="required" autocomplete="off" class="layui-input">
		  	</div>
		</div>

		<div class="layui-form-item" align="center">
		<c:if test="${userinfo.oyh1!='2' }">
				<button  class="layui-btn" lay-filter="add" lay-submit=""  > 修改 </button>
				
		  	
		  	</c:if>
		</div>
	</form>
</div>
        <script src="./lib/layui/layui.js" charset="utf-8"></script> 
        <script src="./js/x-layui.js" charset="utf-8"></script>
        
        <script type="text/javascript" src="./js/jquery.min.js"></script>
        <script type="text/javascript" src="./js/jquery.form.js"></script>
        

<script>
layui.use(['form','layer','laydate'], function(){
    $ = layui.jquery;
    laydate = layui.laydate;//日期插件
  var form = layui.form()
  ,layer = layui.layer;


  //  监听提交
  form.on('submit(add)', function(data){
	  
          				$.post("lendApplyInfo/updatebasic",$("#form1").serialize(),function (data){
          				  
          				  console.info(data);
          				if(data=="success"){
          					 layer.open({
          						 content: '修改成功!',
          						yes: function(layero, index){
          						    console.log(layero, index);
          						  window.parent.location.reload();
          						  }
          						}); 
          					
          				}
          			  });
          			
        return false;  
  });
  
  
  var start = {
          
          max: '2099-06-16 23:59:59'
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
        
        document.getElementById('birthdate').onclick = function(){
          start.elem = this;
          laydate(start);
        }

});
     
   
            function test(radio)
            {
            radio.checked=false;
            }

            
        </script>
</body>
</html>