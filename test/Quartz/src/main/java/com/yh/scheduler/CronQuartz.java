package com.yh.scheduler;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class CronQuartz {
    /**
     * Cron表达式，字符串
     * 6个部分或7个部分组成，每个部分用空格分割
     *
     * second minute hour date month day year
     * second minute hour date month day
     *
     * 字段　　允许值　　允许的特殊字符
     秒     　 0-59 　　　　, - * /
     分     　 0-59　　　　 , - * /
     小时      0-23 　　　　, - * /
     日期      1-31 　　　　, - * ? / L W C
     月份      1-12 　　　　, - * /
     星期      1-7 　　　　  , - * ? / L C #
     年     1970-2099 　　, - * /

     日期与星期只能出现其中一个，另外一个直接使用？表示不确定的一定值
     ,表示多个值
     -表示一个范围的值
     *表示任意值
     *
     * 2018年3月14日上午10上午30分30秒
     * 30 30 10 14 3 ？2018
     *
     * 2018年3月14日上午10点或12点，30分或50分，30秒
     * 30 30,50 10,12 14 3 ? 2018
     *
     * 每一年的3月14日晚上20点0分0秒到22点0分0秒
     * 0 0 20-22 14 3 ？ *
     *
     * 每一年的3月14日晚上20点0分任意秒到22点0分任意秒
     * * 0 20-22 14 3 ？ *
     *
     * 2018年3月14日上午10上午30分30秒，每隔5秒
     * 30/5 30 10 14 3 ? 2018
     *
     * 每年每月的星期六上午8点0分0秒
     * 0 0 8 ? * 7 *
     *
     */

    public static void main(String[] args) {

        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            JobDetail jobDetail= JobBuilder.newJob(CacheClearJob.class)
                    .withIdentity("cacheClearJob","job_group").build();

            Trigger trigger=TriggerBuilder.newTrigger()
                    .withIdentity("cacheClear","trigger_group")
                    .withSchedule(CronScheduleBuilder.cronSchedule("0/5 33 19 14 * ? *")).build();
            scheduler.start();
            scheduler.scheduleJob(jobDetail,trigger);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
