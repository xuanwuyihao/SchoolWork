package serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import comment.DBConnection;

import bean.Prod;
import service.IprodService;

public class ProdServiceImpl implements IprodService{

	public List<Prod> prodlist(int pageCount, int currPage) {
		List list=new ArrayList();
		Connection conn=DBConnection.getConnection();
		String sql="select top "+pageCount+" * from trade where id not in (select top "+(currPage-1)*pageCount+" id from trade)";
		try {
			PreparedStatement prst= conn.prepareCall(sql);
			ResultSet rs=  prst.executeQuery();
			while(rs.next()){
				Prod p=new Prod();
				p.setId(rs.getInt("id"));
				p.setPname(rs.getString("pname"));
				p.setPrice(rs.getInt("price"));
				p.setPdate(rs.getString("pdate"));
				p.setPcounty(rs.getString("pcountry"));
				p.setPcount(rs.getInt("pcount"));
				list.add(p);
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
			PreparedStatement prst=conn.prepareStatement(sql);
			ResultSet rs=prst.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	} 
}
