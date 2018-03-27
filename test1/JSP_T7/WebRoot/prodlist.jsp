<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="bean.prod"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'prodlist.jsp' starting page</title>
    
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
    //获取从servlet中封装的属性
    List list=(List) request.getAttribute("list");
    
    %>
    
    <table cellspacing="1" bgcolor="yellow" align="center" width="50%">
    <tr bgcolor="yellow"><th>编号</th><th>商品名称</th><th>价格</th><th>生产日期</th><th>产地</th><th>库存</th><th>操作</th></tr>
    <%
    for(int i=0;i<list.size();i++){
    	prod p=(prod)list.get(i);
    	%>
    	<tr bgcolor="white" align="center"><td><%=p.getId() %></td><td><%=p.getPname() %></td><td><%=p.getPrice() %></td><td><%=p.getPricty() %></td><td><%=p.getPdate() %></td><td><%=p.getPcount() %></td><<td><a href="prod?method=toupd&id=<%=p.getId() %>">修改</a>       删除</td></tr>
    	<%
    }
    %>
    </table>
    <br/><br/><br/><br/><br/><br/>
    <a href="prodadd.jsp">新增商品</a>
  </body>
</html>
