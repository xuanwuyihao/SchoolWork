package io;

import java.io.File;

public class ioDome2 {
	public static void main(String[] args) {
		//�õ�һ��·���µ������ļ��к��ʼ�������
		File f=new File("E:/Ѹ������");
		
		String[] str=f.list();//�����ļ�������Ŀ¼���ļ���
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
			File f1=new File("E:/Ѹ������"+str[i]);
			if (f1.isDirectory()) {//�ж��ǲ����ļ��У����ļ��оͱ����ļ�����������ļ�
				String[] s=f1.list();
				for (String s1:s) {
					System.out.println("---"+s1);
				}
			}
		}
		//ͨ��·���õ��ļ�����
		File[] f1=f.listFiles();
		for (int i = 0; i < f1.length; i++) {
			File f2=f1[i];
			System.out.println("   "+f2.getName());
		}
	}
}
