package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.IprodService;
import serviceimpl.ProdServiceImpl;

public class ProdServlet extends HttpServlet {
	IprodService ip=new ProdServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String method=req.getParameter("method");
		if ("list".equals(method)) {
			//定义参数
			int pageCount=10;//每行条数
			int currPage=1;//当前页数
			int totalRow=0;//总行数
			int totalpage=0;//总页数
			
			
			//查询总行数和计算总页数
			//总行数
			totalRow=ip.totalrow();
			
			//总页数(总行数+每页行数-1)/每页行数
			totalpage=(totalRow+pageCount-1)/pageCount;
			
			
			//获取当前页面
			//获取页面传递当前页面参数
			String str_cpage=req.getParameter("cpage");
			if (str_cpage==null&&"".equals(str_cpage)) {
				//将获取当前页转换成整形发给当前变量
				currPage=Integer.parseInt(str_cpage);
				
			}
			
			
			//如果当前页小于一，初始化为一
			if (currPage<1) {
				currPage=1;
			}
			
			//如果当前页面大于总页面数
			if (currPage>totalpage) {
				currPage=totalpage;
			}
			
			
			//根据当前页和每页行数查询结果 并封装参数到页面显示
			//查询list方法
			List list=ip.prodlist(pageCount, currPage);
			
			req.setAttribute("list", list);
			//封装页面参数到前台显示
			req.setAttribute("pageCount", pageCount);
			req.setAttribute("currPage", currPage);
			req.setAttribute("totalRow", totalRow);
			req.setAttribute("totalpage", totalpage);
			
			//转发到列表页面
			req.getRequestDispatcher("list.jsp").forward(req, resp);
		}
		
	}
}
