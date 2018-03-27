package ui;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Bq extends JFrame{
	Liaotian lt;
	public Bq(Liaotian lt){
		this.lt=lt;
		Container con=getContentPane();
		this.setUndecorated(true);
		con.setLayout(new GridLayout(5,18));

		for (int i = 0; i < 90; i++) {
			JLabel icon=new JLabel(new ImageIcon("emotions/"+(i+1)+".gif"));
			icon.addMouseListener(new MymouseLisener(i));
			con.add(icon);
		}
		
		
		
		
		
		setSize(450,200);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	class MymouseLisener extends MouseAdapter{
		int i;
		public MymouseLisener(int i){
			this.i=i;
			
		}
		public void mouseClicked(MouseEvent e) {
			//根据下标找到对应表情
			Icon icon=new ImageIcon("emotions/"+(i+1)+".gif");
			lt.send.insertIcon(icon);
			
			Bq.this.dispose();
		}
	}
}
