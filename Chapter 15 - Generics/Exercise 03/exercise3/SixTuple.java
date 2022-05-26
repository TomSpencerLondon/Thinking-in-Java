package exercise3;

import lib.tuple.FiveTuple;

public class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {


  private final F fifth;

  public SixTuple(A a, B b, C c, D d, E e, F f) {
    super(a, b, c, d, e);
    this.fifth = f;
  }

  public String toString() {
    return "(" + first + ", " + second + ", " +
        third + ", " + fourth + ", " + fifth + ")";
  }
}
