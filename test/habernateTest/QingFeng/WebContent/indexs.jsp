<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理界面</title>
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

<script id="others_jquery_easyui_131" type="text/javascript" class="library" src="script/rili/easyui-lang-zh_CN.js"></script>
<script id="others_jquery_easyui_131" type="text/javascript" class="library" src="script/rili/jquery.fullcalendar.js"></script>


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
	
	margin:10px;
	font-family:'楷体';
	font-size: 32px;
}

.te{
	width: 350px;
	height: 35px;
	border-radius: 5px;
	border: 0.5px solid #0492d6;
	padding-left: 5px;
	font-family:'楷体';
	font-size: 32px;
	padding:50px;
	margin:10px;
}

.te:hover{
	letter-spacing: 1px;
	border: 0.5px solid red;
	color: red;
	background-color: rgba(255, 255, 255, 0.5);
}

.ta{
	
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
			width:1000,
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
				width : 50,
				sortable : true
			},  {
				field : 'uname',
				title : '姓名',
				width : 50,
				sortable : true
			}, {
				field : 'uage',
				title : '年龄',
				width : 50,
				sortable : true
			}, {
	            field: 'id',
	            title: '选择',
	            width: 10,
	            formatter: function(value, rowData, rowIndex){
	                return '<input type="radio" style="width:15px;height:15px;border-radius:5px;" name="selectRadio" id="selectRadio"' + rowIndex + '    value="' + rowData.oid + '" />';
	                
	            }
	        },{
	        	title:'操作',
		        width:10,
	        	field:'checked',formatter:function(value,row,index){
		        	if(row.checked){
		        		return '<input type="checkbox" id="cb" name="DataGridCheckbox" checked="checked">';
		        	} else {
		        		return '<input type="checkbox" id="cb" name="DataGridCheckbox">';
		        	}
	        	}
	        
	        } ] ]
	        
		});
		/* $("#tb").trigger(alert($("#cb").datagrid('getSelections')));
		alert($("#cb").datagrid('getSelections')); */
	});
	var row = $('#tb').datagrid('getSelected');
	if (row){
		alert("GSDGS");
		alert('Item ID:'+row.id+" Name:"+row.name);
	}
	/* $(function(){
		$("#tb").click(function(){
			alert($("#cb").datagrid('getSelections'));
		});
	}); */
	
	//复选框
	/* $('#ButonGetCheck').click(function(){
		var checkedItems = $('#tb').datagrid('getChecked');
			var names = [];
			$.each(checkedItems, function(index, item){
				names.push(item.productname);
			});               
			//console.log(names.join(","));
		});
	});
 
	$.extend($.fn.datagrid.methods, {
		getChecked: function (jq) {
			var rr = [];
			var rows = jq.datagrid('getRows');
			jq.datagrid('getPanel').find('div.datagrid-cell input:checked').each(function () {
				var index = $(this).parents('tr:first').attr('datagrid-row-index');
				rr.push(rows[index]);
			});
			return rr;
		}
	}); */
	
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
			$("#tt").click(function(){
				
			});
		}
	}
	
	/* alert($("#tb").datagrid("getChecked")); */
	
	/* $(window).resize(function () {
        $('#tb').datagrid('resize', {
            width: $(window).width() - 10,
            height: $(window).height() - 35
        }).datagrid('resize', {
            width: $(window).width() - 10,
            height: $(window).height() - 35
        });
    }); */
	
    

		//表格宽度自适应，这里的#tb是datagrid表格生成的div标签
		function fitCoulms(){
		    $('#tb').datagrid({
		        fitColumns:true
		    });
		} 
		
		//单选框
		/* onLoadSuccess: function(data){
            //加载完毕后获取所有的checkbox遍历
            if (data.rows.length > 0) {
                //循环判断操作为新增的不能选择
                for (var i = 0; i < data.rows.length; i++) {
                    //根据operate让某些行不可选
                    if (data.rows[i].operate == "false") {
                        $("input[type='radio']")[i].disabled = true;
                    }
                }
            }
        },
        onClickRow: function(rowIndex, rowData){
            //加载完毕后获取所有的checkbox遍历
            var radio = $("input[type='radio']")[rowIndex].disabled;
            //如果当前的单选框不可选，则不让其选中
            if (radio!= true) {
                //让点击的行单选按钮选中
                $("input[type='radio']")[rowIndex].checked = true;
            }
            else {
                $("input[type='radio']")[rowIndex].checked = false;
            }
        } */
        
        $(function(){
  		/*初始加载，表格宽度自适应*/
  		    $(document).ready(function(){
  		        fitCoulms();
  		    });
  			/*浏览器窗口大小变化后，表格宽度自适应*/
  		    $(window).resize(function(){
  		        fitCoulms();
  		    });
  		});
        
