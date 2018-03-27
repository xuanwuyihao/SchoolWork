package t5;

public interface lianxi5_3 {

	//接口
	//1、接口用interface关键字定义
	//2、接口类中的所有方法默认都是抽象的（abstract）的、公共（public）的
	//3、接口不能有自定义方法
	//4、接口不能直接实例化
	//5、实现（implements）接口的子类必须重写接口的所有方法
	//6、接口中的变量默认是静态（static）常量（final）
	//7、类中不能多重继承的，但接口可以多重实现，实现接口使用逗号分开
	//8、类不能继承接口 但接口可以继承接口
	//9、一个类可以同时继承类和实现接口（顺序是：先继承 再实现）
	
	//类  继承（extends） 类
	//接口  继承（extends） 接口
	//类  实现（implements） 接口
	
	public interface Ihuman{
		//静态常量
		public int tt=20;
		
		//抽象方法
		public void study();
		
		public void read();
		
	}
	
}
