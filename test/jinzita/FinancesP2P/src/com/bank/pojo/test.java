package com.bank.pojo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.p2p.commons.DEBXInteresUtil;

public class test {
	
	public static void main(String[] args) {
		
		DEBXInteresUtil Debx=new DEBXInteresUtil();
				
		Double a1=Debx.DEBXTotleInteres("100000","12","6");
		
		System.out.println("sc:"+a1);
		
		Date d=new Date();
		Date a=new Date();
		try {
			a=dateAddMonth(d,3);
			System.out.println("时间:"+a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	 public static Date dateAddMonth(Date dt,int i) throws Exception {
    	  
   	  Calendar rightNow = Calendar.getInstance();
   	  rightNow.setTime(dt);
   	  rightNow.add(Calendar.MONTH,i);// 日期加i个月
   	  // rightNow.add(Calendar.DAY_OF_YEAR,10);//日期加10天
   	  Date dt1 = rightNow.getTime();
   	
   	  return dt1;
   	  
   	 }

}
