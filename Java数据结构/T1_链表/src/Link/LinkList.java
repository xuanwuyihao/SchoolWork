package Link;

import java.util.LinkedList;

public class LinkList {
	public static void main(String[] args) {
		LinkedList ls=new LinkedList();
		ls.add("A");
		ls.add("B");
		ls.add("C");
		ls.add("D");
		ls.add("E");
		ls.addLast("V");
		ls.addFirst("K");
		for(int i=0;i<ls.size();i++){
			System.out.println("������"+ls.get(i));
		}
	}
}
