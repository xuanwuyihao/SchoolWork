package Dome1;

import java.awt.Button;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FileDialogCopyDome extends JFrame{
	Button b,b1,b2;
	String s;
	JTextField j;
	String s1,s2;
	JTextField j1;
	public FileDialogCopyDome(){
		super("�ļ�������");
		Container c=getContentPane();
		c.setLayout(null);
		
		JLabel l=new JLabel("Ŀ���ļ���");
		l.setFont(new Font("�����п�",Font.BOLD,20));
		l.setBounds(5, 15, 105, 30);
		c.add(l);
		j=new JTextField();
		j.setBounds(110, 15, 300, 30);
		c.add(j);
		b=new Button("����");
		b.setBounds(415, 15, 60, 30);
		b.setSize(60,30);
//		b.setFont(new Font("����",Font.BOLD,2));
		c.add(b);
		b.addActionListener(new MyActionLisener());
		
		
		
		JLabel l1=new JLabel("Ŀ��Ŀ¼��");
		l1.setFont(new Font("�����п�",Font.BOLD,20));
		l1.setBounds(5, 85, 105, 30);
		c.add(l1);
		j1=new JTextField();
		j1.setBounds(110, 85, 300, 30);
		c.add(j1);
		b1=new Button("����");
		b1.setBounds(415, 85, 60, 30);
		b1.setSize(60,30);
//		b.setFont(new Font("����",Font.BOLD,2));
		c.add(b1);
		b1.addActionListener(new MyActionLisener());
		
		b2=new Button("��ʼ����");
		b2.setBounds(200, 175, 100, 30);
		b2.setSize(100,30);
		b2.setFont(new Font("����",Font.BOLD,20));
		c.add(b2);
		b2.addActionListener(new MyActionLisener());
		
//		System.out.println(s);
		
		setSize(500,300);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new FileDialogCopyDome();
	
	}
	
	class MyActionLisener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==b) {
				//�ļ�ѡ���(Ҫ��ʾ�����,ѡ���ı��⣬ѡ��������)
				FileDialog f=new FileDialog(FileDialogCopyDome.this,"��ѡ��Ҫ���Ƶ��ļ���"
						,FileDialog.LOAD);//ѡ���ļ�
				f.show();//��ѡ�����ʾ����
				//         ��ȡ·��                ��ȡ�ļ�����
				s1=f.getDirectory()+"\\"+f.getFile();
				s=f.getFile();
				System.out.println(s1);
				j.setText(s);
				
			}else if (e.getSource()==b1) {
				FileDialog f1=new FileDialog(FileDialogCopyDome.this,"��ѡ���Ƶ�Ŀ¼��",
						FileDialog.SAVE);//ѡ��Ŀ¼
				f1.setFile("");
				f1.show();
				s2=f1.getDirectory()+"\\"+s;
				System.out.println(s2);
				//���ı���ֵ
				j1.setText(s2);
			}
			if (e.getSource()==b2) {

				File f=new File(s1);
				File f2=new File(s2);
			//	
				try {
					FileInputStream fi=new FileInputStream(s1);
					
					FileOutputStream fi1=new FileOutputStream(s2);
					byte[] b=new byte[1024*1024];
					int cont=0;
					System.out.println("��ʼ���ƣ�");
					while (fi.read(b)>=0) {
						cont++;
						System.out.println("������"+cont+"�Σ�");
						fi1.write(b);
					}
					System.out.println("������ϣ�");
					fi.close();
					fi1.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		}
		
	}
}
