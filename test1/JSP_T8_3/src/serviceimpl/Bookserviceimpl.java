package serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DBConnection;



import bean.bookx;
import service.IBookservice;

public class Bookserviceimpl implements IBookservice{

	public List<bookx> prodlist() {
		List list=new ArrayList();
		Connection con=DBConnection.getConnection();
		String sql="select top 5 * from trade where id not in (select top 0 id from trade)";
		try {
			PreparedStatement prst=con.prepareCall(sql);
			ResultSet rs=prst.executeQuery();
			
			while(rs.next()){
				bookx b=new bookx();
				b.setId(rs.getInt("id"));
				b.setPname(rs.getString("pname"));
				b.setPrice(rs.getInt("price"));
				b.setPdate(rs.getString("pdate"));
				b.setPcounty(rs.getString("pcountry"));
				b.setPcount(rs.getInt("pcount"));
				list.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public int totalrow() {
		Connection conn=DBConnection.getConnection();
		
		String sql="select count(*) from trade";
		try {
			PreparedStatement pr=conn.prepareStatement(sql);
			ResultSet rs= pr.executeQuery();
			if(rs.next()){
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

}
