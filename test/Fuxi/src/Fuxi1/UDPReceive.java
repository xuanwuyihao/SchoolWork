package Fuxi1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceive {
	private void mian() {
		try {
			DatagramSocket ds=new DatagramSocket(6666);
//			String s="��ã����ն�";
			byte[] b=new byte[100];
			DatagramPacket dp=new DatagramPacket(b,b.length);
			ds.receive(dp);
			String str=new String(b,0,dp.getLength());
			System.out.println("���Ͷ�˵"+str);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
