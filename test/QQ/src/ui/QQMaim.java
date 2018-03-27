package ui;



import impl.QQUserServiceimp;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

import common.Contents;
import common.Msgsend;
import common.Sound;
import common.TipUi;
import bean.QQHistory;
import bean.QQMsg;
import bean.QQUser;
import service.IQQUserService;
import ui.QQLogin1.MyActionListener;


public class QQMaim extends JFrame{
	JLabel la,la2,cls,xiao;
	JLabel nickname,leves,status,qm,touxiang,find,hf,jl,yy,lrq,yx,kj;
	
	//��ȡ�ײ㷽��
	IQQUserService is=new QQUserServiceimp();
	//�����б��list����
	JList list1,list2,list3,list4;
	//��ź�����Ϣ
	Vector<QQUser> vect1,vect2,vect3,vect4;
	
	//����ʽ�˵�
	JPopupMenu pop;
	//����ʽ�˵�ѡ��
	JMenuItem talk,info,del,mfriend,mfamily,mwork,mblack;
	
	//���Ѷ���
	QQUser frienduser;
	
	//��¼�û�����
	QQUser user;
	
	//״̬ѡ��ĵ���ʽ�˵�
	JPopupMenu popstate;
	JMenuItem it1,it2,it3,it4;//ѡ��
	
	//����ͼ��
	TrayIcon tray;		
	
	//����ͼ����Ҽ�
	PopupMenu traypop;
	MenuItem trayite1,trayite2;
	
	
	//����
	int a=1;
	
