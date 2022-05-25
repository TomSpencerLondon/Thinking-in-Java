package exercise2;

import static lib.Print.print;

import exercise1.Holder3;

public class Holder<T> {

  private T first;
  private T second;
  private T third;

  public Holder(T first, T second, T third) {
    this.first = first;
    this.second = second;
    this.third = third;
  }

  public T getFirst() {
    return first;
  }

  public void setFirst(T first) {
    this.first = first;
  }

  public T getSecond() {
    return second;
  }

  public void setSecond(T second) {
    this.second = second;
  }

  public void setThird(T third) {
    this.third = third;
  }

  public T getThird() {
    return third;
  }

  public String toString() { return "{ " + first + ", " + second + ", " + third + " }"; }

  public static void main(String[] args) {
    Holder<Animal> animals = new Holder<Animal>(
        new Animal("Dog1"),
        new Animal("Cat2"),
        new Animal("Goldfish3")
    );

    print(animals);
    print(animals.getFirst());
    print(animals.getSecond());
    print(animals.getThird());

    animals.setFirst(new Animal("Parrot1"));
    animals.setSecond(new Animal("Parrot1"));
    animals.setThird(new Animal("Hamster1"));

    print(animals);
  }
}
