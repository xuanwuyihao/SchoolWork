package ui;



import impl.QQUserServiceimp;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

import common.Contents;
import common.Msgsend;
import common.Sound;
import common.TipUi;
import bean.QQHistory;
import bean.QQMsg;
import bean.QQUser;
import service.IQQUserService;
import ui.QQLogin1.MyActionListener;


public class QQMaim extends JFrame{
	JLabel la,la2,cls,xiao;
	JLabel nickname,leves,status,qm,touxiang,find,hf,jl,yy,lrq,yx,kj;
	
	//获取底层方法
	IQQUserService is=new QQUserServiceimp();
	//好友列表的list对象
	JList list1,list2,list3,list4;
	//存放好友信息
	Vector<QQUser> vect1,vect2,vect3,vect4;
	
	//弹出式菜单
	JPopupMenu pop;
	//弹出式菜单选项
	JMenuItem talk,info,del,mfriend,mfamily,mwork,mblack;
	
	//好友对象
	QQUser frienduser;
	
	//登录用户对象
	QQUser user;
	
	//状态选择的弹出式菜单
	JPopupMenu popstate;
	JMenuItem it1,it2,it3,it4;//选项
	
	//托盘图标
	TrayIcon tray;		
	
	//托盘图标的右键
	PopupMenu traypop;
	MenuItem trayite1,trayite2;
	
	
	//换肤
	int a=1;
	
