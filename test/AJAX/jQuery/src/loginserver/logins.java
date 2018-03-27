package loginserver;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.login;

import com.google.gson.Gson;



public class logins extends HttpServlet {
	public logins() {
		super();
	}

	
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		System.out.println("pid="+id+"-----"+"pwd="+pwd);
		
		login lg=new login();
		lg.setId(id);
		lg.setPwd(pwd);
		
		Gson gson = new Gson();
		String str = gson.toJson(lg);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=utf-8");
		response.setHeader("cache-control","no-cache");
		PrintWriter pWriter = response.getWriter();
		pWriter.println(str);
		pWriter.flush();
		
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
