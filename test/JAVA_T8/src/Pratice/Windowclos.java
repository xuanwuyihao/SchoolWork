package Pratice;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;





public class Windowclos extends java.awt.Frame implements WindowListener{
	JLabel la,la2;
	TextField t;
	JPasswordField jp;
	Panel p3;
	public Windowclos(){
		
		
		setLayout(null);
		//����ͼƬ
		Toolkit tk=Toolkit.getDefaultToolkit();
		//�õ�ͼƬ����
		Image img=tk.getImage("MyImage/tubiao.png");
		//��ͼƬ����
		setIconImage(img);
		
		//��ͼƬ�ڴ�������ʾ
		Panel p=new Panel();
		
		p.setLayout(new FlowLayout());
		//p.setBackground(Color.BLUE);
		
		ImageIcon image=new ImageIcon("MYImage/north.gif");
		JLabel jl=new JLabel(image);
		//jl.setBounds(100,30,200,100);
		p.setBounds(0,0,450,210);
		p.add(jl);
		add(p);
		addWindowListener(this);
		
		
		
		
		
		
		//�������
		Panel p1=new Panel();
		//setLayout(null);
		p1.setLayout(new BorderLayout());
		
		ImageIcon inage=new ImageIcon("MyImage/tupian0.jpg");
		JLabel jlb=new JLabel(inage);
		p1.setBounds(45,215,80,80);
		p1.add(jlb);
		add(p1);
		addWindowListener(this);
		
		//�����
		t=new TextField();
		t.setFont(new Font("����",Font.BOLD,20));
		t.setBounds(130,220,200,30);
		add(t);
		jp=new JPasswordField();
		jp.setFont(new Font("Dialoglnput",Font.BOLD,12));
		jp.setEchoChar('��');
		jp.setBounds(130,250,200,30);
		add(jp);
		
		//��ǩ
		la=new JLabel("ע���˺�");
//		lt1.setForeground(new Color(60, 157, 255));// ʹ��RBG������ɫ
		la.setForeground(new Color(60,157,255));
		la.setBounds(342, 225, 60, 20);
		la.addMouseListener(new MyMouseListener());
		add(la);
		
		la2=new JLabel("�һ�����");
		la2.setForeground(new Color(60,157,255));
		la2.setBounds(342, 255, 60, 20);
		la2.addMouseListener(new MyMouseListener());
		add(la2);
		
		
		
		
		
		Label la3=new Label("��ס����");
		la3.setBounds(150, 285, 60, 20);
		JCheckBox j1=new JCheckBox();
		j1.setBounds(130, 285, 20, 20);
		add(j1);
		add(la3);
		
		Label la5=new Label("�Զ���¼");
		la5.setBounds(280, 285, 60, 20);
		JCheckBox j2=new JCheckBox();
		j2.setBounds(260, 285, 20, 20);
		add(j2);
		add(la5);
		
		//��¼��ť
		ImageIcon img1 =new ImageIcon("MyImage/Logo2.png");
		JLabel jb=new JLabel(img1);
		jb.setBounds(130, 315, 200, 30);
		add(jb);
		
		//�������
		Panel p2=new Panel();
		//setLayout(null);
		p2.setLayout(new BorderLayout());
		
		ImageIcon ig=new ImageIcon("MyImage/erweima1.png");
		JLabel jbe=new JLabel(ig);
		//p2.setBackground(Color.BLUE);
		p2.setBounds(416,326,25,25);
		p2.add(jbe);
		add(p2);
		//addWindowListener(this);
		
		//�������
		p3=new Panel();
		//setLayout(null);
		p3.setLayout(new BorderLayout());
		
		ImageIcon ige=new ImageIcon("MyImage/more1.png");
		JLabel jbel=new JLabel(ige);
		//p2.setBackground(Color.BLUE);
		p3.addKeyListener(new MykeyListener());
		p3.setBounds(12,328,25,25);
		p3.add(jbel);
		
		add(p3);
		
		
		
		setSize(450,360);
		setLocationRelativeTo(null);
		//setBackground(Color.white);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Windowclos();
	}
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		this.dispose();
	}
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	class MyMouseListener implements MouseListener{

		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		//��������¼�
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==la) {
				la.setForeground(Color.GRAY);
			}
			if (e.getSource()==la2) {
				la2.setForeground(Color.GRAY);
			}
			
		}
		//����Ƴ��¼�
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==la) {
				la.setForeground(new Color(60,157,255));
			}
			if (e.getSource()==la2) {
				la2.setForeground(new Color(60,157,255));
			}
		}

		//������¼�
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==la) {
				JOptionPane.showConfirmDialog(null, "����ת��.....");
				new Zhuce();
			}else if (e.getSource()==la2) {
				JOptionPane.showConfirmDialog(null, "���ڼ���.....");
			}
			
		}

		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class MyActionListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==t) {
				if (t==null||"".equals(t)) {
					JOptionPane.showConfirmDialog(null, "�������˺ţ�");
					return;
					
				}
				
			}
		}
		
	}
	
	class MykeyListener implements KeyListener{

		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		//��ť�ɿ��¼�
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==p3) {
				if (t==null||"".equals(t)) {
					JOptionPane.showConfirmDialog(null, "�������˺ţ�");
					return;
					
				}
				
			}
		}

		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
