package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//使用Iterator迭代器
public class IteratorDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		
		c.add("hello");
		c.add("world");
		
		Iterator it=c.iterator();
		
//		Object next();  返回迭代的下一个元素
		System.out.print(it.hasNext());
		
	}

}
