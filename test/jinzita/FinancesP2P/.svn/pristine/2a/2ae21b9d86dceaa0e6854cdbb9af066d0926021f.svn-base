<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>
<head>
<title>阳光成单系统</title>
<base href="<%=path%>/">
<!-- <meta name="renderer" content="webkit">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no"> -->
<!-- <link rel="stylesheet" href="./css/x-admin.css" media="all">
<script src="./lib/layui/layui.js" charset="utf-8"></script>
<script src="./js/x-layui.js" charset="utf-8"></script> -->
<meta charset="utf-8">
<title>金字塔 - 综合金融服务后台管理系统 - 系统日志</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<link rel="stylesheet" href="layui-v2.2.45/layui/css/layui.css"
	media="all">
<script src="layui-v2.2.45/layui/layui.js" charset="utf-8"></script>
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<style type="text/css">
		a:focus{text-decoration: none}
		a:focus{outline:none;}
	</style>
</head>
<body>
<div style="margin-left: 20px;margin-top: 5px">
	<span class="layui-breadcrumb" lay-separator=">">
	  <a href="">首页</a>
	  <a href="">用户管理</a>
	  <a><cite>系统日志</cite></a>
	</span>
</div>
<hr width="100%">
<div class="layui-btn-group demoTable"  style="margin-left: 20px">
  <button id="allBtn" class="layui-btn  layui-btn-danger" data-type="getCheckData">
  	<i class="layui-icon" style="font-size: 20px; color: white;">&#xe640;</i>
  	批量删除
  </button>
</div>
<div style="margin-left: 20px">
	<table class="layui-hide" id="demo" lay-filter="demo"></table>
</div>
<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script>
$.post("back/sys-log",function(data){
	
	layui.use('table', function(){
		  var table = layui.table;
		  
		  //展示已知数据
		  table.render({
		    elem: '#demo'
		    ,cols: [[ //标题栏
		    	{type:'checkbox'}
		      ,{field: 'id', title: 'ID',width:60, sort: true}
		      ,{field: 'username', title: '用户名' ,Width:90}
		      ,{field: 'ipaddress', title: '登录IP地址',Width:490}
		      ,{field: 'logintime', title: '登录时间',Width:490}
		      ,{field: 'status', title: '状态',Width:90}
		      ,{fixed: 'right', width:68, align:'center',title:'操作', toolbar: '#barDemo'}
		    ]]
		    ,data: data
		    //,skin: 'line' //表格风格
		    ,even: true
		    ,page: {theme: '#1E9FFF'}  //是否显示分页
		    ,limits: [5, 7, 10]
		    ,limit: 10 //每页默认显示的数量
		    
		  });
		});
});
</script>
<script>
layui.use('table', function(){
	
  var table = layui.table;
 
  
//监听工具条
  table.on('tool(demo)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
    var data = obj.data; //获得当前行数据
    var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
    var tr = obj.tr; //获得当前行 tr 的DOM对象
  
    
    if(layEvent === 'del'){ //删除
      layer.confirm('真的删除行么', function(index){
    	  
        obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
        layer.close(index);
       	var i = data.id;
       	
       	var id = new Array();
       	id[0] = i;
       	
       $.ajax({
           url:"back/sysLog_del",
           type:"post",
           traditional: true,//传数组进后台需要设置该属性
           data:{
				
				'id':id
			
			},
           success:function(data){
               
           },
           error:function(e){
               alert("错误！！");
           }
       });        
      });
    } 
    
    
  });
});
</script>
<script>
layui.use('table', function(){
  var table = layui.table;
  //监听表格复选框选择
  table.on('checkbox(demo)', function(obj){
    console.log(obj)
  });
  
  var $ = layui.$, active = {
    getCheckData: function(){ //获取选中数据
      var checkStatus = table.checkStatus('demo'),
      data = checkStatus.data;
    if(data.length<1){
    	layer.msg('请至少选一个');
    	return;
    }
    	var id = new Array();
      for(i=0;i<data.length;i++){
    	  id[i] = data[i].id;
      }
      $.ajax({
          url:"back/sysLog_del",
          type:"post",
          traditional: true,//传数组进后台需要设置该属性
          data:{
				
				'id':id
			
			},
          success:function(data){
        	  layer.confirm('批量删除成功',function(){
        		  location.reload();
        	  });
        	  
          },
          error:function(e){
              alert("错误！！");
          }
      });        
    }
                         
   
  };
  
  $('#allBtn').on('click', function(){
    var type = $(this).data('type');
    active[type] ? active[type].call(this) : '';
  });
});
</script>
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
</body>
</html>
