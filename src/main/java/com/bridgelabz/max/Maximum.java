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
    public Integer findMaximumString(Integer firstNumber, Integer secondNumber, Integer thirdNumber)
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
}
