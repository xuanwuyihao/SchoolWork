package Demo;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {
	public static void main(String[] args) {
	//����ʹ��
	ArrayList<String> a1=new ArrayList<String>();
	
	a1.add("С��");
	a1.add("С��");
	
	Iterator<String> it=a1.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	}
	

}
