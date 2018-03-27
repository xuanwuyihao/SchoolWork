package method;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatistaUtil {

	private final static SqlSessionFactory sqlsessionfactory;
	static{
	String resuorce="mybatis-config.xml";
	Reader reader=null;
	try {
		reader=Resources.getResourceAsReader(resuorce);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	sqlsessionfactory=new SqlSessionFactoryBuilder().build(reader);
	}
	
	public static SqlSessionFactory getsqlsessionfactory(){
		return sqlsessionfactory;
	}
}
