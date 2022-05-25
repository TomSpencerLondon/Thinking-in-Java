package exercise8;

/** Exercise 8
 * Exercise 8: (3) Write a program that demonstrates that,
 * no matter how many objects you create of a particular class,
 * there is only one instance of a particular static field in that class.
 * @author Tom Spencer
 * @author https://github.com/TomSpencerLondon
 * @version 4.0
 */
public class Exercise8 {
    public static void main(String[] args) {
        StaticExample s1 = new StaticExample();
        s1.i = 1;
        StaticExample s2 = new StaticExample();
        s2.i = 2;
        StaticExample s3 = new StaticExample();
        s3.i = 3;

        System.out.println(s1.i);
        System.out.println(s2.i);
        System.out.println(s3.i);
    }

    static class StaticExample {
        static int i = 0;
    }
}
