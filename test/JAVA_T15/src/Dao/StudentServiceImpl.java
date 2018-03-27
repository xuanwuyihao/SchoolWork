package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class StudentServiceImpl implements IStudentService{
	public boolean addStudent(Student student) {
		//使用自定义类来获取数据库连接
		Connection con=DbcConnection.getconnection();
		String sql="insert into student values(?,?,?,?)";
		try {
			PreparedStatement pr=con.prepareStatement(sql);
			//从实体baen中获取数据
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
