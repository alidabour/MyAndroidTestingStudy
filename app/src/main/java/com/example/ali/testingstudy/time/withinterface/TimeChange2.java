package com.example.ali.testingstudy.time.withinterface;

/**
 * Created by Ali on 22/11/2017.
 * "See the good."
 */

public class TimeChange2 {
    private final Clock dateTime;

    public TimeChange2(final Clock dateTime){
        this.dateTime = dateTime;
    }
    public long getDoubleTime(){
        return dateTime.getDate().getTime()*2;
    }
}
