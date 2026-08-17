import java.util.*;

public class qus1 {
    static void Sum(int[] arr, int n) {
        int sum = 0;
        for(int i = 0 ; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of all elements in Array : " + sum);
    }

    static void Max(int[] arr, int n) {
        int max = -999;
        for(int i = 0 ; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println("Max : " + max);
    }

    static void Search(int[] arr, int n, Scanner sc) {
        System.out.print("Enter Target Value : ");
        int target = sc.nextInt();
        int index = -1;
        for(int i = 0 ; i < n; i++) {
            if(arr[i] == target) {
                index = i;
                break;
            }
        }
        if(index != -1) {
            System.out.println("Target found at index : " + index);
        } else {
            System.out.println("Target not found!");
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter Elements in Array :");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        while(true) {
            System.out.println("Menu =>");
            System.out.println("Sum of all Elements in Array => 1");
            System.out.println("Maximum Element in Array => 2");
            System.out.println("Search a Element => 3");
            System.out.println("Exiting Menu => -1");

            int choice = sc.nextInt();
            
            if(choice == -1) {
                break;
            }

            switch (choice) {
                case 1 -> Sum(arr, n);
                case 2 -> Max(arr, n);
                case 3 -> Search(arr, n, sc);
                default -> System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}
