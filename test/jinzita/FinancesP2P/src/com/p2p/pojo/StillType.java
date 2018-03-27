package com.p2p.pojo;

public class StillType {
    private Integer id;

    private String type;

    private String description;

    private String oyh1;

    private String oyh2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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