package comment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	//连接数据库的属性
	private static String url="jdbc:sqlserver://localhost:1433;databasename=TT";
	private static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String uname="sa";
	private static String pwd="0628";
	private static Connection conn=null;
	
	static{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//获取数据库的连接方法
	public static Connection getConnection(){
		try {
			if (conn==null||conn.isClosed()) {
				conn=DriverManager.getConnection(url,uname,pwd);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) {
		try {
			System.out.println(DBConnection.getConnection().isClosed());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
