<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <title>金字塔 - 综合金融服务后台管理 - 借款审核</title>
        <base href="<%=path%>/">
        <meta name="renderer" content="webkit">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta name="apple-mobile-web-app-status-bar-style" content="black">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="format-detection" content="telephone=no">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="./css/x-admin.css" media="all">
        <link rel="stylesheet" href="css/bootstrap.min.css" />
    </head>
    
    <style type="text/css">
  	/*如果你想要让div显示垂直方向的滚动条，就把overflow-x;改为overflow-y;如果横竖都要，就把他改为overflow:auto;*/
     .max{width:96%; height:600px; margin:auto; overflow:auto;}
     
     .s{
     	color:red !important;
     	background:#FFFFFF !important;
     	border:1px solid red !important;
     }
     
     .s:hover{
     	background:red !important;
     	color:#FFFFFF !important;
     }
     .z{
     	color:#008B00 !important;
     	background:#FFFFFF !important;
     	border:1px solid #008B00 !important;
     }
     
     .z:hover{
     	background:#008B00 !important;
     	color:#FFFFFF !important;
     }
     .y{
     	color:#EE9A00 !important;
     	background:#FFFFFF !important;
     	border:1px solid #EE9A00 !important;
     }
     
     .y:hover{
     	background:#EE9A00 !important;
     	color:#FFFFFF !important;
     }
    </style>
    
    <body>
 
    
    <input type="text" id="CurrentPage" value="${ CurrentPage}" style="display: none;" >
    <input type="text" id="yeshu" value="${yeshu }" style="display: none;" >
    <input type="text" id="cont" value="${cont }" style="display: none;" >
        <div class="x-nav">
            <span class="layui-breadcrumb">
              <a><cite>首页</cite></a>
              <a><cite>借款管理</cite></a>
              <a><cite>借款申请</cite></a>
            </span>
            <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  href="lendApplyInfo/list" title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
        </div>
        
        <div class="max">
        
            <form class="layui-form x-center" action="lendApplyInfo/mohu" style="width:100%;margin-left: 180px;">
                <div class="layui-form-pane" style="margin-top: 15px;">
                  <div class="layui-form-item">
                 
                    <label class="layui-form-label">账号</label>
                    <div class="layui-input-inline">
                       <input type="text" id="username" name="username" value="${username}" placeholder="账号" autocomplete="off" class="layui-input">
                    </div>
                    
                     <label class="layui-form-label">金额</label>
                    <div class="layui-input-inline">
                       <input type="text" id="lendmoney" name="lendmoney" value="${lendmoney}" placeholder="借款金额" autocomplete="off" class="layui-input">
                    </div>
                    
                    <div class="layui-input-inline" style="width:80px">
                        <button class="layui-btn"  name="" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
                    </div>
                    </div>
                </div> 
            </form>
                    
            <div class="layui-input-inline" style="margin-top: -58px;margin-left: 1000px;">
       			<button class="layui-btn" onclick="exportt();" style="margin-left: 0px;"><i class="layui-icon">&#xe601;</i>导出</button>
      			<a href="http://localhost:8080/FinancesP2P/img/1.jpg" download="a.jpg" id="a_dc"><span id="spanAutoClick"></span></a>
           </div>
                  
            
            <xblock>
        
         <button class="layui-btn"  onclick="info_add('添加用户','lendApplyInfo/goadd','600','500')"><i class="layui-icon">&#xe608;</i>添加</button>
            <span class="x-right" style="line-height:40px;margin-right: 30px;">共有数据：${cont } 条</span>
            </xblock>
            
            <table class="layui-table">
                <thead>
                    <tr>
                        <th>
                        	ID
                        </th>
                        <th width="170px;">
                        	账号
                        </th>
                        <th>
                        	借款金额
                        </th>
                        <th>
                           	基本信息
                        </th>
                        <th>
					                    资料列表
                        </th>
                        <th>
                        	发布借款
                        </th>
                        <th width="70px;"> 
                        	操作
                        </th>
                        
                    </tr>
                </thead>
                <tbody>
               <c:forEach items="${list }" var="list">
              <input type="text" id="zz" value="${list}" style="display: none;" >
                    <tr>
                        <td>
                            ${list.id }
                        </td>
                        <td>
                            ${list.username }
                            <input type="text" id="username" value="${list.username }" style="display: none;" >
                        </td>
                        <td >
                            ${list.lendmoney }
                        </td>
                        <td >
                      
                 		    <c:if test="${list.oyh1=='0'}">
                 		    <input type="text" id="oyh1" value="${list.oyh1 }" style="display: none;" >
                            <button type="button" onclick="jiben('基本信息','lendApplyInfo/jiben?username=${list.username }','600','600')" class="btn s">
                            	基本信息不完整
                            </button>
                  	        </c:if>
                  	        
                            <c:if test="${list.oyh1=='1' }">
                             <input type="text" id="oyh1" value="${list.oyh1 }" style="display: none;" >
                             <button type="button" onclick="jiben('基本信息','lendApplyInfo/jiben?username=${list.username }','600','600')" class="btn y">
                            	基本信息不完整
                            </button>
                            </c:if>
                            <c:if test="${list.oyh1=='2' }">
                             <input type="text" id="oyh1" value="${list.oyh1 }" style="display: none;" >
                             <button type="button" onclick="jiben('基本信息','lendApplyInfo/jiben?username=${list.username }','600','600')" class="btn z">
                            	基本信息完整
                            </button>
                            </c:if>
                
                        </td>
                        <td >
                        <c:if test="${list.oyh2=='0' }">
                         <input type="text" id="oyh2" value="${list.oyh2}" style="display: none;" >
                        <button type="button" onclick="ziliao('资料列表','lendApplyInfo/listziliao?id=${list.id}','600','600')" class="btn s">
                         		  资料列表
                         	</button>
                         	</c:if>
                         	<c:if test="${list.oyh2=='1' }">
                         	 <input type="text" id="oyh2" value="${list.oyh2}" style="display: none;" >
                        <button type="button" onclick="ziliao('资料列表','lendApplyInfo/listziliao?id=${list.id}','600','600')" class="btn z">
                         		  资料列表
                         	</button>
                         	</c:if>
                        </td>
                        <td >
                        
                        <c:if test="${list.status=='未审核' }">
                        <input type="text" id="status" value="${list.status}" style="display: none;" >
                         <button type="button"   class="btn s" onclick="updatejie(this,'${list.id}','${list.status}','${list.oyh1}','${list.oyh2}','${list.username}');">
                           	 	发布借款
                            </button>
                            </c:if>
                            <c:if test="${list.status=='已审核' }">
                         <button type="button" class="btn z">
                           	 	发布借款
                            </button>
                            </c:if>
                        </td>
    
                        <td class="td-manage">
                           <a title="编辑" href="javascript:;" onclick="info_update('编辑','member-edit.html','${list.id}','600','475')"
                            class="ml-5" style="text-decoration:none">
                                <i class="layui-icon">&#xe642;</i>
                            </a>
                          
                            <a title="删除" href="javascript:;" onclick="notice_del(this,'${list.id}')" 
                            style="text-decoration:none">
                                <i class="layui-icon">&#xe640;</i>
                            </a>
                        </td>
                    </tr>
                    </c:forEach> 
                </tbody>
            </table>
            
			<div id="page" onclick="" style="margin-top: -5px;"></div> 
        </div>

        <script src="./lib/layui/layui.js" charset="utf-8"></script>
        <script src="./js/x-layui.js" charset="utf-8"></script>
        
        <script type="text/javascript">
    
          //导出
          function exportt(){
        	  var username = document.getElementById("username").value;
              var lendmoney = document.getElementById("lendmoney").value;
	        	var cont=document.getElementById("cont").value;
	        	if(parseInt(cont)>parseInt(0)){
	        	   layer.confirm('确定要导出吗？',function(index){ 
	      		       $.ajax({  
			                url: 'lendApplyInfo/exportt',  
			                type: 'POST', 
			                data: {
			                	username:username,
			                	lendmoney:lendmoney,
			                },  
			                cache: false, 
			                success : function(data) {
			    				console.info(data);
			    				if(data!=null){
			    					document.getElementById("a_dc").href ="http://localhost:8080/FinancesP2P/xls/"+data;
		    						document.getElementById("a_dc").download=data;
		    						$("#spanAutoClick").click();		
		    						layer.msg('导出成功!',{icon:1,time:1000});
			    					}else{
			    						layer.msg(data+'导出失败！');
			    					}
			    			}					
			            });
	        	    }); 
	        	}else{
	        		layer.msg('没有符合数据导出失败！' );
	        	}
	        }
          
          </script>
        
        
        <script type="text/javascript">
        function option(curr){
        	var username=document.getElementById("username").value;
        	var lendmoney=document.getElementById("lendmoney").value;
        	
        	if(username==""&&lendmoney==""){
        		window.location.href='lendApplyInfo/list?cont='+curr;
        	}else{
        	window.location.href='lendApplyInfo/mohu?cont='+curr+'&'+'username='+username+'&'+'lendmoney='+lendmoney;
        		}
        	}
        </script>
        
        <script>
            layui.use(['laydate','element','laypage','layer'], function(){
                $ = layui.jquery;//jquery
              laydate = layui.laydate;//日期插件
              lement = layui.element();//面包导航
              laypage = layui.laypage;//分页
              layer = layui.layer;//弹出层

              //以上模块根据需要引入
				var CurrentPage=document.getElementById("CurrentPage").value;//$("#lii").Value;
				var yeshu=document.getElementById("yeshu").value;
				
		
				/* window.location.href='lendApplyInfo/test?username='; */
              laypage({
                cont: 'page'
                ,pages: yeshu
                ,first: 1
                ,curr:CurrentPage
                ,last: yeshu
                ,prev: '<em><</em>'
                ,next: '<em>></em>'
                ,jump: function(obj, first){
                	 var curr = obj.curr;
                      if(!first){ //一定要加此判断，否则初始时会无限刷新
                    	//  alert(curr);//curr当前页数
                    	  option(curr);//调用方法
                        }
                    }
              }); 
            });
 
          
            
            /*用户-删除*/
            function notice_del(obj,id){
            	var s=id;
                layer.confirm('确认要删除吗？',function(index,id){
//                 	 //发异步删除数据
                    $.ajax({  
                        url: 'lendApplyInfo/delete',  
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
            
            //添加
            function info_add(title,url,w,h){
            	x_admin_show(title,url,w,h);
            }
            
         // 用户-编辑
    		function info_update(title, url, id, w, h) {

    			var url = "lendApplyInfo/goup?id=" + id;
    			x_admin_show(title, url, w, h);
    		}
            
         
         //基本信息验证
         function jiben(title,url,w,h){
            	x_admin_show(title,url,w,h);
            }
           
         function ziliao(title,url,w,h){
        	 x_admin_show(title,url,w,h);
         }
         
         
         function updatejie(obj,id,status,oyh1,oyh2,username){
        		var k = id;
        		var sta = status;
        		var oyh1 = oyh1;
        		var oyh2 = oyh2;
        		var username = username;
        	  layer.confirm('确认要发布吗？',function(index,id){
        		  $.ajax({  
                      url: 'lendApplyInfo/gojie',  
                      type: 'POST',  
                      data: {"id":k,
                    	  	"status":sta,
                    	  	"oyh1":oyh1,
                    	  	"oyh2":oyh2,
                    	  	"username":username
                    	  },  
                      success : function(data) {
  						console.info(data);
  						if(data=="success"){
  						$(obj).parents("tr").remove();
  						  
                            layer.msg('已发布!',{icon:1,time:1000}); 
                            location.reload();
  						}else{
  							layer.open({
  							content: '发布失败请重试!'
  							});     
  							  
  						}
  					}					
                  });
        	  });
         }
         
          </script>
          
      
            
    </body>
</html>