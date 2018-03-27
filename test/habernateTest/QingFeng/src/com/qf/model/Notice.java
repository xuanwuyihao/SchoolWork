package com.qf.model;

import java.io.Serializable;
/*
 * n_id	int(主键)	编号				
 *n_title	varchar	标题				
 *n_content	varchar	内容				
 *n_date	datetime	时间				
 *n_flag	int	0公告、1简章									
 **/
public class Notice implements Serializable {
	
	private Integer n_id;
	private String n_title;
	private String n_content;
	private String n_date;
	private Integer n_flag;
	public Notice(){}
	public Notice(Integer n_id, String n_title, String n_content, String n_date, Integer n_flag) {
		super();
		this.n_id = n_id;
		this.n_title = n_title;
		this.n_content = n_content;
		this.n_date = n_date;
		this.n_flag = n_flag;
	}
	public Integer getN_id() {
		return n_id;
	}
	public void setN_id(Integer n_id) {
		this.n_id = n_id;
	}
	public String getN_title() {
		return n_title;
	}
	public void setN_title(String n_title) {
		this.n_title = n_title;
	}
	public String getN_content() {
		return n_content;
	}
	public void setN_content(String n_content) {
		this.n_content = n_content;
	}
	public String getN_date() {
		return n_date;
	}
	public void setN_date(String n_date) {
		this.n_date = n_date;
	}
	public Integer getN_flag() {
		return n_flag;
	}
	public void setN_flag(Integer n_flag) {
		this.n_flag = n_flag;
	}
	
	
}
