package com.p2p.pojo;

import java.util.Date;

public class UserInfo {
    private Integer id;

    private Integer userId;

    private String realname;

    private String idcard;

    private String sex;

    private String birthdate;

    private String education;

    private String school;

    private String marriage;

    private String children;

    private String whetherhouse;

    private String whethercar;

    private String nativeplace;

    private String hukaddress;

    private String oyh1;

    private String oyh2;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}




	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getMarriage() {
		return marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	public String getChildren() {
		return children;
	}

	public void setChildren(String children) {
		this.children = children;
	}

	public String getWhetherhouse() {
		return whetherhouse;
	}

	public void setWhetherhouse(String whetherhouse) {
		this.whetherhouse = whetherhouse;
	}

	public String getWhethercar() {
		return whethercar;
	}

	public void setWhethercar(String whethercar) {
		this.whethercar = whethercar;
	}

	public String getNativeplace() {
		return nativeplace;
	}

	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}

	public String getHukaddress() {
		return hukaddress;
	}

	public void setHukaddress(String hukaddress) {
		this.hukaddress = hukaddress;
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

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userId=" + userId + ", realname=" + realname + ", idcard=" + idcard + ", sex="
				+ sex + ", birthdate=" + birthdate + ", education=" + education + ", school=" + school + ", marriage="
				+ marriage + ", children=" + children + ", whetherhouse=" + whetherhouse + ", whethercar=" + whethercar
				+ ", nativeplace=" + nativeplace + ", hukaddress=" + hukaddress + ", oyh1=" + oyh1 + ", oyh2=" + oyh2
				+ "]";
	}

   
}