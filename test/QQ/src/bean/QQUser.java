package bean;

import java.io.Serializable;

public class QQUser implements Serializable{
	private int id;//id
	private String qqnum;//账号
	private String uname;//网名
	private String pwd;//密码
	private String sex;//性别
	private int eag;//年龄
	private String birthday;//生日
	private String address;//地区
	private String haoma;//号码
	private String face;//头像
	private int status;//状态0、离线1、在线2、隐身3、忙碌4、请勿打扰
	private int leves;//等级
	private String qm;//签名
	private String ip;//ip
	private String port;//端口
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHaoma() {
		return haoma;
	}
	public void setHaoma(String haoma) {
		this.haoma = haoma;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int satus) {
		this.status = satus;
	}
	public int getLeves() {
		return leves;
	}
	public void setLeves(int leves) {
		this.leves = leves;
	}
	public String getQm() {
		return qm;
	}
	public void setQm(String qm) {
		this.qm = qm;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}


	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getQqnum() {
		return qqnum;
	}
	public void setQqnum(String qqunum) {
		this.qqnum = qqunum;
	}
	public int getEag() {
		return eag;
	}
	public void setEag(int eag) {
		this.eag = eag;
	}
}
