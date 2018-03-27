package com.p2p.pojo;

import java.util.Date;

public class UserBankcard {
    private Integer id;

    private Integer userinfoid;

    private String bankcard;

    private String placebank;

    private Date bindingtime;

    private String status;

    private String oyh1;

    private String oyh2;
    
    private String oyh3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(Integer userinfoid) {
        this.userinfoid = userinfoid;
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard == null ? null : bankcard.trim();
    }

    public String getPlacebank() {
        return placebank;
    }

    public void setPlacebank(String placebank) {
        this.placebank = placebank == null ? null : placebank.trim();
    }

   

   

	public Date getBindingtime() {
		return bindingtime;
	}

	public void setBindingtime(Date bindingtime) {
		this.bindingtime = bindingtime;
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

	public String getOyh3() {
		return oyh3;
	}

	public void setOyh3(String oyh3) {
		this.oyh3 = oyh3;
	}
    
}