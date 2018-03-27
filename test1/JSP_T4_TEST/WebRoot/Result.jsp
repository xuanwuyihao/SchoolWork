<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Result.jsp' starting page</title>
    
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
    Map map=(Map)application.getAttribute("map");
    //每一个选项的个数
    int a=Integer.parseInt(map.get("a").toString());
    int b=Integer.parseInt(map.get("b").toString());
    int c=Integer.parseInt(map.get("c").toString());
    int d=Integer.parseInt(map.get("d").toString());
    
    //总人数
    float total=Float.parseFloat(map.get("total").toString());
    %>
    
    你认为这个网站如何？
    功能强大：<%=a/total*100 %>%<table cellpadding="1" bgcolor="#0080ff" width="100">
    <tr bgcolor="white"><td width="<%=a/total*100 %>%" bgcolor="#0080ff" height="10"></td><td></td></tr>
    </table><br/>
    
    资源丰富：<%=b/total*100 %>%<table cellpadding="1" bgcolor="#0080ff" width="100">
    <tr bgcolor="white"><td width="<%=b/total*100 %>%" bgcolor="#0080ff" height="10"></td><td></td></tr>
    </table><br/>
    
    内容一般：<%=c/total*100 %>%<table cellpadding="1" bgcolor="#0080ff" width="100">
    <tr bgcolor="white"><td width="<%=c/total*100 %>%" bgcolor="#0080ff" height="10"></td><td></td></tr>
    </table><br/>
    
    网站低俗：<%=d/total*100 %>%<table cellpadding="1" bgcolor="#0080ff" width="100">
    <tr bgcolor="white"><td width="<%=d/total*100 %>%" bgcolor="#0080ff" height="10"></td><td></td></tr>
    </table><br/>
  </body>
</html>
