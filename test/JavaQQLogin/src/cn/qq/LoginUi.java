package cn.qq;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class LoginUi extends JFrame implements MouseListener{

	private static final long serialVersionUID = 341883945961527974L;

	private JLabel account,pwd,have,find;
	private JTextField accTxt;
	private JPasswordField pwdTxt;
	private JButton enter,canel;
	private JLabel bg,picture;
	public LoginUi(){
		super("QQ");
		bg=new JLabel(new ImageIcon("src/Picture/bg.gif"));
		add(bg);
		
		account=new JLabel("’À∫≈:");
		accTxt=new JTextField();
		pwd=new JLabel("√‹¬Î:");
		pwdTxt=new JPasswordField();
		have=new JLabel("◊¢≤·");
		find=new JLabel("’“ªÿ√‹¬Î");
		enter=new JButton("◊¢≤·");
		canel=new JButton("πÿ±’");
		picture=new JLabel(new ImageIcon("src/Picture/tubiao.png"));
		
		account.setLocation(90, 190);
		accTxt.setLocation(130,190);
		pwd.setLocation(90,230);
		pwdTxt.setLocation(130,230);
		have.setLocation(290,190);
		find.setLocation(290,230);
		enter.setLocation(100,270);
		canel.setLocation(220,270);
		picture.setLocation(20,200);
		
		account.setSize(60, 30);
		accTxt.setSize(150,30);
		pwd.setSize(60,30);
		pwdTxt.setSize(150,30);
		have.setSize(60,30);
		find.setSize(100,30);
		enter.setSize(80,30);
		canel.setSize(80,30);
		picture.setSize(60,60);
		
		
		bg.add(account);
		bg.add(accTxt);
		bg.add(pwd);
		bg.add(pwdTxt);
		bg.add(have);
		bg.add(find);
		bg.add(enter);
		bg.add(canel);
		bg.add(picture);
		
		have.addMouseListener(this);
		bg.addMouseListener(this);
		canel.addMouseListener(this);
		enter.addMouseListener(this);
		
		setSize(440,360);	
		//setUndecorated(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				new LoginUi();
			}
			
		});
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==canel){
			System.exit(0);
		}else if(e.getSource()==have){
			this.dispose();
			new Information();
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
