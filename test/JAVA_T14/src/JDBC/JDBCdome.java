package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCdome {
	public static void main(String[] args) {
		//ע�����¼���
		//1,���ݿ����Ҫ����
		//2,���ݿ��TCP/IPЭ��Ҫ����
		//3,Ҫ���������� �Լ���������Ҫ��ȷ
		
		//���ݿ����Ӳ��裺
		
		//1,�������ݿ�������  �Ҽ���Ŀ - properties - java build path - Labraries - add Extranal jars
		//2,�������ݿ���������
		
		//·��
		//jdbc:sqlserver://���ݿ�IP[localhost/127.0.0.1/���������]:���ݿ�˿�;databasename=���ݿ����ƣ������ִ�Сд��
		String url="jdbc:sqlserver://localhost:1433;databasename=student";
		//����
		String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		//���ݿ��û���
		String username="sa";
		//�û�������
		String pwd="0628";
		
		
		try {
			//3,��������
			Class.forName(driver);
			
			//4,��ȡ���ݿ�����
			Connection con=DriverManager.getConnection(url, username, pwd);
			
			//�������ݿ�
			//�õ���������statement
			Statement state=con.createStatement();
			//1,ʹ��sql���õ������ ��ѯ��executeQuery ��ɾ����executeUpdate
			ResultSet rs=state.executeQuery("select * from student");
			//���������
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
			
			//�ر�
			rs.close();
			state.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
