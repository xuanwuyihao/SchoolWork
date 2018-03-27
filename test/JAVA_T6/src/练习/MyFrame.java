package 练习;

import java.awt.Color;
import java.awt.Frame;


public class MyFrame {
	public static void main(String[] args) {
		Frame f = new Frame("窗口");
		
		//设置标题
		f.setTitle("这是窗口");
		
		//取消窗口布局
		f.setLayout(null);
		
		
		
		
		
		
		
		
		//设置窗口颜色
		f.setBackground(Color.PINK);
		//设置窗口大小
		f.setSize(300,500);
		//设置窗口可见
		f.setVisible(true);
		
	}

}
