package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLogTest(){
        //Given
        Logger.getInstatnce().log("Singleton");
        //When
        String lastLog = Logger.getInstatnce().getLastLog();
        //Then
        Assert.assertEquals("Singleton", lastLog);
    }

}