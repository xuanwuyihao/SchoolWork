<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <title>
            金字塔 - 综合金融服务后台管理 - 
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
        <div class="x-nav">
           
            <span class="x-left" style="line-height:40px">标的编号：${title }</span> 
            <span class="x-right" style="line-height:40px">共有投资人：${count } 个</span> 
        </div>
        <div class="x-body">
      
            <table class="layui-table">
               
                <thead>
                    <tr>
                       
                        <th>
                                                            还款人
                        </th>
                        <th>
                                                            投资人                                          
                        </th>
                        <th>
                                                             期数
                        </th>
                        <th>
                                                            还款时间
                        </th>
                        <th>
                                                            应收本息
                        </th>
                        <th>
                                                            当期应收         
                        </th>
                        <th>
                                                           已收本息            
                        </th>
                        
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${gatList }" var="g">
                    <tr>                                          
                       
                        
                        <td>
                           ${g.oyh2 }
                        </td>
                        
                        <td>
                           ${g.oyh1 }
                        </td>
                        
                        <td >
                           ${g.hasstage }/${g.stage }
                        </td>
                        
                        <td>                         
                           <fmt:formatDate pattern="yyyy-MM-dd" value="${g.stilldtate }"/>
                        </td>
                        
                        <td >
                           ${g.answergold }
                        </td>
                        
                        <td >
                           ${g.answerfine }
                        </td>
                        
                        <td>
                           ${g.hasmoney }
                        </td>
                   
                     
                    </tr>
                </c:forEach>
                </tbody>
            </table>

            <div id="page"></div>
            <div style="height:100px;width:100%;"></div>
            <input type="hidden" value="${page }" id="pa"/>
            <input type="hidden" value="${dqy }" id="dqys"/>
            <input type="hidden" value="${mh }" id="mh"/>
        </div>
        <script src="./lib/layui/layui.js" charset="utf-8"></script>
        <script src="./js/x-layui.js" charset="utf-8"></script>
      
        <script>
        
       
            
        
        
        
            layui.use(['laydate','element','laypage','layer'], function(){
                $ = layui.jquery;//jquery
              laydate = layui.laydate;//日期插件
              lement = layui.element();//面包导航
              laypage = layui.laypage;//分页
              layer = layui.layer;//弹出层
             
              //以上模块根据需要引入

              laypage({
                cont: 'page'
                ,pages: $("#pa").val()
                ,first: 1
                ,last: $("#pa").val()
                ,curr:$("#dqys").val()
                ,prev: '<em><</em>'
                ,next: '<em>></em>'
                ,jump: function(obj,first){ //触发分页后的回调
                	
                	  if(!first){//点击
                		  
                	  var pdmh=$("#mh").val();//获取是否模糊查询
                	  
                	  if(pdmh!=1){//普通分页
                		  
                		  
                		  window.location.href='photo/fy?mygs='+6+'&'+'dqy='+obj.curr;
                		  
                	  }else{//模糊查询分页
                		  $("#mhdq").val(obj.curr);
                	      $("#mhmygs").val(6);
                	      $("#pdmhfyzh").val(1);             	     
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
             function delAll () {
                layer.confirm('确认要删除吗？',function(index){
                    //捉到所有被选中的，发异步进行删除
                    layer.msg('删除成功', {icon: 1});
                });
             }
            
             /*导出*/
            function member_export(){
               
              var pdmh=$("#mh").val();//获取是否模糊查询
           	  
           	  if(pdmh!=1){//普通全部导出
           		           	
           		layer.confirm('确定要导出吗？',function(index){
                $.ajax({
    				
    				async:true,
    				cache:true,
    				url:'photo/export1',
    				type:'post',
    				
    				data:{
    				
    				},
    			
    				success:function(data){
    					
    					console.info(data);
    					
    					if(data!="false") {
    						
				
    						document.getElementById("a_dc").href ="http://localhost:8080/FinancesP2P/xls/"+data;
    						document.getElementById("a_dc").download=data;
    						$("#spanAutoClick").click();		
    						layer.msg('导出成功!',{icon:1,time:1000});
    					
    					} 
    					
    				},error:function(XMLHttpRequest,textStates){
    				 layer.alert('错误！',{
    	              title: '提示框',				
    				icon:1,		
    				  });
    				   layer.close(index);	
    		         }
    				
    				
    			});
                
           	  });
           	  
           	  
           		  
           	  }else{//模糊查询导出
           	
           		  
           	   layer.confirm('确定要导出吗？',function(index){
           		 
           		  var username=$("#username").val();
           		  var realname=$("#realname").val();
           		  var title=$("#title").val(); 
           		  var type=$("#type").val();
           		  var staystatus=$("#staystatus").val();
           		
                  $.ajax({
      				
      				async:true,
      				cache:true,
      				url:'photo/export2',
      				type:'post',
      				
      				data:{
      					
      					'username':username,
      					'realname':realname,
      					'title':title,
      					'type':type,
      					'staystatus':staystatus
      				
      				},
      			
      				success:function(data){
      					
      					console.info(data);
      					
      					if(data!="false") {
    						
      						
    						document.getElementById("a_dc").href ="http://localhost:8080/FinancesP2P/xls/"+data;
    						document.getElementById("a_dc").download=data;
    						$("#spanAutoClick").click();		
    						layer.msg('导出成功!',{icon:1,time:1000});
    					
    					} 
      					
      				},error:function(XMLHttpRequest,textStates){
      				 layer.alert('错误！',{
      	              title: '提示框',				
      				icon:1,		
      				  });
      				   layer.close(index);	
      		         }
      				
      				
      			});
           	}); 
           	  
            }
           	  
      	 
            	 
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
                    $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="layui-icon">&#xe601;</i></a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span>');
                    $(obj).remove();
                    layer.msg('已启用!',{icon: 6,time:1000});
                });
            }
            // 用户-编辑
            function still_see(title,url,id,w,h) {
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
                    $(obj).parents("tr").remove();
                    layer.msg('已删除!',{icon:1,time:1000});
                });
            }
            </script>
            
    </body>
</html>