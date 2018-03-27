package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Demo;

public class TestDemo {

	SessionFactory sft=null;
	Session session=null;
	public TestDemo(){
		sft=new Configuration().configure().buildSessionFactory();
	}
	public void add(Demo demo){
		session=sft.openSession();
		Transaction tt=session.beginTransaction();
		try{
			tt.begin();
			session.save(demo);
			tt.commit();
		}catch(Exception e){
			e.printStackTrace();
			tt.rollback();
		}finally{
			session.close();
		}
	}
	
	
	public static void main(String[] args) {
		TestDemo td=new TestDemo();
		
		Demo demo=new Demo();
		demo.setAge(18);
		demo.setName("ÕÅÈý");
		demo.setSex("ÄÐ");
		td.add(demo);
	}
}
