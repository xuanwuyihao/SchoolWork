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
		//第一种方法直接用数组来装
//		String[] str={"跑步","打篮球","打乒乓球","踢足球","打羽毛球","游泳"};
		//2.使用矢量来创建（尖括号表示泛型，表示这个矢量存放的是哪一类型的数据）
//		Vector str=new Vector();
//		str.add("跑步");
//		str.add("打篮球");
//		str.add("打乒乓球");
//		str.add("踢足球");
//		str.add("打羽毛球");
//		str.add("游泳");
		
		//3.通过DefaultlistModel类来创建
		DefaultListModel str=new DefaultListModel();
		str.addElement("跑步");
		str.addElement("打篮球");
		str.addElement("打乒乓球");
		str.addElement("踢足球");
		str.addElement("打羽毛球");
		str.addElement("游泳");
		
		
		JList j=new JList(str);
		
		//设置下标为一的选项选中
		j.setSelectedIndex(1);
		//设置边框标题
		j.setBorder(BorderFactory.createTitledBorder("你最喜欢哪个运动"));
		//设置单选
		j.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//获取被选中的下标
		int stre[]=j.getSelectedIndices();
		System.out.print(stre.length);
		c.add(j);
		
		//给列表添加滚动条
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
