package com.xin.controller;

public class User {
	private Integer id;
	private String name;
	private String sek;
	public User(Integer id, String name, String sek) {
		super();
		this.id = id;
		this.name = name;
		this.sek = sek;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSek() {
		return sek;
	}
	public void setSek(String sek) {
		this.sek = sek;
	}
	
}
