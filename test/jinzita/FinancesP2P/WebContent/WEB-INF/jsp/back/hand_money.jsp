<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="<%=path%>/">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>金字塔 - 综合金融服务后台管理 - 手动放款</title>
	<meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="lib/layui/lay/modules/laypage.js"></script>
	<link rel="stylesheet" href="./css/x-admin.css" media="all">
	<style>
			div.div-wenxin{
				width: 500px;
				height: auto;
				background: #f2f2f2;
				border: 1px solid #2299ee;
			}
			div.div-wenxin1{
				width: 80%;
				margin: 0 auto;
				color: #767676;
			}
			div.div-wenxin2{
				margin-top: 20px;
			}
			input.fangkuang-ipu1{
				background: white;
				border: 1px solid #767676;
				border-radius: 4px;
				padding: 2px 6px 2px 6px;
				cursor: pointer;
				outline: #767676;
			}
			
			input.fangkuang-ipu{
				height: 20px;
				outline: none;
			}
		</style>
    </head>
    <body>
        <div class="x-nav">
            <span class="layui-breadcrumb">
              <a><cite>首页</cite></a>
              <a><cite>借款管理</cite></a>
              <a><cite>手动放款</cite></a>
            </span>
            <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  href="javascript:location.replace(location.href);" title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
        </div>
        <div class="x-body">
            <form class="layui-form">
                <div class="div-wenxin">
				<div class="div-wenxin1">
					<div></div>
					<p style="font-size:20px;margin-top:10px;">温馨提示：</p>	
					<p style="font-size:16px;margin-top:10px;margin-bottom:15px;">请输入放款订单号(即用户还款表still的lendId字段)</p>
				</div>
				</div>
				<div class="div-wenxin2">
					<span>放款订单号</span>
					<input type="text"  class="fangkuang-ipu" id="billcode"/>
					<!-- <button  class="layui-btn" lay-filter="save" lay-submit=""> -->
					<input type="button" value="开始放款" class="fangkuang-ipu1" onclick="isNull();" />
				</div>
            </form> 
        </div>
        
        
        <script src="./lib/layui/layui.js" charset="utf-8"></script>
        <script src="./js/x-layui.js" charset="utf-8"></script>
        <script>
            layui.use(['element','layer','form'], function(){
                $ = layui.jquery;//jquery
              lement = layui.element();//面包导航
              layer = layui.layer;//弹出层
              form = layui.form()
              })
              
            function isNull(){
            	if ($("#billcode").val()==""){
            		layer.alert('金额不能为空!',{title: '提示框',icon:0,offset: '60px',});
            	}else{
            		send_Password();
            	}
            }
            
              //修改密码
			  function send_Password(){
            	layer.open({
            		title:'支付密码',
            		offset: 't',
            		content: '<span>公司支付密码：</span><input name="密码" type="password"  id="password">',
            		btn:['确认支付'],
            	 	yes:function(index, layero){		
            	 		 if ($("#password").val()==""){
           				  layer.alert('支付密码不能为空!',{title: '提示框',icon:0,offset: '20px',});
           	          } else{	
           	        	  var password = $("#password").val();
	           	        	$.ajax({  
	                            url: 'userMoney/send_Password',  
	                            type: 'POST',  
	                            data: {"password":password},  
	                            success : function(data) {
	        						if(data=="success"){
	        							handMoney();
	        						}else{
	        							layer.alert('支付密码错误！',{title: '提示框',icon:0,offset: '20px',}); 
	        						}
	        					},error:function(XMLHttpRequest,textStatus){
	        						layer.alert('系统繁忙，请稍后再试！',{title: '提示框',icon:0,offset: '20px',});
	        		       	 	 }					
	                        });
           			  }	 
            		} 
            	    });
          	  }
              
              function handMoney(){
            	var billcode = $("#billcode").val();
            	$.ajax({  
                    url: 'userMoney/discharge_money',  
                    type: 'POST',  
                    data: {"billcode":billcode},  
                    success : function(data) {
						if(data=="success"){
	           				 layer.alert('放款成功！',{title: '提示框',	icon:1,offset: '20px',}); 
						}else{
							layer.alert('没有此订单号，请核对过后再进行放款！',{title: '提示框',	icon:1,offset: '20px',}); 
						}
					},error:function(XMLHttpRequest,textStatus){
						layer.alert('系统繁忙，请稍后再试！',{title: '提示框',icon:0,offset: '20px',});
		       	 	 }					
                });
            }
            </script>
            
    </body>
</html>