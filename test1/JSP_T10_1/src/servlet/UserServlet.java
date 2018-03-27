package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Service.Bookservice;
import ServiceImpl.BookserviceImpl;

import Bean.User;

public class UserServlet extends HttpServlet {
	Bookservice book=new BookserviceImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String method=request.getParameter("method");
		
		if("login".equals(method)){//登录：获取用户名和密码判断书否存在改数据
			//获取账号密码
			String uname=request.getParameter("uname");
			String pwd=request.getParameter("pwd");
			User user=new User();
			user.setUname(uname);
			user.setPwd(pwd);
			User u=book.login(user);
			if(u!=null){//登陆成功
				//将用户对象保存到session
				HttpSession session=request.getSession();
				session.setAttribute("user",u);
				response.sendRedirect("Bookservlet?method=list");
			}else{//登录失败
				request.setAttribute("msg", "账号或密码有误！");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}else if("loginout".equals(method)){//销毁session
				System.out.println("----------");
				HttpSession session=request.getSession();
				session.removeAttribute("users");
				response.sendRedirect("index.jsp");
			} 
			
		}
	}

}
