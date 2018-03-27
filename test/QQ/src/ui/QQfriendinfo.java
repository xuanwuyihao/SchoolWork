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

import service.IQQUserService;
import sun.text.normalizer.CharTrie.FriendAgent;
import ui.QQMaim.MousetListener;

import bean.QQUser;

import com.sun.org.apache.bcel.internal.generic.LMUL;

public class QQfriendinfo extends JFrame{
	
	//�رմ��ڱ�ǩ
	JLabel close,xiao;
	JPanel z;
	
	
	//����ײ㷽��
	IQQUserService is=new QQUserServiceimp();
	public QQfriendinfo(QQUser friendUser){
		super(friendUser.getUname());
		Container con=getContentPane();
		this.setUndecorated(true);
		//���ô�����ק����
		this.setDragable();
		
		//�������
//		JPanel p=new JPanel();
//		p.setBounds(3, 60, 100, 30);
//		JLabel l1=new JLabel(new ImageIcon("image/zuce.png"));
//		p.add(l1);
//		con.add(p);
		
		
		//�ǳ�
		
//		l2.setForeground(Color.green);
		JLabel uname1=new JLabel(friendUser.getUname());
		uname1.setBounds(50, 60, 60, 30);
		uname1.setFont(new Font("���Ĳ���",Font.BOLD,15));
		con.add(uname1);
		
		
		//�˺�
		
//		l2.setForeground(Color.green);
		JLabel qqnum=new JLabel(friendUser.getQqnum());
		qqnum.setBounds(50, 30, 60, 30);
		qqnum.setFont(new Font("���Ĳ���",Font.BOLD,15));
		con.add(qqnum);
		
		//�Ա�
		
//		l4.setForeground(Color.ORANGE);
		JLabel sex=new JLabel(friendUser.getSex());
		sex.setBounds(50, 150, 60, 30);
		sex.setFont(new Font("���Ĳ���",Font.BOLD,15));
		con.add(sex);
		
		//����
		
		JLabel birthday=new JLabel(friendUser.getBirthday());
		birthday.setBounds(50, 90, 120, 30);
		birthday.setFont(new Font("���Ĳ���",Font.BOLD,15));
		con.add(birthday);
		
		//���ڵ�
		
		JLabel address=new JLabel(friendUser.getAddress());
		address.setBounds(50, 120, 60, 30);
		address.setFont(new Font("���Ĳ���",Font.BOLD,15));
		con.add(address);
		
		
		
		
//		//ע��ͼƬ
//		z=new JPanel();
//		z.setBounds(80, 400, 240, 40);
//		JLabel zc=new JLabel(new ImageIcon("image/zuce1.png"));
//		z.addMouseListener(new MousetListener());
//		z.add(zc);
//		con.add(z);
		
		
		//����С
		xiao=new JLabel(new ImageIcon(""));
		xiao.setBounds(300, 0, 25, 25);
		xiao.addMouseListener(new MousetListener());
		//���ü�ͷΪ����
		xiao.setCursor(new Cursor(Cursor.HAND_CURSOR));
		con.add(xiao);
		
		//�رմ���λ��
		close=new JLabel(new ImageIcon(""));
		close.setBounds(330, 5, 30, 25);
		close.setBackground(Color.red);
		//���ü�ͷΪ����
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MousetListener());
		con.add(close);
		
		
		//����ͼ
		JLabel l=new JLabel(new ImageIcon("image/kan.png"));
		add(l);
		setSize(361,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//�����¼�
	public void focusLost(FocusEvent e){
		
	}
	class MousetListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource()==close) {
				QQfriendinfo.this.dispose();
//				new QQLogin1();
			}else if (e.getSource()==xiao) {
				//�ô��ڻ���С
				QQfriendinfo.this.setExtendedState(QQfriendinfo.this.ICONIFIED);
			}
			
		}
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==close) {
				
				close.setIcon(new ImageIcon("image/downs.png"));
			}
			if (e.getSource()==xiao) {
				xiao.setIcon(new ImageIcon("image/min_over.png"));
			}
			
		}
		public void mouseExited(MouseEvent e) {
			if (e.getSource()==close) {
//				System.out.println("-------");
				close.setIcon(new ImageIcon(""));
			}
			if (e.getSource()==xiao) {
				xiao.setIcon(new ImageIcon(""));
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
				QQfriendinfo.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(java.awt.event.MouseEvent e) {
				tmp = new Point(e.getX(), e.getY());

				isDragged = true;
				QQfriendinfo.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				if (isDragged) {
					loc = new Point(QQfriendinfo.this.getLocation().x + e.getX()
							- tmp.x, QQfriendinfo.this.getLocation().y + e.getY()
							- tmp.y);
					QQfriendinfo.this.setLocation(loc);
				}
			}
		});
	}
}
