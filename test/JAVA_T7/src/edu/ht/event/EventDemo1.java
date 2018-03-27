package edu.ht.event;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class EventDemo1 extends Frame implements ActionListener{
	//在全局重定义组件(事件方法要调用)
	Button enter,cancle;
	
	public  EventDemo1(){
		super("按钮事件例子");
		setLayout(new FlowLayout());
		enter=new Button("确认");
		//授权
		enter.addActionListener(this);
		add(enter);
		
		cancle=new Button("取消");
		//授权
		cancle.addActionListener(this);
		add(cancle);
		
		
		setSize(500,300);
		setBackground(Color.YELLOW);
		setVisible(true);
	}
	public static void main(String[] args) {
		new EventDemo1();
	}


	public void actionPerformed(ActionEvent event) {
		//获取事件源(来去分哪个组件触发的)
		
		if (event.getSource()==  enter){
			//确认
			System.out.print("你点击了确认");
			//JOptionPane.showConfirmDialog(this, "你点击了确认");
			
			
		}else if(event.getSource()==cancle){
			//取消
			System.out.print("你点击了取消");
			System.exit(0);
			
			//JOptionPane.showConfirmDialog(this, "你点击了取消");
			
		}
		
	}
	
	
	

}
