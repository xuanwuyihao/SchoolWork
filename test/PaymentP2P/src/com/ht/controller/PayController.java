package com.ht.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ht.model.Assets;
import com.ht.model.Bankcard;
import com.ht.model.Cash;
import com.ht.model.Flow;
import com.ht.model.Froze;
import com.ht.model.Netsave;
import com.ht.model.Pay;
import com.ht.model.Thaw;
import com.ht.model.Users;
import com.ht.service.AssetsService;
import com.ht.service.BankcardService;
import com.ht.service.CashService;
import com.ht.service.FlowService;
import com.ht.service.FrozeService;
import com.ht.service.MerchantService;
import com.ht.service.NetsaveService;
import com.ht.service.PayService;
import com.ht.service.ThawService;
import com.ht.service.UsersService;

@Controller
@RequestMapping("pay")
public class PayController {
	
	// 默认运算精度,<span style="color:#ff0000;">保留有效数字6位</span>  
    private static final int DEF_DIV_SCALE =20;  
    //RoundingMode.HALF_UP 舍入模式，四舍五入 向上  
	private static MathContext mc = new MathContext(DEF_DIV_SCALE,RoundingMode.HALF_UP); 
	
	
	@Resource(name="assetsServiceImpl")
	private AssetsService assetsService;
	
	@Resource(name="bankcardServiceImpl")
	private BankcardService bankcardService;
	
	@Resource(name="usersServiceImpl")
	private UsersService usersService;
	
	@Resource(name="cashServiceImpl")
	private CashService cashService;
	
	@Resource(name="flowServiceImpl")
	private FlowService flowService;
	
	@Resource(name="frozeServiceImpl")
	private FrozeService frozeService;
	
	@Resource(name="merchantServiceImpl")
	private MerchantService merchantService;
	
	@Resource(name="netsaveServiceImpl")
	private NetsaveService netsaveService;
	
	@Resource(name="payServiceImpl")
	private PayService payService;
	
	@Resource(name="thawServiceImpl")
	private ThawService thawService;
	
	
	
