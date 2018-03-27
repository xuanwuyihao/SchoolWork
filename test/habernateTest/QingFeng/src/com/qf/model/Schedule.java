package com.qf.model;

import java.io.Serializable;

/*
 * s_id	int(主键)	编号	
 *user_id	int	关联系统用户表id	
 *s_content	varchar	计划内容	
 *s_date	datetime	时间	
 *s_flag	int	标志位(0灰色\1绿色)				
*/
public class Schedule implements Serializable {

	private Integer s_id;
	private Integer user_id;
	private String s_content;
	private String s_date;
	private Integer s_flag;
	
	public Schedule(){}
	public Schedule(Integer s_id, Integer user_id, String s_content, String s_date, Integer s_flag) {
		super();
		this.s_id = s_id;
		this.user_id = user_id;
		this.s_content = s_content;
		this.s_date = s_date;
		this.s_flag = s_flag;
	}
	public Integer getS_id() {
		return s_id;
	}
	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getS_content() {
		return s_content;
	}
	public void setS_content(String s_content) {
		this.s_content = s_content;
	}
	public String getS_date() {
		return s_date;
	}
	public void setS_date(String s_date) {
		this.s_date = s_date;
	}
	public Integer getS_flag() {
		return s_flag;
	}
	public void setS_flag(Integer s_flag) {
		this.s_flag = s_flag;
	}
	
	
}
