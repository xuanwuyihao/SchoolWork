package part2;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ImageChange extends JFrame{
	JLabel jl;
	public  ImageChange(){
		super("图片切换");
		Container c=getContentPane();
		
		//左边面板
		JPanel p=new JPanel();
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		JRadioButton b1=new JRadioButton("tu1");
		//默认让第一张图片设为默认
		b1.setSelected(true);
		JRadioButton b2=new JRadioButton("tu2");
		JRadioButton b3=new JRadioButton("tu3");
		JRadioButton b4=new JRadioButton("tu4");
		JRadioButton b5=new JRadioButton("tu5");
		JRadioButton b6=new JRadioButton("tu6");
		JRadioButton b7=new JRadioButton("tu7");
		JRadioButton b8=new JRadioButton("tu8");
		
		
		//让图片进行分组
		ButtonGroup b=new ButtonGroup();
		b.add(b1);
		b.add(b2);
		b.add(b3);
		b.add(b4);
		b.add(b5);
		b.add(b6);
		b.add(b7);
		b.add(b8);
		
		//给图片授权
		b1.addActionListener(new orJRadioButton());
		b2.addActionListener(new orJRadioButton());
		b3.addActionListener(new orJRadioButton());
		b4.addActionListener(new orJRadioButton());
		b5.addActionListener(new orJRadioButton());
		b6.addActionListener(new orJRadioButton());
		b7.addActionListener(new orJRadioButton());
		b8.addActionListener(new orJRadioButton());
		
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		
		c.add(p,BorderLayout.WEST);
		
		
		
		//显示框中的图片
		jl=new JLabel(new ImageIcon("img/tu1.jpg"));
		c.add(jl);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		new ImageChange();
	}
	class orJRadioButton implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
			//获取按键内容
			String st=e.getActionCommand();
			
			ImageIcon ic=new ImageIcon("image/"+st+".jpg");
			jl.setIcon(ic);//改变标签图片
			
		}
		
	}

}
