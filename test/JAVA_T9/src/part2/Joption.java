package part2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Joption extends JFrame{
	JButton b,b1,b2;
	public Joption(){
		super("����");
		
		//��������
		Container c=getContentPane();
		//����Ϊ������
		c.setLayout(new FlowLayout());
		b=new JButton("��Ϣ��");
		c.add(b);
		b1=new JButton("ѡ���");
		c.add(b1);
		b2=new JButton("�Ի���");
		c.add(b2);
		
		b. addActionListener(new MyButtonListener());
		b1.addActionListener(new MyButtonListener());
		b2.addActionListener(new MyButtonListener());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args){
		new Joption();
	}
	class MyButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==b) {
				JOptionPane.showConfirmDialog(null, "��ѡ������Ϣ��");
			}else if (e.getSource()==b1) {
				int x=JOptionPane.showConfirmDialog(null, "�Ƿ�Ҫ�˳�����");
				if (x==JOptionPane.NO_OPTION) {
					JOptionPane.showConfirmDialog(null, "�����˷�");
				}else if (x==JOptionPane.OK_OPTION) {
					JOptionPane.showConfirmDialog(null, "��������");
				}else if (x==JOptionPane.CANCEL_OPTION) {
					JOptionPane.showConfirmDialog(null, "������ȡ��");
					
				}
			}else if (e.getSource()==b2) {
				String str=  JOptionPane.showInputDialog(null, "����������");
				System.out.print(str);
				
			}
			
		}
		
	}
	
	
}
