package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDome1 {
	public static void main(String[] args) {
		String s="D:/Ѹ������/��������.mp4";
		//Ŀ���ļ�
		String s1="D:/dome/��������.mp4";
		
		try {
			FileInputStream f1=new FileInputStream(s);
			
			//ʹ������ļ�����
			FileOutputStream f2=new FileOutputStream(s1);
			byte[] b=new byte[1024*1024];
			int cont=0;
			System.out.println("���ڿ�����");
			while (f1.read(b)>=0) {
				cont++;
				System.out.println("������"+cont+"�Σ�");
				f2.write(b);
			}
			System.out.println("������ϣ�");
			f1.close();
			f2.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
