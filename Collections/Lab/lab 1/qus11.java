import java.util.*;

public class qus11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryNumber = sc.next();

        int ans = Integer.parseInt(binaryNumber, 2);
        System.out.println(binaryNumber + " in Decimal System is " + ans);

        int number = sc.nextInt();
        String res = Integer.toBinaryString(number);
        System.out.println(number + " in Binary System is " + res);

        sc.close();
    }
}
