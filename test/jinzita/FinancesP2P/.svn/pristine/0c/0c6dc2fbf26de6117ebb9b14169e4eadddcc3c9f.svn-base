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
<script  src='https://cdnjs.cloudflare.com/ajax/libs/clipboard.js/1.7.1/clipboard.min.js' > </script >
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
<div class="layui-tab layui-tab-brief" lay-filter="docDemoTabBrief">
  <ul class="layui-tab-title"> 
    <li class="layui-this">推荐好友</li>
    <li>推荐列表</li>
  </ul>
  <div class="layui-tab-content" style="height: 500px;">
    <div class="layui-tab-item layui-show"  style="margin-top: 30px;margin-left: -10px;">
    	<div >
    		<img alt="" src="images/enInvitingFriends.jpg" style="width: 896px;height: 360px;" >
    	</div>
    	<div style="margin-top: 20px;">
    		<img alt="" src="images/lang1.png"  style="width: 70%"> 
    		<!-- <span style="color: red;font-size: 32px;">邀请好友，让我们一起玩转金融</span> -->
    	</div>
    	<div style="margin-top: 10px;margin-left: 10px;line-height: 26px;">
    		<p style="font-size: 15px;">
    		<span>尊敬的用户，您的推荐号为：</span>
    		<span style="color: #ffa13d">${user.phone}</span>
    		</p>
    		<p>
    			<span style="color:#777;">活动时间：</span>
    			<span style="color:#f84015;font-size: 15px;"><b>无限期，永久有效；</b></span>
    		</p>
    		<p>
    			<span style="color:#777;">活动对象：</span>
    			<span style="color:#777">金字塔注册用户；</span>
    		</p>
    		<p>
    			<span style="color:#777;">活动说明：</span>
    			<span style="color:#777">金字塔P2P金融服务平台是随着互联网发展兴起而发展起来的一种全新金融模式平台，这种新模式也是未来金融服务发展的趋势，将金字塔平台分享给身边朋友，让我们一起领先潮流。</span>
    		</p>
    		<p>
    			<span style="color:#f84015;">注：</span>
    			<span style="color:#777">需将自己的邀请链接地址或推荐号发给您的好友，这样您才能成为他的邀请者。</span>
    		</p>
    	</div>
    	<div style="margin-top: 20px;margin-left: 12px;">
	    	<div class="layui-input-inline" style="width:65%;">
	    		<input type="text"   class="layui-input" style="width:100%" disabled="disabled">
	    		<div style="margin-top: -25px;margin-left: 10px;color:gray;width: 100%"><span id="link">http://localhost:8080/FinancesP2P/user/openRegister?referrerno=${user.phone}</span></div>
		    </div>
		    <div style="margin-left: 65%;margin-top: -29px;">
		    	<button class="layui-btn layui-btn-normal" data-clipboard-action="copy" id="copyBtn" data-clipboard-target="#link">复制链接</button>
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


<script>
layui.use('table', function(){
  var table = layui.table;
  
  //方法级渲染
  table.render({
    elem: '#LAY_table_user'
    ,url: 'front/user/invitingFriends'
    ,cols: [[ //标题栏
    	   {field: 'id', title: 'ID',align:'center',width:80}
    	  ,{field: 'referrerno', title: '推荐人',align:'center'}
    	  ,{field: 'byReferrerno', title: '被推荐人',align:'center'}
    	  ,{field: 'awardtime', title: '用户创建时间',templet:'<div>{{ Format(d.awardtime,"yyyy-MM-dd")}}</div>',align:'center'}
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

<script>
    var clipboard = new Clipboard('#copyBtn');

    clipboard.on('success', function(e) {
        console.log(e);
		alert("复制成功");
    });

    clipboard.on('error', function(e) {
        console.log(e);
    });
</script>
</body>
</html>