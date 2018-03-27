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
		super("ע��ҳ��");
		Container c=getContentPane();
		c.setLayout(null);
		
		JLabel l=new JLabel("��ţ�");
		l.setBounds(20, 30, 40, 30);
		c.add(l);
		
		t=new JTextField();
		t.setBounds(70, 30, 150, 30);
		c.add(t);
		
		JLabel l1=new JLabel("������");
		l1.setBounds(20, 80, 40, 30);
		c.add(l1);
		
		t1=new JTextField();
		t1.setBounds(70, 80, 150, 30);
		c.add(t1);
		
		JLabel l2=new JLabel("���䣺");
		l2.setBounds(20, 130, 40, 30);
		c.add(l2);
		
		t2=new JTextField();
		t2.setBounds(70, 130, 150, 30);
		c.add(t2);
		
		JLabel l3=new JLabel("�Ա�");
		l3.setBounds(20, 180, 40, 30);
		c.add(l3);
		
		t3=new JTextField();
		t3.setBounds(70, 180, 150, 30);
		c.add(t3);
		
		JButton b=new JButton("ע��");
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
			if (e.getActionCommand().equals("ע��")) {
				//��ȡ�ı�������
				String id=t.getText();
				String sname=t1.getText();
				String eag=t2.getText();
				String sex=t3.getText();
				
				//����������Ϊʵ��baen
				Student student=new Student();
				student.setId(Integer.parseInt(id));
				student.setName(sname);
				student.setEag(Integer.parseInt(eag));
				student.setSex(sex);
				
				//���ñ��淽��
				IStudentService is=new StudentServiceImpl();
				boolean bln=is.addStudent(student);
				if (bln) {
					//����ɹ�
					JOptionPane.showConfirmDialog(null, "����ɹ���");
				}else {
					JOptionPane.showConfirmDialog(null, "����ʧ�ܣ�");
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new ZhuceDome();
	}
}
