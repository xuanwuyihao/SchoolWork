package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class StudentServiceImpl implements IStudentService{
	public boolean addStudent(Student student) {
		//ʹ���Զ���������ȡ���ݿ�����
		Connection con=DbcConnection.getconnection();
		String sql="insert into student values(?,?,?,?)";
		try {
			PreparedStatement pr=con.prepareStatement(sql);
			//��ʵ��baen�л�ȡ����
			pr.setInt(1, student.getId());
			pr.setString(2, student.getName());
			pr.setInt(3, student.getEag());
			pr.setString(4, student.getSex());
			int i=pr.executeUpdate();
			if (i>0) {
				return true;
			}
			pr.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
