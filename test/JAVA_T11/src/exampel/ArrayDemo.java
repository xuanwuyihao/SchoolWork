package exampel;


//使用数组存储五名学生
public class ArrayDemo {
	public static void main(String[] args) {
		Student[] s=  new Student[5];
		
		Student s1=new Student("伟东",21);
		Student s2=new Student("小肖",20);
		Student s3=new Student("小黄",22);
		Student s4=new Student("小刘",23);
		Student s5=new Student("小何",21);
		
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		s[3]=s4;
		s[4]=s5;
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].getName()+"----"+s[i].getEag());
			
		}
		
	}
}
