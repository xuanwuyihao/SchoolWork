package servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {//��дinit  ��ʼ��servlet����
		System.out.println("sevlet��ʼ����");
	}
	
	//��дdoget����			HttpServletRequest�������տͻ��������˷������󣬰�������������������
							//HttpServletResponse�Ƿ�������Ӧ�ͻ��˵��࣬������Ӧ����
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("������doget");
	}
	
	
	//��дdopost����
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("������dopost");
	}
	
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doDelete(req, resp);
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doHead(req, resp);
	}

	@Override
	protected void doOptions(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doOptions(arg0, arg1);
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPut(req, resp);
	}

	@Override
	protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doTrace(arg0, arg1);
	}

	//��дsercice����
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("������service");
		
		//�����������
		req.setCharacterEncoding("utf-8");//Ҫ��ҳ�����һ��
		
		//ͨ��HttpservletRequest����ȡҳ�洫�ݵĲ���
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		
		System.out.println("�˺ţ�"+uname+"       ���룺"+pwd);
		
		//������Ӧ��������
		resp.setContentType("text/html;charset=utf-8");
		
		//�����ͻ��˽����ı�����Ŀ�����
		PrintWriter out=resp.getWriter();
		out.print("��¼�ɹ���");
		
		

	}
	
	//��дdestroy��������JVM����servlet����ʱ����ø÷���
	@Override
	public void destroy() {
		
	}
	
}
