package stackdome;

public class StackFile {
	
	//链表堆栈
	
	
	
	//指针指向
	private int top=-1;
	//存储大小
	private int size;
	//保存的内容
	private Object[] data;
	
	//无参
	public StackFile(){
		
		this.size=size;
		this.data=new Object[this.size];
	}
	//有参
	public StackFile(int size){
		this.size=size;
		data=new Object[this.size];
		
	}
	
/*	//有参
	public StacckFile(int size){
		this.size=size;
		data=new Object[this.size];
	}
*/
	
	//入栈操作
	public void push(Object o){
		if(top<size-1){
			top++;
			data[top]=o;
			System.out.println(o+"");
		}else{
			System.out.println("堆栈已满！");
		}
	}
	
	/*//入栈操作
	public void push(Object o){
		if(top<size-1){
			top++;
			data[top]=o;
			System.out.println(o+"");
		}else{
			System.out.println("堆栈已满！");
		}
	}*/
	
	//出栈操作
	public Object pop(){
		Object object;
		if(top>-1){
			object =data[top];
			top--;
			return object;
		}else{
			return null;
		}
	}
	
	/*//出栈操作
	public object pop(){
		object object;
		if(top>-1){
			object =data[top];
			top--;
			return object;
		}else{
			return null;
		}
	}*/
	
	//判断是否为空
	public boolean isEmpty(){
		boolean bln=true;
		if(top>-1){
			return false;
		}
		return bln;
	}
	
	//循环堆栈中的数据
	public void display(){
		if(!isEmpty()){
			for(int i=0;i<=top;i++){
				System.out.println("堆栈中的数据有："+data[i]);
			}
		}else{
			System.out.println("堆栈中没有数据！");
		}
	}
	
	//查找堆栈中的第几个数
	public int search(Object o){
		if(!isEmpty()){
			for(int i=0;i<top;i++){
				if(data[i].equals(o)){
					return i;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		StackFile sf=new StackFile();
		sf.push("组长");
		sf.push("经理");
		sf.push("副总");
		sf.push("董事长");
		
		//堆栈出数据
		sf.pop();
		System.out.println("你要查找的数据是"+sf.search("c"));
		sf.display();
	}
}
