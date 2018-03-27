<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <title>
            金字塔 - 综合金融服务后台管理系统 - 用户资金奖励
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
        
        <!-- 弹框 -->
        <script type="text/javascript" src="js/jquery2-1.8.3.min.js" ></script>
		<link rel="stylesheet" href="css/Dialog1.css" />
        <style type="text/css">
        .fid{
        height: 38px;
        border-color: #e6e6e6;
        color: gray;
        }
        </style>
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
              <a><cite>用户资金奖励</cite></a>
            </span>
            <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  href="investAword/list" title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
        </div>
        <div class="x-body"  >
            <form class="layui-form x-center" action="investAword/seek" id="from1" style="width:85%;margin-left: 160px;" method="post">
                <div class="layui-form-pane" style="margin-top: 15px;">
                  <div class="layui-form-item" style="margin-left:-160px;">
                 
                  
                     <label class="layui-form-label">真实姓名</label>
                  <div class="layui-input-inline">
                      <input type="text" style="width: 170px;" id="username" name="username" placeholder="请输入用户名" autocomplete="off" class="layui-input"  clientidmode="Static" value="${ username}">
                    </div>
                   <label class="layui-form-label" style="width:100px">奖励类型</label>
                    <div class="layui-input-inline" style="width:100px;text-align: left">
                        <select class="fid" name="awa" id="awa" style="display: inherit;" clientidmode="Static">
                            <option value="0" <c:if test="${awa==null }">selected</c:if> >-请选择-</option>
                            <option value="首投" <c:if test="${awa=='首投' }">selected</c:if> >首投 </option>
                            <option value="标王" <c:if test="${awa=='标王' }">selected</c:if>>标王</option>
                            <option value="尾投" <c:if test="${awa=='尾投' }">selected</c:if>>尾投</option>
                        </select>
                    </div>
                     <label class="layui-form-label">发放状态</label>
                   <div class="layui-input-inline" style="width:100px;text-align: left">
                        <select class="fid" name="fid" id="fid" style="display: inherit;" clientidmode="Static">
                            <option value="0" <c:if test="${awa==null }">selected</c:if>>-请选择-</option>
                            <option value="未发放" <c:if test="${fid=='未发放' }">selected</c:if>>未发放</option>
                            <option value="已发放" <c:if test="${fid=='已发放' }">selected</c:if>>已发放</option>
                        </select>
                    </div>
                    
                     <div class="layui-input-inline" style="width:auto;text-align: left">
                    <button class="layui-btn layui-btn-danger" onclick="qkcx()"><i class="layui-icon">&#xe640;</i>清空查询</button>
				
				 </div>
				 <div class="layui-input-inline" style="width:80px;margin-left: -25px;">
                        <button class="layui-btn" style="margin-left: 30px;"  lay-submit="" lay-filter="sreach" type="button"  onclick="upAll()">发放已选中</button>
                    </div>
				 <input type="hidden" id="awa" value="$('#fid option:selected') .val()"/>
				 <input type="hidden" id="fid" value="$('#awa option:selected') .val()"/>
                    <div class="layui-input-inline" style="width:80px;margin-left: 25px;">
                        <button class="layui-btn" style="margin-left: 30px;"  lay-submit="" lay-filter="sreach" type="submit" ><i class="layui-icon">&#xe615;</i></button>
                    </div>
                  </div>
                </div> 
                
                	<input type="hidden"  id="dq1" name="dq1"/>
                    <input type="hidden"  id="pdmhfycx" name="pdmhfycx"/>
            </form>
		 <a href="http://localhost:8080/FinancesP2P/img/1.jpg" download="a.jpg" id="a_dc"><span id="spanAutoClick"></span></a>
            <span class="x-right" style="line-height:40px">
            <button class="layui-btn" onclick="exportt();">导出</button></span>
            <span class="x-right" style="line-height:40px">共有数据：${count } 条&nbsp;&nbsp;</span>
            <table class="layui-table">
                <thead>
                    <tr>
                       <th><input type="checkbox" name="" value="" id="fx" onclick="seltAll();"></th>
                        <th width="7%">
                           id
                        </th>
                        <th width="10%">
                            用户
                        </th>
                        <th width="8%">
                           累计投资金额
                        </th>
                        <th>
                            奖励类型
                        </th>
                        <th>
                            奖励描述
                        </th>
                        <th>
                            发放状态
                        </th>
                        <th>
                            奖励发放时间
                        </th>
       					<th>
                            奖励计算时间
                        </th>
                        <th>
                            奖励发放
                        </th>
                       
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${userList }" var="i">
                    <tr>
                        <td>
                        <c:if test="${i.status eq '已发放' }">
                        <input type="checkbox" value="${i.id }" name="test" id="box" onclick="checkboxOnclick(this)" disabled="disabled">
                        </c:if>
                        <c:if test="${i.status eq '未发放' }">
                        <input type="checkbox" value="${i.id }" name="test" id="box" onclick="checkboxOnclick(this)">
                        </c:if>
                          <%--  <input type="checkbox" value="${i.id }" name="test" id="box" onclick="checkboxOnclick(this)"> --%>
                        </td>
                        <td>
                            ${i.id }
                        </td>
                        <td>
                            ${i.vsername }
                        </td>
                        <td >
                         	 ${i.investmoney }
                        </td>
                        <td >
                            ${i.awordtype }
                        </td>
                        <td >
                            ${i.description }
                        </td>
                        <td >
                             ${i.status }
                        </td>
                        <td >
                        <fmt:formatDate value="${i.awordtime }" pattern="yyyy-MM-dd HH:mm:ss"/>
                        </td>
                        <td >
                          
                          <fmt:formatDate value="${i.investimerange }" pattern="yyyy-MM-dd HH:mm:ss"/>
                        </td>
                        <c:if test="${i.status eq '已发放' }">
                        <td>
                        <span class="layui-btn layui-btn-disabled layui-btn-mini"  id="dj">已发放</span>
                        </td>
                        </c:if>
                         <c:if test="${i.status eq '未发放' }">
                        <td id="tdTest">
                        <span class="layui-btn layui-btn-normal layui-btn-mini"  id="example"  >
                            	发放<input type="hidden"  value="${i.id }">
                             </span>
                        </td>
                        </c:if>
                    </tr>
                    </c:forEach>
                    
                    <input type="hidden"  id="dq"  value="${dq}" />
                <input type="hidden"  id="zy"  value="${zy}" /> 
                 <input type="hidden"  id="pdmhfy"  value="${pdmhfy}" />   
                </tbody>
            </table>

            <div id="page" style="margin-top: -12px;"></div>
        </div>
        
        <!-- 弹框 -->
         <div id="LogBox">
           <table style="border: 1px solid red;width: 95%;margin-top: 15px;" align="center">
           	<tr style="height: 35px;"><td style="border-bottom: 1px solid red;text-align: left;padding: 10px 20px;font-size:20px;color: red;"><img src="img/2.2.png" id="OKimg">确认信息</td></tr>
           	<tr style="height: 40px;"><td style="text-align: left;padding: 10px 38px;color: grey;">确定要发放奖励吗？
           	<input type="hidden"  id="sid">
           	</td></tr>
           </table>
            <span style="margin-left: 310px;"><a id="OK" class="fafang">确认</a><a class="close_btn" id="NO">取消</a></span>
      
    </div>
    <script type="text/javascript">
    
    //span不可点击
    $("#dj").attr("onclick", "null");
    
    
    function test(){
    	
    }

    $("#tdTest span").click(function (){
    	var value = $(this).find(":input").val();
    	$("#sid").val(value);
    });
    
	$(function ($) {
		//弹出框
		$("#tdTest span").hover(function () {
			$(this).stop().animate({
				opacity: '1'
			}, 600);
		}, function () {
			$(this).stop().animate({
				opacity: '0.6'
			}, 1000);
		})
		
		.on('click', function () {
			$("body").append("<div id='mask'></div>");
			$("#mask").addClass("mask").fadeIn("slow");
			$("#LogBox").fadeIn("slow");
		});
		
		//关闭
		$(".close_btn").hover(function () { $(this).css({ color: 'white' }) }, function () { $(this).css({ color: 'red' }) }).on('click', function () {
			$("#LogBox").fadeOut("fast");
			$("#mask").css({ display: 'none' });
		});
		
		//确定
		$(".fafang").click(function(){
				var value = $("#sid").val();
				$.ajax({
					async:true,//数据是否同步
	        		cache:true,//是否加载缓存数据
	        		url:"investAword/update",//自己的地址
	        		type:"post",
	        		traditional:true,//传数组进后台需要设置该属性
	        		data:{
	        			"id":value
	        		},
	        		dataType:"json",
	        		success:function(data){
		        		location.reload();
		        	}
				});
			
			
			
			$("#LogBox").fadeOut("fast");
			$("#mask").css({ display: 'none' });
			location.reload();
		});
		
	
	});
	</script>	
    
        
        
        
        
        
        <script src="./lib/layui/layui.js" charset="utf-8"></script>
        <script src="./js/x-layui.js" charset="utf-8"></script>
        
        <script type="text/javascript">
        function seltAll(){  
	        var chckBoxSign = document.getElementById("fx");       //ckb 全选/反选的选择框id  
	        var chckBox = document.getElementsByName("chckBox");    //所有的选择框其那么都是chckBox  
	        var num = chckBox.length;  
	        if(chckBoxSign.checked){  
	            for(var index =0 ; index<num ; index++){  
	                chckBox[index].checked = true;  
	                }  
	        }else{  
	            for(var index =0 ; index<num ; index++){  
	                chckBox[index].checked = false;  
	                }  
	            }  
	        }  
        
		        function option(curr){
		        	var title=document.getElementById("username").value;
		        	
		        	var people=document.getElementById("time").value;
		        	window.location.href='logMoney/logMoney-fy?id='+curr+'&'+'username='+title+'&'+'oyh1='+people;
		
		        }
			        function exportt(){
			        	 var a=$("#pdmhfy").val();
			     		if(a!=1){
			     			 layer.confirm('确定要导出吗？',function(index){
				        		 $.ajax({
				     				async:true,
				     				cache:true,
				     				url:'investAword/export',
				     				type:'post',
				     				data:{
				     				
				     				},
				     				success:function(data){
				     					console.info(data);
				     					if(data!=null) {
				     						document.getElementById("a_dc").href ="http://localhost:8080/FinancesP2P/xls/"+data;
				    						document.getElementById("a_dc").download=data;
				    						$("#spanAutoClick").click();	
				     						layer.msg('导出成功!',{icon:1,time:1000});
				     					
				     					} else {
				     						layer.alert('导出失败！',{
				     			               title: '提示框',				
				     						icon:1,		
				     						  });
				     						   layer.close(index);	
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
			     		}else{
			     			var username=$("#username").val();
			     			var fid=$('#fid option:selected') .val();
			     			var awa=$('#awa option:selected') .val();
			     			 layer.confirm('确定要导出吗？',function(index){
				        		 $.ajax({
				     				
				     				async:true,
				     				cache:true,
				     				url:'investAword/export2',
				     				type:'post',
				     				
				     				data:{
				     				'username':username,
				     				'awa':awa,
				     				'fid':fid
				     				},
				     			
										success:function(data){
				     					
				     					console.info(data);
				     					
				     					if(data!=null) {
				     						document.getElementById("a_dc").href ="http://localhost:8080/FinancesP2P/xls/"+data;
				    						document.getElementById("a_dc").download=data;
				    						$("#spanAutoClick").click();	
				     						layer.msg('导出成功!',{icon:1,time:1000});
				     					
				     					} else {
				     						layer.alert('导出失败！',{
				     			               title: '提示框',				
				     						icon:1,		
				     						  });
				     						   layer.close(index);	
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
			        
			      //批量发放
		            function upAll () {
			    	  
		            	var des =[];//建立数组
		              	 var i=0;

		              	 //取得选中复选框值
		              	 $('input[name="test"]:checked').each(function(){
		              		 
		                       var sfruit=$(this).val();//取值
		                      
		                       des[i]=sfruit;//赋值
		                       
		                       i++;
		                       
		                       });
		           		
		           	 layer.confirm('确认要发放吗？',function(index){
		           		
		           		
		           		 if($(des).length!=0){
		           			 $.ajax({
			           				
			           				async:true,
			           				cache:true,
			           				url:'investAword/upall',//自己的地址
			           				type:'post',
			           				traditional: true,//传数组进后台需要设置该属性
			           				data:{
			           					
			           					'des':des
			           				
			           				},
			           				
			           				dataType:'json',
			           				
			           				success:function(data){
			           					
			           					if(data.msg == "success") {         							
			           						 location.reload();	
			           						// layer.close(index);						
			           												
			           					} else {
			           						layer.alert('发放失败！',{
			           			               title: '提示框',				
			           						icon:1,		
			           						  });
			           						   layer.close(index);	
			           				}
			           					
			           					
			           				}
			           				
			           				
			           			});
		           			
		           		 }else{
		           			 layer.alert('请至少选择一个！',{
		           	              title: '提示框',				
		           				icon:1,		
		           				  });
		           				   layer.close(index);	
		           				   return;
		           		 }
		           		layer.msg('已发放!',{icon:1,time:1000});
		           			
		           		});
		              
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
                	
                		/*option(curr); */            		
                	
                		if(a!=1){
                			window.location.href='investAword/tofenye?dqy='+curr;
                			
                		}else{
                			 $("#pdmhfycx").val(1);	
                    		 $("#dq1").val(curr);
                    		
                    		 window.location.href='javascript:document:from1.submit()';
                		}
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

             /*用户-添加*/
            function member_add(title,url,w,h){
                x_admin_show(title,url,w,h);
            }
            /*用户-查看*/
            function member_show(title,url,id,w,h){
                x_admin_show(title,url,w,h);
            }

             
            
            
            //清空查询
            function qkcx(){
            	
            	document.getElementById("username").value="";
            	document.getElementById("fid").value="0";
            	document.getElementById("awa").value="0";
            	
            }
            
         
            
            
            
            
        	
            </script>
            
    </body>
</html>