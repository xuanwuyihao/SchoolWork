<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="Bean.Userbean"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userbean1.jsp' starting page</title>
    
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
  	//设置请求编码
  	request.setCharacterEncoding("utf-8");
    Userbean ub=new Userbean();
	ub.setId(Integer.parseInt( request.getParameter("id")));
	ub.setUname(request.getParameter("uname"));
	ub.setAge(Integer.parseInt(request.getParameter("age")));
	
	boolean b=true;
	String marry= request.getParameter("marry");
	if(marry.equals("true")){
		b=true;
	}
	
	ub.setMarry(b);
	
	ub.setAihao(request.getParameterValues("aihao"));
	
	
  %>
  
  <h3>恭喜!成功登陆！</h3>
  <hr/>
  编号：<%=ub.getId() %><br/>
  名称：<%=ub.getUname() %><br/>
  年龄：<%=ub.getAge() %><br/>
  婚否：<%if(ub.isMarry()){
	out.print("是");
	  }else{
		  out.print("否");
	  }%><br/>
  
   爱好：<%
  
  	String aihaos[] =ub.getAihao();
  	for(int i=0;i<aihaos.length;i++){
  		out.print(aihaos[i]+"	");
  	}
	  
  %><br/>
  </body>
</html>
