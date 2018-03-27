package com.qf.model;

import java.io.Serializable;
/*
 *sf_id	int(主键)	编号	
 *stu_id	int	关联学生表id	
 *sf_photo	varchar	相片路径	
 *sf_voucher	varchar	缴费凭证路径	
 *sf_paper	varchar	论文路径	
 *sf_date	datetime	上传时间			
**/
public class Stu_file implements Serializable{

	private Integer sf_id;
	private Integer stu_id;
	private String sf_photo;
	private String sf_voucher;
	private String sf_paper;
	private String sf_date;
	public Stu_file(){}
	public Stu_file(Integer sf_id, Integer stu_id, String sf_photo, String sf_voucher, String sf_paper,
			String sf_date) {
		super();
		this.sf_id = sf_id;
		this.stu_id = stu_id;
		this.sf_photo = sf_photo;
		this.sf_voucher = sf_voucher;
		this.sf_paper = sf_paper;
		this.sf_date = sf_date;
	}
	public Integer getSf_id() {
		return sf_id;
	}
	public void setSf_id(Integer sf_id) {
		this.sf_id = sf_id;
	}
	public Integer getStu_id() {
		return stu_id;
	}
	public void setStu_id(Integer stu_id) {
		this.stu_id = stu_id;
	}
	public String getSf_photo() {
		return sf_photo;
	}
	public void setSf_photo(String sf_photo) {
		this.sf_photo = sf_photo;
	}
	public String getSf_voucher() {
		return sf_voucher;
	}
	public void setSf_voucher(String sf_voucher) {
		this.sf_voucher = sf_voucher;
	}
	public String getSf_paper() {
		return sf_paper;
	}
	public void setSf_paper(String sf_paper) {
		this.sf_paper = sf_paper;
	}
	public String getSf_date() {
		return sf_date;
	}
	public void setSf_date(String sf_date) {
		this.sf_date = sf_date;
	}
	
	
	
}
