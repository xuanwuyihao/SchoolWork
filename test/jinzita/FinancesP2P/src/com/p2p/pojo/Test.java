package com.p2p.pojo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test {
	private Integer line;
	private Integer number;
	private String phone;
	private Date time1;
	private Date time2;
	private String sender;
	
	private Map<String, Object> conditionMap = new HashMap<String, Object>();

	@Override
	public String toString() {
		return "Test [line=" + line + ", number=" + number + ", phone=" + phone + ", time1=" + time1 + ", time2="
				+ time2 + ", sender=" + sender + ", conditionMap=" + conditionMap + "]";
	}

	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getTime1() {
		return time1;
	}

	public void setTime1(Date time1) {
		this.time1 = time1;
	}

	public Date getTime2() {
		return time2;
	}

	public void setTime2(Date time2) {
		this.time2 = time2;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public Map<String, Object> getConditionMap() {
		return conditionMap;
	}

	public void setConditionMap(Map<String, Object> conditionMap) {
		this.conditionMap = conditionMap;
	}

	
	
}
