package t1;

import java.util.Scanner;


public class lianxi {
	public static void main(String[] args){
		//1�������������������������е������
		System.out.print("�������һ��������");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.print("������ڶ���������");
		Scanner scan1 = new Scanner(System.in);
		int b = scan1.nextInt();
		System.out.print("�����������������");
		Scanner scan2 = new Scanner(System.in);
		int c = scan2.nextInt();
		
		if(a<b?true:false){
			
			if(c<b?true:false){
				System.out.print("�����Ϊ��"+b);
			}else{
				System.out.print("�����Ϊ��"+c);
			}
		}else{
			if(c<a?true:false){
				System.out.print("�����Ϊ��"+a);
			}else{
				System.out.print("�����Ϊ��"+c);
			}
		}
		
		
		
		
	}

}
