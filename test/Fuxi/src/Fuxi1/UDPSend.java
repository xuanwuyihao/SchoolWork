package Fuxi1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import sun.beans.editors.IntEditor;

public class UDPSend {
	public static void main(String[] args) {
		try {
			DatagramSocket ds=new DatagramSocket();
			String s="ƒ„∫√£°Ω” ’∂À";
			byte[] b=s.getBytes();
			DatagramPacket dp=new DatagramPacket(b,b.length,InetAddress.getByName("127.0.0.1"),6666);
			ds.send(dp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
