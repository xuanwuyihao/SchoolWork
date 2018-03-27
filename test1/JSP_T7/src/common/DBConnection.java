package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	//�������ݿ���ĸ�����
	private static String url="jdbc:sqlserver://localhost:1433;databasename=TT";
	private static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String uname="sa";
	private static String pwd="0628";
	private static Connection con=null;
	
	static{
	//�õ����ݿ�����
	try {
		Class.forName(driver);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	//��ȡ���ݿ�����ӷ���
	public static Connection getConnection(){
		try {
			if (con==null||con.isClosed()) {
				con= DriverManager.getConnection(url,uname,pwd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		System.out.println(DBConnection.getConnection());
	}
}
