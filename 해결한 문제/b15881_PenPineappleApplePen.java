import java.util.*;

public class b15881_PenPineappleApplePen {
    public static void main(String[] args) { // https://www.acmicpc.net/problem/15881 
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String pPAp = sc.next();
        
        int dp[] = new int[N+1];
        find_pPAp(pPAp, N, dp);
        System.out.println(dp[N]);

        sc.close();
    }

    public static void find_pPAp(String pPAp, int N, int[] dp){
        for(int i=4; i<N+1; i++){
            String sub = pPAp.substring(i-4, i);
            dp[i] = dp[i-1];
            if("pPAp".equals(sub)) {
                dp[i] = Math.max(dp[i-4]+1, dp[i]);
            }
        }
    }
}
