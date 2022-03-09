package com.codurance.everythingisanobject;

public class Exercise5 {
    public static void main(String[] args) {
        Exercise4.DataOnly data = new Exercise4.DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
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