	//保存所有聊过天的好友窗口
	Map<String, Liaotian> chats=new HashMap<String, Liaotian>();
	public QQMaim(QQUser user){
		Image taskbar = Toolkit.getDefaultToolkit().getImage(user.getFace());
		setIconImage(taskbar);
		
		//把传来的user保存到全局
		this.user=user;
		
		//更换视觉样式
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		this.setDragable();
		Container c=getContentPane();
		this.setUndecorated(true);
		//创建弹出式菜单
		this.createPop();
		
	
		//创建关闭面板
		cls=new JLabel("");
		cls.setBounds(255, 2, 25, 25);
		cls.addMouseListener(new MousetListener());
		//设置箭头为手型
		cls.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(cls);
		
		//化最小
		xiao=new JLabel("");
		xiao.setBounds(228, 4, 25, 25);
		xiao.addMouseListener(new MousetListener());
		//设置箭头为手型
		xiao.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(xiao);
		
		
		
		
		
		
		//显示昵称
		nickname=new JLabel(user.getUname());
		nickname.setBounds(80, 50, 100, 50);
		nickname.setFont(new Font("华文行楷",Font.PLAIN,20));
		nickname.setForeground(Color.white);
		c.add(nickname);
		
		//显示等级
		leves=new JLabel("LV "+user.getLeves());
		leves.setBounds(85, 30, 40, 50);
		leves.setFont(new Font("微软雅黑",Font.BOLD,10));
		leves.setForeground(new Color(235,240,49));
		c.add(leves);
		
		//显示状态
		String img="image/s_online.png";
		if (user.getStatus()==Contents.STATU_HIDE) {
			img="image/s_hide.png";
		}else if (user.getStatus()==Contents.STATU_BUSY) {
			img="image/s_leave.png";
		}else if (user.getStatus()==Contents.STATU_NODISTURB) {
			img="image/s_busy.png";
		}
		
		//显示状态
		//弹出式菜单
		popstate =new JPopupMenu();
		it1=new JMenuItem("我在线",new ImageIcon("image/s_online.png"));
		it2=new JMenuItem("隐身",new ImageIcon("image/s_hide.png"));
		it3=new JMenuItem("忙碌",new ImageIcon("image/s_leave.png"));
		it4=new JMenuItem("请勿打扰",new ImageIcon("image/s_busy.png"));
		
		it1.addActionListener(new MyActionlistener());
		it2.addActionListener(new MyActionlistener());
		it3.addActionListener(new MyActionlistener());
		it4.addActionListener(new MyActionlistener());
		
		popstate.add(it1);
		popstate.add(it2);
		popstate.add(it3);
		popstate.add(it4);
		
		status=new JLabel(new ImageIcon(img));
		status.setBounds(60, 85, 15, 15);
		status.setFont(new Font("华文行楷",Font.PLAIN,10));
		status.addMouseListener(new MousetListener());
//		status.setBackground(Color.red);
		c.add(status);
		
		//显示头像
		touxiang=new JLabel(new ImageIcon(user.getFace()));
		touxiang.setBounds(10, 35, 65, 65);
		touxiang.setCursor(new Cursor(Cursor.HAND_CURSOR));
		touxiang.setToolTipText("点击修改资料");
		touxiang.addMouseListener(new MousetListener());
		c.add(touxiang);
		

		//显示签名
		nickname=new JLabel(user.getQm());
		nickname.setBounds(80, 70, 120, 50);
		nickname.setFont(new Font("华文行楷",Font.PLAIN,12));
		c.add(nickname);
		
		
		
		UIManager.put("TabbedPane.contentOpaque", false);//JList设置菜单项为透明的前提
		
		JTabbedPane tab=new JTabbedPane();
		// 好友列表的切换组件
		setBackground(new Color(0,0,0,0));
		tab.setBackground(new Color(0,0,0,0));
		tab.setPreferredSize(new Dimension(0, 0));
		tab.setBackground(new Color(0, 0, 0, 0));
		tab.setOpaque(false);
		
		list1=new JList();
		list2=new JList();
		list3=new JList();
		list4=new JList();
		
		//列表透明
		list1.setBackground(new Color(0,0,0,0));
		list1.setPreferredSize(new Dimension(0, 0));
		list1.setBackground(new Color(0, 0, 0, 0));
		list1.setOpaque(false);
		
		list2.setBackground(new Color(0,0,0,0));
		list2.setPreferredSize(new Dimension(0, 0));
		list2.setBackground(new Color(0, 0, 0, 0));
		list2.setOpaque(false);
		
		list3.setBackground(new Color(0,0,0,0));
		list3.setPreferredSize(new Dimension(0, 0));
		list3.setBackground(new Color(0, 0, 0, 0));
		list3.setOpaque(false);
		
		list4.setBackground(new Color(0,0,0,0));
		list4.setPreferredSize(new Dimension(0, 0));
		list4.setBackground(new Color(0, 0, 0, 0));
		list4.setOpaque(false);
		
		//给list家鼠标监听
		list1.addMouseListener(new MousetListener());
		list2.addMouseListener(new MousetListener());
		list3.addMouseListener(new MousetListener());
		list4.addMouseListener(new MousetListener());
		
		//获取好友信息
		this.flushMain();
			
		tab.add("   好友     ",list1);
		tab.setFont(new Font("华文行楷",Font.PLAIN,15));
		tab.add("   家人     ",list2);
		tab.add("   同事     ",list3);
		tab.add("  黑名单",list4);
		tab.setBounds(0, 165, 828, 420);
		c.add(tab);
		
		
		
		
		//查找好友
		find=new JLabel(new ImageIcon(""));
		find.setBounds(179, 630, 30, 20);
		find.addMouseListener(new MousetListener());

		//设置箭头为手型
		find.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(find);
		
		
		//打开音乐
		yy=new JLabel("");
		yy.setBounds(115, 600, 30, 20);
		yy.addMouseListener(new MousetListener());
		//设置箭头为手型
		yy.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(yy);
		
		//换肤
		hf=new JLabel("");
		hf.setBounds(225, 110, 30, 20);
		hf.addMouseListener(new MousetListener());
		//设置箭头为手型
		hf.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(hf);
		
		
		//空间
		kj=new JLabel("");
		kj.setBounds(5, 110, 30, 20);
		kj.addMouseListener(new MousetListener());
		//设置箭头为手型
		kj.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(kj);
		
		//打开浏览器
		lrq=new JLabel("");
		lrq.setBounds(30, 600, 30, 20);
		lrq.addMouseListener(new MousetListener());
		//设置箭头为手型
		lrq.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(lrq);
		
		//打开游戏
		yx=new JLabel("");
		yx.setBounds(240, 625, 50, 30);
		yx.addMouseListener(new MousetListener());
		//设置箭头为手型
		yx.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(yx);

		//让图片在窗口中显示
		jl=new JLabel(new ImageIcon("image/main1.png"));
		add(jl);
		setSize(281,651);
		
		//主面板位置
		setLocation(980,50);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		//启动接收线程
		new MyThread().start();
		
		//通知好友上线了
		System.out.println("主面板上 用户状态"+user.getStatus());
		
		String faces=user.getFace();//得到头像路径
		if (user.getStatus()==Contents.STATU_ONLINE) {//上线
			
//			System.out.println("通知上线");
			this.notice(Contents.CMD_ONLINE);
			is.changestatus(user.getQqnum(), Contents.STATU_ONLINE);//在线
			notice(Contents.CMD_ONLINE);
//			touxiang.setIcon(new ImageIcon(""));
		
		}else if (user.getStatus()==Contents.STATU_BUSY) {//隐身
			this.notice(Contents.CMD_BUSY);
			faces=faces.substring(0,faces.indexOf("."));
			faces=faces+"_l.png";
		}else if (user.getStatus()==Contents.STATU_NODISTURB) {//隐身
			this.notice(Contents.CMD_NODITURB);
			faces=faces.substring(0,faces.indexOf("."));
			faces=faces+"_w.png";
		}
		this.addWindowListener(new MyWindows());
		
		this.addMouseListener(new MousetListener());
	}
	
