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
		
		super("ע��ҳ��");
		Container c=getContentPane();
		c.setLayout(null);
		//����
		JLabel l=new JLabel("�˺�ע��");
		l.setBounds(170, 0, 220, 45);
		l.setFont(new Font("�����п�",Font.BOLD,40));
		l.setForeground(Color.BLUE);
		c.add(l);
		
		//�˺�
		JLabel l1=new JLabel("�˺�:");
		l1.setBounds(120, 50, 60, 30);
		l1.setFont(new Font("���Ĳ���",Font.BOLD,20));
		t1=new JTextField();
		t1.setBounds(180, 50, 190, 30);
		t1.setFont(new Font("΢���ź�",Font.BOLD,20));
		c.add(t1);
		c.add(l1);
		
		//����
		JLabel l2=new JLabel("����:");
		l2.setBounds(120, 85, 60, 30);
		l2.setFont(new Font("���Ĳ���",Font.BOLD,20));
		l2.setForeground(Color.green);
		JPasswordField j2=new JPasswordField();
		j2.setEchoChar('��');
		j2.setBounds(180, 85, 190, 30);
		c.add(j2);
		c.add(l2);
		
		//ȷ������
		JLabel l3=new JLabel("ȷ������:");
		l3.setBounds(80, 120, 120, 30);
		l3.setFont(new Font("��������",Font.BOLD,20));
		l3.setForeground(Color.RED);
		JPasswordField j3=new JPasswordField();
		j3.setEchoChar('��');
		j3.setBounds(180, 120, 190, 30);
		c.add(j3);
		c.add(l3);
		
		//�Ա�
		JLabel l4=new JLabel("�Ա�:");
		l4.setBounds(120, 155, 120, 30);
		l4.setFont(new Font("��Բ",Font.BOLD,20));
		l4.setForeground(Color.ORANGE);
		JRadioButton y=new JRadioButton("��");
		y.setSelected(true);
		y.setBounds(190, 155, 60, 35);
		y.setFont(new Font("�����п�",Font.BOLD,25));
		c.add(y);
		JRadioButton y1=new JRadioButton("Ů");
		y1.setBounds(300, 155, 60, 35);
		y1.setFont(new Font("�����п�",Font.BOLD,25));
		c.add(y1);
		c.add(l4);
		
		//��ѡ��ťҪ����
		ButtonGroup g=new ButtonGroup();
		g.add(y);
		g.add(y1);
		
		//����
		JLabel l5=new JLabel("����:");
		l5.setBounds(120, 190, 60, 30);
		l5.setFont(new Font("��������",Font.BOLD,20));
		l5.setForeground(Color.PINK);
		//�������װ������
		JPanel p=new JPanel();
		p.setBounds(180, 190, 280, 25);
		//p.setBackground(Color.BLUE);
		JCheckBox jc=new JCheckBox("������");
		jc.setFont(new Font("��������",Font.BOLD,15));
		jc.setSelected(true);
		JCheckBox jc1=new JCheckBox("����Ϸ");
		jc1.setFont(new Font("��������",Font.BOLD,15));
		JCheckBox jc2=new JCheckBox("�ܲ�");
		jc2.setFont(new Font("��������",Font.BOLD,15));
		JCheckBox jc3=new JCheckBox("��Ӿ");
		jc3.setFont(new Font("��������",Font.BOLD,15));
		p.add(jc);
		p.add(jc1);
		p.add(jc2);
		p.add(jc3);
		c.add(l5);
		c.add(p);
		
		
		//����
		JLabel l6=new JLabel("����:");
		l6.setBounds(120, 225, 60, 30);
		l6.setFont(new Font("��������",Font.BOLD,20));
		l6.setForeground(Color.MAGENTA);
		
		String Isnation[]={"����","׳��","����","����","����","ά�����","������",
				  "����","�ɹ���","����","������","����","����","������",
				  "����","������","��������","����","����","���","������",
				  "������","������","��ɽ��","������","ˮ��","����","������",
				  "Ǽ��","����","������","������","�¶�������","���Ӷ���","������",
				  "ë����","������","������","��������","������","������","���¿���",
				  "ŭ��","����","��ŵ��","�°���","������","����˹��","ԣ���� ",
				  "���ȱ����","�Ű���","���״���","������","��������","������","�����"};
		
		JComboBox min=new JComboBox(Isnation);
		min.setBounds(190, 230, 90, 20);
		c.add(min);
		c.add(l6);
		
		//����ǩ��
		JLabel l7=new JLabel("����ǩ��:");
		l7.setBounds(80, 260, 100, 30);
		l7.setFont(new Font("����Ҧ��",Font.BOLD,20));
		//����ı���
		JTextArea jt=new JTextArea();
		jt.setBounds(190, 260, 240, 100);
		jt.setFont(new Font("�����п�",Font.BOLD,20));
		c.add(jt);
		
		c.add(l7);
		
		//��Ӱ�ť
		JButton b=new JButton("�˳�");
		b.setBounds(90, 410, 80, 40);
		b.setFont(new Font("�����п�",Font.BOLD,20));
		c.add(b);
		JButton b1=new JButton("ע��");
		b1.setBounds(310, 410, 80, 40);
		b1.setFont(new Font("�����п�",Font.BOLD,20));
		c.add(b1);
		
		
		//������
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
					JOptionPane.showConfirmDialog(null, "�������˺�");
					t1.requestFocus();
					return;
				}
				
			}
		}
		
	}
	
}
