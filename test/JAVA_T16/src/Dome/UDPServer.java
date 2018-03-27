package Dome;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
	//UDP协议没有客户服务器端概念，客服端可以独立运行
	//发送消息是无序的
	public static void main(String[] args) {
		System.out.println("这是接收端");
		try {
			DatagramSocket da=new DatagramSocket(6666);
			//创建通讯载体
			byte[] b=new byte[50];
			DatagramPacket dp=new DatagramPacket(b, b.length);
			//接收消息
			da.receive(dp);
			//将接收到的消息转换为字符串
			String text=new String(b,0,dp.getLength());
			System.out.println("客服说："+text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
