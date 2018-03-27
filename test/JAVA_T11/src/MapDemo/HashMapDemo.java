package MapDemo;

import java.util.HashMap;

//HashMap特点：
//			无序，键不能重复。
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, String> ha=new HashMap<String, String>();
		
		ha.put("zg", "小郑");
		ha.put("zg1", "小许");
		ha.put("zg2", "小涂");
		ha.put("zg3", "小王");
		System.out.println(ha);
		
	}

}
