package t1;

import java.util.Random;
import java.util.Scanner;

public class lianxi6 {
	public static void main(String[] agrs){
		/*
		//6、写一个猜数字游戏，先得到一个100以内的随机整数，然后循环让用户输入数字，
		 * 输入的数字太大或太小都要给予提示，直到用户输入和随机数一样的数结束
	如何得到一个100以内的随机数？
		//随机数的类
		Random ran=new Random();
		//0-99
		int num=ran.nextInt(100);//num为要得到的数
		*/
		int a;
		Random ran=new Random();
		int num=ran.nextInt(100);//num为要得到的数
		System.out.print(num);
		
		
	
		Scanner scan = new Scanner(System.in);
	
	
		do{
			System.out.print("请输入一个数看看是否能猜中：");
		
		    a = scan.nextInt();
			if(a<num){
				System.out.println("你输入的数太小了！");
			}
			if(a>num){
					System.out.println("你输入的数太大了！");
			}
		
			
		}while(a!=num);
		
		System.out.print("恭喜你猜对了！");
		
		
			
		
			
		
		
	}
}
