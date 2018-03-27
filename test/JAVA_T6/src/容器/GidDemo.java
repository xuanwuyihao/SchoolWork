package 容器;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Color;

public class GidDemo extends Frame{
	public GidDemo(){
		super("网格布局");
		
		//设置网格布局
		setLayout(new GridLayout(5,5,10,20));
		
		//设置按钮
		Button b1=new Button("按钮1");
		Button b2=new Button("按钮2");
		Button b3=new Button("按钮3");
		Button b4=new Button("按钮4");
		Button b5=new Button("按钮5");
		Button b6=new Button("按钮6");
		Button b7=new Button("按钮7");
		
		//将网格布局添加到容器中
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		
		setSize(300,500);
		setBackground(Color.BLUE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		GidDemo g = new GidDemo();
	}

}
