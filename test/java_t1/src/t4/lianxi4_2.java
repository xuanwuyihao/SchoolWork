package t4;

public class lianxi4_2 {
	public static void main(String[] args){
		lianxi4_1 t1=new lianxi4_1();
		t1.a=10;	//public
		t1.b=20;	//protected
		t1.c=30;	//Ĭ��
		
		//ͨ����װ�ķ��ʶ�˽�еı������и�ֵ
		//���÷�����ֵ
		t1.setD(50);
		
		
		//ȡֵ
		System.out.print("d��ֵ�ǣ�"+t1.getD());
		
	}
}
