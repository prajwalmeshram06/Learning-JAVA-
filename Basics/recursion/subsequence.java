package recursion;

import java.util.ArrayList;
import java.util.List;

public class subsequence {
    private static void sumIsK(int idx, int[] arr, List<Integer> list, int k, int sum) {


        if(idx == arr.length) {
            if(k == sum) {
                for(int x : list) System.out.print(x + " ");
            }
            System.out.println();
            return;
        }

        list.add(arr[idx]);
        sum += arr[idx];

        sumIsK(idx + 1, arr, list, k, sum);

        sum -= arr[idx];
        list.remove(list.size() - 1);

        sumIsK(idx + 1, arr, list, k, sum);


    }
    private static void subsequencePrint(int idx, List<Integer> list, int[] arr) {

        if(idx >= arr.length) {
            System.out.println(list);
            return;
        }

        list.add(arr[idx]);

        subsequencePrint(idx + 1, list, arr);

        list.remove(list.size() - 1);

        subsequencePrint(idx + 1, list, arr);
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        List<Integer> list = new ArrayList<>();
        sumIsK(0, arr, list, 2, 0);
    }
}
