package Iterator;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Shijuan3 {
	public static void main(String[] args) {
		int shu=0;//�µĴ���
		
		//����ʱ��
		Date d=new Date();
		//��ʱ��ת��Ϊ����
		long a=d.getTime();
		
		Random ra=new Random();
		int price=ra.nextInt(100);
		
		while(true){
			shu++;
		System.out.println("�����������ļ۸�:");
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		if (price>i) {
			System.out.println("���������С�ˣ�");
		}else if (price<i) {
			System.out.println("������������ˣ�");
		}else if (price==i) {
			System.out.println("��ϲ����¶��ˣ�");
			break;
		}
		}
		//����ʱ��
		Date d1=new Date();
		long a1=d1.getTime();
		System.out.println("�㹲����"+shu+"�Ρ�");
		System.out.println("������"+(a1-a)/1000+"�롣");

	}
}
