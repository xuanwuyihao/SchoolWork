package Face;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Centerpanel extends JPanel{
	//等级
	int level=1;
	//存放地图
	int[][] map = new int[20][20];
	//定义方向
	int UP=1;//上
	int DOWN=2;//下
	int RIGHT=3;//右
	int LEFT=4;//左
	
	int direction=DOWN;//方向默认为下
	//记录人的位置
	int RENI,RENJ;
	//记录人前一格的坐标
	int QIANI,QIANJ;
	//记录人前两格的坐标
	int QIAN2I,QIAN2J;
	
	int REN=5;//定义人
	
	int CAO=2;//草地
	int MUDIDI=4;//目的地
	int XIANGZI=3;//黄色箱子
	int XIANGZI_MUDIDI=9;//箱子和目的地重合
	
	//原始地图
	int yuanshi_map[][];
	
	//堆栈
	Stack<Step> steps=new Stack<Step>();//用堆栈保存操作步骤
	
	
	//存放图片
	Image[] images={new ImageIcon("Image/0.gif").getImage(),
			new ImageIcon("Image/1.gif").getImage(),
			new ImageIcon("Image/2.gif").getImage(),
			new ImageIcon("Image/3.gif").getImage(),
			new ImageIcon("Image/4.gif").getImage(),
			new ImageIcon("Image/5.gif").getImage(),
			new ImageIcon("Image/6.gif").getImage(),
			new ImageIcon("Image/7.gif").getImage(),
			new ImageIcon("Image/8.gif").getImage(),
			new ImageIcon("Image/9.gif").getImage()};
	public Centerpanel(){
		//调用初始化方法
		initgame();
		
		//给面板添加监听
		this.addKeyListener(new KeyListener());
		
	}
	//初始化游戏
	public void initgame(){
		//关卡重置是人的方向向下
		this.direction=DOWN;
		//根据当前等级获取地图
		map=DiTu.getMap(level);
		
		//根据当前等级获取原始地图
		yuanshi_map=DiTu.getMap(level);
	}
	
	//设置关卡
	public void setlevel(int level){
		this.level=level;//保存关卡
		initgame();//初始化游戏
		this.repaint();//重新绘制地图
		
	}
	
	//步骤类
	class Step{
		public int map_date[][]=new int[20][20];//地图数据
		public int fangxing;//人物方向
	}
	
	//记录步骤方法
	public void JLstep(){
		//得到步骤对象记录当前数据
		Step s=new Step();
		
		//数据不可整体赋值
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				s.map_date[i][j]=map[i][j];//传值
			}
		}
		s.fangxing=this.direction;//当前方向
		//将当前数据保存到堆栈中
		steps.push(s);
	}
	
	//悔一步
	public void huiyibu(){
		//先判断堆栈中是否有数据
		if (steps.isEmpty()) {
			JOptionPane.showMessageDialog(null, "没有步骤可以悔了");
			this.requestFocus();//获取焦点
			return;
		}
		//从堆栈中取出一个数据
		Step s=steps.pop();
		//把地图中的步骤赋给当前地图
		//this.map=s.map_date;
		for (int  i= 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				map[i][j] = s.map_date[i][j];
			}
		}
		//把地图中的当前方向赋给当前方向
		this.direction=s.fangxing;
		//重新绘制地图
		repaint();
		
	}
	
	//判断是否过关
	public boolean isWin(){
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if(map[i][j]==XIANGZI){//如果有黄箱子
					return false;
				}
			}
		}
		return true;//表示没有黄箱子
	}
	
	//给中间面板添加按键监听
	class KeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			JLstep();
			//记录用户的按键
			int keycode=e.getKeyCode();
			if (keycode==e.VK_UP) {//上
				direction=UP;
			}else if (keycode==e.VK_DOWN) {//下
				direction=DOWN;
			}else if (keycode==e.VK_RIGHT) {//右
				direction=RIGHT;
			}else if (keycode==e.VK_LEFT) {//下
				direction=LEFT;
			}
			//得到人前一格和前两格的位置
			gethanglie();
			
			//调用移动方法
			move();
			
			//重新绘制地图
			Centerpanel.this.repaint();
			
			//判断是否通关
			boolean ber=isWin();
			if (ber) {
				if (level<11) {
					JOptionPane.showConfirmDialog(null, "恭喜过关！");
					level+=1;
					setlevel(level);//设置关卡
				}else{
					JOptionPane.showConfirmDialog(null, "恭喜通关！");
				}
				
			}
		}
	}
	//移动方法
	public void move(){
		//判断人的前一格是草地还是目的地
		if (map[QIANI][QIANJ]==CAO||map[QIANI][QIANJ]==MUDIDI) {
			
			//人走之后的一格变成什么
			int value=yanshi(RENI,RENJ);
			map[RENI][RENJ]=value;
			map[QIANI][QIANJ]=REN;//把人的前一格设置为人
		}else if (map[QIANI][QIANJ]==XIANGZI||map[QIANI][QIANJ]==XIANGZI_MUDIDI) {
			//如果人的前一格是箱子或者是红色箱子
			//那么要判断人的前两格是什么
			if (map[QIAN2I][QIAN2J]==CAO) {//如果前两格是草地
				int value=yanshi(RENI,RENJ);
				map[RENI][RENJ]=value;
				//让箱子的位置变成人
				map[QIANI][QIANJ]=REN;
				//让前两格变成箱子
				map[QIAN2I][QIAN2J]=XIANGZI;
			}else if (map[QIAN2I][QIAN2J]==MUDIDI) {//如果箱子的前一格是目的地
				int value=yanshi(RENI,RENJ);
				map[RENI][RENJ]=value;
				//让箱子位置变成人
				map[QIANI][QIANJ]=REN;
				
				//让目的地变成红箱子
				map[QIAN2I][QIAN2J]=XIANGZI_MUDIDI;
				
				
			}
		}
	}
	public int yanshi(int i,int j){
		//根据人的位置获取原来一格是什么
		int value=yuanshi_map[i][j];
		if (value==REN||value==XIANGZI) {
			value=CAO;
		}else if (value==XIANGZI_MUDIDI) {
			value=MUDIDI;
		}
		return value;
	}
	
	//获得人的前一格和前两格的位置
	public void gethanglie(){
		//找到人的位置
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if(map[i][j]==REN){
					RENI=i;
					RENJ=j;
				}
			}
		}
		//根据方向得到人的行和列
		if (direction==UP) {//如果往上走
					QIANI=RENI-1;
					QIANJ=RENJ;
			
					QIAN2I=RENI-2;
					QIAN2J=RENJ;
		}else if (direction==DOWN) {//如果向下走
			QIANI=RENI+1;
			QIANJ=RENJ;
			
			QIAN2I=RENI+2;
			QIAN2J=RENJ;
		}else if (direction==RIGHT) {//如果向右走
			QIANI=RENI;
			QIANJ=RENJ+1;
			
			QIAN2I=RENI;
			QIAN2J=RENJ+2;
		}else if (direction==LEFT) {//如果向左走
			QIANI=RENI;
			QIANJ=RENJ-1;
			
			QIAN2I=RENI;
			QIAN2J=RENJ-2;
		}
		
		
	}
	//画地图界面
	@Override
	public void paint(Graphics g) {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				//去除二维数组中每一个地图的信息
				int zhi=map[i][j];
				//System.out.println(zhi);
				//离上边距离
				int top=i*30;
				//离左边距离
				int left=j*30;
				if (zhi==REN) {
					if (direction==UP) {
						zhi=8;
					}else if (direction==DOWN) {
						zhi=5;
					}else if (direction==RIGHT) {
						zhi=7;
					}else if (direction==LEFT) {
						zhi=6;
					}
					
				}
				//打印图片(图片对象,离左边距离,离上边距离,显示的组件)
				g.drawImage(images[zhi], left, top, this);
			}
			
		}
		//中间面板获取焦点
		this.requestFocus();
	}

}
