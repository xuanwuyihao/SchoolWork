package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDome {
	public static void main(String[] args) {
		File f=new File("D:/dome");
		String str="��������ʱ��";
		
		try {
			FileInputStream fi=new FileInputStream(f);
			byte[] b=new byte[100];
			int size=fi.read(b);
			String s=new String(b,0,size);
			
			//���µ�����ƴ��ȥ
			str=s+str;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�õ��ļ��������
		try {
			FileOutputStream fi1=new FileOutputStream(f);
			//���ַ���ת��Ϊ�ֽ�
			byte[] b1=new byte[100];
			//���ļ����������
			fi1.write(b1);
			System.out.println("�ɹ��������ݣ�");
			
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
