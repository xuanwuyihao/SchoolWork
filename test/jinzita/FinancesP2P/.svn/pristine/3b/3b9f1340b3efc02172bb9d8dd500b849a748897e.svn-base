package com.p2p.commons;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ExcelRateUtil {
	

	/**
	 * 每月付息，到期还本
	 * planTotal
	 * putIn
	 * time 月份
	 */
	public static double rateTotal(double planTotal,double putIn,int time) {
		
		float year = time*1.0f/12;//月份转换成年
		
		double rate = Math.pow(planTotal/putIn, 1/year) - 1;
		return rate;
	}
	
}
