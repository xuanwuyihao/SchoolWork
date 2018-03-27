package com.model;

import java.util.Date;

public class Employee {
	private Integer id;		//主键id
	private String name;	//员工名字
	private Integer age;	//员工年龄
	private String password;//密码
	private String sex;		//性别
	private Date createdate;//创建时间
	private Integer pid;	//所属省的id
	private Integer cid;	//所属市的id
	private Integer conid;	//所属县的id
	private Integer mid;	//工资id
	private Integer depId; // 所属部门id（外键）
	private Integer moneysize;
	

}
