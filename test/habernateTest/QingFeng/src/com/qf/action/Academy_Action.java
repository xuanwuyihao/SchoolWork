package com.qf.action;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.omg.PortableInterceptor.SUCCESSFUL;

import com.alibaba.fastjson.JSON;
import com.qf.model.Academy;
import com.qf.service.Academy_Service;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Academy_Action  extends ActionSupport implements ServletResponseAware{
	
	private Academy_Service academy_Service;
	private HttpServletResponse response;
	private HttpServletRequest request;
	private HttpSession session;  
	private ServletContext application;  
	
	private Academy academy;
	private String jsonResult;
	
	
	

	public String getJsonResult() {
		return jsonResult;
	}

	public void setJsonResult(String jsonResult) {
		this.jsonResult = jsonResult;
	}

	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session) {
		this.session = session;
	}

	public ServletContext getApplication() {
		return application;
	}

	public void setApplication(ServletContext application) {
		this.application = application;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public Academy getAcademy() {
		return academy;
	}

	public void setAcademy(Academy academy) {
		this.academy = academy;
	}

	public Academy_Service getAcademy_Service() {
		return academy_Service;
	}

	public void setAcademy_Service(Academy_Service academy_Service) {
		this.academy_Service = academy_Service;
	}
	
	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		//ʵ��ServletResponseAware�ӿں���д���response �ķ���
		this.response = response;
	}

	
	public String list() throws Exception{
		System.out.println("����ListAction");
		Map	jsonMap = academy_Service.list();
		jsonResult = JSON.toJSONString(jsonMap);
		System.out.println("map�е�json��ʽ��"+jsonResult);
		PrintWriter pw = response.getWriter();
		pw.println(jsonResult);  //��json�ĸ�ʽ���ص�ҳ����
		return null;
	}
	
	public String save() {
		System.out.println("�����˱���");
		System.out.println("ԺУ���ƣ�"+academy.getA_school());
		academy_Service.save(academy);
		return SUCCESS;
	}

	
}
