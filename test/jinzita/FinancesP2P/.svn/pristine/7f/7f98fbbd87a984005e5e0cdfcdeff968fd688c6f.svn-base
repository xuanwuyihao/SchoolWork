<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String path = request.getContextPath();
%>
<base href="<%=path%>/">	
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="layui-v2.2.45/layui/css/layui.css" media="all">
<script src="layui-v2.2.45/layui/layui.js" charset="utf-8"></script>
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!--提示框样式-->
<link type="text/css" rel="stylesheet" href="css/iosOverlay.css">
<style type="text/css">
	li.layui-this:after, .layui-tab-brief>.layui-tab-title .layui-this:after {
    border: none;
    border-radius: 0;
    border-bottom: 2px solid red;
}
.layui-tab-brief>.layui-tab-title .layui-this {
    color: orange;
}
.layui-btn-primary:hover {
    border-color: black;
    color: #333;
}

</style>
</head>
<body>
<input type="hidden" id="authentication" value="${authentication}">
<input type="hidden" id="isRegiste" value="${isRegiste}">
<div class="layui-tab layui-tab-brief" lay-filter="docDemoTabBrief">
  <ul class="layui-tab-title"> 
    <li class="layui-this">充值</li>
    <li>充值记录</li>
  </ul>
  <div class="layui-tab-content" style="height: 500px;">
    <div class="layui-tab-item layui-show"  style="margin-top: 30px;margin-left: -10px;">
    	<div style="border: 1px solid #f5c77f;background-color: #fff5db;height: 60px;padding-top: 20px;padding-left: 20px;line-height: 25px">
    		<i class="layui-icon" style="font-size: 15px; color: orange;">&#xe650;</i>
    		<b>温馨提示：</b> 凡是在金字塔充值未投标的用户，15天以内提现收取本金0.5%，15天以后提现免费 金字塔禁止信用卡套现、虚假交易 等行为,一经发现将予以处罚,包括但不限于：限制收款、冻结账户、永久停止服务,并有可能影响相关信用记录。
    	</div>
    	<form class="layui-form" action="finance/bankcard/recordRecharge" target="_top">
	    	<div style="margin-top: 70px;margin-left: 170px;width: 100%">
	    		<div class="layui-form-item" style="width:50%;">
	    			<label class="layui-form-label">充值金额：</label>
	    			<div class="layui-input-inline" style="width:60%">
	      				<input type="text" id="money" name="money" class="layui-input" style="width:100%" name="password" required lay-verify="money" placeholder="请输入充值金额" autocomplete="off" >
	    			</div>
	    			<div class="layui-form-mid layui-word-aux">元</div>
	  			</div>
	  			<div class="layui-form-item" style="width:50%;margin-top: 40px">
	    			<label class="layui-form-label">充值类型：</label>
	    			<div class="layui-input-inline" style="width:20%;margin-top: -12px">
	      				<img src="img/logos.png"/>
	    			</div>
	  			</div>
	  			<div class="layui-form-item" style="width:50%;margin-top: 20px">
	    			<div class="layui-input-inline" style="width:100%;margin-left: 115px">
	      				 <button class="layui-btn layui-btn-danger" style="width: 60%" lay-submit lay-filter="recharge">立即充值</button>
	    			</div>
	  			</div>
	    	</div>
    	</form>
    </div>
    <div class="layui-tab-item" style="height: 500px;">
		<div class="demoTable" style="margin: 10px auto">
			<div class="layui-inline">
				<input class="layui-input test-item" type="text" id="time1" name="time1" style="padding-left: 40px">
				<i class="layui-icon" style="font-size: 25px;color:gray;position:absolute;left:10px;top:5px;">&#xe637;</i> 
			</div>
			<div class="layui-inline"  style="margin-left: 30px">
				至
			</div>
			<div class="layui-inline" style="margin-left: 30px">
				<input class="layui-input test-item" type="text" id="time2" name="time1" style="padding-left: 40px" placeholder="">
				<i class="layui-icon" style="font-size: 25px;color:gray;position:absolute;left:10px;top:5px;">&#xe637;</i> 
			</div>
			<div  class="layui-inline" style="margin-left: 30px"> 
				<button class="layui-btn layui-btn-primary" data-type="reload">
					<i class="layui-icon">&#xe615;</i>搜索
				</button>
			</div>
		</div>
		<div style="margin: 20px auto">
			<table class="layui-hide" id="LAY_table_user" lay-filter="user" ></table>
		</div>
	</div>
  </div>
</div> 
         
<script>
layui.use('element', function(){
  var $ = layui.jquery
  ,element = layui.element; //Tab的切换功能，切换事件监听等，需要依赖element模块  
});
</script>

