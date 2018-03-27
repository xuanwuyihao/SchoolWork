package Dao;


//给数据库创建实体bean
//只包含属性或构造方法，并且提供属性的bean方法
public class Student {
	private int id;
	private String name;
	private int eag;
	private String sex;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEag() {
		return eag;
	}
	public void setEag(int eag) {
		this.eag = eag;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setId(int id) {
		this.id = id;
	}

}
