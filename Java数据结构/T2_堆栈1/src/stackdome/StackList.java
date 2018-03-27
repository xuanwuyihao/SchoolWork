package stackdome;

import java.util.Stack;

public class StackList {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("A");
		stack.push("B");
		System.out.println("你要查找的是"+stack.search("A"));
		//出栈
		stack.pop();
		
		System.out.println("去顶元素是："+stack.peek());
		for(int i=0;i<=stack.size();i++){
			System.out.println("里面有元素："+stack.pop());
		}
	}

}
