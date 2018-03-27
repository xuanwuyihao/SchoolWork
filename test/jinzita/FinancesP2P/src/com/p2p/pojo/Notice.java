package com.p2p.pojo;

import java.util.Date;

public class Notice {
    private Integer id;

    private String title;

    private String content;

    private Date time;

    private String people;

    private String oyh1;

    private String oyh2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }


 

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people == null ? null : people.trim();
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