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
	
	private String nationes[]={"����","׳��","����","����","����","ά�����","������",
			  "����","�ɹ���","����","������","����","����","������",
			  "����","������","��������","����","����","���","������",
			  "������","������","��ɽ��","������","ˮ��","����","������",
			  "Ǽ��","����","������","������","�¶�������","���Ӷ���","������",
			  "ë����","������","������","��������","������","������","���¿���",
			  "ŭ��","����","��ŵ��","�°���","������","����˹��","ԣ���� ",
			  "���ȱ����","�Ű���","���״���","������","��������","������","�����"};
	
	private String startes[]={"������","��ţ��","˫����","��з��",
			"ʨ����","��Ů��","�����","��Ы��",
			"������","Ħ����","ˮƿ��","˫����",};
	
	public Information(){
		bg=new JLabel(new ImageIcon("src/Picture/1.gif"));		
		add(bg);
		
		title=new JLabel("��������");
		title.setFont(new Font("�����п�",Font.BOLD,36));
		title.setBounds(170, 30, 250, 30);
		title.setForeground(Color.cyan);		
		bg.add(title);
		
		num=new JLabel("�˺�:");
		num.setBounds(70, 100, 60, 25);
		bg.add(num);
		
		numTxt=new JTextField();
		numTxt.setBounds(110, 100, 100, 25);
		numTxt.setBackground(new Color(0,0,0,0));
		bg.add(numTxt);
		
		name=new JLabel("�ǳ�:");
		name.setBounds(70,140,60,25);
		bg.add(name);
		
		nameTxt=new JTextField();
		nameTxt.setBounds(110, 140, 100, 25);
		nameTxt.setBackground(new Color(0,0,0,0));
		bg.add(nameTxt);
		
		pwd=new JLabel("����:");
		pwd.setBounds(70,180,60,25);
		bg.add(pwd);
		
		pwdTxt=new JPasswordField();
		pwdTxt.setBounds(110,180,100,25);
		pwdTxt.setBackground(new Color(0,0,0,0));
		bg.add(pwdTxt);
		
		ip=new JLabel("������ַ:");
		ip.setBounds(40,220,60,25);
		bg.add(ip);
		
		ipTxt=new JTextField();
		ipTxt.setBounds(110, 220, 100, 25);
		ipTxt.setBackground(new Color(0,0,0,0));
		bg.add(ipTxt);
		
		age=new JLabel("����");
		age.setBounds(70,260,60,25);
		bg.add(age);
		
		ageTxt=new JTextField();
		ageTxt.setBounds(110, 260, 60, 25);
		ageTxt.setBackground(new Color(0,0,0,0));
		bg.add(ageTxt);
		
		nation=new JLabel("����:");
		nation.setBounds(70,300,60,25);
		bg.add(nation);
		
		nations=new JComboBox<String>(nationes);
		nations.setBounds(110,300,100,25);
		nations.setBackground(new Color(0,0,0,0));
		bg.add(nations);
		
		tip=new JLabel("��ע:");
		tip.setBounds(70,340,60,25);
		bg.add(tip);
		
		tipTxt=new JTextField();
		tipTxt.setBounds(110, 340, 300, 25);
		tipTxt.setBackground(new Color(0,0,0,0));
		bg.add(tipTxt);
		
		mine=new JLabel("����ǩ��:");
		mine.setBounds(50,380,60,25);
		bg.add(mine);
		
		mineTxt=new JTextField();
		mineTxt.setBounds(110, 380, 300, 80);
		bg.add(mineTxt);
		
		people=new JLabel("ͷ��:");
		people.setBounds(270,100,60,25);
		bg.add(people);
		
		repwd=new JLabel("ȷ������:");
		repwd.setBounds(250,180,60,25);
		bg.add(repwd);
		
		repwdTxt=new JPasswordField();
		repwdTxt.setBounds(315,180,100,25);
		repwdTxt.setBackground(new Color(0,0,0,0));
		bg.add(repwdTxt);
		
		inter=new JLabel("���Ӷ˿�:");
		inter.setBounds(250,220,60,25);
		bg.add(inter);
		
		interTxt=new JTextField();
		interTxt.setBounds(315, 220, 100, 25);
		interTxt.setBackground(new Color(0,0,0,0));
		bg.add(interTxt);
		
		sex=new JLabel("�Ա�:");
		sex.setBounds(270,260,60,25);
		bg.add(sex);
		
		boy=new JRadioButton("��");
		girl=new JRadioButton("Ů");
		boy.setBounds(330,260,40,25);
		girl.setBounds(390,260,40,25);
		boy.setBackground(new Color(0,0,0,0));
		girl.setBackground(new Color(0,0,0,0));		
		ButtonGroup sexes=new ButtonGroup();
		sexes.add(boy);
		sexes.add(girl);
		bg.add(boy);
		bg.add(girl);
		
		start=new JLabel("����:");
		start.setBounds(270,300,60,25);
		bg.add(start);
		
		starts=new JComboBox<String>(startes);
		starts.setBounds(300,300,80,25);
		starts.setBackground(new Color(0,0,0,0));
		bg.add(starts);
		
		have=new JButton("ע��");
		have.setBounds(250,480,80,30);
		bg.add(have);
		
		canel=new JButton("�ر�");
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