	//���������Ĺ���ĺ��Ѵ���
	Map<String, Liaotian> chats=new HashMap<String, Liaotian>();
	public QQMaim(QQUser user){
		Image taskbar = Toolkit.getDefaultToolkit().getImage(user.getFace());
		setIconImage(taskbar);
		
		//�Ѵ�����user���浽ȫ��
		this.user=user;
		
		//�����Ӿ���ʽ
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		this.setDragable();
		Container c=getContentPane();
		this.setUndecorated(true);
		//��������ʽ�˵�
		this.createPop();
		
	
		//�����ر����
		cls=new JLabel("");
		cls.setBounds(255, 2, 25, 25);
		cls.addMouseListener(new MousetListener());
		//���ü�ͷΪ����
		cls.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(cls);
		
		//����С
		xiao=new JLabel("");
		xiao.setBounds(228, 4, 25, 25);
		xiao.addMouseListener(new MousetListener());
		//���ü�ͷΪ����
		xiao.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(xiao);
		
		
		
		
		
		
		//��ʾ�ǳ�
		nickname=new JLabel(user.getUname());
		nickname.setBounds(80, 50, 100, 50);
		nickname.setFont(new Font("�����п�",Font.PLAIN,20));
		nickname.setForeground(Color.white);
		c.add(nickname);
		
		//��ʾ�ȼ�
		leves=new JLabel("LV "+user.getLeves());
		leves.setBounds(85, 30, 40, 50);
		leves.setFont(new Font("΢���ź�",Font.BOLD,10));
		leves.setForeground(new Color(235,240,49));
		c.add(leves);
		
		//��ʾ״̬
		String img="image/s_online.png";
		if (user.getStatus()==Contents.STATU_HIDE) {
			img="image/s_hide.png";
		}else if (user.getStatus()==Contents.STATU_BUSY) {
			img="image/s_leave.png";
		}else if (user.getStatus()==Contents.STATU_NODISTURB) {
			img="image/s_busy.png";
		}
		
		//��ʾ״̬
		//����ʽ�˵�
		popstate =new JPopupMenu();
		it1=new JMenuItem("������",new ImageIcon("image/s_online.png"));
		it2=new JMenuItem("����",new ImageIcon("image/s_hide.png"));
		it3=new JMenuItem("æµ",new ImageIcon("image/s_leave.png"));
		it4=new JMenuItem("�������",new ImageIcon("image/s_busy.png"));
		
		it1.addActionListener(new MyActionlistener());
		it2.addActionListener(new MyActionlistener());
		it3.addActionListener(new MyActionlistener());
		it4.addActionListener(new MyActionlistener());
		
		popstate.add(it1);
		popstate.add(it2);
		popstate.add(it3);
		popstate.add(it4);
		
		status=new JLabel(new ImageIcon(img));
		status.setBounds(60, 85, 15, 15);
		status.setFont(new Font("�����п�",Font.PLAIN,10));
		status.addMouseListener(new MousetListener());
//		status.setBackground(Color.red);
		c.add(status);
		
		//��ʾͷ��
		touxiang=new JLabel(new ImageIcon(user.getFace()));
		touxiang.setBounds(10, 35, 65, 65);
		touxiang.setCursor(new Cursor(Cursor.HAND_CURSOR));
		touxiang.setToolTipText("����޸�����");
		touxiang.addMouseListener(new MousetListener());
		c.add(touxiang);
		

		//��ʾǩ��
		nickname=new JLabel(user.getQm());
		nickname.setBounds(80, 70, 120, 50);
		nickname.setFont(new Font("�����п�",Font.PLAIN,12));
		c.add(nickname);
		
		
		
		UIManager.put("TabbedPane.contentOpaque", false);//JList���ò˵���Ϊ͸����ǰ��
		
		JTabbedPane tab=new JTabbedPane();
		// �����б���л����
		setBackground(new Color(0,0,0,0));
		tab.setBackground(new Color(0,0,0,0));
		tab.setPreferredSize(new Dimension(0, 0));
		tab.setBackground(new Color(0, 0, 0, 0));
		tab.setOpaque(false);
		
		list1=new JList();
		list2=new JList();
		list3=new JList();
		list4=new JList();
		
		//�б�͸��
		list1.setBackground(new Color(0,0,0,0));
		list1.setPreferredSize(new Dimension(0, 0));
		list1.setBackground(new Color(0, 0, 0, 0));
		list1.setOpaque(false);
		
		list2.setBackground(new Color(0,0,0,0));
		list2.setPreferredSize(new Dimension(0, 0));
		list2.setBackground(new Color(0, 0, 0, 0));
		list2.setOpaque(false);
		
		list3.setBackground(new Color(0,0,0,0));
		list3.setPreferredSize(new Dimension(0, 0));
		list3.setBackground(new Color(0, 0, 0, 0));
		list3.setOpaque(false);
		
		list4.setBackground(new Color(0,0,0,0));
		list4.setPreferredSize(new Dimension(0, 0));
		list4.setBackground(new Color(0, 0, 0, 0));
		list4.setOpaque(false);
		
		//��list��������
		list1.addMouseListener(new MousetListener());
		list2.addMouseListener(new MousetListener());
		list3.addMouseListener(new MousetListener());
		list4.addMouseListener(new MousetListener());
		
		//��ȡ������Ϣ
		this.flushMain();
			
		tab.add("   ����     ",list1);
		tab.setFont(new Font("�����п�",Font.PLAIN,15));
		tab.add("   ����     ",list2);
		tab.add("   ͬ��     ",list3);
		tab.add("  ������",list4);
		tab.setBounds(0, 165, 828, 420);
		c.add(tab);
		
		
		
		
		//���Һ���
		find=new JLabel(new ImageIcon(""));
		find.setBounds(179, 630, 30, 20);
		find.addMouseListener(new MousetListener());

		//���ü�ͷΪ����
		find.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(find);
		
		
		//������
		yy=new JLabel("");
		yy.setBounds(115, 600, 30, 20);
		yy.addMouseListener(new MousetListener());
		//���ü�ͷΪ����
		yy.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(yy);
		
		//����
		hf=new JLabel("");
		hf.setBounds(225, 110, 30, 20);
		hf.addMouseListener(new MousetListener());
		//���ü�ͷΪ����
		hf.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(hf);
		
		
		//�ռ�
		kj=new JLabel("");
		kj.setBounds(5, 110, 30, 20);
		kj.addMouseListener(new MousetListener());
		//���ü�ͷΪ����
		kj.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(kj);
		
		//�������
		lrq=new JLabel("");
		lrq.setBounds(30, 600, 30, 20);
		lrq.addMouseListener(new MousetListener());
		//���ü�ͷΪ����
		lrq.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(lrq);
		
		//����Ϸ
		yx=new JLabel("");
		yx.setBounds(240, 625, 50, 30);
		yx.addMouseListener(new MousetListener());
		//���ü�ͷΪ����
		yx.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(yx);

		//��ͼƬ�ڴ�������ʾ
		jl=new JLabel(new ImageIcon("image/main1.png"));
		add(jl);
		setSize(281,651);
		
		//�����λ��
		setLocation(980,50);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		//���������߳�
		new MyThread().start();
		
		//֪ͨ����������
		System.out.println("������� �û�״̬"+user.getStatus());
		
		String faces=user.getFace();//�õ�ͷ��·��
		if (user.getStatus()==Contents.STATU_ONLINE) {//����
			
//			System.out.println("֪ͨ����");
			this.notice(Contents.CMD_ONLINE);
			is.changestatus(user.getQqnum(), Contents.STATU_ONLINE);//����
			notice(Contents.CMD_ONLINE);
//			touxiang.setIcon(new ImageIcon(""));
		
		}else if (user.getStatus()==Contents.STATU_BUSY) {//����
			this.notice(Contents.CMD_BUSY);
			faces=faces.substring(0,faces.indexOf("."));
			faces=faces+"_l.png";
		}else if (user.getStatus()==Contents.STATU_NODISTURB) {//����
			this.notice(Contents.CMD_NODITURB);
			faces=faces.substring(0,faces.indexOf("."));
			faces=faces+"_w.png";
		}
		this.addWindowListener(new MyWindows());
		
		this.addMouseListener(new MousetListener());
	}
	
