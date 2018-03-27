package com.yh.timer;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

    public static void main(String[] args) {
        final Timer timer=new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                System.out.println("定时器");
               timer.cancel();
            }
        },3*1000);

        final Timer timer1=new Timer();
        Calendar calendar=Calendar.getInstance();
        calendar.set(2018,2,14,15,3,0);
        timer1.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("程序运行");
                timer1.cancel();
            }
        },calendar.getTime(),2000);
    }
}
