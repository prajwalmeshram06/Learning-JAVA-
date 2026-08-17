import java.util.Scanner;
public class qus3 {
    static double circleArea(double r) {
        return (3.14159 * r * r);
    }
    static double circleCircumference(double r) {
        return (3.14159 * 2 * r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();
        System.out.println("Area = " + circleArea(r) + " " + "Circumference " + circleCircumference(r));
        sc.close();
    }
}
