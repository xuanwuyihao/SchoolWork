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
	
	//关闭窗口标签
	JLabel close;
	JPanel z;
	//输入框
	JTextField unames,yzm1;
	//密码框
	JPasswordField j2,j3;
	
	//确认按钮
	JButton b;
	
	//账号为空
	JLabel uname0,zm,zms;
	
	//引入底层方法
	IQQUserService is=new QQUserServiceimp();
	public Zhaohuimima(){
		Container con=getContentPane();
		this.setUndecorated(true);
		//调用窗口拖拽方法
		this.setDragable();
		
		
		

		
		//注册图片
		JLabel zc=new JLabel(new ImageIcon("image/zhao.gif"));
		zc.setBounds(2, 40, 468, 60);
		con.add(zc);
		
		//账号
		JLabel uname=new JLabel("账号:");
		uname.setBounds(90, 130, 50, 40);
		uname.setFont(new Font("微软雅黑",Font.BOLD,20));
//		l2.setForeground(Color.green);
		unames=new JTextField();
		//输入框边框颜色
//		unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
////		unames.setEchoChar('●');
		unames.setBounds(150, 138, 150, 25);
		con.add(unames);
		con.add(uname);
		
		//账号为空
		uname0=new JLabel("账号为空！");
		uname0.setBounds(315, 136, 80, 30);
		uname0.setFont(new Font("华文彩云",Font.BOLD,11));
		uname0.setForeground(Color.white);
		con.add(uname0);
		
		//验证码
		JLabel yzm=new JLabel("验证码:");
		yzm.setBounds(90, 180, 90, 40);
		yzm.setFont(new Font("微软雅黑",Font.BOLD,20));
//		l2.setForeground(Color.green);
		yzm1=new JTextField();
//		yzm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
////		unames.setEchoChar('●');
		yzm1.setBounds(200, 188, 100, 25);
		con.add(yzm1);
		con.add(yzm);
		
		//验证码为空
		zm=new JLabel("");
		zm.setBounds(315, 188, 80, 30);
		zm.setFont(new Font("华文彩云",Font.BOLD,11));
		zm.setForeground(Color.RED);
		con.add(zm);
		
		//验证码图片
		JLabel yzm2=new JLabel(new ImageIcon("image/yzm.jpg"));
		yzm2.setBounds(150, 220, 159, 60);
		con.add(yzm2);
		
		
		//确认按钮
		b=new JButton("确认");
		b.setBounds(150, 320, 160, 30);
		b.addMouseListener(new MousetListener());
		con.add(b);
		
		
//		//密码
//		JLabel l2=new JLabel("密码:");
//		l2.setBounds(40, 130, 60, 30);
//		l2.setFont(new Font("华文彩云",Font.BOLD,15));
////		l2.setForeground(Color.green);
//		j2=new JPasswordField();
//		j2.setEchoChar('●');
//		j2.setBounds(110, 130, 190, 25);
//		con.add(j2);
//		con.add(l2);
//		
//		//确认密码
//		JLabel l3=new JLabel("确认密码:");
//		l3.setBounds(30, 170, 120, 30);
//		l3.setFont(new Font("华文中宋",Font.BOLD,15));
////		l3.setForeground(Color.RED);
//		j3=new JPasswordField();
//		j3.setEchoChar('●');
//		j3.setBounds(110, 170, 190, 25);
//		con.add(j3);
//		con.add(l3);
//		
//	
//		//手机号
//		JLabel l7=new JLabel("手机号:");
//		l7.setBounds(50, 330, 120, 30);
//		l7.setFont(new Font("华文彩云",Font.BOLD,15));
//		haoma=new JTextField();
//		haoma.setBounds(110, 330, 190, 25);
//		con.add(haoma);
//		con.add(l7);
//		
		
		//关闭窗口位置
		close=new JLabel();
		close.setBounds(435, 0, 40, 25);
		close.setBackground(Color.red);
		//设置箭头为手型
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MousetListener());
		con.add(close);
		
		
		//背景图
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
//					//验证码错误
//						yzm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 0, 24)));
//						zms.setForeground(Color.red);
//					}else  {
//						yzm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250)));
//						zms.setForeground(Color.white);
//					}
//				}
			}
			
		}
		
	//焦点事件
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
				//昵称为空
				if (name==null||name.equals("")) {
					unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 0, 24)));
					uname0.setForeground(Color.red);
					return;
				}else  {
					unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150)));
					uname0.setForeground(Color.white);
				}
				
				//验证码为空
				if (yzms==null||yzms.equals("")) {
					
					zm.setText("验证码为空！");
					yzm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 0, 24)));
					return;
				}
				//验证码错误
				if (!yzms.equals("2907")) {
					yzm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 0, 24)));
					zm.setText("验证码错误！");
				}else{
					yzm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150)));
					zm.setText("");
				}
				
				//将对象保存到数据库中
				
				
				
				new Zhaohuimima1();
				Zhaohuimima.this.dispose();
			}
			
		}
	}
	
	//窗口拖动

	/** ******** */
	// 设置界面可以拖动的方法
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
