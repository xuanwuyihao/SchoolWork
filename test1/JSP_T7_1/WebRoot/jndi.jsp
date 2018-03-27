<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>


<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'jndi.jsp' starting page</title>
    
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
    //获取数据连接
    
    //得到初始化上下文
    Context initContext=new InitialContext();
    
    //得到Java资源上下文
    Context context=(Context)initContext.lookup("java:/comp/env");
    
    //根据上下文得到数据源

    DataSource ds=(DataSource)  context.lookup("jndi7");
    
    //通过数据源得到数据连接connection
	Connection conn=ds.getConnection();
    
    String sql="select *from prod";
    
    PreparedStatement prst=conn.prepareStatement(sql);
    ResultSet rs=prst.executeQuery();
    while(rs.next()){
    	out.print(rs.getInt("id")+"  "+rs.getString("pname")+"<br/>");
    	
    }
    rs.close();
    conn.close();
    prst.close();
    
    %>
  </body>
</html>
