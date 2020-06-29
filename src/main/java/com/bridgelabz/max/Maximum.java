package com.bridgelabz.max;

public class Maximum {
    public Integer findMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber)
    {
        Integer max;
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber)
           max = firstNumber ;
        else if (secondNumber >= firstNumber && secondNumber >= thirdNumber)
            max = secondNumber ;
        else
           max= thirdNumber;
        return max;
    }
    public Double findMaximumFloat(Double firstNumber, Double secondNumber, Double thirdNumber)
    {
        Double max;
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber)
            max = firstNumber ;
        else if (secondNumber >= firstNumber && secondNumber >= thirdNumber)
            max = secondNumber ;
        else
            max= thirdNumber;
        return max;
    }
    public String findMaximumString(String first, String second, String third)
    {
        String max;
        if (first.compareTo(second) >0 && first.compareTo(third)>0)
            max = first ;
        else if (second.compareTo(first)>0 && second.compareTo(third)>0)
            max = second ;
        else
            max= third;
        return max;
    }
}
