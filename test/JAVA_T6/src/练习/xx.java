package ��ϰ;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Color;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.Image;





public class xx extends Frame{
	
	
	private static final long serialVersionUID = 1L;
	public xx(){
		
		
		
		
		
		//super("QQ���룡");
		
		//ȡ������
		setLayout(null);
		
		//�˺ű�ǩ
		Label name=new Label("QQ:");
		//���ؼ���λ
		name.setBounds(120,100,40,20);
		
		//�˺��ı���
		TextField nametext=new TextField();
		//�ı���������ɫ
		nametext.setForeground(Color.blue);
		//���ı���λ
		nametext.setBounds(160,100,130,20);
		add(nametext);
		//��ӿؼ�������
		add(name);
		

		//�����ǩ
		Label name1=new Label("����:");
		//���ؼ���λ
		name1.setBounds(120,135,40,20);
		//�����ı���
		TextField name1text=new TextField();
		//�ı���������ɫ
		name1text.setForeground(Color.blue);
		//���ı���λ
		name1text.setBounds(160,135,130,20);
		add(name1text);
		//��ӿؼ�������
		add(name1);
		
		//�������
		Panel pa=new Panel();
		//�������Ĳ���Ϊ�߿�Ĳ���
		pa.setLayout(new BorderLayout());
		pa.setBounds(150,170,150,20);
		//��Ӱ�ť�������
		Button b1=new Button("��¼");
		Button b2=new Button("�˳�");
		//�Ѱ�ť���������
		pa.add(b1,BorderLayout.WEST);//����
		pa.add(b2,BorderLayout.EAST);//����
		add(pa);
		
		
		
	setSize(500,300);
	setBackground(Color.WHITE);
	setVisible(true);
	}
	public void Framel(Toolkit toolkit){
		Toolkit tookit=Toolkit.getDefaultToolkit();
		Image image=toolkit.getImage("src/Picture/yy.jpg");
		this.setIconImage(image);
		this.setSize(500,300);
		this.show();
	}
	public static void main(String[] args) {
		Login lo=new Login();
	}

	
	
}

