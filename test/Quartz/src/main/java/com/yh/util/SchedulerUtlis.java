package com.yh.util;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class SchedulerUtlis {

    private static void modify(String jobName,String jobGroup,String triggerName,String triggerGroup,String cronExp){
        try {
            Scheduler scheduler= StdSchedulerFactory.getDefaultScheduler();
            JobDetail jobDetail =scheduler.getJobDetail(new JobKey(jobName,jobGroup));
            TriggerKey triggerKey = new TriggerKey(triggerName,triggerGroup);
            Trigger trigger =scheduler.getTrigger(triggerKey);
            TriggerBuilder triggerBuilder =trigger.getTriggerBuilder();
            triggerBuilder.withSchedule(CronScheduleBuilder.cronSchedule(cronExp));
            //根据触发器来取消任务调动
            scheduler.unscheduleJob(triggerKey);
            //以新的触发规则来调动任务
            scheduler.scheduleJob(jobDetail,triggerBuilder.build());
        } catch (SchedulerException e) {
            e.printStackTrace();
        }

    }
}
