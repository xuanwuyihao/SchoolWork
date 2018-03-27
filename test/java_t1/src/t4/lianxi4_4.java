package t4;

public class lianxi4_4 {
	static int a;
	
	static class A{
		int b;
		public void a() {
			System.out.println("aaaaaaaaaaaaaa");
		}
	}
	class B{
		
		int b;
		public void b() {
			System.out.println("bbbbbbbbbbbbbb");
		}
	}
	
	public static void main(String[] args){
		A a = new A();
		a.a();
		lianxi4_4 l = new lianxi4_4();
		l.bbb();
	}
	public void bbb() {
		B b  = new B(); 
		b.b();
	}
}
