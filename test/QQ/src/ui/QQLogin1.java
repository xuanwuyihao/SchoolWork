package ui;



import impl.QQUserServiceimp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Point;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import common.Contents;

import bean.QQHistory;
import bean.QQUser;
import service.IQQUserService;
import ui.QQRec.MousetListener;


public class QQLogin1 extends JFrame{
	JLabel la,la2,cls,xiao,statu,gb,zx;
	JComboBox account;
	JPasswordField pwd;
	JPanel p3;
	JLabel jb,jlb,jbe,jbel;
	JCheckBox j1,j2;
	String[] accs={""};
	//状态选择的弹出式菜单
	JPopupMenu popstate;
	JMenuItem it1,it2,it3,it4;//选项
	
	
	
	Container c;
	
	//获取底层方法
	IQQUserService is=new QQUserServiceimp();
	List list=is.selHistory();//查询登录历史
	public QQLogin1(){
		//更换视觉样式
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		this.setDragable();
		//获取登录历史
		this.getHistoryFromList();
		c=getContentPane();
		this.setUndecorated(true);
		
		
		//状态
		statu=new JLabel(new ImageIcon("image/s_online.png"));
		statu.setBounds(101,255,15,15);
		c.add(statu);
		statu.addMouseListener(new MousetListener());
		
		//弹出式菜单
		popstate =new JPopupMenu();
		it1=new JMenuItem("我在线",new ImageIcon("image/s_online.png"));
		it2=new JMenuItem("隐身",new ImageIcon("image/s_hide.png"));
		it3=new JMenuItem("忙碌",new ImageIcon("image/s_leave.png"));
		it4=new JMenuItem("请勿打扰",new ImageIcon("image/s_busy.png"));
		
		it1.addActionListener(new MyActionListener());
		it2.addActionListener(new MyActionListener());
		it3.addActionListener(new MyActionListener());
		it4.addActionListener(new MyActionListener());
		
		popstate.add(it1);
		popstate.add(it2);
		popstate.add(it3);
		popstate.add(it4);
		
		//创建面板
		jlb=new JLabel(new ImageIcon("image/tupian0.jpg"));
		jlb.setBounds(42,195,80,83);
		c.add(jlb);
		
		
		
		//输入框
		account=new JComboBox(accs);
		account.setEditable(true);
		account.setFont(new Font("宋体",Font.BOLD,20));
		account.setBounds(130,195,200,30);
		account.addItemListener(new MyIItemListener());
		c.add(account);
		
		pwd=new JPasswordField();
		pwd.setFont(new Font("Dialoglnput",Font.BOLD,12));
		pwd.setEchoChar('●');
		pwd.setBounds(130,225,200,30);
		c.add(pwd);
		
		//标签
		la=new JLabel("注册账号");
//		lt1.setForeground(new Color(60, 157, 255));// 使用RBG设置颜色
		la.setForeground(new Color(60,157,255));
		la.setBounds(342, 195, 60, 20);
		la.addMouseListener(new MousetListener());
		c.add(la);
		
		la2=new JLabel("找回密码");
		la2.setForeground(new Color(60,157,255));
		la2.setBounds(342, 225, 60, 20);
		la2.addMouseListener(new MousetListener());
		c.add(la2);

		j1=new JCheckBox("记住密码");
		j1.setBounds(130, 260, 80, 20);
		c.add(j1);
		
		j2=new JCheckBox("自动登录");
		j2.setBounds(260, 260, 80, 20);
		c.add(j2);
		
		//登录按钮
		jb=new JLabel(new ImageIcon("image/Logo1.png"));
		jb.setBounds(130, 290, 200, 30);
		jb.addMouseListener(new MousetListener());
		c.add(jb);
		
		//创建面板
		Panel p2=new Panel();
		jbe=new JLabel(new ImageIcon("image/erweima1.png"));
		p2.setBounds(405,305,25,25);
		p2.add(jbe);
		jbe.addMouseListener(new MousetListener());
		c.add(p2);
		
		//创建面板
		p3=new JPanel();
		//setLayout(null);
		p3.setLayout(new BorderLayout());
		
		ImageIcon ige=new ImageIcon("image/more1.png");
		jbel=new JLabel(ige);
		//p2.setBackground(Color.BLUE);
		p3.setBounds(2,305,25,25);
		jbel.addMouseListener(new MousetListener());
		p3.add(jbel);
		
		c.add(p3);
		
		//创建关闭面板
		cls=new JLabel();
		cls.setBounds(400, 0, 29, 29);
		cls.addMouseListener(new MousetListener());
		//设置箭头为手型
		cls.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(cls);
		
		JIZHU();
		
		//化最小
		xiao=new JLabel();
		xiao.setBounds(369, 3, 29, 29);
		xiao.addMouseListener(new MousetListener());
		//设置箭头为手型
		xiao.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(xiao);

		//让图片在窗口中显示
		JLabel jl=new JLabel(new ImageIcon("image/north.gif"));
		add(jl);
		setSize(430,330);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//按钮监听
	class MyActionListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==it1) {
				statu.setIcon(new ImageIcon("image/s_online.png"));
			}else if (e.getSource()==it2) {
				statu.setIcon(new ImageIcon("image/s_hide.png"));
			}else if (e.getSource()==it3) {
				statu.setIcon(new ImageIcon("image/s_leave.png"));
			}else if (e.getSource()==it4) {
				statu.setIcon(new ImageIcon("image/s_busy.png"));
			}
			
		}
		
	}
	public void JIZHU(){
		
		if (list==null||list.size()==0) {
			return;
		}
		QQHistory history=(QQHistory)list.get(0);//通过下边去集合中获取对应的登录历史对象
		
		//设置密码
		pwd.setText(history.getPwt());
		//设置头像
		jlb.setIcon(new ImageIcon(history.getFace()));
		//根据密码判断原来是否是记住密码
		if ("".equals(history.getPwt())) {
			j1.setSelected(false);
		}else{
			j1.setSelected(true);
		}
		//根据值判断原来是否自动登录
		if (history.getAutologin()==0) {
			j2.setSelected(false);
		}else{
			j2.setSelected(true);
			
			//判断状态
			int sta=history.getState();
			if (sta==Contents.STATU_ONLINE) {
				statu.setIcon(new ImageIcon("image/s_online.png"));
			}else if (sta==Contents.STATU_HIDE) {
				statu.setIcon(new ImageIcon("image/s_hide.png"));
			}else if (sta==Contents.STATU_BUSY) {
				statu.setIcon(new ImageIcon("image/s_leave.png"));
			}else if (sta==Contents.STATU_NODISTURB) {
				statu.setIcon(new ImageIcon("image/s_busy.png"));
			}
		}
	
	}
	//下拉框监听
	class MyIItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource()==account) {
				//返回下拉框选中的内容
//				System.out.println("下拉框"+account.getSelectedIndex());
				int index=account.getSelectedIndex();
				if (index<0) {
					return;
				}
				QQHistory history=(QQHistory)list.get(index);//通过下边去集合中获取对应的登录历史对象
				//设置密码
				pwd.setText(history.getPwt());
				//设置头像
				jlb.setIcon(new ImageIcon(history.getFace()));
				//根据密码判断原来是否是记住密码
				if ("".equals(history.getPwt())) {
					j1.setSelected(false);
				}else{
					j1.setSelected(true);
				}
				//根据值判断原来是否自动登录
				if (history.getAutologin()==0) {
					j2.setSelected(false);
				}else{
					j2.setSelected(true);
					
					//判断状态
					int sta=history.getState();
					if (sta==Contents.STATU_ONLINE) {
						statu.setIcon(new ImageIcon("image/s_online.png"));
					}else if (sta==Contents.STATU_HIDE) {
						statu.setIcon(new ImageIcon("image/s_hide.png"));
					}else if (sta==Contents.STATU_BUSY) {
						statu.setIcon(new ImageIcon("image/s_leave.png"));
					}else if (sta==Contents.STATU_NODISTURB) {
						statu.setIcon(new ImageIcon("image/s_busy.png"));
					}
				}
			}
			
		}
		
	}
	
	//从List中获取所有登录过得账号 封装在accs数组中
	public void getHistoryFromList(){
		//初始化数组
		 accs=new String[list.size()];
		//循环List获取QQ号
		for (int i = 0; i < list.size(); i++) {
			//取出每一个登录历史对象
			QQHistory history=(QQHistory)list.get(i);
			String qqnum=history.getQqnum();//QQ号
			accs[i]=qqnum;//把QQ号设置给下拉框
		}
	}
	class MousetListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource()==la2) {
				new Zhaohuimima();
				QQLogin1.this.dispose();
			}
			if (e.getSource()==cls) {
				System.exit(0);
			}else if (e.getSource()==xiao) {
				//让窗口化最小
				QQLogin1.this.setExtendedState(QQLogin1.this.ICONIFIED);
			}else if (e.getSource()==la) {
				QQLogin1.this.dispose();
				new QQRec();
			}else if (e.getSource()==jb) {
				//获取账号密码进行验证
				String qqnum=account.getSelectedItem().toString();//获取下拉框的值
				String pwds=pwd.getText();
				//验证下拉框的值
				if (account==null||account.equals("")) {
				JOptionPane.showConfirmDialog(null, "请输入账号！");
				account.requestFocus();
				return;
				}
				if (pwd==null||pwd.equals("")) {
					JOptionPane.showConfirmDialog(null, "请输入密码！");
					pwd.requestFocus();
					return;
				}
				//验证登录
				
				QQUser user=is.checkUser(qqnum, pwds);
				if (user==null) {
					JOptionPane.showConfirmDialog(null, "账号或密码错误，请从新登录！");
					pwd.requestFocus();
					return;
				}else {
//					JOptionPane.showConfirmDialog(null, "登录成功！");
					
					//获取状态的图片路径
					String states=statu.getIcon().toString();
					int st=0;
					if (states.equals("image/s_online.png")) {
						st=Contents.STATU_ONLINE;
					}else if (states.equals("image/s_hide.png")) {
						st=Contents.STATU_HIDE;
					}else if (states.equals("image/s_leave.png")) {
						st=Contents.STATU_BUSY;
					}else if (states.equals("image/s_busy.png")) {
						st=Contents.STATU_NODISTURB;
					}
					
					//更改用户状态
					is.changestatus(qqnum, st);
					
					//记录登录历史
					QQHistory history=new QQHistory();
					history.setQqnum(qqnum);//账号
					if (j1.isSelected()) {//如果记住密码勾选了，就要保存密码
						history.setPwt(pwds);
					}else{
						history.setPwt("");
					}
					history.setFace(user.getFace());//从登陆成功的的数据中获取头像
					if (j2.isSelected()) {
						history.setAutologin(1);//1、自动登录 0、不自动
					}else{
						history.setAutologin(0);
					}
					history.setState(st);//登录时状态
					
					//保存登录记录
					is.addhistory(history);
					
					//更新用户状态
					user.setStatus(st);
					//登录界面隐藏
					QQLogin1.this.dispose();
					//打开主界面
					new DRHOU(user);
				}
			}else if (e.getSource()==statu) {//点击了状态
				popstate.show(statu,e.getX(),e.getY());//显示弹出式窗口
				
			}
			
		}
		//鼠标移入事件
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==la) {
				la.setForeground(Color.GRAY);
				//化最小
//				zx="image/minimize.gif";
				
				
			}
			if (e.getSource()==la2) {
				la2.setForeground(Color.GRAY);
//				System.out.println("----");
//				//创建关闭面板
//				gb="image/downs.png";
			}
			
			if (e.getSource()==cls) {
				cls.setIcon(new ImageIcon("image/downs.png"));
			}
			if (e.getSource()==xiao) {
				xiao.setIcon(new ImageIcon("image/min_over.PNG"));
			}
			if (e.getSource()==jbe) {
				jbe.setIcon(new ImageIcon("image/erweima2.png"));
			}
			if (e.getSource()==jbel) {
				jbel.setIcon(new ImageIcon("image/more2.png"));
			}
			
		}
		//鼠标移除事件
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==la) {
				la.setForeground(new Color(60,157,255));
			}
			if (e.getSource()==la2) {
				la2.setForeground(new Color(60,157,255));
			}
			if (e.getSource()==cls) {
				cls.setIcon(new ImageIcon(""));
			}
			if (e.getSource()==xiao) {
				xiao.setIcon(new ImageIcon(""));
			}
			if (e.getSource()==jbe) {
				jbe.setIcon(new ImageIcon("image/erweima1.png"));
			}
			if (e.getSource()==jbel) {
				jbel.setIcon(new ImageIcon("image/more1.png"));
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
				QQLogin1.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(java.awt.event.MouseEvent e) {
				tmp = new Point(e.getX(), e.getY());

				isDragged = true;
				QQLogin1.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				if (isDragged) {
					loc = new Point(QQLogin1.this.getLocation().x + e.getX()
							- tmp.x, QQLogin1.this.getLocation().y + e.getY()
							- tmp.y);
					QQLogin1.this.setLocation(loc);
				}
			}
		});
	}
	public static void main(String[] args) {
		new QQLogin1();
	}
}
