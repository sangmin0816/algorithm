import java.util.Scanner;

public class b11055_가장큰증가하는부분수열 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int arr[] = new int[N+1];

      arr[0] = 0;
      for(int n=1; n<=N; n++) {
         arr[n] = sc.nextInt();
      }

      int dp[] = new int[N+1];
      dp[0] = 0;
      dp[1] = arr[1];

      for(int i=2; i<=N; i++) {
         dp[i] = arr[i];
         for(int j=0; j<i; j++) {
            if(arr[j]<arr[i]) {
               dp[i] = Math.max(dp[j]+arr[i], dp[i]);
            }
         }
      }

      int ans = 0;
      for(int E : dp) {
         ans = Math.max(ans, E);
      }
      System.out.println(ans);

      sc.close();
   }
}
