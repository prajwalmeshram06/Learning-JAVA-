import java.util.Scanner;

public class qus9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Current a = " + a + " " + "Current b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After a = " + a + " " + "After b = " + b);

        sc.close();
    }
}
