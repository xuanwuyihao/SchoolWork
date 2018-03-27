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
		super("画板");
		
		
		//6,给窗口添加监听
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
	
	//5,重写update方法
	public void update(Graphics g){
		super.paint(g);
		
		//画线
		g.drawLine(startx, starty, endx, endy);
		
	}

	//鼠标拖动事件
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if(darwing=true){
			this.endx=e.getX();
			this.endy=e.getY();
			
			//将结束点作为新的起点
			this.startx=e.getX();
			this.starty=e.getY();
			//表示正在作画
			this.repaint();//正在作画
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

	//2、鼠标按下事件
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		this.darwing=true;//表示在作画
		this.startx=e.getX();//获取鼠标的x轴坐标
		this.starty=e.getY();//获取鼠标的Y轴坐标
		
		
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
