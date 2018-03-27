package exampel;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		
		Student s1=new Student("小马",21);
		Student s2=new Student("小曹",20);
		Student s3=new Student("小廖",22);
		Student s4=new Student("小刘",23);
		Student s5=new Student("小何",21);
		
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		Object[] ob=c.toArray();
		for (int i = 0; i < ob.length; i++) {
			Student s=(Student)ob[i];
			System.out.println(s.getName()+"---"+s.getEag());
			
		}
	}

}
