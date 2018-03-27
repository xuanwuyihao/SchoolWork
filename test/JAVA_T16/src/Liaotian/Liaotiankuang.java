package Liaotian;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sun.corba.se.impl.protocol.giopmsgheaders.KeyAddr;

public class Liaotiankuang extends JFrame{
	JTextField t,t1,t2,t3;
	JTextArea ta;
	JButton b,b1;
	public Liaotiankuang(int i){
		super("ʵ�����칦��");
		Container c=getContentPane();
		
		//�ϱ����
		JPanel j=new JPanel();
		//ID��ǩ
		JLabel l=new JLabel("ID");
		j.add(l);
		//�����
		t=new JTextField("127.0.0.1",7);
		j.add(t);
		
		//���ն˿�
		JLabel l1=new JLabel("���ն˿�");
		j.add(l1);
		String s="6666";
		String s1="9999";
		if (i==1) {
			s="9999";
			s1="6666";
		}
		//�����
		t1=new JTextField(s,5);
		j.add(t1);
		
		//���Ѷ˿�
		JLabel l2=new JLabel("���Ѷ˿�");
		j.add(l2);
		//�����
		t2=new JTextField(s1,5);
		j.add(t2);
		
		//���߰�ť
		b=new JButton("����");
		j.add(b);
		b.addActionListener(new Myactionlitener());
		c.add(j,BorderLayout.NORTH);
		
		//�����м��ı���
		ta=new JTextArea();
		//����������ܱ༭
		ta.setEditable(false);
		//��ӹ������
		JScrollPane js=new JScrollPane(ta);
		c.add(js);
		
		//�����±����
		JPanel j1=new JPanel();
		t3=new JTextField(35);
		t3.addKeyListener(new Mykeylistener());
		//�����ʾ
		t3.setToolTipText("���س�������");
		j1.add(t3);
		//���÷��Ͱ�ť
		b1=new JButton("����");
		j1.add(b1);
		b1.addActionListener(new Myactionlitener());
		c.add(j1,BorderLayout.SOUTH);
		
		setSize(500,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	class Myactionlitener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==b) {//����
				//��ȡ���ն˿ڣ����������߳�
				String str=t1.getText();
				int port=Integer.parseInt(str);
				//���������߳�
				new MyThread(port).start();
				 
				//�����ʾ
				ta.setText("���߳ɹ���");
				
				//�Ѱ�ť��ɲ��ɱ༭
				t.setEditable(false);
				t1.setEditable(false);
				t2.setEditable(false);
				b.setEnabled(false);
				
				//��������ȡ����
				t3.requestFocus();
			}else if (e.getSource()==b1) {//������Ϣ��ť
				//��ȡ�����б��˿ڣ���ö˿ڷ����Ŀ�����
				String sip=t.getText();//��ȡIp
				String sport=t2.getText();//��ȡ�˿�
				int top=Integer.parseInt(sport);
//				String msgs = new Date().toLocaleString() + "\n"
				String msgs= new Date().toLocaleString()+"\n"+t3.getText()+"\n";
				
				//�Լ�˵�Ļ�ҲҪ��ӵ��ı���
				String content=ta.getText();
				content=content+"\n"+msgs;
//				System.out.println("---"+content);
				ta.setText(content);
				try {
					//���Ͷ˵����ݱ��׽���
					DatagramSocket ds=new DatagramSocket();
					//����������ת��Ϊ����
					byte[] bt=msgs.getBytes();
					DatagramPacket dp=new DatagramPacket(bt,bt.length
							,InetAddress.getByName(sip),top);
					//������Ϣ
					ds.send(dp);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//��շ�������
				t3.setText("");
				//�÷��Ϳ��ȡ����
				t3.requestFocus();
			}
			
		}
		
	}
	//���������߳�
	class MyThread extends Thread{
		DatagramPacket dp=null;
		DatagramSocket ds=null;
		
		public MyThread(int pot){
			try {
				ds=new DatagramSocket(pot);
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			while(true){
			//����ͨѶ���� ������Ϣ �����ӵ����ݿ�
			byte[] bt=new byte[100];
			dp=new DatagramPacket(bt,bt.length);
			
			try {
				//������Ϣ����
				ds.receive(dp);
				
				//���ֽ�����ת�����ַ���-----ʵ�ʵĽ��ܳ���
				String str=new String(bt,0,dp.getLength());
				//��ȡ�ı���֮ǰ������
				String connert=ta.getText();
				//�ٽ��ı���֮ǰ�����ݼ���������
				connert=connert+"\n"+str;
				//�ٰ�ȫ�����ݸ����ı���
				ta.setText(connert);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}
	//����ȼ�
	class Mykeylistener extends KeyAdapter{
		@Override
		public void keyReleased(KeyEvent e) {
			//���س���������Ϣ
//			System.out.println("---"+e.getKeyCode());
			if (e.getKeyCode()==10) {
				b1.doClick();//����Ϣ����
			}
		}
	}
	public static void main(String[] args) {
		new Liaotiankuang(0);
		new Liaotiankuang(1);
	}
}
