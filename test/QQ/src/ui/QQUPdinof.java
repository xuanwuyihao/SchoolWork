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
import java.util.Date;
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
import javax.swing.JTextPane;

import service.IQQUserService;

import bean.QQUser;

import com.sun.org.apache.bcel.internal.generic.LMUL;

public class QQUPdinof extends JFrame{
	
	//�رմ��ڱ�ǩ
	JLabel close,qe;
	JPanel z;
	//�����
	JTextField unames,haoma,eag;
	//�����
	JTextField j2,j3;
	//�Ա�
	JRadioButton y,y1;
	//������
	JComboBox unian,uyue,uri;
	JLabel qm;
	
	//�ǳ�Ϊ��
	JLabel uname0,pwd0,pwd2_0;
	
	Container con;
	//����ײ㷽��
	IQQUserService is=new QQUserServiceimp();
	public QQUPdinof(QQUser user){
		con=getContentPane();
		this.setUndecorated(true);
		
		//���ô�����ק����
		this.setDragable();
		
		//�������
		JPanel p=new JPanel();
		p.setBounds(3, 60, 100, 30);
		
		
		//�ǳ�
		JLabel uname=new JLabel("��  ��");
		uname.setBounds(10, 40, 45, 30);
//		uname.setFont(new Font("���Ĳ���",Font.BOLD,15));
//		l2.setForeground(Color.green);
		unames=new JTextField(user.getUname() );
//		unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
//		unames.setEchoChar('��');
		unames.setBounds(60, 40, 115, 20);
		con.add(unames);
		con.add(uname);
		
		
		
		//�Ա�
		JLabel l4=new JLabel("��  ��");
		l4.setBounds(200, 40, 40, 30);
//		l4.setFont(new Font("��Բ",Font.BOLD,15));
//		l4.setForeground(Color.ORANGE);
		y=new JRadioButton("��");
		
		y.setBounds(250, 45,40, 20);
//		y.setFont(new Font("�����п�",Font.BOLD,20));
		con.add(y);
		y1=new JRadioButton("Ů");
		y1.setBounds(310, 45, 40, 20);
//		y1.setFont(new Font("�����п�",Font.BOLD,20));
		//�ж��Ա�ѡ��
		if (user.getSex().equals("��")) {
			y.setSelected(true);
		}else if (user.getSex().equals("Ů")) {
			y1.setSelected(true);
		}
		
		con.add(y1);
		con.add(l4);
		
		//��ѡ��ťҪ����
		ButtonGroup g=new ButtonGroup();
		g.add(y);
		g.add(y1);
		
		
		
		//
		String str=user.getBirthday();//1991��1��1��
//		String y = str.substring(0, str.indexOf("��")+1);
//		System.out.println(y);
		String m = str.substring(str.indexOf("��")+1, str.indexOf("��")+1);

		String d = str.substring(str.indexOf("��")+1, str.length());
		//����
		JLabel l5=new JLabel("��  ��");
		l5.setBounds(10, 75, 40, 30);
//		l5.setFont(new Font("���Ĳ���",Font.BOLD,15));
//		String nian[]={"1995��","1996��","1997��","1998��","1999��","2000��","2000��"
//				,"2001��","2002��","2003��","2004��","2005��","2006��","2007��","2008��"
//				,"2009��","2010��","2011��","2012��","2013��","2014��","2015��","2016��"
//				,"2017��","2018��","2019��","2020��","2021��","2022��","2023��","2024��"
//				,"2025��","2026��","2027��","2028��","2029��","2030��","2031��","2032��"
//				,"2033��","2034��","2035��","2036��","2037��","2038��","2039��"};
//		unian=new JComboBox(nian);
//		unian.setSelectedItem(y);
//		unian.setBounds(110, 55, 90, 30);
		
		
		String yue[]={"1��","2��","3��","4��","5��","6��","7��","8��","9��","10��","11��","12��"};
		uyue=new JComboBox(yue);
		uyue.setSelectedItem(m);
		uyue.setBounds(60, 80, 50, 20);
		con.add(uyue);
		
		
		String ri[]={"1��","2��","3��","4��","5��","6��","7��","8��","9��","10��",
				"11��","12��","13��","14��","15��","16��","17��","18��","19��","20��",
				"21��","22��","23��","24��","25��","26��","27��","28��","29��","30��","31��"};
		uri=new JComboBox(ri);
		uri.setSelectedItem(d);
		uri.setBounds(120, 80, 50, 20);
		con.add(uri);
		con.add(l5);
//		con.add(unian);
		
		//ְҵ
		JLabel zy=new JLabel("ְ  ҵ");
		zy.setBounds(200, 75, 40, 30);
//		uname.setFont(new Font("���Ĳ���",Font.BOLD,15));
//		l2.setForeground(Color.green);
		JTextField zy1=new JTextField();
//		unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
//		unames.setEchoChar('��');
		zy1.setBounds(250, 80,115, 20);;
		con.add(zy1);
		con.add(zy);
		
		//����
		JLabel gx=new JLabel("��  ��");
		gx.setBounds(10, 110, 40, 30);
//		uname.setFont(new Font("���Ĳ���",Font.BOLD,15));
//		l2.setForeground(Color.green);
		JTextField gx1=new JTextField();
//		unames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
//		unames.setEchoChar('��');
		gx1.setBounds(60, 115,300, 20);;
		con.add(gx1);
		con.add(gx);
		
		//���ڵ�
		JLabel l6=new JLabel("���ڵ�:");
		l6.setBounds(10, 150, 50, 30);
//		l6.setFont(new Font("���Ĳ���",Font.BOLD,15));
		JTextField address=new JTextField(user.getAddress());
		address.setBounds(60, 150, 300, 25);
		con.add(address);
		con.add(l6);
		
		//ѧУ
		JLabel xx=new JLabel("ѧ  У");
		xx.setBounds(10, 185, 50, 30);
//		l6.setFont(new Font("���Ĳ���",Font.BOLD,15));
		JTextField xx1=new JTextField();
		xx1.setBounds(60, 185, 300, 25);
		con.add(xx1);
		con.add(xx);
		
		//ѧУ
		JLabel gs=new JLabel("��  ˾");
		gs.setBounds(10, 220, 50, 30);
//		l6.setFont(new Font("���Ĳ���",Font.BOLD,15));
		JTextField gs1=new JTextField();
		gs1.setBounds(60, 220, 300, 25);
		con.add(gs1);
		con.add(gs);
		
		//�ֻ���
		JLabel l7=new JLabel("��  ��");
		l7.setBounds(10, 255, 40, 30);
//		l7.setFont(new Font("���Ĳ���",Font.BOLD,15));
		haoma=new JTextField(user.getHaoma());
		haoma.setBounds(60, 260, 300, 25);
		con.add(haoma);
		con.add(l7);
		
		//�ֻ���
		JLabel yx=new JLabel("��  ��");
		yx.setBounds(10, 290, 40, 30);
//		l7.setFont(new Font("���Ĳ���",Font.BOLD,15));
		JTextField yx1=new JTextField();
		yx1.setBounds(60, 295, 300, 25);
		con.add(yx1);
		con.add(yx);
		
		//ǩ��
		qm=new JLabel("ǩ  ��");
		qm.setBounds(10, 330, 40, 30);
//		l7.setFont(new Font("���Ĳ���",Font.BOLD,15));
		JTextPane qm1=new JTextPane();
		qm1.setBounds(60, 330, 300, 60);
		con.add(qm1);
		con.add(qm);
		
		//ǩ��
		qe=new JLabel("");
		qe.setBounds(240, 475, 40, 30);
//		l7.setFont(new Font("���Ĳ���",Font.BOLD,15));
		qe.setCursor(new Cursor(Cursor.HAND_CURSOR));
		con.add(qe);
		
		
		//�رմ���λ��
		close=new JLabel();
		close.setBounds(360, 0, 40, 25);
		close.setBackground(Color.red);
		//���ü�ͷΪ����
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MousetListener());
		con.add(close);
		
		
		//����ͼ
		JLabel l=new JLabel(new ImageIcon("image/xiugai.png"));
		add(l);
		setSize(374,515);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	//�����¼�
	public void focusLost(FocusEvent e){
		
	}
	class MousetListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource()==close) {
				QQUPdinof.this.dispose();
			}
			if (e.getSource()==qe) {
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
				
				
				//����ע����Ϣ�����ݿ�
				QQUser user=new QQUser();
				//��������QQ�ŵķ���
				String qqnum=productqqnum();
				//QQ��
				user.setQqnum(qqnum);
				//�ǳ�
				user.setUname(name);
				//�Ա�
				String sex="��";
				if (y1.isSelected()) {//�ж�Ů��û��ѡ��
					sex="Ů";
				}
				user.setSex(sex);
				
				//����(��ȡѡ�е�������ѡ��)
				user.setBirthday(unian.getSelectedItem().toString()
						+uyue.getSelectedItem().toString()
						+uri.getSelectedItem().toString());
				
				
				//ͷ��--����Ĭ��ͷ��
				user.setFace("image/tupian0.jpg");
				
				//״̬--Ĭ������
				user.setStatus(0);
				
				//�ȼ�
				user.setLeves(user.getLeves());
				
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
				QQUPdinof.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(java.awt.event.MouseEvent e) {
				tmp = new Point(e.getX(), e.getY());

				isDragged = true;
				QQUPdinof.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				if (isDragged) {
					loc = new Point(QQUPdinof.this.getLocation().x + e.getX()
							- tmp.x, QQUPdinof.this.getLocation().y + e.getY()
							- tmp.y);
					QQUPdinof.this.setLocation(loc);
				}
			}
		});
	}

	
}
