package com.p2p.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class CompanyMoney {

	
	private Integer id ;
	private BigDecimal money ;
	private String decription ;
	private Date time;  
	private String  type ;//0
	private String oyh1;
	private String oyh2;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOyh1() {
		return oyh1;
	}
	public void setOyh1(String oyh1) {
		this.oyh1 = oyh1;
	}
	public String getOyh2() {
		return oyh2;
	}
	public void setOyh2(String oyh2) {
		this.oyh2 = oyh2;
	}
	public CompanyMoney(Integer id, BigDecimal money, String decription, Date time, String type, String oyh1,
			String oyh2) {
		super();
		this.id = id;
		this.money = money;
		this.decription = decription;
		this.time = time;
		this.type = type;
		this.oyh1 = oyh1;
		this.oyh2 = oyh2;
	}
	public CompanyMoney() {
		super();
	}
	
	
	
	
}
