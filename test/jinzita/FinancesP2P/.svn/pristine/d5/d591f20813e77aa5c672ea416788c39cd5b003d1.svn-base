<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <title>
            金字塔 - 综合金融服务后台管理 - 用户列表
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
    <input type="text" id="lii" value="${list2 }" style="display: none;" >
    <input type="text" id="ll" value="${ll[1] }"  style="display: none;">
        <div class="x-nav">
            <span class="layui-breadcrumb">
              <a><cite>首页</cite></a>
              <a><cite>用户管理</cite></a>
              <a><cite>用户列表</cite></a>
            </span>
            <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  href="user/user-list" title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
        </div>
        
        <div class="x-body">
        
                   
                       
                    
            <form class="layui-form x-center" action="user/notice-fy" style="width:800px">
                <div class="layui-form-pane" style="margin-top: 15px;">
                  <div class="layui-form-item">
                    <label class="layui-form-label">真实姓名</label>
                    <div class="layui-input-inline">
                     
                       <input type="text" id="realname" name="realname" value="${ll[2] }" placeholder="输入真实姓名" autocomplete="off" class="layui-input">
                    </div>
                     <label class="layui-form-label">电话</label>
                    <div class="layui-input-inline">
                   
                       <input type="text" id="phone" name="phone" value="${ll[3] }" placeholder="输入电话" autocomplete="off" class="layui-input">
                    </div>
                    
                    
<!--                     <div class="layui-input-inline"> -->
<!--                        <input class="layui-input" placeholder="开始日" id="LAY_demorange_s">    </div> -->
<!--                   <label class="layui-form-label">日期范围</label> -->
                    <div class="layui-input-inline" style="width:80px">
                        <button class="layui-btn"  name="" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
                    </div>
                  </div>
                </div> 
            </form>
<!--             <xblock><button class="layui-btn layui-btn-danger" onclick="delAll ()"><i class="layui-icon">&#xe640;</i>批量删除</button> -->
<%--             <button class="layui-btn" onclick="notice_add('添加用户','notice/notice-getadd.html','600','500')"><i class="layui-icon">&#xe608;</i>添加</button><span class="x-right" style="line-height:40px">共有数据：${ll[0] } 条</span></xblock> --%>
            <table class="layui-table">
                <thead>
                    <tr>
                        <th><input type="checkbox" name="" value=""></th>
                        <th>1</th>
                        <th>真实姓名</th>
                        <th>性别</th>
                        <th>头像</th>
                        <th>电话</th>
					    <th>邮箱</th>
        				<th>注册时间</th>
					    <th>推存码</th>
					    <th>最后登录Ip</th>
					    <th>最后登录时间</th>
<!--                         <th> -->
<!--                             操作 -->
<!--                         </th> -->
                    </tr>
                </thead>
                <tbody id="x-img">
               <c:forEach items="${list }" var="list">
                    <tr>
                        <td>
                           <input type="checkbox" value="${list.id }" name="text">
                        </td>
                        <td>
                           ${list.id }
                        </td>
                        <td>
                           ${list.realname }
                        </td>
                         <td >
                           ${list.sex }
                        </td>
                        <td >
                        
                       <img  src="${list.face }" width="22" height="30" alt="">
                       
                        </td>
                        <td >
                            ${list.phone }
                        </td>
                        <td >
                            ${list.email }
                        </td>
                      <td >
<%--                             ${list.registertime } --%>
                             <fmt:formatDate value="${list.registertime}" pattern="yyyy-MM-dd HH:mm:ss"/> 
                        </td>
               <td >
                            ${list.referrerno }
                        </td>
                        <td >
                            ${list.lastip }
                        </td>
                        <td >
                           <fmt:formatDate value="${list.lastlogintime }" pattern="yyyy-MM-dd HH:mm:ss"/> 
                        </td>
<!--                         <td class="td-manage"> -->
                           
<%--                             <a title="编辑" href="javascript:;" onclick="member_edit('编辑','member-edit.html','${list.id}','600','510')" --%>
<!--                             class="ml-5" style="text-decoration:none"> -->
<!--                                 <i class="layui-icon">&#xe642;</i> -->
<!--                             </a> -->
                           
