package Demo;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {
	public static void main(String[] args) {
	//泛型使用
	ArrayList<String> a1=new ArrayList<String>();
	
	a1.add("小明");
	a1.add("小陈");
	
	Iterator<String> it=a1.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	}
	

}
