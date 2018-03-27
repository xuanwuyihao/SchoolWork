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
		<style type="text/css">
			a:focus{text-decoration: none}
			a:focus{outline:none;}
		</style>
</head>

<body>
<div class="x-body" >
	<form class="layui-form" id="form1" name="form1">
		<input type="text" name="id" id="id" value="${lendApply.id }"  required  lay-verify="required" autocomplete="off" class="layui-input" style="display: none;">
		<div class="layui-form-item" style="margin-right: 30px;margin-left: -10px;">
			<label class="layui-form-label">用户名</label>
			<div class="layui-input-block" style="width: 160px;">
				<input type="text" name="username" id="username" readonly="true" value="${lendApply.username }"  required  lay-verify="required" autocomplete="off" class="layui-input layui-btn-disabled">
		  	</div>
		  	<label class="layui-form-label" style="margin-top: -35px;margin-left: 260px;">真实姓名</label>
			<div class="layui-input-block" style="width: 160px;;margin-top: -38px;margin-left: 370px;">
				<input type="text" name="realname" id="realname" readonly="true" value="${lendApply.realname }"  required  lay-verify="required" autocomplete="off" class="layui-input layui-btn-disabled">
		  	</div>
		</div>
		
		<div class="layui-form-item" style="margin-right: 30px;margin-left: -10px;">
			<label class="layui-form-label">联系电话</label>
			<div class="layui-input-block" style="width: 160px;;">
				<input type="text" name="phone" id="phone" readonly="true" value="${lendApply.phone }"  required  lay-verify="required" autocomplete="off" class="layui-input layui-btn-disabled">
		  	</div>
		  	<label class="layui-form-label" style="margin-top: -35px;margin-left: 260px;">性别</label>
			<div class="layui-input-block" style="width: 160px;margin-top: -38px;margin-left: 370px;">
				<input type="text" name="sex" id="sex" readonly="true" value="${lendApply.sex }"  required  lay-verify="required" autocomplete="off" class="layui-input layui-btn-disabled">
		  	</div>
		</div>
		
		<div class="layui-form-item" style="margin-right: 30px;margin-left: -10px;">
			<label class="layui-form-label">期限</label>
			<div class="layui-input-block" style="width: 160px;;">
			  	<c:if test="${lendApply.status=='已处理' }">
			  		<input type="text" name="lendtime" id="lendtime" readonly="true" value="${lendApply.lendtime }"  required  lay-verify="required" autocomplete="off" class="layui-input layui-btn-disabled">
			  	</c:if>
			  	<c:if test="${lendApply.status=='未处理' }">
				  	<c:if test="${lendApply.lendtime=='' || lendApply.lendtime==null }">
				  		<select class="fid" name="lendtime" id="lendtime" clientidmode="Static" lay-search>
	                        <option value="0" <c:if test="${lendApply.lendtime==null }">selected</c:if> >-请选择-</option>
	                        <option value="1" <c:if test="${lendApply.lendtime==1 }">selected</c:if> >一个月 </option>
	                        <option value="2" <c:if test="${lendApply.lendtime==2 }">selected</c:if>>两个月</option>
	                        <option value="3" <c:if test="${lendApply.lendtime==3 }">selected</c:if>>三个月</option>
	                        <option value="4" <c:if test="${lendApply.lendtime==4 }">selected</c:if>>四个月</option>
	                        <option value="5" <c:if test="${lendApply.lendtime==5 }">selected</c:if>>五个月</option>
	                        <option value="6" <c:if test="${lendApply.lendtime==6 }">selected</c:if>>六个月</option>
	                    </select>
				  	</c:if>
					<c:if test="${lendApply.lendtime!='' && lendApply.lendtime!=null }">
					    <select class="fid" name="lendtime" id="lendtime" clientidmode="Static" lay-search>
	                        <option value="1" <c:if test="${lendApply.lendtime==1 }">selected</c:if> >一个月 </option>
	                        <option value="2" <c:if test="${lendApply.lendtime==2 }">selected</c:if>>两个月</option>
	                        <option value="3" <c:if test="${lendApply.lendtime==3 }">selected</c:if>>三个月</option>
	                        <option value="4" <c:if test="${lendApply.lendtime==4 }">selected</c:if>>四个月</option>
	                        <option value="5" <c:if test="${lendApply.lendtime==5 }">selected</c:if>>五个月</option>
	                        <option value="6" <c:if test="${lendApply.lendtime==6 }">selected</c:if>>六个月</option>
	                    </select>
					</c:if>
				</c:if>
			</div>
		  	<label class="layui-form-label" style="margin-top: -35px;margin-left: 260px;">借款标题</label>
			<div class="layui-input-block" style="width: 160px;;margin-top: -38px;margin-left: 370px;">
				<input type="text" name="title" id="title" readonly="true" value="${lendApply.title }"  required  lay-verify="required" autocomplete="off" class="layui-input layui-btn-disabled">
		  	</div>
		</div>
		
		<div class="layui-form-item" style="margin-right: 30px;margin-left: -10px;">
			<label class="layui-form-label">申请时间</label>
			<div class="layui-input-block" style="width: 160px;;">
				<input type="text" name="applytime" id="applytime" readonly="true" value="<fmt:formatDate value='${lendApply.applytime }' pattern='yyyy-MM-dd HH:mm:ss' />"  required  lay-verify="required" autocomplete="off" class="layui-input layui-btn-disabled">
		  	</div>
			<label class="layui-form-label" style="margin-top: -35px;margin-left: 260px;">还款方式</label>
			<div class="layui-input-block" style="width: 160px;;margin-top: -38px;margin-left: 370px;">
				<input type="text" name="backType" id="backType" readonly="true" value="${lendApply.backType }"   required  lay-verify="required" autocomplete="off" class="layui-input layui-btn-disabled">
		  	</div>
		</div>
		
		<div class="layui-form-item" style="margin-right: 30px;margin-left: -10px;">
			<label class="layui-form-label">标的类型</label>
			<div class="layui-input-block" style="width: 160px;;">
				<input type="text" name="tupe" id="tupe" readonly="true" value="${lendApply.tupe }"  required  lay-verify="required" autocomplete="off" class="layui-input layui-btn-disabled">
		  	</div>
		  	<label class="layui-form-label" style="margin-top: -35px;margin-left: 260px;">利率</label>
		    <div class="layui-input-block" style="width: 160px;margin-top: -38px;margin-left: 370px;">
		  		<input type="text" name="rate" id="rate" readonly="true" value="${lendApply.rate }"  required  lay-verify="required" autocomplete="off" class="layui-input layui-btn-disabled">
		    </div>
		</div>

		<div class="layui-form-item" style="margin-right: 30px;margin-left: -10px;">
		  <label class="layui-form-label">借款金额</label>
		  <div class="layui-input-block" style="width: 160px;">
		  <c:if test="${lendApply.status=='已处理' }">
		  	<input type="text" name="lendmoney" id="lendmoney" readonly="true" value="${lendApply.lendmoney }"  required  lay-verify="required" autocomplete="off" class="layui-input layui-btn-disabled">
		  </c:if>
		  <c:if test="${lendApply.status=='未处理' }">
		    <c:if test="${lendApply.lendmoney=='' || lendApply.lendmoney==null }">
				<input type="text" name="lendmoney" id="lendmoney" value=""  required  lay-verify="required" autocomplete="off" class="layui-input">
			</c:if>
			<c:if test="${lendApply.lendmoney!='' && lendApply.lendmoney!=null }">
				<input type="text" name="lendmoney" id="lendmoney" value="${lendApply.lendmoney }"  required  lay-verify="required" autocomplete="off" class="layui-input">
			</c:if>
		  </c:if>
		  </div>
		  <label class="layui-form-label" style="margin-top: -35px;margin-left: 260px;">状态</label>
		  <div class="" style="width: ;margin-top: -35px;margin-left: 370px;">
		    <c:if test="${lendApply.status=='已处理' }">
				<input type="radio" name="status" id="status" value="未处理" disabled/><span class="layui-btn layui-btn-normal layui-btn-mini" style="margin-left: -20px;">未处理</span> 
			    <input type="radio" name="status" id="status1" value="已处理" checked="checked" disabled style="margin-left: 20px;"/><span class="layui-btn layui-btn-normal layui-btn-mini" style="margin-top: 0px;margin-left: -20px;">已处理</span>
			</c:if>
			<c:if test="${lendApply.status=='未处理' }">
			    <input type="radio" name="status" id="status" value="未处理" checked="checked"/><span class="layui-btn layui-btn-normal layui-btn-mini" style="margin-left: -20px;">未处理</span>
			    <input type="radio" name="status" id="status1" value="已处理" style="margin-left: 20px;"/><span class="layui-btn layui-btn-normal layui-btn-mini" style="margin-top: 0px;margin-left: -20px;">已处理</span>
			</c:if>
		  </div>
		</div>

		<div class="layui-form-item" style="margin-left: 220px;">
			<c:if test="${lendApply.status=='已处理' }">
				<button  class="layui-btn layui-btn-disabled" lay-filter="add" lay-submit="" disabled="disabled"> 修改 </button>
				<button  class="layui-btn" lay-filter="add" lay-submit="" onclick="closeWin();"> 取消 </button>		  	
			</c:if>
		  	<c:if test="${lendApply.status=='未处理' }">

				<button  class="layui-btn" lay-filter="add" lay-submit="" > 修改 </button>
				<button  class="layui-btn" lay-filter="add" lay-submit="" onclick="closeWin();"> 取消 </button>

		  	</c:if>
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
//     console.log(data);
    //发异步，把数据提交给php
        var id = $("#id").val();
		var username = $("#username").val();
		var realname = $("#realname").val();
 		var phone = $("#phone").val();
 		var sex = $("#sex").val();
 		var tupe = $("#tupe").val();
 		var title = $("#title").val();
 		var applytime = $("#applytime").val();
 		var lendmoney = $("#lendmoney").val();
 		var lendmoney = $("#lendmoney").val();
 		var backType = $("#backType").val();
 		var rate = $("#rate").val();
 		var lendtime = $('#lendtime option:selected') .val();
 		var status = $("input[type='radio']:checked").val();
 		
        $.ajax({ 
            url: 'lendApply/lendApply-update2',  
            type: 'POST',
            
            data: {
            	id:id,
            	username:username,
            	realname:realname,
				phone:phone,
				sex:sex,
				tupe:tupe,
				title:title,
				lendmoney:lendmoney,
				backType:backType,
				rate:rate,
				lendtime:lendtime,
				status:status,
				oyh1:applytime,
			}, 
			cache: false, 
//             processData: false,  
//             contentType: false,
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
            	 
//             	 document.getElementById('time').onclick = function(){
//             	 start.elem = this;
//             	 laydate(start);
//             	 }
//             	 document.getElementById('LAY_demorange_e').onclick = function(){
//             	 end.elem = this
//             	 laydate(end);
//             	 }
            	 
            	});
            function test(radio)
            {
            radio.checked=false;
            }

            function closeWin() {
            	// 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame    		                    
               parent.layer.close(index);
            }
        </script>
</body>
</html>