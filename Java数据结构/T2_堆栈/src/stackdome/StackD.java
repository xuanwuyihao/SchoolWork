package stackdome;

public class StackD {
	stackLink head=new stackLink();
	
	//入栈
	public void ruzhan(String name){
		stackLink curr=head;
		stackLink newLink=new stackLink(name);
		newLink.setNext(curr.getNext());
		curr.setNext(newLink);
	}
/*	//入栈
	public void ruzhan(String name){
		stackLink curr=head;
		stackLink newLink=new stackLink(name);
		newLink.setNext(curr.getNext());
		curr.setNext(newLink);
		
	}*/
	
	//出栈
	public void chuzhan(){
		stackLink curr=head;
		if(curr.getNext()!=null){
			System.out.println("你要出栈的元素是："+curr.getNext().getName());
			curr.setNext(curr.getNext().getNext());
		}else{
			System.out.println("没有出栈元素！");
		}
	}
	
/*	//出栈
	public void chuzhan(){
		stackLink curr=head;
		if(curr.getNext()!=null){
			System.out.println("你要出栈的元素是："+curr.getNext().getName());
			curr.setNext(curr.getNext().getNext());
		}else{
			System.out.println("没有出栈元素!");
		}
	}*/
	
	//查出堆栈中的元素
	public void display(){
		stackLink curr=head;
		while(true){
			if(curr.getNext()!=null){
				System.out.println("数据有："+curr.getNext().getName());
			}else{
				System.out.println("里面没有元素！");
				break;
			}
			curr=curr.getNext();
		}
	}
	
	/*//查出堆栈中的元素
	public void display(){
		stackLink curr=head;
		while(true){
		if(curr.getNext()!=null){
			System.out.println("要查找的数据有："+curr.getNext().getName());
		}else{
			System.out.println("没找到要查找的数据！");
			break;
		}
		curr=curr.getNext();
		}
	}*/
	
	//判断是否为空
	public boolean isEmpty(){
		boolean bl=true;
		stackLink curr=head;
		if(curr.getNext()!=null){
			return false;
		}
		return bl;
	}
	
	/*//判断是否为空
	public boolean isEmpty(){
		boolean bl=true;
		stackLink curr=head;
		if(curr.getNext()!=null){
			return false;
		}
		return bl;
	}*/
	
	//指定查找
	public int search(String name){
		stackLink curr=head;
		int i=0;
		while(true){
			i++;
			if(curr.getNext()!=null){
				if(curr.getNext().getName().equals(name)){
					return i;
					
				}
			}else{
				break;
			}
			curr=curr.getNext();
			
		}
		return i;
	}
	
	/*//查找指定元素
	public int search(String name){
		int i=0;
		stackLink curr=head;
		while(true){
			if(curr.getNext()!=null){
				if(curr.getNext().getName().equals(name)){
					return i;
					
				}
			}else{
				break;
			}
			curr=curr.getNext();
		}
		return i;
		
	}*/
	
	//栈顶元素
	public void peek(){
		stackLink curr=head;
		if(curr.getNext()!=null){
			System.out.println("栈顶元素为："+curr.getNext().getName());
		}
	}
	
	/*//栈顶元素
	public void peek(){
		stackLink curr=head;
		if(curr.getNext()!=null){
			System.out.println("栈顶元素为："+curr.getNext().getName());
		}
	}*/
	
	
	public static void main(String[] args)
	{
		StackD sd=new StackD();
		sd.ruzhan("A");
		sd.ruzhan("B");
		sd.ruzhan("C");
		sd.ruzhan("D");
		//sd.chuzhan();
		sd.peek();
		
		
		System.out.println("你要查找的元素是第"+sd.search("C")+"个");
		sd.display();
	}
}
