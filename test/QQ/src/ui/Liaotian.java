package ui;

import impl.QQUserServiceimp;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

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
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import service.IQQUserService;

import bean.QQMsg;
import bean.QQUser;

import ceshi.Photograph;

import com.sun.org.apache.bcel.internal.generic.LMUL;
import common.Contents;
import common.Msgsend;

public class Liaotian extends JFrame{
	
	//关闭窗口标签
	JLabel clos,xiao;
	//文本域
	JTextPane review,send;
	//功能组件
	JComboBox font,fontsize;
	//字体数组
	String[] fonts={"宋体","华文行楷","微软雅黑","宋体","楷体"};
	//字体大小数组
	String[] fontsizes={"12","14","16","18","20","22","24","26"};
	JButton fontcolor,doudong,sendfile,cancel,bq,sendmsg,jietu,tupian;
	//引入底层方法
	IQQUserService is=new QQUserServiceimp();
	
	QQUser myuser,fuser;
	public Liaotian(QQUser myuser,QQUser fuser){
		this.myuser=myuser;
		this.fuser=fuser;
		Container con=getContentPane();
		con.setLayout(null);
		//设置窗口图标---好友头像
		setIconImage(new ImageIcon(fuser.getFace()).getImage());
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
		
		//背景图片
		JLabel hua=new JLabel(new ImageIcon("image/chuangko1.png"));
		hua.setBounds(0, 0, 597, 80);
//		con.add(hua);
	
		
		
		//关闭图片
		clos=new JLabel(new ImageIcon(""));
		clos.addMouseListener(new MousetListener());
		clos.setCursor(new Cursor(Cursor.HAND_CURSOR));
		clos.setBounds(570, 0, 25, 30);
		con.add(clos);
		
		//化最小图片
		xiao=new JLabel(new ImageIcon(""));
		xiao.addMouseListener(new MousetListener());
		xiao.setCursor(new Cursor(Cursor.HAND_CURSOR));
		xiao.setBounds(510, 0, 25, 30);
		con.add(xiao);
		
		//头像
		JLabel face=new JLabel(new ImageIcon(fuser.getFace()));
		face.setBounds(0, 0, 70, 70);
		con.add(face);
		
		//昵称
		JLabel nikename=new JLabel(fuser.getUname());
		nikename.setBounds(80, 8, 100, 30);
		nikename.setFont(new Font("华文行楷",Font.BOLD,20));
		con.add(nikename);
		
		//签名
		JLabel Qm=new JLabel(fuser.getQm());
		Qm.setBounds(80, 28, 100, 20);
		Qm.setBackground(new Color(124,124,124));
		con.add(Qm);
		
		
		//接收框文本域
		review=new JTextPane();
		JScrollPane s1=new 	JScrollPane(review);
		s1.setBounds(2, 80, 505, 290);
		review.setEditable(false);
		con.add(s1);
		
		
		JLabel xiu=new JLabel(new ImageIcon("image/xiu.png"));
		xiu.setBounds(507, 80, 90, 415);
		con.add(xiu);
		
		
		//中间面板
		JPanel j=new JPanel();
//		j.setLayout(null);
		
		//字体
		font=new JComboBox(fonts);
//		font.setBounds(2, 370, 50, 20);
		j.add(font);
		font.addItemListener(new MyltemListener());
		//字体大小
		fontsize=new JComboBox(fontsizes);
		j.add(fontsize);
		fontsize.addItemListener(new MyltemListener());
		
		//字体颜色
		fontcolor =new JButton(new ImageIcon("image/w1.png"));
		j.add(fontcolor);
		fontcolor.addActionListener(new MyActionListener());
		
		//抖动按钮
		doudong=new JButton(new ImageIcon("image/w3.png"));
		j.add(doudong);
		doudong.addActionListener(new MyActionListener());
		
		//发送表情
		bq=new JButton(new ImageIcon("image/w2.png"));
		j.add(bq);
		bq.addActionListener(new MyActionListener());
		
		//截图
		jietu=new JButton(new ImageIcon("image/w5.png"));
		j.add(jietu);
		jietu.addActionListener(new MyActionListener());
		
		//发送图片
		tupian=new JButton(new ImageIcon("image/w4.png"));
		j.add(tupian);
		tupian.addActionListener(new MyActionListener());
		
		//发送文件
		sendfile=new JButton("发送文件");
		j.add(sendfile);
		sendfile.addActionListener(new MyActionListener());
		
		
		//中间面板定位
		j.setBounds(0, 370,510, 35);
		con.add(j);
		
		//发送框
		send=new JTextPane();
		JScrollPane s2=new 	JScrollPane(send);
		s2.setBounds(2, 405, 505, 90);
		s2.setBorder(null);
		send.requestFocus();
		con.add(s2);
		
		//发送按钮
		sendmsg=new JButton(new ImageIcon("image/send.png"));
		sendmsg.setBounds(425,505,82, 20);
		con.add(sendmsg);
		sendmsg.addActionListener(new MyActionListener());
		
		//取消按钮
		cancel=new JButton(new ImageIcon("image/cancel.png"));
		cancel.setBounds(357,505,60, 20);
		con.add(cancel);
		cancel.addActionListener(new MyActionListener());
		
//		//关闭窗口位置
//		close=new JLabel();
//		close.setBounds(360, 0, 40, 25);
//		close.setBackground(Color.red);
//		//设置箭头为手型
//		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		close.addMouseListener(new MousetListener());
//		con.add(close);
		
		//背景图
//		JLabel x=new JLabel(new ImageIcon("image/chuangko.png"));
//		add(x);
		
		
		add(hua);
		setSize(597,537);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			//发送图片
			if (e.getSource()==tupian) {
				//弹出选择文件窗口
				FileDialog fd=new FileDialog(Liaotian.this,"请选择图片",FileDialog.LOAD);
				//让窗口显示
				fd.show();
				//获取文件路径
				String filename=fd.getDirectory()+"//"+fd.getFile();
				
				//发送消息
				
				Icon icon=new ImageIcon(filename);
				send.insertIcon(icon);
		
			}
			
			
			//发送截图
			if (e.getSource()==jietu) {
				
				new Photograph();
				Photograph cam = new Photograph("C:/", "png");
				cam.snapShot();
			}
			
			if (e.getSource()==fontcolor) {
				//创建颜色选择器
				JColorChooser fcolor=new JColorChooser();
				//打开颜色选择器的面板
				Color color=fcolor.showDialog(Liaotian.this, "字体颜色", Color.BLACK);
				send.setForeground(color);
			}
			
			if (e.getSource()==doudong) {
				//自己抖
				shake();
				
				//对方抖
				QQMsg msg=new QQMsg();
				msg.setCmd(Contents.CMD_SHKAE);
				msg.setMyUser(myuser);
				msg.setFUser(fuser);
				new Msgsend(msg);
				
				
			}else if (e.getSource()==sendfile) {//发送文件
				//弹出选择文件窗口
				FileDialog fd=new FileDialog(Liaotian.this,"选择文件",FileDialog.LOAD);
				//让窗口显示
				fd.show();
				
				//获取文件路径
				String filename=fd.getDirectory()+"//"+fd.getFile();
				//构造成文件对象
				File f=new File(filename);
				
				//判断文件是否超过64k
				if (f.length()>1024*64) {
					JOptionPane.showConfirmDialog(null, "请选择小于64k的文件");	
					return;
				}
				
				//将文件转换为字节数组
				byte[] b=new byte[(int)f.length()];
				
				//得到文件输入流
				try {
					FileInputStream is=new FileInputStream(f);
					//将文件读取字节数组中
					is.read(b);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//给好友发送文件信息
				QQMsg msg=new QQMsg();
				msg.setCmd(Contents.CMD_SENDFILE);//文件发送
				msg.setMyUser(myuser);
				msg.setFUser(fuser);
				msg.setFile(f.getName());//获取文件名称
				msg.setB(b);//文件的字节数组
				new Msgsend(msg);
				
			}else if (e.getSource()==bq) {//发送表情
				
				new Bq(Liaotian.this);
			}else if (e.getSource()==sendmsg) {//发送
				//把发送框内容放到接收框
				appendView(myuser.getUname(), send.getStyledDocument());
				
				//将消息发送给好友
				QQMsg msg=new QQMsg();
				//消息类型
				msg.setCmd(Contents.CMD_CHAT);
				msg.setMyUser(myuser);
				msg.setFUser(fuser);
				msg.setDoc(send.getStyledDocument());//聊天内容
				
				//发送消息
				new Msgsend(msg);
				
				//把发送框清空
				send.setText("");
			}else if (e.getSource()==cancel) {
				//关闭当前窗口
//				Liaotian.this.dispose();
				Liaotian.this.setVisible(false);
			}
			
		}
		
	}
	
