<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Vote.jsp' starting page</title>
    
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
    <form action="Vote.jsp" method="post">
    你认为这个网站上的内容如何？<br/>
    <input type="radio" name="pp" value="a" checked>功能强大<br/>
    <input type="radio" name="pp" value="b">资源丰富<br>
    <input type="radio" name="pp" value="c">内容一般<br>
    <input type="radio" name="pp" value="d">网站低俗<br>
    <input type="submit" value="投票"/>
    </form>
    
    <%
    //获取选中的选项
    String yy=  request.getParameter("pp");
    if(yy!=null){
    //记录当前选项的元素
    Map m=(Map)application.getAttribute("map");
    if(m==null){
    	//初始化值
    	Map map=new HashMap();
    	map.put("a","0");
    	map.put("b","0");
    	map.put("c","0");
    	map.put("d","0");
    	map.put("total","0");
    	
    	
    	if("a".equals(yy)){
    		map.put("a","1");
    	}else if("b".equals(yy)){
    		map.put("b","1");
    	}else if("c".equals(yy)){
    		map.put("c","1");
    	}else if("d".equals(yy)){
    		map.put("d","1");
    	}
    	map.put("total","1");
    	
    	//把map保存到application中
    	application.setAttribute("map",map);
    }else{//不是第一次
    	//从application中获取值
    	if("a".equals(yy)){//如果选择a
    		int i=Integer.parseInt(m.get("a")+"");
    		m.put("a",(i+1)+"");
    	}else if("b".equals(yy)){//选择b
    		int i=Integer.parseInt(m.get("b")+"");
    		m.put("b",(i+1)+"");
    	}else if("c".equals(yy)){//选择c
    		int i=Integer.parseInt(m.get("c")+"");
    		m.put("c",(i+1)+"");
    	}else if("d".equals(yy)){//选择d
    		int i=Integer.parseInt(m.get("d")+"");
    		m.put("d",(i+1)+"");
    	}
    	//取出total
    	int total=Integer.parseInt(m.get("total")+"");
    	m.put("total",(total+1)+"");
    }
    //转跳到结果页面
    response.sendRedirect("Result.jsp");
    }
    
    %>
  </body>
</html>
