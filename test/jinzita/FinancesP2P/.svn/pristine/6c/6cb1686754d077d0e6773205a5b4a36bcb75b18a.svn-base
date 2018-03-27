<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
<div class="layui-tab layui-tab-brief" lay-filter="docDemoTabBrief">
  <ul class="layui-tab-title"> 
    <li class="layui-this">消息中心</li>
  </ul>
  <div style="margin-top: 20px;">
  	<span class="layui-breadcrumb demoTable" lay-separator="|">
	  <a href="front/openMessage" >全部&nbsp;<span class="layui-badge" id="count1">${count1}</span></a>
	  <a href="front/openMessage?status=已读">已读&nbsp;<span class="layui-badge" id="count2">${count2}</span></a>
	  <a href="front/openMessage?status=未读">未读&nbsp;<span class="layui-badge" id="count3">${count3}</span></a>
	  <input id="status" type="hidden" value="${status}">
	</span>
  </div>
  <div class="layui-tab-content" style="height: 500px;">
    <div class="layui-tab-item layui-show"  style="margin-top: 15px;margin-left: -10px;">
    	<div class="layui-btn-group demoTable">
		  <button class="layui-btn  layui-btn-primary" data-type="del">删除</button>
		</div>
		<div class="layui-btn-group demoTable">  
		  <button class="layui-btn  layui-btn-primary" data-type="read">标为已读</button>
		</div>
		<div class="layui-btn-group demoTable">
		  
		  <button class="layui-btn  layui-btn-primary" data-type="noread">标为未读</button>
		</div>
		<div style="margin: 20px auto">
			<table class="layui-hide" id="LAY_table_user" lay-filter="user" ></table>
		</div>

    </div>
  </div>
</div> 
<script>
layui.use('element', function(){
  var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
  
  //监听导航点击
  element.on('nav(demo)', function(elem){
    //console.log(elem)
    layer.msg(elem.text());
  });
});
</script>         
<script type="text/html" id="stateTpl">
<input type="hidden" value="{{d.id}}">
<span>{{d.content}}</span> 
</script>

	</div>
	<div id="demo20"></div>
	<table id="biuuu_city_list" border="1">
	
