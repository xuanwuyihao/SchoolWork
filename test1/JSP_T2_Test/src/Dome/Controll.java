package Dome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controll extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//�����������
		req.setCharacterEncoding("utf-8");
		
		//��ȡ���ݲ���
		String nikname=req.getParameter("nikname");
		String pwd=req.getParameter("pwd");
		String pwd1=req.getParameter("pwd1");
		String sex=req.getParameter("sex");
		String age=req.getParameter("age");
		String aihao[]=req.getParameterValues("aihao");
		StringBuffer aihaos = new StringBuffer();
		for(int i=0;i<aihao.length;i++){
			//System.out.println(aihao[i]);
//			aihaos.append(aihao[i]);
			//aihaos.append(aihao[i]+"    ");
			aihaos.append(aihao[i]+"    ");
		}
		
		String nation=req.getParameter("nation");
		
		
		
		//������Ӧ����
		resp.setContentType("text/html;charset=utf-8");
		
		//��ÿͻ������ı�����Ŀ�����
		PrintWriter out=resp.getWriter();
		
//		pwr.write("<html>");
//		pwr.write("<head><title>��Ϣ</head></title>");
//		pwr.write("<body>");
		out.write("�ǳƣ�"+nikname+"<br/>");
		out.write("���룺"+pwd+"<br/>");
		out.write("ȷ�����룺"+pwd1+"<br/>");
		out.write("�Ա�"+sex+"<br/>");
		out.write("���䣺"+age+"<br/>");
		out.write("���ã�"+aihaos.toString()+"<br/>");
		out.write("�����أ�"+nation+"<br/>");
		
		
//		pwr.write("</body>");
//		pwr.write("</html>");
		out.close();
		
		
		
	}
}
