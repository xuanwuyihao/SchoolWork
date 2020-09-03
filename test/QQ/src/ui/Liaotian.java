package ui;

import impl.QQUserServiceimp;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import service.IQQUserService;

import bean.QQMsg;
import bean.QQUser;

import ceshi.Photograph;

import com.sun.org.apache.bcel.internal.generic.LMUL;
import common.Contents;
import common.Msgsend;

public class Liaotian extends JFrame{
	
	//�رմ��ڱ�ǩ
	JLabel clos,xiao;
	//�ı���
	JTextPane review,send;
	//�������
	JComboBox font,fontsize;
	//��������
	String[] fonts={"����","�����п�","΢���ź�","����","����"};
	//�����С����
	String[] fontsizes={"12","14","16","18","20","22","24","26"};
	JButton fontcolor,doudong,sendfile,cancel,bq,sendmsg,jietu,tupian;
	//����ײ㷽��
	IQQUserService is=new QQUserServiceimp();
	
	QQUser myuser,fuser;
	public Liaotian(QQUser myuser,QQUser fuser){
		this.myuser=myuser;
		this.fuser=fuser;
		Container con=getContentPane();
		con.setLayout(null);
		//���ô���ͼ��---����ͷ��
		setIconImage(new ImageIcon(fuser.getFace()).getImage());
		this.setUndecorated(true);
		//���ô�����ק����
		this.setDragable();
		
		//�����Ӿ���ʽ
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//����ͼƬ
		JLabel hua=new JLabel(new ImageIcon("image/chuangko1.png"));
		hua.setBounds(0, 0, 597, 80);
//		con.add(hua);
	
		
		
		//�ر�ͼƬ
		clos=new JLabel(new ImageIcon(""));
		clos.addMouseListener(new MousetListener());
		clos.setCursor(new Cursor(Cursor.HAND_CURSOR));
		clos.setBounds(570, 0, 25, 30);
		con.add(clos);
		
		//����СͼƬ
		xiao=new JLabel(new ImageIcon(""));
		xiao.addMouseListener(new MousetListener());
		xiao.setCursor(new Cursor(Cursor.HAND_CURSOR));
		xiao.setBounds(510, 0, 25, 30);
		con.add(xiao);
		
		//ͷ��
		JLabel face=new JLabel(new ImageIcon(fuser.getFace()));
		face.setBounds(0, 0, 70, 70);
		con.add(face);
		
		//�ǳ�
		JLabel nikename=new JLabel(fuser.getUname());
		nikename.setBounds(80, 8, 100, 30);
		nikename.setFont(new Font("�����п�",Font.BOLD,20));
		con.add(nikename);
		
		//ǩ��
		JLabel Qm=new JLabel(fuser.getQm());
		Qm.setBounds(80, 28, 100, 20);
		Qm.setBackground(new Color(124,124,124));
		con.add(Qm);
		
		
		//���տ��ı���
		review=new JTextPane();
		JScrollPane s1=new 	JScrollPane(review);
		s1.setBounds(2, 80, 505, 290);
		review.setEditable(false);
		con.add(s1);
		
		
		JLabel xiu=new JLabel(new ImageIcon("image/xiu.png"));
		xiu.setBounds(507, 80, 90, 415);
		con.add(xiu);
		
		
		//�м����
		JPanel j=new JPanel();
//		j.setLayout(null);
		
		//����
		font=new JComboBox(fonts);
//		font.setBounds(2, 370, 50, 20);
		j.add(font);
		font.addItemListener(new MyltemListener());
		//�����С
		fontsize=new JComboBox(fontsizes);
		j.add(fontsize);
		fontsize.addItemListener(new MyltemListener());
		
		//������ɫ
		fontcolor =new JButton(new ImageIcon("image/w1.png"));
		j.add(fontcolor);
		fontcolor.addActionListener(new MyActionListener());
		
		//������ť
		doudong=new JButton(new ImageIcon("image/w3.png"));
		j.add(doudong);
		doudong.addActionListener(new MyActionListener());
		
		//���ͱ���
		bq=new JButton(new ImageIcon("image/w2.png"));
		j.add(bq);
		bq.addActionListener(new MyActionListener());
		
		//��ͼ
		jietu=new JButton(new ImageIcon("image/w5.png"));
		j.add(jietu);
		jietu.addActionListener(new MyActionListener());
		
		//����ͼƬ
		tupian=new JButton(new ImageIcon("image/w4.png"));
		j.add(tupian);
		tupian.addActionListener(new MyActionListener());
		
		//�����ļ�
		sendfile=new JButton("�����ļ�");
		j.add(sendfile);
		sendfile.addActionListener(new MyActionListener());
		
		
		//�м���嶨λ
		j.setBounds(0, 370,510, 35);
		con.add(j);
		
		//���Ϳ�
		send=new JTextPane();
		JScrollPane s2=new 	JScrollPane(send);
		s2.setBounds(2, 405, 505, 90);
		s2.setBorder(null);
		send.requestFocus();
		con.add(s2);
		
		//���Ͱ�ť
		sendmsg=new JButton(new ImageIcon("image/send.png"));
		sendmsg.setBounds(425,505,82, 20);
		con.add(sendmsg);
		sendmsg.addActionListener(new MyActionListener());
		
		//ȡ����ť
		cancel=new JButton(new ImageIcon("image/cancel.png"));
		cancel.setBounds(357,505,60, 20);
		con.add(cancel);
		cancel.addActionListener(new MyActionListener());
		
//		//�رմ���λ��
//		close=new JLabel();
//		close.setBounds(360, 0, 40, 25);
//		close.setBackground(Color.red);
//		//���ü�ͷΪ����
//		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		close.addMouseListener(new MousetListener());
//		con.add(close);
		
		//����ͼ
//		JLabel x=new JLabel(new ImageIcon("image/chuangko.png"));
//		add(x);
		
		
		add(hua);
		setSize(597,537);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			//����ͼƬ
			if (e.getSource()==tupian) {
				//����ѡ���ļ�����
				FileDialog fd=new FileDialog(Liaotian.this,"��ѡ��ͼƬ",FileDialog.LOAD);
				//�ô�����ʾ
				fd.show();
				//��ȡ�ļ�·��
				String filename=fd.getDirectory()+"//"+fd.getFile();
				
				//������Ϣ
				
				Icon icon=new ImageIcon(filename);
				send.insertIcon(icon);
		
			}
			
			
			//���ͽ�ͼ
			if (e.getSource()==jietu) {
				
				new Photograph();
				Photograph cam = new Photograph("C:/", "png");
				cam.snapShot();
			}
			
			if (e.getSource()==fontcolor) {
				//������ɫѡ����
				JColorChooser fcolor=new JColorChooser();
				//����ɫѡ���������
				Color color=fcolor.showDialog(Liaotian.this, "������ɫ", Color.BLACK);
				send.setForeground(color);
			}
			
			if (e.getSource()==doudong) {
				//�Լ���
				shake();
				
				//�Է���
				QQMsg msg=new QQMsg();
				msg.setCmd(Contents.CMD_SHKAE);
				msg.setMyUser(myuser);
				msg.setFUser(fuser);
				new Msgsend(msg);
				
				
			}else if (e.getSource()==sendfile) {//�����ļ�
				//����ѡ���ļ�����
				FileDialog fd=new FileDialog(Liaotian.this,"ѡ���ļ�",FileDialog.LOAD);
				//�ô�����ʾ
				fd.show();
				
				//��ȡ�ļ�·��
				String filename=fd.getDirectory()+"//"+fd.getFile();
				//������ļ�����
				File f=new File(filename);
				
				//�ж��ļ��Ƿ񳬹�64k
				if (f.length()>1024*64) {
					JOptionPane.showConfirmDialog(null, "��ѡ��С��64k���ļ�");	
					return;
				}
				
				//���ļ�ת��Ϊ�ֽ�����
				byte[] b=new byte[(int)f.length()];
				
				//�õ��ļ�������
				try {
					FileInputStream is=new FileInputStream(f);
					//���ļ���ȡ�ֽ�������
					is.read(b);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//�����ѷ����ļ���Ϣ
				QQMsg msg=new QQMsg();
				msg.setCmd(Contents.CMD_SENDFILE);//�ļ�����
				msg.setMyUser(myuser);
				msg.setFUser(fuser);
				msg.setFile(f.getName());//��ȡ�ļ�����
				msg.setB(b);//�ļ����ֽ�����
				new Msgsend(msg);
				
			}else if (e.getSource()==bq) {//���ͱ���
				
				new Bq(Liaotian.this);
			}else if (e.getSource()==sendmsg) {//����
				//�ѷ��Ϳ����ݷŵ����տ�
				appendView(myuser.getUname(), send.getStyledDocument());
				
				//����Ϣ���͸�����
				QQMsg msg=new QQMsg();
				//��Ϣ����
				msg.setCmd(Contents.CMD_CHAT);
				msg.setMyUser(myuser);
				msg.setFUser(fuser);
				msg.setDoc(send.getStyledDocument());//��������
				
				//������Ϣ
				new Msgsend(msg);
				
				//�ѷ��Ϳ����
				send.setText("");
			}else if (e.getSource()==cancel) {
				//�رյ�ǰ����
//				Liaotian.this.dispose();
				Liaotian.this.setVisible(false);
			}
			
		}
		
	}
	