	public void notice(int cmd){
		//֪ͨ���ѡ����ˡ�ͬ��
		for (int i = 0; i <vect1.size(); i++) {
			QQUser fuser=vect1.get(i);//ȡ��ÿһ������
			QQMsg msg=new QQMsg();
			msg.setCmd(cmd);
			msg.setMyUser(user);
			msg.setFUser(fuser);
			new Msgsend	(msg);
		}
		
		
		for (int i = 0; i <vect2.size(); i++) {
			QQUser fuser=vect2.get(i);//ȡ��ÿһ������
			QQMsg msg=new QQMsg();
			msg.setCmd(cmd);
			msg.setMyUser(user);
			msg.setFUser(fuser);
			new Msgsend	(msg);
		}
		
		for (int i = 0; i <vect3.size(); i++) {
			QQUser fuser=vect3.get(i);//ȡ��ÿһ������
			QQMsg msg=new QQMsg();
			msg.setCmd(cmd);
			msg.setMyUser(user);
			msg.setFUser(fuser);
			new Msgsend	(msg);
		}
		
	}
	
	//�����촰�ڵķ���
	public Liaotian openChat(String fqqnum,QQMsg msg){
		//���ݺ��ѵ�QQ��ȥ�������ҿ���֮ǰ��û�д򿪹�
		Liaotian chat=chats.get(fqqnum);
		if (chat==null) {//��û�Ĺ���
			if(msg!=null){
			QQUser myuser=msg.getMyUser();//�ҵĶ���
			QQUser fUser=msg.getFUser();//���Ѷ���
			chat=new Liaotian(fUser,myuser);
			
		}else {
			chat=new Liaotian(user,frienduser);
		}
			chats.put(fqqnum,chat);
		}
		//��ʾ����
		chat.setVisible(true);
		return chat;
	}
	
