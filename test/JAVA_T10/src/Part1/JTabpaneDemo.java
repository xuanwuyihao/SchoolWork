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
		super("QQ�����");
		Container c=getContentPane();
		c.setBackground(new Color(223,223,223));
		setLayout(null);
		
		//����ͷ��
		JLabel j=new JLabel(new ImageIcon("MyImage/tu1.jpg"));
		j.setBounds(5, 30, 80, 80);
		c.add(j);
		
		//���ø���ǩ��
		JLabel j1=new JLabel("�������������α��ˣ���ôҪ�޶�ò��ܼ�ǿ��");
		j1.setBounds(87, 60, 150, 15);
		j1.setFont(new Font("����",Font.HANGING_BASELINE, 13));
		c.add(j1);
		
		//����ȼ�ͼƬ
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
		
		//���������б�
		//����һ���л����
		JTabbedPane jt=new JTabbedPane();
		
		//����
		String str[]={"ΰ��","С��","С��","С��","СФ"};
		JList jl=new JList(str);
		
		//Ա��
		String str1[]={"��˼��","������","����","����","�׾�"};
		JList jl1=new JList(str1);
		
		//Ͷ����
		String str2[]={"������","�°���","�վ�","���Ȼ�","�������","������"};
		JList jl2=new JList(str2);
		
		//��List��ӵ��л������
		jt.add("����",jl);
		jt.add("Ա��",jl1);
		jt.add("Ͷ����",jl2);
		
		//���л���嶨λ
		jt.setBounds(0, 130, 300, 500);
		c.add(jt);
		setSize(300,600);
		setVisible(true);
		
		
		
		setSize(300,630);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������Ļ�ֱ��ʶ�λ
		Toolkit tk=Toolkit.getDefaultToolkit();
		int whit=tk.getScreenSize().width;
		int hige=tk.getScreenSize().height;
		setLocation(whit-490,hige-730);
		
	}
	public static void main(String[] args) {
		new JTabpaneDemo();
	}

}
