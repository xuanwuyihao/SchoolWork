package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterDemo {
	public static void main(String[] args) {
		//�ַ���
		File f=new File("D:/dome/text.txt");
		
		try {
			FileReader f1=new FileReader(f);
			
			//1.ʹ���ַ��������
			char[] c=new char[100]; 
			int size=f1.read(c);
			String s=new String(c,0,size);
			System.out.println("���ݣ�"+s);
			
			//2,ʹ�û�����
			BufferedReader b=new BufferedReader(f1);
			//ÿ��ȡһ��
			String text=b.readLine();
			System.out.println(text);
			//ʹ���ַ���������ı����������
			text+="�������";
			//�õ��ַ������
			FileWriter fw =new FileWriter(f);
			//���ַ���ת��Ϊchar
			char[] c1=text.toCharArray();
			//������д�뵽�ı���
			fw.write(c1);
			System.out.println(text);
			
			fw.close();
			b.close();
			f1.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
