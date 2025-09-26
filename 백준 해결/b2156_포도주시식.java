import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// 포도주 시식
public class b2156_포도주시식 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   public static void main(String[] args) throws IOException {
      int N = Integer.parseInt(br.readLine());
      int[] wines = new int[N];
      for(int n=0; n<N; n++) {
         wines[n] = Integer.parseInt(br.readLine());
      }

      int[] dp = new int[N+1];
      dp[0] = 0;
      dp[1] = wines[0];
      if(N>1) {
         dp[2] = wines[0] + wines[1];
      }
      
      for(int i=3; i<N+1; i++) {
         dp[i] = Math.max(wines[i-1] + wines[i-2] + dp[i-3], wines[i-1] + dp[i-2]);
         dp[i] = Math.max(dp[i], dp[i-1]);
      }

      int ans = 0;
      for(int i=0; i<N+1; i++) {
         ans = Math.max(ans, dp[i]);
      }
      bw.write(String.valueOf(ans));

      bw.flush();
      br.close();
      bw.close();
   }
}