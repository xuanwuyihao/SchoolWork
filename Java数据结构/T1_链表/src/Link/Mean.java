package Link;

public class Mean {
	Link node;
	//初始化
	public Mean(){
		node=new Link();
	}
	//新增一个节点
	public void addNode(String name){
		//初始化头
		Link head=node;
		if(head.getNext()!=null){
			new Link(name);
		}
	}
	
	public void addManyNode(String name){
		//初始化节点
		Link head=node;
		Link newCode=new Link(name);
		while(true){
			if(head.getNext()==null){
				head.setNext(newCode);
				System.out.println("新增多个节点"+head.getNext().getName());
				break;
			}
			head=head.getNext();
		}
	}
	
/*	//新增多个节点
	public void addManyNode(String name){
		Link head=node;
		Link newCode=new Link(name);
		while(true){
			if(head.getNext()!=null){
				head.setNext(newCode);
				System.out.println("新增多个节点"+head.getNext().getName());
				break;
			}
			head=head.getNext();
		}
		
	}*/
	//插入一个节点
	public void insertNode(int i,String name){
		Link head=node;
		Link temp=null;
		Link newNode=new Link(name);
		for(int j=0;j<i;j++){
			temp=head;
			head=head.getNext();
		}
		//第一步
		newNode.setNext(temp.getNext());
		//第二步
		temp.setNext(newNode);
	}
	//插入一个节点
/*	public void insertNode(int i,String name){
		//初始化
		Link head=node;
		Link temp=null;
		Link newNode=new Link(name);
		for(int j=0;j<i;j++){
			temp=head;
			head=head.getNext();
		}
		//第一步
		newNode.setNext(temp.getNext());
		//第二步
		temp.setNext(newNode);
		
	}*/
	
	//新增节点
	public void addNodeOne(String name){
		//找到当前节点
		Link curr=node;
		//构造新节点
		Link nodeNew=new Link(name);
		//新增节点
		while(true){
			if(curr.getNext()==null){
				curr.setNext(nodeNew);
				break;
			}
			//把当前节点的下一个节点赋给当前节点
			curr=curr.getNext();
		}
		
	}
	public void dispaly(){
		//初始化
		Link curr=node.getNext();
		while(curr!=null){
			System.out.println("当期节点是"+curr.getName());
			curr=curr.getNext();
		}
		
	}
	public void deleNode(int i){
		Link head=node;
		Link temp=null;
		for(int j=0;j<i;j++){
			temp=head;
			head=head.getNext();
		}
		temp.setNext(temp.getNext().getNext());
	}
	
	//删除第二种
	public void deleteNodeTow(int i){
		Link curr=node;
		for(int j=0;j<i;j++){
			curr=curr.getNext();
		}
		curr.setNext(curr.getNext().getNext());
	}
	
	public String selectCode(String name){
		Link curr=node.getNext();
		int i=0;
		while(true){
			if(curr!=null){
				if(curr.getName().equals(name)){
					System.out.println("你要查找的是："+i);
					break;
				}
				curr=curr.getNext();
				i++;
			}else{
				System.out.println("你要查找的不存在！");
				break;
			}
		}
		return null;
	}
	
	public void dispalyOne(){
		Link curr=node.getNext();
		while(curr!=null){
			System.out.println(curr.getName()+"看见了"+curr.getNext().getName()+"-----");
			curr=curr.getNext();
		}
		
	}
}
