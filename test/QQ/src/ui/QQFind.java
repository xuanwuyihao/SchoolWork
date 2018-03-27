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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import service.IQQUserService;

import bean.QQMsg;
import bean.QQUser;

import com.sun.org.apache.bcel.internal.generic.LMUL;
import common.Contents;
import common.Msgsend;

public class QQFind extends JFrame{
	
	//关闭窗口标签
	JLabel clos,xiao;
	//文本域
	JTextPane review,send;
	
	JTextField t,t1,t2;
	
	//表格模型
	DefaultTableModel dm=new DefaultTableModel();
	
	//表格
	JTable table;
	
	JComboBox sexs;
	
	//数组集合
	Vector vects=new Vector();
	//引入底层方法
	IQQUserService is=new QQUserServiceimp();
	public int index;
	
	QQUser myuser;
	public QQFind(QQUser user){
		
		this.myuser=user;
		Container con=getContentPane();
		//设置窗口图标---好友头像
		
		this.setUndecorated(true);
		//调用窗口拖拽方法
		this.setDragable();
		
		//更换视觉样式
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	
		
		//关闭图片
		clos=new JLabel(new ImageIcon("image/close1.png"));
		clos.addMouseListener(new MousetListener());
		clos.setCursor(new Cursor(Cursor.HAND_CURSOR));
		clos.setBounds(670, 0, 25, 30);
		con.add(clos);
		
		//化最小图片
		xiao=new JLabel(new ImageIcon("image/xiao1.png"));
		xiao.addMouseListener(new MousetListener());
		xiao.setCursor(new Cursor(Cursor.HAND_CURSOR));
		xiao.setBounds(640, 0, 25, 30);
		con.add(xiao);
		
		//上边面板
		JPanel j=new JPanel();
		
		//QQ号
		JLabel l=new JLabel("QQ号：");
		t=new JTextField(10);
		j.add(l);
		j.add(t);
		
		//昵称
		JLabel l1=new JLabel("昵称：");
		t1=new JTextField(10);
		j.add(l1);
		j.add(t1);
		
		//年龄
		JLabel l2=new JLabel("年龄：");
		t2=new JTextField(10);
		j.add(l2);
		j.add(t2);
		
		//性别
		JLabel l3=new JLabel("性别：");
		String[] sex={"-选择性别-","男","女"};
		sexs=new JComboBox(sex);
		j.add(l3);
		j.add(sexs);
		
		
		//查找
		JButton b=new JButton("查找");
		j.add(b);
		b.addActionListener(new MyActionListener());
		
		j.setBounds(0, 35, 700, 30);
		con.add(j);
		
		
//		//背景图
//		JLabel l=new JLabel(new ImageIcon("image/bj.png"));
//		add(l);
		
		Vector<String> titles=new Vector<String>();
		titles.add("QQ号");
		titles.add("昵称");
		
		titles.add("等级");
		titles.add("性别");
		titles.add("年龄");
		titles.add("地区");
		
		
		//给表格模型设置数据和标题
		dm.setDataVector(vects, titles);
		
		//创建jlable
		table=new JTable(dm);
		
		//添加滚动面板
		JScrollPane scoll=new JScrollPane(table);
		scoll.setBounds(0, 65, 700, 200);
		con.add(scoll);
		
		//添加好友的按钮
		JButton b2=new JButton("添加选中好友");
		b2.setBounds(500,270 , 150, 30);
		b2.addActionListener(new MyActionListener());
		con.add(b2);
		
//		//背景图片
		JLabel hua=new JLabel(new ImageIcon("image/hua.jpg"));
		add(hua);
		
		setSize(700,300);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("查找")) {
				//获取条件
				String qqnum=t.getText();//QQ号
				String nickname=t1.getText();//昵称
				String age=t2.getText();//年龄
				int nl=0;
				if (!age.equals("")) {
					nl=Integer.parseInt(age);
				}
				
				String se=sexs.getSelectedItem().toString();//性别
				if (se.equals("-选择性别-")) {
					se="";
				}
				
				//封装到user中
				QQUser user=new QQUser();
				user.setQqnum(qqnum);
				user.setUname(nickname);
				user.setEag(nl);
				user.setSex(se);
				
				
				//查询好友列表
				vects=is.findUsers(user);
				
				//清空表格数据
				dm.setRowCount(0);
				
				//将集合中的数据显示到页面上
				for (int i = 0; i < vects.size(); i++) {
					Vector v=(Vector) vects.get(i);
					dm.addRow(v);//循环每一条数据，添加到表格中
				}
			}else if (e.getActionCommand().equals("添加选中好友")) {
				System.out.println(table.getSelectedRow()+" "+table.getSelectedColumn());
				int indx=table.getSelectedRow();//表格选中的行
				if (indx>-1) {//只有选中了才能进行操作
					//得到选中的QQ
					Vector v=(Vector) vects.get(indx);
					String qqnum=(String) v.get(0);
					
					//不能添加自己
					if (qqnum.equals(myuser.getQqnum())) {
						JOptionPane.showConfirmDialog(null, "不能添加自己");
						return;
					}
					
					//已经是好友不能添加
					boolean bln=is.selFriend(myuser.getQqnum(), qqnum);
					if (bln) {//已经是好友了
						JOptionPane.showConfirmDialog(null, "该用户已是你的好友");
						return;
					}
					
					//根据QQ号得到好友对象
					QQUser fuser=is.findUserByQQnum(qqnum);
					
					//给该好友发送添加请求
					QQMsg msg=new QQMsg();
					msg.setCmd(Contents.CMD_ADDFRIEND);//添加好友的命令字
					msg.setMyUser(myuser);
					msg.setFUser(fuser);
					new Msgsend(msg);
					JOptionPane.showConfirmDialog(null, "请求已发送！");
				}else {
					JOptionPane.showConfirmDialog(null, "请选择一个好友！");
				}
			}
		}
		
	}

	
	class MousetListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource()==clos) {
				//关闭窗口
//				Liaotian.this.dispose();
				QQFind.this.setVisible(false);
			}else if (e.getSource()==xiao) {
				//窗口化最小
				QQFind.this.setExtendedState(QQFind.this.ICONIFIED);
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
				QQFind.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(java.awt.event.MouseEvent e) {
				tmp = new Point(e.getX(), e.getY());

				isDragged = true;
				QQFind.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				if (isDragged) {
					loc = new Point(QQFind.this.getLocation().x + e.getX()
							- tmp.x, QQFind.this.getLocation().y + e.getY()
							- tmp.y);
					QQFind.this.setLocation(loc);
				}
			}
		});
	}
}
