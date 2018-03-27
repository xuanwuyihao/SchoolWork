package Pratice1;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class JAdapter extends Frame{
	public JAdapter(){
		super("  ≈‰∆˜");
		
		addWindowListener(new MyWindowListener());
		
		setSize(400,300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JAdapter();
		
	}
	
	class MyWindowListener extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	}

}
