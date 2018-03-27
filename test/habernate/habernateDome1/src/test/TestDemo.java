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
	
	//����
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
	
	//�޸�
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
	
	//ɾ��
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
	
	//��
	public void select(){
		try{
			session=sft.openSession();
			Transaction tt=session.beginTransaction();
			Query query=session.createQuery("from Demo");
			List<Demo> list=query.list();
			for(Demo demo:list){
				System.out.println("�û����ǣ�"+demo.getName()+"�����ǣ�"+demo.getAge()+"�Ա���"+demo.getSex());
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
		
		//����
		/*Demo demo=new Demo();
		demo.setAge(18);
		demo.setName("����");
		demo.setSex("��");
		td.add(demo);*/
		
		//�޸�
		//td.update(1, "����", "Ů");
		
		//��ѯ
		td.select();
	}
}
