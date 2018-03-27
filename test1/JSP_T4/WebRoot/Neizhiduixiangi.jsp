<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Neizhiduixiangi.jsp' starting page</title>
    
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
    <h2>内置对象：就是当你撰写JSP网页时，不需要做任何声明就可以直接使用的对象那（相当于内置函数）</h2>
    <h3>九大内置对象：page,config,out,request,pagecontext,session,application,exception</h3>
    
    <h3>关于作用域的四个内置对象：pagecontext,session,application,excertion(作用范围从小到大)</h3>
    <h3>因为它们都可以通过setAttribute(参数名,参数值)来设置自定义属性，通过getAttribute()参数名来获取属性</h3>
    
    <h4>pagecontext：作用范围是当前页面，超过当前页面的属性则不可访问</h4>
    <% pageContext.setAttribute("att1","value1"); %>
    
    <h4>request:一个页面转发到另一个页面之间有效</h4>
    <%request.setAttribute("att2","value2"); %>
    
    <h4>session:同一个用户（同一个浏览器）任何页面都能访问（不活动时间30分钟）</h4>
    <% session.setAttribute("att3","valu3"); %>
    
    <h4>application:不同用户（不同浏览器）任何页面都能访问（服务器关闭不能访问）</h4>
    <%application.setAttribute("att4","value4"); 
    
    //移除属性
    application.removeAttribute("att4");
    %>
    
    
   <h3>四个作用域都能在本页面获取值<br/>
   pagecontext的值：<%=pageContext.getAttribute("att1") %><br/>
   
   request的值：<%=request.getAttribute("att2") %><br/>
   
   session的值：<%=session.getAttribute("att3") %><br/>
   
   application的值：<%=application.getAttribute("att4") %><br/>
   </h3>
    
    <!-- 转跳有两种 -->
    <!-- 1、重定向：地址栏会发生改变 a标签 form转跳 -->
    <!-- 2、转发：地址栏不会发生改变  jsp:forward jsp:include -->
    
    
    <!-- 重定向 -->
    
    <%
    //重定向
    response.sendRedirect("Frowad.jsp");
    %>
    
  </body>
</html>
