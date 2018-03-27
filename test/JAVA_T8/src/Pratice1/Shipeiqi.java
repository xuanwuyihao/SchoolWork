package Pratice1;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class Shipeiqi extends java.awt.Frame{
	public Shipeiqi(){
		super("  ≈‰∆˜¿‡");
		
		
		addWindowListener(new ClossWindow());
		
		setSize(400,300);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Shipeiqi();
	}
	class ClossWindow extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
		
	}
}
