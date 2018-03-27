package com.qf.model;


 /**
 * @author Administrator
 * 
 * 	u_id	int(主键)	编号		
	u_name	varchar	角色名称		
	u_seq	int	排序号		
	u_description        	varchar	简介		
	u_state	int	状态	(1:正常   0：停用)	

 *
 */
public class User {
	
	//后台管理员
	private Integer u_id;   //id
	private String u_name;  //姓名
	private Integer u_seq ;   //排序号
	private String u_description ;  //简介
	private Integer u_state ;  //状态
	
	
	
	
	
	public User() {}
	
	public User(Integer u_id, String u_name, Integer u_seq, String u_description, Integer u_state) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_seq = u_seq;
		this.u_description = u_description;
		this.u_state = u_state;
	}
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public Integer getU_seq() {
		return u_seq;
	}
	public void setU_seq(Integer u_seq) {
		this.u_seq = u_seq;
	}
	public String getU_description() {
		return u_description;
	}
	public void setU_description(String u_description) {
		this.u_description = u_description;
	}
	public Integer getU_state() {
		return u_state;
	}
	public void setU_state(Integer u_state) {
		this.u_state = u_state;
	}

}
