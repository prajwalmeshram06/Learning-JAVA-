import java.util.*;

public class qus11 {
    private static void sumOfPositiveNegative(Scanner sc) {
        System.out.println("Enter number of testCases : ");
        int testCases = sc.nextInt();
        int[] sizeArray = new int[testCases];
        int[][] output = new int[testCases][2];

        for (int i = 0; i < testCases; i++) {
            System.out.println("Enter Size of " + (i + 1) + " Test Case : ");
            sizeArray[i] = sc.nextInt();
            System.out.println("Enter Elements : ");
            for (int j = 0; j < sizeArray[i]; j++) {
                int num = sc.nextInt();
                if (num >= 0) {
                    output[i][0] += num;
                } else {
                    output[i][1] += num;
                }
            }
        }
        System.out.println("Positive Sum\tNegative Sum\t");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i][0] + "\t\t" + output[i][1]);
        }
        int totalPositive = 0, totalNegative = 0;
        for (int i = 0; i < output.length; i++) {
            totalPositive += output[i][0];
            totalNegative += output[i][1];
        }
        System.out.println("TotalPositive : " + totalPositive);
        System.out.println("TotalNegative : " + totalNegative);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sumOfPositiveNegative(sc);
        sc.close();
    }
}
