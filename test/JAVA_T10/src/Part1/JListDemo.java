package Part1;

import java.awt.Container;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;



public class JListDemo extends JFrame{
	public JListDemo(){
		super("JList");
		Container c=getContentPane();
		//��һ�ַ���ֱ����������װ
//		String[] str={"�ܲ�","������","��ƹ����","������","����ë��","��Ӿ"};
		//2.ʹ��ʸ���������������ű�ʾ���ͣ���ʾ���ʸ����ŵ�����һ���͵����ݣ�
//		Vector str=new Vector();
//		str.add("�ܲ�");
//		str.add("������");
//		str.add("��ƹ����");
//		str.add("������");
//		str.add("����ë��");
//		str.add("��Ӿ");
		
		//3.ͨ��DefaultlistModel��������
		DefaultListModel str=new DefaultListModel();
		str.addElement("�ܲ�");
		str.addElement("������");
		str.addElement("��ƹ����");
		str.addElement("������");
		str.addElement("����ë��");
		str.addElement("��Ӿ");
		
		
		JList j=new JList(str);
		
		//�����±�Ϊһ��ѡ��ѡ��
		j.setSelectedIndex(1);
		//���ñ߿����
		j.setBorder(BorderFactory.createTitledBorder("����ϲ���ĸ��˶�"));
		//���õ�ѡ
		j.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//��ȡ��ѡ�е��±�
		int stre[]=j.getSelectedIndices();
		System.out.print(stre.length);
		c.add(j);
		
		//���б���ӹ�����
		this.getContentPane().add(new JScrollPane(j));
		
		setSize(300,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JListDemo();
	}

}
