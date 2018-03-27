package com.yh.bean;

import java.util.Date;

public class Contact {

    private Integer id;

    private String name;

    private String gender;

    private String phone;

    private Date department;



    public Contact(Integer id, String name, String gender, String phone, Date department) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", department=" + department +
                '}';
    }

    public Date getDepartment() {
        return department;
    }

    public void setDepartment(Date department) {
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
