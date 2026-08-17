import java.util.*;

public class qus2 {
    static void nextGreaterElement(int[] arr, int n) {
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        for(int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    static void circularShift(int[] arr, int n, Scanner sc) {
        System.out.println("Enter K : ");
        int k = sc.nextInt();


        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = arr[(i+k) % n];
        }

        for(int i = 0; i < n; i++) {
            arr[i] = a[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter Element in Array :");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        while(true) {
            System.out.println("Menu =>");
            System.out.println("Next Greater Element => 1");
            System.out.println("Circular Shift by K => 2");
            System.out.println("Exit Menu => -1");

            int choice = sc.nextInt();
            if(choice == -1) {
                break;
            }
            switch(choice) {
                case 1 -> nextGreaterElement(arr, n);
                case 2 -> circularShift(arr, n, sc);
                default -> System.out.println("Invalid Choice"); 
            }
        }


        sc.close();
    }
}
