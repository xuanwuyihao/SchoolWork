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
	
	//����������
	String[] musicFile={ "nor.mid", "qin.mid", "popo.mid", "guang.mid",
	"eyes on me.mid" };
	//��������ʾ����
	String[] smusiz={"Ĭ��", "�������", "������", "��������", "eyes on me" };
	
	//����������
	JComboBox com;
	
	//�м����
	Centerpanel cen=new Centerpanel();
	
	public MyPanel(){		
		super("������2018");
		
		//���ô���ͼ��
		setIconImage(new ImageIcon("Image/3.gif").getImage());
		
		//�����������
		Container c=getContentPane();
		//������岼��
		c.setLayout(new BorderLayout());
		//����ұ����
		JPanel p=new JPanel();
		//�ұ�������ÿղ���
		p.setLayout(null);
		//���뱳��ͼƬ
		ImageIcon img=new ImageIcon("Image/tui1.jpg");
		JLabel j=new JLabel(img);
		j.setBounds(600, 0, 120, 600);
		c.add(j);
		
		//�ұ��������ƫ�ô�С
		p.setPreferredSize(new Dimension(120,600));
		//�������ұ�
		c.add(p,BorderLayout.EAST);
		
		//���ұ������Ӱ�ť
		Button b=new Button("����");
		b.setFont(new Font("����",Font.BOLD,20));
		Button b1=new Button("��һ��");
		b1.setFont(new Font("����",Font.BOLD,20));
		Button b2=new Button("��һ��");
		b2.setFont(new Font("����",Font.BOLD,20));
		Button b3=new Button("��һ��");
		b3.setFont(new Font("����",Font.BOLD,20));
		Button b4=new Button("��һ��");
		b4.setFont(new Font("����",Font.BOLD,20));
		Button b5=new Button("���չ�");
		b5.setFont(new Font("����",Font.BOLD,20));
		Button b6=new Button("ѡ��");
		b6.setFont(new Font("����",Font.BOLD,20));
		Button b7=new Button("����");
		b7.setFont(new Font("����",Font.BOLD,20));
		Button b8=new Button("�˳�");
		b8.setFont(new Font("����",Font.BOLD,20));
		
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

//		//�������������
//		com=new JComboBox(smusiz);
//		com.setBounds(5, 550, 110, 20);
//		p.add(com);
//		//com.addActionListener(new Myactionlisener());
		
		//���ֿ���
		Button b10=new Button("������");
		b10.setFont(new Font("����",Font.BOLD,20));
		b10.setBounds(5, 555, 110, 40);
		p.add(b10);
		//b10.addActionListener(new Myactionlisener());
		
		
		
		//�����м�����ƫ�ô�С
		cen.setPreferredSize(new Dimension(600,600));
		c.add(cen);
		
		
		pack();//�Զ����������С��ȷ�����ڴ�С
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MyPanel();
	}
	
	//���������
	class MyItemListener implements ItemListener{

		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			/*if (e.getSource()==com) {
				//�õ���ǰ��������±�
				int Index=com.getSelectedIndex();
				
				
			}*/
		}
		
	}
	
	class Myactionlisener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getActionCommand()=="����") {
				int level=cen.level;//��ȡ��ǰ�ؿ�
				cen.setlevel(level);//���ùؿ�
			}else if (e.getActionCommand()=="��һ��") {
				cen.huiyibu();
			}else if (e.getActionCommand()=="��һ��") {
				cen.setlevel(1);
			}else if (e.getActionCommand()=="��һ��") {
				int leve=cen.level;//��ȡ��ǰ�ؿ�
				if (leve<=1) {
					JOptionPane.showConfirmDialog(null, "����û�ؿ��ˣ�");
					return;
				}
				cen.setlevel(leve-1);
			}else if (e.getActionCommand()=="��һ��") {
				int leve=cen.level;//��ȡ��ǰ�ؿ�
				if (leve>=11) {
					JOptionPane.showConfirmDialog(null, "����û�ؿ��ˣ�");
					return;
				}
				cen.setlevel(leve+1);
			}else if (e.getActionCommand()=="���չ�") {
				cen.setlevel(11);
			}else if (e.getActionCommand()=="ѡ��") {
				//�����û�����Ĺؿ�
				String str_level= JOptionPane.showInputDialog("��ѡ��1��11��");
				//�����ܵĹؿ�ת��Ϊ����
				int level=0;
				try {
					level = Integer.parseInt(str_level);
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					JOptionPane.showConfirmDialog(null, "����������");
					return;
				}
				
				if (level>=1&&level<=11) {
					cen.setlevel(level);
				}else{
					JOptionPane.showConfirmDialog(null, "������1-11���ڵĹؿ�");
				}
				
			}else if (e.getActionCommand()=="˵��") {
				
			}else if (e.getActionCommand()=="�˳�") {
				new kaishi();
				//����˳��رյ�ǰҳ��
				MyPanel.this.dispose();
			}
		}
		
	}

}
