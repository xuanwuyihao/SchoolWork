<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Dome1_zuce.jsp' starting page</title>

  </head>
  
  <body>
	<form action="xx" method="post">
    <table align="center" border="1" width="50%" height="400">
    <tr>
	<td colspan="2" align="center">
	<font size="5">
	<b>
    用户注册信息
    </b>
    </font>
	</td>
    </tr>
    <tr>
    
    <td align="right" width="30%">
    昵称：
    </td>
    <td align="left">
    <input type="text" name="nikname" />
    </td>
    </tr>
    <tr>
    <td align="right">
    密码：
    </td>
    <td align="left">
    <input type="password" name="pwd"/>
    </td>
    </tr>
     <tr>
    <td align="right">
    确认密码：
    </td>
    <td align="left">
    <input type="password" name="pwd1"/>
    </td>
    </tr>
    
     <tr>
    <td align="right">
    性别 ：
    </td>
    <td align="left">
    <input type="radio" value="男" name="sex" checked/>男
    <input type="radio" value="女" name="sex"/>女
    </td>
    </tr>
    
     <tr>
    <td align="right">
    年龄：
    </td>
    <td align="left">
    <input type="text" name="age"/>
    </td>
    </tr>
    
     <tr>
    <td align="right">
    爱好：
    </td>
    <td align="left">
    <input type="checkbox" name="aihao" value="旅游"/>旅游
    <input type="checkbox" name="aihao" value="篮球"/>篮球
    <input type="checkbox" name="aihao" value="羽毛球"/>羽毛球
    <input type="checkbox" name="aihao" value="跑步"/>跑步
    <input type="checkbox" name="aihao" value="听音乐"/>听音乐
    
    </td>
    </tr>
    
    <tr>
    <td align="right">
    出生地：
    </td>
    <td align="legt">
    <select name="nation">
    <option value="江西">江西</option>
    <option value="上海">上海</option>
    <option value="广东">广东</option>
    <option value="北京">北京</option>
     <option value="浙江">浙江</option>
    <option value="深圳">深圳</option>
    
    </td> 
    </tr>
    
    
     <tr>
    
    <td align="center" colspan="2">
    <input type="submit" naem="注册" value="注册" style="width:60"/>
    <input type="reset" naem="取消" value="取消" style="width:60"/>
    </td>
    </tr>
    </table>
    </form>
  </body>
</html>
