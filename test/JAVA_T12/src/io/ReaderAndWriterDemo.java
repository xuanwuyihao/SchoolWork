package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterDemo {
	public static void main(String[] args) {
		//字符流
		File f=new File("D:/dome/text.txt");
		
		try {
			FileReader f1=new FileReader(f);
			
			//1.使用字符数组输出
			char[] c=new char[100]; 
			int size=f1.read(c);
			String s=new String(c,0,size);
			System.out.println("内容："+s);
			
			//2,使用缓存流
			BufferedReader b=new BufferedReader(f1);
			//每读取一行
			String text=b.readLine();
			System.out.println(text);
			//使用字符输出流向文本中添加内容
			text+="添加内容";
			//得到字符输出流
			FileWriter fw =new FileWriter(f);
			//把字符串转换为char
			char[] c1=text.toCharArray();
			//将内容写入到文本中
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
