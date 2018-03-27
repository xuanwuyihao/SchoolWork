package 容器;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Color;

public class FlowDemo extends Frame{
	public FlowDemo(){
		super("流程布局");
		
		//设置流程布局
		setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
		
		Button b1 =new Button("按钮1");
		Button b2 =new Button("按钮2");
		Button b3 =new Button("按钮3");
		Button b4 =new Button("按钮4");
		Button b5 =new Button("按钮5");
		Button b6 =new Button("按钮6");
		
		//将布局添加到容器中
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
