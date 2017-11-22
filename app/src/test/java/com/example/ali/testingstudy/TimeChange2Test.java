package com.example.ali.testingstudy;

import com.example.ali.testingstudy.time.withinterface.Clock;
import com.example.ali.testingstudy.time.withinterface.TimeChange2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Date;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Ali on 22/11/2017.
 * "See the good."
 */


@RunWith(MockitoJUnitRunner.class)
public class TimeChange2Test {
    private TimeChange2 timeChangeTest;

    @Before
    public void setUp(){
        final Date date = Mockito.mock(Date.class);
        Mockito.when(date.getTime()).thenReturn(10L);
        final Clock dt = Mockito.mock(Clock.class);
        Mockito.when(dt.getDate()).thenReturn(date);
        timeChangeTest = new TimeChange2(dt);
    }

    @Test
    public void timeTest(){
        final long doubleTime = timeChangeTest.getDoubleTime();
        assertEquals(20,doubleTime);
    }

}
