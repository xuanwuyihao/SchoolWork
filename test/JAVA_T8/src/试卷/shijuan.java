package �Ծ�;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.TextAction;

public class shijuan extends java.awt.Frame implements ActionListener{
	TextField t,t1,t2;
	Button b,b1;
	
	public shijuan(){
		super("�Ծ�");
		setLayout(null);
		//���ñ�ǩ
		Label la=new Label("�û�ע��");
		Font f=new Font("����",Font.BOLD,30);
		la.setBounds(130, 40, 200, 30);
		la.setFont(f);
		add(la);
		
		//���ñ�ǩ
		Label la1=new Label("�û���:");
		Font f1=new Font("����",Font.BOLD,15);
		la1.setBounds(50, 90, 60, 30);
		la1.setFont(f1);
		add(la1);
		t=new TextField();
		Font f2=new Font("����",Font.BOLD,15);
		t.setFont(f2);
		t.setBounds(150, 90, 200, 25);
		add(t);
		
		//���������ǩ
		Label la2=new Label("����:");
		la2.setBounds(50, 130, 60, 30);
		Font f3=new Font("����",Font.BOLD,15);
		la2.setFont(f3);
		add(la2);
		
		t1=new TextField();
		Font f4=new Font("����",Font.BOLD,15);
		t1.setFont(f4);
		t1.setBounds(150, 130, 200, 25);
		add(t1);
		
		//���������ǩ
		Label la3=new Label("ȷ������:");
		la3.setBounds(50, 170, 80, 30);
		Font f5=new Font("����",Font.BOLD,15);
		la3.setFont(f5);
		add(la3);
		
		t2=new TextField();
		Font f6=new Font("����",Font.BOLD,15);
		t2.setFont(f6);
		t2.setBounds(150, 170, 200, 25);
		add(t2);
		
		//���������ǩ
		Label la4=new Label("����:");
		la4.setBounds(50, 210, 80, 30);
		Font f7=new Font("����",Font.BOLD,15);
		la4.setFont(f7);
		add(la4);
		
		//���������
		Choice c=new Choice();
		c.setBounds(150, 210, 70, 25);
		for (int i = 18; i <= 40; i++) {
			c.add(i+"");
		}
		add(c);
		//TextField t3=new TextField();
		//Font f8=new Font("����",Font.BOLD,15);
		//t3.setFont(f8);
		//t3.setBounds(150, 210, 200, 25);
		//add(t3);
		
		//���������ǩ
		Label la5=new Label("����:");
		la5.setBounds(50, 250, 80, 30);
		Font f9=new Font("����",Font.BOLD,15);
		la5.setFont(f9);
		add(la5);
		
		TextField t4=new TextField();
		Font f10=new Font("����",Font.BOLD,15);
		t4.setFont(f10);
		t4.setBounds(150, 250, 200, 25);
		add(t4);
		
		//�������֤��ǩ
		Label la6=new Label("���֤:");
		la6.setBounds(50, 290, 80, 30);
		Font f11=new Font("����",Font.BOLD,15);
		la6.setFont(f11);
		add(la6);
		
		TextField t5=new TextField();
		Font f12=new Font("����",Font.BOLD,15);
		t5.setFont(f12);
		t5.setBounds(150, 290, 200, 25);
		add(t5);
		
		
		//���ð�ȫ���ǩ
		Label la7=new Label("��ȫ��:");
		la7.setBounds(50, 330, 80, 30);
		Font f13=new Font("����",Font.BOLD,15);
		la7.setFont(f13);
		add(la7);
		
		TextField t6=new TextField();
		Font f14=new Font("����",Font.BOLD,15);
		t6.setFont(f14);
		t6.setBounds(150, 330, 90, 25);
		add(t6);
		
		//�ڰ�ť�м����ͼƬ
		Toolkit t=Toolkit.getDefaultToolkit();
		Image img=t.createImage("MYImage/5b692ea7ad0817ed1083675fda5b9e20.jpg");
		setIconImage(img);
		ImageIcon image=new ImageIcon("MYImage/2190.gif");
		JLabel jl=new JLabel(image);
		jl.setBounds(50, 370, 310, 130);
		add(jl);
		
		
		
		//��Ӱ�ť
		b=new Button("ȷ��");
		Font f15=new Font("����",Font.BOLD,15);
		b.setFont(f15);
		b.setBounds(90, 520, 60, 40);
		b.addActionListener(this);
		add(b);
		
		b1=new Button("ȡ��");
		Font f16=new Font("����",Font.BOLD,15);
		b1.setFont(f16);
		b1.setBounds(260, 520, 60, 40);
		b1.addActionListener(this);
		add(b1);
		
		
		
		addWindowListener(new WindowCloss());
		setSize(400,600);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new shijuan();
	}
	class WindowCloss extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	}
	//��ť�¼�
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//��ȡ��ť����
		if (e.getSource()==b) {//ȷ��
			System.out.print("������ȷ��");
			//�����Ի���
			//JOptionPane.showConfirmDialog(this, "������ȷ��");
		}else if(e.getSource()==b1){
			System.out.print("����ȡ��");
			System.exit(0);
		}
	}
	
	//��Ӱ�������
	class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getSource()==t) {
				//���ܰ���ֵ
				if (!((e.getKeyChar()>='a' && e.getKeyChar()<='z')||
						(e.getKeyChar()>='0'&&e.getKeyChar()<='9'))) {
					JOptionPane.showConfirmDialog(null, "�û������������ֺ�Сд��ĸ��");
					e.consume();//ȡ�����ΰ���
					
				}
				
			}
		}
	}
}
