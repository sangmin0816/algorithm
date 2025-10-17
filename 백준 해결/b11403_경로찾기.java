import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class b11403_경로찾기 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

   public static void main(String[] args) throws IOException {
      int N = Integer.parseInt(br.readLine());

      int[][] arr = new int[N][N];
      int[][] ans = new int[N][N];
      for (int n = 0; n < N; n++) {
         String[] temp = br.readLine().split(" ");
         for (int i = 0; i < N; i++) {
            arr[n][i] = Integer.parseInt(temp[i]);
            ans[n][i] = Integer.parseInt(temp[i]);
         }
      }

      for (int n = 0; n < N; n++) {
         for (int i = 0; i < N; i++) {
            if(arr[n][i]==1){
               dfs(arr, ans, N, n, i);
            }
         }
      }

      for (int n = 0; n < N; n++) {
         for (int i = 0; i < N; i++) { 
            bw.write(String.valueOf(ans[n][i])+" ");
         }
         bw.newLine();
      }

      bw.flush();
      br.close();
      bw.close();
   }

   static void dfs(int[][] arr, int[][] ans, int N, int x, int y) {
      for (int n = 0; n < N; n++) {
         if (arr[y][n] == 1 && ans[x][n]==0) {
            ans[x][n] = 1;
            dfs(arr, ans, N, x, n);
         }
      }
   }
}