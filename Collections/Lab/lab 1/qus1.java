import java.util.Scanner;
public class qus1 {
    static int sum(int a, int b) {
        return a + b;
    }
    static int diff(int a, int b) {
        return a - b;
    }
    static int product(int a, int b) {
        return a * b;
    }
    static int division(int a, int b) {
        return a / b;
    }
    static int remainder(int a, int b) {
        return a % b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum of " + a + " and " + b + " is " + sum(a,b));
         System.out.println("Difference of " + a + " and " + b + " is " + diff(a,b));
          System.out.println("Product of " + a + " and " + b + " is " + product(a,b));
           System.out.println("Quotient of " + a + " and " + b + " is " + division(a,b));
            System.out.println("Remainder of " + a + " and " + b + " is " + remainder(a,b));
        sc.close();
    }
}
