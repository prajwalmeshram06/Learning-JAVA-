import java.util.Scanner;

public class qus8 {
    static double SI(double p, double r, double t) {
        return (p*r*t)/100;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        System.out.println("SI = " + SI(p,r,t) + " " + "Total Amount" + (p + SI(p,r,t)));


        sc.close();
    }
}
