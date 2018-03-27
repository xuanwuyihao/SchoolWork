<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    border-color: #0b6fce;;
    color: #333;
}
</style>
</head>
<body>
<input type="hidden" id="authentication" value="${authentication}">
<input type="hidden" id="isRegiste" value="${isRegiste}">
<div class="layui-tab layui-tab-brief" lay-filter="docDemoTabBrief">
  <ul class="layui-tab-title"> 
    <li class="layui-this">提现</li>
    <li>提现记录</li>
  </ul>
  <div class="layui-tab-content" style="height: 500px;">
    <div class="layui-tab-item layui-show"  style="margin-top: 30px;margin-left: -10px;">
    	<div style="border: 1px solid #f5c77f;background-color: #fff5db;height: 110px;padding-top: 20px;padding-left: 20px;line-height: 25px">
    		<i class="layui-icon" style="font-size: 15px; color: orange;">&#xe650;</i>
    		<b>温馨提示：</b> 
    		凡是在金字塔提现的用户，提现收取本金0.5%， 金字塔禁止信用卡套现、虚假交易 等行为,一经发现将予以处罚。
			<p style="margin-left: 20px">a）提现手续费由汇付收取，收取本金0.5%。</p>
			<p style="margin-left: 20px">b）请输入您要提现的金额，我们将在1至3个工作日(国家节假日除外)之内将钱转入您网站上填写的银行账号。</p>
			<p style="margin-left: 20px">c）每笔提现金额至少为100元以上。</p>
    	</div>
    	<div style="margin-top: 40px;margin-left: 30%">
    		<div>
	    		<span style="color:gray">持卡人：</span>
	    		<span>${userInfo.realname}</span>
    		</div>
    		<div style="margin-top: 30px;">
	    		<span style="color:gray;width: 10%;margin-left: -25px">可提现金额：</span>
	    		<span style="color:red;font-size: 16px;">${userMoney.needmoney}元</span>
    		</div>
    		<div style="margin-top: 30px;">
	    		<span style="color:gray;width: 10%;margin-left: -25px">提现至银行：</span>
	    		<input type="text" class="layui-input" style="width:40%;margin-top: -28px;margin-left: 60px;" value="${userBankcard.placebank} | ${userBankcard.bankcard}" disabled="disabled" >
    		</div>
    		<div style="margin-top: 30px;width: 100%;">
	    		<span style="color:gray;width: 10%;margin-left: -10px">提现金额：</span>
	    		<input type="text" id="liftmoney" name="" id="liftmoney" class="layui-input" style="width:40%;margin-top: -28px;margin-left: 60px;" placeholder="请输入提现金额">
	    		<input type="hidden" id="banktype" name="banktype" value="${userBankcard.placebank}">
				<input type="hidden" id="bankcord" name="bankcord" value="${userBankcard.bankcard}">
	    		<div style="margin-left: 53%;margin-top: -28px;color: gray;">元</div>
    		</div>
    		<div style="margin-top: 30px;">
	    		<span style="color:gray;width: 10%;margin-left: -10px">提现手续：</span>
	    		<span style="font-size: 16px;">0.5%</span>
    		</div>
    		<div style="margin-top: 30px;">
	    		<span style="color:gray;width: 10%;margin-left: -10px">手机号码：</span>
	    		<span style="font-size: 16px;" id="phone">${user.phone}</span>
    		</div>
    		<div style="margin-top: 30px;">
    			<span style="color:gray">验证码：</span>
    			<div>
    				<input type="text" id="code" name="code" class="layui-input" style="width:24%;margin-top: -28px;margin-left: 60px;" placeholder="请输入短信验证码" autocomplete="off">
    			</div>
    			<div>
    				<button id="obtain" class="layui-btn layui-btn-radius layui-btn-primary" style="margin-top: -38px;margin-left: 37%;">获取验证码</button>
    			</div>
    		</div>
    		<div style="margin-top: 30px;">
    			<button id="test1" class=" layui-btn layui-btn-primary layui-btn-lg" style="width: 280px">立即提现</button>
    		</div>
    	</div>
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
  {{#  if(d.oyh1=='提现成功'){ }}
   <i class="layui-icon" style="font-size: 20px; color: #F44336;position:absolute;left:12px;top:0px;">&#x1005;</i>提现成功  
  {{#  } else { }}
   <i class="layui-icon" style="font-size: 20px; color: #009E94;position:absolute;left:12px;top:0px;">&#x1007;</i>提现失败  
  {{#  } }}
</script>

<script>
layui.use('table', function(){
  var table = layui.table;
  
  //方法级渲染
  table.render({
    elem: '#LAY_table_user'
    ,url: 'finance/bankcard/withdrawalsRecord'
    ,cols: [[ //标题栏
    	   {field: 'id', title: 'ID',align:'center',width:80}
    	  ,{field: 'username', title: '账户名',align:'center'}
    	  ,{field: 'liftmoney', title: '提现金额',align:'center'}
    	  ,{field: 'liftfee', title: '提现收付费（提现金额*0.5%）',align:'center',}
    	  ,{field: 'bankcord', title: '提现银行卡号',align:'center',}
    	  ,{field: 'lefttime', title: '提现时间',templet:'<div>{{ Format(d.lefttime,"yyyy-MM-dd")}}</div>',align:'center'}
    	  ,{field: 'oyh1', title: '提现状态',align:'center',templet:'#stateTpl',}
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

<script type="text/javascript">
	var yzm='264356';
	$("#obtain").click(function(){
		var phone = $("#phone").text();
		/* $.post("finance/bankcard/proving",{phone: phone},function(result){
			var data= eval('('+result+')');
			yzm=data.code; */
			$("#obtain").attr("disabled", true);
			var i = 60;
			var timename = setInterval(function(){
				$("#obtain").text(i);
				i=i-1;
				if(i<0){
					window.clearInterval(timename)
					$("#obtain").attr("disabled", false);
					$("#obtain").text("获取验证码");
				}
			},1000);
			
		/* }); */
	});
</script>

<script type="text/javascript">
	$("#test1").click(function (){
		var liftmoney = $("#liftmoney").val();
		if(liftmoney==''){
			iosOverlay({
				text: "请输入提现金额",
				duration: 2e3,	
			});
			return;
		}
		var reg = /^([1-9]\d{0,9}|0)([.]?|(\.\d{1,2})?)$/;
		if(!(reg.test(liftmoney))){
			iosOverlay({
				text: "提现金额格式不正确",
				duration: 2e3,	
			});
			return;
		}
		if(liftmoney<100){
			iosOverlay({
				text: "提现金额不得小于100",
				duration: 2e3,	
			});
			return;
		}
		//alert(yzm);
		/* if(yzm==''){
			iosOverlay({
				text: "请先获取短信验证",
				duration: 2e3,	
			});
			return;
		} */
		var code = $("#code").val();
		if(code==''){
			iosOverlay({
				text: "请填写短信验证码",
				duration: 2e3,	
			});
			return;
		}
		if(code!=yzm){
			iosOverlay({
				text: "短信验证码不正确",
				duration: 2e3,	
			});
			return;
		}  
		var bankcord = $("#bankcord").val()
		var banktype = $("#banktype").val();
		
		$.post("finance/bankcard/withdrawals",{ liftmoney: liftmoney, banktype: banktype,bankcord: bankcord},function (result){
			if(result=='moneyLow'){
				iosOverlay({
					text: "余额不足，请修改金额",
					duration: 2e3,
				});
			}
			if(result=='error'){
				iosOverlay({
					text: "提现错误",
					duration: 2e3,
				});
				window.setTimeout(function(){
					location.reload();
				},3000);
			}
			if(result=='success'){
				iosOverlay({
					text: "提现成功",
					duration: 2e3,
				});
				window.setTimeout(function(){
					location.reload();
				},3000);
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
			 area: ['280px', '150px'],
			 btnAlign: 'c',
			 time : 0,
			 yes: function(index, layero){
				 	layer.close(index);
				 	top.location.href="finance/bankcard/openRegister";
				  }
		});
	});   
}
var isRegiste = $("#isRegiste").val();
if(isRegiste=='error'){
	layui.use('layer', function(){
		layer.msg('尚未注册易支付，<br/>请先注册易支付<br/>再进行操作！', {
			 btn: ['明白了'],
			 offset: ['100px','250px'],
			 area: ['280px', '150px'],
			 btnAlign: 'c',
			 time : 0,
			 yes: function(index, layero){
				 	layer.close(index);
				 	top.location.href="finance/bankcard/openRegister";
				  }
		});
	});   
}
</script>
</body>
</html>