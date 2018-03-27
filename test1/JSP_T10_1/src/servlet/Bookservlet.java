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
		//������������
		String method=request.getParameter("method");
		if("list".equals(method)){//�б�
			int currpage=1;//��ǰҳ
			int pagecount=8;//ÿҳ����
			int totalpage=0;//��ҳ��
			int totalrow=0;//������
			
			
			//���յ�ǰҳ
			String strpage=request.getParameter("cpage");
			if(strpage !=null&& !"".equals(strpage)){
				currpage=Integer.parseInt(strpage);
			}
			
			//������
			
			totalrow=book.Bookrows();
			//��ҳ��
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
		}else if(method.equals("add")){//���
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
				request.setAttribute("msg", "���ʧ�ܣ�");
				request.getRequestDispatcher("add.jsp").forward(request, response);
			}
			
			
			
		}else if("toupd".equals(method)){//ȥ�޸�
			String sid=request.getParameter("id");
			Bean b=book.selbyid(Integer.parseInt(sid));
			request.setAttribute("b", b);
			request.getRequestDispatcher("upd.jsp").forward(request, response);
			
		}else if("upd".equals(method)){//�޸�
			Bean b=new Bean();
			b.setBid(Integer.parseInt(request.getParameter("bid")));
			b.setBprice(Float.parseFloat(request.getParameter("bprice")));
			b.setBname((request.getParameter("bname")));
			b.setBauthor((request.getParameter("bauthor")));
			b.setBpress((request.getParameter("bpress")));
			b.setBimg((request.getParameter("bimg")));
			
			book.bookupd(b);
			
			response.sendRedirect("Bookservlet?method=list");
			
		}else if("del".equals(method)){//ɾ��
			String sid=request.getParameter("id");
			book.bookdel(Integer.parseInt(sid));
			response.sendRedirect("Bookservlet?method=list");
			
		}else if("shoppingcart".equals(method)){//��ӵ����ﳵ
		
			//��ȡ��ƷID
			String strid=request.getParameter("id");
			Bean bean=book.selbyid(Integer.parseInt(strid));
			
			//�½����ﳵ����
			ShoppingCart scart=new ShoppingCart();
			scart.setProdcode(bean.getBid()+"");//���
			scart.setProdname(bean.getBname());//����
			scart.setProdprice(bean.getBprice()+"");//�۸�
			scart.setProdimg(bean.getBimg());//ͼƬ
			scart.setProddesc("���ߣ�"+bean.getBauthor()+"�����磺"+bean.getBpress());//˵��
			scart.setProdcount(1);//����
			
			//��ȡsession
			HttpSession session=request.getSession();
			
			//��ѯ�Ƿ���ӹ����ﳵ
			List cartlist=(List)session.getAttribute("cartlist") ;
			if(cartlist==null){//��û����ӹ����ﳵ
				//�ѹ��ﳵ��Ϣ��ӵ�list
				List list=new ArrayList();
				list.add(scart);
				session.setAttribute("cartlist", list);
			}else{//�����ӹ�
				//�ڶ������ֻ��Ҫ��ԭ������Ŀ�ϼ��Լ���
				boolean bln=false;//��ʾ������
				for (int i = 0; i < cartlist.size(); i++) {
					ShoppingCart sc=(ShoppingCart)cartlist.get(i);
					if(scart.getProdcode().equals(sc.getProdcode())){//���Ҫ��ӵ��Ѿ�������
						bln=true;
						sc.setProdcode(sc.getProdcode()+1);
						break;
					}
				}
				if(!bln){
					cartlist.add(scart);
				}
				
			}
			//���湺�ﳵ��Ʒ����
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
