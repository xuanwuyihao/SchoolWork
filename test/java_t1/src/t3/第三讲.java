package t3;

public class 第三讲 {
public static void main(String[] args) {
	//对象：类的对象、类的实例 我们使用对象而不是实例
	//对象的实例化 就是去new 一个类
	
	//对象的声明
	//第三讲  类   p1  对象
	第三讲1 p1;
	
	//声明时初始化类
	第三讲1 p2 = new 第三讲1();
	
	//给对象的成员变量赋值
	//对象名.成员变量名
	p2.name = "小邱";
	p2.age  = 20;
	p2.city  = "赣州";
	System.out.print("p2的名字是:"+p2.name+"\tp2的年龄是:"+p2.age+"\tp2的籍贯是"+p2.city);
	
	//先声明后初始化
	p1 = new 第三讲1();
	p1.name="小何";
	p1.age=20;
	p1.city="赣州";
	System.out.print("\np1的名字是:"+p1.name+"\tp1的年龄是:"+p1.age+"\tp1的籍贯是"+p1.city);
	
	//------------------------------------------------------------------------------------------
	//对象的比较
	第三讲1 p3=new 第三讲1();
	p3.name="小黄";
	第三讲1 p4=new 第三讲1();
	p4.name="小曾";
	第三讲1 p5=p3;
	p5.name="小刘";
	
	System.out.print("\n"+p3.name);
	System.out.print("\n"+(p3==p4));
	System.out.print("\n"+p3.equals(p4));
	
	//---------------------------------------------------------------------------------------
	//测试类变量和实例变量
	第三讲1 p6=new 第三讲1();
	p6.age=21;//实例变量（每个对象私有的）
	p6.money=10000;//类变量（所有对象共享的）
	
	第三讲1 p7=new 第三讲1();
	p7.age=22;//实例变量（每个对象私有的）
	p7.money=30000;//类变量（所有对象共享的）
	
	System.out.print("\np6的名字是:"+p6.name+"\tp6的年龄是:"+p6.age+"\tp6的籍贯是"+p6.money);
	System.out.print("\np7的名字是:"+p7.name+"\tp7的年龄是:"+p7.age+"\tp7的籍贯是"+p7.money);
	
	
	//========================================================================
	//常量
	第三讲1 p8 = new 第三讲1();
	//p8.EIGHT=182;常量不能改变
	System.out.print("\n"+p8.HEIGHT);
	
	//类中方法的调用方式
	//对象名.方法名称
	第三讲1 p9 = new 第三讲1();
	p9.sleep();//通过对象调用类中无参的方法
	p9.set("逸浩");//通过对象调用类中有参的方法
	String ganmename= p9.game();//通过对象调用类中无参有返回值的方法
	System.out.println("逸浩 "+ganmename);
	
	//调用实例方法和类方法
	//实例方法只能过对象名.实例方法名 调用
	p9.sleep();
	
	//类方法可以通过对象名.类方法名 或 类名.类方法名
	p9.run();
	
	//====================================================================================
	//构造方法的使用
	//使用构造方法设置和获取对象中的参数
	第三讲1 p10 = new 第三讲1("张三",23);
	p10.age=18;
	System.out.print("\n姓名是："+p10.name+"\t年龄是："+p10.age);
	
	
	
	
	
	
	
	
	
	
}
}
