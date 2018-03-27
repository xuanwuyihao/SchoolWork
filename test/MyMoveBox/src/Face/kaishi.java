package Face;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Face.Centerpanel.KeyListener;

public class kaishi extends JFrame{
	JPanel p1,p2,p3,p4,p5;
	public kaishi(){
		Container c=getContentPane();
		c.setLayout(null);
//		c.setBackground(new Color(45,81,111));
		
		
		
		ImageIcon img=new ImageIcon("Image/推箱子5.jpg");
		JLabel l=new JLabel(img);
		l.setBounds(0, 0, 600, 700);
//		c.setBackground(Color.BLUE);
		c.add(l);
		
		
		p1=new JPanel();
		p1.setSize(242,57);
		p1.setBackground(new Color(193,135,38));
		ImageIcon img1=new ImageIcon("Image/推箱子tu1.jpg");
		JLabel l1=new JLabel(img1);
//		l1.setBounds(181, 172, 242, 67);
		p1.setBounds(181, 172, 242, 57);
		p1.addMouseListener(new MouseListener());
		p1.add(l1);
		c.add(p1);

		
		p2=new JPanel();
		p2.setSize(242,57);
//		p2.setBackground(new Color(193,135,38));
		p2.setBackground(Color.RED);
//		ImageIcon img2=new ImageIcon("Image/推箱子tu6.jpg");
//		JLabel l2=new JLabel(img2);
//		l1.setBounds(181, 172, 242, 67);
		p2.setBounds(181, 222, 242, 57);
//		p2.addMouseListener(new MouseListener());
//		p2.add(l2);
		c.add(p2);
		
		
		setSize(600,730);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new kaishi();
	}
	
	class MouseListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource()==p1) {
				//点击退出关闭当前页面
				kaishi.this.dispose();
				new MyPanel();
			}
		}
	}

}
