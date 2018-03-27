package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.prod;

import service.IProdService;
import service.impl.prodServiceImpl;

public class prodServlet extends HttpServlet{
	//引入模型层
	IProdService ip= new prodServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		//为了区分不同操作
		String method=req.getParameter("method");
		if("list".equals(method)){
			//调用膜形层的列表的到list结果集
			List<prod> list=ip.list();
			System.out.println("商品个数:"+list.size());
			//封装list结果集（封装到request作用域即可）
			req.setAttribute("list", list);
			
			//跳转到prodlist(转发)有request用转发
			req.getRequestDispatcher("prodlist.jsp").forward(req, resp);
			//重定向
			//resp.sendRedirect();
		}else if ("add".equals(method)) {
			//获取新增页面的参数
			String pname=req.getParameter("pname");//商品名称
			String price=req.getParameter("price");//价格
			String pdate=req.getParameter("pdate");//生产地
			String pricty=req.getParameter("pricty");//时间
			String pcount=req.getParameter("pcount");//库存
			
			//存在bean中
			prod p=new prod();
			p.setPname(pname);
			p.setPrice(Float.parseFloat(price));
			p.setPdate(pdate);
			p.setPricty(pricty);
			p.setPcount(Integer.parseInt(pcount));
			
			//保存到数据库
			boolean bln=ip.add(p);
			if(bln){
				resp.sendRedirect("prod?method=list");
			}else{
				resp.sendRedirect("prodadd.jsp");
			}
			System.out.println("新增进来了。，，");
		}else if ("toupd".equals(method)) {
			//获取ID
			String strid=req.getParameter("id");
			
			//根据ID去数据库查商品信息
			prod prod=ip.selbyid(Integer.parseInt(strid));
			
			//保存到request中
			req.setAttribute("prod", prod);
			
			//转发到修改页面
			req.getRequestDispatcher("produpd.jsp").forward(req, resp);
			
		}else if ("upd".equals(method)) {//修改
			//获取新页面的参数
			String id= req.getParameter("pid");
			
			String pname= req.getParameter("pname");
			String price= req.getParameter("price");
			String pricty= req.getParameter("pricty");
			String pdate= req.getParameter("pdate");
			String pcount= req.getParameter("pcount");
			
			//存在bean中
			prod p=new prod();
			p.setId(Integer.parseInt(id));
			p.setPname(pname);
			p.setPrice(Float.parseFloat(price));
			p.setPricty(pricty);
			p.setPdate(pdate);
			p.setPcount(Integer.parseInt(pcount));
			
			ip.upd(p);
			
			//去列表页面
			resp.sendRedirect("prod?method=list");
			
		}
		
		
		
		
	}
}
