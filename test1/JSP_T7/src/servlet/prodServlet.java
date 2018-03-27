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
	//����ģ�Ͳ�
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
		//Ϊ�����ֲ�ͬ����
		String method=req.getParameter("method");
		if("list".equals(method)){
			//����Ĥ�β���б�ĵ�list�����
			List<prod> list=ip.list();
			System.out.println("��Ʒ����:"+list.size());
			//��װlist���������װ��request�����򼴿ɣ�
			req.setAttribute("list", list);
			
			//��ת��prodlist(ת��)��request��ת��
			req.getRequestDispatcher("prodlist.jsp").forward(req, resp);
			//�ض���
			//resp.sendRedirect();
		}else if ("add".equals(method)) {
			//��ȡ����ҳ��Ĳ���
			String pname=req.getParameter("pname");//��Ʒ����
			String price=req.getParameter("price");//�۸�
			String pdate=req.getParameter("pdate");//������
			String pricty=req.getParameter("pricty");//ʱ��
			String pcount=req.getParameter("pcount");//���
			
			//����bean��
			prod p=new prod();
			p.setPname(pname);
			p.setPrice(Float.parseFloat(price));
			p.setPdate(pdate);
			p.setPricty(pricty);
			p.setPcount(Integer.parseInt(pcount));
			
			//���浽���ݿ�
			boolean bln=ip.add(p);
			if(bln){
				resp.sendRedirect("prod?method=list");
			}else{
				resp.sendRedirect("prodadd.jsp");
			}
			System.out.println("���������ˡ�����");
		}else if ("toupd".equals(method)) {
			//��ȡID
			String strid=req.getParameter("id");
			
			//����IDȥ���ݿ����Ʒ��Ϣ
			prod prod=ip.selbyid(Integer.parseInt(strid));
			
			//���浽request��
			req.setAttribute("prod", prod);
			
			//ת�����޸�ҳ��
			req.getRequestDispatcher("produpd.jsp").forward(req, resp);
			
		}else if ("upd".equals(method)) {//�޸�
			//��ȡ��ҳ��Ĳ���
			String id= req.getParameter("pid");
			
			String pname= req.getParameter("pname");
			String price= req.getParameter("price");
			String pricty= req.getParameter("pricty");
			String pdate= req.getParameter("pdate");
			String pcount= req.getParameter("pcount");
			
			//����bean��
			prod p=new prod();
			p.setId(Integer.parseInt(id));
			p.setPname(pname);
			p.setPrice(Float.parseFloat(price));
			p.setPricty(pricty);
			p.setPdate(pdate);
			p.setPcount(Integer.parseInt(pcount));
			
			ip.upd(p);
			
			//ȥ�б�ҳ��
			resp.sendRedirect("prod?method=list");
			
		}
		
		
		
		
	}
}
