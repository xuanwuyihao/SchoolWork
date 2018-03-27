package MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import sun.awt.SunHints.Value;


/**
 * map的使用：
 * 			amp与collection的区别：
 * 			map储存的是键值对形的元素，键唯一，值可重复。
 * 			collection储存的是单个元素
 * 			功能：
 * 					添加：
 * 							V put(k key,v value) 添加指定键和值
 * 							void putAll(Map<? extends k,? extends v>m) 添加一个map集合的键值对
 * 					移除：
 * 						void clear()  移除集合中的所有键值对
 * 						v remove(object key)  根据指定键移除元素
 * 					判断：
 * 					boolean containskey(object key) 判断集合中的键是否包含指定值
 * 					boolean containsvalue(object value) 判断集合中的值是否包含指定值
 * 					boolean isEmpty() 判断集合是否为空
 * 					获取：
 * 					v get (object key) 根据键获取值
 * 					set<k> keyset() 获取所有键
 * 					colltains<v> values()获取所有值
 * 					int size()  获取集合大小
 * 
 * @author Administrator
 *
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> ma=new HashMap<String, String>();
		
		ma.put("ht", "小明");
		ma.put("ht1", "小黄");
		ma.put("ht2", "小邱");
		ma.put("ht3", "小何");
		
		
		//移除集合中的所有键值对
		//ma.clear();
		//根据指定键移除元素
		System.out.println(ma.remove("ht3"));
//		//判断集合中的键是否包含值
		System.out.println(ma.containsKey("ht"));
//		//判断集合中的值是否包含值
		System.out.println(ma.containsValue("小何"));
//		//根据键获取值
		System.out.println(ma.get("ht1"));
		//获取所有的键
		Set<String> set=ma.keySet();
		for (String s:set) {
			System.out.println(s);
		}
		
		
		//获取所有值
		Collection<String> co=ma.values();
		for (String s:co) {
			System.out.println(s);
		}
		
		System.out.println(ma);
		
		//map集合的遍历
		//获取所有键的集合
		Set<String> st=ma.keySet();
		//遍历键的集合，得到每一个键
		for (String s:st) {
			//根据键到集合中找值
			String value=ma.get(s);
			System.out.println(s+"---"+value);
			
		}
		
		
		
	}

}
