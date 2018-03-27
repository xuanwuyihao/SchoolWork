package ui;



import impl.QQUserServiceimp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Point;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import common.Contents;

import bean.QQHistory;
import bean.QQUser;
import service.IQQUserService;
import ui.QQRec.MousetListener;


public class QQLogin1 extends JFrame{
	JLabel la,la2,cls,xiao,statu,gb,zx;
	JComboBox account;
	JPasswordField pwd;
	JPanel p3;
	JLabel jb,jlb,jbe,jbel;
	JCheckBox j1,j2;
	String[] accs={""};
	//״̬ѡ��ĵ���ʽ�˵�
	JPopupMenu popstate;
	JMenuItem it1,it2,it3,it4;//ѡ��
	
	
	
	Container c;
	
	//��ȡ�ײ㷽��
	IQQUserService is=new QQUserServiceimp();
	List list=is.selHistory();//��ѯ��¼��ʷ
	public QQLogin1(){
		//�����Ӿ���ʽ
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		this.setDragable();
		//��ȡ��¼��ʷ
		this.getHistoryFromList();
		c=getContentPane();
		this.setUndecorated(true);
		
		
		//״̬
		statu=new JLabel(new ImageIcon("image/s_online.png"));
		statu.setBounds(101,255,15,15);
		c.add(statu);
		statu.addMouseListener(new MousetListener());
		
		//����ʽ�˵�
		popstate =new JPopupMenu();
		it1=new JMenuItem("������",new ImageIcon("image/s_online.png"));
		it2=new JMenuItem("����",new ImageIcon("image/s_hide.png"));
		it3=new JMenuItem("æµ",new ImageIcon("image/s_leave.png"));
		it4=new JMenuItem("�������",new ImageIcon("image/s_busy.png"));
		
		it1.addActionListener(new MyActionListener());
		it2.addActionListener(new MyActionListener());
		it3.addActionListener(new MyActionListener());
		it4.addActionListener(new MyActionListener());
		
		popstate.add(it1);
		popstate.add(it2);
		popstate.add(it3);
		popstate.add(it4);
		
		//�������
		jlb=new JLabel(new ImageIcon("image/tupian0.jpg"));
		jlb.setBounds(42,195,80,83);
		c.add(jlb);
		
		
		
		//�����
		account=new JComboBox(accs);
		account.setEditable(true);
		account.setFont(new Font("����",Font.BOLD,20));
		account.setBounds(130,195,200,30);
		account.addItemListener(new MyIItemListener());
		c.add(account);
		
		pwd=new JPasswordField();
		pwd.setFont(new Font("Dialoglnput",Font.BOLD,12));
		pwd.setEchoChar('��');
		pwd.setBounds(130,225,200,30);
		c.add(pwd);
		
		//��ǩ
		la=new JLabel("ע���˺�");
//		lt1.setForeground(new Color(60, 157, 255));// ʹ��RBG������ɫ
		la.setForeground(new Color(60,157,255));
		la.setBounds(342, 195, 60, 20);
		la.addMouseListener(new MousetListener());
		c.add(la);
		
		la2=new JLabel("�һ�����");
		la2.setForeground(new Color(60,157,255));
		la2.setBounds(342, 225, 60, 20);
		la2.addMouseListener(new MousetListener());
		c.add(la2);

		j1=new JCheckBox("��ס����");
		j1.setBounds(130, 260, 80, 20);
		c.add(j1);
		
		j2=new JCheckBox("�Զ���¼");
		j2.setBounds(260, 260, 80, 20);
		c.add(j2);
		
		//��¼��ť
		jb=new JLabel(new ImageIcon("image/Logo1.png"));
		jb.setBounds(130, 290, 200, 30);
		jb.addMouseListener(new MousetListener());
		c.add(jb);
		
		//�������
		Panel p2=new Panel();
		jbe=new JLabel(new ImageIcon("image/erweima1.png"));
		p2.setBounds(405,305,25,25);
		p2.add(jbe);
		jbe.addMouseListener(new MousetListener());
		c.add(p2);
		
		//�������
		p3=new JPanel();
		//setLayout(null);
		p3.setLayout(new BorderLayout());
		
		ImageIcon ige=new ImageIcon("image/more1.png");
		jbel=new JLabel(ige);
		//p2.setBackground(Color.BLUE);
		p3.setBounds(2,305,25,25);
		jbel.addMouseListener(new MousetListener());
		p3.add(jbel);
		
		c.add(p3);
		
		//�����ر����
		cls=new JLabel();
		cls.setBounds(400, 0, 29, 29);
		cls.addMouseListener(new MousetListener());
		//���ü�ͷΪ����
		cls.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(cls);
		
		JIZHU();
		
		//����С
		xiao=new JLabel();
		xiao.setBounds(369, 3, 29, 29);
		xiao.addMouseListener(new MousetListener());
		//���ü�ͷΪ����
		xiao.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(xiao);

		//��ͼƬ�ڴ�������ʾ
		JLabel jl=new JLabel(new ImageIcon("image/north.gif"));
		add(jl);
		setSize(430,330);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//��ť����
	class MyActionListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==it1) {
				statu.setIcon(new ImageIcon("image/s_online.png"));
			}else if (e.getSource()==it2) {
				statu.setIcon(new ImageIcon("image/s_hide.png"));
			}else if (e.getSource()==it3) {
				statu.setIcon(new ImageIcon("image/s_leave.png"));
			}else if (e.getSource()==it4) {
				statu.setIcon(new ImageIcon("image/s_busy.png"));
			}
			
		}
		
	}
	public void JIZHU(){
		
		if (list==null||list.size()==0) {
			return;
		}
		QQHistory history=(QQHistory)list.get(0);//ͨ���±�ȥ�����л�ȡ��Ӧ�ĵ�¼��ʷ����
		
		//��������
		pwd.setText(history.getPwt());
		//����ͷ��
		jlb.setIcon(new ImageIcon(history.getFace()));
		//���������ж�ԭ���Ƿ��Ǽ�ס����
		if ("".equals(history.getPwt())) {
			j1.setSelected(false);
		}else{
			j1.setSelected(true);
		}
		//����ֵ�ж�ԭ���Ƿ��Զ���¼
		if (history.getAutologin()==0) {
			j2.setSelected(false);
		}else{
			j2.setSelected(true);
			
			//�ж�״̬
			int sta=history.getState();
			if (sta==Contents.STATU_ONLINE) {
				statu.setIcon(new ImageIcon("image/s_online.png"));
			}else if (sta==Contents.STATU_HIDE) {
				statu.setIcon(new ImageIcon("image/s_hide.png"));
			}else if (sta==Contents.STATU_BUSY) {
				statu.setIcon(new ImageIcon("image/s_leave.png"));
			}else if (sta==Contents.STATU_NODISTURB) {
				statu.setIcon(new ImageIcon("image/s_busy.png"));
			}
		}
	
	}
	//���������
	class MyIItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource()==account) {
				//����������ѡ�е�����
//				System.out.println("������"+account.getSelectedIndex());
				int index=account.getSelectedIndex();
				if (index<0) {
					return;
				}
				QQHistory history=(QQHistory)list.get(index);//ͨ���±�ȥ�����л�ȡ��Ӧ�ĵ�¼��ʷ����
				//��������
				pwd.setText(history.getPwt());
				//����ͷ��
				jlb.setIcon(new ImageIcon(history.getFace()));
				//���������ж�ԭ���Ƿ��Ǽ�ס����
				if ("".equals(history.getPwt())) {
					j1.setSelected(false);
				}else{
					j1.setSelected(true);
				}
				//����ֵ�ж�ԭ���Ƿ��Զ���¼
				if (history.getAutologin()==0) {
					j2.setSelected(false);
				}else{
					j2.setSelected(true);
					
					//�ж�״̬
					int sta=history.getState();
					if (sta==Contents.STATU_ONLINE) {
						statu.setIcon(new ImageIcon("image/s_online.png"));
					}else if (sta==Contents.STATU_HIDE) {
						statu.setIcon(new ImageIcon("image/s_hide.png"));
					}else if (sta==Contents.STATU_BUSY) {
						statu.setIcon(new ImageIcon("image/s_leave.png"));
					}else if (sta==Contents.STATU_NODISTURB) {
						statu.setIcon(new ImageIcon("image/s_busy.png"));
					}
				}
			}
			
		}
		
	}
	
	//��List�л�ȡ���е�¼�����˺� ��װ��accs������
	public void getHistoryFromList(){
		//��ʼ������
		 accs=new String[list.size()];
		//ѭ��List��ȡQQ��
		for (int i = 0; i < list.size(); i++) {
			//ȡ��ÿһ����¼��ʷ����
			QQHistory history=(QQHistory)list.get(i);
			String qqnum=history.getQqnum();//QQ��
			accs[i]=qqnum;//��QQ�����ø�������
		}
	}
	class MousetListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource()==la2) {
				new Zhaohuimima();
				QQLogin1.this.dispose();
			}
			if (e.getSource()==cls) {
				System.exit(0);
			}else if (e.getSource()==xiao) {
				//�ô��ڻ���С
				QQLogin1.this.setExtendedState(QQLogin1.this.ICONIFIED);
			}else if (e.getSource()==la) {
				QQLogin1.this.dispose();
				new QQRec();
			}else if (e.getSource()==jb) {
				//��ȡ�˺����������֤
				String qqnum=account.getSelectedItem().toString();//��ȡ�������ֵ
				String pwds=pwd.getText();
				//��֤�������ֵ
				if (account==null||account.equals("")) {
				JOptionPane.showConfirmDialog(null, "�������˺ţ�");
				account.requestFocus();
				return;
				}
				if (pwd==null||pwd.equals("")) {
					JOptionPane.showConfirmDialog(null, "���������룡");
					pwd.requestFocus();
					return;
				}
				//��֤��¼
				
				QQUser user=is.checkUser(qqnum, pwds);
				if (user==null) {
					JOptionPane.showConfirmDialog(null, "�˺Ż������������µ�¼��");
					pwd.requestFocus();
					return;
				}else {
//					JOptionPane.showConfirmDialog(null, "��¼�ɹ���");
					
					//��ȡ״̬��ͼƬ·��
					String states=statu.getIcon().toString();
					int st=0;
					if (states.equals("image/s_online.png")) {
						st=Contents.STATU_ONLINE;
					}else if (states.equals("image/s_hide.png")) {
						st=Contents.STATU_HIDE;
					}else if (states.equals("image/s_leave.png")) {
						st=Contents.STATU_BUSY;
					}else if (states.equals("image/s_busy.png")) {
						st=Contents.STATU_NODISTURB;
					}
					
					//�����û�״̬
					is.changestatus(qqnum, st);
					
					//��¼��¼��ʷ
					QQHistory history=new QQHistory();
					history.setQqnum(qqnum);//�˺�
					if (j1.isSelected()) {//�����ס���빴ѡ�ˣ���Ҫ��������
						history.setPwt(pwds);
					}else{
						history.setPwt("");
					}
					history.setFace(user.getFace());//�ӵ�½�ɹ��ĵ������л�ȡͷ��
					if (j2.isSelected()) {
						history.setAutologin(1);//1���Զ���¼ 0�����Զ�
					}else{
						history.setAutologin(0);
					}
					history.setState(st);//��¼ʱ״̬
					
					//�����¼��¼
					is.addhistory(history);
					
					//�����û�״̬
					user.setStatus(st);
					//��¼��������
					QQLogin1.this.dispose();
					//��������
					new DRHOU(user);
				}
			}else if (e.getSource()==statu) {//�����״̬
				popstate.show(statu,e.getX(),e.getY());//��ʾ����ʽ����
				
			}
			
		}
		//��������¼�
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==la) {
				la.setForeground(Color.GRAY);
				//����С
//				zx="image/minimize.gif";
				
				
			}
			if (e.getSource()==la2) {
				la2.setForeground(Color.GRAY);
//				System.out.println("----");
//				//�����ر����
//				gb="image/downs.png";
			}
			
			if (e.getSource()==cls) {
				cls.setIcon(new ImageIcon("image/downs.png"));
			}
			if (e.getSource()==xiao) {
				xiao.setIcon(new ImageIcon("image/min_over.PNG"));
			}
			if (e.getSource()==jbe) {
				jbe.setIcon(new ImageIcon("image/erweima2.png"));
			}
			if (e.getSource()==jbel) {
				jbel.setIcon(new ImageIcon("image/more2.png"));
			}
			
		}
		//����Ƴ��¼�
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==la) {
				la.setForeground(new Color(60,157,255));
			}
			if (e.getSource()==la2) {
				la2.setForeground(new Color(60,157,255));
			}
			if (e.getSource()==cls) {
				cls.setIcon(new ImageIcon(""));
			}
			if (e.getSource()==xiao) {
				xiao.setIcon(new ImageIcon(""));
			}
			if (e.getSource()==jbe) {
				jbe.setIcon(new ImageIcon("image/erweima1.png"));
			}
			if (e.getSource()==jbel) {
				jbel.setIcon(new ImageIcon("image/more1.png"));
			}
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
				QQLogin1.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(java.awt.event.MouseEvent e) {
				tmp = new Point(e.getX(), e.getY());

				isDragged = true;
				QQLogin1.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				if (isDragged) {
					loc = new Point(QQLogin1.this.getLocation().x + e.getX()
							- tmp.x, QQLogin1.this.getLocation().y + e.getY()
							- tmp.y);
					QQLogin1.this.setLocation(loc);
				}
			}
		});
	}
	public static void main(String[] args) {
		new QQLogin1();
	}
}
