import java.util.Scanner;
public class qus4 {
    static void isPrime() {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

         sc.close();

        for(int i = 2; i <= number/2; i++) {
            if(number % i == 0) {
                System.out.println("Not a Prime number");
                return;
            }
        }
        System.out.println("Is a Prime Number");

       
    }
    public static void main(String[] args) {
        isPrime();
    }
}
