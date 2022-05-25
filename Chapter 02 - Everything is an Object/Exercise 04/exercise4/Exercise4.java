package exercise4;

/** Exercise 4
 * Exercise 4: (1) Turn the DataOnly code fragments into a program that compiles and runs.
 * @author Tom Spencer
 * @author https://github.com/TomSpencerLondon
 * @version 4.0
 */
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
