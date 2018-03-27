package t1;

import java.util.Scanner;

public class lianxi4 {
	public static void main(String[] args){
		//4、输入一个五位数，在这个数的每一位之间加上空格后输出
		System.out.print("请输入一个五位数：");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int x,y,z,j,q,k;
		k=a/10000%10;//万位
		x=a/1000%10;//千位
		y=a/100%10;//百位
		z=a/10%10;//十位
		q=a%10;//个位
		
		System.out.print(k+" "+x+" "+y+" "+z+" "+q+" ");
		
	}
}

	


