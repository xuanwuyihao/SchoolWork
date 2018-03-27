package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDome {
	public static void main(String[] args) {
		File f=new File("D:/迅雷下载/东京不热.mp4");
		//目标文件
		File fil=new File("D:/东京不热.mp4");
		try {
			FileInputStream fi=new FileInputStream(f);
			
			//用输出流输出文件
			FileOutputStream fi1=new FileOutputStream(fil);
			byte[] b=new byte[1024*1024*10];
			int cont=0;
			System.out.println("开始复制....");
			while (fi.read(b)>=0) {
				cont++;
				System.out.println("当前读取了"+cont+"次！");
				//将字节数组的内容写到文件
				fi1.write(b);
			}
			System.out.println("复制完毕！");
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