</script>

</head>
<body class="easyui-layout">
	<div data-options="region:'north',split:true,border:false"
		title="North Title"
		style="height: 80px; width: 100%; background: #A9FACD;">
		
		<div><img src="images/logo.png"></div>
		
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
	<div data-options="region:'center',split:true" title="Center Title"
		style="padding: 3px; maring: 0px; background: red; border-color: #95B8E7;">

		<div class="easyui-tabs" fit="true" id="tt"
			style="width: 500px; height: 250px;">


			<div title="首页" iconCls="fi-home" style="padding: 5px;iconCls:'fi-home'">
				
				<!-- 日历 -->
				<div region="center" style="width:50%;height:100%;float:left;">
       		 		<div class="easyui-fullCalendar" fit="true"></div>
    			</div>
    			
    			<!-- 事件提示框 -->
    			<div style="width:50%;height:100%;float:right;">
    				<div>
    					<label class="la">今日事项:</label>
	    				<input type="text" class="te" />
    				</div>
    				<div class="ta">
    					<a>添加</a>
    				</div>
    			</div>
				<%-- <div class="easyui-layout" data-options="fit:true">
					
					<div data-options="region:'center'">
						<jsp:include page="rili.jsp" flush="true"/>
						
						<img alt="" src="images/lo.jpg" style="width:60%;height:100%;float:right;" />
					</div>
				</div> --%>
				
				<!-- <table class="easyui-datagrid"
					data-options="url:'datagrid_data1.json',method:'get',singleSelect:true,fit:true,fitColumns:true">
					<thead>
						<tr>
							<th data-options="field:'status',align:'center'" width="50">Status</th>
						</tr>
					</thead>
				</table> -->
				<!-- <div class="easyui-navpanel">
					<div class="easyui-panel" style="width: 400px; padding: 50px 60px;">
						<div style="margin-bottom: 20px">
							<input class="easyui-textbox" prompt="Username" iconWidth="28"
								style="width: 100%; height: 34px; padding: 10px;">
						</div>
						<div style="margin-bottom: 20px">
							<input id="pass" class="easyui-passwordbox" prompt="Password"
								iconWidth="28" style="width: 100%; height: 34px; padding: 10px">
						</div>
						<div style="margin-bottom: 20px">
							<input class="easyui-passwordbox" prompt="Confirm your password"
								iconWidth="28" validType="confirmPass['#pass']"
								style="width: 100%; height: 34px; padding: 10px">
						</div>
					</div>

					Password does not match confirmation.
					<script type="text/javascript">
						$.extend(
							$.fn.validatebox.defaults.rules,{
									confirmPass : {
									validator : function(value,param) {
										var pass = $(param[0]).passwordbox('getValue');
											return value == pass;
										},message : '您输入的两次密码不一致,请重新输入!'
									}
							})
					</script>
				</div> -->
			</div>

			<div style="display: none;" title="结果">
				<table class="easyui-datagrid" id="tb" style="width: 97%">
					
				</table>
			</div>


		</div>
	</div>
	<div data-options="region:'west',split:true" title="West Title"
		style="width: 120px">
		<div class="easyui-accordion" data-options="fit:true,border:false">
			
			<div title="权限管理" style="padding: 15px;font-size:19px;font-family: '楷体';">
				<div>管理可见</div>
				<br />
				<div title="资源管理">
					<a onclick="addTab('资源管理','houtai/ziyuan.jsp')">资源管理</a>
				</div>
				<br />
				<div title="角色管理">
					<a onclick="addTab('角色管理','houtai/juese.jsp')">角色管理</a>
				</div>
				<br />
				<div title="用户管理">
					<a onclick="addTab('用户管理','houtai/yonghu.jsp')">用户管理</a>
				</div>
				<br />
				<div title="部门管理">
					<a onclick="addTab('部门管理','houtai/bumen.jsp')">部门管理</a>
				</div>
				<br />

			</div>
			<!-- *************************************************************** -->
		
			<div title="首页管理" style="padding: 10px;font-size:19px;font-family: '楷体';">
				<div>超级管理员可见</div>
				<br />
				<div title="首页轮播图管理">
					<a onclick="addTab('图片','beanimage.jsp')">首页轮播图</a>
				</div>
				<br />
				<div title="首页新闻管理">
					<a onclick="addTab('新闻','beantext.jsp')">新闻中心</a>
				</div>
				<br />
				<div title="合作平台管理">
					<a onclick="addTab('合作','beantmdj.jsp')">合作平台</a>
				</div>
				<br />
				<div title="通知公告管理">
					<a onclick="addTab('公告','beantzgg.jsp')">通知公告</a>
				</div>
				<br />

			</div>
			
			<!-- *********************************************************** -->
			<div title="学生报名管理" style="padding: 10px;font-size:19px;font-family: '楷体';">
				<div>管理员(老师)可见</div>
				<div title="艺考培训报名">
					<a onclick="addTab('艺考培训报名','houtai/yikaopeixun.jsp')">艺考培训报名</a>
				</div>
				<br />
				<div title="成人教育报名">
					<a onclick="addTab('成人教育报名','houtai/chengrenjiaoyu.jsp')">成人教育报名</a>
				</div>
				<br />
				<div title="文件上传管理">
					<a onclick="addTab('文件上传管理','houtai/wenjianshangchuan.jsp')">文件上传管理</a>
				</div>
				
				<br />
				
			</div>
			
			<!-- ********************************************************* -->
			
			<div title="学生管理" style="padding: 10px;font-size:19px;font-family: '楷体';">
				<div>管理员(老师)可见</div>
				<div title="招生名单">
					<a onclick="addTab('招生','studentsZ.jsp')">招生名单</a>
				</div>
				<br />
				<div title="学生管理">
					<a onclick="addTab('学生','studentsS.jsp')">学生管理</a>
				</div>
				<br />
				<div title="学费管理">
					<a onclick="addTab('学费','studentsF.jsp')">学费管理</a>
				</div>
				<br />
				<div title="待办事项">
					<a onclick="addTab('未处理','studentsD.jsp')">待办事项</a>
				</div>
				
				<br />
				
			</div>
			
			<!-- ********************************************************* -->
			
			<div title="专业管理" style="padding: 10px;font-size:19px;font-family: '楷体';">
				<div>管理员可见</div>
				<br />
				<div title="专业管理">
					<a onclick="addTab('专业管理','houtai/zhuanye.jsp')">专业管理</a>
				</div>
				<br />
				<div title="热门专业">
					<a onclick="addTab('热门专业','houtai/remen.jsp')">热门专业</a>
				</div>
				<br />
				<div title="招生简章">
					<a onclick="addTab('招生简章','houtai/zhaosheng.jsp')">招生简章</a>
				</div>
				
				<br />

			</div>
			
			<!-- *************************************************************** -->
			<div title="财务管理" style="padding: 10px;font-size:19px;font-family: '楷体';">
				<div>管理可见</div>
				<br />
				<div title="成考缴费管理">
					<a onclick="addTab('成考缴费','houtai/chengkao.jsp')">成考缴费管理</a>
				</div>
				<br />
				<div title="会计缴费管理">
					<a onclick="addTab('会计缴费','houtai/kuaiji.jsp')">会计缴费管理</a>
				</div>
				<br />
				
			</div>
			
			<!-- ************************************************************ -->
			<div title="日志监控" style="padding: 10px;font-size:19px;font-family: '楷体';">
				<div>管理可见</div>
				<br />
				<div title="登录日志">
					<a onclick="addTab('登录日志','houtai/denglu.jsp')">登录日志</a>
				</div>
				<br />
				<div title="系统图标">
					<a onclick="addTab('系统图标','houtai/xitong.jsp')">系统图标</a>
				</div>
				<br />
				
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
			
			<!-- ************************************************************************ -->
			
			<div title="关于" style="padding: 10px;font-size:19px;font-family: '楷体';background-color:rgba(255,255,255,0.25);background-image:url(images/lo.jpg);">
				<div>后台管理界面</div>
				<br />
				<div title="点击查看图片">
					<a onclick="addTab('Image','images/lo.jpg')">images</a>
				</div>
				<br />
			</div>
			<div title="" data-options="selected:true"></div>
		</div>
	</div>
	<div data-options="region:'east',split:true,collapsed:true"
		title="East Title" style="width: 120px; background: #ffffff;"
		class="panel-header">
		<!-- collapsed:true -->
		<!--  class="panel-header" -->
	</div>
	<div data-options="region:'south',split:true,border:false"
		title="South Title"
		style="height: 80px; padding: 10px; background: #B3DFDA;"></div>
</body>
</html>