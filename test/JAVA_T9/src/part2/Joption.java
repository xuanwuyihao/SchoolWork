package part2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Joption extends JFrame{
	JButton b,b1,b2;
	public Joption(){
		super("弹框");
		
		//设置容器
		Container c=getContentPane();
		//设置为流布局
		c.setLayout(new FlowLayout());
		b=new JButton("消息框");
		c.add(b);
		b1=new JButton("选择框");
		c.add(b1);
		b2=new JButton("对话框");
		c.add(b2);
		
		b. addActionListener(new MyButtonListener());
		b1.addActionListener(new MyButtonListener());
		b2.addActionListener(new MyButtonListener());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args){
		new Joption();
	}
	class MyButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==b) {
				JOptionPane.showConfirmDialog(null, "你选择了消息框！");
			}else if (e.getSource()==b1) {
				int x=JOptionPane.showConfirmDialog(null, "是否要退出程序？");
				if (x==JOptionPane.NO_OPTION) {
					JOptionPane.showConfirmDialog(null, "你点击了否！");
				}else if (x==JOptionPane.OK_OPTION) {
					JOptionPane.showConfirmDialog(null, "你点击了是");
				}else if (x==JOptionPane.CANCEL_OPTION) {
					JOptionPane.showConfirmDialog(null, "你点击了取消");
					
				}
			}else if (e.getSource()==b2) {
				String str=  JOptionPane.showInputDialog(null, "请输入内容");
				System.out.print(str);
				
			}
			
		}
		
	}
	
	
}
