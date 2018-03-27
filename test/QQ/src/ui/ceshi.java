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
  
  
////鼠标移入
//	public void mouseEntered(MouseEvent e) {
//		Point p = QQMain.this.getLocationOnScreen();
//		if(p.y<=10){
//			p.y = 0;
//			QQMain.this.setLocation(p);
//		}
//	}
//	
//	//鼠标移出
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
//	// 设置界面可以拖动的方法
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
////		String n=y.substring(0,y.indexOf("年")+1);
////		System.out.println(n);
//		}
	
//	public static void main(String[] args) {
//		Date date = new Date();// 获取系统当前时间
//		String n=date+"";
//		String n1=n.substring(24,n.length());
//		
//		System.out.println(n1);
		
		
//		else if(e.getSource()==stupian){//发送图片
//			//弹出选择文件窗口
//			FileDialog fd=new FileDialog(QQChat.this,"请选择图片",FileDialog.LOAD);
//			//让窗口显示
//			fd.show();
//			//获取文件路径
//			String filename=fd.getDirectory()+"//"+fd.getFile();
//			//构造文件对象
//			File f=new File(filename);
//			
//			//将文件转换成字节数组
//			byte[] b=new byte[(int)f.length()];
//			
//			//得到文件字节输入流
//			try {
//				FileInputStream is=new FileInputStream(f);
//				//将文件读取到字节数组中
//				is.read(b);
//				
//			} catch (Exception e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			
//			//将消息发送给好友
//			QQMsg msg=new QQMsg();
//			msg.setCmd(Contents.CMD_CHAT);//消息类型 聊天通知
//			msg.setMyuser(myuser);//我
//			msg.setFuser(fuser);//好友
//			msg.setDoc(send.getStyledDocument());//聊天内容
//			
//			//发送消息
//			
//			Icon icon=new ImageIcon(filename);
//			send.insertIcon(icon);
	
//		}
		
		
		
		
		
