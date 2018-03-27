package com.p2p.commons;

import java.math.BigDecimal;
import java.text.DecimalFormat;


public class MoneyUtil {

	public static DecimalFormat fnum = new DecimalFormat("##0.00000000000000000000");
	
	/**
	 * 格式化金额
	 */
	public static String formatMoney(String value) {
		
		if(value==null||value=="") {
			
			value = "0.00";
		}
	
		return fnum.format(new BigDecimal(value));
	}
	
	
	/**
	 * 金额相加
	 * valueStr 基础值 
     * minusValueStr 被加数 
	 */
	public static BigDecimal moneyAdd(BigDecimal value,BigDecimal augend) {
		
		return value.add(augend);
	}
	
	
	/**
	 * 金额相减
	 * valueStr 基础值 
     * minusValueStr 减数
	 */
	public static String moneySub(String valueStr,String minusStr){  
        BigDecimal value= new BigDecimal(valueStr);  
        BigDecimal subtrahend = new BigDecimal(minusStr);  
        return fnum.format(value.subtract(subtrahend));  
    }  
	
	/** 
     * 金额相减 
     * @param value 基础值 
     * @param subtrahend 减数 
     * @return 
     */  
    public static BigDecimal moneySub(BigDecimal value,BigDecimal subtrahend){  
        return value.subtract(subtrahend);  
    }  

    
    /**
     * 金额相乘
     */
    public static BigDecimal moneyMul(BigDecimal value, BigDecimal mulValue) {
    	return value.multiply(mulValue);
    }
    
    
    /**
     * 金额相除
     * 精确到两位小数
     */
    public static String moneyDiv(String valueStr,String divideStr) {
    	BigDecimal value = new BigDecimal(valueStr);
    	BigDecimal divideValue = new BigDecimal(divideStr);
		return fnum.format(value.divide(divideValue,2,BigDecimal.ROUND_HALF_UP));
    }
    
    /**
     * 
     * 金额相除
     * 精确到两位小数
     */
    public static BigDecimal moneydiv(BigDecimal value,BigDecimal divideValue) {
		return value.divide(divideValue,2,BigDecimal.ROUND_HALF_UP);
    }
    
    
    /** 
    * 值比较大小 
    * 如果valueStr大于等于compValueStr,则返回true,否则返回false 
    * true 代表可用余额不足 
    * valueStr (需要消费金额) 
    * compValueStr (可使用金额) 
    */  
    public static boolean moneyComp(String valueStr,String compValueStr) {
    	  BigDecimal value = new BigDecimal(valueStr);  
          BigDecimal compValue = new BigDecimal(compValueStr);  
          //0:等于    >0:大于    <0:小于  
          int result = value.compareTo(compValue);  
          if(result >= 0){  
              return true;  
          }else{  
              return false;  
          }  
    }
    
    
    /**
     * 值比较大小
     */
    public static boolean moneyComp(BigDecimal valueStr,BigDecimal compValueStr){  
        //0:等于    >0:大于    <0:小于  
        int result = valueStr.compareTo(compValueStr);  
        if(result >= 0){  
            return true;  
        }else{  
            return false;  
        }  
    }  
    
    
    
    
}
