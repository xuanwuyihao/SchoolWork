package SQLconnectino;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class SQLconnection {
	public static void main(String[] args) {
		Connection con=DBCconnection.getConnection();
		String sql="{call up_saveemp(?,?,?,?,?)}";
		
		try {
			CallableStatement cs=con.prepareCall(sql);
			cs.setString(1, "С��");
			cs.setString(2, "��");
			cs.setInt(3, 20);
			cs.setString(4, "1991-1-1");
			cs.setFloat(5, 18888);
			int i=cs.executeUpdate();
			if(i>0){
				System.out.println("��ӳɹ���");
			}else{
				System.out.println("���ʧ�ܣ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
