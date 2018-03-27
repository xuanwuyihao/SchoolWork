package com.p2p.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String realname;

    private String sex;

    private String face;

    private String phone;

    private String email;

    private String password;

    private Date registertime;

    private String referrerno;

    private String lastip;

    private Date lastlogintime;

    private String status;

    private String oyh1;

    private String oyh2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face == null ? null : face.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public String getReferrerno() {
        return referrerno;
    }

    public void setReferrerno(String referrerno) {
        this.referrerno = referrerno == null ? null : referrerno.trim();
    }

    public String getLastip() {
        return lastip;
    }

    public void setLastip(String lastip) {
        this.lastip = lastip == null ? null : lastip.trim();
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
		return "User [id=" + id + ", realname=" + realname + ", sex=" + sex + ", face=" + face + ", phone=" + phone
				+ ", email=" + email + ", password=" + password + ", registertime=" + registertime + ", referrerno="
				+ referrerno + ", lastip=" + lastip + ", lastlogintime=" + lastlogintime + ", status=" + status
				+ ", oyh1=" + oyh1 + ", oyh2=" + oyh2 + "]";
	}

	
	
   
}