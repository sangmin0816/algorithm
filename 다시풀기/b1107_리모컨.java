package 다시풀기;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b1107_리모컨 { // https://www.acmicpc.net/problem/1107
   // 경계 케이스를 잘 생각해야 함
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

   public static void main(String[] args) throws IOException {
      int N = Integer.parseInt(br.readLine());
      int M = Integer.parseInt(br.readLine());
      int ans = 500000;

      int[] input = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

      if (M != 0) {
         String[] temp = br.readLine().split(" ");
         for (int m = 0; m < M; m++) {
            input[Integer.parseInt(temp[m])] = -1;
         }
      }

      for (int i = 0; i <= 500000; i++) {
         int lower_num = N - i;
         int higher_num = N + i;

         if (lower_num == 100 || higher_num == 100 ) {
            ans = i;
            break;
         }

         boolean flag = true;
         if (lower_num >= 0) {
            String[] lower_string = String.valueOf(lower_num).split("");
            for (String s : lower_string) {
               if (input[Integer.parseInt(s)] == -1) {
                  flag = false;
                  break;
               }
            }
            if (flag) {
               ans = lower_string.length + i;
               break;
            }
         }
         String[] higher_string = String.valueOf(higher_num).split("");
         flag = true;
         for (String s : higher_string) {
            if (input[Integer.parseInt(s)] == -1) {
               flag = false;
               break;
            }
         }
         if (flag) {
            ans = higher_string.length + i;
            break;
         }
      }
      
      ans = Math.min(Math.abs(N-100), ans);
      
      bw.write(String.valueOf(ans));

      bw.flush();
      br.close();
      bw.close();
   }
}