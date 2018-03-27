package ui;

import impl.QQUserServiceimp;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Vector;

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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import service.IQQUserService;

import bean.QQMsg;
import bean.QQUser;

import com.sun.org.apache.bcel.internal.generic.LMUL;
import common.Contents;
import common.Msgsend;

public class QQFind extends JFrame{
	
	//�رմ��ڱ�ǩ
	JLabel clos,xiao;
	//�ı���
	JTextPane review,send;
	
	JTextField t,t1,t2;
	
	//���ģ��
	DefaultTableModel dm=new DefaultTableModel();
	
	//���
	JTable table;
	
	JComboBox sexs;
	
	//���鼯��
	Vector vects=new Vector();
	//����ײ㷽��
	IQQUserService is=new QQUserServiceimp();
	public int index;
	
	QQUser myuser;
	public QQFind(QQUser user){
		
		this.myuser=user;
		Container con=getContentPane();
		//���ô���ͼ��---����ͷ��
		
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
		
		
	
		
		//�ر�ͼƬ
		clos=new JLabel(new ImageIcon("image/close1.png"));
		clos.addMouseListener(new MousetListener());
		clos.setCursor(new Cursor(Cursor.HAND_CURSOR));
		clos.setBounds(670, 0, 25, 30);
		con.add(clos);
		
		//����СͼƬ
		xiao=new JLabel(new ImageIcon("image/xiao1.png"));
		xiao.addMouseListener(new MousetListener());
		xiao.setCursor(new Cursor(Cursor.HAND_CURSOR));
		xiao.setBounds(640, 0, 25, 30);
		con.add(xiao);
		
		//�ϱ����
		JPanel j=new JPanel();
		
		//QQ��
		JLabel l=new JLabel("QQ�ţ�");
		t=new JTextField(10);
		j.add(l);
		j.add(t);
		
		//�ǳ�
		JLabel l1=new JLabel("�ǳƣ�");
		t1=new JTextField(10);
		j.add(l1);
		j.add(t1);
		
		//����
		JLabel l2=new JLabel("���䣺");
		t2=new JTextField(10);
		j.add(l2);
		j.add(t2);
		
		//�Ա�
		JLabel l3=new JLabel("�Ա�");
		String[] sex={"-ѡ���Ա�-","��","Ů"};
		sexs=new JComboBox(sex);
		j.add(l3);
		j.add(sexs);
		
		
		//����
		JButton b=new JButton("����");
		j.add(b);
		b.addActionListener(new MyActionListener());
		
		j.setBounds(0, 35, 700, 30);
		con.add(j);
		
		
//		//����ͼ
//		JLabel l=new JLabel(new ImageIcon("image/bj.png"));
//		add(l);
		
		Vector<String> titles=new Vector<String>();
		titles.add("QQ��");
		titles.add("�ǳ�");
		
		titles.add("�ȼ�");
		titles.add("�Ա�");
		titles.add("����");
		titles.add("����");
		
		
		//�����ģ���������ݺͱ���
		dm.setDataVector(vects, titles);
		
		//����jlable
		table=new JTable(dm);
		
		//��ӹ������
		JScrollPane scoll=new JScrollPane(table);
		scoll.setBounds(0, 65, 700, 200);
		con.add(scoll);
		
		//��Ӻ��ѵİ�ť
		JButton b2=new JButton("���ѡ�к���");
		b2.setBounds(500,270 , 150, 30);
		b2.addActionListener(new MyActionListener());
		con.add(b2);
		
//		//����ͼƬ
		JLabel hua=new JLabel(new ImageIcon("image/hua.jpg"));
		add(hua);
		
		setSize(700,300);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("����")) {
				//��ȡ����
				String qqnum=t.getText();//QQ��
				String nickname=t1.getText();//�ǳ�
				String age=t2.getText();//����
				int nl=0;
				if (!age.equals("")) {
					nl=Integer.parseInt(age);
				}
				
				String se=sexs.getSelectedItem().toString();//�Ա�
				if (se.equals("-ѡ���Ա�-")) {
					se="";
				}
				
				//��װ��user��
				QQUser user=new QQUser();
				user.setQqnum(qqnum);
				user.setUname(nickname);
				user.setEag(nl);
				user.setSex(se);
				
				
				//��ѯ�����б�
				vects=is.findUsers(user);
				
				//��ձ������
				dm.setRowCount(0);
				
				//�������е�������ʾ��ҳ����
				for (int i = 0; i < vects.size(); i++) {
					Vector v=(Vector) vects.get(i);
					dm.addRow(v);//ѭ��ÿһ�����ݣ���ӵ������
				}
			}else if (e.getActionCommand().equals("���ѡ�к���")) {
				System.out.println(table.getSelectedRow()+" "+table.getSelectedColumn());
				int indx=table.getSelectedRow();//���ѡ�е���
				if (indx>-1) {//ֻ��ѡ���˲��ܽ��в���
					//�õ�ѡ�е�QQ
					Vector v=(Vector) vects.get(indx);
					String qqnum=(String) v.get(0);
					
					//��������Լ�
					if (qqnum.equals(myuser.getQqnum())) {
						JOptionPane.showConfirmDialog(null, "��������Լ�");
						return;
					}
					
					//�Ѿ��Ǻ��Ѳ������
					boolean bln=is.selFriend(myuser.getQqnum(), qqnum);
					if (bln) {//�Ѿ��Ǻ�����
						JOptionPane.showConfirmDialog(null, "���û�������ĺ���");
						return;
					}
					
					//����QQ�ŵõ����Ѷ���
					QQUser fuser=is.findUserByQQnum(qqnum);
					
					//���ú��ѷ����������
					QQMsg msg=new QQMsg();
					msg.setCmd(Contents.CMD_ADDFRIEND);//��Ӻ��ѵ�������
					msg.setMyUser(myuser);
					msg.setFUser(fuser);
					new Msgsend(msg);
					JOptionPane.showConfirmDialog(null, "�����ѷ��ͣ�");
				}else {
					JOptionPane.showConfirmDialog(null, "��ѡ��һ�����ѣ�");
				}
			}
		}
		
	}

	
	class MousetListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource()==clos) {
				//�رմ���
//				Liaotian.this.dispose();
				QQFind.this.setVisible(false);
			}else if (e.getSource()==xiao) {
				//���ڻ���С
				QQFind.this.setExtendedState(QQFind.this.ICONIFIED);
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
				QQFind.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(java.awt.event.MouseEvent e) {
				tmp = new Point(e.getX(), e.getY());

				isDragged = true;
				QQFind.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				if (isDragged) {
					loc = new Point(QQFind.this.getLocation().x + e.getX()
							- tmp.x, QQFind.this.getLocation().y + e.getY()
							- tmp.y);
					QQFind.this.setLocation(loc);
				}
			}
		});
	}
}
