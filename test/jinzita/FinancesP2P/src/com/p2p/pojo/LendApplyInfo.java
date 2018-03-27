package com.p2p.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class LendApplyInfo {
    private Integer id;

    private String username;

    private BigDecimal lendmoney;

    private BigDecimal rate;

    private Date hastime;

    private String moneypurpose;

    private String backtype;

    private String stillsoure;

    private String introduce;

    private String description;

    private String ensure;

    private String cardphoto;

    private String license;

    private String backaccount;

    private String other;

    private Date adopttime;

    private String status;

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

    public BigDecimal getLendmoney() {
        return lendmoney;
    }

    public void setLendmoney(BigDecimal lendmoney) {
        this.lendmoney = lendmoney;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Date getHastime() {
        return hastime;
    }

    public void setHastime(Date hastime) {
        this.hastime = hastime;
    }

    public String getMoneypurpose() {
        return moneypurpose;
    }

    public void setMoneypurpose(String moneypurpose) {
        this.moneypurpose = moneypurpose == null ? null : moneypurpose.trim();
    }

    public String getBacktype() {
        return backtype;
    }

    public void setBacktype(String backtype) {
        this.backtype = backtype == null ? null : backtype.trim();
    }

    public String getStillsoure() {
        return stillsoure;
    }

    public void setStillsoure(String stillsoure) {
        this.stillsoure = stillsoure == null ? null : stillsoure.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getEnsure() {
        return ensure;
    }

    public void setEnsure(String ensure) {
        this.ensure = ensure == null ? null : ensure.trim();
    }

    public String getCardphoto() {
        return cardphoto;
    }

    public void setCardphoto(String cardphoto) {
        this.cardphoto = cardphoto == null ? null : cardphoto.trim();
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public String getBackaccount() {
        return backaccount;
    }

    public void setBackaccount(String backaccount) {
        this.backaccount = backaccount == null ? null : backaccount.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public Date getAdopttime() {
        return adopttime;
    }

    public void setAdopttime(Date adopttime) {
        this.adopttime = adopttime;
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
        this.oyh1 = oyh1 == null ? null : oyh1.trim();
    }

    public String getOyh2() {
        return oyh2;
    }

    public void setOyh2(String oyh2) {
        this.oyh2 = oyh2 == null ? null : oyh2.trim();
    }
}