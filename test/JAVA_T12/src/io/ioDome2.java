package io;

import java.io.File;

public class ioDome2 {
	public static void main(String[] args) {
		//得到一个路径下的所有文件夹和问见的名称
		File f=new File("E:/迅雷下载");
		
		String[] str=f.list();//返回文件中所有目录及文件名
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
			File f1=new File("E:/迅雷下载"+str[i]);
			if (f1.isDirectory()) {//判断是不是文件夹，是文件夹就遍历文件夹里的所有文件
				String[] s=f1.list();
				for (String s1:s) {
					System.out.println("---"+s1);
				}
			}
		}
		//通过路径得到文件数组
		File[] f1=f.listFiles();
		for (int i = 0; i < f1.length; i++) {
			File f2=f1[i];
			System.out.println("   "+f2.getName());
		}
	}
}
