package bean;

import java.io.Serializable;

public class QQUser implements Serializable{
	private int id;//id
	private String qqnum;//�˺�
	private String uname;//����
	private String pwd;//����
	private String sex;//�Ա�
	private int eag;//����
	private String birthday;//����
	private String address;//����
	private String haoma;//����
	private String face;//ͷ��
	private int status;//״̬0������1������2������3��æµ4���������
	private int leves;//�ȼ�
	private String qm;//ǩ��
	private String ip;//ip
	private String port;//�˿�
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
