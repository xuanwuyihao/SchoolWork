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

public class QQUPdinof extends JFrame{
	
	//关闭窗口标签
	JLabel close,qe;
	JPanel z;
	//输入框
	JTextField unames,haoma,eag;
	//密码框
	JTextField j2,j3;
	//性别
	JRadioButton y,y1;
	//年月日
	JComboBox unian,uyue,uri;
	JLabel qm;
	
	//昵称为空
	JLabel uname0,pwd0,pwd2_0;
	
	Container con;
	//引入底层方法
	IQQUserService is=new QQUserServiceimp();
	public QQUPdinof(QQUser user){
		con=getContentPane();
		this.setUndecorated(true);
		
		//调用窗口拖拽方法
		this.setDragable();
		
		//创建面板
		JPanel p=new JPanel();
		p.setBounds(3, 60, 100, 30);
		
		
		//昵称
		JLabel uname=new JLabel("昵  称");
		uname.setBounds(10, 40, 45, 30);
//		uname.setFont(new Font("华文彩云",Font.BOLD,15));
//		l2.setForeground(Color.green);
		unames=new JTextField(user.getUname() );
//		unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
//		unames.setEchoChar('●');
		unames.setBounds(60, 40, 115, 20);
		con.add(unames);
		con.add(uname);
		
		
		
		//性别
		JLabel l4=new JLabel("性  别");
		l4.setBounds(200, 40, 40, 30);
//		l4.setFont(new Font("幼圆",Font.BOLD,15));
//		l4.setForeground(Color.ORANGE);
		y=new JRadioButton("男");
		
		y.setBounds(250, 45,40, 20);
//		y.setFont(new Font("华文行楷",Font.BOLD,20));
		con.add(y);
		y1=new JRadioButton("女");
		y1.setBounds(310, 45, 40, 20);
//		y1.setFont(new Font("华文行楷",Font.BOLD,20));
		//判断性别选中
		if (user.getSex().equals("男")) {
			y.setSelected(true);
		}else if (user.getSex().equals("女")) {
			y1.setSelected(true);
		}
		
		con.add(y1);
		con.add(l4);
		
		//点选按钮要分组
		ButtonGroup g=new ButtonGroup();
		g.add(y);
		g.add(y1);
		
		
		
		//
		String str=user.getBirthday();//1991年1月1日
//		String y = str.substring(0, str.indexOf("年")+1);
//		System.out.println(y);
		String m = str.substring(str.indexOf("年")+1, str.indexOf("月")+1);

		String d = str.substring(str.indexOf("月")+1, str.length());
		//生日
		JLabel l5=new JLabel("生  日");
		l5.setBounds(10, 75, 40, 30);
//		l5.setFont(new Font("华文彩云",Font.BOLD,15));
//		String nian[]={"1995年","1996年","1997年","1998年","1999年","2000年","2000年"
//				,"2001年","2002年","2003年","2004年","2005年","2006年","2007年","2008年"
//				,"2009年","2010年","2011年","2012年","2013年","2014年","2015年","2016年"
//				,"2017年","2018年","2019年","2020年","2021年","2022年","2023年","2024年"
//				,"2025年","2026年","2027年","2028年","2029年","2030年","2031年","2032年"
//				,"2033年","2034年","2035年","2036年","2037年","2038年","2039年"};
//		unian=new JComboBox(nian);
//		unian.setSelectedItem(y);
//		unian.setBounds(110, 55, 90, 30);
		
		
		String yue[]={"1月","2月","3月","4月","5月","6月","7月","8月","9月","10月","11月","12月"};
		uyue=new JComboBox(yue);
		uyue.setSelectedItem(m);
		uyue.setBounds(60, 80, 50, 20);
		con.add(uyue);
		
		
		String ri[]={"1日","2日","3日","4日","5日","6日","7日","8日","9日","10日",
				"11日","12日","13日","14日","15日","16日","17日","18日","19日","20日",
				"21日","22日","23日","24日","25日","26日","27日","28日","29日","30日","31日"};
		uri=new JComboBox(ri);
		uri.setSelectedItem(d);
		uri.setBounds(120, 80, 50, 20);
		con.add(uri);
		con.add(l5);
//		con.add(unian);
		
		//职业
		JLabel zy=new JLabel("职  业");
		zy.setBounds(200, 75, 40, 30);
//		uname.setFont(new Font("华文彩云",Font.BOLD,15));
//		l2.setForeground(Color.green);
		JTextField zy1=new JTextField();
//		unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
//		unames.setEchoChar('●');
		zy1.setBounds(250, 80,115, 20);;
		con.add(zy1);
		con.add(zy);
		
		//故乡
		JLabel gx=new JLabel("故  乡");
		gx.setBounds(10, 110, 40, 30);
//		uname.setFont(new Font("华文彩云",Font.BOLD,15));
//		l2.setForeground(Color.green);
		JTextField gx1=new JTextField();
//		unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
//		unames.setEchoChar('●');
		gx1.setBounds(60, 115,300, 20);;
		con.add(gx1);
		con.add(gx);
		
		//所在地
		JLabel l6=new JLabel("所在地:");
		l6.setBounds(10, 150, 50, 30);
//		l6.setFont(new Font("华文彩云",Font.BOLD,15));
		JTextField address=new JTextField(user.getAddress());
		address.setBounds(60, 150, 300, 25);
		con.add(address);
		con.add(l6);
		
		//学校
		JLabel xx=new JLabel("学  校");
		xx.setBounds(10, 185, 50, 30);
//		l6.setFont(new Font("华文彩云",Font.BOLD,15));
		JTextField xx1=new JTextField();
		xx1.setBounds(60, 185, 300, 25);
		con.add(xx1);
		con.add(xx);
		
		//学校
		JLabel gs=new JLabel("公  司");
		gs.setBounds(10, 220, 50, 30);
//		l6.setFont(new Font("华文彩云",Font.BOLD,15));
		JTextField gs1=new JTextField();
		gs1.setBounds(60, 220, 300, 25);
		con.add(gs1);
		con.add(gs);
		
		//手机号
		JLabel l7=new JLabel("手  机");
		l7.setBounds(10, 255, 40, 30);
//		l7.setFont(new Font("华文彩云",Font.BOLD,15));
		haoma=new JTextField(user.getHaoma());
		haoma.setBounds(60, 260, 300, 25);
		con.add(haoma);
		con.add(l7);
		
		//手机号
		JLabel yx=new JLabel("邮  箱");
		yx.setBounds(10, 290, 40, 30);
//		l7.setFont(new Font("华文彩云",Font.BOLD,15));
		JTextField yx1=new JTextField();
		yx1.setBounds(60, 295, 300, 25);
		con.add(yx1);
		con.add(yx);
		
		//签名
		qm=new JLabel("签  名");
		qm.setBounds(10, 330, 40, 30);
//		l7.setFont(new Font("华文彩云",Font.BOLD,15));
		JTextPane qm1=new JTextPane();
		qm1.setBounds(60, 330, 300, 60);
		con.add(qm1);
		con.add(qm);
		
		//签名
		qe=new JLabel("");
		qe.setBounds(240, 475, 40, 30);
//		l7.setFont(new Font("华文彩云",Font.BOLD,15));
		qe.setCursor(new Cursor(Cursor.HAND_CURSOR));
		con.add(qe);
		
		
		//关闭窗口位置
		close=new JLabel();
		close.setBounds(360, 0, 40, 25);
		close.setBackground(Color.red);
		//设置箭头为手型
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MousetListener());
		con.add(close);
		
		
		//背景图
		JLabel l=new JLabel(new ImageIcon("image/xiugai.png"));
		add(l);
		setSize(374,515);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	//焦点事件
	public void focusLost(FocusEvent e){
		
	}
	class MousetListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource()==close) {
				QQUPdinof.this.dispose();
			}
			if (e.getSource()==qe) {
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
				
				
				//保存注册信息到数据库
				QQUser user=new QQUser();
				//调用生成QQ号的方法
				String qqnum=productqqnum();
				//QQ号
				user.setQqnum(qqnum);
				//昵称
				user.setUname(name);
				//性别
				String sex="男";
				if (y1.isSelected()) {//判断女有没有选中
					sex="女";
				}
				user.setSex(sex);
				
				//生日(获取选中的下拉框选项)
				user.setBirthday(unian.getSelectedItem().toString()
						+uyue.getSelectedItem().toString()
						+uri.getSelectedItem().toString());
				
				
				//头像--设置默认头像
				user.setFace("image/tupian0.jpg");
				
				//状态--默认离线
				user.setStatus(0);
				
				//等级
				user.setLeves(user.getLeves());
				
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
				QQUPdinof.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(java.awt.event.MouseEvent e) {
				tmp = new Point(e.getX(), e.getY());

				isDragged = true;
				QQUPdinof.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				if (isDragged) {
					loc = new Point(QQUPdinof.this.getLocation().x + e.getX()
							- tmp.x, QQUPdinof.this.getLocation().y + e.getY()
							- tmp.y);
					QQUPdinof.this.setLocation(loc);
				}
			}
		});
	}

	
}
