package service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DBConnection;





import bean.prod;
import service.IProdService;

public class prodServiceImpl implements IProdService{
	
	//��ѯ�б�
	public List<prod> list() {
		List<prod> list=new ArrayList<prod>();
		//�õ����ݿ�����
		Connection con=DBConnection.getConnection();
		String sql="select *from prod";
		
		try {
			//�õ�Ԥ�������
			PreparedStatement prst= con.prepareStatement(sql);
			ResultSet rs= prst.executeQuery();
			while(rs.next()){
				prod p=new prod();
				p.setId(rs.getInt("id"));
				p.setPname(rs.getString("pname"));
				p.setPrice(rs.getFloat("price"));
				p.setPdate(rs.getString("pdate"));
				p.setPricty(rs.getString("pricty"));
				p.setPcount(rs.getInt("pcount"));
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	//�����Ʒ
	public boolean add(prod prod) {
		Connection conn=DBConnection.getConnection();
		String sql="insert into prod values(?,?,?,?,?)";
		
		try {
			PreparedStatement prst=conn.prepareStatement(sql);
			//��������
			prst.setString(1, prod.getPname());
			prst.setFloat(2, prod.getPrice());
			prst.setString(3, prod.getPdate());
			prst.setString(4, prod.getPricty());
			prst.setInt(5, prod.getPcount());
			
			int i=prst.executeUpdate();
			if (i>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	//����ID��ѯ��Ʒ
	public prod selbyid(int id) {
		//�õ����ݿ�����
		Connection con=DBConnection.getConnection();
		String sql="select *from prod where id="+id ;
		
		try {
			//�õ�Ԥ�������
			PreparedStatement prst= con.prepareStatement(sql);
			ResultSet rs= prst.executeQuery();
			while(rs.next()){
				prod p=new prod();
				p.setId(rs.getInt("id"));
				p.setPname(rs.getString("pname"));
				p.setPrice(rs.getFloat("price"));
				p.setPdate(rs.getString("pdate"));
				p.setPricty(rs.getString("pricty"));
				p.setPcount(rs.getInt("pcount"));
				return p;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public boolean upd(prod prod) {
		Connection conn=DBConnection.getConnection();
		String sql="update prod set pname=?,price=?,pricty=?,pdate=?,pcount=? where id=?";
		
		try {
			PreparedStatement prst=conn.prepareStatement(sql);
			//��������
			prst.setString(1, prod.getPname());
			prst.setFloat(2, prod.getPrice());
			prst.setString(3, prod.getPdate());
			prst.setString(4, prod.getPricty());
			prst.setInt(5, prod.getPcount());
			prst.setInt(6, prod.getId());
			int i=prst.executeUpdate();
			if (i>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
