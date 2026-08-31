package bitmanipulation;

public class count1s {
    static int countSetbits(int num) {
        int count = 0;
        int n = num;
        while(n != 0) {
            // int x = n >> 1;
            // sum += x;
            // n = x;
            count++;
            n = n & (n - 1);
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetbits(5));
    }
}
