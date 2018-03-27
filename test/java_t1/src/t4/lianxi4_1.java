package t4;

public class lianxi4_1 {
	//成员变量
	//public 公有的，同包的类
	//protected 受保护的，同包的类
	//默认的，同包的类
	//private 私有的只能是类本身
	public int a;
	protected int b;
	int c;
	private int d;
	
	
	//一封装：如何访问私有变量
	//1.设置一个公共的设置或取值方法
	//2.方法名setAge()  getAge()变量名首字母大写
	
	//设置（将传来的值保存到私有的全局变量）
	public void setD(int d){
		this.d=d;
	}
	
	//取值
	public int getD (){
	return d;	
	}
	
}
