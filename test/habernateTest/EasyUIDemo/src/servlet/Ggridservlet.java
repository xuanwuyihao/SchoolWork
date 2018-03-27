package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import moder.User;


/**
 * Servlet implementation class GridServlet
 */
public class Ggridservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ggridservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String page = request.getParameter("page");
		String rows = request.getParameter("rows");
		System.out.println("当前页"+page);
		System.out.println("每页显示"+rows);
		/*
		List<User> list = new ArrayList<>();
		for(int i=0;i<10;i++){
			User user = new User();
			user.setId(i);
			user.setName("name"+i);
			user.setAge(10+i);
			list.add(user);
		}
		Map<String, Object> map = new HashMap();
		map.put("total",55);
		map.put("rows", list);
		
		String mapJSON = JSON.toJSONString(map);
		System.out.println(mapJSON);
		PrintWriter out = response.getWriter();
		out.print(mapJSON);
		out.close();*/
		List<User> list = new ArrayList<>();
		for(int i=0;i<10;i++){
			User user=  new User();
			user.setId(i);
			user.setAge(10+i);
			user.setName("name"+i);
			list.add(user);
		}
		Map<String, Object> map = new HashMap<>();
		map.put("total", 55);
		map.put("rows", list);
		String mapJson = JSON.toJSONString(map);
		PrintWriter pw = response.getWriter();
		pw.print(mapJson);
		pw.close();
		
	}

}
