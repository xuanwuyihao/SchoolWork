package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDome {
	public static void main(String[] args) {
		File f=new File("D:/Ѹ������/��������.mp4");
		//Ŀ���ļ�
		File fil=new File("D:/��������.mp4");
		try {
			FileInputStream fi=new FileInputStream(f);
			
			//�����������ļ�
			FileOutputStream fi1=new FileOutputStream(fil);
			byte[] b=new byte[1024*1024*10];
			int cont=0;
			System.out.println("��ʼ����....");
			while (fi.read(b)>=0) {
				cont++;
				System.out.println("��ǰ��ȡ��"+cont+"�Σ�");
				//���ֽ����������д���ļ�
				fi1.write(b);
			}
			System.out.println("������ϣ�");
			fi.close();
			fi1.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
