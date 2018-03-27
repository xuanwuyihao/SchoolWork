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
		//�õ��ֽ����������
		ByteArrayOutputStream byt=new ByteArrayOutputStream();
		
		try {
			
			//���ֽ����� ת��Ϊ���������
			ObjectOutputStream oos=new ObjectOutputStream(byt);
			//����msg��
			oos.writeObject(msg);
			
			//�����������ת��Ϊ�ֽ�����
			byte[] b=byt.toByteArray();
			//UDP���Ͷ˿�
			//IP
			InetAddress inte=InetAddress.getByName(msg.getFUser().getIp());
			//�˿�
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
