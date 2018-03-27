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
	
	//�رմ��ڱ�ǩ
	JLabel close,qe;
	JPanel z;
	
	JLabel bzl;
	
	QQUser user;
	
//	//����ײ㷽��
//	IQQUserService is=new QQUserServiceimp();
	public ziliao(QQUser user){
		this.user=user;
		Container con=getContentPane();
		this.setUndecorated(true);
		
		//���ô�����ק����
		this.setDragable();
		
		//�������
		JPanel p=new JPanel();
		p.setBounds(3, 60, 100, 30);
		//���ڵ�
		JLabel l1=new JLabel(user.getQqnum());
		l1.setBounds(400, 32, 50, 25);
		l1.setFont(new Font("���Ĳ���",Font.BOLD,15));
//		JTextField address=new JTextField(user.getAddress());
//		address.setBounds(60, 150, 300, 25);
//		con.add(address);
		con.add(l1);
		
		
		//���ڵ�
		JLabel l2=new JLabel(user.getUname());
		l2.setBounds(400, 62, 50, 25);
		l2.setFont(new Font("���Ĳ���",Font.BOLD,15));
//		JTextField address=new JTextField(user.getAddress());
//		address.setBounds(60, 150, 300, 25);
//		con.add(address);
		con.add(l2);
		
		
		//���ڵ�
		bzl=new JLabel("");
		bzl.setBounds(640, 40, 60, 20);
		bzl.setFont(new Font("���Ĳ���",Font.BOLD,10));
//		JTextField address=new JTextField(user.getAddress());
//		address.setBounds(60, 150, 300, 25);
//		con.add(address);
		//���ü�ͷΪ����
		bzl.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bzl.addMouseListener(new MousetListener());
		con.add(bzl);
		
		//ͷ��
		JLabel l3=new JLabel(new ImageIcon(user.getFace()));
		l3.setBounds(60, 404, 65, 65);
//		l3.setFont(new Font("���Ĳ���",Font.BOLD,15));
//		JTextField address=new JTextField(user.getAddress());
//		address.setBounds(60, 150, 300, 25);
//		con.add(address);
		con.add(l3);
		
		
		//�رմ���λ��
		close=new JLabel();
		close.setBounds(690, 5, 40, 25);
		close.setBackground(Color.red);
		close.addMouseListener(new MousetListener());
		//���ü�ͷΪ����
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		con.add(close);
		
		
		//����ͼ
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
