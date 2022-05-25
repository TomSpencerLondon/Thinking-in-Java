package exercise5;

import exercise4.Exercise4;

/** Exercise 5
 * Exercise 5: (1) Modify the previous exercise so that the
 * values of the data in DataOnly are assigned to and printed in main( ).
 * @author Tom Spencer
 * @author https://github.com/TomSpencerLondon
 * @version 4.0
 */
public class Exercise5 {
    public static void main(String[] args) {
        DataOnly data = new DataOnly();
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
