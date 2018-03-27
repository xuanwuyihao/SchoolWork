package ServiceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import comment.DBConnection;

import Bean.Bean;
import Bean.User;
import Service.Bookservice;

public class BookserviceImpl implements Bookservice{

	public List Boooklist(int currpage, int pagecount) {
		List list=new ArrayList();
		Connection conn=DBConnection.getconnection();
		String sql="select top "+pagecount+" * from bookx where bid not in (select top "+(currpage-1)*pagecount+" bid from bookx) ";
		try {
			PreparedStatement prst= conn.prepareCall(sql);
			ResultSet rs=prst.executeQuery();
			while(rs.next()){
				Bean b=new Bean();
				b.setBid(rs.getInt("bid"));
				b.setBname(rs.getString("bname"));
				b.setBprice(rs.getFloat("bprice"));
				b.setBauthor(rs.getString("bauthor"));
				b.setBpress(rs.getString("bpress"));
				b.setBstate(rs.getInt("bstate"));
				b.setBimg(rs.getString("bimg"));
				list.add(b);
			}
			rs.close();
			conn.close();
			prst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public int Bookrows() {
		Connection conn=DBConnection.getconnection();
		String sql="select count(*) from bookx";
		try {
			PreparedStatement prst= conn.prepareCall(sql);
			ResultSet rs=prst.executeQuery();
			while(rs.next()){
				return rs.getInt(1);
			}
			rs.close();
			conn.close();
			prst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public Bean selbyid(int id) {
		Connection conn=DBConnection.getconnection();
		String sql="select * from bookx where bid="+id;
		try {
			PreparedStatement prst= conn.prepareCall(sql);
			ResultSet rs=prst.executeQuery();
			while(rs.next()){
				Bean b=new Bean();
				b.setBid(rs.getInt("bid"));
				b.setBname(rs.getString("bname"));
				b.setBprice(rs.getFloat("bprice"));
				b.setBauthor(rs.getString("bauthor"));
				b.setBpress(rs.getString("bpress"));
				b.setBstate(rs.getInt("bstate"));
				b.setBimg(rs.getString("bimg"));
				return b;
			}
			rs.close();
			conn.close();
			prst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public boolean bookadd(Bean b) {
		Connection conn=DBConnection.getconnection();
		String sql="insert into bookx values(?,?,?,?,?,?)";
		try {
			PreparedStatement prst= conn.prepareCall(sql);
			prst.setString(1, b.getBname());
			prst.setFloat(2, b.getBprice());
			prst.setString(3, b.getBauthor());
			prst.setString(4, b.getBpress());
			prst.setInt(5, b.getBstate());
			prst.setString(6, b.getBimg());
			int i=prst.executeUpdate();
			if(i>0){
				return true;
			}
			
			conn.close();
			prst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean bookupd(Bean b) {
		Connection conn=DBConnection.getconnection();
		String sql="update bookx set bname=?,bprice=?,bauthor=?,bpress=?,bstate=?,bimg=? where bid=?";
		try {
			PreparedStatement prst= conn.prepareCall(sql);
			prst.setString(1, b.getBname());
			prst.setFloat(2, b.getBprice());
			prst.setString(3, b.getBauthor());
			prst.setString(4, b.getBpress());
			prst.setInt(5, b.getBstate());
			prst.setString(6, b.getBimg());
			
			prst.setInt(7,b.getBid());
			int i=prst.executeUpdate();
			if(i>0){
				return true;
			}
			
			conn.close();
			prst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean bookdel(int id) {
		Connection conn=DBConnection.getconnection();
		String sql="delete from bookx where bid=" +id;
		try {
			PreparedStatement prst= conn.prepareCall(sql);
			int i=prst.executeUpdate();
			if(i>0){
				return true;
			}
			
			conn.close();
			prst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	//µÇÂ¼
	public User login(User user) {
		Connection con= DBConnection.getconnection();

		String sql = "select * from [user] where uname= ? and pwd= ?";
		try {
			PreparedStatement prst=con.prepareStatement(sql);
			prst.setString(1, user.getUname());
			prst.setString(2, user.getPwd());
			ResultSet rs=prst.executeQuery();
			if(rs.next()){
				User u=new User();
				u.setId(rs.getInt("id"));
				u.setUname(rs.getString("uname"));
				u.setPwd(rs.getString("pwd"));
				u.setBirth(rs.getString("birth"));
				u.setSex(rs.getString("sex"));
				u.setAge(rs.getInt("age"));
				return u;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
