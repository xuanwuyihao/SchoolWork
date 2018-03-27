package serviceImpl;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Businessbean;
import bean.Order;
import bean.Product;
import bean.Yzm;


import common.DBCconnection;

import service.Businessservice;

public class BusinessImpl implements Businessservice{

	public Businessbean businesslogin(Businessbean business) {
		Connection con=DBCconnection.getConnection();
		
		String sql="select * from business where bacc=? and bpwd=?";
		try {
			PreparedStatement prs=con.prepareStatement(sql);
			prs.setString(1, business.getBacc());
			prs.setString(2, business.getBpwd());
			ResultSet rs=prs.executeQuery();
			if(rs.next()){
				Businessbean bns=new Businessbean();
				bns.setBid(rs.getInt("bid"));
				bns.setBname(rs.getString("bname"));
				bns.setBpwd(rs.getString("bpwd"));
				bns.setBacc(rs.getString("bacc"));
				bns.setByyzz(rs.getString("byyzz"));
				bns.setBzlht(rs.getString("bzlht"));
				bns.setBcard(rs.getString("bcard"));
				bns.setBadrr(rs.getString("badrr"));
				bns.setBtel(rs.getString("btel"));
				bns.setBwifi(rs.getInt("bwifi"));
				bns.setBpark(rs.getInt("bpark"));
				bns.setBtotal(rs.getFloat("btotal"));
				bns.setBdate(rs.getString("bdate"));
				return bns;
				
			}
			rs.close();
			prs.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public boolean bzhce(Businessbean b) {
		Connection con=DBCconnection.getConnection();
		
		String sql="insert into business values(?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement prs=con.prepareStatement(sql);
			prs.setString(1, b.getBacc());
			prs.setString(2, b.getBpwd());
			prs.setString(3, b.getBname());
			prs.setString(4, b.getByyzz());
			prs.setString(5, b.getBzlht());
			prs.setString(6, b.getBcard());
			prs.setString(7, b.getBadrr());
			prs.setString(8, b.getBtel());
			prs.setInt(9, b.getBwifi());
			prs.setInt(10, b.getBpark());
			prs.setFloat(11, b.getBtotal());
			prs.setString(12, b.getBdate());
			
			int i=prs.executeUpdate();
			
			if(i>0){
				
				return true;
				
			}
			
			prs.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	//个人中心、
	public Businessbean bcenter(String  bacc) {
		Connection con=DBCconnection.getConnection();
		
		String sql="select * from business where bacc="+bacc;
		try {
			PreparedStatement prs=con.prepareStatement(sql);
			ResultSet rs=prs.executeQuery(); 
			if(rs.next()){
				Businessbean bns=new Businessbean();
				bns.setBid(rs.getInt("bid"));
				bns.setBname(rs.getString("bname"));
				bns.setBpwd(rs.getString("bpwd"));
				bns.setBacc(rs.getString("bacc"));
				bns.setByyzz(rs.getString("byyzz"));
				bns.setBzlht(rs.getString("bzlht"));
				bns.setBcard(rs.getString("bcard"));
				bns.setBadrr(rs.getString("badrr"));
				bns.setBtel(rs.getString("btel"));
				bns.setBwifi(rs.getInt("bwifi"));
				bns.setBpark(rs.getInt("bpark"));
				bns.setBtotal(rs.getFloat("btotal"));
				bns.setBdate(rs.getString("bdate"));
				return bns;
				
			}
			rs.close();
			prs.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//修改商家资料
	public boolean updbusiness(Businessbean bacc) {
		Connection con=DBCconnection.getConnection();
		
		String sql="update business set bacc=?,bname=?,bwifi=?,bpark=?,btel=? where bid=?";
		try {
			PreparedStatement prs=con.prepareStatement(sql);
			
			prs.setString(1, bacc.getBacc());
			prs.setString(2, bacc.getBname());
			prs.setInt(3, bacc.getBwifi());
			prs.setInt(4, bacc.getBpark());
			prs.setString(5, bacc.getBtel());
			prs.setInt(6, bacc.getBid());
			int i=prs.executeUpdate(); 
			if(i>0){
				return true;
			}
			
			prs.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean updpwd(Businessbean bpwd) {
		Connection con=DBCconnection.getConnection();
		
		String sql="update business set bpwd=? where bid=?";
		try {
			PreparedStatement prs=con.prepareStatement(sql);
			
			prs.setString(1, bpwd.getBpwd());
			prs.setInt(2, bpwd.getBid());
			
			int i=prs.executeUpdate(); 
			if(i>0){
				return true;
			}
			
			prs.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean upyyzz(Businessbean b) {
		Connection con=DBCconnection.getConnection();
		
		System.out.println(b.getBid());
		
		String sql="update business set byyzz=?,bzlht=?,bcard=?,badrr=? where bid=?";
		try {
			PreparedStatement prs=con.prepareStatement(sql);
			
			prs.setString(1, b.getByyzz());
			prs.setString(2, b.getBzlht());
			prs.setString(3, b.getBcard());
			prs.setString(4, b.getBadrr());
			prs.setInt(5, b.getBid());
			
			int i=prs.executeUpdate(); 
			if(i>0){
				return true;
			}
			
			prs.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	//团购
	public Product selcommodity(int pid) {
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

	public List selimgs(int pid) {
		List list=new ArrayList();
		Connection con=DBCconnection.getConnection();
		String sql="select lsrc from imgs where pid="+pid;
		
		try {
			PreparedStatement prst=con.prepareStatement(sql);
			ResultSet rs=prst.executeQuery();
			while(rs.next()){
				list.add(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}

	public Businessbean selbusiness(int bid) {
		Connection con=DBCconnection.getConnection();
		String sql="select * from business where bid="+bid;
		try {
			PreparedStatement prst =con.prepareStatement(sql);
			ResultSet rs=prst.executeQuery();
			while(rs.next()){
				Businessbean b=new Businessbean();
				b.setBid(rs.getInt("bid"));
				b.setBacc(rs.getString("bacc"));
				b.setBpwd(rs.getString("bpwd"));
				b.setBname(rs.getString("bname"));
				b.setByyzz(rs.getString("byyzz"));
				b.setBzlht(rs.getString("bzlht"));
				b.setBcard(rs.getString("bcard"));
				b.setBadrr(rs.getString("badrr"));
				b.setBtel(rs.getString("btel"));
				b.setBwifi(rs.getInt("bwifi"));
				b.setBpark(rs.getInt("bpark"));
				b.setBtotal(rs.getFloat("btotal"));
				b.setBdate(rs.getString("bdate"));
				return b;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public List selprodlist(int bid) {
		List list=new ArrayList();
		Connection con=DBCconnection.getConnection();
		String sql="select * from prod where bid="+bid;
		try {
			PreparedStatement prst =con.prepareStatement(sql);
			ResultSet rs=prst.executeQuery();
			while(rs.next()){
				Product p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setBid(rs.getInt("bid"));
				p.setBcount(rs.getInt("pcount"));
				p.setPname(rs.getString("pname"));
				p.setPmarket(rs.getFloat("pmarket"));
				p.setPprice(rs.getFloat("pprice"));
				p.setPtype1(rs.getString("ptype1"));
				p.setPtype2(rs.getString("ptype2"));
				p.setBtrad(rs.getString("ptrad"));
				p.setBcontent(rs.getString("pcontent"));
				p.setBdesc(rs.getString("pdesc"));
				p.setBshoucang(rs.getInt("pshoucang"));
				p.setBtime(rs.getString("ptime"));
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public String selimg(int prodid) {
		Connection conn = DBCconnection.getConnection();
		String sql = "select lsrc from imgs where pid=" + prodid;
		try {
			PreparedStatement prst = conn.prepareStatement(sql);
			ResultSet rs = prst.executeQuery();
			if (rs.next()) {
				return rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "";
	}

	public boolean prodadd(Product prod) {
		Connection conn = DBCconnection.getConnection();
		String sql = "insert into prod values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement prst = conn.prepareStatement(sql);
			prst.setInt(1, prod.getBid());
			prst.setString(2, prod.getPname());
			prst.setString(3, prod.getPtype1());
			prst.setString(4, prod.getPtype2());
			prst.setFloat(5, prod.getPprice());
			prst.setFloat(6, prod.getPmarket());
			prst.setString(7, prod.getBtrad());
			prst.setString(8, prod.getBcontent());
			prst.setString(9, prod.getBdesc());
			prst.setString(10, prod.getBtime());
			prst.setInt(11, prod.getBcount());
			prst.setInt(12, prod.getBshoucang());
			prst.setString(13, prod.getBdata());
			int i = prst.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public int selmaxprodid() {
		Connection conn = DBCconnection.getConnection();
		String sql = "select max(pid) from prod";
		try {
			PreparedStatement prst = conn.prepareStatement(sql);
			ResultSet rs = prst.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public boolean saveimg(int pid, String lsrc) {
		Connection conn = DBCconnection.getConnection();
		String sql = "insert into imgs values(0,"+pid+",0,'"+lsrc+"')";
		try {
			PreparedStatement prst = conn.prepareStatement(sql);
			int i = prst.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public List selprodlistbybid(int bid) {
		List list=new ArrayList();
		Connection con=DBCconnection.getConnection();
		String sql="select * from prod where bid="+bid;
		try {
			PreparedStatement prst = con.prepareStatement(sql);
			ResultSet rs = prst.executeQuery();
			while (rs.next()) {
				Product prod = new Product();
				prod.setPid(rs.getInt("pid"));
				prod.setBid(rs.getInt("bid"));
				prod.setBcount(rs.getInt("bcount"));
				prod.setPname(rs.getString("pname"));
				prod.setPmarket(rs.getFloat("pmarket"));
				prod.setPprice(rs.getFloat("pprice"));
				prod.setPtype1(rs.getString("ptype1"));
				prod.setPtype2(rs.getString("ptype2"));
				prod.setBtrad(rs.getString("btrad"));
				prod.setBcontent(rs.getString("bcontent"));
				prod.setBdesc(rs.getString("bdesc"));
				prod.setBshoucang(rs.getInt("bshoucang"));
				prod.setBtime(rs.getString("bdata"));
				list.add(prod);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	//搜索
	public List prodlist(String keyword) {
		List list=new ArrayList();
		Connection con=DBCconnection.getConnection();
		
			String sql="select pid from prod where pname like '%"+keyword+"%' or ptype1 like '%"
			+keyword+"%' or ptype2 like '%"+keyword+"%' or btrad like '%"
			+keyword+"%' and (pname like '%"+keyword+"%' or ptype1 like '%"
			+keyword+"%' or ptype2 like '%"+keyword+"%' or btrad like '%"+keyword+"%')";
		
		try {
			PreparedStatement prst = con.prepareStatement(sql);
			ResultSet rs = prst.executeQuery();
			while (rs.next()) {
				Product prod = new Product();
				prod.setPid(rs.getInt("pid"));
				prod.setBid(rs.getInt("bid"));
				prod.setBcount(rs.getInt("pcount"));
				prod.setPname(rs.getString("pname"));
				prod.setPmarket(rs.getFloat("pmarket"));
				prod.setPprice(rs.getFloat("pprice"));
				list.add(prod);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public boolean updcommodity(Product prod) {
		Connection conn = DBCconnection.getConnection();
		String sql = "update prod set pname=?,ptype1=?,ptype2=?,pprice=?,pmarket=?,btrad=?,bcontent=?,bdesc=?,btime=?,bcount=?,bshoucang=?,bdata=? where bid=?";
		try {
			PreparedStatement prst = conn.prepareStatement(sql);
			
			prst.setString(1, prod.getPname());
			prst.setString(2, prod.getPtype1());
			prst.setString(3, prod.getPtype2());
			prst.setFloat(4, prod.getPprice());
			prst.setFloat(5, prod.getPmarket());
			prst.setString(6, prod.getBtrad());
			prst.setString(7, prod.getBcontent());
			prst.setString(8, prod.getBdesc());
			prst.setString(9, prod.getBtime());
			prst.setInt(10, prod.getBcount());
			prst.setInt(11, prod.getBshoucang());
			prst.setString(12, prod.getBdata());
			prst.setInt(13, prod.getBid());
			int i = prst.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public Product selprod(int pid) {
		Connection con=DBCconnection.getConnection();
		String sql="select * from prod where pid="+pid;
		System.out.println(sql);
		try {
			PreparedStatement prst = con.prepareStatement(sql);
			ResultSet rs = prst.executeQuery();
			while (rs.next()) {
				Product prod = new Product();
				prod.setPid(rs.getInt("pid"));
				prod.setBid(rs.getInt("bid"));
				prod.setBcount(rs.getInt("bcount"));
				prod.setPname(rs.getString("pname"));
				prod.setPmarket(rs.getFloat("pmarket"));
				prod.setPprice(rs.getFloat("pprice"));
				prod.setPtype1(rs.getString("ptype1"));
				prod.setPtype2(rs.getString("ptype2"));
				prod.setBtrad(rs.getString("btrad"));
				prod.setBcontent(rs.getString("bcontent"));
				prod.setBdesc(rs.getString("bdesc"));
				prod.setBshoucang(rs.getInt("bshoucang"));
				prod.setBtime(rs.getString("bdata"));
				
					return prod;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Businessbean selbusinesslist(int bid) {
		Connection con=DBCconnection.getConnection();
		String sql="select * from business where bid="+bid;
		try {
			PreparedStatement prst = con.prepareStatement(sql);
			ResultSet rs = prst.executeQuery();
			while (rs.next()) {
				Businessbean b=new Businessbean();
				b.setBid(rs.getInt("bid"));
				b.setBacc(rs.getString("bacc"));
				b.setBpwd(rs.getString("bpwd"));
				b.setBname(rs.getString("bname"));
				b.setByyzz(rs.getString("byyzz"));
				b.setBzlht(rs.getString("bzlht"));
				b.setBcard(rs.getString("bcard"));
				b.setBadrr(rs.getString("badrr"));
				b.setBtel(rs.getString("btel"));
				b.setBwifi(rs.getInt("bwifi"));
				b.setBpark(rs.getInt("bpark"));
				b.setBtotal(rs.getFloat("btotal"));
				b.setBdate(rs.getString("bdate"));
				return b;

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//查询验证
	public boolean bupdorders(String yzm) {
		Connection conn=DBCconnection.getConnection();
		String sql = "update [order] set ostate=2 where oyzm="+yzm;
		try {
			PreparedStatement prst = conn.prepareStatement(sql);
			
			int i = prst.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("查询验证订单信息失败0000！");
			e.printStackTrace();
		}
		return false;
	}
	
	//获取验证码
	public Order seloidbybid(String yzm) {
		Connection conn=DBCconnection.getConnection();
		Order list = new Order();
		String sql = "select * from [order] where oyzm="+yzm;
		try {
			PreparedStatement prst = conn.prepareStatement(sql);
			ResultSet rs = prst.executeQuery();
			while (rs.next()) {
				Order order=  new Order();
				order.setOid(rs.getInt("oid"));
				order.setUid(rs.getInt("uid"));
				order.setBid(rs.getInt("bid"));
				order.setPid(rs.getInt("pid"));
				order.setOprice(rs.getFloat("oprice"));
				order.setOcount(rs.getInt("ocount"));
				order.setOtotal(rs.getFloat("ototal"));
				order.setOyzm(rs.getString("oyzm"));
				order.setOstate(rs.getInt("ostate"));
				return order;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("获取验证码失败0000！");
			e.printStackTrace();
		}
		return null;
	}
	
	//新增验证表
	public boolean addyzb(Yzm yzb){
		Connection conn=DBCconnection.getConnection();
		String sql = "insert into yzb values(?,?,?,?,?)";
		try {
			PreparedStatement prst = conn.prepareStatement(sql);
			prst.setInt(1, yzb.getBid ());
			prst.setInt(2, yzb.getOid());
			prst.setString(3, yzb.getYzm());
			prst.setFloat(4, yzb.getYprice());
			prst.setString(5, yzb.getYdate());
			
			
			int i = prst.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("新增验证表失败0000！");
			e.printStackTrace();
		}
		return false;
	}
	
	//查询商品详情
	public Product selprodbyid(int pid) {
		Connection conn=DBCconnection.getConnection();
		Product prod = new Product();
		String sql = "select * from prod where pid="+pid;
		try {
			PreparedStatement prst = conn.prepareStatement(sql);
			ResultSet rs = prst.executeQuery();
			if (rs.next()) {
				prod.setPid(rs.getInt("pid"));
				prod.setBid(rs.getInt("bid"));
				prod.setBcount(rs.getInt("bcount"));
				prod.setPname(rs.getString("pname"));
				prod.setPmarket(rs.getFloat("pmarket"));
				prod.setPprice(rs.getFloat("pprice"));
				prod.setPtype1(rs.getString("ptype1"));
				prod.setPtype2(rs.getString("ptype2"));
				prod.setBtrad(rs.getString("btrad"));
				prod.setBcontent(rs.getString("bcontent"));
				prod.setBdesc(rs.getString("bdesc"));
				prod.setBshoucang(rs.getInt("bshoucang"));
				prod.setBtime(rs.getString("btime"));
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("查询商品详情失败0000！");
			e.printStackTrace();
		}
		return prod;
	}

	public boolean delprodbyid(int pid) {
		Connection conn=DBCconnection.getConnection();
		String sql="delete from prod where pid=" +pid;
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
}
