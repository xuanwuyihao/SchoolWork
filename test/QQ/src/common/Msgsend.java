package common;



import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import bean.QQMsg;


public class Msgsend {
	public Msgsend(QQMsg msg){
		//得到字节数组输出流
		ByteArrayOutputStream byt=new ByteArrayOutputStream();
		
		try {
			
			//将字节数组 转换为对象流输出
			ObjectOutputStream oos=new ObjectOutputStream(byt);
			//传送msg类
			oos.writeObject(msg);
			
			//将对象输出流转换为字节数组
			byte[] b=byt.toByteArray();
			//UDP发送端口
			//IP
			InetAddress inte=InetAddress.getByName(msg.getFUser().getIp());
			//端口
			int port=Integer.parseInt(msg.getFUser().getPort());
			DatagramSocket ds=new DatagramSocket();
			
			DatagramPacket dp=new DatagramPacket(b,0,b.length,inte,port);
			ds.send(dp);
			ds.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