<%--                             <a title="删除" href="javascript:;" onclick="notice_del(this,'${list.id}')"  --%>
<!--                             style="text-decoration:none"> -->
<!--                                 <i class="layui-icon">&#xe640;</i> -->
<!--                             </a> -->
<!--                         </td> -->
                    </tr>
                    </c:forEach> 
                </tbody>
            </table>

            <div id="page" onclick=""></div>
        </div>
        <script src="./lib/layui/layui.js" charset="utf-8"></script>
        <script src="./js/x-layui.js" charset="utf-8"></script>
        <script type="text/javascript">
        function option(curr){
        	var title=document.getElementById("realname").value;
        	
        	var people=document.getElementById("phone").value;
        	window.location.href='user/text?id='+curr+'&'+'realname='+title+'&'+'phone='+people;

        }
        </script>
        <script>
       

            layui.use(['laydate','element','laypage','layer'], function(){
                $ = layui.jquery;//jquery
              laydate = layui.laydate;//日期插件
              lement = layui.element();//面包导航
              laypage = layui.laypage;//分页
              layer = layui.layer;//弹出层

              
              layer.ready(function(){ //为了layer.ext.js加载完毕再执行
                  layer.photos({
                    photos: '#x-img'
                    //,shift: 5 //0-6的选择，指定弹出图片动画类型，默认随机
                  });
                }); 
              
              
              
              
              //以上模块根据需要引入
				var co=document.getElementById("lii").value;//$("#lii").Value;
				var co2=document.getElementById("ll").value;
              laypage({
                cont: 'page'
                ,pages: co2
                ,first: 1
                ,curr:co
                ,last: co2
                ,prev: '<em><</em>'
                ,next: '<em>></em>'
                ,jump: function(obj, first){
                	 var curr = obj.curr;
                      if(!first){ //一定要加此判断，否则初始时会无限刷新
                    	  option(curr);//调用方法
                      
                        }
                    }
              }); 
              
              
              

              
            });

            //批量删除提交
             function delAll () {
            	

            	 var des =[];//建立数组
            	 var i=0;

            	 //取得选中复选框值
            	 $('input[name="text"]:checked').each(function(){
            		 
                     var sfruit=$(this).val();//取值
                    
                     des[i]=sfruit;//赋值
                     
                     i++;
                     
                     });
            	 
            	 
            	 layer.confirm('确认要删除吗？',function(index){
            			
            		 $.ajax({
            				
            				async:true,
            				cache:true,
            				url:'notice/csNat',//自己的地址
            				type:'post',
            				traditional: true,//传数组进后台需要设置该属性
            				data:{
            					
            					'des':des
            				
            				},
            				
            				dataType:'json',
            				
            				success:function(data){
            					
            					if(data.msg == "success") {
            						
            							
            						// location.reload();
            						 window.location.href='notice/notice-list';		   
            							
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
            function notice_add(title,url,w,h){
            	 var url="notice/notice-getadd";
                x_admin_show(title,url,w,h);
            }
            /*用户-查看*/
            function member_show(title,url,id,w,h){
                x_admin_show(title,url,w,h);
            }

      
            // 用户-编辑
            function member_edit (title,url,id,w,h) {
            	
            var url="notice/notice-getupdate?id="+id;
                x_admin_show(title,url,w,h); 
            }
            /*密码-修改*/
            function member_password(title,url,id,w,h){
            	var url="notice/notice-getupdate";
                x_admin_show(title,url,w,h);  
            }
            /*用户-删除*/
            function notice_del(obj,id){
       
            	
            	var s=id;
                layer.confirm('确认要删除吗？',function(index,id){
//                 	 //发异步删除数据



                    $.ajax({  
                        url: '/notice/notice-delete',  
                        type: 'POST',  
                        data: {"id":s},  
                        success : function(data) {
    						console.info(data);
    						if(data=="success"){
    							
    						$(obj).parents("tr").remove();
                              layer.msg('已删除!',{icon:1,time:1000}); 
                              location.reload();

    						}
    						 
    				
    					}					
    				
                    });

                });

            }

            </script>
            
    </body>
</html>