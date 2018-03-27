package servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {//重写init  初始化servlet方法
		System.out.println("sevlet初始化！");
	}
	
	//重写doget方法			HttpServletRequest用来接收客户端向服务端发的请求，包括请求参数，请求对象
							//HttpServletResponse是服务器响应客户端的类，包括响应对象
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("进来了doget");
	}
	
	
	//重写dopost方法
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("进来了dopost");
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

	//重写sercice方法
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("进来了service");
		
		//设置请求编码
		req.setCharacterEncoding("utf-8");//要和页面编码一致
		
		//通过HttpservletRequest来获取页面传递的参数
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		
		System.out.println("账号："+uname+"       密码："+pwd);
		
		//设置响应内容类型
		resp.setContentType("text/html;charset=utf-8");
		
		//获得向客户端进行文本输出的控制流
		PrintWriter out=resp.getWriter();
		out.print("登录成功！");
		
		

	}
	
	//重写destroy方法，当JVM回收servlet垃圾时会调用该方法
	@Override
	public void destroy() {
		
	}
	
}
