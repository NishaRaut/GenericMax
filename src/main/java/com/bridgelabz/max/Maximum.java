package com.bridgelabz.max;

public class Maximum {

     public <T extends  Comparable<T>> T findMaximum(T first, T second, T third)
    {
        T max;
        if (first.compareTo(second) >0 && first.compareTo(third)>0)
            max = first ;
        else if (second.compareTo(first)>0 && second.compareTo(third)>0)
            max = second ;
        else
            max= third;
        return max;
    }
}
