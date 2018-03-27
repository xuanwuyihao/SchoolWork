package com.qf.model;

import java.io.Serializable;
/*
 * at_id	int(主键)	编号	
 *at_name	varchar	分类名			
*/
public class Apply_type implements Serializable{
	private Integer at_id;
	private String at_name;
	
	public Apply_type(){}
	public Apply_type(Integer at_id,String at_name){
		this.at_id=at_id;
		this.at_name=at_name;
	}
	public Integer getAt_id() {
		return at_id;
	}
	public void setAt_id(Integer at_id) {
		this.at_id = at_id;
	}
	public String getAt_name() {
		return at_name;
	}
	public void setAt_name(String at_name) {
		this.at_name = at_name;
	}
	
	
}
