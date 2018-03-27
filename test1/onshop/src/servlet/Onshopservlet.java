package servlet;

import java.io.IOException;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.Contants;

import service.Onshops;
import serviceImpl.Onshopimpl;





import bean.Assess;
import bean.Businessbean;
import bean.Collects;
import bean.Order;
import bean.Product;

import bean.Userbean;




public class Onshopservlet extends HttpServlet {
	Onshopimpl ip=new Onshops();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
			
			
		
		
              String method= request.getParameter("method");
              if("list".equals(method)){
              	int pagecount=100;//每页条数
  				int currpage=1;//当前页数
  				int totalpage=0;//总页数
  				int totalrow=0;//总行数
  				
  				System.out.print("进来了");
  				String strcpage=request.getParameter("cpage");
  				if(strcpage!=null&&!"".equals(strcpage)){
  					currpage = Integer.parseInt(strcpage);
  				}
  				
  				String keyword=request.getParameter("keyword");
  				if (keyword != null) {
  					keyword = new String(keyword.getBytes("iso-8859-1"), "utf-8");
  				}
  				
  				
  				totalrow = ip.prodrows(keyword);
  				
  				totalpage = (totalrow+pagecount-1)/pagecount;
  				
  				if(currpage<1){
  					currpage=1;
  				}
  				if(currpage>totalpage&&totalpage!=0){
  					currpage=totalpage;
  				}
  				
  				List list= ip.prodshow(currpage, pagecount,keyword);
  				System.out.println("list  "+list.size());
  				for(int i=0;i<list.size();i++){
  					Product p=(Product)list.get(i);		
  					String img= ip.selimg(p.getPid());
  					p.setBdesc(img);
  				}
   
              	request.setAttribute("keyword", keyword);
              	request.setAttribute("prodlist", list);
                  
              	request.getRequestDispatcher("homepage.jsp").forward(request, response);
                }else if("list2".equals(method)){


                	int pagecount=100;//每页条数
    				int currpage=1;//当前页数
    				int totalpage=0;//总页数
    				int totalrow=0;//总行数
    				
    				System.out.print("进来了----");
    				String strcpage=request.getParameter("cpage");
    				if(strcpage!=null&&!"".equals(strcpage)){
    					currpage = Integer.parseInt(strcpage);
    				}
    				
    				String keyword=request.getParameter("index_none_header_sysc");
    				System.out.print("关键字之前"+keyword);
    				/*if (keyword != null) {
    					keyword = new String(keyword.getBytes("iso-8859-1"), "utf-8");
    				}*/
    				System.out.print("关键字"+keyword);
    				
    				totalrow = ip.prodrows(keyword);
    				
    				totalpage = (totalrow+pagecount-1)/pagecount;
    				
    				if(currpage<1){
    					currpage=1;
    				}
    				if(currpage>totalpage&&totalpage!=0){
    					currpage=totalpage;
    				}
    				
    				List list= ip.prodshow(currpage, pagecount,keyword);
    				
    				System.out.println("list  "+list.size());
    				for(int i=0;i<list.size();i++){
    					Product p=(Product)list.get(i);		
    					String img= ip.selimg(p.getPid());
    					p.setBdesc(img);
    				}
     
    				request.setAttribute("keyword", keyword);
              	request.setAttribute("prodlist", list);
                    
                	request.getRequestDispatcher("select.jsp").forward(request, response);
                  
              	  
                }else if("selprodbyid".equals(method)){
            	  String spid=request.getParameter("pid");
            	  System.out.print("进来了");
            	  //查询商品信息
            	 Product product= ip.selprodbyid(Integer.parseInt(spid));
            	 request.setAttribute("product", product);
            	 
            	 //查询图库信息
            	 List  list=ip.selimgsbyid(Integer.parseInt(spid));
            	 request.setAttribute("imglist", list);
            	 
            	 //查询商家信息
            	Businessbean b= ip.selbusinessbyid(product.getBid());
            	request.setAttribute("bus", b);
            	
            	//查询用户评价
            	Assess asse=ip.selassess(product.getPid());
            	request.setAttribute("ass", asse);
            	
            	request.getRequestDispatcher("productlist.jsp").forward(request, response);
              }else if("toorder".equals(method)){//去下单
            	String spid=request.getParameter("pid");
            	String scount =request.getParameter("count");
            	System.out.println(spid);
            	System.out.println(scount);
            	//根据ID查询商品信息 
            	Product  product=ip.selprodbyid(Integer.parseInt(spid));
            	request.setAttribute("product", product);
            	
            	//根据ID查询图片
            	String img= ip.selimg(product.getPid());
            	product.setBdesc(img);
            	
            	request.setAttribute("count", scount);
            	
                request.getRequestDispatcher("customer/upayment.jsp").forward(request, response);  
                
              }else if("order".equals(method)){//下单
            	  HttpSession session=request.getSession();
            	  Userbean user=(Userbean)session.getAttribute("user");
            	  if(user==null){//用户未登入
            		 request.getRequestDispatcher("customer/userlogin.jsp").forward(request, response);
            	  }else{//用户已经登入
            		String stid=request.getParameter("pid");  
            		//查询商品信息
            		Product product=ip.selprodbyid(Integer.parseInt(stid));
            		//查询商品图片s
            		String img=ip.selimg(product.getPid());
            		product.setBdesc(img);
            		//获取购买的数量
            		String count=request.getParameter("count");
            		
            		
            		//保存订单
            		Order orders=new Order();
            		orders.setBid(product.getBid());
            		orders.setUid(user.getUid());
            		orders.setPid(product.getPid());
            		orders.setOprice(product.getPprice());
            		orders.setOcount(Integer.parseInt(count));
            		orders.setOtotal(product.getPprice()*Integer.parseInt(count));
            		orders.setOdate(new Date().toLocaleString());
            		orders.setOyzm("");
            		orders.setOstate(Contants.ORDER_STATE_0);
            		request.setAttribute("order", orders);
            		
            		boolean bln=ip.orders(orders);
            		if(bln){
            			request.setAttribute("product", product);
            			request.setAttribute("count", count);
            			int oid=ip.seloidbyuid(user.getUid());
            			request.setAttribute("oid", oid);
            			
            			request.getRequestDispatcher("customer/upaymentyes.jsp").forward(request, response);
            		}else{
            			System.out.print("下单失败！");
            		}
            		
            	  }
              }else if("pay".equals(method)){
            	  //获取订单ID
            	 String troid= request.getParameter("oid");
            	 String tmoney=request.getParameter("money");
            	 
            	 
            	 //根据ID将用户订单状态修改为已支付
            	 ip.updorderstate(Integer.parseInt(troid), Contants.ORDER_STATE_1);
            	 
            	 //生成验证码
            	 String yzm=yzm();
            	 ip.updyzmbyoid(Integer.parseInt(troid), yzm);
            	 
            	 //扣除账户余额
            	 HttpSession session=request.getSession();
           	     Userbean user=(Userbean)session.getAttribute("user");
           	     String u=user.getUaccount();
      		     String p=user.getUpwd();
           	      if(user==null){//用户未登入
           		 request.getRequestDispatcher("customer/userlogin.jsp").forward(request, response);
           	   }else{
           		   Userbean b=new Userbean();
         		   b.setUaccount(u);
         		   b.setUpwd(p);
           		   
         		   Userbean uss=ip.selbyacc(u);
         		   Float fl=uss.getUmoney();
           		   Float dol=fl-Float.parseFloat(tmoney);;
           		  
           		   b.setUmoney(dol);
           		   System.out.println("原来的钱为"+b.getUmoney());
           		   System.out.println("应该扣除的钱"+Float.parseFloat(tmoney));
           		   System.out.println(u);
           		   System.out.println(p);
           		  
	           		boolean bln=ip.urcharge(b);//充值成功
	      			if(bln){
	      				request.setAttribute("msg", "支付成功！");
	      				
	      			}else{
	      				request.setAttribute("msg", "支付失败！");
	      			}
           	   }                  	 
            	  	 
            	 //保存验证码
            	 request.setAttribute("yzm",yzm);
            	 request.getRequestDispatcher("customer/upaymentok.jsp").forward(request, response);
              }else  if("tocollect".equals(method)){
            	  HttpSession session=request.getSession();
            	  Userbean user=(Userbean)session.getAttribute("user");
            	  if(user==null){//用户未登入
            		 request.getRequestDispatcher("customer/userlogin.jsp").forward(request, response);
            	  }else{//用户已经登入
            		String stid=request.getParameter("pid");  
            		//查询商品信息
            		Product product=ip.selprodbyid(Integer.parseInt(stid));
            		
            		Collects col=new Collects();
            		col.setPid(product.getPid());
            		col.setUid(user.getUid());
            		col.setCdate("");
            		ip.savecollect(col);
            		request.setAttribute("ni","收藏成功！");
            		request.getRequestDispatcher("collectyes.jsp").forward(request, response);
            	  }
              }
	}

	//生成6位数的验证码
	private String yzm(){
		Random ran = new Random();
		//0-899999 100000 - 999999
		int i = ran.nextInt(900000)+100000;
		return i+"";
	}
}
