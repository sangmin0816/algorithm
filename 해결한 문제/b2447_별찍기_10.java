import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class b2447_별찍기_10 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   public static void main(String[] args) throws IOException {

      int N = Integer.parseInt(br.readLine());
      String[][] arr = new String[N][N];
      for(int i=0; i<N; i++) {
         for(int j=0; j<N; j++){
            arr[i][j] = "*";
         }
      }

      recur(N, arr, 0, 0);

      for(int i=0; i<N; i++) {
         for(int j=0; j<N; j++){
            bw.write(arr[i][j]);
         }
         bw.newLine();
      }

      bw.flush();
      br.close();
      bw.close();
   }

   static void recur(int n, String[][] arr, int x, int y) {
      if(n<3) {
         return;
      }
      
      int range = n/3;
      for(int i=x+range; i<x+2*range; i++) {
         for(int j=y+range; j<y+2*range; j++) {
            arr[i][j] = " ";
         }
      }

      for(int i=x; i<x+n; i+=range) {
         for(int j=y; j<y+n; j+=range) {
            recur(n/3, arr, i, j);
         }
      }
   }
}