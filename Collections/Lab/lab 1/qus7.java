import java.util.Scanner;

public class qus7 {
    static void isLeap(int year) {
        boolean isLeapYear = false;
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            isLeapYear = true;
        }
        
        if(isLeapYear) {
            System.out.println("Is a Leap Year");
        } else {
            System.out.println("Is not a Leap Year");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        isLeap(year);





        sc.close();
    }
}
