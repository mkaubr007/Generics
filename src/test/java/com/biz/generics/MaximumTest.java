package com.biz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void checkMaximumInteger(){
        int actualResult=Maximum.getMaximum(3,2,1);
        Assert.assertEquals(3,actualResult);
    }
}

