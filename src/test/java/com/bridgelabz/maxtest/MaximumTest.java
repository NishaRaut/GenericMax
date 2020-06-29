package com.bridgelabz.maxtest;

import com.bridgelabz.max.Maximum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumTest {
    //Integer max
    @Test
    public void givenThreeInteger_WhenFirstMax_ReturnMax() {
        Integer max = new Maximum<>(12,4,2).testMaximum();
        Assert.assertEquals((Integer) 12,max);
    }
    @Test
    public void givenThreeInteger_WhenSecondMax_ReturnMax() {
        Integer max = new Maximum<>(12,13,2).testMaximum();
        Assert.assertEquals((Integer) 13,max);
    }
    @Test
    public void givenThreeInteger_WhenThirdMax_ReturnMax() {
        Integer max = new Maximum<>(12,4,22).testMaximum();
        Assert.assertEquals((Integer) 22,max);
    }

    //Double Max
    @Test
    public void givenThreeDouble_WhenFirstMax_ReturnMax() {
        Double max = new Maximum<>(12.00,4.00,2.00).testMaximum();
        Assert.assertEquals((Double) 12.00,max);
    }
    @Test
    public void givenThreeDouble_WhenSecondMax_ReturnMax() {
        Double max = new Maximum<>(12.00,13.00,2.00).testMaximum();
        Assert.assertEquals((Double) 13.00,max);
    }
    @Test
    public void givenThreeDouble_WhenThirdMax_ReturnMax() {
        Double max = new Maximum<>(12.00,4.00,22.00).testMaximum();
        Assert.assertEquals((Double) 22.00,max);
    }

    //String max

    //Double Max
    @Test
    public void givenThreeString_WhenFirstMax_ReturnMax() {
        String  max = new Maximum<>("Sweety","Nisha","Mani").testMaximum();
        Assert.assertEquals((String) "Sweety",max);
    }
    @Test
    public void givenThreeString_WhenSecondMax_ReturnMax() {
        String max = new Maximum<>("Mani","Sweety","Nisha").testMaximum();
        Assert.assertEquals((String) "Sweety",max);
    }
    @Test
    public void givenThreeString_WhenThirdMax_ReturnMax() {
        String max = new Maximum<>("Nisha","Mani","Sweety").testMaximum();
        Assert.assertEquals((String) "Sweety",max);
    }
}
