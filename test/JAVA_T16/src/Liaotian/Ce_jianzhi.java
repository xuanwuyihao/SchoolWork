package Liaotian;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ce_jianzhi extends JFrame{
	public Ce_jianzhi() { 
		super("²â¼üÖµ");
		Container c=getContentPane();
		
		JTextField t = new JTextField(10);
		t.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());
			}
		});
		c.add(t);
		
		setSize(500,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)  {
		new Ce_jianzhi();
	}
}
