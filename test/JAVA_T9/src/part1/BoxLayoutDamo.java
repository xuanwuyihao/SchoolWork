package part1;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class BoxLayoutDamo extends JFrame{
	public BoxLayoutDamo(){
		super("盒子布局");
		//个性化窗口
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JPanel p=new JPanel();
		//p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		JButton b=new JButton("按钮0");
		JButton b1=new JButton("按钮1");
		JButton b2=new JButton("按钮2");
		JButton b3=new JButton("按钮3");
		JButton b4=new JButton("按钮4");
		JButton b5=new JButton("按钮5");
		JButton b6=new JButton("按钮6");
		JButton b7=new JButton("按钮7");
		JButton b8=new JButton("按钮8");
		
		p.add(b);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		
		c.add(p);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		new BoxLayoutDamo();
	}

}
