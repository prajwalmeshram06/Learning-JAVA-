import java.util.Scanner;

public class qus2 {
    static Double Area(Double a, Double b) {
        return (a*b);
    }
    static Double Perimeter(Double a, Double b) {
        return 2*(a+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double length = sc.nextDouble();
        Double breadth = sc.nextDouble();
        System.out.println("Area = " + Area(length, breadth) + " " + "Perimeter " + Perimeter(length, breadth));


        sc.close();
    }
}
