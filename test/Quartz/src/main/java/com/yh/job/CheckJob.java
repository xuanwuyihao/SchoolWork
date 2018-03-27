package com.yh.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CheckJob {
    @Scheduled(cron = "0/5 * * * * ?")
    public void run(){
        System.out.println("发财！");
    }
}
