import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// N과 M (3)
public class b15651_N과M_3 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   public static void main(String[] args) throws IOException {
      String line = br.readLine();
      int N = Integer.parseInt(line.split(" ")[0]);
      int M = Integer.parseInt(line.split(" ")[1]);

      int[] result = new int[M];

      Combination(N, M, 0, result);

      bw.flush();
      br.close();
      bw.close();
   }

   public static void Combination(int N, int M, int cnt, int[] result) throws IOException {
      if(cnt==M){
         for(int m=0; m<M; m++){
            bw.write(String.valueOf(result[m]) + " ");
         }
         bw.newLine();
         return;
      }

      for(int n=1; n<=N; n++) {
         result[cnt] = n;
         cnt++;
         Combination(N, M, cnt, result);
         cnt--;
      }
      return;
   }
}