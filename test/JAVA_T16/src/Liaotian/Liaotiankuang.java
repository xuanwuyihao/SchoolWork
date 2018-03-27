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
		super("实现聊天功能");
		Container c=getContentPane();
		
		//上边面板
		JPanel j=new JPanel();
		//ID标签
		JLabel l=new JLabel("ID");
		j.add(l);
		//输入框
		t=new JTextField("127.0.0.1",7);
		j.add(t);
		
		//接收端口
		JLabel l1=new JLabel("接收端口");
		j.add(l1);
		String s="6666";
		String s1="9999";
		if (i==1) {
			s="9999";
			s1="6666";
		}
		//输入框
		t1=new JTextField(s,5);
		j.add(t1);
		
		//好友端口
		JLabel l2=new JLabel("好友端口");
		j.add(l2);
		//输入框
		t2=new JTextField(s1,5);
		j.add(t2);
		
		//上线按钮
		b=new JButton("上线");
		j.add(b);
		b.addActionListener(new Myactionlitener());
		c.add(j,BorderLayout.NORTH);
		
		//设置中间文本域
		ta=new JTextArea();
		//设置组件不能编辑
		ta.setEditable(false);
		//添加滚动面板
		JScrollPane js=new JScrollPane(ta);
		c.add(js);
		
		//设置下边面板
		JPanel j1=new JPanel();
		t3=new JTextField(35);
		t3.addKeyListener(new Mykeylistener());
		//添加提示
		t3.setToolTipText("按回车键发送");
		j1.add(t3);
		//设置发送按钮
		b1=new JButton("发送");
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
			if (e.getSource()==b) {//上线
				//获取接收端口，启动接收线程
				String str=t1.getText();
				int port=Integer.parseInt(str);
				//启动接收线程
				new MyThread(port).start();
				 
				//添加提示
				ta.setText("上线成功！");
				
				//把按钮变成不可编辑
				t.setEditable(false);
				t1.setEditable(false);
				t2.setEditable(false);
				b.setEnabled(false);
				
				//让输入框获取焦点
				t3.requestFocus();
			}else if (e.getSource()==b1) {//发送消息按钮
				//获取好友列表，端口，向该端口发送文框内容
				String sip=t.getText();//获取Ip
				String sport=t2.getText();//获取端口
				int top=Integer.parseInt(sport);
//				String msgs = new Date().toLocaleString() + "\n"
				String msgs= new Date().toLocaleString()+"\n"+t3.getText()+"\n";
				
				//自己说的话也要添加到文本域
				String content=ta.getText();
				content=content+"\n"+msgs;
//				System.out.println("---"+content);
				ta.setText(content);
				try {
					//发送端的数据报套接字
					DatagramSocket ds=new DatagramSocket();
					//将发送内容转换为数据
					byte[] bt=msgs.getBytes();
					DatagramPacket dp=new DatagramPacket(bt,bt.length
							,InetAddress.getByName(sip),top);
					//发送消息
					ds.send(dp);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//清空发送内容
				t3.setText("");
				//让发送框获取焦点
				t3.requestFocus();
			}
			
		}
		
	}
	//创建接收线程
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
			//创建通讯载体 接收消息 并连接到数据库
			byte[] bt=new byte[100];
			dp=new DatagramPacket(bt,bt.length);
			
			try {
				//启动消息接受
				ds.receive(dp);
				
				//把字节数组转换成字符串-----实际的接受长度
				String str=new String(bt,0,dp.getLength());
				//获取文本域之前的内容
				String connert=ta.getText();
				//再将文本域之前的内容加上新内容
				connert=connert+"\n"+str;
				//再把全部内容赋给文本域
				ta.setText(connert);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}
	//添加热键
	class Mykeylistener extends KeyAdapter{
		@Override
		public void keyReleased(KeyEvent e) {
			//按回车键发送消息
//			System.out.println("---"+e.getKeyCode());
			if (e.getKeyCode()==10) {
				b1.doClick();//让消息发送
			}
		}
	}
	public static void main(String[] args) {
		new Liaotiankuang(0);
		new Liaotiankuang(1);
	}
}
