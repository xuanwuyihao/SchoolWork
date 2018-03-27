package Dome;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient {
	public static void main(String[] args) {
		System.out.println("发送端");
		try {
			//发送端的数据报套接字
			DatagramSocket da=new DatagramSocket();
			//通讯载体
			String text="你好！";
			byte[] b=new byte[50];
			//字节数组，大小，IP地址的网络对象，端口
			DatagramPacket dat= new DatagramPacket(b,b.length,InetAddress.getByName("127.0.0.1"),6666);
			//想接收端 发送数据
			da.send(dat);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
}
