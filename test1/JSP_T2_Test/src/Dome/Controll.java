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
		//设置请求编码
		req.setCharacterEncoding("utf-8");
		
		//获取传递参数
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
		
		
		
		//设置响应类型
		resp.setContentType("text/html;charset=utf-8");
		
		//获得客户进行文本传输的控制流
		PrintWriter out=resp.getWriter();
		
//		pwr.write("<html>");
//		pwr.write("<head><title>信息</head></title>");
//		pwr.write("<body>");
		out.write("昵称："+nikname+"<br/>");
		out.write("密码："+pwd+"<br/>");
		out.write("确认密码："+pwd1+"<br/>");
		out.write("性别："+sex+"<br/>");
		out.write("年龄："+age+"<br/>");
		out.write("爱好："+aihaos.toString()+"<br/>");
		out.write("出生地："+nation+"<br/>");
		
		
//		pwr.write("</body>");
//		pwr.write("</html>");
		out.close();
		
		
		
	}
}
