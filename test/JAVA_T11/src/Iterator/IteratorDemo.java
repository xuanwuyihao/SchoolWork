package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//ʹ��Iterator������
public class IteratorDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		
		c.add("hello");
		c.add("world");
		
		Iterator it=c.iterator();
		
//		Object next();  ���ص�������һ��Ԫ��
		System.out.print(it.hasNext());
		
	}

}