	    //注册易支付
		@RequestMapping("register")
		public void register(HttpServletRequest request,HttpServletResponse response) {
				
				//判断请求报文是否来自代维系统的ip地址  
			    String ip = request.getRemoteHost(); 
				
			    System.out.println("ip地址="+ip);
			      
			    
			    try {
			    	//获取接收的报文
					BufferedReader reader=request.getReader();
					
					String line="";
					
					StringBuffer inputString = new StringBuffer();  
				        while ((line = reader.readLine()) != null) {  
				        inputString.append(line);  
				     }  
			       
				    //jackJson    
			        ObjectMapper o=new ObjectMapper();
			      
			        Users u=o.readValue(inputString.toString(),Users.class);
			        
			        System.out.println("接收的报文为= "+u);
			        
			        System.out.println("未加密密码："+u.getPwd());
			        //密码加密
			        Md5Hash md5Hash = new Md5Hash(u.getPwd(),u.getUserphone(),10);
			        
			        Date date=new Date();
			        
			        //用户信息表
			        Users us=new Users();
			        us.setCustid(u.getUserphone());
			        us.setPwd(md5Hash.toString());
			        us.setMerid("10000001");
			        us.setUsername(u.getUsername());
			        us.setIdno(u.getIdno());
			        us.setUserphone(u.getUserphone());
			        us.setUsermail(u.getUsermail());
			        us.setDatetime(date);
			        usersService.insert(us);
			        
			        //资产表
			        BigDecimal mon=new BigDecimal("0.00"); 
			        Assets a=new Assets();
			        a.setCustid(u.getUserphone());
			        a.setTotalassets(mon);
			        a.setUseassets(mon);
			        a.setFrozenassets(mon);
			        assetsService.insert(a);
			        
			        StringBuffer resultBuffer=new StringBuffer();
			        		             	 
					resultBuffer.append("true");
					
			        System.out.println("返回true");
			     
			       // 设置发送报文的格式  
			       response.setContentType("text/xml");  
			       response.setCharacterEncoding("UTF-8");  
			   
			       PrintWriter out = response.getWriter();  
			       out.println(resultBuffer.toString());  
			       out.flush();  
			       out.close();  
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			     
			}
	
	
	
	//判断是否注册易支付
	@RequestMapping("TrueOrFalseUsers")
	public void getmessage(HttpServletRequest request,HttpServletResponse response) {
			
			//判断请求报文是否来自代维系统的ip地址  
		    String ip = request.getRemoteHost(); 
			
		    System.out.println("ip地址="+ip);
		      
		    
		    try {
		    	//获取接收的报文
				BufferedReader reader=request.getReader();
				
				String line="";
				
				StringBuffer inputString = new StringBuffer();  
			        while ((line = reader.readLine()) != null) {  
			        inputString.append(line);  
			     }  
		       
			    //jackJson    
		        ObjectMapper o=new ObjectMapper();
		      
		        Users u=o.readValue(inputString.toString(),Users.class);
		        
		        System.out.println("接收的报文为= "+u);
		        
		        Users us=usersService.getByPhone(u.getUserphone());
		        
		        
		        StringBuffer resultBuffer=new StringBuffer();
		        
		        if(us==null) {//没有找到,未注册
		        	
		        	  System.out.println("返回false");
		        	  // 要返回的报文  				     
				      resultBuffer.append("false");
				      
		        }else {//已经注册
		        			
		        	  System.out.println("返回true");
				      resultBuffer.append("true");
		        }
		        
		     
		       // 设置发送报文的格式  
		       response.setContentType("text/xml");  
		       response.setCharacterEncoding("UTF-8");  
		   
		       PrintWriter out = response.getWriter();  
		       out.println(resultBuffer.toString());  
		       out.flush();  
		       out.close();  
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     
		}
	
	
	    //充值
		@RequestMapping("recharge")
		public void recharge(HttpServletRequest request,HttpServletResponse response) {
				
				//判断请求报文是否来自代维系统的ip地址  
			    String ip = request.getRemoteHost(); 
				
			    System.out.println("ip地址="+ip);
			      
			   
			    try {
			    	//获取接收的报文
					BufferedReader reader=request.getReader();
					
					String line="";
					
					StringBuffer inputString = new StringBuffer();  
				        while ((line = reader.readLine()) != null) {  
				        inputString.append(line);  
				     }  
			       
				    //jackJson    
			        ObjectMapper o=new ObjectMapper();
			      
			        Netsave n=o.readValue(inputString.toString(),Netsave.class);
			        
			        System.out.println("接收的报文为= "+n.toString());
			        
			        System.out.println("卡号:"+n.getOpenaccid()+" "+n.getStay1()+" "+n.getTransamt());
			        
			        
			        //判断银行卡的钱是否足够
			        Bankcard m=bankcardService.getMoneyByCardId(n.getOpenaccid());
			        
			        BigDecimal HaveMoney=m.getMoney();//银行卡拥有的金额
			        BigDecimal NeedMoney=n.getTransamt();//要充值的金额
			       
			        
			        StringBuffer resultBuffer=new StringBuffer();
			        
			        
			        int tf=HaveMoney.compareTo(NeedMoney);//返回值0表示相等，-1表示小于，1表示大于 
			        
			        
			        if(tf>=0) {//金额足够
			        	
			           //扣除用户银行卡后的金额
			           Double CardAfterMoney1=(HaveMoney.subtract(NeedMoney,mc)).doubleValue();			           
			           //1.取2位小数点,并四舍五入
			           BigDecimal CardAfterMoney2=getBigDecimalByDouble(CardAfterMoney1);
			           //2.要修改的对象
			           Bankcard b=new Bankcard();
			           b.setCardId(n.getOpenaccid());
			           b.setMoney(CardAfterMoney2);
			           bankcardService.upBankMoneyByCardId(b);  
			           
			           
			          /* //给商户银行卡添加等额金额(默认卡号:10000001)
			           Bankcard shBank=bankcardService.getMoneyByCardId("10000001");
			           BigDecimal shMoney1=shBank.getMoney();//拥有金额
			           Double shMoney2=(shMoney1.add(NeedMoney,mc)).doubleValue();//添加
			           BigDecimal shMoney3=getBigDecimalByDouble(shMoney2);
			           
			           Bankcard upshBank=new Bankcard();
			           upshBank.setCardId("10000001");
			           upshBank.setMoney(shMoney3);
			           bankcardService.upBankMoneyByCardId(upshBank);  */
			           
			           
			           //给用户资产表添加金额
			           //1.根据电话号码获取用户客户号(注:netsave表的stay1字段已用来装手机号码)
			           Users us=usersService.getByPhone(n.getStay1());
			           //2.根据客户号获取资产表数据
			           Assets as=assetsService.getAssetsByCustid(us.getCustid());
			           BigDecimal totalMoney1=as.getTotalassets();//总资产
			           BigDecimal userMoney1=as.getUseassets();//可用资产
			           
			           Double totalMoney2=(totalMoney1.add(NeedMoney,mc)).doubleValue();
			           Double userMoney2=(userMoney1.add(NeedMoney,mc)).doubleValue();
			           
			           BigDecimal totalMoney3=getBigDecimalByDouble(totalMoney2);
			           BigDecimal userMoney3=getBigDecimalByDouble(userMoney2);
			           
			           Assets upas=new Assets();
			           upas.setCustid(us.getCustid());
			           upas.setTotalassets(totalMoney3);
			           upas.setUseassets(userMoney3);			                
			           assetsService.upAssets(upas);
			           
			           //添加充值表记录
			       	Integer did;
		        	try {
		        	did=thawService.getThawMaxId()+1;//订单号
		        	}catch(NullPointerException e) {
		        		
		        		did=1;
		        	}
			           Date date=new Date();
			           Netsave net=new Netsave();
			           net.setOrdid("n-"+did);//订单号
			           net.setCustis(us.getCustid());//要充值的客户号
			           net.setOpenaccid(n.getOpenaccid());//用来充值的银行卡号
			           net.setTransamt(NeedMoney);//充值的金额
			           net.setRealamt(NeedMoney);//实际充值金额
			           net.setOrddate(date);//充值日期
			           net.setOrdstatus("充值成功");//充值状态
			           netsaveService.insert(net);
			           
			           //添加流水表记录
			           Flow f=new Flow();
			           f.setOrdid("n-"+did);
			           f.setMerid("10000001");//操作的商户id(由操作台传过来)   
			           f.setCustid(us.getCustid());
			           f.setTransamt(NeedMoney);
			           f.setRealamt(NeedMoney);
			           f.setOrddate(date);
			           f.setOrdertype("充值");
			           f.setOrderstatus("充值成功");
			           flowService.insert(f);
			           
			           
			           // 要返回的报文  				     
					   resultBuffer.append("true");
					   
					   System.out.println("返回true");
					      
			        }else {//金额不够
			        	
			           Users us=usersService.getByPhone(n.getStay1());
			           
			           BigDecimal mon=new BigDecimal("0.00"); 
			           
			           //添加充值表记录
				       Integer did=netsaveService.getNetsaveMaxId()+1;//充值表最大id
				       Date date=new Date();
				       Netsave net=new Netsave();
				       net.setOrdid("n-"+did);//订单号
				       net.setCustis(us.getCustid());//要充值的客户号
				       net.setOpenaccid(n.getOpenaccid());//用来充值的银行卡号
				       net.setTransamt(NeedMoney);//充值的金额
				       net.setRealamt(mon);//实际充值金额
				       net.setOrddate(date);//充值日期
				       net.setOrdstatus("充值失败");//充值状态
				       netsaveService.insert(net);
				           
				       //添加流水表
				       Flow f=new Flow();
				       f.setOrdid("n-"+did);
				       f.setMerid("10000001");//操作的商户id(由操作台传过来)   
				       f.setCustid(us.getCustid());
				       f.setTransamt(mon);
				       f.setRealamt(mon);
				       f.setOrddate(date);
				       f.setOrdertype("充值");
				       f.setOrderstatus("充值失败");
				       flowService.insert(f);   
			       
			        				        	        	 
					   resultBuffer.append("false");
					   
					   System.out.println("返回false");
			        }
			        
			        		      
			       // 设置发送报文的格式  
			       response.setContentType("text/xml");  
			       response.setCharacterEncoding("UTF-8");  
			   
			       PrintWriter out = response.getWriter();  
			       out.println(resultBuffer.toString());  
			       out.flush();  
			       out.close();  
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			     
			}
		
	  
		
		//提现
		@RequestMapping("cash")
		public void cash(HttpServletRequest request,HttpServletResponse response) {
				
				//判断请求报文是否来自代维系统的ip地址  
			    String ip = request.getRemoteHost(); 
				
			    System.out.println("ip地址="+ip);
			     
			   
			    try {
			    	//获取接收的报文
					BufferedReader reader=request.getReader();
					
					String line="";
					
					StringBuffer inputString = new StringBuffer();  
				        while ((line = reader.readLine()) != null) {  
				        inputString.append(line);  
				     }  
			       
				    //jackJson    
			        ObjectMapper o=new ObjectMapper();
			      
			        Cash c=o.readValue(inputString.toString(),Cash.class);
			        
			        System.out.println("接收的报文为= "+c);
			        
			        //用户
			        Users us=usersService.getByPhone(c.getStay1());
			        String khcustid=us.getCustid();//客户号
			        String openaccid=c.getOpenaccid();//要提现到的银行卡号
			        BigDecimal cashMoney=c.getTransamt();//要提现金额
			        System.out.println("要提现金额:"+cashMoney);
			        //银行卡的钱
			        Bankcard m=bankcardService.getMoneyByCardId(openaccid);
			        BigDecimal BankMoney=m.getMoney();//银行卡拥有的金额
			        
			        //判断用户资产表的可用资产是否足够
			        Assets as=assetsService.getAssetsByCustid(khcustid);
			        BigDecimal totalMoney1=as.getTotalassets();//总资产
			        BigDecimal userMoney1=as.getUseassets();//可用资产
			        
			        int tf=userMoney1.compareTo(cashMoney);//返回值0表示相等，-1表示小于，1表示大于 
			        
			        
			        StringBuffer resultBuffer=new StringBuffer();
			        
			        if(tf>=0) {//可用资产足够
			        	
			        	   //1.扣除用户资产表资产
			        	   Double totalMoney2=(totalMoney1.subtract(cashMoney,mc)).doubleValue();//总资产			          
			        	   Double userMoney2=(userMoney1.subtract(cashMoney,mc)).doubleValue();//可用资产
				           		           
				           BigDecimal totalMoney3=getBigDecimalByDouble(totalMoney2);
				           BigDecimal userMoney3=getBigDecimalByDouble(userMoney2);
				           
				           Assets upas=new Assets();
				           upas.setCustid(khcustid);
				           upas.setTotalassets(totalMoney3);
				           upas.setUseassets(userMoney3);			                
				           assetsService.upAssets(upas);
			        	  
				           
				           //2.添加用户银行卡金额
				           Double BankMoney1=(BankMoney.add(cashMoney,mc)).doubleValue();
				           BigDecimal BankMoney2=getBigDecimalByDouble(BankMoney1);
				           
				           //普金服务利率
				           BigDecimal pj_rate = new BigDecimal(Double.toString(0.005)); 
				           
				           //普金收取的服务费
				           Double d_pj_chargeMoney=(cashMoney.multiply(pj_rate, mc)).doubleValue();
				           				           
				           //减去普金收取的服务费
				           BigDecimal pj_chargeMoney=getBigDecimalByDouble(d_pj_chargeMoney);//普金收取的服务费
				           Double BankMoney3=(BankMoney2.subtract(pj_chargeMoney,mc)).doubleValue();//实际提现
				           BigDecimal BankMoney4=getBigDecimalByDouble(BankMoney3);
				           
				           Bankcard b=new Bankcard();
				           b.setCardId(openaccid);
				           b.setMoney(BankMoney4);//实际提现到的金额(手续费之后)				           
				           bankcardService.upBankMoneyByCardId(b);
				           
				           
				           //3.汇付收取的手续费利率
				           BigDecimal hf_rate=new BigDecimal("0.4");//汇付收取的手续费利率
				           
				           //汇付收取的手续费
				           Double d_hf_chargeMoney=(pj_chargeMoney.multiply(hf_rate, mc)).doubleValue();			           
				           BigDecimal hf_chargeMoney=getBigDecimalByDouble(d_hf_chargeMoney);
				           
				           //普金收取服务费减去汇付收取的手续费
				           Double pj_chargeMoney1=(pj_chargeMoney.subtract(hf_chargeMoney,mc)).doubleValue();//实际提现
				           BigDecimal pj_chargeMoney2=getBigDecimalByDouble(pj_chargeMoney1);
				           
				           //获取普金资产
				           Assets pj_as=assetsService.getAssetsByCustid("10000001");
				           BigDecimal pj_totalMoney1=pj_as.getTotalassets();//总资产
				           BigDecimal pj_userMoney1=pj_as.getUseassets();//可用资产
				           
				           Double pj_totalMoney2=(pj_totalMoney1.add(pj_chargeMoney2,mc)).doubleValue();
				           Double pj_userMoney2=(pj_userMoney1.add(pj_chargeMoney2,mc)).doubleValue();
				           
				           BigDecimal pj_totalMoney3=getBigDecimalByDouble(pj_totalMoney2);
				           BigDecimal pj_userMoney3=getBigDecimalByDouble(pj_userMoney2);
				           
				           Assets pj_upas=new Assets();
				           pj_upas.setCustid("10000001");
				           pj_upas.setTotalassets(pj_totalMoney3);
				           pj_upas.setUseassets(pj_userMoney3);			                
				           assetsService.upAssets(pj_upas);
				           
				           
				           //4.汇付收取的手续费
				           //获取汇付资产
				           Assets hf_as=assetsService.getAssetsByCustid("10000002");
				           BigDecimal hf_totalMoney1=hf_as.getTotalassets();//总资产
				           BigDecimal hf_userMoney1=hf_as.getUseassets();//可用资产
				           
				           Double hf_totalMoney2=(hf_totalMoney1.add(hf_chargeMoney,mc)).doubleValue();
				           Double hf_userMoney2=(hf_userMoney1.add(hf_chargeMoney,mc)).doubleValue();
				           
				           BigDecimal hf_totalMoney3=getBigDecimalByDouble(pj_totalMoney2);
				           BigDecimal hf_userMoney3=getBigDecimalByDouble(pj_userMoney2);
				           
				           Assets hf_upas=new Assets();
				           hf_upas.setCustid("10000002");
				           hf_upas.setTotalassets(hf_totalMoney3);
				           hf_upas.setUseassets(hf_userMoney3);			                
				           assetsService.upAssets(hf_upas);
				           	     
				           
				           //5.添加提现表
				           Integer ordid=cashService.getCashMaxId()+1;//最大id
				           Date date=new Date();
				           Cash tjca=new Cash();
				           tjca.setOrdid("c-"+ordid);//订单号
				           tjca.setCustis(khcustid);//要提现的客户号
				           tjca.setOpenaccid(openaccid);//要提现到的银行卡号
				           tjca.setTransamt(cashMoney);//提现金额
				           tjca.setSerfee(pj_chargeMoney);//普金收取的服务费
				           tjca.setSercustid("10000001");
				           tjca.setFee(hf_chargeMoney);//汇付收取的手续费
				           tjca.setFeecustid("10000002");				           
				           Double sjtx_Money=(cashMoney.subtract(pj_chargeMoney,mc)).doubleValue();//实际提现
				           BigDecimal sjtx_Money1=getBigDecimalByDouble(sjtx_Money);
				           tjca.setRealamt(sjtx_Money1);//实际提现金额
			        	   tjca.setOrderdate(date);
				           tjca.setOrdstatus("提现成功");
			        	   cashService.insert(tjca);
			        	   
			        	   //6.添加流水表
			        	   //添加流水表记录
				           Flow f=new Flow();
				           f.setOrdid("c-"+ordid);
				           f.setMerid("10000001");//操作的商户id(由操作台传过来)   
				           f.setCustid(khcustid);
				           f.setTransamt(cashMoney);
				           f.setRealamt(sjtx_Money1);
				           f.setOrddate(date);
				           f.setOrdertype("提现");
				           f.setOrderstatus("提现成功");
				           flowService.insert(f);

			        	 
			        	
			        	   // 要返回的报文  				     
					       resultBuffer.append(sjtx_Money1);
					       System.out.println("返回true");
					      
			        }else {//可用资产不够提现
			        	  
			        	   BigDecimal mon=new BigDecimal("0.00"); 
			        	   //1.添加提现表
			        		Integer ordid;
				        	try {
				        		ordid=thawService.getThawMaxId()+1;//订单号
				        	}catch(NullPointerException e) {
				        		
				        		ordid=1;
				        	}
				           Date date=new Date();
				           Cash tjca=new Cash();
				           tjca.setOrdid("c-"+ordid);//订单号
				           tjca.setCustis(khcustid);//要提现的客户号
				           tjca.setOpenaccid(openaccid);//要提现到的银行卡号
				           tjca.setTransamt(cashMoney);//提现金额
				           tjca.setSerfee(mon);//普金收取的服务费
				           tjca.setSercustid("10000001");
				           tjca.setFee(mon);//汇付收取的手续费
				           tjca.setFeecustid("10000002");				           				          
				           tjca.setRealamt(mon);//实际提现金额
			        	   tjca.setOrderdate(date);
				           tjca.setOrdstatus("提现失败");
			        	   cashService.insert(tjca);
			        	   
			        	   //2.添加流水表
			        	   //添加流水表记录
				           Flow f=new Flow();
				           f.setOrdid("c-"+ordid);
				           f.setMerid("10000001");//操作的商户id(由操作台传过来)   
				           f.setCustid(khcustid);
				           f.setTransamt(cashMoney);
				           f.setRealamt(mon);
				           f.setOrddate(date);
				           f.setOrdertype("提现");
				           f.setOrderstatus("提现失败");
				           flowService.insert(f);
			        	  	        	  	 	        	 
					       resultBuffer.append(mon);
					       System.out.println("返回false");
			        }
			        
			     
			       // 设置发送报文的格式  
			       response.setContentType("text/xml");  
			       response.setCharacterEncoding("UTF-8");  
			   
			       PrintWriter out = response.getWriter();  
			       out.println(resultBuffer.toString());  
			       out.flush();  
			       out.close();  
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			     
			}	
	
		
		
		        //判断支付
				@RequestMapping("pdMoney")
				public void pdMoney(HttpServletRequest request,HttpServletResponse response) {
						
						//判断请求报文是否来自代维系统的ip地址  
					    String ip = request.getRemoteHost(); 
						
					    System.out.println("ip地址="+ip);
					      
					   
					    try {
					    	//获取接收的报文
							BufferedReader reader=request.getReader();
							
							String line="";
							
							StringBuffer inputString = new StringBuffer();  
						        while ((line = reader.readLine()) != null){  
						        inputString.append(line);  
						    }  
					       
						    //jackJson    
					        ObjectMapper o=new ObjectMapper();
					      
					        //返回
					        StringBuffer resultBuffer=new StringBuffer();
					        
					        //接收报文
					        Pay p=o.readValue(inputString.toString(),Pay.class);
					        
					        System.out.println("接收的报文为= "+p.toString());
					        
					        //得到客户对象
					        Users us=usersService.getByPhone(p.getStay1());
					        String khcustid=us.getCustid();//客户号
					        
					        Assets as=assetsService.getAssetsByCustid(khcustid);			      
					        BigDecimal userMoney=as.getUseassets();//客户可用资产
					        BigDecimal frozeMoney=as.getFrozenassets();//冻结资产
					        
					        //得到被支付客户对象
					        Users quilt_us=usersService.getByPhone(p.getStay2());
					        String quilt_khcustid=us.getCustid();//被支付客户号
					        System.out.println("汇付可用:"+userMoney);
				            //支付金额		        
					        BigDecimal PayMoney=p.getTransamt();
					        
					        int tf=userMoney.compareTo(PayMoney);//返回值0表示相等，-1表示小于，1表示大于
					        
					        if(tf>=0) {//客户可用资产大于投资金额
					        	
					        
					        	// 要返回的报文  				     
							    resultBuffer.append("true");
							    System.out.println("返回true");
					        	
					        }else {//客户可用资产小于于投资金额
					        	
					        
					        	// 要返回的报文  				     
							    resultBuffer.append("false");
							    System.out.println("返回false");
					        }
					    
					     
					       // 设置发送报文的格式  
					       response.setContentType("text/xml");  
					       response.setCharacterEncoding("UTF-8");  
					   
					       PrintWriter out = response.getWriter();  
					       out.println(resultBuffer.toString());  
					       out.flush();  
					       out.close();  
							
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					     
				}
				
		
	
		
		
		//支付(投资)
		@RequestMapping("investment")
		public void investment(HttpServletRequest request,HttpServletResponse response) {
				
				//判断请求报文是否来自代维系统的ip地址  
			    String ip = request.getRemoteHost(); 
				
			    System.out.println("ip地址="+ip);
			      
			   
			    try {
			    	//获取接收的报文
					BufferedReader reader=request.getReader();
					
					String line="";
					
					StringBuffer inputString = new StringBuffer();  
				        while ((line = reader.readLine()) != null){  
				        inputString.append(line);  
				    }  
			       
				    //jackJson    
			        ObjectMapper o=new ObjectMapper();
			      
			        //返回
			        StringBuffer resultBuffer=new StringBuffer();
			        
			        //接收报文
			        Pay p=o.readValue(inputString.toString(),Pay.class);
			        
			        System.out.println("接收的报文为= "+p.toString());
			        
			        //得到客户对象
			        Users us=usersService.getByPhone(p.getStay1());
			        String khcustid=us.getCustid();//客户号
			        
			        Assets as=assetsService.getAssetsByCustid(khcustid);			      
			        BigDecimal userMoney=as.getUseassets();//客户可用资产
			        BigDecimal frozeMoney=as.getFrozenassets();//冻结资产
			        
			        //得到被支付客户对象
			        Users quilt_us=usersService.getByPhone(p.getStay2());
			        String quilt_khcustid=us.getCustid();//被支付客户号
			        
		            //支付金额		        
			        BigDecimal PayMoney=p.getTransamt();
			        
			       /* int tf=userMoney.compareTo(PayMoney);//返回值0表示相等，-1表示小于，1表示大于
*/			        
			      
			        	
			        	//添加支付表(投资表)
			        	Date date=new Date();
			        	BigDecimal mon=new BigDecimal("0.00");
			        	
			        	Integer ordid;
			        	try {
			        	ordid=payService.getPayMaxId()+1;//最大id
			        	}catch(NullPointerException e) {
			        		
			        		ordid=1;
			        	}
			        	
			        	Pay tp=new Pay();
			        	tp.setOrdid("o-"+ordid);//订单号
			        	tp.setCustid(khcustid);//客户号
			        	tp.setTocustid(quilt_khcustid);//被支付的客户号
			        	tp.setTransamt(PayMoney);//支付金额
			        	tp.setTranstype("易支付");//支付类型
			        	tp.setDetails(p.getDetails());//支付说明
			        	tp.setOrddate(date);//支付时间
			        	tp.setOrdstatus("等待支付");//支付状态(标满支付成功)
			        	tp.setStay1(p.getStay3());//标的编号
			        	payService.insert(tp);
			        	
			        	
			        	//添加支付流水表
			        	Flow f=new Flow();
				        f.setOrdid("o-"+ordid);
				        f.setMerid("10000001");//操作的商户id(由操作台传过来)   
				        f.setCustid(khcustid);
				        f.setTransamt(PayMoney);
				        f.setRealamt(mon);
				        f.setOrddate(date);
				        f.setOrdertype("投资");
				        f.setOrderstatus("等待支付");
				        flowService.insert(f);
			        	
			        	
			        	//添加冻结表
				        Integer frordid;
				        try {
				        	
				        frordid=frozeService.getFrozeMaxId()+1;
				        
				        }catch(NullPointerException e) {
				        	
				        	frordid=1;
				        }
				        
				        
				        Froze fro=new Froze();
				        fro.setOrdid("f-"+frordid);
				        fro.setCustid(khcustid);
				        fro.setFrozeamt(PayMoney);
				        fro.setOrddate(date);
				        fro.setSubjectid(p.getStay3());
				        fro.setFrozestatus("冻结成功");
			        	frozeService.insert(fro);
			        	
			        	
			        	//添加冻结流水表
			        	Flow f1=new Flow();
				        f1.setOrdid("f-"+frordid);
				        f1.setMerid("10000001");//操作的商户id(由操作台传过来)   
				        f1.setCustid(khcustid);
				        f1.setTransamt(PayMoney);
				        f1.setRealamt(PayMoney);
				        f1.setOrddate(date);
				        f1.setOrdertype("冻结");
				        f1.setOrderstatus("冻结成功");
				        flowService.insert(f1);
			        	
			        	
			        	//修改客户资产表				       	        	
			        	Double userMoney1=(userMoney.subtract(PayMoney,mc)).doubleValue();//可用资产减去投资金额
			        	Double frozeMoney1=(frozeMoney.add(PayMoney,mc)).doubleValue();//冻结资产加上投资金额			          
				         			           
				        BigDecimal userMoney2=getBigDecimalByDouble(userMoney1);
				        BigDecimal frozeMoney2=getBigDecimalByDouble(frozeMoney1);
				           
				        Assets upas=new Assets();
				        upas.setCustid(khcustid);				  
				        upas.setUseassets(userMoney2);	
				        upas.setFrozenassets(frozeMoney2);
				        assetsService.upAssets1(upas);
			        	
				        
			        	// 要返回的报文  				     
					    resultBuffer.append("投资成功");
					    System.out.println("返回投资成功");
			        	
			        
			    
			     
			       // 设置发送报文的格式  
			       response.setContentType("text/xml");  
			       response.setCharacterEncoding("UTF-8");  
			   
			       PrintWriter out = response.getWriter();  
			       out.println(resultBuffer.toString());  
			       out.flush();  
			       out.close();  
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			     
		}
		
		
		
		//如果在规定时间内标未筹满(解冻)
		@RequestMapping("thaw")
		public void thaw(HttpServletRequest request,HttpServletResponse response) {
				
				//判断请求报文是否来自代维系统的ip地址  
			    String ip = request.getRemoteHost(); 
				
			    System.out.println("ip地址="+ip);
			      
			   
			    try {
			    	//获取接收的报文
					BufferedReader reader=request.getReader();
					
					String line="";
					
					StringBuffer inputString = new StringBuffer();  
				        while ((line = reader.readLine()) != null) {  
				        inputString.append(line);  
				     }  
			       
				    //jackJson    
			        ObjectMapper o=new ObjectMapper();
			      
			        Froze f=o.readValue(inputString.toString(),Froze.class);
			        
			        System.out.println("接收的报文为= "+f);
			        
			        //标的编号
			        String thaw_subjectid=f.getSubjectid();
			        
			        //根据标的编号和冻结状态获取投资人的冻结表
			        Froze fr=new Froze();
			        fr.setSubjectid(thaw_subjectid);//标的编号
			        fr.setFrozestatus("冻结成功");
			        
			        //循环取出每一个投标成功的用户
			        List<Froze> frozeList=frozeService.getFrozeThaw(fr);
			        Date date=new Date();
			        
			        for(Froze fz:frozeList){
			        	
			        	String khcustid=fz.getCustid();//客户号
			        	BigDecimal frozeamt=fz.getFrozeamt();//解冻金额(冻结金额)
			        	
			        	
			        	Integer ordid;
			        	try {
			        	ordid=thawService.getThawMaxId()+1;//订单号
			        	}catch(NullPointerException e) {
			        		
			        		ordid=1;
			        	}
			        				     			        	
			        	//添加解冻表
			        	Thaw t=new Thaw();
			        	t.setOrdid("t-"+ordid);
			        	t.setCustid(khcustid);
			        	t.setThawamt(frozeamt);
			        	t.setOrddate(date);
			        	thawService.insert(t);	
			        	
			        	//添加解冻流水表
			        	Flow f1=new Flow();
				        f1.setOrdid("t-"+ordid);
				        f1.setMerid("10000001");//操作的商户id(由操作台传过来)   
				        f1.setCustid(khcustid);
				        f1.setTransamt(frozeamt);
				        f1.setRealamt(frozeamt);
				        f1.setOrddate(date);
				        f1.setOrdertype("解冻");
				        f1.setOrderstatus("解冻成功");
				        flowService.insert(f1);
				        
				        //修改支付表状态
				        //根据支付表的客户号、支付状态、标的编号修改支付状态
				        Pay p=new Pay();
				        p.setCustid(khcustid);
				        p.setOrddate(date);
				        p.setOrdstatus("等待支付");
				        p.setStay1(thaw_subjectid);
				        p.setStay2("标已作废");				        
				        //获取流水表的订单号
				        List<Pay> pOrdid=payService.getOrdidByPay(p);
				        
				        for(Pay payOrdid:pOrdid) {
				        String Ordid=payOrdid.getOrdid();
				        System.out.println("oid:"+Ordid);				        
				        payService.updatePayStatus(p);
				        
				        				        
				        //修改流水表的状态
				        Flow upf=new Flow();
				        upf.setOrdid(Ordid+"");
				        upf.setOrddate(date);
				        upf.setOrderstatus("标已作废");
				        flowService.upFlowByOid(upf);
				        
				        
				        //资产表可用和冻结资金修改
				        Assets as=assetsService.getAssetsByCustid(khcustid);			      
				        BigDecimal userMoney=as.getUseassets();//客户可用资产
				        BigDecimal frozeMoney=as.getFrozenassets();//冻结资产
				       
				        Double userMoney1=(userMoney.add(frozeamt,mc)).doubleValue();//可用资产
			        	Double frozeMoney1=(frozeMoney.subtract(frozeamt,mc)).doubleValue();//冻结资产			          
				         			           
				        BigDecimal userMoney2=getBigDecimalByDouble(userMoney1);
				        BigDecimal frozeMoney2=getBigDecimalByDouble(frozeMoney1);
				           
				        Assets upas=new Assets();
				        upas.setCustid(khcustid);				  
				        upas.setUseassets(userMoney2);	
				        upas.setFrozenassets(frozeMoney2);
				        assetsService.upAssets1(upas);
				    
				        
				        }
			        }
			        
			        
			        StringBuffer resultBuffer=new StringBuffer();
		        	  	
			        System.out.println("返回true");
				    resultBuffer.append("true");
			     
			       // 设置发送报文的格式  
			       response.setContentType("text/xml");  
			       response.setCharacterEncoding("UTF-8");  
			   
			       PrintWriter out = response.getWriter();  
			       out.println(resultBuffer.toString());  
			       out.flush();  
			       out.close();  
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			     
			}
		
		
		
		//标在规定时间内筹满
		@RequestMapping("PaySuccess")
		public void PaySuccess(HttpServletRequest request,HttpServletResponse response) {
				
				//判断请求报文是否来自代维系统的ip地址  
			    String ip = request.getRemoteHost(); 
				
			    System.out.println("ip地址="+ip);
			      
			   
			    try {
			    	//获取接收的报文
					BufferedReader reader=request.getReader();
					
					String line="";
					
					StringBuffer inputString = new StringBuffer();  
				        while ((line = reader.readLine()) != null) {  
				        inputString.append(line);  
				     }  
			       
				    //jackJson    
			        ObjectMapper o=new ObjectMapper();
			      
			        Froze f=o.readValue(inputString.toString(),Froze.class);
			        
			        System.out.println("接收的报文为= "+f);
			        
			        //标的编号
			        String thaw_subjectid=f.getSubjectid();
			        
			        //根据标的编号和冻结状态获取投资人的冻结表
			        Froze fr=new Froze();
			        fr.setSubjectid(thaw_subjectid);//标的编号
			        fr.setFrozestatus("冻结成功");
			        
			        //循环取出每一个投标成功的用户
			        List<Froze> frozeList=frozeService.getFrozeThaw(fr);
			        Date date=new Date();
			        
			        for(Froze fz:frozeList){
			        	
			        	String khcustid=fz.getCustid();//客户号
			        	BigDecimal frozeamt=fz.getFrozeamt();//解冻金额(冻结金额)
			        	
			        	
			        	Integer ordid;
			        	try {
			        	ordid=thawService.getThawMaxId()+1;//订单号
			        	}catch(NullPointerException e) {
			        		
			        		ordid=1;
			        	}
			        	//添加解冻表
			        	Thaw t=new Thaw();
			        	t.setOrdid("t-"+ordid);
			        	t.setCustid(khcustid);
			        	t.setThawamt(frozeamt);
			        	t.setOrddate(date);
			        	thawService.insert(t);	
			        	
			        	//添加解冻流水表
			        	Flow f1=new Flow();
				        f1.setOrdid("t-"+ordid);
				        f1.setMerid("10000001");//操作的商户id(由操作台传过来)   
				        f1.setCustid(khcustid);
				        f1.setTransamt(frozeamt);
				        f1.setRealamt(frozeamt);
				        f1.setOrddate(date);
				        f1.setOrdertype("解冻");
				        f1.setOrderstatus("解冻成功");
				        flowService.insert(f1);
				        
				       
				        
				        //资产表可用和冻结资金修改
				        Assets as=assetsService.getAssetsByCustid(khcustid);			      				       
				        BigDecimal totalMoney=as.getTotalassets();//总资产
				        BigDecimal frozeMoney=as.getFrozenassets();//冻结资产
				        
				        Double totalMoney1=(totalMoney.subtract(frozeamt,mc)).doubleValue();//可用资产
			        	Double frozeMoney1=(frozeMoney.subtract(frozeamt,mc)).doubleValue();//冻结资产			          
				         			           
				        BigDecimal totalMoney2=getBigDecimalByDouble(totalMoney1);
				        BigDecimal frozeMoney2=getBigDecimalByDouble(frozeMoney1);
				           
				        Assets upas=new Assets();
				        upas.setCustid(khcustid);				  
				        upas.setTotalassets(totalMoney2);;
				        upas.setFrozenassets(frozeMoney2);
				        assetsService.upAssets2(upas);
				        
				        
				    
			        }
			        
			        //修改支付表状态
			        //根据支付表的客户号、支付状态、标的编号修改支付状态
			        Pay p=new Pay();
			        p.setOrddate(date);
			        p.setOrdstatus("等待支付");
			        p.setStay1(thaw_subjectid);
			        p.setStay2("支付成功");
			        payService.updatePayStatus(p);
			        //获取流水表的订单号
			        List<Pay> pOrdid=payService.getOrdidByPay(p);
			        
			        //同一个人多次投资
			        for(Pay payOrdid:pOrdid) {
			        
			        String Ordid=payOrdid.getOrdid();
			        System.out.println("oid:"+Ordid);				        
			        
			        
			        				        
			        //修改流水表的状态
			        Flow upf=new Flow();
			        upf.setOrdid(Ordid+"");
			        upf.setOrddate(date);
			        upf.setOrderstatus("支付成功");
			        flowService.upFlowByOid(upf);
			        
			        }
			        
			        
			        StringBuffer resultBuffer=new StringBuffer();
		        	  	
			        System.out.println("返回true");
				    resultBuffer.append("投资完成");
			     
			       // 设置发送报文的格式  
			       response.setContentType("text/xml");  
			       response.setCharacterEncoding("UTF-8");  
			   
			       PrintWriter out = response.getWriter();  
			       out.println(resultBuffer.toString());  
			       out.flush();  
			       out.close();  
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			     
			}
		
		//借款成功
		@RequestMapping("lendMoney")
		public void lendMoney(HttpServletRequest request,HttpServletResponse response) {
				
				//判断请求报文是否来自代维系统的ip地址  
			    String ip = request.getRemoteHost(); 
				
			    System.out.println("ip地址="+ip);
			      
			   
			    try {
			    	//获取接收的报文
					BufferedReader reader=request.getReader();
					
					String line="";
					
					StringBuffer inputString = new StringBuffer();  
				        while ((line = reader.readLine()) != null) {  
				        inputString.append(line);  
				     }  
			       
				    //jackJson    
			        ObjectMapper o=new ObjectMapper();
			      
			        Pay n=o.readValue(inputString.toString(),Pay.class);
			        
			        BigDecimal NeedMoney=n.getTransamt();//借款的金额
			       
			        
			        StringBuffer resultBuffer=new StringBuffer();
			        
			       
			           
			           //给用户资产表添加金额
			           //1.根据电话号码获取用户客户号(注:netsave表的stay1字段已用来装手机号码)
			           Users us=usersService.getByPhone(n.getCustid());
			           //2.根据客户号获取资产表数据
			           Assets as=assetsService.getAssetsByCustid(us.getCustid());
			           BigDecimal totalMoney1=as.getTotalassets();//总资产
			           BigDecimal userMoney1=as.getUseassets();//可用资产
			           
			           Double totalMoney2=(totalMoney1.add(NeedMoney,mc)).doubleValue();
			           Double userMoney2=(userMoney1.add(NeedMoney,mc)).doubleValue();
			           
			           BigDecimal totalMoney3=getBigDecimalByDouble(totalMoney2);
			           BigDecimal userMoney3=getBigDecimalByDouble(userMoney2);
			           
			           Assets upas=new Assets();
			           upas.setCustid(us.getCustid());
			           upas.setTotalassets(totalMoney3);
			           upas.setUseassets(userMoney3);			                
			           assetsService.upAssets(upas);
			           
			      
			           
			           
			           // 要返回的报文  				     
					   resultBuffer.append("借款成功");
					   
					   System.out.println("返回true");
					
			        
			        		      
			       // 设置发送报文的格式  
			       response.setContentType("text/xml");  
			       response.setCharacterEncoding("UTF-8");  
			   
			       PrintWriter out = response.getWriter();  
			       out.println(resultBuffer.toString());  
			       out.flush();  
			       out.close();  
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			     
			}
		
		
		
	
		//判断易支付密码是否正确
		@RequestMapping("PaymentPasswordTorF")
		public void PaymentPasswordTorF(HttpServletRequest request,HttpServletResponse response) {
				
				//判断请求报文是否来自代维系统的ip地址  
			    String ip = request.getRemoteHost(); 
				
			    System.out.println("ip地址="+ip);
			      
			   
			    try {
			    	//获取接收的报文
					BufferedReader reader=request.getReader();
				
					String line="";
					
					StringBuffer inputString = new StringBuffer();  
				        while ((line = reader.readLine()) != null) {  
				        inputString.append(line);  
				     }  
			       
				    //jackJson    
			        ObjectMapper o=new ObjectMapper();
			      
			        Users u=o.readValue(inputString.toString(),Users.class);
			        
			        //MD5加密判断
					Md5Hash md5Hash = new Md5Hash(u.getPwd(),u.getUserphone(),10);
			        
			        System.out.println("接收的报文为= "+u.toString());
			        
			        //得到对象
			        Users us=usersService.getByPhone(u.getUserphone());
			        		        
			        StringBuffer resultBuffer=new StringBuffer();
			        
			        if(md5Hash.toString().equals(us.getPwd())) {//易支付密码正确
			        	
			        	  // 要返回的报文  				     
					      resultBuffer.append("true");
					      System.out.println("返回true");
					      
			        }else {//易支付密码错误
			        			        	 
					      resultBuffer.append("false");
					      System.out.println("返回false");
			        }
			        
			     
			       // 设置发送报文的格式  
			       response.setContentType("text/xml");  
			       response.setCharacterEncoding("UTF-8");  
			   
			       PrintWriter out = response.getWriter();  
			       out.println(resultBuffer.toString());  
			       out.flush();  
			       out.close();  
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			     
		}
		
	
		        //公司放款
				@RequestMapping("gsfk_Money")
				public void gsfk(HttpServletRequest request,HttpServletResponse response) {
						
						//判断请求报文是否来自代维系统的ip地址  
					    String ip = request.getRemoteHost(); 
						
					    System.out.println("ip地址="+ip);
					      
					   
					    try {
					    	//获取接收的报文
							BufferedReader reader=request.getReader();
							
							String line="";
							
							StringBuffer inputString = new StringBuffer();  
						        while ((line = reader.readLine()) != null) {  
						        inputString.append(line);  
						     }  
					       
						    //jackJson    
					        ObjectMapper o=new ObjectMapper();
					      
					        Pay n=o.readValue(inputString.toString(),Pay.class);
					        
					        BigDecimal NeedMoney=n.getTransamt();
					       
					        
					        StringBuffer resultBuffer=new StringBuffer();
					        
					       
					           
					           //给用户资产表添加金额
					           //1.根据电话号码获取用户客户号(注:netsave表的stay1字段已用来装手机号码)
					           Users us=usersService.getByPhone(n.getCustid());
					           //2.根据客户号获取资产表数据
					           Assets as=assetsService.getAssetsByCustid(us.getCustid());
					           BigDecimal totalMoney1=as.getTotalassets();//总资产
					           BigDecimal userMoney1=as.getUseassets();//可用资产
					           
					           Double totalMoney2=(totalMoney1.subtract(NeedMoney,mc)).doubleValue();
					           Double userMoney2=(userMoney1.subtract(NeedMoney,mc)).doubleValue();
					           
					           BigDecimal totalMoney3=getBigDecimalByDouble(totalMoney2);
					           BigDecimal userMoney3=getBigDecimalByDouble(userMoney2);
					           
					           Assets upas=new Assets();
					           upas.setCustid(us.getCustid());
					           upas.setTotalassets(totalMoney3);
					           upas.setUseassets(userMoney3);			                
					           assetsService.upAssets(upas);
					           
					      
					           
					           
					           // 要返回的报文  				     
							   resultBuffer.append("借款成功");
							   
							   System.out.println("返回true");
							
					        
					        		      
					       // 设置发送报文的格式  
					       response.setContentType("text/xml");  
					       response.setCharacterEncoding("UTF-8");  
					   
					       PrintWriter out = response.getWriter();  
					       out.println(resultBuffer.toString());  
					       out.flush();  
					       out.close();  
							
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					     
					}
					
		
		
		
		
		
		
		
	
	public BigDecimal getBigDecimalByDouble(Double d) {//把一个Double类型转换成BigDecimal类型2位小数并四舍五入
		
		BigDecimal b1=new BigDecimal(d);
		
		BigDecimal b2 =b1.setScale(2,BigDecimal.ROUND_HALF_UP);
		
		return b2;
	
	}
	
	//测试
	@RequestMapping("cs")
	@ResponseBody
	public String cs() {
		
		Integer id=netsaveService.getNetsaveMaxId();
		
		System.out.println("最大id:"+id);
		
		return "success";
	}
	
	
	
}
