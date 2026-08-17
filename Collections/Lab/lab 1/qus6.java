import java.util.Scanner;

public class qus6 {
    static int max(int a, int b, int c) {
        if(a > b) {
            if(a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if(b > c) {
                return b;
            } else {
                return c;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Max = " + max(a,b,c));

        sc.close();
    }
}