</table>
</body>
<script type="text/javascript">
	var phone=$("#phone").val();
	var status = $("#status2").val();
	$.ajax({
		async : true,
		cache : true,
		url : 'front/user/Message',//自己的地址
		type : 'post',
		traditional : true,//传数组进后台需要设置该属性
		data : {

			'sender' : phone,
			'status' : status
		},
		success : function(data) {
			var data2 = eval(data);
			var data1 = data2.letterList;
			var lineall = data2.lineall;
			var readLineall = data2.readLineall;
			var unreadLineall = data2.unreadLineall;
			$("#lineall").text(lineall);
			$("#readLineall").text(readLineall);
			$("#unreadLineall").text(unreadLineall);
			layui.use(['laypage', 'layer'], function(){
				  var laypage = layui.laypage
				  ,layer = layui.layer;

				  //完整功能
				  laypage.render({
				    elem: 'demo7'
				    ,count: 100
				    ,layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
				    ,jump: function(obj){
				      console.log(obj)
				    }
				  });
				 
				  //将一段数组分页展示
				  
				  //测试数据
				 
				  
				  //调用分页
				  laypage.render({
				    elem: 'demo20'
				    ,count: data1.length
				    ,jump: function(obj){
				      //模拟渲染
				      document.getElementById('tcontent').innerHTML = function(){
				        var arr = []
				        ,thisData = data1.concat().splice(obj.curr*obj.limit - obj.limit, obj.limit);
				        layui.each(thisData, function(index, item){
				        	
							var id =item.id;
							var title = item.title;
							var oyh1 = item.oyh1;
							var sendpeople = item.sendpeople;
							var content = item.content;
							var time = new Date(item.time).toLocaleString();
							if(oyh1=='未读'){
								var html ="<tr align='center' data-toggle='modal' data-target='#myModal'><td width='2%'><input type='checkbox' id='ibs' value='"+id+"'></td><td width'10%'><div><span class='glyphicon glyphicon-envelope'></span></div><td width='20%'>"+sendpeople+"</td><td><span data-toggle='modal' id='title'>"+title+"</span></td><td width='30%'>"+time+"<input type='hidden' id='content' value='"+content+"'></td></tr>";
							}else{
								var html ="<tr align='center' data-toggle='modal' data-target='#myModal'><td width='2%'><input type='checkbox' id='ibs' value='"+id+"'></td><td width'10%'><div><img alt='' src='img/email.png' width='18px' height='18px'></div><td width='20%'>"+sendpeople+"</td><td><span data-toggle='modal' id='title'>"+title+"</span></td><td width='30%'>"+time+"<input type='hidden' id='content' value='"+content+"'></td></tr>";
							}
							
				          arr.push(html);
				        });
				        return arr.join('');
				      }();
				    }
				  });
				  
				});
		}
	});

	$("#del,#unread,#read").click(function() {

		var des = [];//建立数组
		var i = 0;
		$('input[id="ibs"]:checked').each(function() {
			var ibs_id = $(this).val();//取值

			des[i] = ibs_id;//赋值

			i++;
		});
		if (des.length == 0) {
			iosOverlay({
				text : "请至少勾选一个!",
				duration : 2e3,
			});
			return;
		}
		if ($(this).val() == 1) {
			
			
			$.ajax({


<script type="text/javascript">
var status = $("#status").val()

</script>

<script>
layui.use('table', function(){
  var table = layui.table;
  
  //方法级渲染
  table.render({
    elem: '#LAY_table_user'
    ,url: 'front/user/Message'
    ,where: {status: status}
    ,skin:'line'
    ,cols: [[ //标题栏
    		{field: 'id',type:'checkbox'}
    	  ,{field: 'sendpeople', title: '消息来源',align:'center',width:140}
    	  ,{field: 'title', title: '消息标题',templet:'#stateTpl',align:'center'}
    	  ,{field: 'time', title: '日期',width:140,templet:'<div>{{ Format(d.time,"yyyy-MM-dd")}}</div>',align:'center'}
    	]]
    ,id: 'testReload'
    ,page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
        layout: ['prev', 'page', 'next', 'skip','count'] //自定义分页布局
    //,curr: 5 //设定初始在第 5 页
    ,limit:10
    ,page:1
    ,theme: '#ff6600'
    ,groups: 3 //只显示 1 个连续页码
    ,first: false //不显示首页
    
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
  
  var $ = layui.$, active = {
		  del: function(){ //获取选中数据
			  var checkStatus = table.checkStatus('testReload'),
			  data = checkStatus.data;
		  	  if(data.length<1){
		  		  layer.msg('请至少选择一个');
		  		  return;
		  	  }
		  	  var ibs = new Array();
		  	  for(i=0;i<data.length;i++){
		  		  ibs[i] = data[i].id;
		  	  }
		  	  
		  	  $.ajax({
				 url:'letter/remall',				
				 traditional: true,//传数组进后台需要设置该属性
				 data:{
					'des':ibs,
					'status':'已读'
					},
				success:function(result){
					if(result=='success'){
						layer.alert('删除成功', {icon: 1,shade: 0},function(){
							location.reload();
						});
						 
					}
				},
			 });
		  },
		  read: function(){ //获取选中数目
			  var checkStatus = table.checkStatus('testReload'),
			  data = checkStatus.data;
		  	  if(data.length<1){
		  		  layer.msg('请至少选择一个');
		  		  return;
		  	  }
		  	 var ibs = new Array();
		  	  for(i=0;i<data.length;i++){
		  		  ibs[i] = data[i].id;
		  	  }
		  	  
		  	  $.ajax({
				 url:'letter/updateStatus',				
				 traditional: true,//传数组进后台需要设置该属性
				 data:{
					'des':ibs,
					'status':'已读'
					},
				success:function(result){
					if(result=='success'){
						layer.alert('修改成功', {icon: 1,shade: 0},function(){
							location.reload();
						});
					}
				},
			 });
	      },
	   	  noread: function(){ //验证是否全选
	   		 var checkStatus = table.checkStatus('testReload'),
			  data = checkStatus.data;
		  	  if(data.length<1){
		  		  layer.msg('请至少选择一个');
		  		  return;
		  	  }
		  	 var ibs = new Array();
		  	  for(i=0;i<data.length;i++){
		  		  ibs[i] = data[i].id;
		  	  }
		  	
		  	  $.ajax({
				 url:'letter/updateStatus',				
				 traditional: true,//传数组进后台需要设置该属性
				 data:{
					'des':ibs,
					'status':'未读'
					},
				success:function(result){
					if(result=='success'){
						layer.alert('修改成功', {icon: 1,shade: 0},function(){
							location.reload();
						});
					}
				},
			 });
	      },
	      allRead:function(){
	    	  var status = $("#status").val();
	    	  alert(status);
	    	  table.reload('testReload', {
	    	        where: {
	    	          key: {
	    	        	  status: '未读'
	    	          }
	    	        }
	    	      });
	      },
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
$(document).on('click', '.layui-table>tbody>tr', function (){
	var id = $(this).children('td:eq(2)').find("input").val()
	var title = $(this).children('td:eq(2)').text();
	var count = $(this).children('td:eq(2)').find("span").text();
	var ibs = new Array();
	ibs[0] = id; 
	alert(ibs);
	 layer.alert(count,{
		 title:title,
		 shade: 0,
		 anim: 5
	 },function(index){
		 $.ajax({
			 url:'letter/updateStatus',
			
			 traditional: true,//传数组进后台需要设置该属性
			 data:{
				'des':ibs,
				'status':'已读'
				},
			success:function(result){
				if(result=='success'){
					layer.close(index);
				}
			},
		 });
	 })	
	 
})  
</script>

</body>
</html>