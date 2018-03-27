package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import common.DbcConnection;

import bean.QQHistory;
import bean.QQUser;
import service.IQQUserService;

public class QQUserServiceimp implements IQQUserService{

	public boolean addUser(QQUser use) {
		//得到数据库连接
		Connection con=DbcConnection.getconnection();
		String sql="insert into QQ values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setString(1, use.getQqnum());
			pre.setString(2, use.getUname());
			pre.setString(3, use.getPwd());
			pre.setString(4, use.getSex());
			pre.setString(5, use.getBirthday());
			pre.setString(6, use.getAddress());
			pre.setString(7, use.getHaoma());
			pre.setString(8, use.getFace());
			pre.setInt(9, use.getStatus());
			pre.setInt(10, use.getLeves());
			pre.setString(11, use.getQm());
			pre.setString(12, use.getIp());
			pre.setString(13, use.getPort());
			pre.setInt(14, use.getEag());
			int i=pre.executeUpdate();
			if (i>0) {
				return true;
			}
			pre.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean checkQQnum(int qqnum) {
		Connection con=DbcConnection.getconnection();
		String sql="select * from QQ where qqnum="+qqnum;
		try {
			PreparedStatement pr=con.prepareStatement(sql);
			ResultSet rs=pr.executeQuery();
			if (rs.next()) {
				return true;//此QQ已经存在
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//验证登录
	public QQUser checkUser(String qqnum, String pwd) {
		Connection con=DbcConnection.getconnection();
		String sql="select * from QQ where qqnum=? and pwd=?";
		try {
			PreparedStatement prs=con.prepareStatement(sql);
			prs.setString(1, qqnum);
			prs.setString(2, pwd);
			ResultSet rs=prs.executeQuery();
			if (rs.next()) {
				QQUser user=new QQUser();
				user.setId(rs.getInt("id"));
				user.setQqnum(rs.getString("qqnum"));
				user.setUname(rs.getString("uname"));
				user.setPwd(rs.getString("pwd"));
				user.setSex(rs.getString("sex"));
				user.setBirthday(rs.getString("birthday"));
				user.setAddress(rs.getString("address"));
				user.setHaoma(rs.getString("haoma"));
				user.setFace(rs.getString("face"));
				user.setStatus(rs.getInt("status"));
				user.setLeves(rs.getInt("leves"));
				user.setQm(rs.getString("qm"));
				user.setIp(rs.getString("ip"));
				user.setPort(rs.getString("port"));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public boolean addhistory(QQHistory history) {
		//得到数据库连接
		Connection con=DbcConnection.getconnection();
		//删除旧的登录历史，保存新的历史
		String sql="delete from QQhistory where qqnum='"+history.getQqnum()+"'";
		sql+="insert into QQhistory values(?,?,?,?,?)";
		try {
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setString(1, history.getQqnum());
			pre.setString(2, history.getPwt());
			pre.setString(3, history.getFace());
			pre.setInt(4, history.getAutologin());
			pre.setInt(5, history.getState());
			
			int i=pre.executeUpdate();
			if (i>0) {
				return true;
			}
			pre.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	public List selHistory() {
		List list=new ArrayList();
		Connection con=DbcConnection.getconnection();
		String sql="select * from QQhistory";
		try {
			PreparedStatement prs=con.prepareStatement(sql);
			ResultSet rs=prs.executeQuery();
			while(rs.next()) {
				QQHistory history=new QQHistory();
				history.setQqnum(rs.getString("qqnum"));
				history.setPwt(rs.getString("pwd"));
				history.setFace(rs.getString("face"));
				history.setAutologin(rs.getInt("autologin"));
				history.setState(rs.getInt("state"));
				list.add(history);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	//更改用户状态
	public boolean changestatus(String qqnum, int status) {
		Connection con=DbcConnection.getconnection();
		String sql="update QQ set status=? where qqnum=?";
		try {
			PreparedStatement prs=con.prepareStatement(sql);
			prs.setInt(1, status);
			prs.setString(2, qqnum);
			int i=prs.executeUpdate();
			if (i>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//根据分组获取好友信息
	public Vector<QQUser> selFriendByGroup(String qqnum, String groupname) {
		System.out.println("qqnum"+qqnum+"groupanme"+groupname);
		Vector<QQUser> vv=new Vector<QQUser>();
		Connection con=DbcConnection.getconnection();
		String sql="select * from QQ where qqnum in (select fqq from qqfriend where myqq=? and groupname=?)";
		try {
			PreparedStatement pre =con.prepareStatement(sql);
			pre.setString(1, qqnum);
			pre.setString(2, groupname);
			ResultSet rs=pre.executeQuery();
			while (rs.next()) {
				QQUser user=new QQUser();
				user.setId(rs.getInt("id"));
				user.setQqnum(rs.getString("qqnum"));
				user.setUname(rs.getString("uname"));
				user.setPwd(rs.getString("pwd"));
				user.setSex(rs.getString("sex"));
				user.setBirthday(rs.getString("birthday"));
				user.setAddress(rs.getString("address"));
				user.setHaoma(rs.getString("haoma"));
				user.setFace(rs.getString("face"));
				user.setStatus(rs.getInt("status"));
				user.setLeves(rs.getInt("leves"));
				user.setQm(rs.getString("qm"));
				user.setIp(rs.getString("ip"));
				user.setPort(rs.getString("port"));
				vv.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vv;
	}

	public Vector findUsers(QQUser user) {
		Vector vects=new Vector();
		Connection conn=DbcConnection.getconnection();
		String sql="select * from QQ where 1=1";
		//QQ号
		if (!user.getQqnum().equals("")) {
			sql+="and qqnum='"+user.getQqnum()+"'";
		}
		//昵称	
		if (!user.getUname().equals("")) {
			sql+="and uname like '%"+user.getUname()+"%'";
		}
		//年龄
		if (user.getEag()!=0) {
			sql+="and eag='"+user.getEag()+"'";
		}
		//性别
		if (!user.getSex().equals("")) {
			sql+="and sex='"+user.getSex()+"'";
		}
		
		try {
			PreparedStatement prst=conn.prepareStatement(sql);
			ResultSet rs=prst.executeQuery();
			while (rs.next()) {
				Vector<String> v=new Vector<String>();
				v.add(rs.getString("qqnum"));
				v.add(rs.getString("uname"));
				v.add(rs.getInt("eag")+"");
				v.add(rs.getString("sex"));
				v.add(rs.getString("leves"));
				v.add(rs.getString("address"));
				
				vects.add(v);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vects;
	}

	public QQUser findUserByQQnum(String qqnum) {
		Connection con=DbcConnection.getconnection();
		String sql="select * from QQ where qqnum=?";
		try {
			PreparedStatement prs=con.prepareStatement(sql);
			prs.setString(1, qqnum);
			ResultSet rs=prs.executeQuery();
			if (rs.next()) {
				QQUser user=new QQUser();
				user.setId(rs.getInt("id"));
				user.setQqnum(rs.getString("qqnum"));
				user.setUname(rs.getString("uname"));
				user.setPwd(rs.getString("pwd"));
				user.setSex(rs.getString("sex"));
				user.setBirthday(rs.getString("birthday"));
				user.setAddress(rs.getString("address"));
				user.setHaoma(rs.getString("haoma"));
				user.setFace(rs.getString("face"));
				user.setStatus(rs.getInt("status"));
				user.setLeves(rs.getInt("leves"));
				user.setQm(rs.getString("qm"));
				user.setIp(rs.getString("ip"));
				user.setPort(rs.getString("port"));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//添加好友
	public boolean addFriend(String myqq, String fqq, String groupname) {
		//得到数据库连接
		Connection con=DbcConnection.getconnection();
		//删除旧的登录历史，保存新的历史
		String sql="insert into QQFRIEND values('"+myqq+"','"+fqq+"','"+groupname+"')";
		sql+="insert into qqfriend values('"+fqq+"','"+myqq+"','"+groupname+"')";
		try {
			PreparedStatement pre=con.prepareStatement(sql);
		
			int i=pre.executeUpdate();
			if (i>0) {
				return true;
			}
			pre.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	//查询是否是好友
	public boolean selFriend(String myqq, String fqq) {
		Connection con=DbcConnection.getconnection();
		String sql="select * from QQFRIEND where myqq=? and fqq=?";
		try {
			PreparedStatement pr=con.prepareStatement(sql);
			pr.setString(1, myqq);
			pr.setString(2, fqq);
			ResultSet rs=pr.executeQuery();
			if (rs.next()) {
				return true;//已经是好友了
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	//删除好友
	public boolean delFriend(String myqqnum, String fqqnum) {
		//得到数据库连接
		Connection con=DbcConnection.getconnection();
		//删除旧的登录历史，保存新的历史
		String sql="delete qqfriend where myqq='"+myqqnum+"' and fqq='"+fqqnum+"'";
		sql+="delete qqfriend where myqq='"+fqqnum+"' and fqq='"+myqqnum+"'";
		try {
			PreparedStatement pre=con.prepareStatement(sql);
		
			int i=pre.executeUpdate();
			if (i>0) {
				return true;
			}
			pre.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean moveFriend(String myqq, String fqq, String groupname) {
		//得到数据库连接
		Connection con=DbcConnection.getconnection();
		//删除旧的登录历史，保存新的历史
		String sql="update qqfriend set groupname=? where myqq=? and fqq=?";
		try {
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setString(1, groupname);
			pre.setString(2, myqq);
			pre.setString(3, fqq);
			int i=pre.executeUpdate();
			if (i>0) {
				return true;
			}
			pre.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
