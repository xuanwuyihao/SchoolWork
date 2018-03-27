package com.p2p.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ExamineApply {
    private Integer id;

    private String username;

    private BigDecimal applylimit;

    private Date applytime;

    private BigDecimal examinelimit;

    private Date examinetime;

    private String status;

    private String result;

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

    public BigDecimal getApplylimit() {
        return applylimit;
    }

    public void setApplylimit(BigDecimal applylimit) {
        this.applylimit = applylimit;
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public BigDecimal getExaminelimit() {
        return examinelimit;
    }

    public void setExaminelimit(BigDecimal examinelimit) {
        this.examinelimit = examinelimit;
    }

    public Date getExaminetime() {
        return examinetime;
    }

    public void setExaminetime(Date examinetime) {
        this.examinetime = examinetime;
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "ExamineApply [id=" + id + ", username=" + username + ", applylimit=" + applylimit + ", applytime="
				+ applytime + ", examinelimit=" + examinelimit + ", examinetime=" + examinetime + ", status=" + status
				+ ", result=" + result + "]";
	}

    
    
    
}