	public void notice(int cmd){
		//通知好友、家人、同事
		for (int i = 0; i <vect1.size(); i++) {
			QQUser fuser=vect1.get(i);//取出每一个好友
			QQMsg msg=new QQMsg();
			msg.setCmd(cmd);
			msg.setMyUser(user);
			msg.setFUser(fuser);
			new Msgsend	(msg);
		}
		
		
		for (int i = 0; i <vect2.size(); i++) {
			QQUser fuser=vect2.get(i);//取出每一个好友
			QQMsg msg=new QQMsg();
			msg.setCmd(cmd);
			msg.setMyUser(user);
			msg.setFUser(fuser);
			new Msgsend	(msg);
		}
		
		for (int i = 0; i <vect3.size(); i++) {
			QQUser fuser=vect3.get(i);//取出每一个好友
			QQMsg msg=new QQMsg();
			msg.setCmd(cmd);
			msg.setMyUser(user);
			msg.setFUser(fuser);
			new Msgsend	(msg);
		}
		
	}
	
	//打开聊天窗口的方法
	public Liaotian openChat(String fqqnum,QQMsg msg){
		//根据好友的QQ号去集合中找看看之前有没有打开过
		Liaotian chat=chats.get(fqqnum);
		if (chat==null) {//还没聊过天
			if(msg!=null){
			QQUser myuser=msg.getMyUser();//我的对象
			QQUser fUser=msg.getFUser();//好友对象
			chat=new Liaotian(fUser,myuser);
			
		}else {
			chat=new Liaotian(user,frienduser);
		}
			chats.put(fqqnum,chat);
		}
		//显示窗口
		chat.setVisible(true);
		return chat;
	}
	
