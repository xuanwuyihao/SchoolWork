<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>金字塔 - 综合金融服务后台管理 - 媒体报道</title>
<base href="<%=path%>/">
<meta name="renderer" content="webkit">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" href="./css/x-admin.css" media="all">

<style type="text/css">
a:focus {
	text-decoration: none
}

a:focus {
	outline: none;
}
</style>
</head>
<body>
	<!--  <script type="text/javascript">
    $('#cha').click(function(){
    	var bt1=$('#bt').val();
    	
    	$.ajax({
    		url:"media/fuzzy",
    		dataType:"json",
    		data:{bt:'bt1'},
    		type:"post",
    		success:function(data){
    			
    			location.reload();//重新加载本页面
    		}
    	});
    });
    </script>  -->
	<div class="x-nav">
		<span class="layui-breadcrumb"> <a><cite>首页</cite></a> <a><cite>宣传管理</cite></a>
			<a><cite>媒体报道</cite></a>
		</span> <a class="layui-btn layui-btn-small"
			style="line-height: 1.6em; margin-top: 3px; float: right"
			href="media/list" title="刷新"><i class="layui-icon"
			style="line-height: 30px">ဂ</i></a>
	</div>
	<div class="x-body">
		<!-- <form class="layui-form x-center" action="" style="width:800px"> -->
		<div class="layui-form-pane" style="margin-top: 15px;">
			<div class="layui-form-item">
				<label class="layui-form-label">日期范围</label>
				<div class="layui-input-inline">
					<input class="layui-input" placeholder="开始日" id="LAY_demorange_s">
				</div>
				<div class="layui-input-inline">
					<input class="layui-input" placeholder="截止日" id="LAY_demorange_e">
				</div>

				<form action="media/fuzzy" method="post" id="gg">
					<div class="layui-input-inline">
						<input type="text" name="title" value="${tt}" placeholder="请输入标题名"
							autocomplete="off" class="layui-input" id="bt">
					</div>

					<div class="layui-input-inline" style="width: 80px">
						<button class="layui-btn" type="submit" lay-filter="sreach"
							id="cha" onclick="Clicked()">
							<i class="layui-icon">&#xe615;</i>
						</button>
					</div>
					<input type="hidden" id="dq1" name="dq1" /> <input type="hidden"
						id="pdmhfycx" name="pdmhfycx" />

				</form>
			</div>
		</div>
		<!--   </form> -->
		<xblock>
		<button class="layui-btn layui-btn-danger" onclick="delAll()">
			<i class="layui-icon">&#xe640;</i>批量删除
		</button>
		<button class="layui-btn" href=""
			onclick="member_add('添加用户','back/member-add','600','500')">
			<i class="layui-icon">&#xe608;</i>添加
		</button>
		<span class="x-right" style="line-height: 40px">共有数据：${count} 条</span></xblock>
		<input type="hidden" id="numberall " value="${count} " />



		<table class="layui-table" id="grd">
			<thead>
				<tr>
					<th><input type="checkbox" name="" value="0"></th>
					<th>ID</th>
					<th>标题</th>
					<th>内容</th>
					<th>图片</th>
					<th>时间</th>
					<th>新闻地址</th>

					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${userList}" var="m">
					<tr id="tr_1">
						<td><input type="checkbox" value="${m.id }" name="test"
							onclick="checkboxOnclick(this)"></td>
						<td id="ids" class="i">${m.id }</td>
						<td id="title">${m.title }</td>
						<td id="content">${m.content }
						<td id="photo">${m.photo }</td>
						<td id="time"><fmt:formatDate value="${m.time }"
								pattern="yyyy-MM-dd HH:mm:ss" /></td>
						<td id="address">${m.address }</td>
						<td class="td-manage"><a title="编辑" href="javascript:;"
							onclick="member_edit('编辑','member-edit.html','${m.id }','600','510')"
							class="ml-5" style="text-decoration: none"> <i
								class="layui-icon">&#xe642;</i>
						</a> <a title="删除" onclick="member_del(this,${m.id })"
							style="text-decoration: none"> <i class="layui-icon">&#xe640;</i>
						</a></td>
					</tr>
				</c:forEach>


				<input type="hidden" id="dq" value="${dq}" />
				<input type="hidden" id="zy" value="${zy}" />
				<input type="hidden" id="pdmhfy" value="${pdmhfy}" />
			</tbody>
		</table>

		<div id="page"></div>
	</div>
	<script src="./lib/layui/layui.js" charset="utf-8"></script>
	<script src="./js/x-layui.js" charset="utf-8"></script>




	<script>
      
        var clkBool=true;
        function Clicked(){
        	clkBool=false;
        } 
   
            layui.use(['laydate','element','laypage','layer'], function(){
                $ = layui.jquery;//jquery
              laydate = layui.laydate;//日期插件
              lement = layui.element();//面包导航
              laypage = layui.laypage;//分页
              layer = layui.layer;//弹出层
          
              //以上模块根据需要引入
            
              laypage({
                cont: 'page'
                ,pages: $("#zy").val()
                ,first: 1
                ,last:$("#zy").val()
                ,curr:$("#dq").val()
                ,prev: '<em><</em>'
                ,next: '<em>></em>'
                ,jump:function(obj,first){
                	var curr=obj.curr;
                	if(!first){
                		
                		var a=$("#pdmhfy").val();
                	
                		/* 
                		option(curr); */            		
                	
                		if(a!=1){
                			
                			window.location.href='media/paging?dqy='+curr;
                			
                		}else{
                			
                		
                		 $("#pdmhfycx").val(1);	               			
                		 $("#dq1").val(curr);
                		
                		 window.location.href='javascript:document:gg.submit()';
                		
                		}
                	}
                }
              }); 
              
              var start = {
                min: laydate.now()
                ,max: '2099-06-16 23:59:59'
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
              
              document.getElementById('LAY_demorange_s').onclick = function(){
                start.elem = this;
                laydate(start);
              }
              document.getElementById('LAY_demorange_e').onclick = function(){
                end.elem = this
                laydate(end);
              }
              
            });

            //批量删除提交
             function delAll (checkbox) {
            	 var des =[];//建立数组
            	 var i=0;

            	 //取得选中复选框值
            	 $('input[name="test"]:checked').each(function(){
            		 
                     var sfruit=$(this).val();//取值
                    
                     des[i]=sfruit;//赋值
                     
                     i++;
                     
                     });
            	 
            	 
            	 layer.confirm('确认要删除吗？',function(index){
            			
            		 $.ajax({
            				
            				async:true,
            				cache:true,
            				url:'media/remall',//自己的地址
            				type:'post',
            				traditional: true,//传数组进后台需要设置该属性
            				data:{
            					
            					'des':des
            				
            				},
            				
            				dataType:'json',
            				
            				success:function(data){
            					
            					if(data.msg == "success") {         							
            						 location.reload();	
            						 layer.close(index);						
            												
            					} else {
            						layer.alert('删除失败！',{
            			               title: '提示框',				
            						icon:1,		
            						  });
            						   layer.close(index);	
            				}
            					
            					
            				},error:function(XMLHttpRequest,textStates){
            				 layer.alert('请至少选择一个！',{
            	              title: '提示框',				
            				icon:1,		
            				  });
            				   layer.close(index);	
            		         }
            				
            				
            			});
            		    
            			layer.msg('已删除!',{icon:1,time:1000});
            		});
               
            }
             /*用户-添加*/
            function member_add(title,url,w,h){
                x_admin_show(title,url,w,h);
                
            }
            /*用户-查看*/
            function member_show(title,url,id,w,h){
                x_admin_show(title,url,w,h);
            }

             /*用户-停用*/
            function member_stop(obj,id){
                layer.confirm('确认要停用吗？',function(index){
                    //发异步把用户状态进行更改
                    $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="layui-icon">&#xe62f;</i></a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="layui-btn layui-btn-disabled layui-btn-mini">已停用</span>');
                    $(obj).remove();
                    layer.msg('已停用!',{icon: 5,time:1000});
                });
            }

            /*用户-启用*/
            function member_start(obj,id){
                layer.confirm('确认要启用吗？',function(index){
                    //发异步把用户状态进行更改
                    $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="">&#xe601;</i></a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="layui-btn layui-btn-normal -mini">已启用</span>');
                    $(obj).remove();
                    layer.msg('已启用!',{icon: 6,time:1000});
                });
            }
            // 用户-编辑
            function member_edit (title,url,id,w,h) {
            	var url="media/toUpdate?id="+id;
                x_admin_show(title,url,w,h); 
            }
            /*密码-修改*/
            function member_password(title,url,id,w,h){
                x_admin_show(title,url,w,h);  
            }
            /*用户-删除*/
            
            function member_del(obj,id){
                layer.confirm('确认要删除吗？',function(index){
                    //发异步删除数据
		           	 $.ajax({
		              		 async:true,
		              	 	 cache:true,
		              	 	 url:'media/del',
		              	 	 type:'post',
		              	 	 data: {'id':id},
		              	 	 success:function(result){                 	  
		              	 		layer.msg('已删除!',{icon:1,time:1000});
		              	 		location.reload();
		              	 	 }
		               }); 
                });
            }
            
           
            
        

                
          
            </script>

</body>
</html>