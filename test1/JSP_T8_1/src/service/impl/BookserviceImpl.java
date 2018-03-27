package service.impl;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.bean;

import comment.DBConnection;

import service.Bookservice;

public class BookserviceImpl implements Bookservice{

	public List list(int currpage, int pagecount) {
		List list=new ArrayList();
		Connection conn=DBConnection.getconnection();
		String sql="select top"+pagecount+"* from bookx where bid not in (select top "+(currpage-1)*pagecount+" bid from bookx)";
		try {
			PreparedStatement ps= conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				bean b=new bean();
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
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//查询总行数
	public int selrows() {
		Connection conn=DBConnection.getconnection();
		String sql="select count(*) from bookx";
		try {
			PreparedStatement ps= conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				rs.getInt(1);
				
			}
			rs.close();
			conn.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

}
