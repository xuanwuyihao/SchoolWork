package 容器;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderDemo extends Frame {
	public BorderDemo(){
		
		super("这是容器练习");
		
		//设置边框布局
		setLayout(new BorderLayout());
		
		
		
		Button b1=new Button("按钮1");
		Button b2=new Button("按钮2");
		Button b3=new Button("按钮3");
		Button b4=new Button("按钮4");
		Button b5=new Button("按钮5");
		
		//将按钮添加到容器中
		add(b1,BorderLayout.NORTH);//北
		add(b2,BorderLayout.SOUTH);//南
		add(b3,BorderLayout.WEST);//西
		add(b4,BorderLayout.EAST);//东
		add(b5,BorderLayout.CENTER);//中
		
		setSize(300,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		BorderDemo b=new BorderDemo();
	}

}
