<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>cookie</title>
    
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
    String zh="";
    String mm="";
    
    
    //页面加载之前获取在cookie中的账号和密码
    Cookie[] cok=request.getCookies();
    System.out.print("cookie保存数量："+cok.length);
    for(int i=0;i<cok.length;i++){
    	Cookie co=cok[i];//取出每一个cookie
    	System.out.println(co.getName()+" "+co.getValue());
    	
    	//获取自己保存的cookie
    	if(co.getName().equals("zhanghao")){
    	zh=co.getValue();
    	}
    	if(co.getName().equals("mima")){
        	mm=co.getValue();
        }
    }
    
    
    %>
    
    <%
    //判断页面第二次进来，也判断记住密码是否勾选
    String s= request.getParameter("chk");
    if(s!=null){
    	//获取到账号和密码
    	String uanem= request.getParameter("uname");
    	String pwd= request.getParameter("pwd");
    	
    	//创建cookie
    	Cookie cook=new Cookie("zhanghao",uanem);
    	
    	//使用responset保存cookie
    	response.addCookie(cook);
    	
    	Cookie cooke=new Cookie("mima",pwd);
    	response.addCookie(cooke);
    }
    
    %>
    
    <form action="cookie.jsp" method="post">
    用户名：<input type="text" name="uname" value="<%=zh %>"><br/>
    密码： <input type="password" name="pwd" value="<%=mm %>"><br/>
    <input type="checkbox" value="1" name="chk"/>记住密码<br/>
    <input type="submit" value="登录"/>
    
    </form>
  </body>
</html>
