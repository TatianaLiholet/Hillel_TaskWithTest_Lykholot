package lesson15;

public class Main {
    public static void main(String[] args) {
       int[] testNumbers = {2,7,11,15};
       TwoSum.twoSum(testNumbers, 9);
       System.out.println();

       System.out.println("Task 2");
       Fibonacci.fibonachiQounter(6);

        System.out.println("Task 3");
        PascalTriangle.generate(1);
    }
}
