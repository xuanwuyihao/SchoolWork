<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>脚本元素</title>
    
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
    脚本元素作用：用来在JSP中包含JAVA代码(定义变量，方法或者表达式)
    <h3>脚本元素分为三种</h3>
    
    <h4>1、声明元素</h4>
    <h5>声明元素可以声明方法和变量</h5>
    <h5>声明元素声明的变量是全局共享的，类似于类变量</h5>
    <h5>方法只能在声明元素中声明</h5>
    <%! int i=0; 
    public int sums(int a,int b){
    return a+b;	
    }
    
    %>
    
    
    <h4>2、scriptlets java脚本片段</h4>
    <h5>可以插入符号java标准的所有代码</h5>
    <h5>可以调用声明变量的方法和变量</h5>
    <% int j=0; %>
    
    
    <h4>3、表达式元素</h4>
    <h5>相当于out.print()</h5>
    <h5>语句后不能加分号结束</h5>
    你是第<%= ++i %>个访客    j的值是<%=++j %>
  </body>
</html>
