package edu.ht.event;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class EventDemo1 extends Frame implements ActionListener{
	//��ȫ���ض������(�¼�����Ҫ����)
	Button enter,cancle;
	
	public  EventDemo1(){
		super("��ť�¼�����");
		setLayout(new FlowLayout());
		enter=new Button("ȷ��");
		//��Ȩ
		enter.addActionListener(this);
		add(enter);
		
		cancle=new Button("ȡ��");
		//��Ȩ
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
		//��ȡ�¼�Դ(��ȥ���ĸ����������)
		
		if (event.getSource()==  enter){
			//ȷ��
			System.out.print("������ȷ��");
			//JOptionPane.showConfirmDialog(this, "������ȷ��");
			
			
		}else if(event.getSource()==cancle){
			//ȡ��
			System.out.print("������ȡ��");
			System.exit(0);
			
			//JOptionPane.showConfirmDialog(this, "������ȡ��");
			
		}
		
	}
	
	
	

}
