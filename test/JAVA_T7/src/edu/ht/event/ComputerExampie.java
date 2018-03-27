package edu.ht.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ComputerExampie extends Frame implements ActionListener{
	TextField te;
	String s1="",s2="";
	String czf="";
	public ComputerExampie(){
		super("计算器练习");
		setLayout(null);
		//添加输入框
		te=new TextField();
		te.setBounds(120, 50, 250, 30);
		Font f=new Font("宋体",Font.BOLD,25);
		te.setFont(f);
		add(te);
		
		//设置面板
		Panel p=new Panel();
		//在面板中设置网格布局
		p.setLayout(new GridLayout(4,4,3,3));
		p.setBounds(100, 90, 290, 270);
		//在面板中加按钮
		String str="789/456*123-0.=+";
		//利用字符串截取函数获取字符
		for (int i = 0; i < str.length(); i++) {
			//字符串截取函数substring(开始下标,结束下标);
			System.out.print(str.substring(i,i+1));
			Button b=new Button(str.substring(i,i+1));
			//给按钮添加监听
			b.addActionListener(this);
			p.add(b);
			
		}
		
		//p.setBackground(Color.BLUE);
		add(p);
		
		
		//窗口监听
		addWindowListener(new ClossWindow());
		setSize(500,400);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ComputerExampie();
	}
	class ClossWindow extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//获取按键内容(可以通过此内容来获取事件源)
		String str =e.getActionCommand();
		//从字符串中获取某一个下标的字符
		char c=str.charAt(0);
		System.out.print(str+" "+c);
		if ((c >='0'&&c<='9')||c=='.') {//判断是否是数字
			//如果操作中有.就不能载加小数点了
			if (c=='.') {
				if (czf.equals("")) {
					if (s1.indexOf(".")>-1) {
						return;
					}
					
				}else {//第二个操作符
					if (s2.indexOf(".")>-1) {
						return;
					}
					
				}
				
			}
			//接受第二个操作数
			if (!czf.equals("")) {//如果有操作符
				s2+=c;
				te.setText(s2);
				return;
			}
			//接收第一个操作数
			s1+=c;
			
		}
		
	}

}
