package io;

import java.io.File;
import java.io.IOException;

public class ioDome {
	public static void main(String[] args) {
		//һ���ַ���
		String str="D:/dome";
		//�����ļ�����
		File f=new File(str);
		
		//�ж��ļ��Ƿ����
		if (f.exists()) {//�ж��ļ��Ƿ����  ���ڷ���true �����ڷ���false
			System.out.println("�ļ����Ѵ���");
			File f1=new File("D:/dome/text.txt");
			if (f1.exists()) {//����ļ�����
				System.out.println("�ļ�����"+f1.getName());
				System.out.println("�ļ�·����"+f1.getPath());
				System.out.println("��ȡ�ļ���С��"+f1.length());
				System.out.println("�ļ��Ƿ�ɶ���"+f.canRead());
			}else {//��������ھʹ����ļ�
				try {
					f1.createNewFile();
					System.out.println("�ļ������ɹ���");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}else {//��������ھʹ����ļ���
			f.mkdir();
			System.out.println("�ļ������ɹ���");
		}
	}
}
