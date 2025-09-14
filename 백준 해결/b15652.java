import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// N과 M (4)

public class b15652 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

   public static void main(String[] args)throws IOException {


      String line = br.readLine();
      int N = Integer.parseInt(line.split(" ")[0]);
      int M = Integer.parseInt(line.split(" ")[1]);

      int[] result = new int[M];
      CombiRepetition(M, N, result, 0);

      br.close();
      bw.close();
   }

   public static void CombiRepetition(int M, int N, int[] result, int cnt) throws IOException {
      if(cnt == M) {
         for(int m=0; m<M; m++){
            bw.write(String.valueOf(result[m])+" ");
         }
         bw.newLine();
         return;
      }

      for(int n=1; n<=N; n++) {
         if(cnt == 0 || result[cnt-1]<=n ){
            result[cnt] = n;
            CombiRepetition(M, N, result, cnt+1);
         }
      }

      return;
   }
}