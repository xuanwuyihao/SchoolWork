package Ԥϰ;

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
		super("Ԥϰ");
		
		//com.sun.java.swing.plaf.windows.WindowsLookAndFeel
		
			//���Ի�����
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		 

		Container c=getContentPane();
		
		//���ñ߿򲼾�
		c.setLayout(new BorderLayout());
		
		//�����ı���
		JTextField f=new JTextField();
		c.add(f,BorderLayout.NORTH);
		//���ð�ť
		Button b=new Button("ȷ��");
		c.add(b,BorderLayout.SOUTH);
		Button b1=new Button("ȡ��");
		b1.setBounds(300, 430, 40, 40);
		c.add(b,BorderLayout.SOUTH);
		
		//����ͼƬ
		JLabel j=new JLabel(new ImageIcon("img/lameng.jpg"));
		//ͼƬ˵��
		j.setToolTipText("���Ƕ���A��");
		c.add(j);
		
		
		
		//�رմ���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,400);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		new IsJFrame();
	}

}
