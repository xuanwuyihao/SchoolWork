package MapDemo;

public class Student {
	private String name;
	private int eag;
	
	public Student(String name,int eag){
		super();
		this.eag=eag;
		this.name=name;
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


	public Student(){}

}
