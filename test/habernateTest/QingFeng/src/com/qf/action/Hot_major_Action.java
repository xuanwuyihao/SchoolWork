package com.qf.action;

import com.opensymphony.xwork2.ActionSupport;
import com.qf.model.Hot_major;
import com.qf.service.Hot_major_Service;

public class Hot_major_Action extends ActionSupport{

	private Hot_major_Service hot_major_Service;
	
	private Hot_major hot;
	private Integer hm_id;
	private String hm_title;
	public Hot_major getHot() {
		return hot;
	}

	public void setHot(Hot_major hot) {
		this.hot = hot;
	}

	public Integer getHm_id() {
		return hm_id;
	}

	public void setHm_id(Integer hm_id) {
		this.hm_id = hm_id;
	}

	public String getHm_title() {
		return hm_title;
	}

	public void setHm_title(String hm_title) {
		this.hm_title = hm_title;
	}

	public String getHm_picture() {
		return hm_picture;
	}

	public void setHm_picture(String hm_picture) {
		this.hm_picture = hm_picture;
	}

	public String getHm_content() {
		return hm_content;
	}

	public void setHm_content(String hm_content) {
		this.hm_content = hm_content;
	}

	private String hm_picture;
	private String hm_content;

	public Hot_major_Service getHot_major_Service() {
		return hot_major_Service;
	}

	public void setHot_major_Service(Hot_major_Service hot_major_Service) {
		this.hot_major_Service = hot_major_Service;
	}
	
	//查询所有数据
	public String select(){
		hot=hot_major_Service.getHot_major(hm_id);
		return SUCCESS;
	}
	
	//修改数据
	public String update(){
		hot_major_Service.update(hot);
		return SUCCESS;
	}
	
	//新增数据
	public String add(){
		hot_major_Service.save(hot);
		return SUCCESS;
	}
	
	//删除
	public String delete(){
		hot_major_Service.delete(hm_id);
		return SUCCESS;
	}
	
	
}