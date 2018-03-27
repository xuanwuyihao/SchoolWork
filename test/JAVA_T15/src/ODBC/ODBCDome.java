package ODBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ODBCDome {
	//ODBC  数据源
	//1、在控制面板 - 管理工具 - 数据源（ODBC）中配置一个数据源
	//2、创建四个属性url="jdbc:odbc:数据源名称"
	
	//ODBC不用导驱动包
	//JDBC不在计算机中配置数据源 修改维护更方便
	public static void main(String[] args) {
		String url="jdbc:odbc:tt";
		String driver="sun.jdbc.odbc.JdbcOdbcDriver";
		String uname="sa";
		String pwd="hongtu";
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, uname, pwd);
			Statement sta=con.createStatement();
			ResultSet res=sta.executeQuery("select * from student");
			//修改数据
//			update student set stu_age=31 where stu_id=50
//			int res=sta.executeUpdate("update student set stu_sex='女' where stu_id=42");
//			System.out.println(res);
			while (res.next()) {
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "
						+res.getString(3)+" "+res.getString(4));
				
				
			}
			res.close();
			sta.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
