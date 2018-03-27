package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map集合存储自定义对象
public class MapDeomo2 {
	public static void main(String[] args) {
		Map<String, Student> ma=new HashMap<String, Student>();
		Student s=new Student("小明",18);
		Student s1=new Student("张",20);
		Student s2=new Student("小肖",22);
		
		ma.put("zg",s);
		ma.put("zg1",s1);
		ma.put("zg2",s2);
		
		Set<String> set=ma.keySet();
		for (String st:set) {
			Student value=ma.get(st);
			System.out.println(st+"---"+value.getName()+"---"+value.getEag());
		}
	}

}
