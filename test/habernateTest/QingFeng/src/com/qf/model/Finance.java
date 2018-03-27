package com.qf.model;

import java.io.Serializable;
/*
 * f_id	int(主键)	编号				
 *stu_no	varchar	关联学生表学号				
 *tea_class	varchar	班主任				
 *need_money	decimal	需交金额				
  *practical_money	decimal	实缴金额				
 *f_date	datetime	缴费时间				
 *f_way	varchar	缴费方式(支付宝、微信、银行、现金)				
 *f_accumulative	decimal	累计金额				
 *f_state	varchar	缴费状态(未缴费、已缴费、已兑帐)				
 *f_test	varchar	预留字段				
 *						
*/
import java.util.Date;


public class Finance implements Serializable{
	private  Integer f_id;
	private String stu_no;
	private String tea_class;
	private double need_monuy;
	private double practical_money;
	private String f_date;
	private String f_way;
	private double f_accumulative;
	private String f_state;
	private String f_test;
	
	
	public Finance(){}
	public Finance(Integer f_id, String stu_no, String tea_class, double need_monuy, double practical_money,
			String f_date, String f_way, double f_accumulative, String f_state, String f_test) {
		super();
		this.f_id = f_id;
		this.stu_no = stu_no;
		this.tea_class = tea_class;
		this.need_monuy = need_monuy;
		this.practical_money = practical_money;
		this.f_date = f_date;
		this.f_way = f_way;
		this.f_accumulative = f_accumulative;
		this.f_state = f_state;
		this.f_test = f_test;
	}
	public Integer getF_id() {
		return f_id;
	}
	public void setF_id(Integer f_id) {
		this.f_id = f_id;
	}
	public String getStu_no() {
		return stu_no;
	}
	public void setStu_no(String stu_no) {
		this.stu_no = stu_no;
	}
	public String getTea_class() {
		return tea_class;
	}
	public void setTea_class(String tea_class) {
		this.tea_class = tea_class;
	}
	public double getNeed_monuy() {
		return need_monuy;
	}
	public void setNeed_monuy(double need_monuy) {
		this.need_monuy = need_monuy;
	}
	public double getPractical_money() {
		return practical_money;
	}
	public void setPractical_money(double practical_money) {
		this.practical_money = practical_money;
	}
	public String getF_date() {
		return f_date;
	}
	public void setF_date(String f_date) {
		this.f_date = f_date;
	}
	public String getF_way() {
		return f_way;
	}
	public void setF_way(String f_way) {
		this.f_way = f_way;
	}
	public double getF_accumulative() {
		return f_accumulative;
	}
	public void setF_accumulative(double f_accumulative) {
		this.f_accumulative = f_accumulative;
	}
	public String getF_state() {
		return f_state;
	}
	public void setF_state(String f_state) {
		this.f_state = f_state;
	}
	public String getF_test() {
		return f_test;
	}
	public void setF_test(String f_test) {
		this.f_test = f_test;
	}
	
	
	
}
