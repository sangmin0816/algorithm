import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// 정수 삼각형
public class b1932 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   public static void main(String[] args) throws IOException {

      int N = Integer.parseInt(br.readLine());
      int[][] arr = new int[N][N];

      arr[0][0] = Integer.parseInt(br.readLine());
      for(int n=1; n<N; n++){
         String[] nums = br.readLine().split(" ");
         for(int m=0; m<=n; m++) {
            arr[n][m] = Integer.parseInt(nums[m]);
         }
      }

      int[][] dp = new int[N][N];
      dp[0][0] = arr[0][0];
      for(int i=1; i<N; i++) {
         dp[i][0] = dp[i-1][0] + arr[i][0];
         dp[i][i] = dp[i-1][i-1] + arr[i][i];
      }

      for(int i=2; i<N; i++) {
         for(int j=1; j<i; j++) {
            dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + arr[i][j];
         }
      }

      int maximum = 0;
      for(int i=0; i<N; i++) {
         if(dp[N-1][i]>maximum) {
            maximum = dp[N-1][i];
         }
      }

      bw.write(String.valueOf(maximum));

      bw.flush();
      br.close();
      bw.close();
   }
}