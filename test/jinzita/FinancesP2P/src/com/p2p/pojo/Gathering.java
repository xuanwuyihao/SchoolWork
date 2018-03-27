package com.p2p.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Gathering {
    private Integer id;

    private Integer userid;

    private Integer lendid;
    
    private String username;

    private String realname;

    private BigDecimal hasmoney;

    private Integer stage;

    private Integer hasstage;

    private BigDecimal answergold;
    
    private BigDecimal hasallmoney;

    private BigDecimal answerfine;

    private BigDecimal hasgold;

    private BigDecimal hastime;

    private Date stilldtate;
    
    private Integer lendtime;

    private String billcode;

    private BigDecimal monthrate;

    private Date awordtime;

    private String awordstatus;

    private BigDecimal recommendmoney;

    private String oyh1;

    private String oyh2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getLendid() {
        return lendid;
    }

    public void setLendid(Integer lendid) {
        this.lendid = lendid;
    }

    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public BigDecimal getHasallmoney() {
		return hasallmoney;
	}

	public void setHasallmoney(BigDecimal hasallmoney) {
		this.hasallmoney = hasallmoney;
	}

	public Integer getLendtime() {
		return lendtime;
	}

	public void setLendtime(Integer lendtime) {
		this.lendtime = lendtime;
	}

	public BigDecimal getHasmoney() {
        return hasmoney;
    }

    public void setHasmoney(BigDecimal hasmoney) {
        this.hasmoney = hasmoney;
    }

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public Integer getHasstage() {
        return hasstage;
    }

    public void setHasstage(Integer hasstage) {
        this.hasstage = hasstage;
    }

    public BigDecimal getAnswergold() {
        return answergold;
    }

    public void setAnswergold(BigDecimal answergold) {
        this.answergold = answergold;
    }

    public BigDecimal getAnswerfine() {
        return answerfine;
    }

    public void setAnswerfine(BigDecimal answerfine) {
        this.answerfine = answerfine;
    }

    public BigDecimal getHasgold() {
        return hasgold;
    }

    public void setHasgold(BigDecimal hasgold) {
        this.hasgold = hasgold;
    }

    public BigDecimal getHastime() {
        return hastime;
    }

    public void setHastime(BigDecimal hastime) {
        this.hastime = hastime;
    }

    public Date getStilldtate() {
        return stilldtate;
    }

    public void setStilldtate(Date stilldtate) {
        this.stilldtate = stilldtate;
    }

    public String getBillcode() {
        return billcode;
    }

    public void setBillcode(String billcode) {
        this.billcode = billcode == null ? null : billcode.trim();
    }

    public BigDecimal getMonthrate() {
        return monthrate;
    }

    public void setMonthrate(BigDecimal monthrate) {
        this.monthrate = monthrate;
    }

    public Date getAwordtime() {
        return awordtime;
    }

    public void setAwordtime(Date awordtime) {
        this.awordtime = awordtime;
    }

    public String getAwordstatus() {
        return awordstatus;
    }

    public void setAwordstatus(String awordstatus) {
        this.awordstatus = awordstatus == null ? null : awordstatus.trim();
    }

    public BigDecimal getRecommendmoney() {
        return recommendmoney;
    }

    public void setRecommendmoney(BigDecimal recommendmoney) {
        this.recommendmoney = recommendmoney;
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