package algo;
import java.util.*;

public class mediansOfmedians {

    static int[] toArray(ArrayList<Integer> list) {
        
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);

        return arr;
    }

    // Median of Medians
    private static int medianOfMedians(int[] arr) {

        if (arr.length <= 5) {
            Arrays.sort(arr);
            return arr[arr.length / 2];
        }

        int groups = (arr.length + 4) / 5;
        int[] medians = new int[groups];

        for (int i = 0; i < groups; i++) {

            int start = i * 5;
            int end = Math.min(start + 5, arr.length);

            int[] group = Arrays.copyOfRange(arr, start, end);

            Arrays.sort(group);

            medians[i] = group[group.length / 2];
        }

        return medianOfMedians(medians);
    }

    // Kth Smallest Element
    private static int KthSmallest(int[] arr, int k) {

        if (arr.length <= 5) {
            Arrays.sort(arr);
            return arr[k - 1];
        }

        int pivot = medianOfMedians(arr);

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for (int x : arr) {

            if (x < pivot) {
                left.add(x);
            } 
            else if (x == pivot) {
                equal.add(x);
            } 
            else {
                right.add(x);
            }
        }

        if (k <= left.size()) {
            return KthSmallest(toArray(left), k);
        } 
        else if (k <= left.size() + equal.size()) {
            return pivot;
        } 
        else {
            int newK = k - left.size() - equal.size();
            return KthSmallest(toArray(right), newK);
        }
    }

    public static void main(String[] args) {

        int[] arr = {
            12, 3, 5, 7, 4,
            19, 26, 1, 8, 15,
            20, 2, 10, 6, 9
        };

        int k = 5;
        

        System.out.println(KthSmallest(arr, k));
    }
}