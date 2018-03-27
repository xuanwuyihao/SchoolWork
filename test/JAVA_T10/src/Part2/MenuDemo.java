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
	//�˵���
	JMenuBar j;
	//�˵�
	JMenu jm,jm1,jm2;
	//��ѡ�˵�
	JCheckBoxMenuItem jc,jc1;
	//��ѡ�˵�
	JRadioButtonMenuItem jr,jr1,jr2;
	//�˵���
	JMenuItem ji,ji1,ji2;
	//�����ǩ
	JLabel jl;
	
	public MenuDemo(){
		super("�˵���");
		
		//��ʼ���˵���
		j=new JMenuBar();
		//���˵������õ�������
		setJMenuBar(j);
		
		//��ʼ���ļ��˵�
		jm=new JMenu("�ļ�");
		//���˵�����˵�����
		j.add(jm);
		
		//�˵���
		ji=new JMenuItem("��(O)",new ImageIcon("MyImage2/add.gif"));
		ji1=new JMenuItem("����(S)",new ImageIcon("MyImage2/save.gif"));
		ji2=new JMenuItem("���Ϊ(A)",new ImageIcon("MyImage2/file.gif"));
		
		//���˵�����Ӽ���
		ji.addActionListener(new MyActionlistener());
		ji1.addActionListener(new MyActionlistener());
		ji2.addActionListener(new MyActionlistener());
		
		//���ò˵�����ȼ�
		ji.setMnemonic('o');
		ji1.setMnemonic('s');
		ji2.setMnemonic('a');
		
		//���˵�����ڲ˵���
		jm.add(ji);
		//�ڲ˵������һ������
		jm.addSeparator();
		jm.add(ji1);
		jm.add(ji2);
		
		//��ʼ�����ָ�ʽ�˵�
		jm1=new JMenu("���ָ�ʽ");
		j.add(jm1);
		
		//��ѡ�˵���
		jc=new JCheckBoxMenuItem("����");
		jm1.add(jc);
		jc1=new JCheckBoxMenuItem("б��");
		jm1.add(jc1);
		jc.addActionListener(new MyActionlistener());
		jc1.addActionListener(new MyActionlistener());
		
		
		//�����˵�
		jm2=new JMenu("������ɫ");
		
		//��ѡ�˵���
		jr=new JRadioButtonMenuItem("��ɫ");
		jr1=new JRadioButtonMenuItem("��ɫ");
		jr2=new JRadioButtonMenuItem("��ɫ");
		
		jr.addActionListener(new MyActionlistener());
		jr1.addActionListener(new MyActionlistener());
		jr2.addActionListener(new MyActionlistener());
		
		//��ѡ�˵�����ڶ����˵���
		jm2.add(jr);
		jm2.add(jr1);
		jm2.add(jr2);
		
		//��ѡ��ť���з���
		ButtonGroup g=new ButtonGroup();
		g.add(jr);
		g.add(jr1);
		g.add(jr2);
		
		//�������˵����ڲ˵���
		jm1.add(jm2);
		
		
		//�������
		Container c=getContentPane();
		
		jl=new JLabel("�ж���չ����־��񸸺�����˳�����");
		
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
			//�Բ˵�����м���
			if (e.getSource()==ji) {//��
				JOptionPane.showConfirmDialog(null, "�����˴�");
			}else if (e.getSource()==ji1) {
				JOptionPane.showConfirmDialog(null, "�����˴���");
			}else if (e.getSource()==ji2) {
			JOptionPane.showConfirmDialog(null, "���������Ϊ");
			}
			
			//�����ָ�ʽ�Ĳ˵�����м���
			if (e.getSource()==jc) {//����
				jl.setFont(new Font("�����п�",Font.BOLD,15));
			}else if (e.getSource()==jc1) {//б��
				jl.setFont(new Font("�����п�",Font.ITALIC,15));
			}else if (e.getSource()==jr) {//��ɫ
				jl.setForeground(Color.BLACK);
			}else if (e.getSource()==jr1) {//��ɫ
				jl.setForeground(Color.RED);
			}else if (e.getSource()==jr2) {//��ɫ
				jl.setForeground(Color.BLUE);
			}
			
		}
		
	}

}
