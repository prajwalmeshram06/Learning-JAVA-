package algo;
import java.util.*;


public class KadanesAlgorithm {
    private static int maximumSubarraySum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            currentSum = Math.max(currentSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//-3,2,-2,-1,3,-2,3
        System.out.println(maximumSubarraySum(arr));

        sc.close();
    }
}
