package ����;

import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Color;


public class CardDemo extends Frame {
		public CardDemo(){
			super("��Ƭ����");
			
			//���ÿ�Ƭ����
			CardLayout ca=new CardLayout(); 
			setLayout(ca);
			
			//�������
			
			Panel p  = new Panel();
			p.setBackground(Color.blue);
			
			Panel p1  = new Panel();
			p1.setBackground(Color.yellow);
			
			Panel p2  = new Panel();
			p2.setBackground(Color.DARK_GRAY);
			
			//�������ӵ�������
			add(p,"a");
			add(p1,"b");
			add(p2,"c");
			
			//����Ҫ��ʾ�������Ĭ�ϵ�һ����
			ca.show(this,"b");
			
			setSize(300,500);
			setBackground(Color.WHITE);
			setVisible(true);
			
		}
		public static void main(String[] args) {
			CardDemo c=new CardDemo();
		}
	
}
