package Part2;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;


public class MenuDemo extends JFrame{
	//菜单栏
	JMenuBar j;
	//菜单
	JMenu jm,jm1,jm2;
	//复选菜单
	JCheckBoxMenuItem jc,jc1;
	//单选菜单
	JRadioButtonMenuItem jr,jr1,jr2;
	//菜单项
	JMenuItem ji,ji1,ji2;
	//字体标签
	JLabel jl;
	
	public MenuDemo(){
		super("菜单栏");
		
		//初始化菜单栏
		j=new JMenuBar();
		//将菜单栏设置到窗口中
		setJMenuBar(j);
		
		//初始化文件菜单
		jm=new JMenu("文件");
		//将菜单加入菜单栏中
		j.add(jm);
		
		//菜单项
		ji=new JMenuItem("打开(O)",new ImageIcon("MyImage2/add.gif"));
		ji1=new JMenuItem("储存(S)",new ImageIcon("MyImage2/save.gif"));
		ji2=new JMenuItem("另存为(A)",new ImageIcon("MyImage2/file.gif"));
		
		//给菜单项添加监听
		ji.addActionListener(new MyActionlistener());
		ji1.addActionListener(new MyActionlistener());
		ji2.addActionListener(new MyActionlistener());
		
		//设置菜单项的热键
		ji.setMnemonic('o');
		ji1.setMnemonic('s');
		ji2.setMnemonic('a');
		
		//将菜单项加在菜单中
		jm.add(ji);
		//在菜单中添加一条横线
		jm.addSeparator();
		jm.add(ji1);
		jm.add(ji2);
		
		//初始化文字格式菜单
		jm1=new JMenu("文字格式");
		j.add(jm1);
		
		//复选菜单项
		jc=new JCheckBoxMenuItem("粗体");
		jm1.add(jc);
		jc1=new JCheckBoxMenuItem("斜体");
		jm1.add(jc1);
		jc.addActionListener(new MyActionlistener());
		jc1.addActionListener(new MyActionlistener());
		
		
		//二级菜单
		jm2=new JMenu("文字颜色");
		
		//单选菜单项
		jr=new JRadioButtonMenuItem("黑色");
		jr1=new JRadioButtonMenuItem("红色");
		jr2=new JRadioButtonMenuItem("蓝色");
		
		jr.addActionListener(new MyActionlistener());
		jr1.addActionListener(new MyActionlistener());
		jr2.addActionListener(new MyActionlistener());
		
		//单选菜单项加在二级菜单中
		jm2.add(jr);
		jm2.add(jr1);
		jm2.add(jr2);
		
		//单选按钮进行分组
		ButtonGroup g=new ButtonGroup();
		g.add(jr);
		g.add(jr1);
		g.add(jr2);
		
		//将二级菜单加在菜单中
		jm1.add(jm2);
		
		
		//内容面板
		Container c=getContentPane();
		
		jl=new JLabel("男儿不展凌云志，窀负天生八尺躯。");
		
		c.add(jl);
		
		
		
		
		
		setSize(300,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MenuDemo();
	}
	
	class MyActionlistener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			//对菜单项进行监听
			if (e.getSource()==ji) {//打开
				JOptionPane.showConfirmDialog(null, "你点击了打开");
			}else if (e.getSource()==ji1) {
				JOptionPane.showConfirmDialog(null, "你点击了储存");
			}else if (e.getSource()==ji2) {
			JOptionPane.showConfirmDialog(null, "你点击了另存为");
			}
			
			//对文字格式的菜单项进行监听
			if (e.getSource()==jc) {//粗体
				jl.setFont(new Font("华文行楷",Font.BOLD,15));
			}else if (e.getSource()==jc1) {//斜体
				jl.setFont(new Font("华文行楷",Font.ITALIC,15));
			}else if (e.getSource()==jr) {//黑色
				jl.setForeground(Color.BLACK);
			}else if (e.getSource()==jr1) {//红色
				jl.setForeground(Color.RED);
			}else if (e.getSource()==jr2) {//黑色
				jl.setForeground(Color.BLUE);
			}
			
		}
		
	}

}
