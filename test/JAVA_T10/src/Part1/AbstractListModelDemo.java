package Part1;

import java.awt.Container;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;


public class AbstractListModelDemo extends JFrame{
	Vector<String> v=new Vector<String>();
	public AbstractListModelDemo(){
		super("使用AbstractListModelDemo创建JList");
		Container c=getContentPane();
		
		v.add("游泳");
		v.add("打篮球");
		v.add("打乒乓球");
		v.add("打羽毛球");
		v.add("跑步");
		v.add("敲代码");
		
		JList j=new JList();
		
		setSize(300,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new AbstractListModelDemo();
	}
	//创建内部类继承AbstractLisModel
	class MyAbstractLisModel extends AbstractListModelDemo{
		
		//根据下标获取矢量中的数据
		private Object getelementAt(int ind) {
			//根据下标获取内容
			String str=v.get(ind);
			System.out.print("下标"+ind);
			return ind+""+str;//确定内容的排版
			
			//获取矢量的大小
			
			
		}
	}

}
