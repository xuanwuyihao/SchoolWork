package ui;

import impl.QQUserServiceimp;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;

import service.IQQUserService;

import bean.QQUser;

import com.sun.org.apache.bcel.internal.generic.LMUL;

public class QQRec extends JFrame{
	
	//�رմ��ڱ�ǩ
	JLabel close;
	JPanel z;
	//�����
	JTextField unames,haoma,eags;
	//�����
	JPasswordField j2,j3;
	//�Ա�
	JRadioButton y,y1;
	//������
	JComboBox unian,uyue,uri;
	
	
	//�ǳ�Ϊ��
	JLabel uname0,pwd0,pwd2_0,eag1;
	
	Container con;
	//����ײ㷽��
	IQQUserService is=new QQUserServiceimp();
	public QQRec(){
		//�����Ӿ���ʽ
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		con=getContentPane();
		this.setUndecorated(true);
		//���ô�����ק����
		this.setDragable();
		
		//�������
		JPanel p=new JPanel();
		p.setBounds(3, 60, 100, 30);
		JLabel l1=new JLabel(new ImageIcon("image/zuce.png"));
		p.add(l1);
		con.add(p);
		
		
		//�ǳ�
		JLabel uname=new JLabel("�ǳ�:");
		uname.setBounds(50, 90, 60, 30);
		uname.setFont(new Font("���Ĳ���",Font.BOLD,15));
//		l2.setForeground(Color.green);
		unames=new JTextField();
//		unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
//		unames.setEchoChar('��');
		unames.setBounds(110, 90, 190, 25);
		con.add(unames);
		con.add(uname);
		
		//�ǳ�Ϊ��
		uname0=new JLabel("�ǳ�Ϊ�գ�");
		uname0.setBounds(315, 85, 80, 30);
		uname0.setFont(new Font("���Ĳ���",Font.BOLD,11));
		uname0.setForeground(Color.white);
		con.add(uname0);
		
		//����
		JLabel l2=new JLabel("����:");
		l2.setBounds(50, 130, 60, 30);
		l2.setFont(new Font("���Ĳ���",Font.BOLD,15));
//		l2.setForeground(Color.green);
		j2=new JPasswordField();
		j2.setEchoChar('��');
		j2.setBounds(110, 130, 190, 25);
		j2.addMouseListener(new MousetListener());
		con.add(j2);
		con.add(l2);
		
		//����Ϊ��
		pwd0=new JLabel("����Ϊ�գ�");
		pwd0.setBounds(315, 130, 80, 30);
		pwd0.setFont(new Font("���Ĳ���",Font.BOLD,11));
		pwd0.setForeground(Color.white);
		con.add(pwd0);
		
		
		
		
		//ȷ������
		JLabel l3=new JLabel("ȷ������:");
		l3.setBounds(30, 170, 120, 30);
		l3.setFont(new Font("��������",Font.BOLD,15));
//		l3.setForeground(Color.RED);
		j3=new JPasswordField();
		j3.setEchoChar('��');
		j3.setBounds(110, 170, 190, 25);
		con.add(j3);
		con.add(l3);
		
		//���벻һ��
		pwd2_0=new JLabel("���벻һ�£�");
		pwd2_0.setBounds(315, 170, 80, 30);
		pwd2_0.setFont(new Font("���Ĳ���",Font.BOLD,11));
		pwd2_0.setForeground(Color.white);
		con.add(pwd2_0);
		
		//�Ա�
		JLabel l4=new JLabel("�Ա�:");
		l4.setBounds(50, 210, 120, 30);
		l4.setFont(new Font("��Բ",Font.BOLD,15));
//		l4.setForeground(Color.ORANGE);
		y=new JRadioButton("��");
		y.setSelected(true);
		y.setBounds(120, 210, 60, 30);
		y.setFont(new Font("�����п�",Font.BOLD,20));
		con.add(y);
		y1=new JRadioButton("Ů");
		y1.setBounds(230, 210, 60, 30);
		y1.setFont(new Font("�����п�",Font.BOLD,20));
		
		con.add(y1);
		con.add(l4);
		
		//��ѡ��ťҪ����
		ButtonGroup g=new ButtonGroup();
		g.add(y);
		g.add(y1);
		
		//����
		JLabel eag=new JLabel("����:");
		eag.setBounds(50, 250, 60, 30);
		eag.setFont(new Font("���Ĳ���",Font.BOLD,15));
//		l2.setForeground(Color.green);
		eags=new JTextField();
//		unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
//		unames.setEchoChar('��');
		eags.setBounds(110, 250, 190, 25);
		con.add(eags);
		con.add(eag);
		
		//����Ϊ��
		eag1=new JLabel("����Ϊ�գ�");
		eag1.setBounds(315, 245, 80, 30);
		eag1.setFont(new Font("���Ĳ���",Font.BOLD,11));
		eag1.setForeground(Color.white);
		con.add(eag1);
		
		//����
		JLabel l5=new JLabel("����:");
		l5.setBounds(50, 290, 120, 30);
		l5.setFont(new Font("���Ĳ���",Font.BOLD,15));
		
		String yue[]={"1��","2��","3��","4��","5��","6��","7��","8��","9��","10��","11��","12��"};
		uyue=new JComboBox(yue);
		uyue.setBounds(130, 290, 50, 30);
		con.add(uyue);
		String ri[]={"1��","2��","3��","4��","5��","6��","7��","8��","9��","10��",
				"11��","12��","13��","14��","15��","16��","17��","18��","19��","20��",
				"21��","22��","23��","24��","25��","26��","27��","28��","29��","30��","31��"};
		uri=new JComboBox(ri);
		uri.setBounds(210, 290, 50, 30);
		con.add(uri);
		con.add(l5);
		
		
		//���ڵ�
		JLabel l6=new JLabel("���ڵ�:");
		l6.setBounds(50, 330, 120, 30);
		l6.setFont(new Font("���Ĳ���",Font.BOLD,15));
		JTextField address=new JTextField();
		address.setBounds(110, 330, 190, 25);
		con.add(address);
		con.add(l6);
		
		//�ֻ���
		JLabel l7=new JLabel("�ֻ���:");
		l7.setBounds(50, 370, 120, 30);
		l7.setFont(new Font("���Ĳ���",Font.BOLD,15));
		haoma=new JTextField();
		haoma.setBounds(110, 370, 190, 25);
		con.add(haoma);
		con.add(l7);
		
		//ע��ͼƬ
		z=new JPanel();
		z.setBounds(80, 430, 240, 40);
		JLabel zc=new JLabel(new ImageIcon("image/zuce1.png"));
		z.addMouseListener(new MousetListener());
		z.add(zc);
		con.add(z);
		
		
		//�رմ���λ��
		close=new JLabel();
		close.setBounds(367, 4, 40, 25);
		close.setBackground(Color.red);
		//���ü�ͷΪ����
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MousetListener());
		con.add(close);
		
		
		//����ͼ
		JLabel l=new JLabel(new ImageIcon("image/bj.png"));
		add(l);
		setSize(400,500);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new QQRec();
		
	}
	//�����¼�
	public void focusLost(FocusEvent e){
		
	}
	class MousetListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource()==close) {
				QQRec.this.dispose();
				new QQLogin1();
			}
			if (e.getSource()==z) {
				String name=unames.getText();
				String pwd=j2.getText();
				String pwd2=j3.getText();
				
				//�ǳ�Ϊ��
				if (name==null||name.equals("")) {
					//�ñ߿��Ϊ��ɫ
					unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 0, 24)));
					uname0.setForeground(Color.red);
