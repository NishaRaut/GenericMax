package com.bridgelabz.maxtest;

import com.bridgelabz.max.Maximum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class MaximumTest {
    //Integer max
    @Test
    public void givenThreeInteger_WhenFirstMax_ReturnMax() {
        Integer max = new Maximum<>(Arrays.asList(44,77,88,99,12,4,2)).testMaximum();
        Assert.assertEquals((Integer) 99,max);
    }

    //Double Max
    @Test
    public void givenThreeDouble_WhenFirstMax_ReturnMax() {
        Double max = new Maximum<>(Arrays.asList(6.00,8.00,12.00,99.00,4.00,2.00)).testMaximum();
        Assert.assertEquals((Double) 99.00,max);
    }

    //String max
    @Test
    public void givenThreeString_WhenThirdMax_ReturnMax() {
       String max = new Maximum<>(Arrays.asList("Nisha","Mani","Sweety","shubhu","komal")).testMaximum();
        Assert.assertEquals((String) "shubhu",max);
    }
}
