<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'jsonDome.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script src="script/jquery.min.js"></script>
	<script type="text/javascript">
	function inquery(){
	
	var id  = $("#userid").val();
	var pwd = $("#userpwd").val();
	/*
	 1、局部刷新，async  默认 false     更改为true
	 2、cache缓存    默认false  更改为true
	 3、url地址   servlet(Login头)
	 4、type传输方式  post  get  set
	 5、data(传输数据)    'id':$("#id")        中间以（,）
	 6、什么形式返回      {"Demo":[{"id":"qwe","psw":"asd"},{"id":"zxc","psw":"rty"},{"id":"tyu","psw":"bnm"},{}]}
	 {"id":"qwe","psw":"asd"}
	 7、成功（sucess）绑定function()回调函数                                                失败(error) 回调函数function（XMLHttpRequest,textStates）
	 
	 ssh+easyui+mysql+ajax+jquery                                Http传输    ssm   +  消息队列   +springBoot  +  redis    
	 尚课堂    1.8万  java高级工程师（初级构架师）     struts2()           ssh   
	 
	*/
	$.ajax({
		async:true,
		cache:true,
		url:'logins',
		type:'post',
		data:{
			'id':id,
			'pwd':pwd
		},
		dataType:'json',
		
		success:function(data){
			alert("账号："+data.id+"密码："+data.pwd);
			
		},error:function(XMLHttpRequest,textStates){
			alert("系统繁忙！请稍后再试！");
		}
	});
	
	
	}
	</script>

  </head>
  
  <body>
    
    <div>
    <input type="text" name="userId" id="userid"/><br/>
    <input type="password" name="userPwd" id="userpwd"/><br/>
    <input type="submit" value="提交" onclick="inquery()"/>
    </div>
   
  </body>
</html>
