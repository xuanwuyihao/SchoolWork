package ui;


import java.awt.BorderLayout;  

import javax.swing.JFrame;  
import javax.swing.JPanel;  
import javax.swing.SwingUtilities;  
  
  
/** 
 * @author Christopher Deckers 
 */  
public class ceshi extends JPanel {  
  
  public ceshi() {  
    



  }
  
  
////�������
//	public void mouseEntered(MouseEvent e) {
//		Point p = QQMain.this.getLocationOnScreen();
//		if(p.y<=10){
//			p.y = 0;
//			QQMain.this.setLocation(p);
//		}
//	}
//	
//	//����Ƴ�
//	public void mouseExited(MouseEvent e) {
//		Point p = QQMain.this.getLocationOnScreen();
//		if(p.y==0){
//			p.y = -720;
//			QQMain.this.setLocation(p);
//		}
//	}
//
//}
//  /** ******** */
//	// ���ý�������϶��ķ���
//	Point loc = null;
//	Point tmp = null;
//	boolean isDragged = false;
//
//	private void setDragable() {
//		this.addMouseListener(new java.awt.event.MouseAdapter() {
//			public void mouseReleased(java.awt.event.MouseEvent e) {
//				isDragged = false;
//				QQMain.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
//				
//				
//				Point p = QQMain.this.getLocationOnScreen();
//				if (p.y < 10) {
//					p.y = -720;
//					QQMain.this.setLocation(p);
//				}
//				
//				
//			}
//
//			public void mousePressed(java.awt.event.MouseEvent e) {
//				tmp = new Point(e.getX(), e.getY());
//
//				isDragged = true;
//				QQMain.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
//			}
//		
//		});
//		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
//			public void mouseDragged(java.awt.event.MouseEvent e) {
//				if (isDragged) {
//					loc = new Point(QQMain.this.getLocation().x + e.getX()
//							- tmp.x, QQMain.this.getLocation().y + e.getY()
//							- tmp.y);
//					QQMain.this.setLocation(loc);
//				}
//			}
//		});


//import java.awt.BorderLayout;
//import java.util.Date;
//
//import bean.QQUser;

//public class ceshi {
//	public ceshi(QQUser user){
////		String y=user.getBirthday();
////		String n=y.substring(0,y.indexOf("��")+1);
////		System.out.println(n);
//		}
	
//	public static void main(String[] args) {
//		Date date = new Date();// ��ȡϵͳ��ǰʱ��
//		String n=date+"";
//		String n1=n.substring(24,n.length());
//		
//		System.out.println(n1);
		
		
//		else if(e.getSource()==stupian){//����ͼƬ
//			//����ѡ���ļ�����
//			FileDialog fd=new FileDialog(QQChat.this,"��ѡ��ͼƬ",FileDialog.LOAD);
//			//�ô�����ʾ
//			fd.show();
//			//��ȡ�ļ�·��
//			String filename=fd.getDirectory()+"//"+fd.getFile();
//			//�����ļ�����
//			File f=new File(filename);
//			
//			//���ļ�ת�����ֽ�����
//			byte[] b=new byte[(int)f.length()];
//			
//			//�õ��ļ��ֽ�������
//			try {
//				FileInputStream is=new FileInputStream(f);
//				//���ļ���ȡ���ֽ�������
//				is.read(b);
//				
//			} catch (Exception e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			
//			//����Ϣ���͸�����
//			QQMsg msg=new QQMsg();
//			msg.setCmd(Contents.CMD_CHAT);//��Ϣ���� ����֪ͨ
//			msg.setMyuser(myuser);//��
//			msg.setFuser(fuser);//����
//			msg.setDoc(send.getStyledDocument());//��������
//			
//			//������Ϣ
//			
//			Icon icon=new ImageIcon(filename);
//			send.insertIcon(icon);
	
//		}
		
		
		
		
		
//		package com.ht.ui;
//
//		import java.lang.reflect.Method;
//
//		//ʵ�ִ������������ָ����ַ����
//		public class qqzone {
//			public static void openURL(String url) {
//				try {
//					browse(url);
//				} catch (Exception e) {
//				}
//			}
//
//			private static void browse(String url) throws Exception {
//				// ��ȡ����ϵͳ������
//				String osName = System.getProperty("os.name", "");
//				if (osName.startsWith("Mac OS")) {
//					// ƻ���Ĵ򿪷�ʽ
//					Class fileMgr = Class.forName("com.apple.eio.FileManager");
//					Method openURL = fileMgr.getDeclaredMethod("openURL",
//							new Class[] { String.class });
//					openURL.invoke(null, new Object[] { url });
//				} else if (osName.startsWith("Windows")) {
//					// windows�Ĵ򿪷�ʽ��
//					Runtime.getRuntime().exec(
//							"rundll32 url.dll,FileProtocolHandler " + url);
//				} else {
//					// Unix or Linux�Ĵ򿪷�ʽ
//					String[] browsers = { "firefox", "opera", "konqueror", "epiphany",
//							"mozilla", "netscape" };
//					String browser = null;
//					for (int count = 0; count < browsers.length && browser == null; count++)
//						// ִ�д��룬��brower��ֵ��������
//						// ������������̴����ɹ��ˣ�==0�Ǳ�ʾ����������
//						if (Runtime.getRuntime().exec(
//								new String[] { "which", browsers[count] }).waitFor() == 0)
//							browser = browsers[count];
//					if (browser == null)
//						throw new Exception("Could not find web browser");
//					else
//						// ���ֵ�������Ѿ��ɹ��ĵõ���һ�����̡�
//						Runtime.getRuntime().exec(new String[] { browser, url });
//				}
//			}
//
//			// ������ ������
//			public static void main(String[] args) {
//				String url = "http://user.qzone.qq.com/1978450138/infocenter?ptsig=6S4PGdYgmXd-OqFbwInmXY8c*tCUpGWAQBmNyyuSlas_ 
//
//		";
//				qqzone.openURL(url);
//			}
//		}
//		10:34:45
//		�ܽ��� 2017/2/28 10:34:45
//		package com.ht.ui;
//
//		import java.lang.reflect.Method;
//
//		//ʵ�ִ������������ָ����ַ����
//		public class qqzone {
//			public static void openURL(String url) {
//				try {
//					browse(url);
//				} catch (Exception e) {
//				}
//			}
//
//			private static void browse(String url) throws Exception {
//				// ��ȡ����ϵͳ������
//				String osName = System.getProperty("os.name", "");
//				if (osName.startsWith("Mac OS")) {
//					// ƻ���Ĵ򿪷�ʽ
//					Class fileMgr = Class.forName("com.apple.eio.FileManager");
//					Method openURL = fileMgr.getDeclaredMethod("openURL",
//							new Class[] { String.class });
//					openURL.invoke(null, new Object[] { url });
//				} else if (osName.startsWith("Windows")) {
//					// windows�Ĵ򿪷�ʽ��
//					Runtime.getRuntime().exec(
//							"rundll32 url.dll,FileProtocolHandler " + url);
//				} else {
//					// Unix or Linux�Ĵ򿪷�ʽ
//					String[] browsers = { "firefox", "opera", "konqueror", "epiphany",
//							"mozilla", "netscape" };
//					String browser = null;
//					for (int count = 0; count < browsers.length && browser == null; count++)
//						// ִ�д��룬��brower��ֵ��������
//						// ������������̴����ɹ��ˣ�==0�Ǳ�ʾ����������
//						if (Runtime.getRuntime().exec(
//								new String[] { "which", browsers[count] }).waitFor() == 0)
//							browser = browsers[count];
//					if (browser == null)
//						throw new Exception("Could not find web browser");
//					else
//						// ���ֵ�������Ѿ��ɹ��ĵõ���һ�����̡�
//						Runtime.getRuntime().exec(new String[] { browser, url });
//				}
//			}
//
//			// ������ ������
//			public static void main(String[] args) {
//				String url = "http://user.qzone.qq.com/1978450138/infocenter?ptsig=6S4PGdYgmXd-OqFbwInmXY8c*tCUpGWAQBmNyyuSlas_ 
//
//		";
//				qqzone.openURL(url);
//			}
//		}

		
		
//		UIManager.put("TabbedPane.contentOpaque", false);//JList���ò˵���Ϊ͸����ǰ��
//		
//		// �����б���л����
//		JTabbedPane tab = new JTabbedPane();
//		setBackground(new Color(0,0,0,0));
//		tab.setBackground(new Color(0,0,0,0));
//		tab.setPreferredSize(new Dimension(0, 0));
//		tab.setBackground(new Color(0, 0, 0, 0));
//		tab.setOpaque(false);
//		
//		
//		list1 = new JList();
//		list2 = new JList();
//		list3 = new JList();
//		list4 = new JList();
//
//		// ��JList��������
//		list1.addMouseListener(new MyMouseListener());
//		list2.addMouseListener(new MyMouseListener());
//		list3.addMouseListener(new MyMouseListener());
//		list4.addMouseListener(new MyMouseListener());
//		
//		//�б�͸��
//		list1.setBackground(new Color(0,0,0,0));
//		list1.setPreferredSize(new Dimension(0, 0));
//		list1.setBackground(new Color(0, 0, 0, 0));
//		list1.setOpaque(false);
//		
//		list2.setBackground(new Color(0,0,0,0));
//		list2.setPreferredSize(new Dimension(0, 0));
//		list2.setBackground(new Color(0, 0, 0, 0));
//		list2.setOpaque(false);
//		
//		list3.setBackground(new Color(0,0,0,0));
//		list3.setPreferredSize(new Dimension(0, 0));
//		list3.setBackground(new Color(0, 0, 0, 0));
//		list3.setOpaque(false);
//		
//		list4.setBackground(new Color(0,0,0,0));
//		list4.setPreferredSize(new Dimension(0, 0));
//		list4.setBackground(new Color(0, 0, 0, 0));
//		list4.setOpaque(false);
		
		
		
		
		
		
		
//		package cn.qq.common;
//
//		import java.awt.Dimension;
//		import java.awt.Rectangle;
//		import java.awt.Robot;
//		import java.awt.Toolkit;
//		import java.awt.image.BufferedImage;
//		import java.io.File;
//
//		import javax.imageio.ImageIO;
//
//
//
//		public class Photograph {
//			/*******************************************************************
//			 * ��JavaBean����ֱ��������JavaӦ�ó����е��ã�ʵ����Ļ��"����"
//			 * This JavaBean is used to snapshot the GUI in a
//			 * Java application! You can embeded
//			 * it in to your java application source code, and us
//			 * it to snapshot the right GUI of the application
//			 * @see javax.ImageIO
//			 * @author liluqun
//			 * @version 1.0
//			 *****************************************************/
//
//			
//			 private String fileName; //�ļ���ǰ׺
//			 private String defaultName = "GuiCamera";
//			 static int serialNum=0;
//			 private String imageFormat; //ͼ���ļ��ĸ�ʽ
//			 private String defaultImageFormat="png";
//			 Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
//
//			 /****************************************************************
//			 * Ĭ�ϵ��ļ�ǰ׺ΪGuiCamera���ļ���ʽΪPNG��ʽ
//			 * The default construct will use the default
//			 * Image file surname "GuiCamera",
//			 * and default image format "png"
//			 ****************************************************************/
//			 public Photograph() {
//			 fileName = defaultName;
//			 imageFormat=defaultImageFormat;
//
//			 }
//
//			 /****************************************************************
//			 * @param s the surname of the snapshot file
//			 * @param format the format of the image file,
//			 * it can be "jpg" or "png"
//			 * ������֧��JPG��PNG�ļ��Ĵ洢
//			 ****************************************************************/
//			 public Photograph(String s,String format) {
//
//			 fileName = s;
//			 imageFormat=format;
//			 }
//
//			 /****************************************************************
//			 * ����Ļ��������
//			 * snapShot the Gui once
//			 ****************************************************************/
//			 public void snapShot() {
//
//			 try {
//			 //������Ļ��һ��BufferedImage����screenshot
//			 BufferedImage screenshot = (new Robot()).createScreenCapture(new
//			 Rectangle(0, 0, (int) d.getWidth(), (int) d.getHeight()));
//			 serialNum++;
//			 //�����ļ�ǰ׺�������ļ���ʽ�������Զ������ļ���
//			 String name=fileName+String.valueOf(serialNum)+"."+imageFormat;
//			 File f = new File(name);
//			 System.out.print("Save File "+name);
//			 //��screenshot����д��ͼ���ļ�
//			 ImageIO.write(screenshot, imageFormat, f);
//			 System.out.print("..Finished!\n");
//			 }
//			 catch (Exception ex) {
//			 System.out.println(ex);
//			 }
//			 }
//
//			 public static void main(String[] args)
//			 {
//			// Test cam= new Test("d:\\Hello", "png");//
//				 Photograph cam= new Photograph("C:/Users/sweet/Desktop/picture", "png");
//			 cam.snapShot();
//			 }
//		}

//	}
}
