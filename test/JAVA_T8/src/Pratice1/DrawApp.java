package Pratice1;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class DrawApp extends Frame implements MouseListener,MouseMotionListener
,WindowListener{
	int startx,starty;
	int endx,endy;
	boolean darwing=false;
	
	
	public DrawApp(){
		super("����");
		
		
		//6,��������Ӽ���
		addMouseListener(this);
		addMouseMotionListener(this);
		
		addWindowListener(this);
		setSize(600,400);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new DrawApp();
	}
	
	//5,��дupdate����
	public void update(Graphics g){
		super.paint(g);
		
		//����
		g.drawLine(startx, starty, endx, endy);
		
	}

	//����϶��¼�
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if(darwing=true){
			this.endx=e.getX();
			this.endy=e.getY();
			
			//����������Ϊ�µ����
			this.startx=e.getX();
			this.starty=e.getY();
			//��ʾ��������
			this.repaint();//��������
		}
		
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//2����갴���¼�
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		this.darwing=true;//��ʾ������
		this.startx=e.getX();//��ȡ����x������
		this.starty=e.getY();//��ȡ����Y������
		
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		this.dispose();
		
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


}
