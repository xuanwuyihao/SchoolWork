<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>My JSP 'Edit.jsp' starting page</title>
    
	
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <h2>
   <s:if test="null==book">
   Add Book
   </s:if>
   <s:else>
   Edit Book
   </s:else>
   </h2>
   <s:form action="Store">
   <s:textfield name="book.isbn" label="ISBN"/>
   <s:textfield name="book.title" label="Title"/>
   <s:textfield name="book.price" label="Price"/>
   <s:submit/>
   </s:form>
  </body>
</html>
