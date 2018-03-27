package com.ht.means;
import java.math.BigDecimal;  
import java.math.MathContext;  
import java.math.RoundingMode;  
import java.text.DecimalFormat;  
import java.text.DecimalFormatSymbols;  
  
public class MyBigDecimal {  
  
    // 默认运算精度,<span style="color:#ff0000;">保留有效数字6位</span>  
    private static final int DEF_DIV_SCALE = 6;  
    private static MathContext mc = new MathContext(DEF_DIV_SCALE,  
            RoundingMode.HALF_UP); //RoundingMode.HALF_UP 舍入模式，四舍五入 向上  
  
    /** 
     * 测试除法 
     */  
    public static void main(String[] args) {  
        double bb1 = 1;  
        double bb2 = 3;  
        String pattern = "0.000000";    //<span style="color:#ff0000;">保留小数点后6位</span>  
        DecimalFormat df = new DecimalFormat(pattern);  
  
        double res = divide(bb1, bb2);  
        System.out.println(df.format(res));  
    }  
  
    public static double add(double v1, double v2) {  
  
        BigDecimal b1 = new BigDecimal(Double.toString(v1));    //用 new BigDecimal(String str)构造器才能构造出准确的Decimal  
  
        BigDecimal b2 = new BigDecimal(Double.toString(v2));  
  
        return (b1.add(b2, mc)).doubleValue();  
    }  
  
    public static double subtract(double v1, double v2) {  
  
        BigDecimal b1 = new BigDecimal(Double.toString(v1));  
  
        BigDecimal b2 = new BigDecimal(Double.toString(v2));  
  
        return (b1.subtract(b2, mc)).doubleValue();  
    }  
  
    public static double multiply(double v1, double v2) {  
  
        BigDecimal b1 = new BigDecimal(Double.toString(v1));  
  
        BigDecimal b2 = new BigDecimal(Double.toString(v2));  
  
        return (b1.multiply(b2, mc)).doubleValue();  
    }  
  
    public static double divide(double v1, double v2) {  
  
        BigDecimal b1 = new BigDecimal(Double.toString(v1));  
  
        BigDecimal b2 = new BigDecimal(Double.toString(v2));  
  
        return (b1.divide(b2, mc)).doubleValue();  
    }  
  
    public static double divide2(double v1, double v2) {  
  
        BigDecimal b1 = new BigDecimal(Double.toString(v1));  
  
        BigDecimal b2 = new BigDecimal(Double.toString(v2));  
  
        return (b1.divide(b2, DEF_DIV_SCALE, RoundingMode.HALF_UP))  
                .doubleValue();  
    }   
  
    public static double divide3(double v1, double v2) {  
  
        BigDecimal b1 = new BigDecimal(Double.toString(v1));  
  
        BigDecimal b2 = new BigDecimal(Double.toString(v2));  
  
        return (b1.divide(b2, DEF_DIV_SCALE, BigDecimal.ROUND_HALF_UP))  
                .doubleValue();  
    }  
  
}  