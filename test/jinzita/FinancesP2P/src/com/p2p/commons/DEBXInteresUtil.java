package com.p2p.commons;

import java.math.BigDecimal;

public class DEBXInteresUtil {
	/*
	 * 等额本息总利息计算方法
	 * 		月利率		=	年化收益利率/12
	 * 		每月本息总额	= 	投资总金额*月利率*(1+月利率)^还款期数/[(1+月利率)^还款期数   - 1]
	 * 		本息总额		= 	每月本息总额*期数
	 * 		第一期还款利息	= 	投资总金额*月利率
	 * 		第一期还款本金	= 	每月本息总额    -  第一期还款利息 
	 * 		每月应还本金	第n期应还本金	=	 第一期还款本金*(1+月利率)^n-1	
	 * 		每月应还利息	=	每月本息总额    -  每月应还本金
	 */
	
	//等额本息每月应还本息计算
	//借款金额、年化利率，总期数
	public Double DEBXMTotleInteres(String tzmoney,String rate,String time) {
		DEBXInteresUtil debx = new DEBXInteresUtil();

		Double result = null;
		//年化利率
		BigDecimal yrate = new BigDecimal(rate);
		//还款期数
		BigDecimal num = new BigDecimal(time.toString());
		//借款金额
		BigDecimal money = new BigDecimal(tzmoney);
		
		//计算月利率
		Double m = debx.mrate(rate);
		BigDecimal mrate = new BigDecimal(m.toString());
		System.out.println("月利率"+mrate);
		
		
		//计算每月应还本息
		
		BigDecimal yi = new BigDecimal("1");
		//总金额*月利率   bigdecimal m1
		BigDecimal m1 = money.multiply(mrate);
		//1+月利率   bigdecimal m2
		BigDecimal m2 = mrate.add(yi);
		//将期数转换成double  w
		Double w = new Double(time.toString());
		//1+月利率的期数次方    double  d
		Double d = Math.pow(m2.doubleValue(),w);
		//将1+月利率的期数次方  转换成bigdecimal
		BigDecimal g = new BigDecimal(d.toString());
		//1+月利率的 期数次方  -1
		BigDecimal r = g.subtract(yi);
		
		// 分子
		BigDecimal m3 = m1.multiply(g);
		// 分子/分母     取小数点后两位小数   去掉后面的其他小数     每月还款本息  m4
		BigDecimal m4 = m3.divide(r,2,BigDecimal.ROUND_DOWN);
		//每月还款本息   result
		result = m4.doubleValue();
		return result ;
	}
	
	//等额本息总还款本息计算
	public Double DEBXTotleInteres(String tzmoney,String rate,String time) {
		Double result = null;
		DEBXInteresUtil debx = new DEBXInteresUtil();
		//等额本息月本息
		Double m = debx.DEBXMTotleInteres(tzmoney, rate, time);
		//月本息转换成bigdecimal
		BigDecimal m1 = new BigDecimal(m.toString());
		//期数转换成bigdecimal
		BigDecimal m2 = new BigDecimal(time.toString());
		//月本息*期数
		BigDecimal r = m1.multiply(m2);
		result = r.doubleValue();
		return result;
	}
	
	//第一期还款利息计算
	public Double FirstInterest(String tzmoney,String rate) {
		Double result = null;
		DEBXInteresUtil debx = new DEBXInteresUtil();
		//投资金额
		BigDecimal money = new BigDecimal(tzmoney);
		//计算月利率
		Double m = debx.mrate(rate);
		//转换成bigdecimal
		BigDecimal mrate = new BigDecimal(m.toString());
		
		//第一期还款本金 = 投资金额*月利率
		BigDecimal r = money.multiply(mrate);
		result = r.doubleValue();
		return result;
	}
	
	
	//第一期还款本金计算
	public Double FirstPrincipal(String tzmoney,String rate,String time) {
		Double result = null;
		DEBXInteresUtil debx = new DEBXInteresUtil();
		//每月还款本息
		Double d1 = debx.DEBXMTotleInteres(tzmoney, rate, time);
		//第一期还款利息
		Double d2 = debx.FirstInterest(tzmoney, rate);
		//转换成bigdecimal
		BigDecimal m1 = new BigDecimal(d1.toString());
		BigDecimal m2 = new BigDecimal(d2.toString());
		BigDecimal r = m1.subtract(m2);
		result = r.doubleValue();
		return result;
	}
	
	
	//月利率计算
	public Double mrate(String rate) {
		Double result = null;
		//年化利率
		BigDecimal yrate = new BigDecimal(rate);
		//计算月利率   mrate
		BigDecimal b = new BigDecimal("100");
		BigDecimal y = new BigDecimal("12");
		BigDecimal t = yrate.divide(b,4,BigDecimal.ROUND_HALF_UP);
		BigDecimal mrate = t.divide(y,4,BigDecimal.ROUND_HALF_UP);
		result = mrate.doubleValue();
		return result;
	}
	
	//1+月利率计算
	public Double yi(String rate) {
		Double result = null;
		DEBXInteresUtil debx = new DEBXInteresUtil();
		//月利率
		Double d = debx.mrate(rate);
		//月利率转换成bigdecimal
		BigDecimal y1 = new BigDecimal(d.toString());
		BigDecimal y2 = new BigDecimal("1");
		BigDecimal r = y1.add(y2);
		result = r.doubleValue();
		return result;
	}
	
	//每月应还本金计算  投资总额,年化利率,当前还款期数，总期数
	public Double EverPrincipal(String tzmoney,String rate,String time,String t) {
		//期数-1
		Double num = new Double(Integer.parseInt(time)-1);
		Double result = null;
		DEBXInteresUtil debx = new DEBXInteresUtil();
		//计算第一期应还本金
		Double f1 = debx.FirstPrincipal(tzmoney, rate,t);
		//计算1+月利率
		Double f2 = debx.yi(rate);
		//计算(1+月利率)^n-1
		Double d = Math.pow(f2,num);
		//转换成bigdecimal
		BigDecimal b1 = new BigDecimal(f1.toString());
		BigDecimal b2 = new BigDecimal(d.toString());
		BigDecimal r = b1.multiply(b2);
		result = r.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		return result;
	}
	
	//每月应还利息计算 
	public	Double EverInteres(String tzmoney,String rate,String time) {
		Double result = null;
		DEBXInteresUtil debx = new DEBXInteresUtil();
		//每月本息
		Double d = debx.DEBXMTotleInteres(tzmoney, rate, time);
		//转换成bidecimal
		BigDecimal b = new BigDecimal(d.toString());
		return result;
	}
	
	
	
	public static void main(String[] args) {
		DEBXInteresUtil debx = new DEBXInteresUtil();
//		System.out.println(debx.DEBXMTotleInteres("100", "11.0", 5f));
		System.out.println(debx.DEBXTotleInteres("100.09",  "12.0", "6"));
//		System.out.println(debx.FirstPrincipal("100", "11.0",5f));
//		System.out.println("第一期还款利息"+debx.FirstInterest("100", "11.0"));
//		System.out.println("第一期还款本金"+debx.FirstPrincipal("100", "11.0", 5.0f));
//		System.out.println("本期应还本金"+debx.EverPrincipal("100","11.0",4.0f,"5"));
	}
}
