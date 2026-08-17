package dp;

// import java.util.ArrayList;
// import java.util.List;

public class fibonnaci {
    private static int fibonacci(int n) {
        //worst approach 
        // if(n == 1) {
        //     return 1;
        // }
        // if(n == 0) {
        //     return 0;
        // }
        // return fibonacci(n - 2) + fibonacci(n - 1);
        // 

        //best approach
        int last = 1;
        int lastS = 0;
        int ans = 0;
        for(int i = 2; i <= n; i++) {
            ans = last + lastS;
            lastS = last;
            last = ans;
            
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
