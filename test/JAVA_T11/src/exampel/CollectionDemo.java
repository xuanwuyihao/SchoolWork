package exampel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合和数组的区别：
 * 			1、数组的长度是固定的，集合的长度是可变的。
 * 			2、数组只能储存一种数据、而集合可以存储多种数据。
 * 			3、数组可以存储基本类型、也可以存储引用数据类型、集合只可以存储引用数据类型
 * 		
 * 集合的功能：
 * 			1、添加
 * 			boolean add(object obj)  添加一个元素
 * 			boolean addAll(Collection c)  添加一个集合的元素
 * 			2、移除
 * 			void clear()  移除所用元素
 * 			boolean remove(object obj)  移除一个元素
 * 			3、获取
 * 			Iterator Iterator()
 * 			4、判断
 * 			boolean isEmpty()  判断集合是否为空
 * 			boolean containsAll(collection c)  判断是否包含一个集合的元素
 * 			5、获取大小
 * 			int size()  获取集合的大小
 * 			6、转换为数组
 * 			object toArray()
 * 
 * 
 * @author Administrator
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		
		//添加元素
		c.add("hello");
		c.add("world");
		c.add("逸浩");
		
		
		//移除所有元素
//		c.clear();
		
		//移除指定元素
//		System.out.println(c.remove("world"));
		
		//判断集合是否为空
		System.out.println(c.isEmpty());
		
		//获取集合的大小
		System.out.println(c.size());
		
		//转换为数组
		Object[] obj=c.toArray();
		
//		for (int i = 0; i < obj.length; i++) {
//			String s=(String)obj[i];
//			
//		}
		
		Collection c1=new ArrayList();
		c1.add("hello");
		c1.add("good");
		
		
		//添加一个集合的元素
		c1.addAll(c);
		
		//判断是否包含一个集合的元素
		System.out.println("是否包含"+c1.contains(c));
		
		
		System.out.println(c1);
		System.out.println(c);
	}
	

}
