package cn.qq;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class Information extends JFrame implements MouseListener{

	private static final long serialVersionUID = 5015368054569273236L;

	private JLabel title,num,name,pwd,ip,age,nation,tip,mine,people,repwd,inter,sex,start;
	private JTextField numTxt,nameTxt,ipTxt,ageTxt,tipTxt,mineTxt,interTxt;
	private JPasswordField pwdTxt,repwdTxt;
	private JComboBox<String> nations,starts;
	private JRadioButton boy,girl;
	private JButton have,canel;
	private JLabel bg;
	
	private String nationes[]={"汉族","壮族","满族","回族","苗族","维吾尔族","土家族",
			  "彝族","蒙古族","藏族","布依族","侗族","瑶族","朝鲜族",
			  "白族","哈尼族","哈萨克族","黎族","傣族","畲族","傈僳族",
			  "仡佬族","东乡族","高山族","拉祜族","水族","佤族","纳西族",
			  "羌族","土族","仫佬族","锡伯族","柯尔克孜族","达斡尔族","景颇族",
			  "毛南族","撒拉族","布朗族","塔吉克族","阿昌族","普米族","鄂温克族",
			  "怒族","京族","基诺族","德昂族","保安族","俄罗斯族","裕固族 ",
			  "乌兹别克族","门巴族","鄂伦春族","独龙族","塔塔尔族","赫哲族","珞巴族"};
	
	private String startes[]={"白羊座","金牛座","双子座","巨蟹座",
			"狮子座","处女座","天秤座","天蝎座",
			"射手座","摩羯座","水瓶座","双鱼座",};
	
	public Information(){
		bg=new JLabel(new ImageIcon("src/Picture/1.gif"));		
		add(bg);
		
		title=new JLabel("个人资料");
		title.setFont(new Font("华文行楷",Font.BOLD,36));
		title.setBounds(170, 30, 250, 30);
		title.setForeground(Color.cyan);		
		bg.add(title);
		
		num=new JLabel("账号:");
		num.setBounds(70, 100, 60, 25);
		bg.add(num);
		
		numTxt=new JTextField();
		numTxt.setBounds(110, 100, 100, 25);
		numTxt.setBackground(new Color(0,0,0,0));
		bg.add(numTxt);
		
		name=new JLabel("昵称:");
		name.setBounds(70,140,60,25);
		bg.add(name);
		
		nameTxt=new JTextField();
		nameTxt.setBounds(110, 140, 100, 25);
		nameTxt.setBackground(new Color(0,0,0,0));
		bg.add(nameTxt);
		
		pwd=new JLabel("密码:");
		pwd.setBounds(70,180,60,25);
		bg.add(pwd);
		
		pwdTxt=new JPasswordField();
		pwdTxt.setBounds(110,180,100,25);
		pwdTxt.setBackground(new Color(0,0,0,0));
		bg.add(pwdTxt);
		
		ip=new JLabel("本机地址:");
		ip.setBounds(40,220,60,25);
		bg.add(ip);
		
		ipTxt=new JTextField();
		ipTxt.setBounds(110, 220, 100, 25);
		ipTxt.setBackground(new Color(0,0,0,0));
		bg.add(ipTxt);
		
		age=new JLabel("年龄");
		age.setBounds(70,260,60,25);
		bg.add(age);
		
		ageTxt=new JTextField();
		ageTxt.setBounds(110, 260, 60, 25);
		ageTxt.setBackground(new Color(0,0,0,0));
		bg.add(ageTxt);
		
		nation=new JLabel("名族:");
		nation.setBounds(70,300,60,25);
		bg.add(nation);
		
		nations=new JComboBox<String>(nationes);
		nations.setBounds(110,300,100,25);
		nations.setBackground(new Color(0,0,0,0));
		bg.add(nations);
		
		tip=new JLabel("备注:");
		tip.setBounds(70,340,60,25);
		bg.add(tip);
		
		tipTxt=new JTextField();
		tipTxt.setBounds(110, 340, 300, 25);
		tipTxt.setBackground(new Color(0,0,0,0));
		bg.add(tipTxt);
		
		mine=new JLabel("个性签名:");
		mine.setBounds(50,380,60,25);
		bg.add(mine);
		
		mineTxt=new JTextField();
		mineTxt.setBounds(110, 380, 300, 80);
		bg.add(mineTxt);
		
		people=new JLabel("头像:");
		people.setBounds(270,100,60,25);
		bg.add(people);
		
		repwd=new JLabel("确定密码:");
		repwd.setBounds(250,180,60,25);
		bg.add(repwd);
		
		repwdTxt=new JPasswordField();
		repwdTxt.setBounds(315,180,100,25);
		repwdTxt.setBackground(new Color(0,0,0,0));
		bg.add(repwdTxt);
		
		inter=new JLabel("连接端口:");
		inter.setBounds(250,220,60,25);
		bg.add(inter);
		
		interTxt=new JTextField();
		interTxt.setBounds(315, 220, 100, 25);
		interTxt.setBackground(new Color(0,0,0,0));
		bg.add(interTxt);
		
		sex=new JLabel("性别:");
		sex.setBounds(270,260,60,25);
		bg.add(sex);
		
		boy=new JRadioButton("男");
		girl=new JRadioButton("女");
		boy.setBounds(330,260,40,25);
		girl.setBounds(390,260,40,25);
		boy.setBackground(new Color(0,0,0,0));
		girl.setBackground(new Color(0,0,0,0));		
		ButtonGroup sexes=new ButtonGroup();
		sexes.add(boy);
		sexes.add(girl);
		bg.add(boy);
		bg.add(girl);
		
		start=new JLabel("星座:");
		start.setBounds(270,300,60,25);
		bg.add(start);
		
		starts=new JComboBox<String>(startes);
		starts.setBounds(300,300,80,25);
		starts.setBackground(new Color(0,0,0,0));
		bg.add(starts);
		
		have=new JButton("注册");
		have.setBounds(250,480,80,30);
		bg.add(have);
		
		canel=new JButton("关闭");
		canel.setBounds(350,480,80,30);
		bg.add(canel);
		
		canel.addMouseListener(this);
		have.addMouseListener(this);
		
		setSize(500,570);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Information();
			}
			
		});
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==canel){
			System.exit(0);
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
