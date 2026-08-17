import java.util.Scanner;

public class qus5 {
    static void isEvenOrOdd() {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.println("Is Even Number");
        } else {
            System.out.println("Is Odd Number");
        }

        sc.close();
    }
    public static void main(String[] args) {
        isEvenOrOdd();
    }
}
