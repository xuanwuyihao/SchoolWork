package Demo;

import java.util.LinkedList;

public class LinkedListDemo {
/**
* LinkedList�����й��ܣ�
* 	��ӹ��ܣ�
* 			addFirst(object e)
* 			addLast(object e)
* 	��ȡ���ܣ�
* 			getFirst(object e)
* 			getLast(object e)
* 	ɾ�����ܣ�
* 			removeFirst(object e)
* 			rcmoveLast(object e)
*/
	public static void main(String[] args) {
		LinkedList<String> li=new LinkedList<String>();
		
		li.add("С��");
		li.add("С��");
		
		li.addFirst("С��");
		li.addLast("С��");
		li.addLast("С��");
		li.removeLast();
		
		for (String s:li) {
			System.out.println(s);
			
		}
	}

}
