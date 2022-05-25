package exercise7;

/** Exercise 7
 * Exercise 7: (1) Turn the Incrementable code fragments into a working program.
 * @author Tom Spencer
 * @author https://github.com/TomSpencerLondon
 * @version 4.0
 */
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
