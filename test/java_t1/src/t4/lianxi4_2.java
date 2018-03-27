package t4;

public class lianxi4_2 {
	public static void main(String[] args){
		lianxi4_1 t1=new lianxi4_1();
		t1.a=10;	//public
		t1.b=20;	//protected
		t1.c=30;	//默认
		
		//通过封装的访问对私有的变量进行赋值
		//调用方法赋值
		t1.setD(50);
		
		
		//取值
		System.out.print("d的值是："+t1.getD());
		
	}
}
