package exampel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ���Ϻ����������
 * 			1������ĳ����ǹ̶��ģ����ϵĳ����ǿɱ�ġ�
 * 			2������ֻ�ܴ���һ�����ݡ������Ͽ��Դ洢�������ݡ�
 * 			3��������Դ洢�������͡�Ҳ���Դ洢�����������͡�����ֻ���Դ洢������������
 * 		
 * ���ϵĹ��ܣ�
 * 			1�����
 * 			boolean add(object obj)  ���һ��Ԫ��
 * 			boolean addAll(Collection c)  ���һ�����ϵ�Ԫ��
 * 			2���Ƴ�
 * 			void clear()  �Ƴ�����Ԫ��
 * 			boolean remove(object obj)  �Ƴ�һ��Ԫ��
 * 			3����ȡ
 * 			Iterator Iterator()
 * 			4���ж�
 * 			boolean isEmpty()  �жϼ����Ƿ�Ϊ��
 * 			boolean containsAll(collection c)  �ж��Ƿ����һ�����ϵ�Ԫ��
 * 			5����ȡ��С
 * 			int size()  ��ȡ���ϵĴ�С
 * 			6��ת��Ϊ����
 * 			object toArray()
 * 
 * 
 * @author Administrator
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		
		//���Ԫ��
		c.add("hello");
		c.add("world");
		c.add("�ݺ�");
		
		
		//�Ƴ�����Ԫ��
//		c.clear();
		
		//�Ƴ�ָ��Ԫ��
//		System.out.println(c.remove("world"));
		
		//�жϼ����Ƿ�Ϊ��
		System.out.println(c.isEmpty());
		
		//��ȡ���ϵĴ�С
		System.out.println(c.size());
		
		//ת��Ϊ����
		Object[] obj=c.toArray();
		
//		for (int i = 0; i < obj.length; i++) {
//			String s=(String)obj[i];
//			
//		}
		
		Collection c1=new ArrayList();
		c1.add("hello");
		c1.add("good");
		
		
		//���һ�����ϵ�Ԫ��
		c1.addAll(c);
		
		//�ж��Ƿ����һ�����ϵ�Ԫ��
		System.out.println("�Ƿ����"+c1.contains(c));
		
		
		System.out.println(c1);
		System.out.println(c);
	}
	

}
