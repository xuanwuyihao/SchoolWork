package 容器;

import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Color;


public class CardDemo extends Frame {
		public CardDemo(){
			super("卡片布局");
			
			//设置卡片布局
			CardLayout ca=new CardLayout(); 
			setLayout(ca);
			
			//创建面板
			
			Panel p  = new Panel();
			p.setBackground(Color.blue);
			
			Panel p1  = new Panel();
			p1.setBackground(Color.yellow);
			
			Panel p2  = new Panel();
			p2.setBackground(Color.DARK_GRAY);
			
			//将面板添加到容器中
			add(p,"a");
			add(p1,"b");
			add(p2,"c");
			
			//设置要显示的组件（默认第一个）
			ca.show(this,"b");
			
			setSize(300,500);
			setBackground(Color.WHITE);
			setVisible(true);
			
		}
		public static void main(String[] args) {
			CardDemo c=new CardDemo();
		}
	
}
