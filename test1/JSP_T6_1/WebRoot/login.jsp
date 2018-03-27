<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="UserBean.Bean"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'login.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>
	<%

	request.setCharacterEncoding("utf-8");
	//判断页面是跳转过来的
	String face = request.getParameter("face");
	if (face != null) {
		//封装当前用户
		String account = request.getParameter("account");
		String uname = request.getParameter("uname");
		Bean acc = new Bean();
		acc.setFace(face);
		acc.setAccount(account);
		acc.setUname(uname);
		
		
		//判断是否已经登陆了账号
		Bean ub =(Bean)session.getAttribute("acc");//当前登陆用户
		if(ub!=null){//已经登陆过账号
			out.print("<script>alert('您已经登陆过一个账号了！');</script>");
		}else{
			//是否是第一个登陆用户
			List list =(List) application.getAttribute("users");
			if(list==null){//第一个登陆用户
				List l = new ArrayList();
				l.add(acc);
				application.setAttribute("users",l);
			}else{//第二个及以上的用户
				list.add(acc);//会自动更新application中的list
			}
			
			//把当前用户保存到session
			session.setAttribute("acc",acc);
			
			//页面重定向到聊天窗口界面
			response.sendRedirect("lts.jsp");
			
		}
	}
	%>
	<body>
		<form action="login.jsp" method="post" onsubmit="return check(this);">
			<table cellspacing="1" bgcolor="yellow" align="center" width="30%">

				<tr bgcolor="white">
					<td colspan="2">
						<h3 align="center">
							用户登录
						</h3>
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						QQ号：
					</td>
					<td>
						<input type="text" name="account" />
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						昵称：
					</td>
					<td>
						<input type="text" name="uname" />
					</td>
				</tr>
				<tr bgcolor="white">
					<td>
						头像：
					</td>
					<td>
						<select name="face">
							<option value="1.jpg">
								1.jpg
							</option>
							<option value="2.jpg">
								2.jpg
							</option>
							<option value="3.jpg">
								3.jpg
							</option>
						</select>
					</td>
				</tr>
				<tr bgcolor="white">
					<td colspan="2" align="center">
						<input type="submit" value="登录" />
					</td>
				</tr>
			</table>
		</form>

		<script type="text/javascript">
			function check(frm){
				var acc=  frm.account.value;//账号
				var uname = frm.uname.value;//昵称
				if(acc==''){
					alert("请输入账号");
					return false;
				}
				if(isNaN(acc)){
					alert("QQ号请输入数字！");
					return false;
				}
				if(uname==''){
					alert("请输入昵称");
					return false;
				}
				
				return true;
			}
		
		</script>
	</body>
</html>
