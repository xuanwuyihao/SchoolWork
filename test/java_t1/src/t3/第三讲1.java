package t3;

public class 第三讲1 {
//成员变量
	//实例变量
	String name;//名字
	int age;//年龄
	String city;//籍贯
	boolean marry;//是否已婚
	
	
	//类变量
	static int money;
	
	//常量
	final int HEIGHT=180;
	
	//方法
	//修饰符 返回值类型（void为空）sleep方法名称
	//无参的方法
	
	//实例方法
	public void sleep(){
		System.out.print("爱情好苦");
	}
	
	//有参的方法
	public void set(String name){
		System.out.print("love xxxxxxxxx");
	}
	
	//有返回值
	public String game(){
		return "xx喜欢逸浩";
	}
	
	//类方法
	public void run(){
		
	}
public void pescon(){
		
	}

//空构造方法
public 第三讲1(){
	
}

//有参数的构造方法
public 第三讲1(String name,int age){
	this.name=name;
	this.age=age;
}
	
	
}
