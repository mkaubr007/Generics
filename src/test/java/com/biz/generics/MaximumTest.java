package com.biz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void checkMaximumInteger(){
        int actualResult=Maximum.getMaximum(3,2,15,6,8,9);
        Assert.assertEquals(15,actualResult);
    }
    @Test
    public void checkMaximumFloat(){
        float actualResult=Maximum.getMaximum(3.1f,2.1f,1.1f,9.2f,4.8f,10.8f);
        Assert.assertEquals(10.8f,actualResult,0.0);
    }
    @Test
    public void checkMaximumString(){
        String actualResult=Maximum.getMaximum("ab","cd","ef","gh","ij");
        Assert.assertEquals("ij",actualResult);
    }
}

