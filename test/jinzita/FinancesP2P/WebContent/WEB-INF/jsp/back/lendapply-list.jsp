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
<title>金字塔 - 综合金融服务后台管理 - 借款申请记录</title>
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
			a:focus{text-decoration: none}
			a:focus{outline:none;}
		</style>
</head>
<body>
	<input type="text" id="lii" value="${list2 }" style="display: none;">
	<input type="text" id="ll" value="${ll[1] }" style="display: none;">
	<input type="text" id="cont" value="${ll[0] }" style="display: none;" >
	<div class="x-nav">
		<span class="layui-breadcrumb"> <a><cite>首页</cite></a> <a><cite>借款管理</cite></a>
			<a><cite>借款申请记录</cite></a>
		</span> <a class="layui-btn layui-btn-small"
			style="line-height: 1.6em; margin-top: 3px; float: right"
			href="javascript:location.replace(location.href);" title="刷新"><i
			class="layui-icon" style="line-height: 30px">ဂ</i></a>
	</div>
	<div class="x-body">
		<form class="layui-form x-center" name="frm"
			action="lendApply/lendApply-fy" style="width: 800px">
			<div class="layui-form-pane" style="margin-top: 15px;">
				<div class="layui-form-item">
					<label class="layui-form-label">用户名</label>
					<div class="layui-input-inline">

						<input type="text" id="username" name="username" value="${ll[2] }"
							placeholder="用户名" autocomplete="off" class="layui-input">
					</div>
					<label class="layui-form-label">真实姓名</label>
					<div class="layui-input-inline">

						<input type="text" id="realname" name="realname" value="${ll[3] }"
							placeholder="真实姓名" autocomplete="off" class="layui-input">
					</div>

					<div class="layui-input-inline" style="width: 80px">
						<button class="layui-btn" name="" lay-submit=""
							lay-filter="sreach">
							<i class="layui-icon">&#xe615;</i>
						</button>
					</div>
				</div>
			</div>
		</form>
		<xblock>
			<button class="layui-btn layui-btn-danger" onclick="delAll()">
				<i class="layui-icon">&#xe640;</i>批量删除
			</button>
	            <button class="layui-btn" onclick="exportt();" style="margin-left: 20px;"><i class="layui-icon">&#xe601;</i>导出</button>
            	<a href="http://localhost:8080/FinancesP2P/img/1.jpg" download="a.jpg" id="a_dc"><span id="spanAutoClick"></span></a>
	            <span class="x-right" style="line-height:40px;margin-right: 30px;">共有数据：${ll[0] } 条</span>
		</xblock>
		<table class="layui-table">
			<thead>
				<tr>
					<th><input type="checkbox" name="" value="" id="fx" onclick="seltAll();"></th>
					<th>用户名</th>
					<th>姓名</th>
					<th>电话</th>
					<th>借款金额</th>
					<th>借款期限</th>
					<th>还款方式</th>
					<th>申请时间</th>
					<th>状态</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody id="x-link">
				<c:forEach items="${list}" var="list">
					<tr>
						<td><input type="checkbox" value="${list.id }" name="chckBox"></td>
						<td>${list.username}</td>
						<td>${list.realname }</td>
						<td>${list.phone }</td>
						<td><c:if test="${list.lendmoney=='' || list.lendmoney==null }"></c:if>
								<c:if test="${list.lendmoney!='' && list.lendmoney!=null }">${list.lendmoney }元</c:if>
						</td>
						<td><c:if test="${list.lendtime=='' || list.lendtime==null }"></c:if>
								<c:if test="${list.lendtime!='' && list.lendtime!=null }">${list.lendtime }个月</c:if>
						</td>
						<td><c:if test="${list.backType=='' || list.backType==null }"></c:if>
								<c:if test="${list.backType!='' && list.backType!=null }">${list.backType }</c:if>
						</td>
						<td><fmt:formatDate value="${list.applytime }" pattern="yyyy-MM-dd HH:mm:ss" /></td>
						<td>
						        <c:if test="${list.status=='已处理' }">
									<span class="layui-btn layui-btn-disabled layui-btn-mini">${list.status } </span>
								</c:if>
								<c:if test="${list.status=='未处理' }">
									<span class="layui-btn layui-btn-normal layui-btn-mini">${list.status}</span>
								</c:if>
						</td>
						<td class="td-manage">
							<a title="编辑" href="javascript:;" onclick="member_edit('编辑','member-edit.html','${list.id}','600','480')"
                            class="ml-5" style="text-decoration:none">
                                <i class="layui-icon">&#xe642;</i>
                            </a>
							<a title="删除" href="javascript:;" onclick="commemt_del(this,'${list.id}')" style="text-decoration: none">
								 <i class="layui-icon">&#xe640;</i>
							</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<div id="page" style="margin-top: 0px;"></div>
	</div>

	<script src="./lib/layui/layui.js" charset="utf-8"></script>
	<script src="./js/x-layui.js" charset="utf-8"></script>

	<script type="text/javascript">
		function option(curr) {

			var username = document.getElementById("username").value;
			var realname = document.getElementById("realname").value;

			window.location.href = 'lendApply/text?cont='+curr+'&'+'title='+ username +'&'+'people='+realname;
		}
		
		//导出
		function exportt(){
      		var username=document.getElementById("username").value;
		    var realname=document.getElementById("realname").value;
        	var cont=document.getElementById("cont").value;
        	if(parseInt(cont)>parseInt(0)){
        		layer.confirm('确定要导出吗？',function(index){
    		     $.ajax({  
		                url: 'lendApply/testsExport',  
		                type: 'POST', 
		                data: {
		                	username:username,
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
		layui.use([ 'laydate', 'element', 'laypage', 'layer' ], function() {
			$ = layui.jquery;//jquery
			laydate = layui.laydate;//日期插件
			lement = layui.element();//面包导航
			laypage = layui.laypage;//分页
			layer = layui.layer;//弹出层

			//以上模块根据需要引入
			var co = document.getElementById("lii").value;
			var co2 = document.getElementById("ll").value;
			laypage({
				cont : 'page',
				pages : co2,
				first : 1,
				curr : co,
				last : co2,
				prev : '<em><</em>',
				next : '<em>></em>',
				jump : function(obj, first) {
					var curr = obj.curr;
					if (!first) { //一定要加此判断，否则初始时会无限刷新
						option(curr);//调用方法

					}
				}
			});

		});

		//去新增页面的方法
		function lendapply_add(title, url, w, h) {
			var url = "lendApply/lendApply-getadd";
			x_admin_show(title, url, w, h);
		}

		// 用户-编辑
		function member_edit(title, url, id, w, h) {

			var url = "lendApply/lendApply-getupdate?id=" + id;
			x_admin_show(title, url, w, h);
		}
		

		//全选
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

		//批量删除提交
		function delAll () {

          	 var des =[];//建立数组
          	 var i=0;

          	 //取得选中复选框值
          	 $('input[name="chckBox"]:checked').each(function(){
          		 
                   var sfruit=$(this).val();//取值
                  
                   des[i]=sfruit;//赋值
                   
                   i++;
                   
                   });
          	 
          	 
          	 layer.confirm('确认要删除吗？',function(index){
          			
          		 $.ajax({
          				
          				async:true,
          				cache:true,
          				url:'lendApply/csNat',//自己的地址
          				type:'post',
          				traditional: true,//传数组进后台需要设置该属性
          				data:{
          					
          					'des':des
          				
          				},
          				
          				dataType:'json',
          				
          				success:function(data){
          					
          					if(data.msg == "success") {
          						
          							
          						// location.reload();
          						 window.location.href='lendApply/list';		   
          							
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

		/*删除*/
		function commemt_del(obj, id) {
			var s = id;
			layer.confirm('确认要删除吗？', function(index) {
				$.ajax({
					url : 'lendApply/delter',
					type : 'POST',
					data : {
						"id" : s
					},
					success : function(data) {
						console.info(data);
						if (data == "success") {
							$(obj).parents("tr").remove();
							layer.msg('已删除!', {
								icon : 1,
								time : 1000
							});
							location.reload();
						}
					}
				});
			});
		}
		// 编辑
        function member_edit (title,url,id,w,h) {
        var url="lendApply/lendApply-update?id="+id;
            x_admin_show(title,url,w,h); 
        }
		 /*处理*/
        function banner_start(obj,id){
            layer.confirm('确认处理完成？',function(index){
                $.ajax({
    				async:true,
    				cache:true,
    				url:'lendApply/lendApply-updateStates',
    				type:'post',
    				data:{
    					'id':id
    				},
    				success:function(data){
    					console.info(data);
    					if(data == "success") {
    						layer.msg('已处理!',{icon: 6,time:1000});
    		                setTimeout(function(){
    		                    //add your code
    		                	location.reload();
    		                },500);//延迟1000毫米
    					} else {
    						layer.alert('提交失败！',{
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
	</script>

</body>
</html>