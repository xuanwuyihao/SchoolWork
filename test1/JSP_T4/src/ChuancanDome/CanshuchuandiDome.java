package ChuancanDome;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CanshuchuandiDome extends HttpServlet{
	@Override
	public void init() throws ServletException {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String uname= req.getParameter("uname");
		String[] aihaos=req.getParameterValues("aihao");
		System.out.println("�û�����"+uname);
		System.out.println("���ã�");
		for (int i = 0; i < aihaos.length; i++) {
			System.out.println(aihaos[i]);
		}
		String age=req.getParameter("age");
		System.out.println("������"+age);
		
		//��selectת����JSPҳ��(�ض���)
		resp.sendRedirect("Zhuantiaoyemian.jsp");
	}
	
	
}
