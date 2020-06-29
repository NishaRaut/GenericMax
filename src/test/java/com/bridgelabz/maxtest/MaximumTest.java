package com.bridgelabz.maxtest;

import com.bridgelabz.max.Maximum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumTest {
    Maximum maximum;
    @Before
    public void createObjectOf_MaximumVariableClass()
    {
        maximum = new Maximum();
    }
    //Integer max
    @Test
    public void givenThreeInteger_WhenFirstMax_ShouldReturnFirstNumber() {
        Integer max = maximum.findMaximum(12, 6, 3);
        Assert.assertEquals(java.util.Optional.of(12),java.util.Optional.of(max));
    }
    @Test
    public void givenThreeInteger_WhenSecondMax_ShouldReturnThirdNumber() {
        Integer max = maximum.findMaximum(12, 16, 3);
        Assert.assertEquals(java.util.Optional.of(16),java.util.Optional.of(max));
    }
    @Test
    public void givenThreeInteger_WhenThirdMax_ShouldReturnThirdNumber() {
        Integer max = maximum.findMaximum(12, 6, 33);
        Assert.assertEquals(java.util.Optional.of(33),java.util.Optional.of(max));
    }
    //Float max
    @Test
    public void givenThreeFloatValues_WhenFirstMax_ShouldReturnFirstNumber() {
        Double max = maximum.findMaximumFloat(12.00, 6.00, 3.00);
        Assert.assertEquals(java.util.Optional.of(12.00),java.util.Optional.of(max));
    }
    @Test
    public void givenThreeFloatValues_WhenSecondMax_ShouldReturnThirdNumber() {
        Double max = maximum.findMaximumFloat(12.00, 16.00, 3.00);
        Assert.assertEquals(java.util.Optional.of(16.00),java.util.Optional.of(max));
    }
    @Test
    public void givenThreeFloatValues_WhenThirdMax_ShouldReturnThirdNumber() {
        Double max = maximum.findMaximumFloat(12.00, 6.00, 33.00);
        Assert.assertEquals(java.util.Optional.of(33.00),java.util.Optional.of(max));
    }

    //String max

    public void givenThreeStringValues_WhenFirstMax_ShouldReturnFirstNumber() {
        Integer max = maximum.findMaximumString(12, 6, 3);
        Assert.assertEquals(java.util.Optional.of(12),java.util.Optional.of(max));
    }
    @Test
    public void givenThreeStringValues_WhenSecondMax_ShouldReturnThirdNumber() {
        Integer max = maximum.findMaximumString(12, 16, 3);
        Assert.assertEquals(java.util.Optional.of(16),java.util.Optional.of(max));
    }
    @Test
    public void givenThreeStringValues_WhenThirdMax_ShouldReturnThirdNumber() {
        Integer max = maximum.findMaximum(12, 6, 33);
        Assert.assertEquals(java.util.Optional.of(33),java.util.Optional.of(max));
    }

}