	public void shake(){
		//获取窗口当前位置
		Point p=Liaotian.this.getLocationOnScreen();
		for (int i = 0; i < 20; i++) {
			if (i%2==0) {
				Liaotian.this.setLocation(p.x+5,p.y+5);
			}else {
				Liaotian.this.setLocation(p.x-5,p.y-5);
			}
			try {
				//延时
				Thread.sleep(50);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	//下拉框监听
	class MyltemListener implements ItemListener{

		public void itemStateChanged(ItemEvent e) {
			if (e.getSource()==font||e.getSource()==fontsize) {
				//从下拉框获取字形与字体颜色
				String fonts=font.getSelectedItem().toString();
				String size1=fontsize.getSelectedItem().toString();
				int sizes=Integer.parseInt(size1);
				send.setFont(new Font(fonts,Font.PLAIN,sizes));
				
			}
		}
		
	}
	
	class MousetListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource()==clos) {
				//关闭窗口
//				Liaotian.this.dispose();
				Liaotian.this.setVisible(false);
			}else if (e.getSource()==xiao) {
				//窗口化最小
				Liaotian.this.setExtendedState(Liaotian.this.ICONIFIED);
			}
		}
		public void mouseEntered(MouseEvent e){
			if (e.getSource()==clos) {
				clos.setIcon(new ImageIcon("image/downs.png"));
			}
		}
		
		public void mouseExited(MouseEvent e) {
			if (e.getSource()==clos) {
				clos.setIcon(new ImageIcon(""));
			}
		}
	}
	// 把发送框的内容提交到接收框 (自己的昵称，发送框的内容)
	public void appendView(String name, StyledDocument xx) {
		try {
			// 获取接收框的文档（内容）
			StyledDocument vdoc = review.getStyledDocument();// 获取接收框的内容

			// 格式化时间
			Date date = new Date();// 获取系统当前时间
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); // 设置显示时分秒的格式
			String time = sdf.format(date);// 获取时分秒
			// 创建一个属性集合
			SimpleAttributeSet as = new SimpleAttributeSet();
			// 显示谁说
			// vdoc.getLength()获取接收框中的原来内容的长度
			String s = name + "  " + time + "\n";
			// saveRecord(name,s);//保存聊天记录
			// 显示到接收框
			vdoc.insertString(vdoc.getLength(), s, as);
			int end = 0;
			// 处理显示的内容
			while (end < xx.getLength()) {
				// 获得一个元素
				Element e0 = xx.getCharacterElement(end);
				// 获取对应的风格，
				SimpleAttributeSet as1 = new SimpleAttributeSet();
				StyleConstants.setForeground(as1, StyleConstants
						.getForeground(e0.getAttributes()));
				StyleConstants.setFontSize(as1, StyleConstants.getFontSize(e0
						.getAttributes()));
				StyleConstants.setFontFamily(as1, StyleConstants
						.getFontFamily(e0.getAttributes()));
				// 获取该元素的内容
				s = e0.getDocument().getText(end, e0.getEndOffset() - end);
				// 将元素加到浏览窗中
				if ("icon".equals(e0.getName())) {
					vdoc.insertString(vdoc.getLength(), s, e0.getAttributes());
				} else {
					vdoc.insertString(vdoc.getLength(), s, as1);
					// saveRecord(name,s+"\n");//保存聊天记录
				}
				// getEndOffset（）函数就是获取当前元素的长度
				end = e0.getEndOffset();
			}
			// 输入一个换行
			vdoc.insertString(vdoc.getLength(), "\n", as);

			// 设置显示视图加字符的位置到文档结尾，以便视图滚动
			review.setCaretPosition(vdoc.getLength());
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
				Liaotian.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(java.awt.event.MouseEvent e) {
				tmp = new Point(e.getX(), e.getY());

				isDragged = true;
				Liaotian.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				if (isDragged) {
					loc = new Point(Liaotian.this.getLocation().x + e.getX()
							- tmp.x, Liaotian.this.getLocation().y + e.getY()
							- tmp.y);
					Liaotian.this.setLocation(loc);
				}
			}
		});
	}
}