	public void shake(){
		//��ȡ���ڵ�ǰλ��
		Point p=Liaotian.this.getLocationOnScreen();
		for (int i = 0; i < 20; i++) {
			if (i%2==0) {
				Liaotian.this.setLocation(p.x+5,p.y+5);
			}else {
				Liaotian.this.setLocation(p.x-5,p.y-5);
			}
			try {
				//��ʱ
				Thread.sleep(50);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	//���������
	class MyltemListener implements ItemListener{

		public void itemStateChanged(ItemEvent e) {
			if (e.getSource()==font||e.getSource()==fontsize) {
				//���������ȡ������������ɫ
				String fonts=font.getSelectedItem().toString();
				String size1=fontsize.getSelectedItem().toString();
				int sizes=Integer.parseInt(size1);
				send.setFont(new Font(fonts,Font.PLAIN,sizes));
				
			}
		}
		
	}
	
	class MousetListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource()==clos) {
				//�رմ���
//				Liaotian.this.dispose();
				Liaotian.this.setVisible(false);
			}else if (e.getSource()==xiao) {
				//���ڻ���С
				Liaotian.this.setExtendedState(Liaotian.this.ICONIFIED);
			}
		}
		public void mouseEntered(MouseEvent e){
			if (e.getSource()==clos) {
				clos.setIcon(new ImageIcon("image/downs.png"));
			}
		}
		
		public void mouseExited(MouseEvent e) {
			if (e.getSource()==clos) {
				clos.setIcon(new ImageIcon(""));
			}
		}
	}
	// �ѷ��Ϳ�������ύ�����տ� (�Լ����ǳƣ����Ϳ������)
	public void appendView(String name, StyledDocument xx) {
		try {
			// ��ȡ���տ���ĵ������ݣ�
			StyledDocument vdoc = review.getStyledDocument();// ��ȡ���տ������

			// ��ʽ��ʱ��
			Date date = new Date();// ��ȡϵͳ��ǰʱ��
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); // ������ʾʱ����ĸ�ʽ
			String time = sdf.format(date);// ��ȡʱ����
			// ����һ�����Լ���
			SimpleAttributeSet as = new SimpleAttributeSet();
			// ��ʾ˭˵
			// vdoc.getLength()��ȡ���տ��е�ԭ�����ݵĳ���
			String s = name + "  " + time + "\n";
			// saveRecord(name,s);//���������¼
			// ��ʾ�����տ�
			vdoc.insertString(vdoc.getLength(), s, as);
			int end = 0;
			// ������ʾ������
			while (end < xx.getLength()) {
				// ���һ��Ԫ��
				Element e0 = xx.getCharacterElement(end);
				// ��ȡ��Ӧ�ķ��
				SimpleAttributeSet as1 = new SimpleAttributeSet();
				StyleConstants.setForeground(as1, StyleConstants
						.getForeground(e0.getAttributes()));
				StyleConstants.setFontSize(as1, StyleConstants.getFontSize(e0
						.getAttributes()));
				StyleConstants.setFontFamily(as1, StyleConstants
						.getFontFamily(e0.getAttributes()));
				// ��ȡ��Ԫ�ص�����
				s = e0.getDocument().getText(end, e0.getEndOffset() - end);
				// ��Ԫ�ؼӵ��������
				if ("icon".equals(e0.getName())) {
					vdoc.insertString(vdoc.getLength(), s, e0.getAttributes());
				} else {
					vdoc.insertString(vdoc.getLength(), s, as1);
					// saveRecord(name,s+"\n");//���������¼
				}
				// getEndOffset�����������ǻ�ȡ��ǰԪ�صĳ���
				end = e0.getEndOffset();
			}
			// ����һ������
			vdoc.insertString(vdoc.getLength(), "\n", as);

			// ������ʾ��ͼ���ַ���λ�õ��ĵ���β���Ա���ͼ����
			review.setCaretPosition(vdoc.getLength());
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�����϶�

	/** ******** */
	// ���ý�������϶��ķ���
	Point loc = null;
	Point tmp = null;
	boolean isDragged = false;

	private void setDragable() {
		this.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent e) {
				isDragged = false;
				Liaotian.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(java.awt.event.MouseEvent e) {
				tmp = new Point(e.getX(), e.getY());

				isDragged = true;
				Liaotian.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				if (isDragged) {
					loc = new Point(Liaotian.this.getLocation().x + e.getX()
							- tmp.x, Liaotian.this.getLocation().y + e.getY()
							- tmp.y);
					Liaotian.this.setLocation(loc);
				}
			}
		});
	}
}