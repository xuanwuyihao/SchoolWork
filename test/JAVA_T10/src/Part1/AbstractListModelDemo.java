package Part1;

import java.awt.Container;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;


public class AbstractListModelDemo extends JFrame{
	Vector<String> v=new Vector<String>();
	public AbstractListModelDemo(){
		super("ʹ��AbstractListModelDemo����JList");
		Container c=getContentPane();
		
		v.add("��Ӿ");
		v.add("������");
		v.add("��ƹ����");
		v.add("����ë��");
		v.add("�ܲ�");
		v.add("�ô���");
		
		JList j=new JList();
		
		setSize(300,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new AbstractListModelDemo();
	}
	//�����ڲ���̳�AbstractLisModel
	class MyAbstractLisModel extends AbstractListModelDemo{
		
		//�����±��ȡʸ���е�����
		private Object getelementAt(int ind) {
			//�����±��ȡ����
			String str=v.get(ind);
			System.out.print("�±�"+ind);
			return ind+""+str;//ȷ�����ݵ��Ű�
			
			//��ȡʸ���Ĵ�С
			
			
		}
	}

}
