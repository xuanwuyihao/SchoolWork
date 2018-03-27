package com.yihao.Quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job{

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		Date date=new Date();
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("当前时间"+sf.format(date));
		System.out.println("猪青大傻逼！");
		
		
	}

}
