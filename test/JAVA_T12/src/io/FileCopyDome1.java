package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDome1 {
	public static void main(String[] args) {
		String s="D:/迅雷下载/东京不热.mp4";
		//目标文件
		String s1="D:/dome/东京不热.mp4";
		
		try {
			FileInputStream f1=new FileInputStream(s);
			
			//使用输出文件接收
			FileOutputStream f2=new FileOutputStream(s1);
			byte[] b=new byte[1024*1024];
			int cont=0;
			System.out.println("正在拷贝！");
			while (f1.read(b)>=0) {
				cont++;
				System.out.println("拷贝了"+cont+"次！");
				f2.write(b);
			}
			System.out.println("拷贝完毕！");
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
