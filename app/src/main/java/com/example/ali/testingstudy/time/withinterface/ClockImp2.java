package com.example.ali.testingstudy.time.withinterface;

import java.util.Date;

/**
 * Created by Ali on 22/11/2017.
 * "See the good."
 */

public class ClockImp2 implements Clock {
    @Override
    public Date getDate() {
        return new Date();
    }
}
