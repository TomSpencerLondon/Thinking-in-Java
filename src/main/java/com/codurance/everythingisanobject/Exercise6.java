package com.codurance.everythingisanobject;

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
