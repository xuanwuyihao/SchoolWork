package MapDemo;

import java.util.LinkedHashMap;

//LinkedHashMap���c��
//				���򣬼������ظ�
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String, String> lin=new LinkedHashMap<String, String>();
		
		lin.put("zg", "С��");
		lin.put("zg1", "С��");
		lin.put("zg2", "С��");
		lin.put("zg3", "С��");
		
		System.out.println(lin);
	}

}
