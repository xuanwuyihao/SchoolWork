package MapDemo;

import java.util.LinkedHashMap;

//LinkedHashMap特點：
//				有序，键不能重复
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String, String> lin=new LinkedHashMap<String, String>();
		
		lin.put("zg", "小曹");
		lin.put("zg1", "小熊");
		lin.put("zg2", "小朱");
		lin.put("zg3", "小宋");
		
		System.out.println(lin);
	}

}
