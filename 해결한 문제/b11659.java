import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// 구간 합 구하기 4
public class b11659 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      String line = br.readLine();
      int N = Integer.parseInt(line.split(" ")[0]);
      int M = Integer.parseInt(line.split(" ")[1]);

      line = br.readLine();
      ArrayList<Integer> arr = new ArrayList<>();
      for(String string : line.split(" ")) {
         arr.add(Integer.parseInt(string));
      }

      int[] partSum = new int[N+1];
      partSum[0] = 0;
      for(int i=0; i<N; i++){
         partSum[i+1] = partSum[i]+arr.get(i);
      }


      for(int m=0; m<M; m++){
         line = br.readLine();
         int i = Integer.parseInt(line.split(" ")[0]);
         int j = Integer.parseInt(line.split(" ")[1]);

         int ans = partSum[j] - partSum[i-1];
         bw.write(String.valueOf(ans));
         bw.newLine();
      }

      bw.flush();
      br.close();
      bw.close();
   }
}