package ui;

import impl.QQUserServiceimp;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import service.IQQUserService;

import bean.QQUser;

import com.sun.org.apache.bcel.internal.generic.LMUL;

public class ziliao extends JFrame{
	
	//关闭窗口标签
	JLabel close,qe;
	JPanel z;
	
	JLabel bzl;
	
	QQUser user;
	
//	//引入底层方法
//	IQQUserService is=new QQUserServiceimp();
	public ziliao(QQUser user){
		this.user=user;
		Container con=getContentPane();
		this.setUndecorated(true);
		
		//调用窗口拖拽方法
		this.setDragable();
		
		//创建面板
		JPanel p=new JPanel();
		p.setBounds(3, 60, 100, 30);
		//所在地
		JLabel l1=new JLabel(user.getQqnum());
		l1.setBounds(400, 32, 50, 25);
		l1.setFont(new Font("华文彩云",Font.BOLD,15));
//		JTextField address=new JTextField(user.getAddress());
//		address.setBounds(60, 150, 300, 25);
//		con.add(address);
		con.add(l1);
		
		
		//所在地
		JLabel l2=new JLabel(user.getUname());
		l2.setBounds(400, 62, 50, 25);
		l2.setFont(new Font("华文彩云",Font.BOLD,15));
//		JTextField address=new JTextField(user.getAddress());
//		address.setBounds(60, 150, 300, 25);
//		con.add(address);
		con.add(l2);
		
		
		//所在地
		bzl=new JLabel("");
		bzl.setBounds(640, 40, 60, 20);
		bzl.setFont(new Font("华文彩云",Font.BOLD,10));
//		JTextField address=new JTextField(user.getAddress());
//		address.setBounds(60, 150, 300, 25);
//		con.add(address);
		//设置箭头为手型
		bzl.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bzl.addMouseListener(new MousetListener());
		con.add(bzl);
		
		//头像
		JLabel l3=new JLabel(new ImageIcon(user.getFace()));
		l3.setBounds(60, 404, 65, 65);
//		l3.setFont(new Font("华文彩云",Font.BOLD,15));
//		JTextField address=new JTextField(user.getAddress());
//		address.setBounds(60, 150, 300, 25);
//		con.add(address);
		con.add(l3);
		
		
		//关闭窗口位置
		close=new JLabel();
		close.setBounds(690, 5, 40, 25);
		close.setBackground(Color.red);
		close.addMouseListener(new MousetListener());
		//设置箭头为手型
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		con.add(close);
		
		
		//背景图
		JLabel l=new JLabel(new ImageIcon("image/ziliao.png"));
		add(l);
		setSize(722,520);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	class MousetListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource()==close) {
				ziliao.this.dispose();
			}
			if (e.getSource()==bzl) {
				ziliao.this.dispose();
				new QQUPdinof(user);
			}
		}
		public void mouseEntered(MouseEvent e){
			if (e.getSource()==close) {
				close.setIcon(new ImageIcon("image/downs.png"));
			}
		}
		
		public void mouseExited(MouseEvent e) {
			if (e.getSource()==close) {
				close.setIcon(new ImageIcon(""));
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
				ziliao.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(java.awt.event.MouseEvent e) {
				tmp = new Point(e.getX(), e.getY());

				isDragged = true;
				ziliao.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				if (isDragged) {
					loc = new Point(ziliao.this.getLocation().x + e.getX()
							- tmp.x, ziliao.this.getLocation().y + e.getY()
							- tmp.y);
					ziliao.this.setLocation(loc);
				}
			}
		});
	}

	
}
