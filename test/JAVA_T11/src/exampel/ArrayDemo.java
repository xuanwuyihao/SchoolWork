package exampel;


//ʹ������洢����ѧ��
public class ArrayDemo {
	public static void main(String[] args) {
		Student[] s=  new Student[5];
		
		Student s1=new Student("ΰ��",21);
		Student s2=new Student("СФ",20);
		Student s3=new Student("С��",22);
		Student s4=new Student("С��",23);
		Student s5=new Student("С��",21);
		
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
