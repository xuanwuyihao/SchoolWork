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
			int pagecount=8;//ÿҳ����
			int currpage=1;//��ǰҳ��
			int totalrow=0;//������
			int totalpage=0;//��ҳ��
			
			//��ѯ�������ͼ�����ҳ��
			//������
			totalrow =ib.totalrow();
			
			//��ҳ��
			totalpage=(totalrow+pagecount-1)/pagecount;
			
			//��ȡ��ǰҳ��
			//���ݵ�ǰҳ�����
			
		}
	}

}
