package 数据结构;

public class Stak {
	
	stackLink sl=new stackLink();
	
	
	//入栈
	public void ruzhan(String name){
		stackLink curr=sl;
		stackLink stl=new stackLink(name);
		stl.setNext(curr.getNext());
		curr.setNext(stl);
	}
	
	//出栈
	public void chuzhan(){
		stackLink curr=sl;
		if(curr.getNext()!=null){
			System.out.println("出栈元素为"+curr.getNext().getName());
			curr.setNext(curr.getNext().getNext());
		}else{
			System.out.println("出栈元素为空！");
		}
	}
	
	
	public static void main(String[] args) {
		Stak st=new Stak();
		st.ruzhan("A");
		st.ruzhan("B");
		st.ruzhan("C");
		st.ruzhan("D");
		
		st.chuzhan();
	}

}
