package ui;

import impl.QQUserServiceimp;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import service.IQQUserService;
import ui.QQRec.MousetListener;

import bean.QQUser;

import com.sun.org.apache.bcel.internal.generic.LMUL;

public class Zhaohuimima extends JFrame{
	
	//�رմ��ڱ�ǩ
	JLabel close;
	JPanel z;
	//�����
	JTextField unames,yzm1;
	//�����
	JPasswordField j2,j3;
	
	//ȷ�ϰ�ť
	JButton b;
	
	//�˺�Ϊ��
	JLabel uname0,zm,zms;
	
	//����ײ㷽��
	IQQUserService is=new QQUserServiceimp();
	public Zhaohuimima(){
		Container con=getContentPane();
		this.setUndecorated(true);
		//���ô�����ק����
		this.setDragable();
		
		
		

		
		//ע��ͼƬ
		JLabel zc=new JLabel(new ImageIcon("image/zhao.gif"));
		zc.setBounds(2, 40, 468, 60);
		con.add(zc);
		
		//�˺�
		JLabel uname=new JLabel("�˺�:");
		uname.setBounds(90, 130, 50, 40);
		uname.setFont(new Font("΢���ź�",Font.BOLD,20));
//		l2.setForeground(Color.green);
		unames=new JTextField();
		//�����߿���ɫ
//		unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
////		unames.setEchoChar('��');
		unames.setBounds(150, 138, 150, 25);
		con.add(unames);
		con.add(uname);
		
		//�˺�Ϊ��
		uname0=new JLabel("�˺�Ϊ�գ�");
		uname0.setBounds(315, 136, 80, 30);
		uname0.setFont(new Font("���Ĳ���",Font.BOLD,11));
		uname0.setForeground(Color.white);
		con.add(uname0);
		
		//��֤��
		JLabel yzm=new JLabel("��֤��:");
		yzm.setBounds(90, 180, 90, 40);
		yzm.setFont(new Font("΢���ź�",Font.BOLD,20));
//		l2.setForeground(Color.green);
		yzm1=new JTextField();
//		yzm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
////		unames.setEchoChar('��');
		yzm1.setBounds(200, 188, 100, 25);
		con.add(yzm1);
		con.add(yzm);
		
		//��֤��Ϊ��
		zm=new JLabel("");
		zm.setBounds(315, 188, 80, 30);
		zm.setFont(new Font("���Ĳ���",Font.BOLD,11));
		zm.setForeground(Color.RED);
		con.add(zm);
		
		//��֤��ͼƬ
		JLabel yzm2=new JLabel(new ImageIcon("image/yzm.jpg"));
		yzm2.setBounds(150, 220, 159, 60);
		con.add(yzm2);
		
		
		//ȷ�ϰ�ť
		b=new JButton("ȷ��");
		b.setBounds(150, 320, 160, 30);
		b.addMouseListener(new MousetListener());
		con.add(b);
		
		
//		//����
//		JLabel l2=new JLabel("����:");
//		l2.setBounds(40, 130, 60, 30);
//		l2.setFont(new Font("���Ĳ���",Font.BOLD,15));
////		l2.setForeground(Color.green);
//		j2=new JPasswordField();
//		j2.setEchoChar('��');
//		j2.setBounds(110, 130, 190, 25);
//		con.add(j2);
//		con.add(l2);
//		
//		//ȷ������
//		JLabel l3=new JLabel("ȷ������:");
//		l3.setBounds(30, 170, 120, 30);
//		l3.setFont(new Font("��������",Font.BOLD,15));
////		l3.setForeground(Color.RED);
//		j3=new JPasswordField();
//		j3.setEchoChar('��');
//		j3.setBounds(110, 170, 190, 25);
//		con.add(j3);
//		con.add(l3);
//		
//	
//		//�ֻ���
//		JLabel l7=new JLabel("�ֻ���:");
//		l7.setBounds(50, 330, 120, 30);
//		l7.setFont(new Font("���Ĳ���",Font.BOLD,15));
//		haoma=new JTextField();
//		haoma.setBounds(110, 330, 190, 25);
//		con.add(haoma);
//		con.add(l7);
//		
		
		//�رմ���λ��
		close=new JLabel();
		close.setBounds(435, 0, 40, 25);
		close.setBackground(Color.red);
		//���ü�ͷΪ����
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MousetListener());
		con.add(close);
		
		
		//����ͼ
		JLabel l=new JLabel(new ImageIcon("image/zhaohuimima.png"));
		add(l);
		setSize(474,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Zhaohuimima();
	}
	
	class MyActionListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
//			if (e.getSource()==b) {
//				String yzms=yzm1.getText();
//				if (yzms!="2907") {
//					//��֤�����
//						yzm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 0, 24)));
//						zms.setForeground(Color.red);
//					}else  {
//						yzm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250)));
//						zms.setForeground(Color.white);
//					}
//				}
			}
			
		}
		
	//�����¼�
	public void focusLost(FocusEvent e){
		
	}
	class MousetListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource()==close) {
				Zhaohuimima.this.dispose();
				new QQLogin1();
				
			}
			if (e.getSource()==b) {
				String name=unames.getText();
				String yzms=yzm1.getText();
				//�ǳ�Ϊ��
				if (name==null||name.equals("")) {
					unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 0, 24)));
					uname0.setForeground(Color.red);
					return;
				}else  {
					unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150)));
					uname0.setForeground(Color.white);
				}
				
				//��֤��Ϊ��
				if (yzms==null||yzms.equals("")) {
					
					zm.setText("��֤��Ϊ�գ�");
					yzm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 0, 24)));
					return;
				}
				//��֤�����
				if (!yzms.equals("2907")) {
					yzm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 0, 24)));
					zm.setText("��֤�����");
				}else{
					yzm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150)));
					zm.setText("");
				}
				
				//�����󱣴浽���ݿ���
				
				
				
				new Zhaohuimima1();
				Zhaohuimima.this.dispose();
			}
			
		}
	}
	
	//�����϶�

	/** ******** */
	// ���ý�������϶��ķ���
	Point loc = null;
	Point tmp = null;
	boolean isDragged = false;

	private void setDragable() {
		this.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent e) {
				isDragged = false;
				Zhaohuimima.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(java.awt.event.MouseEvent e) {
				tmp = new Point(e.getX(), e.getY());

				isDragged = true;
				Zhaohuimima.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				if (isDragged) {
					loc = new Point(Zhaohuimima.this.getLocation().x + e.getX()
							- tmp.x, Zhaohuimima.this.getLocation().y + e.getY()
							- tmp.y);
					Zhaohuimima.this.setLocation(loc);
				}
			}
		});
	}
}
