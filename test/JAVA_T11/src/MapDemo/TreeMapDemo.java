package MapDemo;

import java.util.TreeMap;

//Treemap特点：
//			根据键的值自然排序
public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, String> tr=new TreeMap<String, String>();
		
		tr.put("zg", "小海");
		tr.put("zg1", "小李");
		tr.put("zg2", "小焉");
		tr.put("zg3", "小雷");
		tr.put("zg4", "小杨");
		tr.put("zg5", "小于");
		
		System.out.println(tr);
		
	}

}
