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
import com.bank.pojo.Pay;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.p2p.pojo.Gathering;
import com.p2p.pojo.Invest;
import com.p2p.pojo.LendBeckonmoney;
import com.p2p.pojo.Still;
import com.p2p.pojo.User;
import com.p2p.pojo.UserMoney;
import com.p2p.service.InvestService;
import com.p2p.service.LendBeckonmoneyService;
import com.p2p.service.PhotoService;
import com.p2p.service.UserMoneyService;
import com.p2p.service.UserService;


public class QuartzJob2 {
	
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
	
	
	public void jkhk() {
		
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("收款还款:"+sf.format(date));
		
		
		
		
		
		//根据还款状态取出还款表
		List<Still> stList=photoService.selStillListByStatus("未偿还");
		for(Still s:stList) {
						
			//修改还款表
			BigDecimal mqyh=s.getStayfine();//每期应还
			Integer zqs=s.getStages();//总期数
			Integer yhqs=s.getStage();//已还期数
			BigDecimal yhbx=s.getHasmoney();//已还本息
			BigDecimal dhbx=s.getStaygold();//待还本息
			
			
			Integer yhqs2=yhqs+1;//已还期数
			Double yhbx1=(yhbx.add(mqyh,mc)).doubleValue();//已还本息
			BigDecimal yhbx2=getBigDecimalByDouble(yhbx1,2);
			
			Double dhbx1=(dhbx.subtract(mqyh,mc)).doubleValue();//待还本息
			BigDecimal dhbx2=getBigDecimalByDouble(dhbx1,2);
			
			s.setStage(yhqs2);
			s.setHasmoney(yhbx2);
			s.setStaygold(dhbx2);
			
			photoService.updateStillByM(s);
			
			
			//扣除借款人用户金额
			//修改借款人资金表
	    	UserMoney j_Money = userMoneyService.getByName(s.getUsername());//借款人资产
	    	BigDecimal j_allMoney=j_Money.getAllmoney();//所有资产
	    	BigDecimal j_needMoney=j_Money.getNeedmoney();//可用金额
	    	BigDecimal j_stillMoney=j_Money.getStillmoney();//待还金额
	    	
	    	
	    	Double j_allMoney1=(j_allMoney.subtract(mqyh,mc)).doubleValue();//原所有资产-还款金额
	    	Double j_needMoney1=(j_needMoney.subtract(mqyh,mc)).doubleValue();//可用金额    
	    	Double j_stillMoney1=(j_stillMoney.subtract(mqyh,mc)).doubleValue();//待还金额	    	
    	
    		
    		BigDecimal j_allMoney2=getBigDecimalByDouble(j_allMoney1,2);
    		BigDecimal j_needMoney2=getBigDecimalByDouble(j_needMoney1,2);
    		BigDecimal j_stillMoney2=getBigDecimalByDouble(j_stillMoney1,2);
    	
    		
    		j_Money.setAllmoney(j_allMoney2);  		
    		j_Money.setNeedmoney(j_needMoney2);
    		j_Money.setStillmoney(j_stillMoney2);   	
    		userMoneyService.updateMoneyByM(j_Money);//修改
			
			//扣除借款人汇付资产
	    	//bean	
    		Pay p=new Pay();	    
    	    p.setCustid(s.getUsername());//电话
    		p.setTransamt(mqyh);//所借金额	
	    	
			ObjectMapper m = new ObjectMapper();  
			String sendStr = null;
			try {
				sendStr = m.writeValueAsString(p);
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
					       "http://localhost:8080/PaymentP2P/pay/gsfk_Money");
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
		        System.out.println("还款成功:" + msg);
		        
		        
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
    		
    		
			
			
			if(yhqs2==zqs) {
				
				s.setStaystatus("已偿还");
				photoService.updateStillByM(s);
				
			}
			
			
			//获取收款表
			Gathering ga=new Gathering();
			ga.setBillcode(s.getLendid()+"");
			List<Gathering> g=photoService.getGatherListByLidAndTitle(ga);
			for(Gathering gath:g) {
				
				BigDecimal tzr_mqyh=gath.getAnswerfine();//每期应收				
				Integer tzr_yhqs=gath.getHasstage();//已还期数
				BigDecimal tzr_yhbx=gath.getHasmoney();//已收本息
			
				Integer tzr_yhqs1=tzr_yhqs+1;
				Double tzr_yhbx1=(tzr_yhbx.add(tzr_mqyh,mc)).doubleValue();//已收本息
				BigDecimal tzr_yhbx2=getBigDecimalByDouble(tzr_yhbx1,2);
				
				gath.setHasstage(tzr_yhqs1);
				gath.setHasmoney(tzr_yhbx2);
				photoService.updateGatheringByM(gath);
				
				//投资人
				User u=userService.getById(gath.getUserid());//用户bean
	    		String phone=u.getPhone();//手机
				
				//修改平台投资用户资产
	    		UserMoney m_Money = userMoneyService.getByName(phone);//用户资产
	    		BigDecimal m_allMoney=m_Money.getAllmoney();//总资产
	    		BigDecimal m_needMoney=m_Money.getNeedmoney();//可用金额
	    		BigDecimal m_gathMoney=m_Money.getGathermoney();//待收金额
	    		
	    		
	    		Double m_allMoney1=(m_allMoney.add(tzr_mqyh,mc)).doubleValue();//原所有资产+还款金额
		    	Double m_needMoney1=(m_needMoney.add(tzr_mqyh,mc)).doubleValue();//可用金额    
		    	Double m_gathMoney1=(m_gathMoney.subtract(tzr_mqyh,mc)).doubleValue();//待收金额	    	
	    	
	    		
	    		BigDecimal m_allMoney2=getBigDecimalByDouble(m_allMoney1,2);
	    		BigDecimal m_needMoney2=getBigDecimalByDouble( m_needMoney1,2);
	    		BigDecimal m_gathMoney2=getBigDecimalByDouble(m_gathMoney1,2);
	    	
	    		
	    		m_Money.setAllmoney(m_allMoney2);  		
	    		m_Money.setNeedmoney(m_needMoney2);
	    		m_Money.setGathermoney(m_gathMoney2);   	
	    		userMoneyService.updateMoneyByM(m_Money);//修改
	    		
	    		//修改投资人汇付资产
	    		//bean	
	    		Pay p1=new Pay();	    
	    	    p1.setCustid(phone);//电话
	    		p1.setTransamt(tzr_mqyh);//所借金额	
		    	
				
				try {
					sendStr = m.writeValueAsString(p1);
				} catch (JsonProcessingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}  
				
				
				
				try {  
			        String strMessage = "";  
			        StringBuffer buffer = new StringBuffer();  
			        // 接报文的地址  
			        URL uploadServlet = null;
					try {
						uploadServlet = new URL(  
						       "http://localhost:8080/PaymentP2P/pay/lendMoney");
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
			        System.out.println("收款成功:" + msg);
			        
			        
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
		
		
		
	System.out.println("收款还款end");	
		
		
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
