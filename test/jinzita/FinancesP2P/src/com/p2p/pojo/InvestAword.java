package com.p2p.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class InvestAword {
    private Integer id;

    private String vsername;

    private BigDecimal investmoney;

    private String description;

    private BigDecimal awordtype;

    private String status;

    private Date awordtime;

    private Date investimerange;

    private String oyh1;

    private String oyh2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVsername() {
        return vsername;
    }

    public void setVsername(String vsername) {
        this.vsername = vsername == null ? null : vsername.trim();
    }

    public BigDecimal getInvestmoney() {
        return investmoney;
    }

    public void setInvestmoney(BigDecimal investmoney) {
        this.investmoney = investmoney;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getAwordtype() {
        return awordtype;
    }

    public void setAwordtype(BigDecimal awordtype) {
        this.awordtype = awordtype;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getAwordtime() {
        return awordtime;
    }

    public void setAwordtime(Date awordtime) {
        this.awordtime = awordtime;
    }

    public Date getInvestimerange() {
        return investimerange;
    }

    public void setInvestimerange(Date investimerange) {
        this.investimerange = investimerange;
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