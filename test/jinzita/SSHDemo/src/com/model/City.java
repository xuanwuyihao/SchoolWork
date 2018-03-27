package com.model;

public class City {
	private Integer cid;
	private String cname;
	private Integer pid;
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "City [cid=" + cid + ", cname=" + cname + ", pid=" + pid + ", getCid()=" + getCid() + ", getCname()="
				+ getCname() + ", getPid()=" + getPid() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public City(Integer cid, String cname, Integer pid) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.pid = pid;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}

}
