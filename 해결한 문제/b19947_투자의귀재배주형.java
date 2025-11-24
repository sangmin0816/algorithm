import java.util.*;

public class b19947_투자의귀재배주형 {
    public static void main(String[] args) { // https://www.acmicpc.net/problem/19947
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int Y = sc.nextInt();

        long[] dp = new long[Y+1];
        dp[0] = H;

        for(int i=1; i<=Y; i++) {
            dp[i] = (long)Math.max(dp[i-1]*1.05, dp[i]);
            if(i>=3) dp[i] = (long)Math.max(dp[i-3]*1.2, dp[i]);
            if(i>=5) dp[i] = (long)Math.max(dp[i-5]*1.35, dp[i]);
        }

        System.out.println(dp[Y]);

        sc.close();
    }
}
