package t4;



public class lianxi4_3 {
	//���е��ڲ���
	
	//1.Inner������outer�ڲ�����ġ�
	//��Inner���п��Է���outer���еĳ�Ա����outer_r;
	//��outer���п��ڷ���test()�д����ڲ���Inner�Ķ���
	//ͨ��outer��Ķ������test()�������վͿ���ִ��Inner���еķ���
	
	int out_i=10;
	static int age=20;
	
	//void test(){
		//����ⲿ�෽��Ҫ�����ڲ��෽���ĳ�Ա  ��ʵ�����ڲ���
	//	Inner inn =new Inner();
	//}
	
	//Inner �ڲ���
	class Inner{
		//in_i���ڲ���ľֲ�����
		
		int in_i =20;
		
		//�ڲ���ķ���
		void display(){
			System.out.print("�ⲿ���еı�����"+ out_i);
		}
		
		
		
		//2 static �ڲ���======================================
		//static�ڲ��������һ����ͨ�ⲿ��һ��ֱ�Ӵ����ö���
		//static�ڲ���ֻ�ܷ����ⲿ���еľ�̬��Ա�򷽷�������̬ static���ε�)
		//static�ڲ����������static��Ա������static���ڲ��಻���ԡ�
		//���η�û���κ����ơ�
		//static class Inner_static{
			
		//}
	}
}
