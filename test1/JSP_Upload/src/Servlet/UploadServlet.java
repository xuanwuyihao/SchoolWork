package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.File;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;


public class UploadServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		//得到上传对象
		SmartUpload su=new SmartUpload();
		//初始化
		su.initialize(getServletConfig(), request, response);
		
		//执行上传
		try {
			su.upload();
			su.save("/files");
		} catch (SmartUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//获取上传文件的名称----上传多个文件的情况下用这种
//		Enumeration en=su.getFiles().getEnumeration();
//		while(en.hasMoreElements()){
//			File file=(File)en.nextElement();
//			System.out.println("文件名称 "+file.getFileName()+" 文件大小 "+file.getSize());
//		}
		
		
		//上传单个的情况下
		String filename=su.getFiles().getFile(0).getFileName();
		System.out.println("图片名称："+filename);
		
		//有上传的情况系下 获取普通参数
		System.out.println("姓名："+su.getRequest().getParameter("uname"));
		
		request.setAttribute("filename", filename);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
