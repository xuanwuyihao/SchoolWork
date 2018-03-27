package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import service.UserService;

public class Useraction extends ActionSupport{
	private UserService userservice;

	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}
	
	private List list;
	
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	//查询
	public String selectd() throws IOException {
		list=userservice.getlisr();
		 HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("text/html; charset=utf-8");
		PrintWriter pw=response.getWriter();
		pw.close();
		return null;
	}

}
