package com.codurance.everythingisanobject;

/** Exercise 8
 * Exercise 8: (3) Write a program that demonstrates that,
 * no matter how many objects you create of a particular class,
 * there is only one instance of a particular static field in that class.
 * @author Tom Spencer
 * @author https://github.com/TomSpencerLondon
 * @version 4.0
 */
public class Exercise9 {
    public static void main(String[] args) {
        Byte b = 1;
        Short s = 1;
        Integer i = 1;
        Long l = 1L;
        Float f = 1f;
        Double d = 1.1d;
        System.out.println(b.getClass());
        System.out.println(s.getClass());
        System.out.println(i.getClass());
        System.out.println(l.getClass());
        System.out.println(f.getClass());
        System.out.println(d.getClass());
    }
}