	//�����߳�
	class MyThread extends Thread{
		@Override
		public void run() {
			//���Լ��Ķ˿�ʵʱ����
			try {
				int port=Integer.parseInt(user.getPort());
				DatagramSocket ds=new DatagramSocket(port);
				
				while(true){//һֱ����
					byte[] b=new byte[1024*25];
					
					DatagramPacket dp=new DatagramPacket(b,b.length);
					ds.receive(dp);
					
					//�ֽ�����������
					ByteArrayInputStream bis=new ByteArrayInputStream(b,0,dp.getLength());
					ObjectInputStream ios=new ObjectInputStream(bis);
					
					QQMsg msg=(QQMsg)ios.readObject();
					//������Ϣ�����ֽ��в�ͬ����
					if (msg.getCmd()==Contents.CMD_CHAT) {//����
						//�������촰��
//						new Liaotian(msg.getFUser(),msg.getMyUser());
						Liaotian chat=openChat(msg.getMyUser().getQqnum(), msg);
						//����Ϣ��ʾ�����տ�
						chat.appendView(msg.getMyUser().getUname(),msg.getDoc());
					}else if (msg.getCmd()==Contents.CMD_SHKAE) {
						//���ö������ڵķ���
						Liaotian chat=openChat(msg.getMyUser().getQqnum(), msg);
						chat.shake();
					}
					if (msg.getCmd()==Contents.CMD_ONLINE) {//����
//						System.out.println("���յ����ѵ�����֪ͨ");
						
						
						//ˢ�º������
						flushMain();
						
						//��������
						new Sound("Global.wav");
						
						//����������ʾ
						new TipUi(msg.getMyUser());
						
						
					}else if (msg.getCmd()==Contents.CMD_HIDE) {//����
						//ˢ�º������
						flushMain();
					}else if (msg.getCmd()==Contents.CMD_BUSY) {//æµ
						//ˢ�º������
						flushMain();
					}else if (msg.getCmd()==Contents.CMD_NODITURB) {//�������
						//ˢ�º������
						flushMain();
					}else if (msg.getCmd()==Contents.CMD_OFFLINE) {//����
						//ˢ�º������
						flushMain();
					}else if (msg.getCmd()==Contents.CMD_ADDFRIEND) {//��Ӻ���
						//��������
						new Sound("system.wav");
						QQUser myuser=msg.getMyUser();//�����
						QQUser fuser=msg.getFUser();//�������
						//������ʾ
					int i=JOptionPane.showConfirmDialog(null, myuser.getUname()+"��"+myuser.getQqnum()+"�� ������Ӻ��ѣ�"+"�����������"+JOptionPane.YES_NO_OPTION);
						System.out.println("�Ƿ� ���"+i);
						
						
						if (i==0) {//ͬ�����
							//����ѱ����������
							is.addFriend(myuser.getQqnum(), fuser.getQqnum(), "����");
							
							//ˢ�º������
							flushMain();
							
							//����ͬ����ӵ�֪ͨ
							QQMsg m=new QQMsg();
							m.setCmd(Contents.CMD_FRIENDYES);
							m.setMyUser(fuser);
							m.setFUser(myuser);
							new Msgsend(m);
						}else {
							//���;ܾ���ӵ�֪ͨ
							QQMsg m=new QQMsg();
							m.setCmd(Contents.CMD_FRIENDNO);//�ܾ����
							m.setMyUser(fuser);
							m.setFUser(myuser);
							new Msgsend(m);
						}
					}else if (msg.getCmd()==Contents.CMD_FRIENDYES) {//ͬ����Ӻ���
						//ˢ�����
						flushMain();
						//������ʾ
						JOptionPane.showConfirmDialog(null, msg.getMyUser().getUname()+"ͬ�����������");
					}else if (msg.getCmd()==Contents.CMD_FRIENDNO) {//ͬ����Ӻ���
						//ˢ�����
						flushMain();
						//������ʾ
						JOptionPane.showConfirmDialog(null, msg.getFUser().getUname()+"�ܾ����������");
					}else if (msg.getCmd()==Contents.CMD_SENDFILE) {//�ļ�����
						QQUser myuser=msg.getMyUser();//������
						QQUser fuser=msg.getFUser();//������
						//�����Ƿ���նԻ���
						int i=JOptionPane.showConfirmDialog(null, myuser.getUname()+"���㷢���ļ�["+msg.getFile()+"],�Ƿ���գ�","�ļ�����",JOptionPane.YES_NO_OPTION);
						if (i==0) {//ͬ�����
							//��·��ѡ���
							FileDialog fd=new FileDialog(QQMaim.this,"�ļ�����",FileDialog.SAVE);
							//���ñ�������
							fd.setFile(msg.getFile());
							//��ʾ������
							fd.show();
							
							String filename=fd.getDirectory()+"//"+fd.getFile();
							
							//�ļ�����
							File file =new File(filename);
							if (!file.exists()) {//����ļ�������
								file.createNewFile();//�������ļ�
								
							}
							//�����ļ������
							FileOutputStream fo=new FileOutputStream(file);
							fo.write(msg.getB());//���ֽ�����д���ļ���
							fo.close();
							
							//�ظ�����
							QQMsg m=new QQMsg();
							m.setCmd(Contents.CMD_FILEYES);//ͬ�����
							m.setMyUser(fuser);
							m.setFUser(myuser);
							new Msgsend(m);
							
						}else {//�ܾ�
							//�ظ�����
							QQMsg m=new QQMsg();
							m.setCmd(Contents.CMD_FILENO);//�ܽӽ���
							m.setMyUser(fuser);
							m.setFUser(myuser);
							new Msgsend(m);
						}
					}else if (msg.getCmd()==Contents.CMD_FILEYES	) {//ͬ�����
						JOptionPane.showConfirmDialog(null, "�Է��ѳɹ���������ļ�!");
					}else if (msg.getCmd()==Contents.CMD_FILENO	) {//�ܾ�����
						JOptionPane.showConfirmDialog(null, "�Է��ܾ���������ļ�!");
					}else if (msg.getCmd()==Contents.CMD_DELFRIEND) {//ɾ������
						//ˢ�����
						flushMain();
					}
					
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	class MyWindows extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			//�������ݿ��û�״̬
			is.changestatus(user.getQqnum(),Contents.STATU_OFFLINE);
			
			//֪ͨ����
			notice(Contents.CMD_OFFLINE);
			
			System.exit(0);
		}
		@Override
		public void windowIconified(WindowEvent e) {
			//������С��ʱ
			
			//�Ȼ�ȡϵͳ��������ͼ��
			SystemTray stray=SystemTray.getSystemTray();
			
			if (tray!=null) {
				//���֮ǰ������ͼ������ô��ͼ���Ƴ����´���
				stray.remove(tray);
			}
			//�����µ�����ͼ��
			createtray();
			
			//���������
			QQMaim.this.setVisible(false);
			try {
				stray.add(tray);
			} catch (AWTException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	//��������ʽ�˵�
	public void createPop(){
		//��ʼ������ʽ�˵�
		pop=new JPopupMenu();
		
		//�����˵���
		talk=new JMenuItem("����");
		info=new JMenuItem("�鿴������Ϣ");
		del=new JMenuItem("ɾ���ú���");
		mfriend=new JMenuItem("�ƶ������ѷ���");
		mfamily=new JMenuItem("�ƶ������˷���");
		mwork=new JMenuItem("�ƶ���ͬ�·���");
		mblack=new JMenuItem("�ƶ���������");
		
		//�Ѳ˵�����ӵ�����ʽ�˵���
		pop.add(talk);
		pop.add(info);
		pop.add(del);
		pop.add(mfriend);
		pop.add(mfamily);
		pop.add(mwork);
		pop.add(mblack);
		
		//������ʽ�˵���Ӱ�ť����
		talk.addActionListener(new MyActionlistener());
		info.addActionListener(new MyActionlistener());
		del.addActionListener(new MyActionlistener());
		mfriend.addActionListener(new MyActionlistener());
		mfamily.addActionListener(new MyActionlistener());
		mwork.addActionListener(new MyActionlistener());
		mblack.addActionListener(new MyActionlistener());
		
	}
	
	class MyActionlistener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==talk) {//����ʽ�˵�--����
//				new Liaotian(user,frienduser);
				openChat(frienduser.getQqnum(), null);
				
			}else if (e.getSource()==info) {//����ʽ�˵�--�鿴����
				//�鿴��������
				new QQfriendinfo(frienduser);
				
			}else if (e.getSource()==del) {//����ʽ�˵�--ɾ������
				//ɾ�����ݿ�����
				is.delFriend(user.getQqnum(),frienduser.getQqnum());
				//ˢ���Լ������
				flushMain();
				//֪ͨ����
				QQMsg msg=new QQMsg();
				msg.setCmd(Contents.CMD_DELFRIEND);//ɾ������
				msg.setMyUser(user);
				msg.setFUser(frienduser);
				new Msgsend(msg);
				
			}else if (e.getSource()==mfriend) {//����ʽ�˵�--�ƶ������ѷ���
				is.moveFriend(user.getQqnum(), frienduser.getQqnum(), "����");
				//ˢ�����
				flushMain();
			}else if (e.getSource()==mfamily) {//����ʽ�˵�--�ƶ������˷���
				is.moveFriend(user.getQqnum(), frienduser.getQqnum(), "����");
				//ˢ�����
				flushMain();
			}else if (e.getSource()==mwork) {//����ʽ�˵�--�ƶ���ͬ�·���
				is.moveFriend(user.getQqnum(), frienduser.getQqnum(), "ͬ��");
				//ˢ�����
				flushMain();
			}else if (e.getSource()==mblack) {//����ʽ�˵�--�ƶ���������
				is.moveFriend(user.getQqnum(), frienduser.getQqnum(), "������");
				//ˢ�����
				flushMain();
			}
			
			if (e.getSource()==it1) {
				status.setIcon(new ImageIcon("image/s_online.png"));
				//�ı����ݿ��״̬
				is.changestatus(user.getQqnum(), Contents.STATU_ONLINE);//����
				notice(Contents.CMD_ONLINE);
			}else if (e.getSource()==it2) {
				status.setIcon(new ImageIcon("image/s_hide.png"));
				is.changestatus(user.getQqnum(), Contents.STATU_HIDE);//����
				notice(Contents.CMD_HIDE);
			}else if (e.getSource()==it3) {
				status.setIcon(new ImageIcon("image/s_leave.png"));
				is.changestatus(user.getQqnum(), Contents.STATU_BUSY);//æµ
				notice(Contents.CMD_BUSY);
			}else if (e.getSource()==it4) {
				status.setIcon(new ImageIcon("image/s_busy.png"));
				is.changestatus(user.getQqnum(), Contents.STATU_NODISTURB);//�������
				notice(Contents.CMD_NODITURB);
			}
			//����ͼ��
			if (e.getSource()==trayite1) {//�������
				QQMaim.this.setVisible(true);//��ʾ����
				setState(JFrame.NORMAL);//�ô���������ʾ
			}else if (e.getSource()==trayite2) {//�˳�
				//�����û�Ϊ����
				is.changestatus(user.getQqnum(),Contents.STATU_OFFLINE);
				//֪ͨ����
				notice(Contents.CMD_OFFLINE);
				System.exit(0);
			}
		}
		
	}
	
	//����ͼ��
	public void createtray(){
		//��������ͼ����Ҽ�
		traypop=new PopupMenu();
		trayite1=new MenuItem("�������");
		trayite2=new MenuItem("�˳�");
		
		traypop.add(trayite1);
		traypop.add(trayite2);
		
		//��Ӱ�ť����
		trayite1.addActionListener(new MyActionlistener());
		trayite2.addActionListener(new MyActionlistener());
		
		//��������ͼ��
		Image ic=new ImageIcon("image/qier.png").getImage();
		//��ʼ������ͼ�꣨ͼ�ꡢ��ʾ���ݣ�
		tray=new TrayIcon(ic,user.getUname()+"["+user.getQqnum()+"]",traypop);
		//��ͼ�������Ļ��Ӧ��С
		tray.setImageAutoSize(true);
		//���������
		tray.addMouseListener(new MousetListener());
	}
	
	
	//�б�ģ������
	class MylistModel extends AbstractListModel{
		Vector<QQUser> v=new Vector<QQUser>();
		 public MylistModel(Vector<QQUser> users) {
			 this.v=users;
		}
	
		//���췽��
		public Object getElementAt(int index) {
			return null;
		}

		public int getSize() {
			// TODO Auto-generated method stub
			return v.size();
		}
	}
	
	//����jlist��ÿһ��������Ϣ
	class MyDefaultListCellRender extends DefaultListCellRenderer{
		Vector<QQUser> datas=new Vector<QQUser>();
		public MyDefaultListCellRender(Vector<QQUser> users) {
			this.datas=users;
		}
		@Override
		public Component getListCellRendererComponent(JList list, Object arg1,
				int index, boolean isSelected, boolean arg4) {
			if (index>=0&&index<datas.size()) {//�����ݽ���
				QQUser user=datas.get(index);//�Ӽ����л�ȡ�û�����
				String face=user.getFace();//�õ�ͷ��·��
				//�����û���ͬ״̬��ʾ��ͬͷ��
				if (user.getStatus()==Contents.STATU_OFFLINE||user.getStatus()==Contents.STATU_HIDE) {
					//��������߻���������ʾ��ɫͷ��
					face=face.substring(0,face.indexOf("."));
					face=face+"_h.png";
				}else if (user.getStatus()==Contents.STATU_BUSY) {//æµ
					face=face.substring(0,face.indexOf("."));
					face=face+"_l.png";
				}else if (user.getStatus()==Contents.STATU_NODISTURB) {
					face=face.substring(0,face.indexOf("."));
					face=face+"_w.png";
				}
				setIcon(new ImageIcon(face));//����ͷ��
				setText(user.getUname()+"["+user.getQqnum()+"]"+user.getQm());//ǩ��
				
				//������꾭������ʽ
				if (isSelected) {//�����ѡ��
					setBackground(list.getSelectionBackground());
					setForeground(list.getSelectionForeground());
				}else{
					setBackground(list.getBackground());
					setForeground(list.getForeground());
				}
				setEnabled(list.isEnabled());
				setFont(list.getFont());
			}
			return this;	
		}
	}
	//ˢ�������
	public void flushMain(){
		vect1=is.selFriendByGroup(user.getQqnum(), "����");
		vect2=is.selFriendByGroup(user.getQqnum(), "����");
		vect3=is.selFriendByGroup(user.getQqnum(), "ͬ��");
		vect4=is.selFriendByGroup(user.getQqnum(), "������");
		
		//��̬����Jlist
		list1.setModel(new MylistModel(vect1));
		list1.setCellRenderer(new MyDefaultListCellRender(vect1));
		
		list2.setModel(new MylistModel(vect2));
		list2.setCellRenderer(new MyDefaultListCellRender(vect2));
		
		list3.setModel(new MylistModel(vect3));
		list3.setCellRenderer(new MyDefaultListCellRender(vect3));
		
		list4.setModel(new MylistModel(vect4));
		list4.setCellRenderer(new MyDefaultListCellRender(vect4));
	}
	class MousetListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			
			//�򿪿ռ�
			if (e.getSource()==kj) {
			new QQzone();
			String url =" https:ssl.ptlogin2.qq.com/jump?pt_clientver=5515&pt_src=1&keyindex=9&ptlang=2052&clientuin=984208452&clientkey=000158B4DB980068EB2F64BC16969C5FF7E6682ACAC32F5B5D0203BCBE259B61D0DC0F5D77A6D5970F0E806905122C6B29AE7D91A5361A1DD65F183DA4645A5F11E3CB84A418B27B3D351C9DA9897BA218A54CC655F856DC00495FBAE2809EE1A9BA33FE7123EAA9E23E22D36C67AC71&u1=http%3A%2F%2Fuser.qzone.qq.com%2F984208452%2Finfocenter&source=panelstar";

			QQzone.openURL(url);
					
			}
			
			
			
			//����Ϸ
			if (e.getSource()==yx) {
				new QQzone();
				String url =" F:/����vs��Ӱ/huoyinsis26/BVN 2.6.swfr";

				QQzone.openURL(url);
				
					
			}
			
			//�������
			if (e.getSource()==lrq) {
			
					Runtime r=Runtime.getRuntime();
					Process s=null;
					try {
						s=r.exec("C:/Program Files (x86)/Tencent/QQBrowser/QQBrowser.exe");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				
			}
			//����
			if (e.getSource()==yy) {
				if (e.getClickCount()==1) {
					Runtime u=Runtime.getRuntime();
					Process c=null;
					try {
						c=u.exec("C:/Program Files (x86)/Netease/CloudMusic/cloudmusic.exe");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
			
			//����
			if (e.getSource()==hf) {
				if (e.getClickCount()==1) {
					if(a==6){
						jl.setIcon(new ImageIcon("image/main"+a+".png"));
						a=1;
					}else{
						jl.setIcon(new ImageIcon("image/main"+a+".png"));
						a++;
					}
				}
			}
			
			//��ʾ����ͼ��
			if (e.getSource()==tray&&e.getButton()==1) {//�����Ҽ���ʾ����ͼ��
				QQMaim.this.setVisible(true);//��ʾ����
				setState(JFrame.NORMAL);//�ô���������ʾ
			}
			if (e.getSource()==find) {
				new QQFind(user);//�򿪲��Һ������
			}
			
			if (e.getSource()==status) {//�����״̬
				popstate.show(status,e.getX(),e.getY());//��ʾ����ʽ����
				
			}else if (e.getSource()==cls) {

				//�����û�Ϊ����
				is.changestatus(user.getQqnum(),Contents.STATU_OFFLINE);
				//֪ͨ����
				notice(Contents.CMD_OFFLINE);
				System.exit(0);
			}else if (e.getSource()==xiao) {
				//�ô��ڻ���С
				QQMaim.this.setExtendedState(QQMaim.this.ICONIFIED);
			}
			//���ѷ���
			if (e.getSource()==list1&&list1.getSelectedIndex()!=-1) {
				//��vecte�л�ȡ���ѵ��û�����
				frienduser=vect1.get(list1.getSelectedIndex());
				if (e.getButton()==1&&e.getClickCount()==2) {//˫��
					openChat(frienduser.getQqnum(), null);
				}
				if (e.getButton()==3) {//����Ҽ�
					//��ʾ����ʽ�˵�
					pop.show(list1,e.getX(),e.getY());
				}
			}
			//���˷���
			if (e.getSource()==list2&&list2.getSelectedIndex()!=-1) {
				//��vecte�л�ȡ���ѵ��û�����
				frienduser=vect2.get(list2.getSelectedIndex());
				if (e.getButton()==1&&e.getClickCount()==2) {//˫��
					openChat(frienduser.getQqnum(), null);
				}
				if (e.getButton()==3) {//����Ҽ�
					//��ʾ����ʽ�˵�
					pop.show(list2,e.getX(),e.getY());
				}
			}
			//ͬ�·���
			if (e.getSource()==list3&&list3.getSelectedIndex()!=-1) {
				//��vecte�л�ȡ���ѵ��û�����
				frienduser=vect3.get(list3.getSelectedIndex());
				if (e.getButton()==1&&e.getClickCount()==2) {//˫��
					openChat(frienduser.getQqnum(), null);
				}
				if (e.getButton()==3) {//����Ҽ�
					//��ʾ����ʽ�˵�
					pop.show(list3,e.getX(),e.getY());
				}
			}
			//������
			if (e.getSource()==list4&&list4.getSelectedIndex()!=-1) {
				//��vecte�л�ȡ���ѵ��û�����
				frienduser=vect4.get(list4.getSelectedIndex());
				if (e.getButton()==1&&e.getClickCount()==2) {//˫��
					openChat(frienduser.getQqnum(), null);
				}
				if (e.getButton()==3) {//����Ҽ�
					//��ʾ����ʽ�˵�
					pop.show(list4,e.getX(),e.getY());
				}
			}
			if (e.getSource()==touxiang) {
				new ziliao(user);
				
//				new QQUPdinof(user);
			}
			}
		//��������¼�
		public void mouseEntered(MouseEvent e) {
			Point p = QQMaim.this.getLocationOnScreen();
			if (e.getSource()==cls) {
				
				cls.setIcon(new ImageIcon("image/downs.png"));
			}
			if (e.getSource()==xiao) {
				xiao.setIcon(new ImageIcon("image/min_over.PNG"));
			}
		
			if(p.y<=10){
				p.y = 0;
				QQMaim.this.setLocation(p);
			}
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource()==cls) {
//				System.out.println("-------");
				cls.setIcon(new ImageIcon(""));
			}
			if (e.getSource()==xiao) {
				xiao.setIcon(new ImageIcon(""));
			}
			
			Point p = QQMaim.this.getLocationOnScreen();
			if(p.y==0){
				p.y = -647;
				QQMaim.this.setLocation(p);
			}
		}
		}
	
//	//
//	class setLevels extends Thread{
//		@Override
//		public void run() {
//			if () {
//				
//			}
//		}
//	}
		
		
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
				QQMaim.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				
				Point p = QQMaim.this.getLocationOnScreen();
				if (p.y < 10) {
					p.y = -647;
					QQMaim.this.setLocation(p);
				}
			}

			public void mousePressed(java.awt.event.MouseEvent e) {
				tmp = new Point(e.getX(), e.getY());

				isDragged = true;
				QQMaim.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				if (isDragged) {
					loc = new Point(QQMaim.this.getLocation().x + e.getX()
							- tmp.x, QQMaim.this.getLocation().y + e.getY()
							- tmp.y);
					QQMaim.this.setLocation(loc);
				}
			}
		});
	}
}
