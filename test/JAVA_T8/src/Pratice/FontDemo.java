package Pratice;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FontDemo extends java.awt.Frame{
	public FontDemo(){
		super("��������");
		
		setLayout(new FlowLayout());
		//ʵ����������
		Font f=new Font("����",Font.BOLD,30);
		
		//��Ӱ�ť
		Button b=new Button("ȷ��");
		add(b);
		b.setFont(f);
		b.setForeground(Color.BLUE);
		
		//����ı���
		TextField t=new TextField();
		t.setColumns(20);//����������Columns�����ı���ĳ���
		add(t);
		t.setFont(f);
		
		addWindowListener(new CloseWindow());
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FontDemo();
	}
	class CloseWindow extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	}
}
