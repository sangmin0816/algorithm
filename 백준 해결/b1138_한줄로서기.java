import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class b1138_한줄로서기 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

   public static void main(String[] args) throws IOException {
      int N = Integer.parseInt(br.readLine());
      String[] arr_s = br.readLine().split(" ");
      int[] arr = new int[N];

      int[] ans = new int[N];

      for (int n = 0; n < N; n++) {
         arr[n] = Integer.parseInt(arr_s[n]);

         int cnt = 0;
         for (int i = 0; i < N; i++) {
            if (ans[i] == 0 && cnt == arr[n]) {
               ans[i] = n + 1;
               break;
            }
            if (ans[i] == 0) {
               cnt++;
            }
         }
      }

      for (int i : ans) {
         bw.write(String.valueOf(i) + " ");
      }

      bw.flush();
      br.close();
      bw.close();
   }
}