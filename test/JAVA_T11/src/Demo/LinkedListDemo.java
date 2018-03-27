package Demo;

import java.util.LinkedList;

public class LinkedListDemo {
/**
* LinkedList的特有功能：
* 	添加功能：
* 			addFirst(object e)
* 			addLast(object e)
* 	获取功能：
* 			getFirst(object e)
* 			getLast(object e)
* 	删除功能：
* 			removeFirst(object e)
* 			rcmoveLast(object e)
*/
	public static void main(String[] args) {
		LinkedList<String> li=new LinkedList<String>();
		
		li.add("小宁");
		li.add("小张");
		
		li.addFirst("小邱");
		li.addLast("小张");
		li.addLast("小何");
		li.removeLast();
		
		for (String s:li) {
			System.out.println(s);
			
		}
	}

}
