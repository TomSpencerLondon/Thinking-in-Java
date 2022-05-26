package exercise4.generified;

// Holds a sequence of Objects

import java.util.ArrayList;
import java.util.List;

interface Selector {
  boolean end();
  Object current();
  void next();
}

public class GenericSequence<T> {
  private List<T> items;
  private int next = 0;

  public GenericSequence(List<T> items) {
    this.items = items;
  }

  public void add(T t) {
    items.add(t);
  }

  private class SequenceSelector implements Selector {
    private int i = 0;

    @Override
    public boolean end() {
      return i == items.size();
    }

    @Override
    public Object current() {
      return items.get(i);
    }

    @Override
    public void next() {
      if (i < items.size()) i++;
    }
  }


  public Selector selector() {
    return new SequenceSelector();
  }

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();

    GenericSequence<Integer> sequence = new GenericSequence<Integer>(list);
    for (int i = 0; i < 10; i++){
      sequence.add(i);
    }

    Selector selector = sequence.selector();
    while(!selector.end()) {
      System.out.println(selector.current() + " ");
      selector.next();
    }
  }
}
