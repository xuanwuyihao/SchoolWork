package ui;

import impl.QQUserServiceimp;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import common.Contents;

import bean.QQUser;

import service.IQQUserService;



public class DRHOU extends JFrame{
	
	//private static final SHITI_DX SH = null;

	JLabel xx,xiao,tp;
	
	//��ȡ�ײ㷽��
	IQQUserService is=new QQUserServiceimp();
	
	QQUser user;
	
	JLabel qx;
	
	Thread th;
//	
	public DRHOU(QQUser user){
		super("QQ");
		
		System.out.println("������");
		//ȥ�����ڱ߿�
		this.user=user;
		this.setUndecorated(true);
		//���ô�����ק����
		this.setDragable();
		
		this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
		Container c=getContentPane();
		c.setLayout(null);
		//���
		//Container ff=getContentPane();
		
		//���
		//ͷ��
//			System.out.println(user.getFace());
			tp=new JLabel(new ImageIcon(user.getFace()));
			tp.setBounds(170, 190, 70, 70);
			c.add(tp);
		
		
		
//		new HOUMI().start();
		
		//�˻�

		//�رհ�ť
		xx=new JLabel("");
		xx.addMouseListener(new MYMOU());
		xx.setBounds(400,0, 60, 20);
		xx.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(xx);
		
		//��С����ť
		xiao=new JLabel("");
		xiao.addMouseListener(new MYMOU());
		xiao.setBounds(370,0, 60, 20);
		xiao.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(xiao);
		
		//ȡ����¼
		qx=new JLabel(new ImageIcon("image/qx.png"));
		qx.setBounds(110, 280, 193, 30);
		qx.addMouseListener(new MyMousetListener());
		c.add(qx);//ֱ�Ӽ��ڴ���
		
		
		
		JLabel jl=new JLabel(new ImageIcon("image/north.gif"));
		jl.setBounds(0, 0, 430, 330);
		add(jl);
		
		
//		//���ñ���ͼƬ
//		JLabel bj=new JLabel(new ImageIcon("image/north.gif"));
//		add(bj);//ֱ�Ӽ��ڴ���
		
		
		
		//this.HOUMI();
		setSize(430,330);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		th = new HOUMI();
		th.start();
	
	}
	
	class MyMousetListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			if (e.getSource()==qx) {
				th.stop();
				new QQLogin1();
				DRHOU.this.dispose();
			}
		}

	
		
	}
	
	
	class HOUMI extends Thread{
		
	@Override
	public void run() {
	/*	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DRHOU.this.dispose();
			new QQMaim(user);

	}	

	}
	


	class MYMOU extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getSource()==xx){//�رմ���
				System.exit(0);
			}else if(e.getSource()==xiao){
				//�ô�����С��
				DRHOU.this.setExtendedState(DRHOU.this.ICONIFIED);
			}
		}
	}
	
	
	/** ******** */
	// ���ý�������϶��ķ���
	Point loc = null;
	Point tmp = null;
	boolean isDragged = false;

	private void setDragable() {
		this.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent e) {
				isDragged = false;
				DRHOU.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(java.awt.event.MouseEvent e) {
				tmp = new Point(e.getX(), e.getY());

				isDragged = true;
				DRHOU.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				if (isDragged) {
					loc = new Point(DRHOU.this.getLocation().x + e.getX()
							- tmp.x, DRHOU.this.getLocation().y + e.getY()
							- tmp.y);
					DRHOU.this.setLocation(loc);
				}
			}
		});
	}
	
	
	/*public static void main(String[] args) {
		new DRHOU();
	}*/
}
