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
        <title>金字塔 - 综合金融服务后台管理 - 运营数据</title>
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
    <style type="text/css">
  		/*如果你想要让div显示垂直方向的滚动条，就把overflow-x;改为overflow-y;如果横竖都要，就把他改为overflow:auto;*/
     .max{width:1180px; height:600px; margin:auto; overflow:auto;}
    </style>
<body>
    <input type="text" id="lii" value="${list2 }"  style="display: none;">
    <input type="text" id="ll" value="${ll[1] }" style="display: none;" >
    <input type="text" id="cont" value="${ll[0] }" style="display: none;" >
        <div class="x-nav">
            <span class="layui-breadcrumb">
              <a><cite>首页</cite></a>
              <a><cite>系统统计</cite></a>
              <a><cite>运营数据</cite></a>
            </span>
            <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  href="monthOperate/monthoperate-list" title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
        </div>
        
        <div class="x-body" style="margin-top: 10px;">
            <xblock>
	            <button class="layui-btn" onclick="exportt();" style="margin-left: 10px;"><i class="layui-icon">&#xe601;</i>导出</button>
            	<a href="http://localhost:8080/FinancesP2P/img/1.jpg" download="a.jpg" id="a_dc"><span id="spanAutoClick"></span></a>
	            <span class="x-right" style="line-height:40px;margin-right: 30px;">共有数据：${ll[0] } 条</span>
	        </xblock>
            <table class="layui-table" style="margin-top: 35px;">
            	<c:forEach items="${list }" var="list">
            		<tr>
            			<th colspan="6" style="font-size: 20px;"><center>${list.title }</center></th>
            		</tr>
                    <tr>
                       <th>生成时间</th>
                       <td>
                           <fmt:formatDate value="${list.date }" pattern="yyyy-MM-dd HH:mm:ss"/>
                       </td>
                      
                       <th>平台交易总额（元）</th>
                       <td>
                           ${list.allmoney }
                       </td>
                       
                       <th>月交易总额（元）</th>
                       <td>
                           ${list.monthmoney }
                       </td>
                    </tr>
                    <tr>   
                       <th>截止待还款总额（元）</th>
                       <td>
                           ${list.actingmoney }
                       </td>
                    
                       <th>总收益（元）</th>
                       <td>
                           ${list.allinterest }
                       </td>
                       
                       <th>月总收益（元）</th>
                       <td>
                           ${list.monthinterest }
                       </td>
                    </tr>
                    <tr>   
                       <th>总用户数</th>
                       <td>
                           ${list.alluser }
                       </td>
                       
                       <th>月注册人数</th>
                       <td>
                           ${list.monthreqister }
                       </td>
                    
                       <th>总投资人数</th>
                       <td>
                           ${list.allimest }
                       </td>
                    </tr>
                    <tr>   
                       <th>月投资人数</th>
                       <td>
                           ${list.monthinvest }
                       </td>
                       
                       <th>月人均投资金额（元）</th>
                       <td>
                           ${list.usermoney }
                       </td>
                       
                       <th>月笔均投资金额（元）</th>
                       <td>
                           ${list.monthinvestmoney }
                       </td>
                    </tr>
                    <tr>   
                       <th>借款总人数</th>
                       <td>
                           ${list.alllenduser }
                       </td>
                       
                       <th>借款笔数</th>
                       <td>
                           ${list.alllendcount }
                       </td>
                       
                       <th>当月贷款笔数</th>
                       <td>
                           ${list.monthlendcount }
                       </td>
                    </tr>
                    <tr>   
                       <th>当月贷款总额</th>
                       <td>
                           ${list.monthlend }
                       </td>
                    
                       <th>逾期金额</th>
                       <td>
                           ${list.staymoney }
                       </td>
                       
                       <th>逾期笔数</th>
                       <td>
                           ${list.staycount }
                       </td>
                    </tr>
               
                </c:forEach> 
            </table>

            <div id="page" onclick="" style="margin-top: 35px;"></div>
        </div>
        <script src="./lib/layui/layui.js" charset="utf-8"></script>
        <script src="./js/x-layui.js" charset="utf-8"></script>
        <script type="text/javascript">
		        function option(curr){
		        	window.location.href='monthOperate/monthoperate-fy?id='+curr;
		        }
		        function exportt(){
		        	var cont=document.getElementById("cont").value;
		        	if(parseInt(cont)>parseInt(0)){
		        		layer.confirm('确定要导出吗？',function(index){
	        		     $.ajax({  
	  		                url: 'monthOperate/testsExport',  
	  		                type: 'POST', 
	  		                data: {
	  		                	
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
        
        <script>
            layui.use(['laydate','element','laypage','layer'], function(){
                $ = layui.jquery;//jquery
              laydate = layui.laydate;//日期插件
              lement = layui.element();//面包导航
              laypage = layui.laypage;//分页
              layer = layui.layer;//弹出层

              
              
              var CurrentPage=document.getElementById("lii").value;//$("#lii").Value;
				var pages=document.getElementById("ll").value;
              //以上模块根据需要引入

              laypage({
                cont: 'page'
                ,pages: pages
                ,first: 1
                ,curr :CurrentPage
                ,last: pages
                ,prev: '<em><</em>'
                ,next: '<em>></em>'
                	,jump: function(obj, first){
                   	 var curr = obj.curr;
                         if(!first){ //一定要加此判断，否则初始时会无限刷新
                       	  option(curr);//调用方法
                         
                           }
                       }
              }); 
              
              var start = {
               
                max: '2099-06-16 23:59:59'
                ,istoday: false
                ,range: false
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
              
              document.getElementById('time').onclick = function(){
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
                    $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="layui-icon">&#xe601;</i></a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span>');
                    $(obj).remove();
                    layer.msg('已启用!',{icon: 6,time:1000});
                });
            }
            // 用户-编辑
            function member_edit (title,url,id,w,h) {
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