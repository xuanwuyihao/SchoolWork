package t1;

import java.util.Scanner;


public class lianxi {
	public static void main(String[] args){
		//1、输入三个整数，求三个数中的最大数
		System.out.print("请输入第一个整数：");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.print("请输入第二个整数：");
		Scanner scan1 = new Scanner(System.in);
		int b = scan1.nextInt();
		System.out.print("请输入第三个整数：");
		Scanner scan2 = new Scanner(System.in);
		int c = scan2.nextInt();
		
		if(a<b?true:false){
			
			if(c<b?true:false){
				System.out.print("最大数为："+b);
			}else{
				System.out.print("最大数为："+c);
			}
		}else{
			if(c<a?true:false){
				System.out.print("最大数为："+a);
			}else{
				System.out.print("最大数为："+c);
			}
		}
		
		
		
		
	}

}
