package Face;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import ceshi.Shuoming;

public class MyPanel extends JFrame{
	
	//音乐名数组
	String[] musicFile={ "nor.mid", "qin.mid", "popo.mid", "guang.mid",
	"eyes on me.mid" };
	//下拉框显示数组
	String[] smusiz={"默认", "琴箫合奏", "泡泡堂", "灌篮高手", "eyes on me" };
	
	//音乐下拉框
	JComboBox com;
	
	//中间面板
	Centerpanel cen=new Centerpanel();
	
	public MyPanel(){		
		super("推箱子2018");
		
		//设置窗口图标
		setIconImage(new ImageIcon("Image/3.gif").getImage());
		
		//设置内容面板
		Container c=getContentPane();
		//设置面板布局
		c.setLayout(new BorderLayout());
		//添加右边面板
		JPanel p=new JPanel();
		//右边面板设置空布局
		p.setLayout(null);
		//插入背景图片
		ImageIcon img=new ImageIcon("Image/tui1.jpg");
		JLabel j=new JLabel(img);
		j.setBounds(600, 0, 120, 600);
		c.add(j);
		
		//右边面板设置偏好大小
		p.setPreferredSize(new Dimension(120,600));
		//面板放在右边
		c.add(p,BorderLayout.EAST);
		
		//给右边面板添加按钮
		Button b=new Button("重来");
		b.setFont(new Font("宋体",Font.BOLD,20));
		Button b1=new Button("悔一步");
		b1.setFont(new Font("宋体",Font.BOLD,20));
		Button b2=new Button("第一关");
		b2.setFont(new Font("宋体",Font.BOLD,20));
		Button b3=new Button("上一关");
		b3.setFont(new Font("宋体",Font.BOLD,20));
		Button b4=new Button("下一关");
		b4.setFont(new Font("宋体",Font.BOLD,20));
		Button b5=new Button("最终关");
		b5.setFont(new Font("宋体",Font.BOLD,20));
		Button b6=new Button("选关");
		b6.setFont(new Font("宋体",Font.BOLD,20));
		Button b7=new Button("帮助");
		b7.setFont(new Font("宋体",Font.BOLD,20));
		Button b8=new Button("退出");
		b8.setFont(new Font("宋体",Font.BOLD,20));
		
		b.setBounds(5, 15, 110, 50);
		p.add(b);
		b1.setBounds(5, 75, 110, 50);
		p.add(b1);
		b2.setBounds(5, 135, 110, 50);
		p.add(b2);
		b3.setBounds(5, 195, 110, 50);
		p.add(b3);
		b4.setBounds(5, 255, 110, 50);
		p.add(b4);
		b5.setBounds(5, 315, 110, 50);
		p.add(b5);
		b6.setBounds(5, 375, 110, 50);
		p.add(b6);
		b7.setBounds(5, 435, 110, 50);
		p.add(b7);
		b8.setBounds(5, 495, 110, 50);
		p.add(b8);
		
		b.addActionListener(new Myactionlisener());
		b1.addActionListener(new Myactionlisener());
		b2.addActionListener(new Myactionlisener());
		b3.addActionListener(new Myactionlisener());
		b4.addActionListener(new Myactionlisener());
		b5.addActionListener(new Myactionlisener());
		b6.addActionListener(new Myactionlisener());
		b7.addActionListener(new Myactionlisener());
		b8.addActionListener(new Myactionlisener());

//		//添加音乐下拉框
//		com=new JComboBox(smusiz);
//		com.setBounds(5, 550, 110, 20);
//		p.add(com);
//		//com.addActionListener(new Myactionlisener());
		
		//音乐开关
		Button b10=new Button("关音乐");
		b10.setFont(new Font("宋体",Font.BOLD,20));
		b10.setBounds(5, 555, 110, 40);
		p.add(b10);
		//b10.addActionListener(new Myactionlisener());
		
		
		
		//设置中间面板的偏好大小
		cen.setPreferredSize(new Dimension(600,600));
		c.add(cen);
		
		
		pack();//自动根据组件大小来确定窗口大小
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MyPanel();
	}
	
	//下拉框监听
	class MyItemListener implements ItemListener{

		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			/*if (e.getSource()==com) {
				//得到当前下拉框的下标
				int Index=com.getSelectedIndex();
				
				
			}*/
		}
		
	}
	
	class Myactionlisener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getActionCommand()=="重来") {
				int level=cen.level;//获取当前关卡
				cen.setlevel(level);//设置关卡
			}else if (e.getActionCommand()=="悔一步") {
				cen.huiyibu();
			}else if (e.getActionCommand()=="第一关") {
				cen.setlevel(1);
			}else if (e.getActionCommand()=="上一关") {
				int leve=cen.level;//获取当前关卡
				if (leve<=1) {
					JOptionPane.showConfirmDialog(null, "上面没关卡了！");
					return;
				}
				cen.setlevel(leve-1);
			}else if (e.getActionCommand()=="下一关") {
				int leve=cen.level;//获取当前关卡
				if (leve>=11) {
					JOptionPane.showConfirmDialog(null, "下面没关卡了！");
					return;
				}
				cen.setlevel(leve+1);
			}else if (e.getActionCommand()=="最终关") {
				cen.setlevel(11);
			}else if (e.getActionCommand()=="选关") {
				//接受用户输入的关卡
				String str_level= JOptionPane.showInputDialog("请选择1—11关");
				//将接受的关卡转换为整形
				int level=0;
				try {
					level = Integer.parseInt(str_level);
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					JOptionPane.showConfirmDialog(null, "请输入数字");
					return;
				}
				
				if (level>=1&&level<=11) {
					cen.setlevel(level);
				}else{
					JOptionPane.showConfirmDialog(null, "请输入1-11关内的关卡");
				}
				
			}else if (e.getActionCommand()=="说明") {
				
			}else if (e.getActionCommand()=="退出") {
				new kaishi();
				//点击退出关闭当前页面
				MyPanel.this.dispose();
			}
		}
		
	}

}
