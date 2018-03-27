<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="s" uri="/struts-tags" %>
	<%@ page import="java.util.*" %>
	<%@ page import="com.qf.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>&nbsp;清风教育网 - 后台管理系统</title>
<link rel="icon" href="images/logo/logo2.ico" />
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/jquery.min.js"></script>
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="script/jquery-easyui-1.5.2/themes/gray/easyui.css" />
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="script/jquery-easyui-1.5.2/themes/icon.css" />
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/jquery.easyui.min.js" charset="utf-8"></script>
<!-- <script type="text/javascript"
	src="script/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js"
	charset="utf-8"></script> -->

<!--  id="others_jquery_easyui_131" type="text/javascript" class="library"  -->
<script src="script/rili/easyui-lang-zh_CN.js"></script>
<script src="script/rili/jquery.fullcalendar.js"></script>

<!-- 时钟 -->
<!-- <script src="script/rili/shizhong/circle_JT_min.js"></script> -->

<!-- 拒绝浏览器缓存 -->
<%
response.setHeader("Cache-Control","no-cache"); //HTTP 1.1
response.setHeader("Pragma","no-cache"); //HTTP 1.0
response.setDateHeader ("Expires", 0); //prevents caching at the proxy server
%>


<style type="text/css">
#lb {
	margin: 0;
	padding: 0;
}

a {
	text-decoration: none;
	color: blue;
}

a:hover {
	color: red;
}

.la{
	top:30px;
	width:auto;
	margin:10px;
	font-family:'楷体';
	font-size: x-large;
}

.te{
	width: 90%;
	height: 95%;
	border-radius: 5px;
	border: 0.5px solid #0492d6;
	padding-left: 0px;
	font-family:'楷体';
	font-size: 32px;
	padding:2px;
	margin:10px;
}

.te:hover{
	letter-spacing: 0px;
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}

.ta{
	/* float:left;
	border-left:5px; */
	/* valign:bottom;
	bottom:0px;
	top:500px; */
	margin-left:47%;
	width:75px;
	height:35px;
	border: 0.5px solid #0492d6;
	font-family:'楷体';
	font-size: 30px;
	font-left:3px;
	padding:2px;
}

.ta:hover{
	border: 0.5px solid rgba(123, 123, 123, 0.5);
	background-color: rgba(0, 247, 255, 0.42);
}

.di:hover{
	background-color:rgba(0, 247, 251, 0.08);
}


</style>

<script type="text/javascript">

	$(function() {
		$("#tb").datagrid({
			url : 'us',
			striped : true,   
			idField : 'id',   
			pagination : true,
			pageSize : 10,
			pageList : [ 10, 20, 30, 40, 50 ],
			loadMsg: '正在加载中，请稍等... ',
			emptyMsg: '<span>无记录</span>',
			fitColumns : true,
			width:1100,
			sortName : 'id',
			sortOrder : "desc",
			 onLoadSuccess : function(data) {// 自适应
	           var classify = $("#tb").val();
	            $('#tb').pagination('refresh', {
	                total : data.total,
	                pageNumber : data.page,
	                classify:classify
	            });
	        }, 
			columns : [ [  {
				field : 'uid',
				title : '编号',
				width : 110,
				sortable : true
			},  {
				field : 'uname',
				title : '姓名',
				width : 110,
				sortable : true
			}, {
				field : 'uage',
				title : '年龄',
				width : 110,
				sortable : true
			}, {
	            field: 'id',
	            title: '选择',
	            width: 110,
	            formatter: function(value, rowData, rowIndex){
	                return '<input type="radio" style="width:15px;height:15px;border-radius:5px;" name="selectRadio" id="selectRadio"' + rowIndex + '    value="' + rowData.oid + '" />';
	                
	            }
	        },{
	        	title:'操作',
		        width:110,
	        	field:'checked',formatter:function(value,row,index){
		        	if(row.checked){
		        		return '<input type="checkbox" id="cb" name="DataGridCheckbox" checked="checked">';
		        	} else {
		        		return '<input type="checkbox" id="cb" name="DataGridCheckbox">';
		        	}
	        	}
	        
	        } ] ]
	        
		});
		
		
		/*初始加载，表格宽度自适应*/
		    $(document).ready(function(){
		        fitCoulms();
		    });
		/*浏览器窗口大小变化后，表格宽度自适应*/
		    $(window).resize(function(){
		        fitCoulms();
		    });
		
		
	});
	
	var row = $('#tb').datagrid('getSelected');
	
	if (row){
		alert("GSDGS");
		alert('Item ID:'+row.id+" Name:"+row.name);
	}
	
	
	function addTab(title, url){
		if ($('#tt').tabs('exists', title)){
			$('#tt').tabs('select', title);
		} else {
			var content = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
			$('#tt').tabs('add',{
				title:title,
				content:content,
				closable:true
			});
		}
	}
	
	
		//表格宽度自适应，这里的#tb是datagrid表格生成的div标签
		function fitCoulms(){
		    $('#tb').datagrid({
		        fitColumns:true
		    });
		} 
		
        
