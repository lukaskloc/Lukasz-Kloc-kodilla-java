package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void logTest() {
        //Given
        Logger.getInstance().log("something");
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("something", result);
    }
}
