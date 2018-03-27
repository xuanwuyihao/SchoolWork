package com.ht.means;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Test {
	
	// 默认运算精度,<span style="color:#ff0000;">保留有效数字6位</span>  
    private static final int DEF_DIV_SCALE =6;  
    //RoundingMode.HALF_UP 舍入模式，四舍五入 向上  
	private static MathContext mc = new MathContext(DEF_DIV_SCALE,  RoundingMode.HALF_UP); 
	
	
	
	public static void main(String[] args) {
	
		BigDecimal b1 = new BigDecimal(Double.toString(99.00997089));
		BigDecimal b2 = new BigDecimal(Double.toString(0.005)); 
		
		BigDecimal b11 =b1.setScale(3,BigDecimal.ROUND_HALF_UP);//定义小数点
		System.out.println(b11);
		
		
		//加
		(b1.add(b2,mc)).doubleValue();
		System.out.println("普通:"+(b1.add(b2,mc)).doubleValue());
		

		Double db=(b1.add(b2,mc)).doubleValue();//double定义小数点
		BigDecimal dbf=new BigDecimal(db);
		BigDecimal bb =dbf.setScale(2,BigDecimal.ROUND_HALF_UP);
		System.out.println("小数点后:"+bb);
		
		int res =b1.compareTo(b2);//返回值0表示相等，-1表示小于，1表示大于  
		System.out.println(res); 
		
		
		//multiply 乘
		(b1.multiply(b2, mc)).doubleValue();
		System.out.println("乘后:"+(b1.multiply(b2, mc)).doubleValue());
		
		//减
		System.out.println("uiuiui:"+(b1.subtract(b2, mc)).doubleValue());
		
		BigDecimal a1 = new BigDecimal("1");  
		  
	    BigDecimal a2 = new BigDecimal("2");  
	  
	    System.out.println(""+a1.divide(a2, mc).doubleValue()*100+"%");
	      
		
	}
	
	

}
