import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class b1107 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   public static void main(String[] args) throws IOException {
      int N = Integer.parseInt(br.readLine());
      int M = Integer.parseInt(br.readLine());

      if(N==100) {
         bw.write(String.valueOf(0));
      } else if(M!=10) {
         String[] N_arr = String.valueOf(N).split("");
         int ans = N_arr.length;
         
         int subin = 100;

         String[] temp = br.readLine().split(" ");
         
         int[] input = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
         for(int m=0; m<M; m++) {
            input[Integer.parseInt(temp[m])] = -1;
         }

      }

      
      

      bw.flush();
      br.close();
      bw.close();
   }

   public static void duplicatePermutation(int[] output, int[] input, int depth, int n, int r) {
      if(depth == r) {
         return;
      }
      for(int i=0; i<n; i++) {
         output[depth] = input[i];
         duplicatePermutation(output, input, depth+1, n, r);
      }
   }
}