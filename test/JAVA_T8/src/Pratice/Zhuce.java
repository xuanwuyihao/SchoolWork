package Pratice;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Zhuce extends JFrame{
	JTextField t1;
	JButton b,b1;

	public Zhuce(){
		
		super("注册页面");
		Container c=getContentPane();
		c.setLayout(null);
		//标题
		JLabel l=new JLabel("账号注册");
		l.setBounds(170, 0, 220, 45);
		l.setFont(new Font("华文行楷",Font.BOLD,40));
		l.setForeground(Color.BLUE);
		c.add(l);
		
		//账号
		JLabel l1=new JLabel("账号:");
		l1.setBounds(120, 50, 60, 30);
		l1.setFont(new Font("华文彩云",Font.BOLD,20));
		t1=new JTextField();
		t1.setBounds(180, 50, 190, 30);
		t1.setFont(new Font("微软雅黑",Font.BOLD,20));
		c.add(t1);
		c.add(l1);
		
		//密码
		JLabel l2=new JLabel("密码:");
		l2.setBounds(120, 85, 60, 30);
		l2.setFont(new Font("华文彩云",Font.BOLD,20));
		l2.setForeground(Color.green);
		JPasswordField j2=new JPasswordField();
		j2.setEchoChar('●');
		j2.setBounds(180, 85, 190, 30);
		c.add(j2);
		c.add(l2);
		
		//确认密码
		JLabel l3=new JLabel("确认密码:");
		l3.setBounds(80, 120, 120, 30);
		l3.setFont(new Font("华文中宋",Font.BOLD,20));
		l3.setForeground(Color.RED);
		JPasswordField j3=new JPasswordField();
		j3.setEchoChar('●');
		j3.setBounds(180, 120, 190, 30);
		c.add(j3);
		c.add(l3);
		
		//性别
		JLabel l4=new JLabel("性别:");
		l4.setBounds(120, 155, 120, 30);
		l4.setFont(new Font("幼圆",Font.BOLD,20));
		l4.setForeground(Color.ORANGE);
		JRadioButton y=new JRadioButton("男");
		y.setSelected(true);
		y.setBounds(190, 155, 60, 35);
		y.setFont(new Font("华文行楷",Font.BOLD,25));
		c.add(y);
		JRadioButton y1=new JRadioButton("女");
		y1.setBounds(300, 155, 60, 35);
		y1.setFont(new Font("华文行楷",Font.BOLD,25));
		c.add(y1);
		c.add(l4);
		
		//点选按钮要分组
		ButtonGroup g=new ButtonGroup();
		g.add(y);
		g.add(y1);
		
		//爱好
		JLabel l5=new JLabel("爱好:");
		l5.setBounds(120, 190, 60, 30);
		l5.setFont(new Font("方正舒体",Font.BOLD,20));
		l5.setForeground(Color.PINK);
		//设置面板装下拉框
		JPanel p=new JPanel();
		p.setBounds(180, 190, 280, 25);
		//p.setBackground(Color.BLUE);
		JCheckBox jc=new JCheckBox("打篮球");
		jc.setFont(new Font("方正舒体",Font.BOLD,15));
		jc.setSelected(true);
		JCheckBox jc1=new JCheckBox("打游戏");
		jc1.setFont(new Font("方正舒体",Font.BOLD,15));
		JCheckBox jc2=new JCheckBox("跑步");
		jc2.setFont(new Font("方正舒体",Font.BOLD,15));
		JCheckBox jc3=new JCheckBox("游泳");
		jc3.setFont(new Font("方正舒体",Font.BOLD,15));
		p.add(jc);
		p.add(jc1);
		p.add(jc2);
		p.add(jc3);
		c.add(l5);
		c.add(p);
		
		
		//民族
		JLabel l6=new JLabel("民族:");
		l6.setBounds(120, 225, 60, 30);
		l6.setFont(new Font("华文隶书",Font.BOLD,20));
		l6.setForeground(Color.MAGENTA);
		
		String Isnation[]={"汉族","壮族","满族","回族","苗族","维吾尔族","土家族",
				  "彝族","蒙古族","藏族","布依族","侗族","瑶族","朝鲜族",
				  "白族","哈尼族","哈萨克族","黎族","傣族","畲族","傈僳族",
				  "仡佬族","东乡族","高山族","拉祜族","水族","佤族","纳西族",
				  "羌族","土族","仫佬族","锡伯族","柯尔克孜族","达斡尔族","景颇族",
				  "毛南族","撒拉族","布朗族","塔吉克族","阿昌族","普米族","鄂温克族",
				  "怒族","京族","基诺族","德昂族","保安族","俄罗斯族","裕固族 ",
				  "乌兹别克族","门巴族","鄂伦春族","独龙族","塔塔尔族","赫哲族","珞巴族"};
		
		JComboBox min=new JComboBox(Isnation);
		min.setBounds(190, 230, 90, 20);
		c.add(min);
		c.add(l6);
		
		//个性签名
		JLabel l7=new JLabel("个性签名:");
		l7.setBounds(80, 260, 100, 30);
		l7.setFont(new Font("方正姚体",Font.BOLD,20));
		//添加文本域
		JTextArea jt=new JTextArea();
		jt.setBounds(190, 260, 240, 100);
		jt.setFont(new Font("华文行楷",Font.BOLD,20));
		c.add(jt);
		
		c.add(l7);
		
		//添加按钮
		JButton b=new JButton("退出");
		b.setBounds(90, 410, 80, 40);
		b.setFont(new Font("华文行楷",Font.BOLD,20));
		c.add(b);
		JButton b1=new JButton("注册");
		b1.setBounds(310, 410, 80, 40);
		b1.setFont(new Font("华文行楷",Font.BOLD,20));
		c.add(b1);
		
		
		//插入广告
		JLabel jb=new JLabel(new ImageIcon("img/guanggao.gif"));
		jb.setBounds(0, 485, 480, 90);
		c.add(jb);
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,600);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		new Zhuce();
	}
	
	class Mylistener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==b1) {
				if (t1.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "请输入账号");
					t1.requestFocus();
					return;
				}
				
			}
		}
		
	}
	
}
