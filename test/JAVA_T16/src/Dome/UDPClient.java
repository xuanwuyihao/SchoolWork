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
		System.out.println("���Ͷ�");
		try {
			//���Ͷ˵����ݱ��׽���
			DatagramSocket da=new DatagramSocket();
			//ͨѶ����
			String text="��ã�";
			byte[] b=new byte[50];
			//�ֽ����飬��С��IP��ַ��������󣬶˿�
			DatagramPacket dat= new DatagramPacket(b,b.length,InetAddress.getByName("127.0.0.1"),6666);
			//����ն� ��������
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
