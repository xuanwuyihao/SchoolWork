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
	//�ȼ�
	int level=1;
	//��ŵ�ͼ
	int[][] map = new int[20][20];
	//���巽��
	int UP=1;//��
	int DOWN=2;//��
	int RIGHT=3;//��
	int LEFT=4;//��
	
	int direction=DOWN;//����Ĭ��Ϊ��
	//��¼�˵�λ��
	int RENI,RENJ;
	//��¼��ǰһ�������
	int QIANI,QIANJ;
	//��¼��ǰ���������
	int QIAN2I,QIAN2J;
	
	int REN=5;//������
	
	int CAO=2;//�ݵ�
	int MUDIDI=4;//Ŀ�ĵ�
	int XIANGZI=3;//��ɫ����
	int XIANGZI_MUDIDI=9;//���Ӻ�Ŀ�ĵ��غ�
	
	//ԭʼ��ͼ
	int yuanshi_map[][];
	
	//��ջ
	Stack<Step> steps=new Stack<Step>();//�ö�ջ�����������
	
	
	//���ͼƬ
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
		//���ó�ʼ������
		initgame();
		
		//�������Ӽ���
		this.addKeyListener(new KeyListener());
		
	}
	//��ʼ����Ϸ
	public void initgame(){
		//�ؿ��������˵ķ�������
		this.direction=DOWN;
		//���ݵ�ǰ�ȼ���ȡ��ͼ
		map=DiTu.getMap(level);
		
		//���ݵ�ǰ�ȼ���ȡԭʼ��ͼ
		yuanshi_map=DiTu.getMap(level);
	}
	
	//���ùؿ�
	public void setlevel(int level){
		this.level=level;//����ؿ�
		initgame();//��ʼ����Ϸ
		this.repaint();//���»��Ƶ�ͼ
		
	}
	
	//������
	class Step{
		public int map_date[][]=new int[20][20];//��ͼ����
		public int fangxing;//���﷽��
	}
	
	//��¼���跽��
	public void JLstep(){
		//�õ���������¼��ǰ����
		Step s=new Step();
		
		//���ݲ������帳ֵ
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				s.map_date[i][j]=map[i][j];//��ֵ
			}
		}
		s.fangxing=this.direction;//��ǰ����
		//����ǰ���ݱ��浽��ջ��
		steps.push(s);
	}
	
	//��һ��
	public void huiyibu(){
		//���ж϶�ջ���Ƿ�������
		if (steps.isEmpty()) {
			JOptionPane.showMessageDialog(null, "û�в�����Ի���");
			this.requestFocus();//��ȡ����
			return;
		}
		//�Ӷ�ջ��ȡ��һ������
		Step s=steps.pop();
		//�ѵ�ͼ�еĲ��踳����ǰ��ͼ
		//this.map=s.map_date;
		for (int  i= 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				map[i][j] = s.map_date[i][j];
			}
		}
		//�ѵ�ͼ�еĵ�ǰ���򸳸���ǰ����
		this.direction=s.fangxing;
		//���»��Ƶ�ͼ
		repaint();
		
	}
	
	//�ж��Ƿ����
	public boolean isWin(){
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if(map[i][j]==XIANGZI){//����л�����
					return false;
				}
			}
		}
		return true;//��ʾû�л�����
	}
	
	//���м������Ӱ�������
	class KeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			JLstep();
			//��¼�û��İ���
			int keycode=e.getKeyCode();
			if (keycode==e.VK_UP) {//��
				direction=UP;
			}else if (keycode==e.VK_DOWN) {//��
				direction=DOWN;
			}else if (keycode==e.VK_RIGHT) {//��
				direction=RIGHT;
			}else if (keycode==e.VK_LEFT) {//��
				direction=LEFT;
			}
			//�õ���ǰһ���ǰ�����λ��
			gethanglie();
			
			//�����ƶ�����
			move();
			
			//���»��Ƶ�ͼ
			Centerpanel.this.repaint();
			
			//�ж��Ƿ�ͨ��
			boolean ber=isWin();
			if (ber) {
				if (level<11) {
					JOptionPane.showConfirmDialog(null, "��ϲ���أ�");
					level+=1;
					setlevel(level);//���ùؿ�
				}else{
					JOptionPane.showConfirmDialog(null, "��ϲͨ�أ�");
				}
				
			}
		}
	}
	//�ƶ�����
	public void move(){
		//�ж��˵�ǰһ���ǲݵػ���Ŀ�ĵ�
		if (map[QIANI][QIANJ]==CAO||map[QIANI][QIANJ]==MUDIDI) {
			
			//����֮���һ����ʲô
			int value=yanshi(RENI,RENJ);
			map[RENI][RENJ]=value;
			map[QIANI][QIANJ]=REN;//���˵�ǰһ������Ϊ��
		}else if (map[QIANI][QIANJ]==XIANGZI||map[QIANI][QIANJ]==XIANGZI_MUDIDI) {
			//����˵�ǰһ�������ӻ����Ǻ�ɫ����
			//��ôҪ�ж��˵�ǰ������ʲô
			if (map[QIAN2I][QIAN2J]==CAO) {//���ǰ�����ǲݵ�
				int value=yanshi(RENI,RENJ);
				map[RENI][RENJ]=value;
				//�����ӵ�λ�ñ����
				map[QIANI][QIANJ]=REN;
				//��ǰ����������
				map[QIAN2I][QIAN2J]=XIANGZI;
			}else if (map[QIAN2I][QIAN2J]==MUDIDI) {//������ӵ�ǰһ����Ŀ�ĵ�
				int value=yanshi(RENI,RENJ);
				map[RENI][RENJ]=value;
				//������λ�ñ����
				map[QIANI][QIANJ]=REN;
				
				//��Ŀ�ĵر�ɺ�����
				map[QIAN2I][QIAN2J]=XIANGZI_MUDIDI;
				
				
			}
		}
	}
	public int yanshi(int i,int j){
		//�����˵�λ�û�ȡԭ��һ����ʲô
		int value=yuanshi_map[i][j];
		if (value==REN||value==XIANGZI) {
			value=CAO;
		}else if (value==XIANGZI_MUDIDI) {
			value=MUDIDI;
		}
		return value;
	}
	
	//����˵�ǰһ���ǰ�����λ��
	public void gethanglie(){
		//�ҵ��˵�λ��
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if(map[i][j]==REN){
					RENI=i;
					RENJ=j;
				}
			}
		}
		//���ݷ���õ��˵��к���
		if (direction==UP) {//���������
					QIANI=RENI-1;
					QIANJ=RENJ;
			
					QIAN2I=RENI-2;
					QIAN2J=RENJ;
		}else if (direction==DOWN) {//���������
			QIANI=RENI+1;
			QIANJ=RENJ;
			
			QIAN2I=RENI+2;
			QIAN2J=RENJ;
		}else if (direction==RIGHT) {//���������
			QIANI=RENI;
			QIANJ=RENJ+1;
			
			QIAN2I=RENI;
			QIAN2J=RENJ+2;
		}else if (direction==LEFT) {//���������
			QIANI=RENI;
			QIANJ=RENJ-1;
			
			QIAN2I=RENI;
			QIAN2J=RENJ-2;
		}
		
		
	}
	//����ͼ����
	@Override
	public void paint(Graphics g) {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				//ȥ����ά������ÿһ����ͼ����Ϣ
				int zhi=map[i][j];
				//System.out.println(zhi);
				//���ϱ߾���
				int top=i*30;
				//����߾���
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
				//��ӡͼƬ(ͼƬ����,����߾���,���ϱ߾���,��ʾ�����)
				g.drawImage(images[zhi], left, top, this);
			}
			
		}
		//�м�����ȡ����
		this.requestFocus();
	}

}
