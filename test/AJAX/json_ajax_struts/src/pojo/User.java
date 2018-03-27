package pojo;

public class User {
private String uname;
private String pwd;
private Integer age;

public User(){}
public User(String uname,String pwd,Integer age){
	this.uname=uname;
	this.pwd=pwd;
	this.age=age;
	
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String toString(){
	return "User[uname"+uname+",pwd="+pwd+",age="+age+"]";
}
}
