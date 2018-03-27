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
			//�������
			int pageCount=10;//ÿ������
			int currPage=1;//��ǰҳ��
			int totalRow=0;//������
			int totalpage=0;//��ҳ��
			
			
			//��ѯ�������ͼ�����ҳ��
			//������
			totalRow=ip.totalrow();
			
			//��ҳ��(������+ÿҳ����-1)/ÿҳ����
			totalpage=(totalRow+pageCount-1)/pageCount;
			
			
			//��ȡ��ǰҳ��
			//��ȡҳ�洫�ݵ�ǰҳ�����
			String str_cpage=req.getParameter("cpage");
			if (str_cpage==null&&"".equals(str_cpage)) {
				//����ȡ��ǰҳת�������η�����ǰ����
				currPage=Integer.parseInt(str_cpage);
				
			}
			
			
			//�����ǰҳС��һ����ʼ��Ϊһ
			if (currPage<1) {
				currPage=1;
			}
			
			//�����ǰҳ�������ҳ����
			if (currPage>totalpage) {
				currPage=totalpage;
			}
			
			
			//���ݵ�ǰҳ��ÿҳ������ѯ��� ����װ������ҳ����ʾ
			//��ѯlist����
			List list=ip.prodlist(pageCount, currPage);
			
			req.setAttribute("list", list);
			//��װҳ�������ǰ̨��ʾ
			req.setAttribute("pageCount", pageCount);
			req.setAttribute("currPage", currPage);
			req.setAttribute("totalRow", totalRow);
			req.setAttribute("totalpage", totalpage);
			
			//ת�����б�ҳ��
			req.getRequestDispatcher("list.jsp").forward(req, resp);
		}
		
	}
}
