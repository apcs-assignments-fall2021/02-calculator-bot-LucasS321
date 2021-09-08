import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if (a < b && b < c) {
            return b;
        }
        if (c < b && b < a) {
            return b;
        }
        if (b < c && c < a) {
            return c;
        }
        if (a < c && c < b) {
            return c;
        }
        if (b < a && a < c) {
            return a;
        }
        if (c < a && a < b) {
            return a;
        }
        if (c == a) {
            return a;
        }
        if (a == b) {
            return a;
        }
        if (b == c) {
            return b;
        }
        return 0;
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if (Math.abs(a) > Math.abs(b)) {
            return a;
        } else {
            return b;
        }
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {

        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2)); // REPLACE WITH YOUR CODE
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.println("What operator?");
        String func = scan.next();
        if (func.equals( "median")) {
            System.out.println("Num1");
            int num1 = scan.nextInt();
            System.out.println("Num2");
            int num2 = scan.nextInt();
            System.out.println("Num3");
            int num3 = scan.nextInt();
            System.out.println(median(num1,num2,num3));
        }
        if (func.equals( "magnitude")) {
            System.out.println("Num1");
            int num1 = scan.nextInt();
            System.out.println("Num2");
            int num2 = scan.nextInt();
            System.out.println(magnitude(num1,num2));
        }
        if (func.equals( "pythagorus")) {
            System.out.println("a");
            int num1 = scan.nextInt();
            System.out.println("b");
            int num2 = scan.nextInt();
            System.out.println(pythagoras(num1,num2));
        }
        // YOUR CODE HERE
    }
}
