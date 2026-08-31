package dandc;

public class countInversion {
    static long mergeSort(int[] arr, int[] temp, int low, int high) {
        long count = 0;
        if (low >= high) {
            return count;
        }

        int mid = low + (high - low) / 2;

        count +=  mergeSort(arr, temp, low, mid);
        count += mergeSort(arr, temp, mid + 1, high);

        count += merge(arr, temp, low, mid, high);

        return count;
    }

    static long merge(int[] arr, int[] temp, int low, int mid, int high) {

        int i = low;
        int j = mid + 1;
        int k = low;
        long count = 0;
        
        while (i <= mid && j <= high) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                if(arr[i] > 2 * arr[j]) {
                    count += (mid - i + 1);
                }
                
            }
        }

        
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        
        while (j <= high) {
            temp[k++] = arr[j++];
        }

        
        for (i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
        return count;
    }
    private static int inversionPairs(int[] arr) {
        int pairCount = 0;

        

        return pairCount;
    }
    public static void main(String[] args) {
        
    }
}
