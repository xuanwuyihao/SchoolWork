package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDome {
	public static void main(String[] args) {
		//����������ȡ����
		File f=new File("D:/dome/text.txt");
		
		
		try {
			//�õ��ļ��ֽ���
			FileInputStream fi=new FileInputStream(f);
			//���ֽڽ���
			byte[] b=new byte[100];
			//�������������ݶ�ȡ��������
			int size=fi.read(b);
			//���ֽ�����ת�����ַ���
			String str=new String(b,0,size);
			System.out.println("�����ǣ�"+str);
			
			//�ر�������
			fi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
