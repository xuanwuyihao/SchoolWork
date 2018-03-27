package Bean;

public class Userbean{
	private int id;
	private String uname;
	private int age;
	private boolean marry;
	private String[] aihao;
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
	public boolean isMarry() {
		return marry;
	}
	public void setMarry(boolean marry) {
		this.marry = marry;
	}
	public String[] getAihao() {
		return aihao;
	}
	public void setAihao(String[] aihao) {
		this.aihao = aihao;
	}
	
	//数据可以提供一些带索引的方法
	//根据下标取值
	public String getAihao(int index){
		return aihao[index];
	
	}
	
	public void setAihao(int index,String value ){
		aihao[index]=value;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
