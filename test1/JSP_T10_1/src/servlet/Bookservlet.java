package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.Bean;
import Bean.ShoppingCart;
import Service.Bookservice;
import ServiceImpl.BookserviceImpl;

public class Bookservlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doPost(request, response);
	}
	Bookservice book=new BookserviceImpl(); 
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//接收请求类型
		String method=request.getParameter("method");
		if("list".equals(method)){//列表
			int currpage=1;//当前页
			int pagecount=8;//每页行数
			int totalpage=0;//总页数
			int totalrow=0;//总行数
			
			
			//接收当前页
			String strpage=request.getParameter("cpage");
			if(strpage !=null&& !"".equals(strpage)){
				currpage=Integer.parseInt(strpage);
			}
			
			//总行数
			
			totalrow=book.Bookrows();
			//总页数
			totalpage=(totalrow+pagecount-1)/pagecount;
			
			if(currpage < 1){
				currpage=1;
			}
			if(currpage>totalpage&&totalpage!=0){
				currpage=totalpage;
			}
			List list = book.Boooklist(currpage, pagecount);
			request.setAttribute("list",list);
			request.setAttribute("currpage",currpage);
			request.setAttribute("pagecount",pagecount);
			request.setAttribute("totalpage",totalpage);
			request.setAttribute("totalrow",totalrow);
			
			request.getRequestDispatcher("/list.jsp").forward(request, response);
		}else if(method.equals("add")){//添加
			Bean b=new Bean();
			b.setBname(request.getParameter("bname"));
			b.setBprice(Float.parseFloat(request.getParameter("bprice")));
			b.setBauthor(request.getParameter("bauthor"));
			b.setBpress(request.getParameter("bpress"));
			b.setBstate(Integer.parseInt(request.getParameter("bstate")));
			b.setBimg(request.getParameter("bimg"));
			
			boolean bln=book.bookadd(b);
			if(bln){
				response.sendRedirect("Bookservlet?method=list");
			}else{
				request.setAttribute("msg", "添加失败！");
				request.getRequestDispatcher("add.jsp").forward(request, response);
			}
			
			
			
		}else if("toupd".equals(method)){//去修改
			String sid=request.getParameter("id");
			Bean b=book.selbyid(Integer.parseInt(sid));
			request.setAttribute("b", b);
			request.getRequestDispatcher("upd.jsp").forward(request, response);
			
		}else if("upd".equals(method)){//修改
			Bean b=new Bean();
			b.setBid(Integer.parseInt(request.getParameter("bid")));
			b.setBprice(Float.parseFloat(request.getParameter("bprice")));
			b.setBname((request.getParameter("bname")));
			b.setBauthor((request.getParameter("bauthor")));
			b.setBpress((request.getParameter("bpress")));
			b.setBimg((request.getParameter("bimg")));
			
			book.bookupd(b);
			
			response.sendRedirect("Bookservlet?method=list");
			
		}else if("del".equals(method)){//删除
			String sid=request.getParameter("id");
			book.bookdel(Integer.parseInt(sid));
			response.sendRedirect("Bookservlet?method=list");
			
		}else if("shoppingcart".equals(method)){//添加到购物车
		
			//获取商品ID
			String strid=request.getParameter("id");
			Bean bean=book.selbyid(Integer.parseInt(strid));
			
			//新建购物车对象
			ShoppingCart scart=new ShoppingCart();
			scart.setProdcode(bean.getBid()+"");//编号
			scart.setProdname(bean.getBname());//名称
			scart.setProdprice(bean.getBprice()+"");//价格
			scart.setProdimg(bean.getBimg());//图片
			scart.setProddesc("作者："+bean.getBauthor()+"出版社："+bean.getBpress());//说明
			scart.setProdcount(1);//数量
			
			//获取session
			HttpSession session=request.getSession();
			
			//查询是否添加过购物车
			List cartlist=(List)session.getAttribute("cartlist") ;
			if(cartlist==null){//还没有添加过购物车
				//把购物车信息添加到list
				List list=new ArrayList();
				list.add(scart);
				session.setAttribute("cartlist", list);
			}else{//如果添加过
				//第二次添加只需要在原来的数目上加以即可
				boolean bln=false;//表示不存在
				for (int i = 0; i < cartlist.size(); i++) {
					ShoppingCart sc=(ShoppingCart)cartlist.get(i);
					if(scart.getProdcode().equals(sc.getProdcode())){//如果要添加的已经存在了
						bln=true;
						sc.setProdcode(sc.getProdcode()+1);
						break;
					}
				}
				if(!bln){
					cartlist.add(scart);
				}
				
			}
			//保存购物车商品数量
			int count=0;
			if(cartlist!=null){
				for(int i=0;i<cartlist.size();i++){
					ShoppingCart sc=(ShoppingCart)cartlist.get(i);
					count+=sc.getProdcount();
				}
			}
			
			
			session.setAttribute("cartsize", count);
			
			
			
			
			response.sendRedirect("shoppingcart.jsp");
			
		}
	
	}

}
