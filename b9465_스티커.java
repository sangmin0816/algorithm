import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class b9465_스티커 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   public static void main(String[] args) throws IOException {
      int T = Integer.parseInt(br.readLine());
      for(int t=0; t<T; t++) {
         int N = Integer.parseInt(br.readLine());
         String[] sticker1 = br.readLine().split(" ");
         String[] sticker2 = br.readLine().split(" ");

         int[][] arr = new int[2][N];
         for(int n=0; n<N; n++) {
            arr[0][n] = Integer.parseInt(sticker1[n]);
            arr[1][n] = Integer.parseInt(sticker2[n]);
         }

         int[][] ans = new int[2][N];
         ans[0][0] = arr[0][0];
         ans[1][0] = arr[1][0];

         if(N>1) {
            ans[0][1] = Math.max(arr[0][1]+arr[1][0], ans[0][0]);
            ans[1][1] = Math.max(arr[1][1]+arr[0][0], ans[1][0]);
         }
         for(int n=2; n<N; n++) {
            ans[0][n] = Math.max(arr[0][n]+ans[0][n-2]+arr[1][n-1], arr[0][n]+ans[1][n-2]);
            ans[0][n] = Math.max(ans[0][n], ans[0][n-1]);
            ans[1][n] = Math.max(arr[1][n]+ans[1][n-2]+arr[0][n-1], arr[1][n]+ans[0][n-2]);
            ans[1][n] = Math.max(ans[1][n], ans[1][n-1]);
         }

         int ansMax = Math.max(ans[1][N-1], ans[0][N-1]);
         bw.write(String.valueOf(ansMax));
         bw.newLine();
      }

      bw.flush();
      br.close();
      bw.close();
   }
}