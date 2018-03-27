package com.p2p.quartz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.bank.pojo.Froze;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.p2p.pojo.Gathering;
import com.p2p.pojo.Invest;
import com.p2p.pojo.LendBeckonmoney;
import com.p2p.pojo.User;
import com.p2p.pojo.UserMoney;
import com.p2p.service.InvestService;
import com.p2p.service.LendBeckonmoneyService;
import com.p2p.service.PhotoService;
import com.p2p.service.UserMoneyService;
import com.p2p.service.UserService;


public class QuartzJob1 {
	
	// 默认运算精度,<span style="color:#ff0000;">保留有效数字6位</span>  
    private static final int DEF_DIV_SCALE =20;  
    //RoundingMode.HALF_UP 舍入模式，四舍五入 向上  
	private static MathContext mc = new MathContext(DEF_DIV_SCALE,RoundingMode.HALF_UP); 
	
	@Resource(name = "lendBeckonmoneyServiceImpl")
	private LendBeckonmoneyService lendBeckonmoneyService;
	
	@Resource(name = "investServiceImpl")
	private InvestService investService;
	
	@Resource(name = "userServiceImpl")
	private UserService userService;
	
	@Resource(name = "userMoneyServiceImpl")
	private UserMoneyService userMoneyService;
	
	@Resource(name = "photoServiceImpl")
	private PhotoService photoService;
	
	
	
	public void pdlb(){
		
				
		
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("判断流标:"+sf.format(date));
	
		
		List<LendBeckonmoney> lbkList=lendBeckonmoneyService.selLbkByStatus("招标中");
		
		for(LendBeckonmoney lbk:lbkList) {//循环判断
			
			
			Date stillTime=null;
			try {
				stillTime = dateAddMonth(lbk.getReleasetime(),lbk.getRaisetime());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("时间："+sf.format(stillTime));
			
			//判断流标
			if(date.getTime()>=stillTime.getTime()) {//当前时间大于或等于筹标时间
				
				lbk.setStatus("流标");
				lendBeckonmoneyService.upateStatus(lbk);
				
				//循环所有投资过这个标的人的总金额,冻结金额...[创建收款表]
		    	List<Invest> lbInList=investService.getInvestBybid(lbk.getId()+"");
		    	for(Invest f:lbInList) {
		    		
		    		Integer userId=f.getUserid();//投资人id
		    		BigDecimal tzMoney=f.getInvestmoney();//投资金额
		    		System.out.println("投资金额:"+tzMoney);
		    		User u=userService.getById(userId);//用户bean
		    		String phone=u.getPhone();//手机
		    		
		    		//修改投资表状态
		    		f.setOrdstatus("标已作废");
		    		investService.updateInvestStatus(f);
		    		
		    		
		    		//平台用户资金表
		    		UserMoney um1=userMoneyService.getByName(phone);	 	
		    		BigDecimal userMoney=um1.getNeedmoney();//可用金额
		    		BigDecimal frozeMoney=um1.getFrozenmoney();//冻结金额
		    			       	        	
		        	Double userMoney1=(userMoney.add(tzMoney,mc)).doubleValue();//可用资产加投资金额
		        	Double frozeMoney1=(frozeMoney.subtract(tzMoney,mc)).doubleValue();//冻结资产减去投资金额			          
		             			           
		            BigDecimal userMoney2=getBigDecimalByDouble(userMoney1,2);
		            BigDecimal frozeMoney2=getBigDecimalByDouble(frozeMoney1,2);
		            
		            um1.setNeedmoney(userMoney2);
		            um1.setFrozenmoney(frozeMoney2);
		           	          		
		    		userMoneyService.updateMoneyByM(um1);
			    	
   		
		    	}
		    	
		    	
		    	
		    	//易支付解冻
		    	//bean	
		    	Froze fr=new Froze();
		    			
		    	fr.setSubjectid(lbk.getId()+"");
		    	
				ObjectMapper m = new ObjectMapper();  
				String sendStr = null;
				try {
					sendStr = m.writeValueAsString(fr);
				} catch (JsonProcessingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}  
				
				
				BufferedReader reader = null;
				String msg="";
				try {  
			        String strMessage = "";  
			        StringBuffer buffer = new StringBuffer();  
			        // 接报文的地址  
			        URL uploadServlet = null;
					try {
						uploadServlet = new URL(  
						       "http://localhost:8080/PaymentP2P/pay/thaw");
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
			        HttpURLConnection servletConnection = null;
					try {
						servletConnection = (HttpURLConnection) uploadServlet  
						       .openConnection();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
			        // 设置连接参数  
			        try {
						servletConnection.setRequestMethod("POST");
					} catch (ProtocolException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
			        servletConnection.setDoOutput(true);  
			        servletConnection.setDoInput(true);  
			        servletConnection.setAllowUserInteraction(true);  
			        // 开启流，写入XML数据  
			        OutputStream output = null;
					try {
						output = servletConnection.getOutputStream();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
			        System.out.println("发送的报文：");  
			        System.out.println(sendStr);  
			        try {
						output.write(sendStr.getBytes());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
			        try {
						output.flush();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
			        try {
						output.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
			        
			        
			        // 获取返回的数据  
			        InputStream inputStream = null;
					try {
						inputStream = servletConnection.getInputStream();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
			        reader = new BufferedReader(new InputStreamReader(inputStream));  
			        try {
						while ((strMessage = reader.readLine()) != null) {  
						   buffer.append(strMessage);  
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
			        msg = buffer.toString();
			        System.out.println("解冻:" + msg);
			        
			        
			    } catch (Exception e) {  
			        try {
						throw new Exception();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}  
			    } finally {  
			        if (reader != null) {  
			           try {
						reader.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
			       }  
			    }  
		
				
				
			}
		
			
		}
		
	
	}
	
	
	
	 public static Date dateAddMonth(Date dt,int i) throws Exception {
	    	
   	  Calendar rightNow = Calendar.getInstance();
   	  rightNow.setTime(dt);
   	  rightNow.add(Calendar.MONTH,i);// 日期加i个月
   	  Date dt1 = rightNow.getTime();
   	 
   	  return dt1;
   	  
   	 }
	 
	 
	 public BigDecimal getBigDecimalByDouble(Double d,Integer i) {//把一个Double类型转换成BigDecimal类型i位小数并四舍五入
			
			BigDecimal b1=new BigDecimal(d);
			
			BigDecimal b2 =b1.setScale(i,BigDecimal.ROUND_HALF_UP);
			
			return b2;
		
		}
	
}
