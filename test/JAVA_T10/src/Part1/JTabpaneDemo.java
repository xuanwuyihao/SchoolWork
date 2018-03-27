package Part1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTabbedPane;



public class JTabpaneDemo extends JFrame{
	public JTabpaneDemo(){
		super("QQ主面板");
		Container c=getContentPane();
		c.setBackground(new Color(223,223,223));
		setLayout(null);
		
		//设置头像
		JLabel j=new JLabel(new ImageIcon("MyImage/tu1.jpg"));
		j.setBounds(5, 30, 80, 80);
		c.add(j);
		
		//设置个性签名
		JLabel j1=new JLabel("如果眼泪可以掩饰悲伤，那么要哭多久才能坚强！");
		j1.setBounds(87, 60, 150, 15);
		j1.setFont(new Font("宋体",Font.HANGING_BASELINE, 13));
		c.add(j1);
		
		//插入等级图片
		JLabel j2=new JLabel(new ImageIcon("MyImage/tu2.jpg"));
		j2.setBounds(75, 40, 50, 20);
		c.add(j2);
		
		JLabel j3=new JLabel(new ImageIcon("MyImage/tu3.jpg"));
		j3.setBounds(95, 40, 60, 20);
		c.add(j3);
		
		JLabel j4=new JLabel(new ImageIcon("MyImage/tu4.jpg"));
		j4.setBounds(115, 40, 60, 20);
		c.add(j4);
		
		JLabel j5=new JLabel(new ImageIcon("MyImage/tu5.jpg"));
		j5.setBounds(25, 83, 150, 15);
		c.add(j5);
		
		JLabel j6=new JLabel(new ImageIcon("MyImage/tu6.jpg"));
		j6.setBounds(47, 83, 150, 15);
		c.add(j6);
		
		JLabel j7=new JLabel(new ImageIcon("MyImage/tu7.jpg"));
		j7.setBounds(75, 83, 150, 15);
		c.add(j7);
		
		JLabel j8=new JLabel(new ImageIcon("MyImage/tu8.jpg"));
		j8.setBounds(105, 83, 150, 15);
		c.add(j8);
		
		//创建好友列表
		//创建一个切换面板
		JTabbedPane jt=new JTabbedPane();
		
		//好友
		String str[]={"伟东","小胡","小宁","小李","小肖"};
		JList jl=new JList(str);
		
		//员工
		String str1[]={"王思聪","王健林","马云","马化腾","雷军"};
		JList jl1=new JList(str1);
		
		//投资者
		String str2[]={"特普朗","奥巴马","普京","朴槿惠","安培晋三","金三胖"};
		JList jl2=new JList(str2);
		
		//将List添加到切换面板中
		jt.add("好友",jl);
		jt.add("员工",jl1);
		jt.add("投资者",jl2);
		
		//给切换面板定位
		jt.setBounds(0, 130, 300, 500);
		c.add(jt);
		setSize(300,600);
		setVisible(true);
		
		
		
		setSize(300,630);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//根据屏幕分辨率定位
		Toolkit tk=Toolkit.getDefaultToolkit();
		int whit=tk.getScreenSize().width;
		int hige=tk.getScreenSize().height;
		setLocation(whit-490,hige-730);
		
	}
	public static void main(String[] args) {
		new JTabpaneDemo();
	}

}
