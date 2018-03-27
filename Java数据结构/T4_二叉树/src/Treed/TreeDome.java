package Treed;

public class TreeDome {
	Node root;
	
	public TreeDome(person person){
		root=new Node(person);
	}
	
	//构建一颗二叉树
	public void createTree(Node root,person person){
		//判断当前节点是否大于根节点
		if(person.getId()>root.getPerson().getId()){
			if(root.getRightChold()==null){
				root.setRightChold(new Node(person));
			}else{
				this.createTree(root.getRightChold(), person);
			}
		}else{
			if(root.getLeftChold()==null){
				root.setLeftChold(new Node(person));
			}else{
				this.createTree(root.getLeftChold(), person);
			}
		}
	}
	
	//二叉树先根遍历
	public void display(Node node){
		
		if(node.getLeftChold()!=null){
			this.display(node.getLeftChold());
		}
		System.out.println(node.getPerson().getName());
		if(node.getRightChold()!=null){
			this.display(node.getRightChold());
		}
		
	}
	
	//查找二叉树的最大值
	int max;
	public int Max(Node node){
		if(node!=null){
			if(node.getPerson().getId()>=max){
				max=node.getPerson().getId();
			}
			if(node.getRightChold()!=null){
				this.Max(node.getRightChold());
			}
		}
		return max;
	}
	
	//查找二叉树中最大数（方法二）
	int sum=0;
	public int Maxs(Node node){
		//先判断根节点不为null
		if(node!=null){
			if(node.getRightChold()!=null){
				sum=root.getRightChold().getPerson().getId();
				
			}else{
				sum=root.getPerson().getId();
				return sum;
			}
			
		}
		return sum;
	}
	
	//查最小二叉树的值
	int min=99999;
	public int min(Node node){
		if(node!=null){
			if(node.getPerson().getId()<=min){
				min=node.getPerson().getId();
			}
			if(node.getLeftChold()!=null){
				this.min(node.getLeftChold());
			}
		}
		return min;
	}
	
	
	//查询id对应的name
	public Node findNode(int id,Node node){
		Node root=null;
		if(node!=null){
			if(id==node.getPerson().getId()){
				return node;
			}
			if(id>node.getPerson().getId()){
				if(node.getRightChold()!=null){
					root=this.findNode(id, node.getRightChold());
				}
			}else{
				if(node.getLeftChold()!=null){
					root=this.findNode(id, node.getLeftChold());
				}
				
			}
		}else{
			System.out.println("你要查找的不存在！");
		}
		return root;
	}
	
	//求节点总数
	int total=0;
	public int totalNode(Node node){
		if(node!=null){
			if(node.getLeftChold()!=null){
				total++;
				this.totalNode(node.getLeftChold());
			}
			if(node.getRightChold()!=null){
				total++;
				this.totalNode(node.getRightChold());
			}
		}else{
			return 0;
		}
		return total;
	}
	
	
	//求二叉树的高度
	public int hight(Node node){
		if(node==null){
			return 0;
		}else{
			if(hight(node.getRightChold())>hight(node.getLeftChold())){
				return hight(node.getRightChold())+1;
			}else{
				return hight(node.getLeftChold())+1;
			}
		}
	}
	
	public static void main(String[] args) {
		TreeDome td=new TreeDome(new person(5,"5678"));
		Node head=td.root;
		
		td.createTree(head,new person(3,"3333"));
		td.createTree(head,new person(7,"7777"));
		td.createTree(head,new person(2,"2222"));
		td.createTree(head,new person(4,"4444"));
		td.createTree(head,new person(8,"8888"));
		
		//遍历节点
		td.display(head);
		//查找二叉树中最大数
		System.out.println("二叉树中最大数为："+td.Max(head));
		//查找二叉树中最小值
		System.out.println("二叉树中最小值为："+td.min(head));
		//查询二叉树的总结数
		System.out.println("二叉树的总结数为："+td.totalNode(head));
		//查询二叉树的高度
		System.out.println("二叉树的高度为："+td.hight(head));
	}
}