//		package com.ht.ui;
//
//		import java.lang.reflect.Method;
//
//		//实现打开浏览器并跳到指定网址的类
//		public class qqzone {
//			public static void openURL(String url) {
//				try {
//					browse(url);
//				} catch (Exception e) {
//				}
//			}
//
//			private static void browse(String url) throws Exception {
//				// 获取操作系统的名字
//				String osName = System.getProperty("os.name", "");
//				if (osName.startsWith("Mac OS")) {
//					// 苹果的打开方式
//					Class fileMgr = Class.forName("com.apple.eio.FileManager");
//					Method openURL = fileMgr.getDeclaredMethod("openURL",
//							new Class[] { String.class });
//					openURL.invoke(null, new Object[] { url });
//				} else if (osName.startsWith("Windows")) {
//					// windows的打开方式。
//					Runtime.getRuntime().exec(
//							"rundll32 url.dll,FileProtocolHandler " + url);
//				} else {
//					// Unix or Linux的打开方式
//					String[] browsers = { "firefox", "opera", "konqueror", "epiphany",
//							"mozilla", "netscape" };
//					String browser = null;
//					for (int count = 0; count < browsers.length && browser == null; count++)
//						// 执行代码，在brower有值后跳出，
//						// 这里是如果进程创建成功了，==0是表示正常结束。
//						if (Runtime.getRuntime().exec(
//								new String[] { "which", browsers[count] }).waitFor() == 0)
//							browser = browsers[count];
//					if (browser == null)
//						throw new Exception("Could not find web browser");
//					else
//						// 这个值在上面已经成功的得到了一个进程。
//						Runtime.getRuntime().exec(new String[] { browser, url });
//				}
//			}
//
//			// 主方法 测试类
//			public static void main(String[] args) {
//				String url = "http://user.qzone.qq.com/1978450138/infocenter?ptsig=6S4PGdYgmXd-OqFbwInmXY8c*tCUpGWAQBmNyyuSlas_ 
//
//		";
//				qqzone.openURL(url);
//			}
//		}
//		10:34:45
//		曹江文 2017/2/28 10:34:45
//		package com.ht.ui;
//
//		import java.lang.reflect.Method;
//
//		//实现打开浏览器并跳到指定网址的类
//		public class qqzone {
//			public static void openURL(String url) {
//				try {
//					browse(url);
//				} catch (Exception e) {
//				}
//			}
//
//			private static void browse(String url) throws Exception {
//				// 获取操作系统的名字
//				String osName = System.getProperty("os.name", "");
//				if (osName.startsWith("Mac OS")) {
//					// 苹果的打开方式
//					Class fileMgr = Class.forName("com.apple.eio.FileManager");
//					Method openURL = fileMgr.getDeclaredMethod("openURL",
//							new Class[] { String.class });
//					openURL.invoke(null, new Object[] { url });
//				} else if (osName.startsWith("Windows")) {
//					// windows的打开方式。
//					Runtime.getRuntime().exec(
//							"rundll32 url.dll,FileProtocolHandler " + url);
//				} else {
//					// Unix or Linux的打开方式
//					String[] browsers = { "firefox", "opera", "konqueror", "epiphany",
//							"mozilla", "netscape" };
//					String browser = null;
//					for (int count = 0; count < browsers.length && browser == null; count++)
//						// 执行代码，在brower有值后跳出，
//						// 这里是如果进程创建成功了，==0是表示正常结束。
//						if (Runtime.getRuntime().exec(
//								new String[] { "which", browsers[count] }).waitFor() == 0)
//							browser = browsers[count];
//					if (browser == null)
//						throw new Exception("Could not find web browser");
//					else
//						// 这个值在上面已经成功的得到了一个进程。
//						Runtime.getRuntime().exec(new String[] { browser, url });
//				}
//			}
//
//			// 主方法 测试类
//			public static void main(String[] args) {
//				String url = "http://user.qzone.qq.com/1978450138/infocenter?ptsig=6S4PGdYgmXd-OqFbwInmXY8c*tCUpGWAQBmNyyuSlas_ 
//
//		";
//				qqzone.openURL(url);
//			}
//		}

		
		
//		UIManager.put("TabbedPane.contentOpaque", false);//JList设置菜单项为透明的前提
//		
//		// 好友列表的切换组件
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
//		// 给JList加鼠标监听
//		list1.addMouseListener(new MyMouseListener());
//		list2.addMouseListener(new MyMouseListener());
//		list3.addMouseListener(new MyMouseListener());
//		list4.addMouseListener(new MyMouseListener());
//		
//		//列表透明
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
//			 * 该JavaBean可以直接在其他Java应用程序中调用，实现屏幕的"拍照"
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
//			 private String fileName; //文件的前缀
//			 private String defaultName = "GuiCamera";
//			 static int serialNum=0;
//			 private String imageFormat; //图像文件的格式
//			 private String defaultImageFormat="png";
//			 Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
//
//			 /****************************************************************
//			 * 默认的文件前缀为GuiCamera，文件格式为PNG格式
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
//			 * 本构造支持JPG和PNG文件的存储
//			 ****************************************************************/
//			 public Photograph(String s,String format) {
//
//			 fileName = s;
//			 imageFormat=format;
//			 }
//
//			 /****************************************************************
//			 * 对屏幕进行拍照
//			 * snapShot the Gui once
//			 ****************************************************************/
//			 public void snapShot() {
//
//			 try {
//			 //拷贝屏幕到一个BufferedImage对象screenshot
//			 BufferedImage screenshot = (new Robot()).createScreenCapture(new
//			 Rectangle(0, 0, (int) d.getWidth(), (int) d.getHeight()));
//			 serialNum++;
//			 //根据文件前缀变量和文件格式变量，自动生成文件名
//			 String name=fileName+String.valueOf(serialNum)+"."+imageFormat;
//			 File f = new File(name);
//			 System.out.print("Save File "+name);
//			 //将screenshot对象写入图像文件
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
