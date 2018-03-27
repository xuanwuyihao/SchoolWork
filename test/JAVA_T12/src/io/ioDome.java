package io;

import java.io.File;
import java.io.IOException;

public class ioDome {
	public static void main(String[] args) {
		//一个字符串
		String str="D:/dome";
		//创建文件对象
		File f=new File(str);
		
		//判断文件是否存在
		if (f.exists()) {//判断文件是否存在  存在返回true 不存在返回false
			System.out.println("文件夹已存在");
			File f1=new File("D:/dome/text.txt");
			if (f1.exists()) {//如果文件存在
				System.out.println("文件名："+f1.getName());
				System.out.println("文件路径："+f1.getPath());
				System.out.println("获取文件大小："+f1.length());
				System.out.println("文件是否可读："+f.canRead());
			}else {//如果不存在就创建文件
				try {
					f1.createNewFile();
					System.out.println("文件创建成功！");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}else {//如果不存在就创建文件夹
			f.mkdir();
			System.out.println("文件创建成功！");
		}
	}
}
