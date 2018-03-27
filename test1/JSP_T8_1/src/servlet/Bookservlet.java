package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Bookservice;
import service.impl.BookserviceImpl;

public class Bookservlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			doPost(req, resp);
	
	}
	Bookservice bk=new BookserviceImpl();
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			req.setCharacterEncoding("utf-8");
			String method =req.getParameter("method");//操作方法的参数
			
			if("list".equals(method)){
				//定义分页的四个参数
				int currpage=1;//当前页
				int pagecount =5;//每页行数
				int totalRow=0;//总行数
				int totalpage=0;//总页数
				
				//查询总行数
				totalRow=bk.selrows();
				
				//总页数
				totalpage=(totalRow+pagecount-1)/pagecount;
				
				//接收当前页
				String strcpage=req.getParameter("cpage");
				if (strcpage!=null||"".equals(strcpage)) {
					currpage=Integer.parseInt(strcpage);
				}
				
				//判断上线和下线
				if (currpage<1) {
					currpage=1;
				}
				if (currpage>totalpage) {
					currpage=totalpage;
				}
				
				//查询数据
				List list=bk.list(currpage, pagecount);
				req.setAttribute("list",list);
				req.setAttribute("currpage",currpage);
				req.setAttribute("pagecount",pagecount);
				req.setAttribute("totalRow",totalRow);
				req.setAttribute("totalpage",totalpage);
				
				//转发到前台页面
				req.getRequestDispatcher("list.jsp").forward(req, resp);
			}
			
	}

}
