package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import serviceImpl.Onshopimpl;
import common.DBCconnection;
import bean.Assess;
import bean.Browse;
import bean.Businessbean;
import bean.Collects;
import bean.Order;
import bean.Product;

import bean.Userbean;


public class Onshops implements Onshopimpl{
    
	public List prodshow(int currpage, int pagecount,String keyword) {
		List list=new ArrayList();
		Connection con=DBCconnection.getConnection();
		String sql="select top " + pagecount+ " * from prod where pid not in (select top " + (currpage - 1)* pagecount + " pid from prod)";
		//有搜索关键字 
		if (keyword != null && !"".equals(keyword)) {
			sql = "select top " + pagecount
			+ " * from prod where pid not in (select top " + (currpage - 1)
			* pagecount + " pid from prod where pname like '%" + keyword + "%' or ptype1 like '%"
					+ keyword + "%' or ptype2 like '%" + keyword
					+ "%' or btrad like '%" + keyword + "%') and  (pname like '%" + keyword + "%' or ptype1 like '%"
					+ keyword + "%' or ptype2 like '%" + keyword
					+ "%' or btrad like '%" + keyword + "%')";
		}
		
		
		try {
			PreparedStatement  prest=con.prepareStatement(sql);
			ResultSet re=prest.executeQuery();
			while(re.next()){
				Product  b=new Product();
				b.setPid(re.getInt("pid"));
				b.setBid(re.getInt("bid"));
				b.setPname(re.getString("pname"));
				b.setPprice(re.getFloat("pprice"));
			    b.setBcount(re.getInt("bcount"));	
			    b.setPmarket(re.getFloat("pmarket"));		  
			    list.add(b);
			}
			re.close();
			prest.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	
	}
	
	public int prodrows(String keyword) {
		Connection conn = DBCconnection.getConnection();
		String sql = "select count(*) from prod ";
		if (keyword != null && !"".equals(keyword)) {
			sql += " where pname like '%" + keyword + "%' or ptype1 like '%"
					+ keyword + "%' or ptype2 like '%" + keyword
					+ "%' or btrad like '%" + keyword + "%'";
		}
		try {
			PreparedStatement prst = conn.prepareStatement(sql);
			ResultSet rs = prst.executeQuery();
			while (rs.next()) {
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
		
		
		
	}

	public String selimg(int prodid) {
		Connection con=DBCconnection.getConnection();
		String sql="select lsrc  from imgs where  pid="+prodid;
		try {
			PreparedStatement prst=con.prepareStatement(sql);
			ResultSet re=prst.executeQuery();
			if(re.next()){
				return re.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public Product selprodbyid(int pid) {
		Connection con=DBCconnection.getConnection();
		String sql="select * from prod where pid="+pid;
		try {
			PreparedStatement prst=con.prepareStatement(sql);
			ResultSet rs=prst.executeQuery();
			while(rs.next()){
				Product p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setBid(rs.getInt("bid"));
				p.setBcount(rs.getInt("bcount"));
				p.setPname(rs.getString("pname"));
				p.setPmarket(rs.getFloat("pmarket"));
				p.setPprice(rs.getFloat("pprice"));
				p.setPtype1(rs.getString("ptype1"));
				p.setPtype2(rs.getString("ptype2"));
				p.setBtrad(rs.getString("btrad"));
				p.setBcontent(rs.getString("bcontent"));
				p.setBdesc(rs.getString("bdesc"));
				p.setBshoucang(rs.getInt("bshoucang"));
				p.setBtime(rs.getString("btime"));
				return p;
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public List selimgsbyid(int pid) {
		List list=new ArrayList();
		Connection con =DBCconnection.getConnection();
		String sql ="select lsrc from imgs where pid="+pid;
	       try {
			PreparedStatement prst=con.prepareStatement(sql);
			ResultSet re=prst.executeQuery();
			while(re.next()){
				list.add(re.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public Businessbean selbusinessbyid(int bid) {
	    Connection con =DBCconnection.getConnection();
	    String sql="select * from business where bid="+bid;
	    try {
			PreparedStatement prst=con.prepareStatement(sql);
			ResultSet re=prst.executeQuery();
			while(re.next()){
				Businessbean bu= new Businessbean();
				bu.setBid(re.getInt("bid"));//id
				bu.setBname(re.getString("bname"));//名称
				bu.setByyzz(re.getString("byyzz"));//营业执照
				bu.setBacc(re.getString("bacc"));//商家账号
				bu.setBzlht(re.getString("bzlht"));
				bu.setBcard(re.getString("bcard"));
				bu.setBadrr(re.getString("badrr"));
				bu.setBtel(re.getString("btel"));
				bu.setBwifi(re.getInt("bwifi"));
				bu.setBpark(re.getInt("bpark"));
				bu.setBtotal(re.getFloat("btotal"));
				bu.setBdate(re.getString("bdate"));
				return  bu;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Boolean orders(Order orders) {
		Connection con =DBCconnection.getConnection();
		String sql =" insert  into  [order]  values(?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement prst=con.prepareStatement(sql);	
			prst.setInt(1,orders.getUid() );
			prst.setInt(2, orders.getBid());
			prst.setInt(3, orders.getPid());
			prst.setFloat(4, orders.getOprice());
			prst.setInt(5, orders.getOcount());
			prst.setFloat(6, orders.getOtotal());
			prst.setString(7, orders.getOdate());
			prst.setString(8, orders.getOyzm());
			prst.setInt(9, orders.getOstate());
			int i=prst.executeUpdate();
			if(i>0){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public int seloidbyuid(int uid) {
		Connection conn=DBCconnection.getConnection();
		String sql="select max(oid) from [order] where uid="+uid;
		try {
			PreparedStatement prst=conn.prepareStatement(sql);
			ResultSet re=prst.executeQuery();
			if(re.next()){
				return re.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public Boolean updorderstate(int oid, int state) {
		Connection conn=DBCconnection.getConnection();
		String sql="update [order] set ostate="+state+"where oid="+oid;
		try {
			PreparedStatement prst=conn.prepareStatement(sql);
			int i=prst.executeUpdate();
			if(i>0){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public Boolean updyzmbyoid(int oid, String yzm) {
		Connection conn=DBCconnection.getConnection();
		String sql="update [order] set oyzm="+yzm+"where oid="+oid;
		try {
			PreparedStatement prst=conn.prepareStatement(sql);
			int i=prst.executeUpdate();
			if(i>0){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public List selorderbyuid(int uid) {
		List list=new ArrayList();
		Connection con =DBCconnection.getConnection();
		String sql ="select * from [order] where uid="+uid;
	       try {
			PreparedStatement prst=con.prepareStatement(sql);
			ResultSet re=prst.executeQuery();
			while(re.next()){
				Order oder=new Order();
				oder.setBid(re.getInt("bid"));
				oder.setOid(re.getInt("oid"));
				oder.setPid(re.getInt("pid"));
				oder.setUid(re.getInt("uid"));
				oder.setOprice(re.getFloat("oprice"));
				oder.setOcount(re.getInt("ocount"));
				oder.setOtotal(re.getFloat("ototal"));
				oder.setOdate(re.getString("odate"));
				oder.setOyzm(re.getString("oyzm"));
				oder.setOstate(re.getInt("ostate"));
				list.add(oder);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public String selyzm(int oid) {
		Connection con=DBCconnection.getConnection();
		String sql="select oyzm  from [order] where  oid="+oid;
		try {
			PreparedStatement prst=con.prepareStatement(sql);
			ResultSet re=prst.executeQuery();
			if(re.next()){
				return re.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public Boolean saveassess(Assess ass) {
		Connection con =DBCconnection.getConnection();
		String sql =" insert  into  assess  values(?,?,?,?,?,?)";
		try {
			PreparedStatement prst=con.prepareStatement(sql);	
			
			prst.setInt(1, ass.getOid());
			prst.setInt(2,ass.getUid());
			prst.setInt(3, ass.getPid());
			prst.setInt(4, ass.getBid());
			prst.setInt(5, ass.getAstar());
			prst.setString(6, ass.getAcontent());
			int i=prst.executeUpdate();
			if(i>0){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
	public Userbean login(Userbean user) {
		Connection conn = DBCconnection.getConnection();
		String sql = "select * from users where uaccount=? and upwd=?";
		try {
			PreparedStatement prst = conn.prepareStatement(sql);
			prst.setString(1, user.getUaccount());
			prst.setString(2, user.getUpwd());
			ResultSet rs = prst.executeQuery();
			if(rs.next()){
				Userbean u = new Userbean();
				u.setUid(rs.getInt("uid"));
				u.setUaccount(rs.getString("uaccount"));
				u.setUpwd(rs.getString("upwd"));
				u.setUnickname(rs.getString("unickname"));
				u.setUbirth(rs.getString("ubirth"));
				u.setUsix(rs.getString("usix"));
				u.setUface(rs.getString("uface"));
				u.setUmoney(rs.getFloat("umoney"));
				u.setUmail(rs.getString("umail"));
				return u;				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Boolean enroll(Userbean users) {
		Connection conn = DBCconnection.getConnection();
		String sql = "insert into users values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement prst = conn.prepareStatement(sql);
			prst.setString(1, users.getUaccount());
			prst.setString(2, users.getUpwd());
			prst.setString(3, users.getUnickname());
			prst.setString(4, users.getUface());
			prst.setFloat(5, users.getUmoney());
			prst.setString(6, users.getUbirth());
			prst.setString(7, users.getUsix());
			prst.setString(8, users.getUmail());
			
			int i=prst.executeUpdate();
			if(i>0){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public Userbean selbyacc(String account) {
		Connection con=DBCconnection.getConnection();
		String sql="select * from users where uaccount="+account;
		try {
			PreparedStatement prs=con.prepareStatement(sql);
			ResultSet re=prs.executeQuery();	
			if(re.next()){
				Userbean u=new Userbean();
				u.setUid(re.getInt("uid"));
				u.setUnickname(re.getString("unickname"));
				u.setUmoney(re.getFloat("umoney"));
				u.setUbirth(re.getString("ubirth"));
				u.setUsix(re.getString("usix"));
				u.setUaccount(re.getString("uaccount"));
				u.setUface(re.getString("uface"));
				u.setUmail(re.getString("umail"));
				return u;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Boolean upinfo(Userbean us) {
		Connection con =DBCconnection.getConnection();
		String sql="update users set unickname=?,uface=?,ubirth=?,usix=? where uaccount=?";
		try {
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setString(1, us.getUnickname());
			pre.setString(2, us.getUface());
			pre.setString(3, us.getUbirth());
			pre.setString(4, us.getUsix());
			pre.setString(5, us.getUaccount());
			int i=pre.executeUpdate();
			if(i>0){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public Boolean inpwd(Userbean p) {
		Connection con =DBCconnection.getConnection();
		String sql="update users set upwd=? where uaccount=?";
		try {
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setString(1, p.getUnickname());		
			pre.setString(2, p.getUaccount());
			int i=pre.executeUpdate();
			if(i>0){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public Assess selassess(int pid) {
		Connection con=DBCconnection.getConnection();
		String sql="select * from assess where  pid="+pid;
		try {
			PreparedStatement prst=con.prepareStatement(sql);
			ResultSet rs=prst.executeQuery();
			while(rs.next()){
				Assess a=new Assess();
				a.setAid(rs.getInt("aid"));
				a.setOid(rs.getInt("oid"));
				a.setUid(rs.getInt("uid"));
				a.setPid(rs.getInt("pid"));
				a.setBid(rs.getInt("bid"));
				a.setAstar(rs.getInt("astar"));
				a.setAcontent(rs.getString("acontent"));
				return a;
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Boolean savecollect(Collects co) {
		Connection con =DBCconnection.getConnection();
		String sql =" insert  into  collect  values(?,?,?)";
		try {
			PreparedStatement prst=con.prepareStatement(sql);	
			
			prst.setInt(1, co.getUid());
			prst.setInt(2,co.getPid());
			prst.setString(3, co.getCdate());
			int i=prst.executeUpdate();
			if(i>0){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public Boolean savebrowse(Browse bro) {
		Connection con =DBCconnection.getConnection();
		String sql =" insert  into  browse  values(?,?)";
		try {
			PreparedStatement prst=con.prepareStatement(sql);				
			prst.setInt(1, bro.getUid());
			prst.setInt(2,bro.getPid());
			int i=prst.executeUpdate();
			if(i>0){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean urcharge(Userbean users) {
		Connection con=DBCconnection.getConnection();
		String sql="update users set umoney=? where uaccount=? and upwd=?";	
		try {
			PreparedStatement pre=con.prepareStatement(sql);
		     
			pre.setFloat(1, users.getUmoney());		
			pre.setString(2,users.getUaccount() );
			pre.setString(3,users.getUpwd());
			int i=pre.executeUpdate();
			if(i>0){
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public List selcollectbyuid(int uid) {
		List list=new ArrayList();
		Connection con =DBCconnection.getConnection();
		String sql ="select * from collect where uid="+uid;
	       try {
			PreparedStatement prst=con.prepareStatement(sql);
			ResultSet re=prst.executeQuery();
			while(re.next()){
				Collects co=new Collects();
				co.setPid(re.getInt("pid"));
				co.setCdate(re.getString("cdate"));
				co.setCid(re.getInt("cid"));
				co.setUid(re.getInt("uid"));
				list.add(co);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
}