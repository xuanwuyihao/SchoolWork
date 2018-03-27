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
		
		//�õ��ϴ�����
		SmartUpload su=new SmartUpload();
		//��ʼ��
		su.initialize(getServletConfig(), request, response);
		
		//ִ���ϴ�
		try {
			su.upload();
			su.save("/files");
		} catch (SmartUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//��ȡ�ϴ��ļ�������----�ϴ�����ļ��������������
//		Enumeration en=su.getFiles().getEnumeration();
//		while(en.hasMoreElements()){
//			File file=(File)en.nextElement();
//			System.out.println("�ļ����� "+file.getFileName()+" �ļ���С "+file.getSize());
//		}
		
		
		//�ϴ������������
		String filename=su.getFiles().getFile(0).getFileName();
		System.out.println("ͼƬ���ƣ�"+filename);
		
		//���ϴ������ϵ�� ��ȡ��ͨ����
		System.out.println("������"+su.getRequest().getParameter("uname"));
		
		request.setAttribute("filename", filename);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
