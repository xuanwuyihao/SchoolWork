package t1;

import java.util.Random;
import java.util.Scanner;

public class lianxi6 {
	public static void main(String[] agrs){
		/*
		//6��дһ����������Ϸ���ȵõ�һ��100���ڵ����������Ȼ��ѭ�����û��������֣�
		 * ���������̫���̫С��Ҫ������ʾ��ֱ���û�����������һ����������
	��εõ�һ��100���ڵ��������
		//���������
		Random ran=new Random();
		//0-99
		int num=ran.nextInt(100);//numΪҪ�õ�����
		*/
		int a;
		Random ran=new Random();
		int num=ran.nextInt(100);//numΪҪ�õ�����
		System.out.print(num);
		
		
	
		Scanner scan = new Scanner(System.in);
	
	
		do{
			System.out.print("������һ���������Ƿ��ܲ��У�");
		
		    a = scan.nextInt();
			if(a<num){
				System.out.println("���������̫С�ˣ�");
			}
			if(a>num){
					System.out.println("���������̫���ˣ�");
			}
		
			
		}while(a!=num);
		
		System.out.print("��ϲ��¶��ˣ�");
		
		
			
		
			
		
		
	}
}