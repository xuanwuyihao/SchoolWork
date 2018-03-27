package servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.Onshops;
import serviceImpl.Onshopimpl;



import bean.Assess;
import bean.Collects;
import bean.Order;
import bean.Product;
import bean.Userbean;




public class Userservlet extends HttpServlet {
	Onshopimpl ip=new Onshops();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
             String method=request.getParameter("method");
             
             if("login".equals(method)){
            	 //获取账号和密码
            	 String uaccount=request.getParameter("uaccount");
            	 String upwd=request.getParameter("upwd");
            	 Userbean user=new Userbean();
            	 user.setUaccount(uaccount);
            	 user.setUpwd(upwd);
            	 Userbean u=ip.login(user);
            	 if(u!=null){
            		 HttpSession session=request.getSession();
            		 session.setAttribute("user",u );
            		 response.sendRedirect("index.jsp");
            	 }else{
            		 request.setAttribute("msg", "登入失败!");
            		 request.getRequestDispatcher("customer/userlogin.jsp").forward(request, response);
            	 }
             }else if("uzhuce".equals(method)){
                Userbean u=new Userbean();
            	   u.setUaccount(request.getParameter("uaccount"));
            	   u.setUpwd(request.getParameter("upwd"));
            	   u.setUmail(request.getParameter("umail"));
            	    boolean b=ip.enroll(u);
            	    if(b){
            	    	response.sendRedirect("homepage.jsp");	
            	    }else{
            	    	request.setAttribute("msg", "注册失败！");
        				request.getRequestDispatcher("customer/uzhuce.jsp").forward(request, response);
            	    }
             }else if("urecharge".equals(method)){
            	 System.out.println("---------");
            	//充值中心
         			
         			String uacc  =  request.getParameter("uacc");
         			String upwd  =  request.getParameter("upwd");
         			String uprice  =  request.getParameter("uprice");
         			
         			Userbean userben=ip.selbyacc(uacc);
         			Float m=userben.getUmoney();
         			
         			
         			Userbean b=new Userbean();
         			b.setUaccount(uacc);
         			b.setUpwd(upwd);
         			
         			
         			float c=m+Float.parseFloat(uprice);
         			System.out.println(b.getUmoney());
         			b.setUmoney(c);
         			
         			boolean bln=ip.urcharge(b);//充值成功
         			if(bln){
         				request.setAttribute("msg", "充值成功！");
         				
         			}else{
         				request.setAttribute("msg", "充值失败！");
         			}
	
             }else if("upinfo".equals(method)){//查询用户信息（账号）
            	String stracc=request.getParameter("account");
            	Userbean user= ip.selbyacc(stracc);
            	request.setAttribute("user", user);
            	request.getRequestDispatcher("customer/userinfo.jsp").forward(request, response);
             }else if("info".equals(method)){//修改用户信息（除用户密码以外的信息）
            	Userbean user=new Userbean();
                user.setUnickname(request.getParameter("nickname"));
                user.setUaccount(request.getParameter("account"));
                user.setUbirth(request.getParameter("birth"));
                user.setUface(request.getParameter("face"));
                user.setUmail(request.getParameter("mail"));
                user.setUsix(request.getParameter("six"));             
                ip.upinfo(user);
                HttpSession session=request.getSession();
       		    session.setAttribute("user",user );
                response.sendRedirect("customer/userinfo.jsp"); 
             }else if("toinpwd".equals(method)){
            	String stracc=request.getParameter("account");
            	System.out.print(stracc);
            	Userbean user=ip.selbyacc(stracc);
            	request.setAttribute("user", user);
            	request.getRequestDispatcher("customer/userinpwd.jsp").forward(request, response);
             }else if("inpwd".equals(method)){
            	 String oldpwd=request.getParameter("oldpwd");
            	 String newpwd=request.getParameter("newpwd");
            	 String newpwd2=request.getParameter("newpwd2");
            	      	 
            	 if(newpwd==newpwd2){
            		 Userbean p=new Userbean();
                     p.setUpwd(request.getParameter("newpwd")); 
                     p.setUaccount(request.getParameter("account"));
                     System.out.println("这是新用户账号"+request.getParameter("account"));
                     ip.inpwd(p);
                     response.sendRedirect("customer/userinfo.jsp"); 
            	 }
                        	
             }else if("myorder".equals(method)){
            	HttpSession sesion= request.getSession();
            	Userbean user=(Userbean)sesion.getAttribute("user");
            	 System.out.print(user.getUid());
            	//根据用户ID查询订单
            	 List  list=ip.selorderbyuid(user.getUid());
            	
            	 Map  map=new HashMap();
            	 for(int i=0;i<list.size();i++){
            		Order o=(Order) list.get(i);
            	  
            	  //根据订单中的ID查询商品信息
            		Product product=ip.selprodbyid(o.getPid());
            		
            	 //根据团购ID查询图片
                    String img= ip.selimg(o.getPid());
               	 
               	 //使用商品说明字段保存图片
               	product.setBdesc(img);
                    
               	 //订单对象为键  团购信息位置
            	map.put(o, product);	
            	 }    
            	 request.setAttribute("map", map);
            	 request.getRequestDispatcher("customer/myorder.jsp").forward(request, response);
             }else  if("selyzm".equals(method)){//查询验证码
            	 String soid=request.getParameter("oid");
            	 
            	 //根据OID查询
            	String yzm= ip.selyzm(Integer.parseInt(soid));
            	System.out.println(yzm);
            	request.setAttribute("yzm", yzm);
            	 request.getRequestDispatcher("yzm.jsp").forward(request, response);
             }else if("toassess".equals(method)){//用户去评价
            	String spid= request.getParameter("pid");
                String soid=request.getParameter("oid");
                
                request.setAttribute("oid", soid);
            	//根据PID查询商品信息 
            	Product  product=ip.selprodbyid(Integer.parseInt(spid));
            	request.setAttribute("product", product);
            	          	
                request.getRequestDispatcher("customer/myassess.jsp").forward(request, response);
             }else if("assess".equals(method)){
            	HttpSession sesion= request.getSession();
             	Userbean user=(Userbean)sesion.getAttribute("user");
             	String sass=request.getParameter("ass");
             	String sone=request.getParameter("astar");
             	String soid=request.getParameter("oid");
             	String spid=request.getParameter("pid");
             	System.out.println("星星"+sone);
             	//根据ID查询商品信息,用于获取其商家ID
        		Product product=ip.selprodbyid(Integer.parseInt(spid));
             		
             		 Assess ass=new Assess();
                 	 ass.setBid(product.getBid());
                 	 ass.setOid(Integer.parseInt(soid));
                 	 ass.setPid(Integer.parseInt(spid));
                 	 ass.setUid(user.getUid());
                 	 ass.setAstar(Integer.parseInt(sone));
                 	 ass.setAcontent(sass);
                 	boolean bln= ip.saveassess(ass);
                 	if(bln){
                 		request.setAttribute("yes","评论成功" );
                 	}else{
                 		request.setAttribute("no","保存失败" );
                 	}         	           	
             }else if("loginout".equals(method)){//销毁session---退出账号
     			HttpSession session=request.getSession();
    			session.removeAttribute("user");
    			response.sendRedirect("index.jsp");
    		}else if("mycollect".equals(method)){
          	  HttpSession sesion= request.getSession();
          	  Userbean user=(Userbean)sesion.getAttribute("user");
          	  System.out.print(user.getUid());
          	 List list=ip.selcollectbyuid(user.getUid());
          	 Map  map=new HashMap();
          	 for(int i=0;i<list.size();i++){
          		Collects co=(Collects)list.get(i);
          		
          		//获取商品信息
          		Product product=ip.selprodbyid(co.getPid());
          		
          		 //根据团购ID查询图片
                String img= ip.selimg(co.getPid());
                      
               	product.setBdesc(img);
     
            	map.put(co, product);	  
          	 }
          	 request.setAttribute("map",map);
          	 request.getRequestDispatcher("customer/mycollect.jsp").forward(request, response);
          }
	}
}