//					JOptionPane.showMessageDialog(null, "�ǳ�Ϊ�գ�");
					return;
				}else  {
					unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
					uname0.setForeground(Color.white);
				}
				//�����һ����������Ϊ��
				 if (pwd==null||pwd.equals("")) {
					//�ñ߿��Ϊ��ɫ
					j2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 0, 24)));
					pwd0.setForeground(Color.red);
//					JOptionPane.showMessageDialog(null, "����Ϊ�գ�");
					return;
				}else {
					j2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250)));
					pwd0.setForeground(Color.white);
				}
				//�����һ������������ڶ������벻һ��
				if (!pwd.equals(pwd2)) {
					//�ñ߿��Ϊ��ɫ
					j3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 0, 24)));
					pwd2_0.setForeground(Color.red);
//					JOptionPane.showMessageDialog(null, "���벻һ�£�");
					return;
				}else {
					j3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250)));
					pwd2_0.setForeground(Color.white);
				}
				
				//����Ϊ��
				String eags1=eags.getText();
				if (eags1==null||eags1.equals("")) {
					//�ñ߿��Ϊ��ɫ
					eags.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 0, 24)));
					eag1.setForeground(Color.red);
//					JOptionPane.showMessageDialog(null, "�ǳ�Ϊ�գ�");
					return;
				}else  {
					eags.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
					eag1.setForeground(Color.white);
				}
				
				//����ע����Ϣ�����ݿ�
				QQUser user=new QQUser();
				//��������QQ�ŵķ���
				String qqnum=productqqnum();
				//QQ��
				user.setQqnum(qqnum);
				//QQ����
				user.setPwd(pwd);
				//�ǳ�
				user.setUname(name);
				//�Ա�
				String sex="��";
				if (y1.isSelected()) {//�ж�Ů��û��ѡ��
					sex="Ů";
				}
				user.setSex(sex);
				//����
				user.setEag(Integer.parseInt(eags1));
				
				//����(��ȡѡ�е�������ѡ��)
				user.setBirthday(uyue.getSelectedItem().toString()
						+uri.getSelectedItem().toString());
				
				
				//ͷ��--����Ĭ��ͷ��
				user.setFace("image/tupian2.png");
				
				//״̬--Ĭ������
				user.setStatus(0);
				
				//�ȼ�
				user.setLeves(1);
				
				//�绰
				String tel=haoma.getText();
				user.setHaoma(tel);
				
				//Ip
				user.setIp("127.0.0.1");
				//�˿�
				
				int port=productport();
				
				user.setPort(port+"");
				
				//�����󱣴浽���ݿ���
				boolean bln=is.addUser(user);
				if (bln) {
					JOptionPane.showMessageDialog(null, "ע��ɹ���QQ����"+qqnum);
				}else {
					JOptionPane.showMessageDialog(null, "�������쳣�������ԣ�");
				}
			}
			
		}
		//�������
		@Override
		public void mouseEntered(MouseEvent e) {
			if (e.getSource()==close) {
				close.setIcon(new ImageIcon("image/downs.png"));
			}
		}
		//����Ƴ�
		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource()==close) {
				close.setIcon(new ImageIcon(""));
			}
		}
	}
	//���ɶ˿�
	public int productport(){
		
		Random r=new Random();
		int port=r.nextInt(6000)+1024;
		
		return port;
	}
	//����QQ��
	public String productqqnum(){
		Random r=new Random();
		//0-999999
		int qqnum=r.nextInt(1000000)+100000;
		boolean bln=is.checkQQnum(qqnum);
		//�жϺ��������ݿ����Ƿ����
		while(is.checkQQnum(qqnum)) {
			qqnum=r.nextInt(1000000)+100000;
		}
		return qqnum+"";
		
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
				QQRec.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(java.awt.event.MouseEvent e) {
				tmp = new Point(e.getX(), e.getY());

				isDragged = true;
				QQRec.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				if (isDragged) {
					loc = new Point(QQRec.this.getLocation().x + e.getX()
							- tmp.x, QQRec.this.getLocation().y + e.getY()
							- tmp.y);
					QQRec.this.setLocation(loc);
				}
			}
		});
	}
}
