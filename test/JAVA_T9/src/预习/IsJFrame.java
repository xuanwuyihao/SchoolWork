package 预习;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Image;





public class IsJFrame extends JFrame{
	public IsJFrame() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
		super("预习");
		
		//com.sun.java.swing.plaf.windows.WindowsLookAndFeel
		
			//个性化窗口
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		 

		Container c=getContentPane();
		
		//设置边框布局
		c.setLayout(new BorderLayout());
		
		//设置文本框
		JTextField f=new JTextField();
		c.add(f,BorderLayout.NORTH);
		//设置按钮
		Button b=new Button("确定");
		c.add(b,BorderLayout.SOUTH);
		Button b1=new Button("取消");
		b1.setBounds(300, 430, 40, 40);
		c.add(b,BorderLayout.SOUTH);
		
		//加入图片
		JLabel j=new JLabel(new ImageIcon("img/lameng.jpg"));
		//图片说明
		j.setToolTipText("这是哆啦A梦");
		c.add(j);
		
		
		
		//关闭窗口
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,400);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		new IsJFrame();
	}

}
