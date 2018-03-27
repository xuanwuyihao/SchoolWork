package Queue;

public class circulateDome {
	
	//循环队列
	
	private int size;
	private Object[] data;
	private int front;
	private int rear;
	
	//初始化
	public circulateDome(int size){
		this.size=size+1;
		front=0;
		rear=0;
		data=new Object[this.size];
	}
	
	//入队
	public void QueueDom(Object o){
		if((this.front+1)%size!=this.rear){
			this.front=(this.front+1)%size;
			data[rear]=o;
			System.out.println(o+"入队");
		}else{
			System.out.println("列队已满！");
		}
	}
	
	/*//入队
	public void QueueDome(Object o){
		if((this.rear+1)%size!=this.front){
			this.rear=(this.rear+1)%size;
			data[size]=o;
			System.out.println(o+"入队");
		}else{
			System.out.println("列队已满！");
		}
	}*/
	
	//判断是否为空
	public boolean isEmpty(){
		boolean bl=true;
		if(this.front==this.rear){
			return false;
		}
		return bl;
	}
	
	//出队
	public void Queueout(){
		if(isEmpty()){
			this.front=(this.front+1)%size;
			System.out.println(data[front]+"出队");
		}else{
			System.out.println("列队已空");
		}
	}
	
	/*	//出队
		public void Queueoutput(){
			if(this.front=(this.front+1)%size){
				this.front=(this.front+1)%size;
				System.out.println(data[front]+"出队");
			}else{
				System.out.println("列队已空！");
			}
		}*/
	
	//查
	public void disply(){
		for (int i =front+1; i <size; i++) {
			System.out.println("里面有数据"+data[i]);
		}
	}
	//查，可以利用处队的方式查，出一个表示查到一个。以上查询方法有很大问题。
		
		
	public static void main(String[] args) {
		circulateDome cd=new circulateDome(3);
		cd.QueueDom("A");
		cd.QueueDom("B");
		cd.QueueDom("C");
		
		
		cd.Queueout();
		cd.QueueDom("C");
		cd.disply();

	}
		
		
}
