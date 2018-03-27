package edu.ht.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ComputerExampie extends Frame implements ActionListener{
	TextField te;
	String s1="",s2="";
	String czf="";
	public ComputerExampie(){
		super("��������ϰ");
		setLayout(null);
		//��������
		te=new TextField();
		te.setBounds(120, 50, 250, 30);
		Font f=new Font("����",Font.BOLD,25);
		te.setFont(f);
		add(te);
		
		//�������
		Panel p=new Panel();
		//��������������񲼾�
		p.setLayout(new GridLayout(4,4,3,3));
		p.setBounds(100, 90, 290, 270);
		//������мӰ�ť
		String str="789/456*123-0.=+";
		//�����ַ�����ȡ������ȡ�ַ�
		for (int i = 0; i < str.length(); i++) {
			//�ַ�����ȡ����substring(��ʼ�±�,�����±�);
			System.out.print(str.substring(i,i+1));
			Button b=new Button(str.substring(i,i+1));
			//����ť��Ӽ���
			b.addActionListener(this);
			p.add(b);
			
		}
		
		//p.setBackground(Color.BLUE);
		add(p);
		
		
		//���ڼ���
		addWindowListener(new ClossWindow());
		setSize(500,400);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ComputerExampie();
	}
	class ClossWindow extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//��ȡ��������(����ͨ������������ȡ�¼�Դ)
		String str =e.getActionCommand();
		//���ַ����л�ȡĳһ���±���ַ�
		char c=str.charAt(0);
		System.out.print(str+" "+c);
		if ((c >='0'&&c<='9')||c=='.') {//�ж��Ƿ�������
			//�����������.�Ͳ����ؼ�С������
			if (c=='.') {
				if (czf.equals("")) {
					if (s1.indexOf(".")>-1) {
						return;
					}
					
				}else {//�ڶ���������
					if (s2.indexOf(".")>-1) {
						return;
					}
					
				}
				
			}
			//���ܵڶ���������
			if (!czf.equals("")) {//����в�����
				s2+=c;
				te.setText(s2);
				return;
			}
			//���յ�һ��������
			s1+=c;
			
		}
		
	}

}
