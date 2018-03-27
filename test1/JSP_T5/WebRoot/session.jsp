<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" session="true"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>session对象</title>
    
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
    //使用session对象 需要page指令的session属性设置为true（默认为true）
    <%
    //session设置属性
    session.setAttribute("attle1","value1");
    
    %>
    <% 
    //移除session属性
    session.removeAttribute("attle1");
    
    //销毁session属性
    //session.invalidate();
    %>
    
    session的创建时间：<%=session.getCreationTime() %><br/>
    sessionID：<%=session.getId() %><br/>
    session最大不活动时间：<%=session.getMaxInactiveInterval() %><br/>
    session是否新产生：<%=session.isNew() %><br/>
    
    设置session最大不活动时间：<%session.setMaxInactiveInterval(100); %><br/>
  </body>
</html>
