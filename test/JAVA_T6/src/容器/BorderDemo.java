package ����;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderDemo extends Frame {
	public BorderDemo(){
		
		super("����������ϰ");
		
		//���ñ߿򲼾�
		setLayout(new BorderLayout());
		
		
		
		Button b1=new Button("��ť1");
		Button b2=new Button("��ť2");
		Button b3=new Button("��ť3");
		Button b4=new Button("��ť4");
		Button b5=new Button("��ť5");
		
		//����ť��ӵ�������
		add(b1,BorderLayout.NORTH);//��
		add(b2,BorderLayout.SOUTH);//��
		add(b3,BorderLayout.WEST);//��
		add(b4,BorderLayout.EAST);//��
		add(b5,BorderLayout.CENTER);//��
		
		setSize(300,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		BorderDemo b=new BorderDemo();
	}

}
