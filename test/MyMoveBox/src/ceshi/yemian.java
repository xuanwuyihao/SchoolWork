package ceshi;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class yemian extends JFrame{
	public yemian(){
		super("������2018");
		//�������
		Container c=getContentPane();
		//������岼��
		c.setLayout(new BorderLayout());
		//����ұ����
		JPanel p=new JPanel();
		//�����ұ����Ϊ�ղ���
		p.setLayout(null);
		//�����ұ�����ƫ�ô�С
		p.setPreferredSize(new Dimension(100,600));
		//���������ұ�
		c.add(p,BorderLayout.EAST);
		
		
		
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
