package Link;

public class Link {
	//数据域
	private String name;
	//链域
	private Link next;
	public Link(){}
	public Link(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Link getNext() {
		return next;
	}
	public void setNext(Link next) {
		this.next = next;
	}
	

}
