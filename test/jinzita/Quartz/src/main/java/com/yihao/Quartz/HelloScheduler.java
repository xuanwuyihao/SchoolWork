package com.yihao.Quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class HelloScheduler {
		public static void main(String[] args) throws SchedulerException {
			//创建有个jobDetail实例 ，将该实例与HelloJob Class绑定
			JobDetail jobDetail=JobBuilder.newJob(HelloJob.class).usingJobData("message","猪青大傻逼")
					.usingJobData("FloatJobvalue",3.22F).withIdentity("myJob","group1").build();
			
			//创建一个Trigger实例，定义该job立即执行，并且没两秒执行一次
			Trigger trigger=TriggerBuilder.newTrigger().withIdentity("myTrigger","group1")
					.usingJobData("message","猪青大傻逼").usingJobData("DobleTriggerValue",3.0D).startNow().usingJobData("DoubleTirggerValue",3.33).withSchedule
					(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever()).build();
			//创建Scheduler实例
			SchedulerFactory sf=new StdSchedulerFactory();
			Scheduler scheduler=sf.getScheduler();
			scheduler.start();
			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println("当前时间为:"+sdf.format(date));
			scheduler.scheduleJob(jobDetail,trigger);
		}
}
