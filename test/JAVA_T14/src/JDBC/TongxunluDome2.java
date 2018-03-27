package JDBC;


import java.awt.Container;
import java.util.Vector;

import javax.swing.JFrame;

public class TongxunluDome2 extends JFrame{
	public TongxunluDome2(){
		super("通讯录练习2");
		Container c=new Container();
		//创建标题集合
		Vector<String> ve=new Vector<String>();
		ve.add("姓名：");
		ve.add("号码：");

		//创建表格数据集合
		Vector<String> ve1=new Vector<String>();
		
		
		
		setSize(500, 300);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TongxunluDome2();
	}
}
