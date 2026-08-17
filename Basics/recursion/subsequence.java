package recursion;

import java.util.ArrayList;
import java.util.List;

public class subsequence {
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
        int[] arr = {3, 1, 2};
        subsequencePrint(0, new ArrayList<>(), arr);
    }
}
