package t5;

public abstract class lianxi5_1 {

	//抽象类
	//1、用abstract修饰的类叫抽象类
	//2、用abstract修饰的方法叫抽象方法
	//3、抽象方法只能声明不能定义具体业务
	//4、抽象类中可已有不同方法
	//5、抽象类可以没有抽象方法，但是有抽象方法的类必须定义成抽象类
	//6、抽象类不能直接new初始化 通过实例化继承他的子类来使用
	//7、继承抽象类的子类 须要重写父类的所有抽象方法
	
	
		public int xx=10;
		
		
		//抽象方法
		public abstract void sleep();
		
		public abstract void play();
		
		public void eat(){
			System.out.print("又要吃饭了、、、");
		}

		public void xx() {
			// TODO Auto-generated method stub
			
		}
		
	}

