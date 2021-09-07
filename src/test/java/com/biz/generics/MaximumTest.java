package com.biz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void checkMaximumString(){
        String actualResult=Maximum.getMaximum("ab","cd","ef");
        Assert.assertEquals("cd",actualResult);
    }

}

