package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCdome {
	public static void main(String[] args) {
		//注意以下几点
		//1,数据库服务要开启
		//2,数据库的TCP/IP协议要启动
		//3,要导入驱动包 以及属性配置要正确
		
		//数据库连接步骤：
		
		//1,导入数据库驱动包  右键项目 - properties - java build path - Labraries - add Extranal jars
		//2,配置数据库连接属性
		
		//路径
		//jdbc:sqlserver://数据库IP[localhost/127.0.0.1/计算机名称]:数据库端口;databasename=数据库名称（不区分大小写）
		String url="jdbc:sqlserver://localhost:1433;databasename=student";
		//驱动
		String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		//数据库用户名
		String username="sa";
		//用户名密码
		String pwd="0628";
		
		
		try {
			//3,加载驱动
			Class.forName(driver);
			
			//4,获取数据库连接
			Connection con=DriverManager.getConnection(url, username, pwd);
			
			//操作数据库
			//得到陈述对象statement
			Statement state=con.createStatement();
			//1,使用sql语句得到结果集 查询用executeQuery 增删改用executeUpdate
			ResultSet rs=state.executeQuery("select * from student");
			//遍历结果集
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
			
			//关闭
			rs.close();
			state.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
