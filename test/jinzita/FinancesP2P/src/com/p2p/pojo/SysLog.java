package com.p2p.pojo;

public class SysLog {
	private Integer id;
	private String username;
	private String ipaddress;
	private String logintime;
	private String status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	public String getLogintime() {
		return logintime;
	}
	public void setLogintime(String logintime) {
		this.logintime = logintime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "SysLog [id=" + id + ", username=" + username + ", ipaddress=" + ipaddress + ", logintime=" + logintime
				+ ", status=" + status + "]";
	}
	
}
