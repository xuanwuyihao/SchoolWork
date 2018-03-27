
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
            金字塔 - 综合金融服务后台管理系统 - 收款表
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
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
        <link rel="stylesheet" href="./lib/layui/css/layui.css">
        
        <style type="text/css">
			a:focus{text-decoration: none}
			a:focus{outline:none;}
		</style>	
</head>
<body>
    <input type="text" id="lii" value="${list2 }" style="display: none;" >
    <input type="text" id="ll" value="${ll[1] }"  style="display: none;">
     <input type="text" id="cont" value="${ll[0] }"  style="display: none;">
      <div class="x-nav">
		<a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  href="gathering/list" title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
	</div>

        <div class="x-body" >
     <div style="width:100%;">
            <form class="layui-form x-center" action="gathering/gathering-mh" style="width:450px;margin-left: 160px">
                <div class="layui-form-pane" style="margin-top: 15px;">
                  <div class="layui-form-item">
                    <label class="layui-form-label" style="width: 22%;">真实姓名</label>
                    <div class="layui-input-inline">
                     
                       <input type="text" id="realname" name="realname" value="${ll[2] }" placeholder="输入真实姓名" autocomplete="off" class="layui-input">
                    </div>
                    
                    <div class="layui-input-inline" style="width:80px">
                        <button class="layui-btn"  name="" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
                    </div>
                  </div>
                  
                </div> 
                
            </form>
            <div style="margin-top: -55px;margin-left:65%">
            	<font style="line-height:40px;margin-left: 0px;font-family: 微软雅黑;font-size: 20px;">待收汇总：
            		<c:if test="${sum!=0 }"><fmt:formatNumber value='${sum }' pattern='#,###.00'/></c:if>
            		<c:if test="${sum==0 }">0.00</c:if>
            	</font><b> 元</b>&nbsp;&nbsp;</span></font>
            </div> </div>
            <xblock>
                <button class="layui-btn" onclick="exportt();" style="margin-left: 10px;margin-top: -5px;"><i class="layui-icon">&#xe601;</i>导出</button>
            	<a href="http://localhost:8080/FinancesP2P/img/1.jpg" download="a.jpg" id="a_dc"><span id="spanAutoClick"></span></a>
				<span class="x-right" style="line-height:40px;margin-right: 30px;">共有数据：${ll[0] } 条&nbsp;&nbsp;</span>
            </xblock>
            <table class="layui-table" lay-even="red" lay-skin="row" >

                <thead>
                    <tr>
                    	<th>ID</th>
                        <th>用户名</th>
                        <th>真实姓名</th>
                        <th>借款标题</th>
                        <th>项目期限</th>
                        <th>还款时间</th>
					    <th>已收本金</th>
        				<th>已收利息</th>
					    <th>待收总额</th>
                    </tr>
                </thead>
                   
                <tbody id="x-img">
               <c:forEach items="${list }" var="list">
                    <tr>
                        <td>
                            ${list.id }
                        </td>
                        <td>
                            ${list.username }
                        </td>
                         <td >
                            ${list.realname }
                        </td>
                        <td >
                            ${list.billcode }
                        </td>
                        <td >
                            ${list.lendtime }
                        </td>
                        <td >
                        	<fmt:formatDate value="${list.stilldtate }" pattern="yyyy-MM-dd HH:mm:ss" />
                        </td>
                        <td >
                            ${list.hasgold }
                        </td>
                 		<td >
                            ${list.hasmoney }
                        </td>
                         <td >
                            ${list.hasallmoney }
                        </td>
<!--                         <td class="td-manage"> -->
                           
<!--                             <a title="去充值记录"  href="javascript:;"  -->
<%--                             class="ml-5" style="text-decoration:none" onclick="ClickEvent('${list.username }');"> --%>
<%--                                 <i class="layui-icon"><cite>&#xe60e;</cite></i> --%>
                                
<!--                             </a> -->
<%--                            <a title="去提现记录" href="javascript:;" onclick="getLift('${list.username }')" --%>
<!--                             class="ml-5" style="text-decoration:none"> -->
<!--                                 <i class="layui-icon">&#xe60e;</i> -->
<!--                             </a> -->
<%--                             <a title="去资金流向记录" href="javascript:;" onclick="parent.log_money2('${list.username }');" --%>
<!--                             class="ml-5" style="text-decoration:none"> -->
<!--                                 <i class="layui-icon">&#xe60e;</i> -->
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
        function gath(){
        	location.reload();
        }
        function option(curr){
        	var realname=document.getElementById("realname").value;
        	window.location.href='gathering/text?cont='+curr+'&'+'people='+realname;
        }
        function exportt(){
  		  var realname=document.getElementById("realname").value;
	        	var cont=document.getElementById("cont").value;
	        	if(parseInt(cont)>parseInt(0)){
	        		layer.confirm('确定要导出吗？',function(index){
	        		 	$.ajax({  
	  		                url: 'gathering/testsExport',  
	  		                type: 'POST',  
	  		                data: {
	  		                	realname:realname,
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
  		    						layer.msg(data+'导出失败！' );
  		    					}
	  		    			}					
	 		    		
	  		            });
	        		});
	        	}else{
	        		layer.msg('没有数据-导出失败！' );
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

           

            </script>
           
    </body>
</html>