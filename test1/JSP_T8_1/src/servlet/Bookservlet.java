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
			String method =req.getParameter("method");//���������Ĳ���
			
			if("list".equals(method)){
				//�����ҳ���ĸ�����
				int currpage=1;//��ǰҳ
				int pagecount =5;//ÿҳ����
				int totalRow=0;//������
				int totalpage=0;//��ҳ��
				
				//��ѯ������
				totalRow=bk.selrows();
				
				//��ҳ��
				totalpage=(totalRow+pagecount-1)/pagecount;
				
				//���յ�ǰҳ
				String strcpage=req.getParameter("cpage");
				if (strcpage!=null||"".equals(strcpage)) {
					currpage=Integer.parseInt(strcpage);
				}
				
				//�ж����ߺ�����
				if (currpage<1) {
					currpage=1;
				}
				if (currpage>totalpage) {
					currpage=totalpage;
				}
				
				//��ѯ����
				List list=bk.list(currpage, pagecount);
				req.setAttribute("list",list);
				req.setAttribute("currpage",currpage);
				req.setAttribute("pagecount",pagecount);
				req.setAttribute("totalRow",totalRow);
				req.setAttribute("totalpage",totalpage);
				
				//ת����ǰ̨ҳ��
				req.getRequestDispatcher("list.jsp").forward(req, resp);
			}
			
	}

}
