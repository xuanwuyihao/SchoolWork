package Dao;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ZhuceDome extends JFrame{
	JTextField t,t1,t2,t3;
	public ZhuceDome(){
		super("注册页面");
		Container c=getContentPane();
		c.setLayout(null);
		
		JLabel l=new JLabel("编号：");
		l.setBounds(20, 30, 40, 30);
		c.add(l);
		
		t=new JTextField();
		t.setBounds(70, 30, 150, 30);
		c.add(t);
		
		JLabel l1=new JLabel("姓名：");
		l1.setBounds(20, 80, 40, 30);
		c.add(l1);
		
		t1=new JTextField();
		t1.setBounds(70, 80, 150, 30);
		c.add(t1);
		
		JLabel l2=new JLabel("年龄：");
		l2.setBounds(20, 130, 40, 30);
		c.add(l2);
		
		t2=new JTextField();
		t2.setBounds(70, 130, 150, 30);
		c.add(t2);
		
		JLabel l3=new JLabel("性别：");
		l3.setBounds(20, 180, 40, 30);
		c.add(l3);
		
		t3=new JTextField();
		t3.setBounds(70, 180, 150, 30);
		c.add(t3);
		
		JButton b=new JButton("注册");
		b.setBounds(110, 235, 60, 40);
		b.addActionListener(new MyActionlistener());
		c.add(b);
		
		setSize(300,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class MyActionlistener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("注册")) {
				//获取文本框内容
				String id=t.getText();
				String sname=t1.getText();
				String eag=t2.getText();
				String sex=t3.getText();
				
				//将属性设置为实体baen
				Student student=new Student();
				student.setId(Integer.parseInt(id));
				student.setName(sname);
				student.setEag(Integer.parseInt(eag));
				student.setSex(sex);
				
				//调用保存方法
				IStudentService is=new StudentServiceImpl();
				boolean bln=is.addStudent(student);
				if (bln) {
					//保存成功
					JOptionPane.showConfirmDialog(null, "保存成功！");
				}else {
					JOptionPane.showConfirmDialog(null, "保存失败！");
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new ZhuceDome();
	}
}
