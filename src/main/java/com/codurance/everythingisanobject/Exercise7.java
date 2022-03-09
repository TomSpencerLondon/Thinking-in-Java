package com.codurance.everythingisanobject;

public class Exercise7 {

    public static void main(String[] args) {
        System.out.println(StaticTest.i);
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }

    static class StaticTest {
        static int i = 47;
    }

    static class Incrementable {
        static void increment() { StaticTest.i++; }
    }

}
