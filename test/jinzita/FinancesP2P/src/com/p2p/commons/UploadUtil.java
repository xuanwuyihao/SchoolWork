package com.p2p.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UploadUtil {

	
	public static Log log = LogFactory.getLog(UploadUtil.class);
	
	/**
	 * 上传文件公共方法
	 * @param file  文件
	 * @param source 路径
	 * @param fileName 文件名
	 * @throws IOException 
	 */
	public static void uploadByFile(File file,String source,String fileName) throws IOException {
		
		FileInputStream  inputStream = null;
		FileOutputStream outputStream = null;
		
		try {
			if(file.length()==0) {
			File file_s = new File(source, fileName);
			file_s.createNewFile();
			return ;
			
			} 
			inputStream = new FileInputStream(file);
			outputStream = new FileOutputStream(source + "/" + fileName);
			
			//读取字节流
			byte[] bt = new byte[1024];
			int real = inputStream.read(bt);
			while(real>0) {
				
				outputStream.write(bt,0,real);
				real = inputStream.read(bt);
			}
			
			}finally {
				
				outputStream.flush();
				inputStream.close();
				outputStream.close();
				
			}
			
	
		}
	
	/**
	 * 若有重复文件，删除已存在的文件
	 * @param source
	 * @param fileName
	 */
	public static void deleteFile(String parent,String fileName) {
		
		parent = parent.replace("/", File.separator);
		
		File f = new File(parent,fileName);
		
		if(f!=null&&f.exists()&&f.isFile()) {
			f.delete();
		}
	}
	
	
	/**
	 * 获取文件名后缀
	 * @param fileName
	 * @return
	 */
	public static String findFileNameExt(String fileName) {
		
		if(fileName==null || "".equals(fileName)) {
			return null;
		}
		return fileName.substring(fileName.lastIndexOf(".")+1);
	}
	
	
	/**
	 * 删除文件
	 * @param th 文件路径
	 * @param fileName 文件名
	 * @throws Exception 
	 */
	public static void removeFile(String parent, String fileName) {
		
		log.info(parent+fileName);
		File file = new File(parent,fileName);
		if(file!=null&&file.exists()&&file.isFile()) {	
			file.delete();
		}
	}
	
	
	
	
}
