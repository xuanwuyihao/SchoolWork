package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbcConnection {
	//�����������ݿ������
	private static String url="jdbc:sqlserver://localhost:1433;Databasename=student";
	private static String driver=  "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String uname="sa";
	private static String pwd="0628";
	private static Connection con=null;
	
	static{
		try {
			Class.forName(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//��ȡ���ݿ����ӷ���
	public static Connection getconnection(){

		try {
			if (con==null|| con.isClosed()) {
				con=DriverManager.getConnection(url, uname, pwd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		System.out.println(DbcConnection.getconnection());
	}
}
