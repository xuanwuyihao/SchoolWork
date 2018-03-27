package com.p2p.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class LogLift {
    private Integer id;

    private String username;

    private String banktype;

    private String bankcord;

    private BigDecimal liftmoney;

    private BigDecimal liftfee;

    private BigDecimal lastmoney;

    private Date lefttime;

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
        this.username = username == null ? null : username.trim();
    }

    public String getBanktype() {
        return banktype;
    }

    public void setBanktype(String banktype) {
        this.banktype = banktype == null ? null : banktype.trim();
    }

    public String getBankcord() {
        return bankcord;
    }

    public void setBankcord(String bankcord) {
        this.bankcord = bankcord == null ? null : bankcord.trim();
    }

    public BigDecimal getLiftmoney() {
        return liftmoney;
    }

    public void setLiftmoney(BigDecimal liftmoney) {
        this.liftmoney = liftmoney;
    }

    public BigDecimal getLiftfee() {
        return liftfee;
    }

    public void setLiftfee(BigDecimal liftfee) {
        this.liftfee = liftfee;
    }

    public BigDecimal getLastmoney() {
        return lastmoney;
    }

    public void setLastmoney(BigDecimal lastmoney) {
        this.lastmoney = lastmoney;
    }

    public Date getLefttime() {
        return lefttime;
    }

    public void setLefttime(Date lefttime) {
        this.lefttime = lefttime;
    }

    public String getOyh1() {
        return oyh1;
    }

    public void setOyh1(String oyh1) {
        this.oyh1 = oyh1 == null ? null : oyh1.trim();
    }

    public String getOyh2() {
        return oyh2;
    }

    public void setOyh2(String oyh2) {
        this.oyh2 = oyh2 == null ? null : oyh2.trim();
    }
}