package com.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSON;
import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class UserAction extends ActionSupport{
	private String ids;
	private UserService userservice;
	private User user;
	private List<User> list;
	private String id;
	private Integer page;
	private Integer rows;
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public UserService getUserservice() {
		return userservice;
	}
	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}

	
	public String list() throws IOException {
		Map<String, Object> map=new HashMap<>();
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		PrintWriter pw=response.getWriter();
		try {
			List<User> lists=userservice.getSelect(page, rows);
			 map.put("rows", lists);
			 map.put("page", userservice.getCount());
			 String mapJson=JSON.toJSONString(map);
			 pw.print(mapJson);
			 pw.flush();
			 pw.close();
		
		}catch (Exception e) {
			// TODO: handle exception
		}
	return null;
	}
}
