import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class b11057_오르막수 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   public static void main(String[] args) throws IOException {
      int N = Integer.parseInt(br.readLine());

      int ans = 10;
      int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1};
      for(int n=2; n<N+1; n++) {
         for(int i=0; i<9; i++) {
            for(int j=i+1; j<9; j++) {
               arr[i] += arr[j]%10007;
            }
            ans += arr[i]%10007;
            ans %=10007;
         }
      }

      bw.write(String.valueOf(ans));

      bw.flush();
      bw.close();
      br.close();
   }
}