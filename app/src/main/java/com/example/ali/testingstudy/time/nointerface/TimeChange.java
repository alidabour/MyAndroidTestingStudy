package com.example.ali.testingstudy.time.nointerface;


/**
 * Created by Ali on 22/11/2017.
 * "See the good."
 */

public class TimeChange {

    private final ClockImp dateTime;

    public TimeChange(final ClockImp dateTime){
        this.dateTime = dateTime;
    }
    public long getDoubleTime(){
        return dateTime.getDate().getTime()*2;
    }
}
