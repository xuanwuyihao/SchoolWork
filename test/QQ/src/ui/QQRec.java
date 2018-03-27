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
import javax.swing.UIManager;

import service.IQQUserService;

import bean.QQUser;

import com.sun.org.apache.bcel.internal.generic.LMUL;

public class QQRec extends JFrame{
	
	//关闭窗口标签
	JLabel close;
	JPanel z;
	//输入框
	JTextField unames,haoma,eags;
	//密码框
	JPasswordField j2,j3;
	//性别
	JRadioButton y,y1;
	//年月日
	JComboBox unian,uyue,uri;
	
	
	//昵称为空
	JLabel uname0,pwd0,pwd2_0,eag1;
	
	Container con;
	//引入底层方法
	IQQUserService is=new QQUserServiceimp();
	public QQRec(){
		//更换视觉样式
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		con=getContentPane();
		this.setUndecorated(true);
		//调用窗口拖拽方法
		this.setDragable();
		
		//创建面板
		JPanel p=new JPanel();
		p.setBounds(3, 60, 100, 30);
		JLabel l1=new JLabel(new ImageIcon("image/zuce.png"));
		p.add(l1);
		con.add(p);
		
		
		//昵称
		JLabel uname=new JLabel("昵称:");
		uname.setBounds(50, 90, 60, 30);
		uname.setFont(new Font("华文彩云",Font.BOLD,15));
//		l2.setForeground(Color.green);
		unames=new JTextField();
//		unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
//		unames.setEchoChar('●');
		unames.setBounds(110, 90, 190, 25);
		con.add(unames);
		con.add(uname);
		
		//昵称为空
		uname0=new JLabel("昵称为空！");
		uname0.setBounds(315, 85, 80, 30);
		uname0.setFont(new Font("华文彩云",Font.BOLD,11));
		uname0.setForeground(Color.white);
		con.add(uname0);
		
		//密码
		JLabel l2=new JLabel("密码:");
		l2.setBounds(50, 130, 60, 30);
		l2.setFont(new Font("华文彩云",Font.BOLD,15));
//		l2.setForeground(Color.green);
		j2=new JPasswordField();
		j2.setEchoChar('●');
		j2.setBounds(110, 130, 190, 25);
		j2.addMouseListener(new MousetListener());
		con.add(j2);
		con.add(l2);
		
		//密码为空
		pwd0=new JLabel("密码为空！");
		pwd0.setBounds(315, 130, 80, 30);
		pwd0.setFont(new Font("华文彩云",Font.BOLD,11));
		pwd0.setForeground(Color.white);
		con.add(pwd0);
		
		
		
		
		//确认密码
		JLabel l3=new JLabel("确认密码:");
		l3.setBounds(30, 170, 120, 30);
		l3.setFont(new Font("华文中宋",Font.BOLD,15));
//		l3.setForeground(Color.RED);
		j3=new JPasswordField();
		j3.setEchoChar('●');
		j3.setBounds(110, 170, 190, 25);
		con.add(j3);
		con.add(l3);
		
		//密码不一致
		pwd2_0=new JLabel("密码不一致！");
		pwd2_0.setBounds(315, 170, 80, 30);
		pwd2_0.setFont(new Font("华文彩云",Font.BOLD,11));
		pwd2_0.setForeground(Color.white);
		con.add(pwd2_0);
		
		//性别
		JLabel l4=new JLabel("性别:");
		l4.setBounds(50, 210, 120, 30);
		l4.setFont(new Font("幼圆",Font.BOLD,15));
//		l4.setForeground(Color.ORANGE);
		y=new JRadioButton("男");
		y.setSelected(true);
		y.setBounds(120, 210, 60, 30);
		y.setFont(new Font("华文行楷",Font.BOLD,20));
		con.add(y);
		y1=new JRadioButton("女");
		y1.setBounds(230, 210, 60, 30);
		y1.setFont(new Font("华文行楷",Font.BOLD,20));
		
		con.add(y1);
		con.add(l4);
		
		//点选按钮要分组
		ButtonGroup g=new ButtonGroup();
		g.add(y);
		g.add(y1);
		
		//年龄
		JLabel eag=new JLabel("年龄:");
		eag.setBounds(50, 250, 60, 30);
		eag.setFont(new Font("华文彩云",Font.BOLD,15));
//		l2.setForeground(Color.green);
		eags=new JTextField();
//		unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
//		unames.setEchoChar('●');
		eags.setBounds(110, 250, 190, 25);
		con.add(eags);
		con.add(eag);
		
		//年龄为空
		eag1=new JLabel("年龄为空！");
		eag1.setBounds(315, 245, 80, 30);
		eag1.setFont(new Font("华文彩云",Font.BOLD,11));
		eag1.setForeground(Color.white);
		con.add(eag1);
		
		//生日
		JLabel l5=new JLabel("生日:");
		l5.setBounds(50, 290, 120, 30);
		l5.setFont(new Font("华文彩云",Font.BOLD,15));
		
		String yue[]={"1月","2月","3月","4月","5月","6月","7月","8月","9月","10月","11月","12月"};
		uyue=new JComboBox(yue);
		uyue.setBounds(130, 290, 50, 30);
		con.add(uyue);
		String ri[]={"1日","2日","3日","4日","5日","6日","7日","8日","9日","10日",
				"11日","12日","13日","14日","15日","16日","17日","18日","19日","20日",
				"21日","22日","23日","24日","25日","26日","27日","28日","29日","30日","31日"};
		uri=new JComboBox(ri);
		uri.setBounds(210, 290, 50, 30);
		con.add(uri);
		con.add(l5);
		
		
		//所在地
		JLabel l6=new JLabel("所在地:");
		l6.setBounds(50, 330, 120, 30);
		l6.setFont(new Font("华文彩云",Font.BOLD,15));
		JTextField address=new JTextField();
		address.setBounds(110, 330, 190, 25);
		con.add(address);
		con.add(l6);
		
		//手机号
		JLabel l7=new JLabel("手机号:");
		l7.setBounds(50, 370, 120, 30);
		l7.setFont(new Font("华文彩云",Font.BOLD,15));
		haoma=new JTextField();
		haoma.setBounds(110, 370, 190, 25);
		con.add(haoma);
		con.add(l7);
		
		//注册图片
		z=new JPanel();
		z.setBounds(80, 430, 240, 40);
		JLabel zc=new JLabel(new ImageIcon("image/zuce1.png"));
		z.addMouseListener(new MousetListener());
		z.add(zc);
		con.add(z);
		
		
		//关闭窗口位置
		close=new JLabel();
		close.setBounds(367, 4, 40, 25);
		close.setBackground(Color.red);
		//设置箭头为手型
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MousetListener());
		con.add(close);
		
		
		//背景图
		JLabel l=new JLabel(new ImageIcon("image/bj.png"));
		add(l);
		setSize(400,500);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new QQRec();
		
	}
	//焦点事件
	public void focusLost(FocusEvent e){
		
	}
	class MousetListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource()==close) {
				QQRec.this.dispose();
				new QQLogin1();
			}
			if (e.getSource()==z) {
				String name=unames.getText();
				String pwd=j2.getText();
				String pwd2=j3.getText();
				
				//昵称为空
				if (name==null||name.equals("")) {
					//让边框变为红色
					unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 0, 24)));
					uname0.setForeground(Color.red);
