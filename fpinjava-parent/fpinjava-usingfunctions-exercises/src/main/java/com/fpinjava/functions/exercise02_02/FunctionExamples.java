package com.fpinjava.functions.exercise02_02;

public class FunctionExamples {

  public static final Function<Integer, Integer> triple = x -> x * 3;

  public static final Function<Integer, Integer> square = x -> x * x;

  public static final Function<Integer, Integer> compose(final Function<Integer, Integer> f1,
                                                         final Function<Integer, Integer> f2) {
    //throw new RuntimeException("To be implemented.");
    return arg -> f1.apply(f2.apply(arg));
//    return new Function<Integer, Integer>() {
//      @Override
//      public Integer apply(Integer arg) {
//        return f1.apply(f2.apply(arg));
//      }
//    };
  }
}
