<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="bean.Prod"%>
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

		<title>My JSP 'list.jsp' starting page</title>

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
		<%
			List list = (List) request.getAttribute("list");

			//获取分页参数
			int pagecount = Integer.parseInt(request.getAttribute("pageCount")
					+ "");
			int currPage = Integer.parseInt(request.getAttribute("currPage")
					+ "");
			int totalRow = Integer.parseInt(request.getAttribute("totalRow")
					+ "");
			int totalpage = Integer.parseInt(request.getAttribute("totalpage")
					+ "");
		%>
		<table cellspacing="1" bgcolor="yellow" align="center" width="70%">
			<tr bgcolor="gray">
				<th>
					编号
				</th>
				<th>
					商品名称
				</th>
				<th>
					商品价格
				</th>
				<th>
					生产日期
				</th>
				<th>
					生产地址
				</th>
				<th>
					库存
				</th>
			</tr>
			<%
				for (int i = 0; i < list.size(); i++) {
					Prod prod = (Prod) list.get(i);
			%>

			<tr bgcolor="white" align="center">
				<td><%=prod.getId()%></td>
				<td><%=prod.getPname()%></td>
				<td><%=prod.getPrice()%></td>
				<td><%=prod.getPdate()%></td>
				<td><%=prod.getPcounty()%></td>
				<td><%=prod.getPcount()%></td>
			</tr>
			<%
				}
			%>
			<tr bgcolor="white">
				<td colspan="6">
					每页显示<%=pagecount%>，共<%=totalRow%>条，当前<%=currPage%>/<%=totalpage%>页
					<a href="prod?method=list&cpage=1">首页</a>
					<a href="prod?method=list&cpage=<%=currPage - 1%>">上一页</a>

					<%
						for (int i = 0; i <= totalpage; i++) {
					%>
					<a href="prod?method=list&cpage=<%=i %>"><%=i %></a>
					<%
						}
					%>
					<a href="prod?method=list&cpage=<%=currPage + 1%>">下一页</a>
					<a href="prod?method=list&cpage=<%=totalpage%>">末页</a> 转跳到
					<input type="text" id="pp" size="20" />

					<input type="button" onclick="gopage();" value="转跳" />
				</td>
			</tr>
		</table>
		<script type="text/javascript">
		function gopage(){
		//获取文本框页码
		var pa=document.getElementById("pp").value;
		if((!isNaN.(pa)){
		//请求
		location.href="prod?method=list&cpage="+pa
		}else{
		alert("请输入正确页码！");
		}
		}
		</script>
	</body>
</html>
