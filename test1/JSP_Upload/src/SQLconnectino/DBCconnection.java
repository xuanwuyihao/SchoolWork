package SQLconnectino;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCconnection {
           private  static  String  url="jdbc:sqlserver://localhost:1433;databasename=SQL2005";
           private   static  String  drive="com.microsoft.sqlserver.jdbc.SQLServerDriver";
           private  static  String uname="sa";
           private  static  String pwd="0628";
           private static Connection  conn=null;
           
           static{
        	   try {
				Class.forName(drive);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           }
           public static Connection getConnection(){
        	   try {
        		   if(conn==null||conn.isClosed()){
        			   conn=DriverManager.getConnection(url,uname,pwd);
        		   }
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
           }
           
          public static void main(String[] args) {
			System.out.print(DBCconnection.getConnection());
		}
}
