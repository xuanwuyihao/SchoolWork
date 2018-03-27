package test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import demo.Department;
import demo.Post;

public class TestDome {
	SessionFactory sft=null;
	Session session=null;
	
	public TestDome(){
		sft=new Configuration().configure().buildSessionFactory();
	}
	
	public void add(){
		session=sft.openSession();
		Transaction tt=session.beginTransaction();
		try{
			Department dt=new Department();
			dt.setName("财务部");
			
			Department dt2=new Department();
			dt2.setName("XZB");
			
			Post p=new Post();
			p.setName("CWGLY");
			
			Post p1=new Post();
			p1.setName("XZGLY");
			
			//添加方法
			dt.getPost().add(p);
			dt.getPost().add(p1);
			
			dt2.getPost().add(p);
			dt2.getPost().add(p1);
			
			//保存
			session.save(dt);
			session.save(dt2);
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
			List<Object[]> list=session.createQuery("from Department dep inner join dep.post").list();
			for(int i=0;i<list.size();i++){
				Object[] obj=list.get(i);
				Department dp=(Department)obj[0];
				Post p=(Post)obj[1];
				System.out.println("部门是："+dp.getName()+"身份是："+p.getName());
				
			}
		}catch(Exception e){
			e.printStackTrace();
			tt.rollback();
		}finally{
			session.close();
			sft.close();
		}
	}
	
	public void update(){
		session=sft.openSession();
		Transaction tt=session.beginTransaction();
		try{
			Department dt=session.get(Department.class, 10);
			Post p=session.get(Post.class, 10);
			p.setName("xxxx");
			
			session.update(p);
			tt.commit();
		}catch(Exception e){
			e.printStackTrace();
			tt.rollback();
		}finally{
			session.close();
			sft.close();
		}
	}
	
	//set  FOREIGN_KEY_CHECKS=0;--删除所有外键
	//set  FOREIGN_KEY_CHECKS=1;--回复设置外键
	
	public void delete(){
		session=sft.openSession();
		Transaction tt=session.beginTransaction();
		try{
			Department dt=session.get(Department.class, 1);
			session.delete(dt);
			
			tt.commit();
		}catch(Exception e){
			e.printStackTrace();
			tt.rollback();
		}finally{
			session.close();
			sft.close();
		}
	}
	public static void main(String[] args) {
		TestDome td=new TestDome();
		//td.add();
		//td.update();
		//td.delete();
		td.select();
	}
}
