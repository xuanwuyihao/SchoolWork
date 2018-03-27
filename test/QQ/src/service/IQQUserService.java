package service;

import java.util.List;
import java.util.Vector;

import bean.QQHistory;
import bean.QQUser;

public interface IQQUserService {
	public boolean addUser(QQUser use);//添加用户   -注册
	
	//检查QQ号是否已经存在
	public boolean checkQQnum(int qqnum);
	
	//验证QQ登录
	public QQUser checkUser(String qqnum,String pwd);
	
	//保存登录记录
	public boolean addhistory(QQHistory history);
	
	//查询登录历史
	public List selHistory();
	//更改用户状态
	public boolean changestatus(String qqnum,int status);
	
	//根据分组查询好友信息
	public Vector<QQUser> selFriendByGroup(String qqnum,String groupname);
	
	//查找好友的方法
	public Vector findUsers(QQUser user);
	
	//根据QQ号查询好友
	public QQUser findUserByQQnum(String qqnum);
	
	//好友添加的方法
	public boolean addFriend (String myqq,String fqq,String groupname);
	
	//查询是否为好友
	public boolean selFriend (String myqq,String fqq);
	
	//删除好友
	public 	boolean delFriend(String myqqnum,String fqqnum);
	
	//移动好友
	public boolean moveFriend (String myqq,String fqq,String groupname);
}
