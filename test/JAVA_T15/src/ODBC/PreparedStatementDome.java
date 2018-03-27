package ODBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementDome {
	public static void main(String[] args) {
		String url="jdbc:odbc:yihao";
		String driver="sun.jdbc.odbc.JdbcOdbcDriver";
		String uname="sa";
		String pwd="0628";
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, uname, pwd);
			//修改语句
//			String re=sta.executeUpdate("update student set stu_id=43 where stu_sex='男'");
			//删除语句（例子）
			// String sql="update student set stu_age=31 where stu_id=50";
			String sql="select * from student where id=? and name=? and birthday=? and cid=?";
			PreparedStatement pr=con.prepareStatement(sql);
			//占位符的位置只能输入一个查询条件
			pr.setInt(1, 1);
			pr.setString(2, "张三");
			pr.setString(3, "1991/1/1");
			pr.setInt(4, 1);
//			 int i = pr.executeUpdate(sql);
//			 System.out.println(i);
			ResultSet res=pr.executeQuery();
			while (res.next()) {
				System.out.println(res.getInt(1)+" "+res.getString(2)
						+res.getString(3)+" "+res.getInt(4));
				
			}
			res.close();
			pr.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
