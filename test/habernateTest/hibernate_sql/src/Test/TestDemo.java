package Test;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Demo.Student;

public class TestDemo {
	SessionFactory sft=null;
	Session session=null;
	public TestDemo(){
		sft=new Configuration().configure().buildSessionFactory();
	}
	public void add(){
		session=sft.openSession();
		Transaction tt=session.beginTransaction();
		try{
			Student st=new Student();
			st.setAge(19);
			st.setName("XIAOMING");
			st.setSex("NAN");
			
			session.save(st);
			tt.commit();
		}catch(Exception e){
			e.printStackTrace();
			tt.rollback();
		}finally{
			session.close();
			sft.close();
		}
	}
	
	public void select(){
		session=sft.openSession();
		Transaction tt=session.beginTransaction();
		try{
			Query query=session.createQuery("from Student stu where stu.name=?");
			query.setString(0, "小张");
			List<Student> list=query.list();
			for(Student s:list){
				System.out.println("姓名是："+s.getName()+"性别是："+s.getSex()+"年龄是:"+s.getAge());
			}
		}catch(Exception e){
			e.printStackTrace();
			tt.rollback();
		}finally{
			session.close();
			sft.close();
		}
	}
	
	public static void main(String[] args) {
		TestDemo td=new TestDemo();
		//td.add();
		td.select();
	}
}
