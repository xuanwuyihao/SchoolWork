package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDome {
	public static void main(String[] args) {
		//用输入流读取内容
		File f=new File("D:/dome/text.txt");
		
		
		try {
			//得到文件字节流
			FileInputStream fi=new FileInputStream(f);
			//用字节接收
			byte[] b=new byte[100];
			//将输入流的内容读取到数组中
			int size=fi.read(b);
			//将字节数组转换成字符串
			String str=new String(b,0,size);
			System.out.println("内容是："+str);
			
			//关闭输入流
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
