package MapDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



//Collection:���ϵĹ����࣬�ṩ�����Լ��ϲ����ķ���
public class CollectionDemo {
	public static void main(String[] args) {
		//��ָ���б��ָ��λ���л�Ԫ��
		List<String> li=new ArrayList<String>();
		
		li.add("С��");
		li.add("С��");
		li.add("С��");
		li.add("С��");
		
		Collections.swap(li, 1, 2);
		System.out.println(li);
		
	}

}
