import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class b11660_구간합구하기5 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   public static void main(String[] args) throws IOException {

      String[] line = br.readLine().split(" ");
      int N = Integer.parseInt(line[0]);
      int M = Integer.parseInt(line[1]);

      int[][] arr = new int[N][N];
      int[][] dp = new int[N+1][N+1];

      for(int n=0; n<N; n++) {
         line = br.readLine().split(" ");
         for(int i=0; i<N; i++) {
            arr[n][i] = Integer.parseInt(line[i]);
            dp[n][i+1] = arr[n][i] + dp[n][i];
         }
         dp[n+1][0] = dp[n][N];
      }

      for(int m=0; m<M; m++) {
         line = br.readLine().split(" ");
         int x1 = Integer.parseInt(line[0]);
         int y1 = Integer.parseInt(line[1]);
         int x2 = Integer.parseInt(line[2]);
         int y2 = Integer.parseInt(line[3]);

         if(x1==x2 && y1==y2) {
            bw.write(String.valueOf(arr[x1-1][y1-1])+"\n");
            continue;
         }
         
         int ans = 0;
         for(int i=x1-1; i<x2; i++) {
            ans += dp[i][y2] - dp[i][y1-1];
         }

         bw.write(String.valueOf(ans)+"\n");
      }

      bw.flush();
      br.close();
      bw.close();
   }
}