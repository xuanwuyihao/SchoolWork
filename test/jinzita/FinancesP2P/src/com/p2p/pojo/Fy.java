package com.p2p.pojo;

public class Fy {
	
	public Integer getDq() {
		return dq;
	}
	public void setDq(Integer dq) {
		this.dq = dq;
	}
	public Integer getMygs() {
		return mygs;
	}
	public void setMygs(Integer mygs) {
		this.mygs = mygs;
	}
	private Integer dq;
	private Integer mygs;
	
	//Still表模糊查询字段
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStaystatus() {
		return staystatus;
	}
	public void setStaystatus(String staystatus) {
		this.staystatus = staystatus;
	}
	private String realname;
	private String title;
	private String type;
	private String staystatus;
	
	private String pdmhfyzh;//判断模糊分页之后是继续查询还是分页
	
	public String getPdmhfyzh() {
		return pdmhfyzh;
	}
	public void setPdmhfyzh(String pdmhfyzh) {
		this.pdmhfyzh = pdmhfyzh;
	}
	
	
}