	//接收线程
	class MyThread extends Thread{
		@Override
		public void run() {
			//在自己的端口实时监听
			try {
				int port=Integer.parseInt(user.getPort());
				DatagramSocket ds=new DatagramSocket(port);
				
				while(true){//一直接收
					byte[] b=new byte[1024*25];
					
					DatagramPacket dp=new DatagramPacket(b,b.length);
					ds.receive(dp);
					
					//字节数组输入流
					ByteArrayInputStream bis=new ByteArrayInputStream(b,0,dp.getLength());
					ObjectInputStream ios=new ObjectInputStream(bis);
					
					QQMsg msg=(QQMsg)ios.readObject();
					//根据消息命令字进行不同操作
					if (msg.getCmd()==Contents.CMD_CHAT) {//聊天
						//弹出聊天窗口
//						new Liaotian(msg.getFUser(),msg.getMyUser());
						Liaotian chat=openChat(msg.getMyUser().getQqnum(), msg);
						//把消息显示到接收框
						chat.appendView(msg.getMyUser().getUname(),msg.getDoc());
					}else if (msg.getCmd()==Contents.CMD_SHKAE) {
						//调用抖动窗口的方法
						Liaotian chat=openChat(msg.getMyUser().getQqnum(), msg);
						chat.shake();
					}
					if (msg.getCmd()==Contents.CMD_ONLINE) {//上线
//						System.out.println("接收到好友的上线通知");
						
						
						//刷新好友面板
						flushMain();
						
						//播放声音
						new Sound("Global.wav");
						
						//弹出上线提示
						new TipUi(msg.getMyUser());
						
						
					}else if (msg.getCmd()==Contents.CMD_HIDE) {//隐身
						//刷新好友面板
						flushMain();
					}else if (msg.getCmd()==Contents.CMD_BUSY) {//忙碌
						//刷新好友面板
						flushMain();
					}else if (msg.getCmd()==Contents.CMD_NODITURB) {//请勿打扰
						//刷新好友面板
						flushMain();
					}else if (msg.getCmd()==Contents.CMD_OFFLINE) {//下线
						//刷新好友面板
						flushMain();
					}else if (msg.getCmd()==Contents.CMD_ADDFRIEND) {//添加好友
						//播放声音
						new Sound("system.wav");
						QQUser myuser=msg.getMyUser();//添加者
						QQUser fuser=msg.getFUser();//被添加者
						//弹出提示
					int i=JOptionPane.showConfirmDialog(null, myuser.getUname()+"【"+myuser.getQqnum()+"】 请求添加好友！"+"好友添加请求"+JOptionPane.YES_NO_OPTION);
						System.out.println("是否 添加"+i);
						
						
						if (i==0) {//同意添加
							//向好友表中添加数据
							is.addFriend(myuser.getQqnum(), fuser.getQqnum(), "好友");
							
							//刷新好友面板
							flushMain();
							
							//发送同意添加的通知
							QQMsg m=new QQMsg();
							m.setCmd(Contents.CMD_FRIENDYES);
							m.setMyUser(fuser);
							m.setFUser(myuser);
							new Msgsend(m);
						}else {
							//发送拒绝添加的通知
							QQMsg m=new QQMsg();
							m.setCmd(Contents.CMD_FRIENDNO);//拒绝添加
							m.setMyUser(fuser);
							m.setFUser(myuser);
							new Msgsend(m);
						}
					}else if (msg.getCmd()==Contents.CMD_FRIENDYES) {//同意添加好友
						//刷新面板
						flushMain();
						//弹出提示
						JOptionPane.showConfirmDialog(null, msg.getMyUser().getUname()+"同意了你的请求！");
					}else if (msg.getCmd()==Contents.CMD_FRIENDNO) {//同意添加好友
						//刷新面板
						flushMain();
						//弹出提示
						JOptionPane.showConfirmDialog(null, msg.getFUser().getUname()+"拒绝了你的请求！");
					}else if (msg.getCmd()==Contents.CMD_SENDFILE) {//文件接收
						QQUser myuser=msg.getMyUser();//发送者
						QQUser fuser=msg.getFUser();//接收者
						//弹出是否接收对话框
						int i=JOptionPane.showConfirmDialog(null, myuser.getUname()+"向你发送文件["+msg.getFile()+"],是否接收？","文件传输",JOptionPane.YES_NO_OPTION);
						if (i==0) {//同意接收
							//打开路径选择框
							FileDialog fd=new FileDialog(QQMaim.this,"文件保存",FileDialog.SAVE);
							//设置保存名称
							fd.setFile(msg.getFile());
							//显示弹出框
							fd.show();
							
							String filename=fd.getDirectory()+"//"+fd.getFile();
							
							//文件对象
							File file =new File(filename);
							if (!file.exists()) {//如果文件不存在
								file.createNewFile();//创建新文件
								
							}
							//创建文件输出流
							FileOutputStream fo=new FileOutputStream(file);
							fo.write(msg.getB());//把字节数组写到文件中
							fo.close();
							
							//回复好友
							QQMsg m=new QQMsg();
							m.setCmd(Contents.CMD_FILEYES);//同意接收
							m.setMyUser(fuser);
							m.setFUser(myuser);
							new Msgsend(m);
							
						}else {//拒绝
							//回复好友
							QQMsg m=new QQMsg();
							m.setCmd(Contents.CMD_FILENO);//拒接接收
							m.setMyUser(fuser);
							m.setFUser(myuser);
							new Msgsend(m);
						}
					}else if (msg.getCmd()==Contents.CMD_FILEYES	) {//同意接收
						JOptionPane.showConfirmDialog(null, "对方已成功接收你的文件!");
					}else if (msg.getCmd()==Contents.CMD_FILENO	) {//拒绝接收
						JOptionPane.showConfirmDialog(null, "对方拒绝接收你的文件!");
					}else if (msg.getCmd()==Contents.CMD_DELFRIEND) {//删除好友
						//刷新面板
						flushMain();
					}
					
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	class MyWindows extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			//更改数据库用户状态
			is.changestatus(user.getQqnum(),Contents.STATU_OFFLINE);
			
			//通知好友
			notice(Contents.CMD_OFFLINE);
			
			System.exit(0);
		}
		@Override
		public void windowIconified(WindowEvent e) {
			//窗口最小化时
			
			//先获取系统所有托盘图标
			SystemTray stray=SystemTray.getSystemTray();
			
			if (tray!=null) {
				//如果之前有托盘图标了那么将图标移除重新创建
				stray.remove(tray);
			}
			//创建新的托盘图标
			createtray();
			
			//隐藏主面板
			QQMaim.this.setVisible(false);
			try {
				stray.add(tray);
			} catch (AWTException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	//创建弹出式菜单
	public void createPop(){
		//初始化弹出式菜单
		pop=new JPopupMenu();
		
		//创建菜单项
		talk=new JMenuItem("聊天");
		info=new JMenuItem("查看好友信息");
		del=new JMenuItem("删除该好友");
		mfriend=new JMenuItem("移动到好友分组");
		mfamily=new JMenuItem("移动到家人分组");
		mwork=new JMenuItem("移动到同事分组");
		mblack=new JMenuItem("移动到黑名单");
		
		//把菜单想添加到弹出式菜单中
		pop.add(talk);
		pop.add(info);
		pop.add(del);
		pop.add(mfriend);
		pop.add(mfamily);
		pop.add(mwork);
		pop.add(mblack);
		
		//给弹出式菜单添加按钮监听
		talk.addActionListener(new MyActionlistener());
		info.addActionListener(new MyActionlistener());
		del.addActionListener(new MyActionlistener());
		mfriend.addActionListener(new MyActionlistener());
		mfamily.addActionListener(new MyActionlistener());
		mwork.addActionListener(new MyActionlistener());
		mblack.addActionListener(new MyActionlistener());
		
	}
	
	class MyActionlistener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==talk) {//弹出式菜单--聊天
//				new Liaotian(user,frienduser);
				openChat(frienduser.getQqnum(), null);
				
			}else if (e.getSource()==info) {//弹出式菜单--查看资料
				//查看好友资料
				new QQfriendinfo(frienduser);
				
			}else if (e.getSource()==del) {//弹出式菜单--删除好友
				//删除数据库数据
				is.delFriend(user.getQqnum(),frienduser.getQqnum());
				//刷新自己的面板
				flushMain();
				//通知好友
				QQMsg msg=new QQMsg();
				msg.setCmd(Contents.CMD_DELFRIEND);//删除好友
				msg.setMyUser(user);
				msg.setFUser(frienduser);
				new Msgsend(msg);
				
			}else if (e.getSource()==mfriend) {//弹出式菜单--移动到好友分组
				is.moveFriend(user.getQqnum(), frienduser.getQqnum(), "好友");
				//刷新面板
				flushMain();
			}else if (e.getSource()==mfamily) {//弹出式菜单--移动到家人分组
				is.moveFriend(user.getQqnum(), frienduser.getQqnum(), "家人");
				//刷新面板
				flushMain();
			}else if (e.getSource()==mwork) {//弹出式菜单--移动到同事分组
				is.moveFriend(user.getQqnum(), frienduser.getQqnum(), "同事");
				//刷新面板
				flushMain();
			}else if (e.getSource()==mblack) {//弹出式菜单--移动到黑名单
				is.moveFriend(user.getQqnum(), frienduser.getQqnum(), "黑名单");
				//刷新面板
				flushMain();
			}
			
			if (e.getSource()==it1) {
				status.setIcon(new ImageIcon("image/s_online.png"));
				//改变数据库的状态
				is.changestatus(user.getQqnum(), Contents.STATU_ONLINE);//在线
				notice(Contents.CMD_ONLINE);
			}else if (e.getSource()==it2) {
				status.setIcon(new ImageIcon("image/s_hide.png"));
				is.changestatus(user.getQqnum(), Contents.STATU_HIDE);//隐身
				notice(Contents.CMD_HIDE);
			}else if (e.getSource()==it3) {
				status.setIcon(new ImageIcon("image/s_leave.png"));
				is.changestatus(user.getQqnum(), Contents.STATU_BUSY);//忙碌
				notice(Contents.CMD_BUSY);
			}else if (e.getSource()==it4) {
				status.setIcon(new ImageIcon("image/s_busy.png"));
				is.changestatus(user.getQqnum(), Contents.STATU_NODISTURB);//请勿打扰
				notice(Contents.CMD_NODITURB);
			}
			//托盘图标
			if (e.getSource()==trayite1) {//打开主面板
				QQMaim.this.setVisible(true);//显示窗口
				setState(JFrame.NORMAL);//让窗口正常显示
			}else if (e.getSource()==trayite2) {//退出
				//更改用户为离线
				is.changestatus(user.getQqnum(),Contents.STATU_OFFLINE);
				//通知好友
				notice(Contents.CMD_OFFLINE);
				System.exit(0);
			}
		}
		
	}
	
	//托盘图标
	public void createtray(){
		//创建托盘图标的右键
		traypop=new PopupMenu();
		trayite1=new MenuItem("打开主面板");
		trayite2=new MenuItem("退出");
		
		traypop.add(trayite1);
		traypop.add(trayite2);
		
		//添加按钮监听
		trayite1.addActionListener(new MyActionlistener());
		trayite2.addActionListener(new MyActionlistener());
		
		//设置托盘图标
		Image ic=new ImageIcon("image/qier.png").getImage();
		//初始化托盘图标（图标、显示内容）
		tray=new TrayIcon(ic,user.getUname()+"["+user.getQqnum()+"]",traypop);
		//让图标根据屏幕适应大小
		tray.setImageAutoSize(true);
		//添加鼠标监听
		tray.addMouseListener(new MousetListener());
	}
	
	
	//列表模型数据
	class MylistModel extends AbstractListModel{
		Vector<QQUser> v=new Vector<QQUser>();
		 public MylistModel(Vector<QQUser> users) {
			 this.v=users;
		}
	
		//构造方法
		public Object getElementAt(int index) {
			return null;
		}

		public int getSize() {
			// TODO Auto-generated method stub
			return v.size();
		}
	}
	
	//设置jlist中每一条好友信息
	class MyDefaultListCellRender extends DefaultListCellRenderer{
		Vector<QQUser> datas=new Vector<QQUser>();
		public MyDefaultListCellRender(Vector<QQUser> users) {
			this.datas=users;
		}
		@Override
		public Component getListCellRendererComponent(JList list, Object arg1,
				int index, boolean isSelected, boolean arg4) {
			if (index>=0&&index<datas.size()) {//有数据进来
				QQUser user=datas.get(index);//从集合中获取用户对象
				String face=user.getFace();//得到头像路径
				//根据用户不同状态显示不同头像
				if (user.getStatus()==Contents.STATU_OFFLINE||user.getStatus()==Contents.STATU_HIDE) {
					//如果是离线或者隐身显示灰色头像
					face=face.substring(0,face.indexOf("."));
					face=face+"_h.png";
				}else if (user.getStatus()==Contents.STATU_BUSY) {//忙碌
					face=face.substring(0,face.indexOf("."));
					face=face+"_l.png";
				}else if (user.getStatus()==Contents.STATU_NODISTURB) {
					face=face.substring(0,face.indexOf("."));
					face=face+"_w.png";
				}
				setIcon(new ImageIcon(face));//设置头像
				setText(user.getUname()+"["+user.getQqnum()+"]"+user.getQm());//签名
				
				//设置鼠标经过的样式
				if (isSelected) {//如果被选中
					setBackground(list.getSelectionBackground());
					setForeground(list.getSelectionForeground());
				}else{
					setBackground(list.getBackground());
					setForeground(list.getForeground());
				}
				setEnabled(list.isEnabled());
				setFont(list.getFont());
			}
			return this;	
		}
	}
	//刷新主面板
	public void flushMain(){
		vect1=is.selFriendByGroup(user.getQqnum(), "好友");
		vect2=is.selFriendByGroup(user.getQqnum(), "家人");
		vect3=is.selFriendByGroup(user.getQqnum(), "同事");
		vect4=is.selFriendByGroup(user.getQqnum(), "黑名单");
		
		//动态加载Jlist
		list1.setModel(new MylistModel(vect1));
		list1.setCellRenderer(new MyDefaultListCellRender(vect1));
		
		list2.setModel(new MylistModel(vect2));
		list2.setCellRenderer(new MyDefaultListCellRender(vect2));
		
		list3.setModel(new MylistModel(vect3));
		list3.setCellRenderer(new MyDefaultListCellRender(vect3));
		
		list4.setModel(new MylistModel(vect4));
		list4.setCellRenderer(new MyDefaultListCellRender(vect4));
	}
	class MousetListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			
			//打开空间
			if (e.getSource()==kj) {
			new QQzone();
			String url =" https:ssl.ptlogin2.qq.com/jump?pt_clientver=5515&pt_src=1&keyindex=9&ptlang=2052&clientuin=984208452&clientkey=000158B4DB980068EB2F64BC16969C5FF7E6682ACAC32F5B5D0203BCBE259B61D0DC0F5D77A6D5970F0E806905122C6B29AE7D91A5361A1DD65F183DA4645A5F11E3CB84A418B27B3D351C9DA9897BA218A54CC655F856DC00495FBAE2809EE1A9BA33FE7123EAA9E23E22D36C67AC71&u1=http%3A%2F%2Fuser.qzone.qq.com%2F984208452%2Finfocenter&source=panelstar";

			QQzone.openURL(url);
					
			}
			
			
			
			//打开游戏
			if (e.getSource()==yx) {
				new QQzone();
				String url =" F:/死神vs火影/huoyinsis26/BVN 2.6.swfr";

				QQzone.openURL(url);
				
					
			}
			
			//打开浏览器
			if (e.getSource()==lrq) {
			
					Runtime r=Runtime.getRuntime();
					Process s=null;
					try {
						s=r.exec("C:/Program Files (x86)/Tencent/QQBrowser/QQBrowser.exe");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				
			}
			//音乐
			if (e.getSource()==yy) {
				if (e.getClickCount()==1) {
					Runtime u=Runtime.getRuntime();
					Process c=null;
					try {
						c=u.exec("C:/Program Files (x86)/Netease/CloudMusic/cloudmusic.exe");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
			
			//换肤
			if (e.getSource()==hf) {
				if (e.getClickCount()==1) {
					if(a==6){
						jl.setIcon(new ImageIcon("image/main"+a+".png"));
						a=1;
					}else{
						jl.setIcon(new ImageIcon("image/main"+a+".png"));
						a++;
					}
				}
			}
			
			//显示托盘图标
			if (e.getSource()==tray&&e.getButton()==1) {//单击右键显示托盘图标
				QQMaim.this.setVisible(true);//显示窗口
				setState(JFrame.NORMAL);//让窗口正常显示
			}
			if (e.getSource()==find) {
				new QQFind(user);//打开查找好友面板
			}
			
			if (e.getSource()==status) {//点击了状态
				popstate.show(status,e.getX(),e.getY());//显示弹出式窗口
				
			}else if (e.getSource()==cls) {

				//更改用户为离线
				is.changestatus(user.getQqnum(),Contents.STATU_OFFLINE);
				//通知好友
				notice(Contents.CMD_OFFLINE);
				System.exit(0);
			}else if (e.getSource()==xiao) {
				//让窗口化最小
				QQMaim.this.setExtendedState(QQMaim.this.ICONIFIED);
			}
			//好友分组
			if (e.getSource()==list1&&list1.getSelectedIndex()!=-1) {
				//从vecte中获取好友的用户对象
				frienduser=vect1.get(list1.getSelectedIndex());
				if (e.getButton()==1&&e.getClickCount()==2) {//双击
					openChat(frienduser.getQqnum(), null);
				}
				if (e.getButton()==3) {//点击右键
					//显示弹出式菜单
					pop.show(list1,e.getX(),e.getY());
				}
			}
			//家人分组
			if (e.getSource()==list2&&list2.getSelectedIndex()!=-1) {
				//从vecte中获取好友的用户对象
				frienduser=vect2.get(list2.getSelectedIndex());
				if (e.getButton()==1&&e.getClickCount()==2) {//双击
					openChat(frienduser.getQqnum(), null);
				}
				if (e.getButton()==3) {//点击右键
					//显示弹出式菜单
					pop.show(list2,e.getX(),e.getY());
				}
			}
			//同事分组
			if (e.getSource()==list3&&list3.getSelectedIndex()!=-1) {
				//从vecte中获取好友的用户对象
				frienduser=vect3.get(list3.getSelectedIndex());
				if (e.getButton()==1&&e.getClickCount()==2) {//双击
					openChat(frienduser.getQqnum(), null);
				}
				if (e.getButton()==3) {//点击右键
					//显示弹出式菜单
					pop.show(list3,e.getX(),e.getY());
				}
			}
			//黑名单
			if (e.getSource()==list4&&list4.getSelectedIndex()!=-1) {
				//从vecte中获取好友的用户对象
				frienduser=vect4.get(list4.getSelectedIndex());
				if (e.getButton()==1&&e.getClickCount()==2) {//双击
					openChat(frienduser.getQqnum(), null);
				}
				if (e.getButton()==3) {//点击右键
					//显示弹出式菜单
					pop.show(list4,e.getX(),e.getY());
				}
			}
			if (e.getSource()==touxiang) {
				new ziliao(user);
				
//				new QQUPdinof(user);
			}
			}
		//鼠标移入事件
		public void mouseEntered(MouseEvent e) {
			Point p = QQMaim.this.getLocationOnScreen();
			if (e.getSource()==cls) {
				
				cls.setIcon(new ImageIcon("image/downs.png"));
			}
			if (e.getSource()==xiao) {
				xiao.setIcon(new ImageIcon("image/min_over.PNG"));
			}
		
			if(p.y<=10){
				p.y = 0;
				QQMaim.this.setLocation(p);
			}
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource()==cls) {
//				System.out.println("-------");
				cls.setIcon(new ImageIcon(""));
			}
			if (e.getSource()==xiao) {
				xiao.setIcon(new ImageIcon(""));
			}
			
			Point p = QQMaim.this.getLocationOnScreen();
			if(p.y==0){
				p.y = -647;
				QQMaim.this.setLocation(p);
			}
		}
		}
	
//	//
//	class setLevels extends Thread{
//		@Override
//		public void run() {
//			if () {
//				
//			}
//		}
//	}
		
		
	//窗口拖动

	/** ******** */
	// 设置界面可以拖动的方法
	Point loc = null;
	Point tmp = null;
	boolean isDragged = false;

	private void setDragable() {
		this.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent e) {
				isDragged = false;
				QQMaim.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				
				Point p = QQMaim.this.getLocationOnScreen();
				if (p.y < 10) {
					p.y = -647;
					QQMaim.this.setLocation(p);
				}
			}

			public void mousePressed(java.awt.event.MouseEvent e) {
				tmp = new Point(e.getX(), e.getY());

				isDragged = true;
				QQMaim.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				if (isDragged) {
					loc = new Point(QQMaim.this.getLocation().x + e.getX()
							- tmp.x, QQMaim.this.getLocation().y + e.getY()
							- tmp.y);
					QQMaim.this.setLocation(loc);
				}
			}
		});
	}
}
