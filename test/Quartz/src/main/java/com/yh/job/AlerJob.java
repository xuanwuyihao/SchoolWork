package com.yh.job;

import org.springframework.stereotype.Component;

@Component
public class AlerJob {
    public void run(){
        System.out.println("赚钱！");
    }

}
