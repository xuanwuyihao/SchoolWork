package ODBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ODBCDome {
	//ODBC  ����Դ
	//1���ڿ������ - ������ - ����Դ��ODBC��������һ������Դ
	//2�������ĸ�����url="jdbc:odbc:����Դ����"
	
	//ODBC���õ�������
	//JDBC���ڼ��������������Դ �޸�ά��������
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
			//�޸�����
//			update student set stu_age=31 where stu_id=50
//			int res=sta.executeUpdate("update student set stu_sex='Ů' where stu_id=42");
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
