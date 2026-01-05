import java.util.Scanner;

public class b11568_민균이의계략 { //https://www.acmicpc.net/problem/11568
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int[] arr = new int[N];

      for(int i=0; i<N; i++) {
         arr[i] = sc.nextInt();
      }

      int[] dp = new int[N];
      dp[0] = 1;
      
      for(int i=1; i<N; i++) {
         dp[i] = 1;
         for(int j=0; j<i; j++) {
            if(arr[j]<arr[i]) dp[i] = Math.max(dp[j]+1, dp[i]);
         }
      }

      int ans = 0;
      for(int i=0; i<N; i++) {
         ans = Math.max(dp[i], ans);
      }

      System.out.println(ans);

      sc.close();
   }
}
