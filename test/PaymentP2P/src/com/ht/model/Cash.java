package com.ht.model;

import java.math.BigDecimal;
import java.util.Date;

public class Cash {
    private Integer id;

    private String ordid;

    private String custis;

    private String openaccid;

    
    private BigDecimal transamt;

    private BigDecimal serfee;

    private String sercustid;

    private BigDecimal fee;

    private String feecustid;

    private BigDecimal realamt;

    private Date orderdate;

    private String ordstatus;

    private String stay1;

    private String stay2;

    private String stay3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdid() {
        return ordid;
    }

    public void setOrdid(String ordid) {
        this.ordid = ordid == null ? null : ordid.trim();
    }

    public String getCustis() {
        return custis;
    }

    public void setCustis(String custis) {
        this.custis = custis == null ? null : custis.trim();
    }

    public String getOpenaccid() {
        return openaccid;
    }

    public void setOpenaccid(String openaccid) {
        this.openaccid = openaccid == null ? null : openaccid.trim();
    }

    public BigDecimal getTransamt() {
        return transamt;
    }

    public void setTransamt(BigDecimal transamt) {
        this.transamt = transamt;
    }

    public BigDecimal getSerfee() {
        return serfee;
    }

    public void setSerfee(BigDecimal serfee) {
        this.serfee = serfee;
    }

    public String getSercustid() {
        return sercustid;
    }

    public void setSercustid(String sercustid) {
        this.sercustid = sercustid == null ? null : sercustid.trim();
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getFeecustid() {
        return feecustid;
    }

    public void setFeecustid(String feecustid) {
        this.feecustid = feecustid == null ? null : feecustid.trim();
    }

    public BigDecimal getRealamt() {
        return realamt;
    }

    public void setRealamt(BigDecimal realamt) {
        this.realamt = realamt;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getOrdstatus() {
        return ordstatus;
    }

    public void setOrdstatus(String ordstatus) {
        this.ordstatus = ordstatus == null ? null : ordstatus.trim();
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