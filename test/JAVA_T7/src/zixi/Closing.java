package zixi;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Closing extends Frame {

	public Closing(){
		
		
		setSize(400,300);
		setLocationRelativeTo(null);//居中
//		addWindowListener(new WindowAdapter(){
//			@Override
//			public void windowClosing(WindowEvent e){
//				Closing.this.dispose();
//			}
//		});	匿名内部类关窗口
		Leiming l=new Leiming();
		addWindowListener(l);
		//addWindowListener(new Leiming(this));
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Closing();
	}
	
}
