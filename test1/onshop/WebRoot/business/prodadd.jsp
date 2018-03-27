<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>商品添加</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>

	<body>
	
		<form action="business?method=prodadd" method="post" name="frm"
			enctype="multipart/form-data">
			<table width="60%" align="center" cellspacing="1" bgcolor="gray">
				<tr>
					<th colspan="2">
						团购添加
					</th>
				</tr>
				<tr bgcolor="white">
					<td>
						名称：
					</td>
					<td>
						<input type="text" value="${p.pname }" name="pname" />
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						一级分类
					</td>
					<td>
						<select name="ptype1">
							<option ${p.ptype1=='点心'?'selected':'' }>
								点心
							</option>
							<option ${p.ptype1=='膨化'?'selected':'' }>
								膨化
							</option>
							<option ${p.ptype1=='蜜饯'?'selected':'' }>
								蜜饯
							</option>
							<option ${p.ptype1=='果茶'?'selected':'' }>
								旅游
							</option>
						</select>
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						二级分类
					</td>
					<td>
						<select name="ptype2">
							<option ${p.ptype2=='蛋糕'?'selected':'' }>
								蛋糕 
							</option>
							<option ${p.ptype2=='巧克力'?'selected':'' }>
								巧克力
							</option>
							<option ${p.ptype2=='熟食'?'selected':'' }>
								熟食
							</option>
							<option ${p.ptype2=='饼干'?'selected':'' }>
								饼干
							</option>
							<option ${p.ptype2=='卤味'?'selected':'' }>
								卤味
							</option>
							<option ${p.ptype2=='炒货'?'selected':'' }>
								炒货
							</option>
							<option ${p.ptype2=='素食'?'selected':'' }>
								素食
							</option>
							
						</select>
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						团购价：
					</td>
					<td>
						<input type="text" value="${p.pprice }" name="pprice" />
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						市场价：
					</td>
					<td>
						<input type="text" name="pmarket" value="${p.pmarket }"/>
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						商圈
					</td>
					<td>
						<select name="ptrad">
							<option ${p.ptrad=='南门口'?'selected':'' }>
								南门口
							</option>
							<option ${p.ptrad=='万象城'?'selected':'' }>
								万象城
							</option>
							<option ${p.ptrad=='万盛'?'selected':'' }>
								万盛
							</option>
							<option ${p.ptrad=='大润发'?'selected':'' }>
								大润发
							</option>
							<option ${p.ptrad=='沙河'?'selected':'' }>
								沙河
							</option>
							<option ${p.ptrad=='沙石'?'selected':'' }>
								沙石
							</option>
							<option ${p.ptrad=='章江北'?'selected':'' }>
								章江北
							</option>
						</select>
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						套餐内容
					</td>
					<td>
						<textarea name="pcontent" cols="60" rows="6" value="${p.pcontent }"></textarea>
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						使用说明
					</td>
					<td>
						<textarea name="pdesc" cols="60" rows="6" value="${p.pdesc }"></textarea>
					</td>
				</tr>
				
				<tr bgcolor="white">
					<td>
						有效期
					</td>
					<td>
						<input type="text" name="ptime"  value="${p.ptime }"/>
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						图片
					</td>
					<td id="item">
						<input type="file" name="ff"  value="${p.img }"/>
						<input type="button" value="添加" onclick="add()" />
					</td>
				</tr>
				<tr bgcolor="white">
					<td colspan="2">
						<input type="button" value="提交" onclick="check()"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
	<script>
		
		function check(){
			document.frm.submit();
		}
	
	</script>
	
	<script>
			 var i=1;
		function add(){
			if(i<5){
			
				i++;
				
				//把组件添加到td中
				var td = document.getElementById("item");//td对象
	
				//使用JS创建页面标签
				var br = document.createElement("br");//换行标签
	
				//文件选择框
				var file = document.createElement("input");
				file.type="file";//指定组件类型
				file.name="ff";//指定文件选择框的名称
	
				
				//创建按钮
				var btn = document.createElement("input");
				btn.type="button";
				btn.value="删除";
	
				//用JS给按钮添加事件
				btn.onclick=function(){
					//从TD中移除当前生成的组件
					td.removeChild(br);
					td.removeChild(file);
					td.removeChild(btn);
					i--;
				}
	
				
				
				//appendChild 将组件添加到另外的组件中
				td.appendChild(br);
				td.appendChild(file);
				td.appendChild(btn);
			
			
			}else{
				alert("最多添加5张图片!");
			}
			  }
  </script>
</html>
