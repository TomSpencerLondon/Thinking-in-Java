package com.codurance.everythingisanobject;

/** Exercise 6
 * Exercise 6: (2) Write a program that includes and calls the storage( )
 * method defined as a code fragment in this chapter.
 * @author Tom Spencer
 * @author https://github.com/TomSpencerLondon
 * @version 4.0
 */
public class Exercise6 {
    public static void main(String[] args) {
        Storage s = new Storage();
        System.out.println(s.storage("Hello"));
    }

    static class Storage {
        int storage(String s) {
            return s.length() * 2;
        }
    }
}