//					JOptionPane.showMessageDialog(null, "昵称为空！");
					return;
				}else  {
					unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
					uname0.setForeground(Color.white);
				}
				//如果第一次输入密码为空
				 if (pwd==null||pwd.equals("")) {
					//让边框变为红色
					j2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 0, 24)));
					pwd0.setForeground(Color.red);
//					JOptionPane.showMessageDialog(null, "密码为空！");
					return;
				}else {
					j2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250)));
					pwd0.setForeground(Color.white);
				}
				//如果第一次输入密码与第二次输入不一致
				if (!pwd.equals(pwd2)) {
					//让边框变为红色
					j3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 0, 24)));
					pwd2_0.setForeground(Color.red);
//					JOptionPane.showMessageDialog(null, "密码不一致！");
					return;
				}else {
					j3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250)));
					pwd2_0.setForeground(Color.white);
				}
				
				//年龄为空
				String eags1=eags.getText();
				if (eags1==null||eags1.equals("")) {
					//让边框变为红色
					eags.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 0, 24)));
					eag1.setForeground(Color.red);
//					JOptionPane.showMessageDialog(null, "昵称为空！");
					return;
				}else  {
					eags.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
					eag1.setForeground(Color.white);
				}
				
				//保存注册信息到数据库
				QQUser user=new QQUser();
				//调用生成QQ号的方法
				String qqnum=productqqnum();
				//QQ号
				user.setQqnum(qqnum);
				//QQ密码
				user.setPwd(pwd);
				//昵称
				user.setUname(name);
				//性别
				String sex="男";
				if (y1.isSelected()) {//判断女有没有选中
					sex="女";
				}
				user.setSex(sex);
				//年龄
				user.setEag(Integer.parseInt(eags1));
				
				//生日(获取选中的下拉框选项)
				user.setBirthday(uyue.getSelectedItem().toString()
						+uri.getSelectedItem().toString());
				
				
				//头像--设置默认头像
				user.setFace("image/tupian2.png");
				
				//状态--默认离线
				user.setStatus(0);
				
				//等级
				user.setLeves(1);
				
				//电话
				String tel=haoma.getText();
				user.setHaoma(tel);
				
				//Ip
				user.setIp("127.0.0.1");
				//端口
				
				int port=productport();
				
				user.setPort(port+"");
				
				//将对象保存到数据库中
				boolean bln=is.addUser(user);
				if (bln) {
					JOptionPane.showMessageDialog(null, "注册成功！QQ号是"+qqnum);
				}else {
					JOptionPane.showMessageDialog(null, "服务器异常！请重试！");
				}
			}
			
		}
		//鼠标移入
		@Override
		public void mouseEntered(MouseEvent e) {
			if (e.getSource()==close) {
				close.setIcon(new ImageIcon("image/downs.png"));
			}
		}
		//鼠标移除
		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource()==close) {
				close.setIcon(new ImageIcon(""));
			}
		}
	}
	//生成端口
	public int productport(){
		
		Random r=new Random();
		int port=r.nextInt(6000)+1024;
		
		return port;
	}
	//生成QQ号
	public String productqqnum(){
		Random r=new Random();
		//0-999999
		int qqnum=r.nextInt(1000000)+100000;
		boolean bln=is.checkQQnum(qqnum);
		//判断号码在数据库中是否存在
		while(is.checkQQnum(qqnum)) {
			qqnum=r.nextInt(1000000)+100000;
		}
		return qqnum+"";
		
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
				QQRec.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(java.awt.event.MouseEvent e) {
				tmp = new Point(e.getX(), e.getY());

				isDragged = true;
				QQRec.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				if (isDragged) {
					loc = new Point(QQRec.this.getLocation().x + e.getX()
							- tmp.x, QQRec.this.getLocation().y + e.getY()
							- tmp.y);
					QQRec.this.setLocation(loc);
				}
			}
		});
	}
}
