package t4;



public class lianxi4_3 {
	//类中的内部类
	
	//1.Inner类是在outer内部定义的。
	//在Inner类中可以访问outer类中的成员属性outer_r;
	//在outer类中可在方法test()中创建内部类Inner的对象；
	//通过outer类的对象调用test()方法最终就可以执行Inner类中的方法
	
	int out_i=10;
	static int age=20;
	
	//void test(){
		//如果外部类方法要访问内部类方法的成员  先实例化内部类
	//	Inner inn =new Inner();
	//}
	
	//Inner 内部类
	class Inner{
		//in_i是内部类的局部变量
		
		int in_i =20;
		
		//内部类的方法
		void display(){
			System.out.print("外部类中的变量："+ out_i);
		}
		
		
		
		//2 static 内部类======================================
		//static内部类可以像一个普通外部类一样直接创建该对象。
		//static内部类只能访问外部类中的静态成员或方法。（静态 static修饰的)
		//static内部类可以声明static成员，但非static的内部类不可以。
		//修饰符没有任何限制。
		//static class Inner_static{
			
		//}
	}
}
