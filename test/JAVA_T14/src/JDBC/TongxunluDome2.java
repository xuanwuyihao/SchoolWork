package JDBC;


import java.awt.Container;
import java.util.Vector;

import javax.swing.JFrame;

public class TongxunluDome2 extends JFrame{
	public TongxunluDome2(){
		super("ͨѶ¼��ϰ2");
		Container c=new Container();
		//�������⼯��
		Vector<String> ve=new Vector<String>();
		ve.add("������");
		ve.add("���룺");

		//����������ݼ���
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
