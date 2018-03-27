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
              	int pagecount=100;//ÿҳ����
  				int currpage=1;//��ǰҳ��
  				int totalpage=0;//��ҳ��
  				int totalrow=0;//������
  				
  				System.out.print("������");
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


                	int pagecount=100;//ÿҳ����
    				int currpage=1;//��ǰҳ��
    				int totalpage=0;//��ҳ��
    				int totalrow=0;//������
    				
    				System.out.print("������----");
    				String strcpage=request.getParameter("cpage");
    				if(strcpage!=null&&!"".equals(strcpage)){
    					currpage = Integer.parseInt(strcpage);
    				}
    				
    				String keyword=request.getParameter("index_none_header_sysc");
    				System.out.print("�ؼ���֮ǰ"+keyword);
    				/*if (keyword != null) {
    					keyword = new String(keyword.getBytes("iso-8859-1"), "utf-8");
    				}*/
    				System.out.print("�ؼ���"+keyword);
    				
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
            	  System.out.print("������");
            	  //��ѯ��Ʒ��Ϣ
            	 Product product= ip.selprodbyid(Integer.parseInt(spid));
            	 request.setAttribute("product", product);
            	 
            	 //��ѯͼ����Ϣ
            	 List  list=ip.selimgsbyid(Integer.parseInt(spid));
            	 request.setAttribute("imglist", list);
            	 
            	 //��ѯ�̼���Ϣ
            	Businessbean b= ip.selbusinessbyid(product.getBid());
            	request.setAttribute("bus", b);
            	
            	//��ѯ�û�����
            	Assess asse=ip.selassess(product.getPid());
            	request.setAttribute("ass", asse);
            	
            	request.getRequestDispatcher("productlist.jsp").forward(request, response);
              }else if("toorder".equals(method)){//ȥ�µ�
            	String spid=request.getParameter("pid");
            	String scount =request.getParameter("count");
            	System.out.println(spid);
            	System.out.println(scount);
            	//����ID��ѯ��Ʒ��Ϣ 
            	Product  product=ip.selprodbyid(Integer.parseInt(spid));
            	request.setAttribute("product", product);
            	
            	//����ID��ѯͼƬ
            	String img= ip.selimg(product.getPid());
            	product.setBdesc(img);
            	
            	request.setAttribute("count", scount);
            	
                request.getRequestDispatcher("customer/upayment.jsp").forward(request, response);  
                
              }else if("order".equals(method)){//�µ�
            	  HttpSession session=request.getSession();
            	  Userbean user=(Userbean)session.getAttribute("user");
            	  if(user==null){//�û�δ����
            		 request.getRequestDispatcher("customer/userlogin.jsp").forward(request, response);
            	  }else{//�û��Ѿ�����
            		String stid=request.getParameter("pid");  
            		//��ѯ��Ʒ��Ϣ
            		Product product=ip.selprodbyid(Integer.parseInt(stid));
            		//��ѯ��ƷͼƬs
            		String img=ip.selimg(product.getPid());
            		product.setBdesc(img);
            		//��ȡ���������
            		String count=request.getParameter("count");
            		
            		
            		//���涩��
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
            			System.out.print("�µ�ʧ�ܣ�");
            		}
            		
            	  }
              }else if("pay".equals(method)){
            	  //��ȡ����ID
            	 String troid= request.getParameter("oid");
            	 String tmoney=request.getParameter("money");
            	 
            	 
            	 //����ID���û�����״̬�޸�Ϊ��֧��
            	 ip.updorderstate(Integer.parseInt(troid), Contants.ORDER_STATE_1);
            	 
            	 //������֤��
            	 String yzm=yzm();
            	 ip.updyzmbyoid(Integer.parseInt(troid), yzm);
            	 
            	 //�۳��˻����
            	 HttpSession session=request.getSession();
           	     Userbean user=(Userbean)session.getAttribute("user");
           	     String u=user.getUaccount();
      		     String p=user.getUpwd();
           	      if(user==null){//�û�δ����
           		 request.getRequestDispatcher("customer/userlogin.jsp").forward(request, response);
           	   }else{
           		   Userbean b=new Userbean();
         		   b.setUaccount(u);
         		   b.setUpwd(p);
           		   
         		   Userbean uss=ip.selbyacc(u);
         		   Float fl=uss.getUmoney();
           		   Float dol=fl-Float.parseFloat(tmoney);;
           		  
           		   b.setUmoney(dol);
           		   System.out.println("ԭ����ǮΪ"+b.getUmoney());
           		   System.out.println("Ӧ�ÿ۳���Ǯ"+Float.parseFloat(tmoney));
           		   System.out.println(u);
           		   System.out.println(p);
           		  
	           		boolean bln=ip.urcharge(b);//��ֵ�ɹ�
	      			if(bln){
	      				request.setAttribute("msg", "֧���ɹ���");
	      				
	      			}else{
	      				request.setAttribute("msg", "֧��ʧ�ܣ�");
	      			}
           	   }                  	 
            	  	 
            	 //������֤��
            	 request.setAttribute("yzm",yzm);
            	 request.getRequestDispatcher("customer/upaymentok.jsp").forward(request, response);
              }else  if("tocollect".equals(method)){
            	  HttpSession session=request.getSession();
            	  Userbean user=(Userbean)session.getAttribute("user");
            	  if(user==null){//�û�δ����
            		 request.getRequestDispatcher("customer/userlogin.jsp").forward(request, response);
            	  }else{//�û��Ѿ�����
            		String stid=request.getParameter("pid");  
            		//��ѯ��Ʒ��Ϣ
            		Product product=ip.selprodbyid(Integer.parseInt(stid));
            		
            		Collects col=new Collects();
            		col.setPid(product.getPid());
            		col.setUid(user.getUid());
            		col.setCdate("");
            		ip.savecollect(col);
            		request.setAttribute("ni","�ղسɹ���");
            		request.getRequestDispatcher("collectyes.jsp").forward(request, response);
            	  }
              }
	}

	//����6λ������֤��
	private String yzm(){
		Random ran = new Random();
		//0-899999 100000 - 999999
		int i = ran.nextInt(900000)+100000;
		return i+"";
	}
}
