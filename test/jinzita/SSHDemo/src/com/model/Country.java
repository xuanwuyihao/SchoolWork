package com.model;

import java.io.Serializable;

public class Country implements Serializable{
	private Integer conid;
	private Integer cid;
	private String conname;
	public Integer getConid() {
		return conid;
	}
	public void setConid(Integer conid) {
		this.conid = conid;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(Integer conid, Integer cid, String conname) {
		super();
		this.conid = conid;
		this.cid = cid;
		this.conname = conname;
	}
	@Override
	public String toString() {
		return "Country [conid=" + conid + ", cid=" + cid + ", conname=" + conname + ", getConid()=" + getConid()
				+ ", getCid()=" + getCid() + ", getConname()=" + getConname() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getConname() {
		return conname;
	}
	public void setConname(String conname) {
		this.conname = conname;
	}
	

}