</script>

</head>
<body class="easyui-layout">
	<div data-options="region:'north',split:true,border:false"
		style="height: 60px; width: 100%; background: rgba(0, 247, 251, 0.08);">
		
		<div><img src="images/logo/qingfengjiaoyu1.2.png" style="height:55px;"></div>
		
		<!-- <div data-options="iconCls:'icon-man',plain:true"
			class="easyui-linkbutton" title="登录" style="bottom: 9px;"></div> -->

		<div class="m-right"
			style="position: absolute; right: 45px; bottom: 8px; width: 500px;">
			<footer style="padding:2px 3px;"> <input
				class="easyui-textbox" style="width: 100%; height: 32px;"
				data-options="prompt:'请输入您要搜索的内容',buttonText:'<span style=\'padding:0 15px;color:#000;font-size:16px;\'>搜索</span>'">
			</footer>

		</div>
	</div>
	
	<!-- *********这部分是中心面板********** -->
	<div data-options="region:'center',split:true"
		style="padding: 3px; maring: 0px; background: rgba(0, 147, 255, 0.42); border-color: #95B8E7;">

		<div class="easyui-tabs" fit="true" id="tt"
			style="width: 500px; height: 100%;">

			<div title="首页" data-options="iconCls:'icon-sy'" style="width:auto;">
				
				<!-- 日历 -->
				<div region="center" style="width:50%;height:100%;float:left;">
       		 		<div class="easyui-fullCalendar" fit="true"></div>
    			</div>
    			
    			<!-- 事件提示框 -->
    			<div style="width:40%;height:100%;float:right;">
    				
    					
    					<div style="valgin:content;">
	    					<label class="la">工作事项:
		    				
		    				<table width="380">
		    				<s:iterator value="wklist" var="work">
		    					<tr>
		    					<td align="center"> <s:property value="plan_title"/></td>
		    					</tr>
		    					<tr>
		    					<td><s:property value="plan_content"/></td>
		    					</tr>
		    					<tr>
		    					<td align="right">——<s:property value="end_time"/></td>
		    					</tr>
		    					<tr><td>————————————————</td></tr>
		    				</s:iterator>
		    				</table>
		    					
		    			
		    				<br/><a class="ta">添加</a></label>
	    				</div>
	    				<div style="valign:bottom">
	    					
	    				</div>
    			
    			</div>
				
			</div>

			<!-- <div style="display: none;float:right;" title="结果">
				<table class="easyui-datagrid" id="tb" style="width: 97%">
					
				</table>
			</div> -->


		</div>
	</div>
	
	<!-- **********左侧文件树********* -->
	<div data-options="region:'west',split:true" style="width: 150px">
		<div class="easyui-accordion" title="点击查看内容" data-options="fit:true,border:false">
			
			<!-- hideColumn:field ：隐藏 -->
			<!-- <div title=" " data-options="selected:false," ></div> -->
			
			<div class="di" title="权限管理" style="padding: 15px;font-size:19px;font-family: '楷体';">
				<div>管理可见</div>
				<br />
				<div title="资源管理">
					<a onclick="addTab('资源管理','houtai/ziyuan.jsp')"><!-- <img src="images/png/wj.png" style="width:15%;height:15%;"> -->
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						资源管理
					</a>
				</div>
				<br />
				<div title="角色管理">
					<a onclick="addTab('角色管理','user/user.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						角色管理
					</a>
				</div>
				<br />
				<div title="用户管理">
					<a onclick="addTab('用户管理','employee/employee.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						用户管理
					</a>
				</div>
				<br />
				<div title="部门管理">
					<a onclick="addTab('部门管理','department/department.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						部门管理
					</a>
				</div>
				<br />

			</div>
			
			<!-- *********************************************************** -->
			<div title="学生报名管理" style="padding: 10px;font-size:19px;font-family: '楷体';">
				<div>管理员(老师)可见</div>
				<div title="艺考培训报名">
					<a onclick="addTab('艺考培训报名','houtai/yikaopeixun.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						艺考培训报名
					</a>
				</div>
				<br />
				<div title="成人教育报名">
					<a onclick="addTab('成人教育报名','student/exam_chengkao.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						成人教育报名
					</a>
				</div>
				<br />
				<div title="文件上传管理">
					<a onclick="addTab('文件上传管理','stu_file/stu_file.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						文件上传管理
					</a>
				</div>
				
				<br />
				
			</div>
			
			
			<!-- ********************************************************* -->
			
			<div title="专业管理" style="padding: 10px;font-size:19px;font-family: '楷体';">
				<div>管理员可见</div>
				<br />
				<div title="专业管理">
					<a onclick="addTab('专业管理','list2.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						专业管理
					</a>
				</div>
				<br />
				<div title="热门专业">
					<a onclick="addTab('热门专业','houtai/remen.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						热门专业
					</a>
				</div>
				<br />
				<div title="招生简章">
					<a onclick="addTab('招生简章','houtai/zhaosheng.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						招生简章
					</a>
				</div>
				
				<br />

			</div>
			
			<!-- *************************************************************** -->
			<div title="财务管理" style="padding: 10px;font-size:19px;font-family: '楷体';">
				<div>管理可见</div>
				<br />
				<div title="成考缴费管理">
					<a onclick="addTab('成考缴费','payment/payments.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						成考缴费管理
					</a>
				</div>
				<br />
				<div title="艺考缴费管理">
					<a onclick="addTab('会计缴费','student/exam_zhikao.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;"/>
						</label>
						艺考缴费管理
					</a>
				</div>
				<br />
				<div title="学生缴费统计表">
					<a onclick="addTab('学生缴费','payment/finance.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;"/>
						</label>
						学生缴费管理
					</a>
				</div>
				
			</div>
			
			<!-- ************************************************************ -->
			<div title="日志监控" style="padding: 10px;font-size:19px;font-family: '楷体';">
				<div>管理可见</div>
				<br />
				<div title="登录日志">
					<a onclick="addTab('登录日志','houtai/log.jsp')">
					<a onclick="addTab('登录日志','houtai/log.jsp')">
					
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						登录日志
					</a>
				</div>
				<br />
				<div title="系统图标">
					<a onclick="addTab('系统图标','houtai/xitong.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						系统图标
					</a>
				</div>
				<br />
				
			</div>
			<!-- ******************************************************** -->
			
			<div title="财务报表" style="padding: 10px;font-size:19px;font-family: '楷体';">
				<div>财务报表界面</div>
				<br />
				
				<div title="财务报表">
					<a onclick="addTab('财务报表','houtai/cwbb.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						财务报表
					</a>
				</div>
			</div>
			
			<!-- <div title="项目2" style="padding: 10px;">
				text-overflow:inherit;overflow:visible;
				<div class="easyui-navpanel"
					style="line-height: normal; padding: 0px; width: 200px">
					<ul class="easyui-tree" data-options="animate:true,dnd:true">
						<li><span>My Documents</span>
							<ul>
								<li data-options="state:'closed'"><span>Photos</span>
									<ul>
										<li><span>Friend</span></li>
										<li><span>Wife</span></li>
										<li><span>Company</span></li>
									</ul></li>
								<li><span>Program Files</span>
									<ul>
										<li>Intel</li>
										<li>Java</li>
										<li>Microsoft Office</li>
										<li>Games</li>
									</ul></li>
								<li>index.html</li>
								<li>about.html</li>
								<li>welcome.html</li>
							</ul></li>
					</ul>
				</div>
			</div> -->
			 
			
			<!-- *************************************************************** -->
		
			<div title="首页管理" style="padding: 10px;font-size:19px;font-family: '楷体';">
				<div>超级管理员可见</div>
				<br />
				<div title="首页轮播图管理">
					<a onclick="addTab('图片','getCar.action')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						首页轮播图
					</a>
				</div>
				<br />
				<div title="首页新闻管理">
					<a onclick="addTab('新闻','houtai/beantext.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						新闻中心
					</a>
				</div>
				<br />
				<div title="合作平台管理">
					<a onclick="addTab('合作','houtai/beantmdj.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						合作平台
					</a>
				</div>
				<br />
				<div title="通知公告管理">
					<a onclick="addTab('公告','houtai/beantzgg.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						通知公告
					</a>
				</div>
				<br />

			</div>
			<!-- ********************************************************* -->
			
			<div title="学生管理" style="padding: 10px;font-size:19px;font-family: '楷体';">
				<div>管理员(老师)可见</div>
				<div title="招生名单">
					<a onclick="addTab('招生','houtai/studentsZ.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						招生名单
					</a>
				</div>
				<br />
				<div title="学生管理">
					<a onclick="addTab('学生','houtai/studentsS.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						学生管理
					</a>
				</div>
				<br />
				<div title="学费管理">
					<a onclick="addTab('学费','houtai/studentsF.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						学费管理
					</a>
				</div>
				<br />
				<div title="待办事项">
					<a onclick="addTab('未处理','houtai/studentsD.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						待办事项
					</a>
				</div>
				
				<br />
				
			</div>
			<!-- ************************************************************************ -->
			
				<!-- ********************************************************* -->
			
			<div title="工作助手" style="padding: 10px;font-size:19px;font-family: '楷体';">
				<div>管理员(老师)可见</div>
				<div title="全部">
					<a onclick="addTab('全部','work/work.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						全部工作项
					</a>
				</div>
				<br />
				<div title="待完成工作">
					<a onclick="addTab('待完成工作','houtai/studentsS.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						待完成工作
					</a>
				</div>
				<br />
				<div title="已完成工作">
					<a onclick="addTab('已完成','houtai/studentsF.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						已完成工作
					</a>
				</div>
				<br />
				<div title="待办事项">
					<a onclick="addTab('未处理','houtai/studentsD.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						待办事项
					</a>
				</div>
				
				<br />
				
			</div>
			<!-- ************************************************************************ -->
			
			<div title="关于" style="padding: 10px;font-size:19px;font-family: '楷体';">
				<div>后台管理界面</div>
				<br />
				<div title="点击查看图片">
					<a onclick="addTab('Image','images/lo.jpg')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						images
					</a>
				</div>
				<br />
				<div title="关于我们">
					<a onclick="addTab('关于我们','houtai/gywm.jsp')">
						<label>
							<img src="images/png/wj.png" style="width:15px;height:15px;" />
						</label>
						关于我们
					</a>
				</div>
			</div>
			
			<div title="" data-options="selected:true"></div>
		</div>
	</div>
	<div data-options="region:'east',split:true,collapsed:true"
		title="个人中心" style="width: 160px; background: #ffffff;"
		>
		<!-- class="panel-header" -->
		<div >
		<% Employee emp = (Employee)session.getAttribute("employee"); %>
			<label class="la">欢迎<%=emp.getEmp_name() %></label>
			<br/>
			<input type="button" value="退出登录"/>
		</div>
		
	</div>
		<!-- collapsed:true -->
		<!--  class="panel-header" -->
	
	<!-- <div data-options="region:'south',split:true,border:false;"
		title="底部相关" 
		style="height: 80px; padding: 10px; background: #B3DFDA;"></div> -->
</body>
</html>