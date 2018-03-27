package Test;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Department;
import model.Employee;

public class Demo {
	SessionFactory sft=null;
	Session session=null;
	public Demo(){
		sft=new Configuration().configure().buildSessionFactory();
	}
	
	public void add(){
		session =sft.openSession();
		Transaction tt=session.beginTransaction();
		Department dt=new Department();
		dt.setName("江苏省");
		
		Employee emp=new Employee();
		emp.setName("将数据");
		emp.setAge(20);
		
		Employee emp2=new Employee();
		emp2.setName("将数据");
		emp2.setAge(19);
		
		dt.getEmployee().add(emp);
		dt.getEmployee().add(emp2);
		
		session.save(dt);
		tt.commit();
		sft.close();
	}
	
	public void update(){
		session=sft.openSession();
		Transaction tt=session.beginTransaction();
		
		try{
			Department department=session.get(Department.class, 1);
			Employee employee=session.get(Employee.class, 1);
			
			employee.setAge(19);
			employee.setName("����");
			//��Ա����ӵ�set����
			department.getEmployee().add(employee);
			//�Ѳ������õ�������
			employee.setDepartment(department);
			session.update(department);
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
		session =sft.openSession();
		Transaction tt=session.beginTransaction();
		try{
			Department dt=session.get(Department.class, 1);
			for(Employee ep:dt.getEmployee()){
				System.out.println(ep.getName()+ep.getAge());
				
			}
			tt.commit();
		}catch(Exception e){
			e.printStackTrace();
			tt.rollback();
		}finally{
			session.close();
			sft.close();
		}
	}
	
	
	public void mantToOneadd(){
		session =sft.openSession();
		Transaction tt=session.beginTransaction();
		try{
			Employee ep=new Employee();
			ep.setAge(20);
			ep.setName("ggg");
			
			Employee ep2=new Employee();
			ep2.setAge(19);
			ep2.setName("qqq");
			
			Department dt=new Department();
			dt.setName("sah");
			
			
			dt.getEmployee().add(ep);
			dt.getEmployee().add(ep2);
			session.save(dt);
			tt.commit();
		}catch(Exception e){
			e.printStackTrace();
			tt.rollback();
		}finally{
			session.close();
			sft.close();
		}
	}
	
	//���һ�Ĳ�ѯ
	public void manytoselect(){
		session=sft.openSession();
		Transaction tt=session.beginTransaction();
		try{
			List<Employee> list=session.createQuery("from Employee emp join fetch emp.department").list();
			for(Employee ep:list){
				System.out.println("部门"+ep.getDepartment().getName()+"姓名"+ep.getName());
			}
			
		}catch(Exception e){
			e.printStackTrace();
			tt.rollback();
		}finally{
			session.close();
			sft.close();
		}
	}
	public void delete(){
		session=sft.openSession();
		Transaction tt=session.beginTransaction();
		
		try{
			Department dt=session.get(Department.class, 1);
			session.delete(dt);
		}catch(Exception e){
			e.printStackTrace();
			tt.rollback();
		}finally{
			session.close();
			sft.close();
		}
	}
	
	/*
	 * 集合过滤
	 */
	public void selectFr(){
		session=sft.openSession();
		Transaction tt=session.beginTransaction();
		try{
		Query query=session.createQuery("from Employee emp where emp.department=:department");
		Department dt=new Department();
		dt.setId(1);
		query.setEntity("department", dt);
		List list=query.list();
		for(int i=0;i<list.size();i++){
			Employee ep=(Employee)list.get(i);
			System.out.println("姓名是"+ep.getName());
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
		Demo d=new Demo();
		d.add();
		//d.update();
		//d.select();
		//d.delete();
	}
	
}
