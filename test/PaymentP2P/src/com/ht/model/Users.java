package com.ht.model;

import java.util.Date;

public class Users {
    private Integer id;

    private String custid;

    private String pwd;

    private String merid;

    private String username;

    private String idno;

    private String userphone;

    private String usermail;

    private Date datetime;

    private String stay1;

    private String stay2;

    private String stay3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid == null ? null : custid.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getMerid() {
        return merid;
    }

    public void setMerid(String merid) {
        this.merid = merid == null ? null : merid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUsermail() {
        return usermail;
    }

    public void setUsermail(String usermail) {
        this.usermail = usermail == null ? null : usermail.trim();
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getStay1() {
        return stay1;
    }

    public void setStay1(String stay1) {
        this.stay1 = stay1 == null ? null : stay1.trim();
    }

    public String getStay2() {
        return stay2;
    }

    public void setStay2(String stay2) {
        this.stay2 = stay2 == null ? null : stay2.trim();
    }

    public String getStay3() {
        return stay3;
    }

    public void setStay3(String stay3) {
        this.stay3 = stay3 == null ? null : stay3.trim();
    }
}