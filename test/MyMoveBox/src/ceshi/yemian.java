package ceshi;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class yemian extends JFrame{
	public yemian(){
		super("推箱子2018");
		//创建面板
		Container c=getContentPane();
		//设置面板布局
		c.setLayout(new BorderLayout());
		//添加右边面板
		JPanel p=new JPanel();
		//设置右边面板为空布局
		p.setLayout(null);
		//设置右边面板的偏好大小
		p.setPreferredSize(new Dimension(100,600));
		//把面板放在右边
		c.add(p,BorderLayout.EAST);
		
		
		
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
