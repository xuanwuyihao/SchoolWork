package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;

import bean.Demo;

public class TestDemo {

	SessionFactory sft=null;
	Session session=null;
	public TestDemo(){
		sft=new Configuration().configure().buildSessionFactory();
	}
	
	//新增
	public void add(Demo demo){
		session=sft.openSession();
		Transaction tt=session.beginTransaction();
		try{
			tt.begin();
			session.save(demo);
			Demo dd  = session.get(Demo.class, "ww");
			tt.commit();
		}catch(Exception e){
			e.printStackTrace();
			tt.rollback();
		}finally{
			session.close();
		}
	}
	
	//修改
	public void update(int id,String name,String sex){
		try{
			session =sft.openSession();
			Transaction tt=session.beginTransaction();
			Demo demo=session.get(Demo.class, id);
			demo.setName(name);
			demo.setSex(sex);
			session.update(demo);
			tt.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	
	//删除
	public void delete(int id){
		try{
			session =sft.openSession();
			Transaction tt=session.beginTransaction();
			Demo demo=session.get(Demo.class, id);
			session.delete(demo);
			tt.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}
	
	//查
	public void select(){
		try{
			session=sft.openSession();
			Transaction tt=session.beginTransaction();
			Query query=session.createQuery("from Demo");
			List<Demo> list=query.list();
			for(Demo demo:list){
				System.out.println("用户名是："+demo.getName()+"岁数是："+demo.getAge()+"性别是"+demo.getSex());
			}
			tt.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	
	
	
	public static void main(String[] args) {
		TestDemo td=new TestDemo();
		
		//插入
		/*Demo demo=new Demo();
		demo.setAge(18);
		demo.setName("张三");
		demo.setSex("男");
		td.add(demo);*/
		
		//修改
		//td.update(1, "李四", "女");
		
		//查询
		td.select();
	}
}
