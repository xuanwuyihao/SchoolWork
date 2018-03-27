package 练习;

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
		
		
		
		
		
		//super("QQ登入！");
		
		//取消布局
		setLayout(null);
		
		//账号标签
		Label name=new Label("QQ:");
		//给控件定位
		name.setBounds(120,100,40,20);
		
		//账号文本框
		TextField nametext=new TextField();
		//文本框字体颜色
		nametext.setForeground(Color.blue);
		//给文本框定位
		nametext.setBounds(160,100,130,20);
		add(nametext);
		//添加控件到容器
		add(name);
		

		//密码标签
		Label name1=new Label("密码:");
		//给控件定位
		name1.setBounds(120,135,40,20);
		//密码文本框
		TextField name1text=new TextField();
		//文本框字体颜色
		name1text.setForeground(Color.blue);
		//给文本框定位
		name1text.setBounds(160,135,130,20);
		add(name1text);
		//添加控件到容器
		add(name1);
		
		//设置面板
		Panel pa=new Panel();
		//设置面板的布局为边框的布局
		pa.setLayout(new BorderLayout());
		pa.setBounds(150,170,150,20);
		//添加按钮在面板里
		Button b1=new Button("登录");
		Button b2=new Button("退出");
		//把按钮加在面板里
		pa.add(b1,BorderLayout.WEST);//西边
		pa.add(b2,BorderLayout.EAST);//东边
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

