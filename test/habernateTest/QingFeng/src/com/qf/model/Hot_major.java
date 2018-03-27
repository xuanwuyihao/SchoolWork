package com.qf.model;

import java.io.Serializable;

/*
 * hm_id	int(主键)	编号	
 *hm_title	varchar	标题	
 *hm_picture	varchar	图片	
 *hm_content	varchar	内容			
*/
public class Hot_major implements Serializable{

	private Integer  hm_id;
	private String  hm_title;
	private String  hm_picture;
	private String  hm_content;
	
	public Hot_major(){}
	public Hot_major(Integer hm_id, String hm_title, String hm_picture, String hm_content) {
		super();
		this.hm_id = hm_id;
		this.hm_title = hm_title;
		this.hm_picture = hm_picture;
		this.hm_content = hm_content;
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
	
	
	
}
