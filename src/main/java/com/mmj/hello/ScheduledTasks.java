package com.mmj.hello;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by MaMingJiang on 2016/4/17.
 */
@Component
public class ScheduledTasks {

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("ScheduledTasks.reportCurrentTime:"+new Date().toString());
    }
}
