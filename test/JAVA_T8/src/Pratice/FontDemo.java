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
		super("字体设置");
		
		setLayout(new FlowLayout());
		//实例化字体类
		Font f=new Font("宋体",Font.BOLD,30);
		
		//添加按钮
		Button b=new Button("确认");
		add(b);
		b.setFont(f);
		b.setForeground(Color.BLUE);
		
		//添加文本框
		TextField t=new TextField();
		t.setColumns(20);//流布局中用Columns设置文本框的长度
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
