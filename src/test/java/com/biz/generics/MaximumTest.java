package com.biz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void checkMaximumInteger(){
        int actualResult=Maximum.getMaximum(3,2,1);
        Assert.assertEquals(3,actualResult);
    }
    @Test
    public void checkMaximumFloat(){
        float actualResult=Maximum.getMaximum(3.1f,2.1f,1.1f);
        Assert.assertEquals(3.1f,actualResult,0.0);
    }
    @Test
    public void checkMaximumString(){
        String actualResult=Maximum.getMaximum("ab","cd","ef");
        Assert.assertEquals("cd",actualResult);
    }
}

