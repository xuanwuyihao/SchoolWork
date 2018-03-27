<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'bbasic.jsp' starting page</title>
    
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
  <form action="business?method=updbusiness" method="post">
  <input type="hidden" name="bid" value="${bsin.bid }">
   <input type="hidden" name="bacc" value="${bsin.bacc }">
    <table height="40px">
    <tr><td height="20px">&nbsp;&nbsp;&nbsp;&nbsp;<b>账号：</b>&nbsp;${bsin.bacc }</td></tr><br/>
    <tr><td height="20px">&nbsp;&nbsp;&nbsp;&nbsp;<b>店铺名：</b>&nbsp;${bsin.bname }</td></tr>
    </table>
    <hr/>
    <table>
    <tr><td width="50px" height="50"></td><td><b>店铺名：</b></td><td width="50px"></td><td><input type="text" name="bname" value="${bsin.bname }" size="70"></td></tr>
    <tr><td width="50px" height="50"></td><td><b>电话：</b></td><td width="50px"></td><td><input type="text" name="btel" value="${bsin.btel }" size="70"></td></tr>
    <tr><td width="50px" height="50"></td><td><b>是否提供WiFi：</b></td><td width="50px"></td><td><input type="radio" name="bwifi" value="0" ${bsin.bwifi==0?'checked':'' }/>提供<input type="radio" name="bwifi" value="1" ${bsin.bwifi==1?'checked':'' }/>不提供</td></tr>
    <tr><td width="50px" height="50"></td><td><b>是否提供停车位：</b></td><td width="50px"></td><td><input type="radio" name="bpark" value="0" ${bsin.bpark==0?'checked':'' }>提供<input type="radio" name="bpark" value="1" ${bsin.bpark==1?'checked':'' }>不提供</td></tr>
    
    <tr><td colspan="4" align="center"  height="50"><input type="submit" value="提交"/></td></tr>
    </table>
    
    </form>
  </body>
</html>
