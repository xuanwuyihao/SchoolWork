package Dome;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
	//UDPЭ��û�пͻ��������˸���ͷ��˿��Զ�������
	//������Ϣ�������
	public static void main(String[] args) {
		System.out.println("���ǽ��ն�");
		try {
			DatagramSocket da=new DatagramSocket(6666);
			//����ͨѶ����
			byte[] b=new byte[50];
			DatagramPacket dp=new DatagramPacket(b, b.length);
			//������Ϣ
			da.receive(dp);
			//�����յ�����Ϣת��Ϊ�ַ���
			String text=new String(b,0,dp.getLength());
			System.out.println("�ͷ�˵��"+text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
