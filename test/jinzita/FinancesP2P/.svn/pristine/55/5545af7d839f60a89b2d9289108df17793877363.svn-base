package com.p2p.commons;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


/**
 * 时间工具类
 * 
 * @author Administrator
 *
 */

public class UtilDate {
	
	/**年月日时分秒（无下划线）**/
	public static final String dtLong = "yyyyMMddHHmmss";
	
	/**完整时间  **/
	public static final String simple = "yyyy-MM-dd HH:mm:ss";
	
	/**年月日(无下划线) yyyyMMdd    */
	public static final String dtShort = "yyyyMMdd";
	
	/**年月日（下划线）yyyy-MM-dd */
	public static final String _dtShort = "yyyy-MM-dd";
	
	/**年份 */
	public static final String year = "yyyy";
	
	/**
	 * 
	 * 返回系统当前时间（精确到毫秒），格式：yyyyMMddHHmmss
	 * @return
	 */
	public static String getOrderNum() {
		
		Date date = new Date();
		DateFormat df = new SimpleDateFormat(dtLong);
		return df.format(date);
		
	}
	
	
	/**
	 * 返回系统当前时间,格式：yyyy-MM-dd HH:mm:ss
	 */
	public static String getDateFormatter() {
		
		Date date = new Date();
		DateFormat df = new SimpleDateFormat(simple);
		
		return df.format(date);

	}
	
	
	/**获取系统当期年月日(精确到天)，格式：yyyyMMdd */
	public static String getDate() {
		
		Date date = new Date();
		
		DateFormat df = new SimpleDateFormat(dtShort);
		
		return df.format(date);	
	}
	
	
	/**
	 * 产生随机的三位数以内的数0-999
	 * 
	 */
	public String getThrees() {
		
		Random rad = new Random();
		
		System.out.println(rad.nextInt(1000)+"");
		return rad.nextInt(1000)+"";
		
		
		/*int max=999;
        int min=100;
        Random random = new Random();


        int s = random.nextInt(max)%(max-min+1) + min;
        System.out.println(s);*/
		
	}
	
	
	/**
	 * 获取当月的第一天
	 */
	public String getMonthFirstDay() {
		
		Calendar calendar = Calendar.getInstance();
		Calendar f = (Calendar) calendar.clone();
		
		f.clear();
		f.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
		f.set(Calendar.MARCH, calendar.get(Calendar.MARCH));
		String firstday = new SimpleDateFormat("yyyy-MM-dd").format(f.getTime());
		
		return firstday;	
	}
	
	
	
	
	/**
	 * 获取当月的最后一天
	 */
	public static String getMonthLastDay() {
		
		Calendar cal = Calendar.getInstance();
		Calendar day = (Calendar) cal.clone();
		day.clear();
		day.set(Calendar.YEAR, cal.get(Calendar.YEAR));
		day.set(Calendar.MONTH, cal.get(Calendar.MONTH)+1);
		day.set(Calendar.MILLISECOND, -1);
		String lastday = new SimpleDateFormat("yyyy-MM-dd").format(day.getTime());
		//lastday = lastday+" 23:59:59";
		return lastday;
	} 
	
	
	/**
	 * 获取昨天的日期
	 * 
	 */
	public static String getYesterDay() {
		
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, -1);
		String lastday = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()); 
		
		return lastday;
	}
	
	
	
	
	/**
	 * 获取明天的日期
	 * 
	 */
	public static String getMingDay() {
		
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, 1);
		String lastday = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()); 

		return lastday;
	}
	
	
	/**
	 * 计算两个时间之间相差的天数
	 * 
	 */
	public static long getdayss(Date startDate,Date endDate) throws ParseException {
	
		long days = 0;
		long start = startDate.getTime();
		long end = endDate.getTime();
		//一天的毫秒数1000 * 60 * 60 * 24=86400000
		days = (end - start) / 86400000;
		return days;
	}
	
	
	/**
	 * 计算两个时间相差的秒数 
	 */
	public static long diffTimes(Date startDate,Date endDate) {
		
		long days = 0;
		long start = startDate.getTime();
		long end = endDate.getTime();
		days = (end-start)/1000;
		return days;
	}
	
	
	/** 
     * 计算剩余时间 (多少天多少时多少分)
     *  startDateStr 
     *  endDateStr 
     *
     */  
    public static String remainDateToString(Date startDate, Date endDate){
   
    	StringBuilder result = new StringBuilder();
    	if(endDate == null ){
    		return "过期";
    	}
    	long times = endDate.getTime() - startDate.getTime();
    	if(times < -1){
    		result.append("过期");
    	}else{
    		long temp = 1000 * 60 * 60 *24;
    		//天数
    		long d = times / temp;

    		//小时数
    		times %= temp;
    		temp  /= 24;
    		long m = times /temp;
    		//分钟数
    		times %= temp;
    		temp  /= 60;
    		long s = times /temp;
    		
    		result.append(d);
    		result.append("天");
    		result.append(m);
    		result.append("小时");
    		result.append(s);
    		result.append("分");
    	}
    	return result.toString();
    }  
}
