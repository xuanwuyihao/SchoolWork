package Queue;

public class lineardome {

	//线性队列
	private int size;
	private Object[] data;
	private int front;
	private int rear;

	

	//初始化参数
	public lineardome(int size){
		this.size=size;
		data=new Object[this.size];
		//指针
		front=-1;
		rear=-1;
	}
	
	
	//入队
	public void linearinput(Object o){
		if(rear<size-1){
			rear++;
			data[rear]=o;
			System.out.println(o+"入队");
		}else{
			System.out.println("列队已满！");
		}
	}
	
	//入队
	/*public void linearinput(Object o){
		if(rear<size-1){
			rear++;
			data[rear]=o;
			System.out.println(o+"入队");
		}else{
			System.out.println("列队已满！");
		}*/
	
	//出队
	public void linearout(){
		if(front!=rear){
			front++;
			System.out.println(data[front]+"出队");
		}else{
			System.out.println("列队中没有数据！");
		}
	}
	
	/*//出队
	public void linearout(){
		if(front!=rear){
			front++;
			System.out.println(data[front]+"出队");
		}else{
			System.out.println("列队中没有数据了！");
		}
	}*/
	
	//查数据
	public void disply(){
		for(int i=front+1;i<rear+1;i++){
			System.out.println("列队中有数据："+data[i]);
		}
	}
	
	public static void main(String[] args) {
		lineardome ld=new lineardome(3);
		ld.linearinput("A");
		ld.linearinput("B");
		ld.linearinput("C");
		ld.linearinput("D");
		
		//出队
		ld.linearout();
		ld.disply();
		
	}
}
