package com.codurance.everythingisanobject;

public class Exercise4 {
    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        System.out.println(data.toString());
    }

    static class DataOnly {
        int i;
        double d;
        boolean b;

        @Override
        public String toString() {
            return "DataOnly{" +
                    "i=" + i +
                    ", d=" + d +
                    ", b=" + b +
                    '}';
        }
    }
}
