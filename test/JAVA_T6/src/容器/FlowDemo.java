package ����;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Color;

public class FlowDemo extends Frame{
	public FlowDemo(){
		super("���̲���");
		
		//�������̲���
		setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
		
		Button b1 =new Button("��ť1");
		Button b2 =new Button("��ť2");
		Button b3 =new Button("��ť3");
		Button b4 =new Button("��ť4");
		Button b5 =new Button("��ť5");
		Button b6 =new Button("��ť6");
		
		//��������ӵ�������
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		

		setSize(300,500);
		setBackground(Color.BLUE);
		setVisible(true);
	}
	public static void main(String[] args) {
		FlowDemo f=new FlowDemo();
	}

}
