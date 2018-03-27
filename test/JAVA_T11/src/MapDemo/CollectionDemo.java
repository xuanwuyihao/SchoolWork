package MapDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



//Collection:集合的工具类，提供了许多对集合操作的方法
public class CollectionDemo {
	public static void main(String[] args) {
		//在指定列表的指定位置切换元素
		List<String> li=new ArrayList<String>();
		
		li.add("小曾");
		li.add("小刘");
		li.add("小汪");
		li.add("小陈");
		
		Collections.swap(li, 1, 2);
		System.out.println(li);
		
	}

}
