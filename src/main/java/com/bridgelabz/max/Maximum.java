package com.bridgelabz.max;

import java.util.List;
import java.util.Optional;

public class Maximum<T extends Comparable<T>>{
   List<T> list;

    public Maximum(List<T> list) {
        this.list = list;
    }
    public T testMaximum(){
        return Maximum.findMaximum(list);
    }

    public static <T extends  Comparable<T>> T findMaximum(List<T> list)
    {
  Optional<T> max =list.stream().max(Comparable::compareTo);
        return max.get();
    }
}