<script type="text/html" id="stateTpl">
  {{#  if(d.status=='充值成功'){ }}
   <i class="layui-icon" style="font-size: 20px; color: #F44336;position:absolute;left:12px;top:0px;">&#x1005;</i>充值成功  
  {{#  } else { }}
   <i class="layui-icon" style="font-size: 20px; color: #009E94;position:absolute;left:12px;top:0px;">&#x1007;</i>充值失败  
  {{#  } }}
</script>

<script>
layui.use('table', function(){
  var table = layui.table;
  
  //方法级渲染
  table.render({
    elem: '#LAY_table_user'
    ,url: 'finance/bankcard/rechargeRecord'
    ,cols: [[ //标题栏
    	   {field: 'id', title: 'ID',align:'center',width:80}
    	  ,{field: 'username', title: '账户名',align:'center',width:180}
    	  ,{field: 'money', title: '充值金额',align:'center',width:180}
    	  ,{field: 'banktype', title: '充值所属银行',align:'center',width:120}
    	  ,{field: 'time', title: '充值时间',width:140,templet:'<div>{{ Format(d.time,"yyyy-MM-dd")}}</div>',align:'center'}
    	  ,{field: 'status', title: '充值状态',align:'center',templet:'#stateTpl',width:121}
    	]]
    ,id: 'testReload'
    ,page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
        layout: ['prev', 'page', 'next', 'skip','count'] //自定义分页布局
    //,curr: 5 //设定初始在第 5 页
    ,limit:10
    ,page:1
    ,theme: '#ff6600'
    ,groups: 2 //只显示 1 个连续页码
    ,first: false //不显示首页
    ,last: false //不显示尾页
    
  }
    
  });
  
  var $ = layui.$, active = {
    reload: function(){
      var time1 = $('#time1');
      var time2 = $('#time2');
      
      //执行重载
      table.reload('testReload', {
        page: {
          curr: 1 //重新从第 1 页开始
        }
        ,where: {
        	time1 : time1.val()
            ,time2 : time2.val()
        }
      });
    }
  };
  
  $('.demoTable .layui-btn').on('click', function(){
    var type = $(this).data('type');
    active[type] ? active[type].call(this) : '';
  });
});
</script>

<script>
layui.use('laydate', function(){
  var laydate = layui.laydate;
  
  lay('.test-item').each(function(){
	    laydate.render({
	      elem: this
	      ,trigger: 'click'
	    });
	  });
});	
</script>

<!-- 约束时间 -->
<script type="text/javascript">
function Format(datetime,fmt) {
	  if (parseInt(datetime)==datetime) {
	    if (datetime.length==10) {
	      datetime=parseInt(datetime)*1000;
	    } else if(datetime.length==13) {
	      datetime=parseInt(datetime);
	    }
	  }
	  datetime=new Date(datetime);
	  var o = {
	  "M+" : datetime.getMonth()+1,                 //月份   
	  "d+" : datetime.getDate(),                    //日   
	  "h+" : datetime.getHours(),                   //小时   
	  "m+" : datetime.getMinutes(),                 //分   
	  "s+" : datetime.getSeconds(),                 //秒   
	  "q+" : Math.floor((datetime.getMonth()+3)/3), //季度   
	  "S"  : datetime.getMilliseconds()             //毫秒   
	  };   
	  if(/(y+)/.test(fmt))   
	  fmt=fmt.replace(RegExp.$1, (datetime.getFullYear()+"").substr(4 - RegExp.$1.length));   
	  for(var k in o)   
	  if(new RegExp("("+ k +")").test(fmt))   
	  fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));   
	  return fmt;
}
</script>
<!-- 提示框 -->
<script type="text/javascript" src="js/iosOverlay.js"></script>
<script type="text/javascript" src="js/spin.min.js"></script>

<script>
//Demo
layui.use('form', function(){
  var form = layui.form;
  //监听提交
  form.on('submit(recharge)', function(data){
	  var money = $("#money").val();
	  if(money==''){
		  iosOverlay({
			  text: "请输入充值金额",
			  duration: 2e3,		
		  });
		 return false;
	  }
	  var reg = /^([1-9]\d{0,9}|0)([.]?|(\.\d{1,2})?)$/;
	   if(!(reg.test(money))){
		  iosOverlay({
			  text: "充值金额格式不正确",
			  duration: 2e3,		
		  });
		 return false;
	  } 
  });
     
});
</script>
<script type="text/javascript">
var authentication = $("#authentication").val();
if(authentication=='error'){
	layui.use('layer', function(){
		layer.msg('尚未身份验证，<br/>请先身份验证注册易支付<br/>再进行操作！', {
			 btn: ['明白了'],
			 offset: ['100px','250px'],
			 btnAlign: 'c',
			 time : 0,
			 yes: function(index, layero){
				 	layer.close(index);
				 	top.location.href="finance/bankcard/openRegister";
				  }
		});
		return;
	});   
}
var isRegiste = $("#isRegiste").val();
if(isRegiste=='error'){
	layui.use('layer', function(){
		layer.msg('尚未注册易支付，<br/>请先注册易支付<br/>再进行操作！', {
			 btn: ['明白了'],
			 offset: ['100px','250px'],
			
			 btnAlign: 'c',
			 time : 0,
			 yes: function(index, layero){
				 	layer.close(index);
				 	top.location.href="finance/bankcard/isExixt?phone="+${user.phone};
				  }
		});
	});   
}
</script>
</body>
</html>