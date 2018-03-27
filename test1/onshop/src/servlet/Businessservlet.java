package servlet;

import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;

import com.jspsmart.upload.File;
import com.jspsmart.upload.Files;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

import bean.Businessbean;
import bean.Order;
import bean.Product;
import bean.Yzm;

import service.Businessservice;
import serviceImpl.BusinessImpl;

public class Businessservlet extends HttpServlet {
	
	Businessservice bus=new BusinessImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//������������
		String method=request.getParameter("method");
		
		if("blogin".equals(method)){
			String bacc=request.getParameter("bacc");
	
			String bpwd=request.getParameter("bpwd");
			Businessbean bsin=new Businessbean();
			bsin.setBacc(bacc);
			bsin.setBpwd(bpwd);
			Businessbean b=bus.businesslogin(bsin);			
			if(b!=null){
				//���û����󱣴浽session
				HttpSession session=request.getSession();
				session.setAttribute("bsin", b);
				//��ȡ�û��˺�
				System.out.println();
				
				response.sendRedirect("bcenter.jsp");
			}else{//��¼ʧ��
				request.setAttribute("msg","�˺Ż���������" );
				request.getRequestDispatcher("business/blogin.jsp").forward(request, response);
			}
		}else if("loginout".equals(method)){
			HttpSession session=request.getSession();
			session.removeAttribute("bsin");
			response.sendRedirect("index.jsp");
		}else if("bzhuce".equals(method)){
			//��ȡҳ�����
			Businessbean business=new Businessbean();
			business.setBacc(request.getParameter("bacc"));
			business.setBpwd(request.getParameter("bpwd"));
			business.setBtel(request.getParameter("btel"));
			business.setBdate(new Date().toLocaleString());
			
			boolean b=bus.bzhce(business);
			if(b){
				response.sendRedirect("homepage.jsp");
			}else {
				request.setAttribute("msg", "ע��ʧ�ܣ�");
				request.getRequestDispatcher("bzhuce.jsp").forward(request, response);
			}
			
			
		}else if("updbusiness".equals(method)){//�޸�1
			
			Businessbean b=new Businessbean();
			b.setBid(Integer.parseInt(request.getParameter("bid")));
			b.setBacc(request.getParameter("bacc"));
			b.setBtel(request.getParameter("btel"));
			b.setBname(request.getParameter("bname"));
			b.setBwifi(Integer.parseInt(request.getParameter("bwifi")));
			b.setBpark(Integer.parseInt(request.getParameter("bpark")));
			
			bus.updbusiness(b);
			HttpSession session=request.getSession();
			session.setAttribute("bsin", b);
				response.sendRedirect("business/bbasic.jsp");			
			
		}else if("updpwd".equals(method)){
			Businessbean b=new Businessbean();
			b.setBid(Integer.parseInt(request.getParameter("bid")));
			b.setBpwd(request.getParameter("bpwds"));
			int x=Integer.parseInt(request.getParameter("bpwd1"));
			int y=Integer.parseInt(request.getParameter("bpwd"));
			
			if(x!=y){
				request.setAttribute("msg", "ԭ��������");
				request.getRequestDispatcher("business/changepwd.jsp").forward(request, response);
			}else{
				
				bus.updpwd(b);
			
			}
			
			
		}else if("businessmsg".equals(method)){
			//�õ��ϴ�����
			SmartUpload su=new SmartUpload();
			//��ʼ��
			su.initialize(getServletConfig(),request,response);
			
			//ִ���ϴ�
			try {
				su.upload();
				su.save("/files");
				
			} catch (SmartUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Businessbean b=new Businessbean();
			b.setBcard(su.getRequest().getParameter("bcard"));
			b.setBadrr(su.getRequest().getParameter("badrr"));
			
			
			//����ҳ������file����
			Files files=su.getFiles();
			
			String filename1=files.getFile(0).getFileName();
			
			if("prodadd".equals(filename1)){//û���ϴ���ͼƬ
				b.setByyzz(su.getRequest().getParameter("byyzz"));//��ȡ�����������
				
			}else{
				filename1=getimagname(filename1);
				b.setByyzz("files/"+filename1);
				
				try {
					files.getFile(0).saveAs("files/"+filename1);
					
				} catch (SmartUploadException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			String filename2 = files.getFile(1).getFileName();
			if ("".equals(filename2)) {

				b.setBzlht(su.getRequest().getParameter("bzlht"));
			} else {
				filename2 = getimagname(filename2);// �Ѿ����ƴ���ȥ ����������
				b.setBzlht("files/" + filename2);
				try {
					files.getFile(1).saveAs("files/" + filename2);// ���±���һ��
				} catch (SmartUploadException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			b.setBid(Integer.parseInt(su.getRequest().getParameter("bid")));
			b.setByyzz(filename1);
			b.setBzlht(filename2);
			
			boolean bln=bus.upyyzz(b);
			if(bln){
				request.setAttribute("msg", "����ɹ���");
				HttpSession session=request.getSession();
				
				session.setAttribute("bu",b);
			}else{
				request.setAttribute("msg", "����ʧ�ܣ�");
			}
			System.out.println("........");
			request.getRequestDispatcher("bcenter.jsp").forward(request, response);
			
		}else if("commodity".equals(method)){
			
			String spid=request.getParameter("pid");
			
			//��ѯ��Ʒ��Ϣ
			System.out.println(spid);
			Product prod=bus.selcommodity(Integer.parseInt(spid));
			request.setAttribute("prod", prod);
			
			
			//�鿴��Ʒͼ����Ϣ
			List list=bus.selimgs(Integer.parseInt(spid));
			request.setAttribute("imglist", list);
			
			//�鿴������Ϣ
			Businessbean b=bus.selbusiness(prod.getBid());
			System.out.println(b);
			request.setAttribute("b", b);
			
			request.getRequestDispatcher("business/commodity.jsp").forward(request, response);
			
		}else if ("commodity1".equals(method)) {// ��̨�Ź���Ϣ�б�
			
			HttpSession session = request.getSession();
			Businessbean bu = (Businessbean) session.getAttribute("bsin");
			
			System.out.println("�̼�id"+bu.getBid());
			List list = bus.selprodlistbybid(bu.getBid());//
			
			System.out.println("list��С"+list.size());
			
			for (int i = 0; i < list.size(); i++) {
				Product p = (Product) list.get(i);
				// �����Ź�IDȥ��ѯ һ��ͼƬ
				String img = bus.selimg(p.getPid());
				p.setBdesc(img);// �����Ź�˵���ֶ� �洢ͼƬ

			}
			request.setAttribute("list", list);
			request.getRequestDispatcher("business/commodity.jsp").forward(
					request, response);
		}else if("prodadd".equals(method)){
			
			SmartUpload su=new SmartUpload();
			su.initialize(getServletConfig(),request,response);
			
			try {
				su.upload();
				su.save("/files");
				
			} catch (SmartUploadException e) {
				e.printStackTrace();
			}
			
			//��ȡ�Ź���Ϣ
			String pname=su.getRequest().getParameter("pname");
			String ptype1=su.getRequest().getParameter("ptype1");
			String ptype2=su.getRequest().getParameter("ptype2");
			String pprice=su.getRequest().getParameter("pprice");
			String pmarket=su.getRequest().getParameter("pmarket");
			String ptard=su.getRequest().getParameter("ptrad");
			String pcontent=su.getRequest().getParameter("pcontent");
			String pdesc=su.getRequest().getParameter("pdesc");
			String ptime=su.getRequest().getParameter("ptime");
			
			
			HttpSession session=request.getSession();
			Businessbean bu=(Businessbean)session.getAttribute("bsin");
			
			Product p=new Product();
			System.out.println("bid"+bu.getBid());
			p.setBid(bu.getBid());
			p.setPname(pname);
			p.setPtype1(ptype1);
			p.setPtype2(ptype2);
			p.setPprice(Float.parseFloat(pprice));
			p.setPmarket(Float.parseFloat(pmarket));
			p.setBtrad(ptard);
			p.setBcontent(pcontent);
			p.setBdesc(pdesc);
			p.setBtime(ptime);
			
			System.out.println("btrad:"+p.getBtrad());
			
			
			p.setBcount(0);//����
			p.setBshoucang(0);//�ղ�
			p.setBdata(new Date().toLocaleString());
			
			bus.prodadd(p);
			
			//�Ȳ�ѯ�ոձ�����Ź���ϢID
			int pid=bus.selmaxprodid();
			
			//�õ�����file�ؼ�����
			Enumeration en=su.getFiles().getEnumeration();
			while(en.hasMoreElements()){
				File file=(File)en.nextElement();//ÿһ���ļ�����
				String filename=file.getFileName();
				filename=getimagname(filename);//�������
				
				try {
					file.saveAs("files/"+filename);
					
				} catch (SmartUploadException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				request.setAttribute("msg", "����������Ϣ��δ��д��");
				//���±���
				bus.saveimg(pid, "files/"+filename);//�Ź�ID---ͼƬ����
				
			}
			request.getRequestDispatcher("business?method=commodity1").forward(
					request, response);
			//response.sendRedirect("business?method=commodity");
		}else if("toupdprod".equals(method)){//ȥ�޸�
			
			String spid = request.getParameter("pid");

             System.out.print("spid="+spid);
			// ��ѯ��Ʒ��Ϣ
			Product prod=bus.selprod(Integer.parseInt(spid));
			request.setAttribute("p", prod);
			

			// ����Ʒͼ����Ϣ
			List list = bus.selimgs(Integer.parseInt(spid));
			request.setAttribute("imglist", list);
			System.out.println("�̼�id1"+prod.getBid());
			
			//��ѯ�̼���Ϣ
			Businessbean bs = bus.selbusinesslist(prod.getBid());
			request.setAttribute("bu", bs);
			//response.sendRedirect("business/updprod.jsp");
			request.getRequestDispatcher("business/updprod.jsp").forward(request, response);
			
		}else if("updprod".equals(method)){//�޸�
			
			System.out.println(">>>>>>>>>>>>");
			
			SmartUpload su=new SmartUpload();
			su.initialize(getServletConfig(),request,response);
			
			
			try {
				su.upload();
				su.save("/files");
				
			} catch (SmartUploadException e) {
				e.printStackTrace();
			}
			
			Product p=new Product();
			
			String spid = request.getParameter("spid");
			int pid = Integer.parseInt(spid);

			p.setPid(pid);
			
			p.setPname(su.getRequest().getParameter("pname"));
			p.setPtype1(su.getRequest().getParameter("ptype1"));
			p.setPtype2(su.getRequest().getParameter("ptype2"));
			p.setPprice(Float.parseFloat(su.getRequest().getParameter("pprice")));
			p.setPmarket(Float.parseFloat(su.getRequest().getParameter("pmarket")));
			p.setBtrad(su.getRequest().getParameter("btrad"));
			p.setBcontent(su.getRequest().getParameter("bcontent"));
			p.setBdesc(su.getRequest().getParameter("bdesc"));
			p.setBtime(su.getRequest().getParameter("btime"));
			
			p.setBdata(su.getRequest().getParameter("bdata"));
			
			System.out.println("++++++++++++");
			boolean b=bus.updcommodity(p);
			if(b){
				request.setAttribute("msg", "����ɹ���");
				HttpSession session=request.getSession();
				session.setAttribute("p",p);
				request.getRequestDispatcher("business?method=commodity1").forward(request, response);
			}else{
				request.setAttribute("msg", "����ʧ�ܣ�");
			}
			
			
			
			
		}else if("previewprod".equals(method)){
			System.out.println("----------");
			String spid = request.getParameter("pid");


			// ��ѯ��Ʒ��Ϣ
			Product prod=bus.selprod(Integer.parseInt(spid));
			request.setAttribute("p", prod);

			// ����Ʒͼ����Ϣ
			List list = bus.selimgs(Integer.parseInt(spid));
			request.setAttribute("imglist", list);
			System.out.println("�̼�id1"+prod.getBid());
			
			//��ѯ�̼���Ϣ
			Businessbean b = bus.selbusinesslist(prod.getBid());
			request.setAttribute("bu", b);
			
			
			// �鿴������Ϣ
			System.out.println("lalalala");
			
			request.getRequestDispatcher("business/previewprod.jsp").forward(request, response);
			
		}else if("index".equals(method)){//����
		
		
			
			//���������ؼ���
			String keyword=request.getParameter("keyword");
			if(keyword!=null){
				keyword=new String(keyword.getBytes("iso-8859-1"),"utf-8");
			}
			List list=bus.prodlist(keyword);
			for(int i=0;i<list.size();i++){
				Product prod=(Product)list.get(i);
				String img=bus.selimg(prod.getPid());
				prod.setBdesc(img);//����˵������ͼƬ
				
			}
			request.setAttribute("prodlist", list);
			request.setAttribute("keyword", keyword);
			request.getRequestDispatcher("homepage.jsp").forward(request,response);
		}else if("yanzheng".equals(method)){//ȷ��ʹ��  ������֤
			//��ȡ��֤��
			String yzm = request.getParameter("yzm");
			System.out.println("������֤֮ǰ����֤�룺"+yzm);
		
			Product prod=null;
			
			//ִ�и���״̬����
			boolean b = bus.bupdorders(yzm);
			if(b==true){
				//������֤���ѯ����
				Order orders =(Order)bus.seloidbybid(yzm);
				//���ݶ���������֤��
				Yzm yzb = new Yzm();
				yzb.setBid(yzb.getBid());
				yzb.setOid(orders.getOid());
				yzb.setYdate(new Date().toLocaleString());
				yzb.setYprice(orders.getOprice());
				yzb.setYzm(yzm);
				bus.addyzb(yzb);
				//����pid��ѯ��Ʒ
				prod = (Product)bus.selprodbyid(orders.getPid());
				System.out.println("��֤���id:"+yzm);
				request.setAttribute("prod", prod);
				request.getRequestDispatcher("business/yzm.jsp").forward(request, response);
			}else{
				request.setAttribute("msg","�޴˶���");
				request.getRequestDispatcher("business/yzm.jsp").forward(request, response);
			}
				
		}else if("del".equals(method)){//ɾ����Ʒ
			String sid=request.getParameter("pid");
			bus.delprodbyid(Integer.parseInt(sid));
			response.sendRedirect("business?method=commodity1");
		}
		
	}
		
	
	
	private String getimagname(String filename1){
		//����������ķ�ʽ��ͼƬ����
		String newname=filename1.substring(filename1.indexOf("."),filename1.length());
		Random ran=new Random();
		int i=ran.nextInt();
		return i+newname;
	}

}











