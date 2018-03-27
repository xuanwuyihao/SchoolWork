<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> 
<html lang="en">   
<head>   
       
    <title>Login</title>   
   <link rel="stylesheet" type="text/css" href="../css/login.css"/>   
</head>   
<body>   
    <div id="login">   
        <h1>用户登入</h1>   
        ${msg} 
        <form  action="../users?method=login" method="post">   
            <input type="text" required="required" placeholder="用户名" name="uaccount"></input>   
            <input type="password" required="required" placeholder="密码" name="upwd"></input>   
           <button class="but" type="submit">登录</button>   
       </form>   
    </div>   
   </body>   
</html>   

