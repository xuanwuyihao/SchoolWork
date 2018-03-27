package 数据结构;

public class stackLink {
	private String name;
	//链域
	private stackLink next;
	//初始化
	public stackLink(){
		
	}
	public stackLink(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public stackLink getNext() {
		return next;
	}
	public void setNext(stackLink next) {
		this.next = next;
	}

}
