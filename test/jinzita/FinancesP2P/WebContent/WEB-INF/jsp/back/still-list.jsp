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
             金字塔 - 综合金融服务后台管理系统 - 借款列表
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
            <span class="layui-breadcrumb">
              <a><cite>首页</cite></a>
              <a><cite>资金管理</cite></a>
              <a><cite>借款列表</cite></a>
            </span>
            <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  href="photo/still-list" title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
        </div>
        <div class="x-body">
            <form class="layui-form x-center" action="photo/mhStill" style="width:1600px" id="gg">
                <div class="layui-form-pane" style="margin-top: 15px;">
                  <div class="layui-form-item">
                  
                    <input type="hidden" value="" id="mhdq" name="dq"/>
                    <input type="hidden" value="" id="mhmygs" name="mygs"/>           
                    <input type="hidden" id="pdmhfyzh" name="pdmhfyzh" value=""/>
                   
                       
                    <div class="layui-input-inline">
                      <input type="text" name="username" id="username" value="${sk.username }"   placeholder="用户名" autocomplete="off" class="layui-input">
                    </div>
                    
                                      
                                      
                    <div class="layui-input-inline">
                      <input type="text" name="realname" id="realname" value="${sk.realname }"   placeholder="真实姓名" autocomplete="off" class="layui-input">
                    </div>
                    
                                     
                    <div class="layui-input-inline">
                      <input type="text" name="title" id="title" value="${sk.title }"  placeholder="借款标题" autocomplete="off" class="layui-input">
                    </div>
                    
                                       
                    <div class="layui-input-inline">
                      <input type="text" name="type" id="type" value="${sk.type }" placeholder="借款类型" autocomplete="off" class="layui-input">
                    </div>
                    
                                       
                    <div class="layui-input-inline">
                      <input type="text" name="staystatus" id="staystatus" value="${sk.staystatus }"  placeholder="还款状态" autocomplete="off" class="layui-input">
                    </div>
                    
                    
                    <div class="layui-input-inline" style="width:80px">
                        <button class="layui-btn"  lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
                    </div>
                  </div>
                </div> 
                
            </form>
            <xblock>
            
            <!--<button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon">&#xe640;</i>批量删除</button> -->
            <button class="layui-btn" onclick="member_export()" style="margin-left: 10px;"><i class="layui-icon">&#xe601;</i>导出</button><span class="x-right" style="line-height:40px;margin-right: 20px;">共有数据：${count } 条</span>
            <a href="http://localhost:8080/FinancesP2P/img/1.jpg" download="a.jpg" id="a_dc"><span id="spanAutoClick"></span></a>
            </xblock>
            <table class="layui-table">
               
                <thead>
                    <tr>
                       
                        <th>
                            ID
                        </th>
                        <th>
                                                                      用户名
                        </th>
                        <th>
                                                                      真实姓名
                        </th>
                        <th>
                                                                      贷后管理员
                        </th>
                        <th>
                                                                      借款标题                 
                        </th>
                        <th>
                                                                      期数
                        </th>
                        <th>
                                                                      类型
                        </th>
                        <th>
                                                                      应还时间
                        </th>
                        <th>
                                                                      实际还款时间
                        </th>
                        
                        <th>
                                                                      应还本息(￥元)
                        </th>
                        
                        <th>
                                                                      还款状态
                        </th>
                        
                        <th>
                                                                      详情                                    
                        </th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${still }" var="st">
                    <tr>                                          
                       
                        
                        <td>
                           ${st.id }
                        </td>
                        
                        <td>
                           ${st.username }
                        </td>
                        
                        <td >
                           ${st.realname }
                        </td>
                        
                        <td>
                           ${st.peoper }
                        </td>
                        
                        <td >
                           ${st.title }
                        </td>
                        
                        <td >
                           ${st.stage }/${st.stages }
                        </td>
                        
                        <td>
                           ${st.type }
                        </td>
                        
                        <td >
                           <fmt:formatDate pattern="yyyy-MM-dd" value="${st.stilltime }"/>
                        </td>
                        
                        <td>                         
                           <fmt:formatDate pattern="yyyy-MM-dd" value="${st.realstilltime }"/>
                        </td>
                        
                        <td >
                           ${st.stillmoney }
                        </td>
                        
                        <td>
                           ${st.staystatus }
                        </td>
                        
                        
                        <!-- <td class="td-status">
                            <span class="layui-btn layui-btn-normal layui-btn-mini">
                                                                      已启用
                            </span>
                        </td> -->
                        <td class="td-manage">
                            <!-- <a style="text-decoration:none" onclick="member_stop(this,'10001')" href="javascript:;" title="停用">
                                <i class="layui-icon">&#xe601;</i>
                            </a>
                            <a title="编辑" href="javascript:;" onclick="member_edit('编辑','member-edit.html','4','','510')"
                            class="ml-5" style="text-decoration:none">
                                <i class="layui-icon">&#xe642;</i>
                            </a>
                            <a style="text-decoration:none"  onclick="member_password('修改密码','member-password.html','10001','600','400')"
                            href="javascript:;" title="修改密码">
                                <i class="layui-icon">&#xe631;</i>
                            </a> -->
                            <a title="查看" href="javascript:;" onclick="still_see('收款列表','photo/gathering-see/${st.lendid }/${st.title }','200','800')" 
                            style="text-decoration:none">
                                <i class="layui-icon">&#xe60a;</i>
                            </a>
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