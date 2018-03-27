package com.qf.model;

import java.io.Serializable;
/**
 * hc_id	int(主键)	编号				
 *picture_one	varchar	轮播图1				
 *picture_two	varchar	轮播图2				
 *picture_three	varchar	轮播图3				
 *qrcode_one	varchar	二维码1				
 *qrcode_two	varchar	二维码2				
 *hc_phone	varchar	联系电话				
 *hc_address	varchar	地址				
 *interlinkage_one	varchar	链接1				
 *interlinkage_two	varchar	链接2				
 *interlinkage_three	varchar	链接3				
 *interlinkage_four	varchar	链接4				
*/
public class Home_content implements Serializable{

	private Integer hc_id;
	private String picture_one;
	private String picture_two;
	private String picture_three;
	private String qrcode_one;
	private String qrcode_two;
	private String hc_phone;
	private String hc_address;
	private String interlinkage_one;
	private String interlinkage_two;
	private String interlinkage_three;
	private String interlinkage_four;
	
	public Home_content(){}
	public Home_content(Integer hc_id, String picture_one, String picture_two, String picture_three, String qrcode_one,
			String qrcode_two, String hc_phone, String hc_address, String interlinkage_one, String interlinkage_two,
			String interlinkage_three, String interlinkage_four) {
		super();
		this.hc_id = hc_id;
		this.picture_one = picture_one;
		this.picture_two = picture_two;
		this.picture_three = picture_three;
		this.qrcode_one = qrcode_one;
		this.qrcode_two = qrcode_two;
		this.hc_phone = hc_phone;
		this.hc_address = hc_address;
		this.interlinkage_one = interlinkage_one;
		this.interlinkage_two = interlinkage_two;
		this.interlinkage_three = interlinkage_three;
		this.interlinkage_four = interlinkage_four;
	}
	public Integer getHc_id() {
		return hc_id;
	}
	public void setHc_id(Integer hc_id) {
		this.hc_id = hc_id;
	}
	public String getPicture_one() {
		return picture_one;
	}
	public void setPicture_one(String picture_one) {
		this.picture_one = picture_one;
	}
	public String getPicture_two() {
		return picture_two;
	}
	public void setPicture_two(String picture_two) {
		this.picture_two = picture_two;
	}
	public String getPicture_three() {
		return picture_three;
	}
	public void setPicture_three(String picture_three) {
		this.picture_three = picture_three;
	}
	public String getQrcode_one() {
		return qrcode_one;
	}
	public void setQrcode_one(String qrcode_one) {
		this.qrcode_one = qrcode_one;
	}
	public String getQrcode_two() {
		return qrcode_two;
	}
	public void setQrcode_two(String qrcode_two) {
		this.qrcode_two = qrcode_two;
	}
	public String getHc_phone() {
		return hc_phone;
	}
	public void setHc_phone(String hc_phone) {
		this.hc_phone = hc_phone;
	}
	public String getHc_address() {
		return hc_address;
	}
	public void setHc_address(String hc_address) {
		this.hc_address = hc_address;
	}
	public String getInterlinkage_one() {
		return interlinkage_one;
	}
	public void setInterlinkage_one(String interlinkage_one) {
		this.interlinkage_one = interlinkage_one;
	}
	public String getInterlinkage_two() {
		return interlinkage_two;
	}
	public void setInterlinkage_two(String interlinkage_two) {
		this.interlinkage_two = interlinkage_two;
	}
	public String getInterlinkage_three() {
		return interlinkage_three;
	}
	public void setInterlinkage_three(String interlinkage_three) {
		this.interlinkage_three = interlinkage_three;
	}
	public String getInterlinkage_four() {
		return interlinkage_four;
	}
	public void setInterlinkage_four(String interlinkage_four) {
		this.interlinkage_four = interlinkage_four;
	}
	
	
	
	
}
