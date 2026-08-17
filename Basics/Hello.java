import java.util.Scanner;

public class Hello {
    static void isPrime() {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for(int i = 2; i < number/2; i++) {
            if(number % i == 0) {
                System.out.println("Not a Prime number");
            }
        }
        System.out.println("Is a Prime Number");

        sc.close();
    }

    static int sum() {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int sum = number1 + number2;

        sc.close();
        return sum;
    }

    static void switchCase() {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            System.out.println("Enter Number : ");
            int number = sc.nextInt();

            switch(number) {
                case 0:
                    System.err.println("You typed Zero");
                    break;
                case 1:
                    System.out.println("You typed One");
                    break;

                default:
                    System.out.println("You typed neither zero nor one");
            }
        }


        sc.close();
    }
    public static void main(String[] args) {
        isPrime();
    }
    
}
