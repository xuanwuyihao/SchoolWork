package Iterator;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Shijuan3 {
	public static void main(String[] args) {
		int shu=0;//猜的次数
		
		//所用时间
		Date d=new Date();
		//将时间转换为毫秒
		long a=d.getTime();
		
		Random ra=new Random();
		int price=ra.nextInt(100);
		
		while(true){
			shu++;
		System.out.println("请输入你猜想的价格:");
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		if (price>i) {
			System.out.println("你输入的数小了！");
		}else if (price<i) {
			System.out.println("你输入的数大了！");
		}else if (price==i) {
			System.out.println("恭喜，你猜对了！");
			break;
		}
		}
		//结束时间
		Date d1=new Date();
		long a1=d1.getTime();
		System.out.println("你共用了"+shu+"次。");
		System.out.println("共用了"+(a1-a)/1000+"秒。");

	}
}
