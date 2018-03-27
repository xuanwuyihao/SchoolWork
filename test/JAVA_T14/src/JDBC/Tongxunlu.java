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
	//创建表格模型
	DefaultTableModel de=new DefaultTableModel();
	public Tongxunlu(){
		super("通讯录");
		Container con=getContentPane();
		
		//创建标题集合
		Vector<String> vc=new Vector<String>();
		vc.add("姓名：");
		vc.add("号码：");
		
		//创建表格数据总集合
		Vector<Vector<String>> ve=getData();
		//Vector ve=getData();
//		
		//创建每条数据的集合
//		Vector<String> v1=new Vector<String>();
//		v1.add("小明");
//		v1.add("8888888888");
//		
//		Vector<String> v2=new Vector<String>();
//		v2.add("小张");
//		v2.add("6666666666");
		
		//将数据加入总集合中
//		ve.add(v1);
//		ve.add(v2);
//		
		
		
		//网表格模型中添加标题和数据集合
		de.setDataVector(ve,vc);
		//创建表格标签
		JTable j=new JTable(de);
		//添加滚动面板
		JScrollPane span=new JScrollPane(j);
		//把滚动面板添加在边框布局中间
		con.add(span);
		
		//下边面板
		JPanel jp=new JPanel();
		//姓名
		JLabel j1=new JLabel("姓名：");
		jp.add(j1);
		//设置文本框
		jt=new JTextField(10);
		jp.add(jt);
		//号码
		JLabel j2=new JLabel("号码：");
		jp.add(j2);
		//文本框
		jt1=new JTextField(10);
		jp.add(jt1);
		
		//设置按钮
		JButton b=new JButton("添加");
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
			if (e.getActionCommand().equals("添加")) {
				//获取两个文本框内容
				String uname=jt.getText();
				String tel=jt1.getText();
				Vector<String> vt=new Vector<String>();
				vt.add(uname);
				vt.add(tel);
				de.addRow(vt);
				
				//把数据添加到数据库中
				boolean bln=savedate(uname, tel);
				if (bln) {
					System.out.println("数据添加成功！");
				}else{
					System.out.println("数据添加失败！");
				}
				//清空文本框
				jt.setText("");
				jt1.setText("");
			}
			
		}
		
	}
	
	//保存到数据库的方法
	public boolean savedate(String uname,String tel){
		String url="jdbc:sqlserver://localhost:1433;databasename=student";
		String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String usname="sa";
		String pwd="0628";
		
		try {
			//加载驱动
			Class.forName(driver);
			//获取数据库连接
			Connection con=DriverManager.getConnection(url, usname, pwd);
			//得到陈述对象
			Statement st=con.createStatement();
			//构建SQL
			String sql="insert txl values('"+uname+"','"+tel+"')";
			System.out.println(sql);
			//执行插入语句
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
	//获取数据库
	public Vector getData(){
		Vector data=new Vector();
		String url="jdbc:sqlserver://localhost:1433;databasename=student";
		//驱动
		String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		//数据库用户名
		String username="sa";
		//用户名密码
		String pwd="0628";
		
		
		
		//加载数据库
		try {
			Class.forName(driver );
			Connection conn=DriverManager.getConnection(url, username, pwd);
			Statement sta=conn.createStatement();
			ResultSet rs=sta.executeQuery("select * from txl");
			//循环集合
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
