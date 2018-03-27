package 数据结构;

public class duilie {
	
	//循环队列
	private int size;
	private Object[] data;
	private int front;
	private int curr;
	
	
	//初始化
	public duilie(int size){
		this.size=size+1;
		front=0;
		curr=0;
		data=new Object[this.size];
	}
	
	//入队
	public void rudui(Object o){
		if((this.front+1)%size!=this.curr){
			this.front=(this.front+1)%size;
			data[curr]=o;
			System.out.println(o+"入队");
			}else{
				System.out.println("队列已满！");
			}
	}
	
	//出队
	public void chudui(){
		if(this.front==this.curr){
			System.out.println("队列已空！");
		}else{
			this.front=(this.front+1)%size;
			System.out.println(data[front]+"出队！");
			
		}
	}
	
	public static void main(String[] args) {
		duilie dl=new duilie(4);
		dl.rudui("A");
		dl.rudui("B");
		dl.rudui("C");
		dl.rudui("D");
		
		dl.chudui();
	}

}
