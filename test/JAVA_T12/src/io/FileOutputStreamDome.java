package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDome {
	public static void main(String[] args) {
		File f=new File("D:/dome");
		String str="花开花落时！";
		
		try {
			FileInputStream fi=new FileInputStream(f);
			byte[] b=new byte[100];
			int size=fi.read(b);
			String s=new String(b,0,size);
			
			//把新的内容拼进去
			str=s+str;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//得到文件的输出流
		try {
			FileOutputStream fi1=new FileOutputStream(f);
			//将字符串转换为字节
			byte[] b1=new byte[100];
			//向文件中添加内容
			fi1.write(b1);
			System.out.println("成功插入数据！");
			
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
