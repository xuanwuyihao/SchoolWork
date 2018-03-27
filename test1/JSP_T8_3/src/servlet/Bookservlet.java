package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.IBookservice;
import serviceimpl.Bookserviceimpl;

public class Bookservlet extends HttpServlet {
	IBookservice ib=new Bookserviceimpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String method=request.getParameter("method");
		if ("list".equals(method)) {
			int pagecount=8;//每页行数
			int currpage=1;//当前页数
			int totalrow=0;//总行数
			int totalpage=0;//总页数
			
			//查询总行数和计算总页数
			//总行数
			totalrow =ib.totalrow();
			
			//总页数
			totalpage=(totalrow+pagecount-1)/pagecount;
			
			//获取当前页面
			//传递当前页面参数
			
		}
	}

}
