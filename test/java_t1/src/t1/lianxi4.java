package t1;

import java.util.Scanner;

public class lianxi4 {
	public static void main(String[] args){
		//4������һ����λ�������������ÿһλ֮����Ͽո�����
		System.out.print("������һ����λ����");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int x,y,z,j,q,k;
		k=a/10000%10;//��λ
		x=a/1000%10;//ǧλ
		y=a/100%10;//��λ
		z=a/10%10;//ʮλ
		q=a%10;//��λ
		
		System.out.print(k+" "+x+" "+y+" "+z+" "+q+" ");
		
	}
}

	


