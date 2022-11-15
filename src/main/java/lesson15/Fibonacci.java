package lesson15;

public class Fibonacci {
    public static int fibonachiQounter(int number) {
        int a, b, c;
        a = 1;
        b = 1;
        c = 0;
        if (number == 0) {
            System.out.println(0);
        } else if (number <= 2) {
            System.out.println(1);
        } else {
            for (int i = 3; i <= number; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(c);
        }
        return c;
    }

}
