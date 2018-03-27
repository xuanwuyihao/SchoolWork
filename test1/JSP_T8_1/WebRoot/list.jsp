<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="bean.bean"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
    //获取结果list
    List list=(List) request.getAttribute("list");
    
    
    int currpage=Integer.parseInt(request.getAttribute("currpage")+"");
    int pagecount=Integer.parseInt(request.getAttribute("pagecount")+"");
    int totalRow=Integer.parseInt(request.getAttribute("totalRow")+"");
    int totalpage=Integer.parseInt(request.getAttribute("totalpage")+"");
    %>
    
    <h2 align="center">图书列表</h2>
    <hr/>
    <table cellspacing="1" bgcolor="green" align="center" width="70%">
    <tr><th>封面图片</th><th>图书编号</th><th>图书名称</th><th>图书价格</th><th>图书作者</th>
    <th>图书出版社</th><th>图书状态</th><th>操作</th>
    
    <%
    for(int i=0;i<list.size();i++){
    	bean b=(bean)list.get(i);%>
    	<tr>
    	<td><%=b.getBimg() %></td>
    	<td><%=b.getBid() %></td>
    	<td><%=b.getBimg() %></td>
    	<td><%=b.getBprice() %></td>
    	<td><%=b.getBauthor() %></td>
    	<td><%=b.getBpress() %></td>
    	<td><%=b.getBstate() %></td>
    	<td>修改  删除</td>
    	</tr>
    	<%
    }
    %>
    <tr>
    <td colspan="8" bgcolor="white">每页显示<%= pagecount %>条，当前<%= currpage %>/<%= totalpage %>页
    首页 上一页 下一页 尾页</td></tr>
    </table>
  </body>
</html>
