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
		//设置请求类型
		String method=request.getParameter("method");
		
		if("blogin".equals(method)){
			String bacc=request.getParameter("bacc");
	
			String bpwd=request.getParameter("bpwd");
			Businessbean bsin=new Businessbean();
			bsin.setBacc(bacc);
			bsin.setBpwd(bpwd);
			Businessbean b=bus.businesslogin(bsin);			
			if(b!=null){
				//将用户对象保存到session
				HttpSession session=request.getSession();
				session.setAttribute("bsin", b);
				//获取用户账号
				System.out.println();
				
				response.sendRedirect("bcenter.jsp");
			}else{//登录失败
				request.setAttribute("msg","账号或密码有误！" );
				request.getRequestDispatcher("business/blogin.jsp").forward(request, response);
			}
		}else if("loginout".equals(method)){
			HttpSession session=request.getSession();
			session.removeAttribute("bsin");
			response.sendRedirect("index.jsp");
		}else if("bzhuce".equals(method)){
			//获取页面参数
			Businessbean business=new Businessbean();
			business.setBacc(request.getParameter("bacc"));
			business.setBpwd(request.getParameter("bpwd"));
			business.setBtel(request.getParameter("btel"));
			business.setBdate(new Date().toLocaleString());
			
			boolean b=bus.bzhce(business);
			if(b){
				response.sendRedirect("homepage.jsp");
			}else {
				request.setAttribute("msg", "注册失败！");
				request.getRequestDispatcher("bzhuce.jsp").forward(request, response);
			}
			
			
		}else if("updbusiness".equals(method)){//修改1
			
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
				request.setAttribute("msg", "原密码有误！");
				request.getRequestDispatcher("business/changepwd.jsp").forward(request, response);
			}else{
				
				bus.updpwd(b);
			
			}
			
			
		}else if("businessmsg".equals(method)){
			//得到上传对象
			SmartUpload su=new SmartUpload();
			//初始化
			su.initialize(getServletConfig(),request,response);
			
			//执行上传
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
			
			
			//返回页面所有file对象
			Files files=su.getFiles();
			
			String filename1=files.getFile(0).getFileName();
			
			if("prodadd".equals(filename1)){//没有上传新图片
				b.setByyzz(su.getRequest().getParameter("byyzz"));//获取隐函域的数据
				
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
				filename2 = getimagname(filename2);// 把就名称传过去 返回新名称
				b.setBzlht("files/" + filename2);
				try {
					files.getFile(1).saveAs("files/" + filename2);// 重新保存一下
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
				request.setAttribute("msg", "保存成功！");
				HttpSession session=request.getSession();
				
				session.setAttribute("bu",b);
			}else{
				request.setAttribute("msg", "保存失败！");
			}
			System.out.println("........");
			request.getRequestDispatcher("bcenter.jsp").forward(request, response);
			
		}else if("commodity".equals(method)){
			
			String spid=request.getParameter("pid");
			
			//查询商品信息
			System.out.println(spid);
			Product prod=bus.selcommodity(Integer.parseInt(spid));
			request.setAttribute("prod", prod);
			
			
			//查看商品图库信息
			List list=bus.selimgs(Integer.parseInt(spid));
			request.setAttribute("imglist", list);
			
			//查看商铺信息
			Businessbean b=bus.selbusiness(prod.getBid());
			System.out.println(b);
			request.setAttribute("b", b);
			
			request.getRequestDispatcher("business/commodity.jsp").forward(request, response);
			
		}else if ("commodity1".equals(method)) {// 后台团购信息列表
			
			HttpSession session = request.getSession();
			Businessbean bu = (Businessbean) session.getAttribute("bsin");
			
			System.out.println("商家id"+bu.getBid());
			List list = bus.selprodlistbybid(bu.getBid());//
			
			System.out.println("list大小"+list.size());
			
			for (int i = 0; i < list.size(); i++) {
				Product p = (Product) list.get(i);
				// 根据团购ID去查询 一张图片
				String img = bus.selimg(p.getPid());
				p.setBdesc(img);// 借用团购说明字段 存储图片

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
			
			//获取团购信息
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
			
			
			p.setBcount(0);//销量
			p.setBshoucang(0);//收藏
			p.setBdata(new Date().toLocaleString());
			
			bus.prodadd(p);
			
			//先查询刚刚保存的团购信息ID
			int pid=bus.selmaxprodid();
			
			//得到所有file控件对象
			Enumeration en=su.getFiles().getEnumeration();
			while(en.hasMoreElements()){
				File file=(File)en.nextElement();//每一个文件对象、
				String filename=file.getFileName();
				filename=getimagname(filename);//随机名称
				
				try {
					file.saveAs("files/"+filename);
					
				} catch (SmartUploadException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				request.setAttribute("msg", "您的商铺信息还未填写！");
				//重新保存
				bus.saveimg(pid, "files/"+filename);//团购ID---图片名称
				
			}
			request.getRequestDispatcher("business?method=commodity1").forward(
					request, response);
			//response.sendRedirect("business?method=commodity");
		}else if("toupdprod".equals(method)){//去修改
			
			String spid = request.getParameter("pid");

             System.out.print("spid="+spid);
			// 查询商品信息
			Product prod=bus.selprod(Integer.parseInt(spid));
			request.setAttribute("p", prod);
			

			// 查商品图库信息
			List list = bus.selimgs(Integer.parseInt(spid));
			request.setAttribute("imglist", list);
			System.out.println("商家id1"+prod.getBid());
			
			//查询商家信息
			Businessbean bs = bus.selbusinesslist(prod.getBid());
			request.setAttribute("bu", bs);
			//response.sendRedirect("business/updprod.jsp");
			request.getRequestDispatcher("business/updprod.jsp").forward(request, response);
			
		}else if("updprod".equals(method)){//修改
			
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
				request.setAttribute("msg", "保存成功！");
				HttpSession session=request.getSession();
				session.setAttribute("p",p);
				request.getRequestDispatcher("business?method=commodity1").forward(request, response);
			}else{
				request.setAttribute("msg", "保存失败！");
			}
			
			
			
			
		}else if("previewprod".equals(method)){
			System.out.println("----------");
			String spid = request.getParameter("pid");


			// 查询商品信息
			Product prod=bus.selprod(Integer.parseInt(spid));
			request.setAttribute("p", prod);

			// 查商品图库信息
			List list = bus.selimgs(Integer.parseInt(spid));
			request.setAttribute("imglist", list);
			System.out.println("商家id1"+prod.getBid());
			
			//查询商家信息
			Businessbean b = bus.selbusinesslist(prod.getBid());
			request.setAttribute("bu", b);
			
			
			// 查看店铺信息
			System.out.println("lalalala");
			
			request.getRequestDispatcher("business/previewprod.jsp").forward(request, response);
			
		}else if("index".equals(method)){//搜索
		
		
			
			//接收搜索关键字
			String keyword=request.getParameter("keyword");
			if(keyword!=null){
				keyword=new String(keyword.getBytes("iso-8859-1"),"utf-8");
			}
			List list=bus.prodlist(keyword);
			for(int i=0;i<list.size();i++){
				Product prod=(Product)list.get(i);
				String img=bus.selimg(prod.getPid());
				prod.setBdesc(img);//借用说明来存图片
				
			}
			request.setAttribute("prodlist", list);
			request.setAttribute("keyword", keyword);
			request.getRequestDispatcher("homepage.jsp").forward(request,response);
		}else if("yanzheng".equals(method)){//确认使用  消费验证
			//获取验证码
			String yzm = request.getParameter("yzm");
			System.out.println("这是验证之前的验证码："+yzm);
		
			Product prod=null;
			
			//执行更改状态方法
			boolean b = bus.bupdorders(yzm);
			if(b==true){
				//根据验证码查询订单
				Order orders =(Order)bus.seloidbybid(yzm);
				//根据订单新增验证表
				Yzm yzb = new Yzm();
				yzb.setBid(yzb.getBid());
				yzb.setOid(orders.getOid());
				yzb.setYdate(new Date().toLocaleString());
				yzb.setYprice(orders.getOprice());
				yzb.setYzm(yzm);
				bus.addyzb(yzb);
				//根据pid查询商品
				prod = (Product)bus.selprodbyid(orders.getPid());
				System.out.println("验证后的id:"+yzm);
				request.setAttribute("prod", prod);
				request.getRequestDispatcher("business/yzm.jsp").forward(request, response);
			}else{
				request.setAttribute("msg","无此订单");
				request.getRequestDispatcher("business/yzm.jsp").forward(request, response);
			}
				
		}else if("del".equals(method)){//删除商品
			String sid=request.getParameter("pid");
			bus.delprodbyid(Integer.parseInt(sid));
			response.sendRedirect("business?method=commodity1");
		}
		
	}
		
	
	
	private String getimagname(String filename1){
		//采用随机数的方式给图片命名
		String newname=filename1.substring(filename1.indexOf("."),filename1.length());
		Random ran=new Random();
		int i=ran.nextInt();
		return i+newname;
	}

}











