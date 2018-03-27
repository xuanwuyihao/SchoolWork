package Dome1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextCopyDome extends JFrame{
	JButton b,b1,b2;
	public TextCopyDome(){
		super("文本文件复制器");
		Container c=getContentPane();
		c.setLayout(null);
		JTextField j=new JTextField();
		j.setBounds(20, 15, 240, 30);
		c.add(j);
		b=new JButton("源文件");
		b.setBounds(280, 15, 90, 30);
		c.add(b);
		
		JTextField j1=new JTextField();
		j1.setBounds(20, 65, 240, 30);
		c.add(j1);
		b1=new JButton("目标文件");
		b1.setBounds(280, 65, 90, 30);
		c.add(b1);
		
		
		b2=new JButton("交换内容");
		b2.setBounds(150, 150, 90, 30);
		c.add(b2);
		
		setSize(400,300);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TextCopyDome();
		}
	class MyActionLisener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
}
