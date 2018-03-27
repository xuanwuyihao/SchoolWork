package com.p2p.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class LogMoney {
    private Integer id;

    private String username;

    private Date time;

    private String type;

    private BigDecimal dealmoney;

    private String states;

    private String oyh1;

    private String oyh2;

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

	public BigDecimal getDealmoney() {
		return dealmoney;
	}

	public void setDealmoney(BigDecimal dealmoney) {
		this.dealmoney = dealmoney;
	}

	public String getStates() {
		return states;
	}

	public void setStates(String states) {
		this.states = states;
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

    

}