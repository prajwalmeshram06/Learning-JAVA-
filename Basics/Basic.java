import java.io.*;
import java.util.*;

public class Basic {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine()); // number of test cases

        while (t-- > 0) {

            // 🔹 Read a single integer
            int n = Integer.parseInt(br.readLine());

            // 🔹 Read array
            String[] parts = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }

            // 🔹 Your logic here
            int sum = 0;
            for (int x : arr) sum += x;

            // 🔹 Output
            out.println(sum);
        }

        out.flush(); // IMPORTANT
    }
}