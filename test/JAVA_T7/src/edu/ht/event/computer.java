package edu.ht.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Color;

import java.awt.TextField;

public class computer extends Frame{
	public computer(){
		super("计算机");
		
		//取消布局
		setLayout(null);
		
		TextField unametext=new TextField();
		unametext.setBounds(90,70,300,21);
		add(unametext);
		
		//设置面板，网格布局
		Panel p=new Panel();
		p.setLayout(new GridLayout(4,4,5,5));
		//p.setBackground(Color.YELLOW);
		p.setBounds(60,110,360,230);
		
		//在面板中加按钮
		String str="789*456/123-0.=+";
		
		for (int i = 0; i < str.length(); i++) {
			//字符串截取函数substring
			System.out.print(str.substring(i,i+1));
			Button b=new Button(str.substring(i,i+1));
			//给所有按钮添加监控
			
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
