package edu.ht.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Color;

import java.awt.TextField;

public class computer extends Frame{
	public computer(){
		super("�����");
		
		//ȡ������
		setLayout(null);
		
		TextField unametext=new TextField();
		unametext.setBounds(90,70,300,21);
		add(unametext);
		
		//������壬���񲼾�
		Panel p=new Panel();
		p.setLayout(new GridLayout(4,4,5,5));
		//p.setBackground(Color.YELLOW);
		p.setBounds(60,110,360,230);
		
		//������мӰ�ť
		String str="789*456/123-0.=+";
		
		for (int i = 0; i < str.length(); i++) {
			//�ַ�����ȡ����substring
			System.out.print(str.substring(i,i+1));
			Button b=new Button(str.substring(i,i+1));
			//�����а�ť��Ӽ��
			
			p.add(b);
		}
		add(p);
		
		
		
		setSize(500,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new computer();
	}
}
