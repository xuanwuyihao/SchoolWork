package JDBC;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Tongxunlu extends JFrame{
	private String driver;
	JTextField jt,jt1;
	//�������ģ��
	DefaultTableModel de=new DefaultTableModel();
	public Tongxunlu(){
		super("ͨѶ¼");
		Container con=getContentPane();
		
		//�������⼯��
		Vector<String> vc=new Vector<String>();
		vc.add("������");
		vc.add("���룺");
		
		//������������ܼ���
		Vector<Vector<String>> ve=getData();
		//Vector ve=getData();
//		
		//����ÿ�����ݵļ���
//		Vector<String> v1=new Vector<String>();
//		v1.add("С��");
//		v1.add("8888888888");
//		
//		Vector<String> v2=new Vector<String>();
//		v2.add("С��");
//		v2.add("6666666666");
		
		//�����ݼ����ܼ�����
//		ve.add(v1);
//		ve.add(v2);
//		
		
		
		//�����ģ������ӱ�������ݼ���
		de.setDataVector(ve,vc);
		//��������ǩ
		JTable j=new JTable(de);
		//��ӹ������
		JScrollPane span=new JScrollPane(j);
		//�ѹ����������ڱ߿򲼾��м�
		con.add(span);
		
		//�±����
		JPanel jp=new JPanel();
		//����
		JLabel j1=new JLabel("������");
		jp.add(j1);
		//�����ı���
		jt=new JTextField(10);
		jp.add(jt);
		//����
		JLabel j2=new JLabel("���룺");
		jp.add(j2);
		//�ı���
		jt1=new JTextField(10);
		jp.add(jt1);
		
		//���ð�ť
		JButton b=new JButton("���");
		b.addActionListener(new MyActionlistener());
		jp.add(b);
		
		con.add(jp,BorderLayout.SOUTH);
		
		
		
		setSize(500, 300);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class MyActionlistener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("���")) {
				//��ȡ�����ı�������
				String uname=jt.getText();
				String tel=jt1.getText();
				Vector<String> vt=new Vector<String>();
				vt.add(uname);
				vt.add(tel);
				de.addRow(vt);
				
				//��������ӵ����ݿ���
				boolean bln=savedate(uname, tel);
				if (bln) {
					System.out.println("������ӳɹ���");
				}else{
					System.out.println("�������ʧ�ܣ�");
				}
				//����ı���
				jt.setText("");
				jt1.setText("");
			}
			
		}
		
	}
	
	//���浽���ݿ�ķ���
	public boolean savedate(String uname,String tel){
		String url="jdbc:sqlserver://localhost:1433;databasename=student";
		String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String usname="sa";
		String pwd="0628";
		
		try {
			//��������
			Class.forName(driver);
			//��ȡ���ݿ�����
			Connection con=DriverManager.getConnection(url, usname, pwd);
			//�õ���������
			Statement st=con.createStatement();
			//����SQL
			String sql="insert txl values('"+uname+"','"+tel+"')";
			System.out.println(sql);
			//ִ�в������
			int i=st.executeUpdate(sql);
			if(i>0){
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//��ȡ���ݿ�
	public Vector getData(){
		Vector data=new Vector();
		String url="jdbc:sqlserver://localhost:1433;databasename=student";
		//����
		String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		//���ݿ��û���
		String username="sa";
		//�û�������
		String pwd="0628";
		
		
		
		//�������ݿ�
		try {
			Class.forName(driver );
			Connection conn=DriverManager.getConnection(url, username, pwd);
			Statement sta=conn.createStatement();
			ResultSet rs=sta.executeQuery("select * from txl");
			//ѭ������
			while(rs.next()){
				Vector<String> ve=new Vector<String>();
				ve.add(rs.getString(1));
				ve.add(rs.getString(2));
				data.add(ve);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	public static void main(String[] args) {
		new Tongxunlu();
	}
}
