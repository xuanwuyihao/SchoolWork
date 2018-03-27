<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'result.jsp' starting page</title>
    
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
  <form action="vote.jsp" method="post">
   你就得本店服务如何？
   <br/>
   <input type="radio" name="pp" value="a" checked>服务周到<br/>
   <input type="radio" name="pp" value="b" checked>良好<br/>
   <input type="radio" name="pp" value="c" checked>勉强<br/>
   <input type="radio" name="pp" value="d" checked>极差<br/>
   <input type="submit" value="投票">
  </form>
  
  <%
  //跳转提交后才进来
  
  //获取选项中的选项
  String yy=request.getParameter("pp");
  //页面第二次进来（请求过来）
  if(yy!=null){
	//记录当前选项中的人数
	Map m=(Map)application.getAttribute("map");
	if(yy==null){//第一次进来
		//初始化数据
		Map map=new HashMap();
		map.put("a","0");
		map.put("b","0");
		map.put("c","0");
		map.put("d","0");
		map.put("total","0");
		
		if("a".equals(yy)){//如果选的是a
			map.put("a","1");
		}else if("b".equals(yy)){//如果选的是b
			map.put("b","1");
		}else if("c".equals(yy)){//如果选的是c
			map.put("c","1");
		}else if("d".equals(yy)){//如果选的是d
			map.put("d","1");
		}
		map.put("total","1");
		
		//把map存到application中
		application.setAttribute("map",map);
		
	}else {//不是第一次进(第二次后以上)
		//从application中获取map
		Map mm=(Map)application.getAttribute("map");
	if("a".equals(yy)){//如果选的是a
		//获取原来的
		int i=Integer.parseInt(mm.get("a")+"");
		mm.put("a",(i+1)+"");
	}else if("b".equals(yy)){//如果选的是b
		//获取原来的
		int i=Integer.parseInt(mm.get("b")+"");
		mm.put("b",(i+1)+"");
	}else if("c".equals(yy)){//如果选的是c
		//获取原来的
		int i=Integer.parseInt(mm.get("c")+"");
		mm.put("c",(i+1)+"");
	}else if("d".equals(yy)){//如果选的是b
		//获取原来的
		int i=Integer.parseInt(mm.get("d")+"");
		mm.put("d",(i+1)+"");
	}
	//取出total
	int total=Integer.parseInt(mm.get("total")+"");
	mm.put("total",(total+1)+"");
	}
	//跳转到结果页面
	response.sendRedirect("result.jsp");
  }
  
  
  
  %>
  </body>
</html>
