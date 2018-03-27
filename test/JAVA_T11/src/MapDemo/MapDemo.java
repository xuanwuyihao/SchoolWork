package MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import sun.awt.SunHints.Value;


/**
 * map��ʹ�ã�
 * 			amp��collection������
 * 			map������Ǽ�ֵ���ε�Ԫ�أ���Ψһ��ֵ���ظ���
 * 			collection������ǵ���Ԫ��
 * 			���ܣ�
 * 					��ӣ�
 * 							V put(k key,v value) ���ָ������ֵ
 * 							void putAll(Map<? extends k,? extends v>m) ���һ��map���ϵļ�ֵ��
 * 					�Ƴ���
 * 						void clear()  �Ƴ������е����м�ֵ��
 * 						v remove(object key)  ����ָ�����Ƴ�Ԫ��
 * 					�жϣ�
 * 					boolean containskey(object key) �жϼ����еļ��Ƿ����ָ��ֵ
 * 					boolean containsvalue(object value) �жϼ����е�ֵ�Ƿ����ָ��ֵ
 * 					boolean isEmpty() �жϼ����Ƿ�Ϊ��
 * 					��ȡ��
 * 					v get (object key) ���ݼ���ȡֵ
 * 					set<k> keyset() ��ȡ���м�
 * 					colltains<v> values()��ȡ����ֵ
 * 					int size()  ��ȡ���ϴ�С
 * 
 * @author Administrator
 *
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> ma=new HashMap<String, String>();
		
		ma.put("ht", "С��");
		ma.put("ht1", "С��");
		ma.put("ht2", "С��");
		ma.put("ht3", "С��");
		
		
		//�Ƴ������е����м�ֵ��
		//ma.clear();
		//����ָ�����Ƴ�Ԫ��
		System.out.println(ma.remove("ht3"));
//		//�жϼ����еļ��Ƿ����ֵ
		System.out.println(ma.containsKey("ht"));
//		//�жϼ����е�ֵ�Ƿ����ֵ
		System.out.println(ma.containsValue("С��"));
//		//���ݼ���ȡֵ
		System.out.println(ma.get("ht1"));
		//��ȡ���еļ�
		Set<String> set=ma.keySet();
		for (String s:set) {
			System.out.println(s);
		}
		
		
		//��ȡ����ֵ
		Collection<String> co=ma.values();
		for (String s:co) {
			System.out.println(s);
		}
		
		System.out.println(ma);
		
		//map���ϵı���
		//��ȡ���м��ļ���
		Set<String> st=ma.keySet();
		//�������ļ��ϣ��õ�ÿһ����
		for (String s:st) {
			//���ݼ�����������ֵ
			String value=ma.get(s);
			System.out.println(s+"---"+value);
			
		}
		
		
		
	}

}
