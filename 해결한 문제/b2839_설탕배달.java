import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


public class b2839 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int N = Integer.parseInt(br.readLine());

      ArrayList<Integer> dp = new ArrayList<>();
      int M = N/3 + 1;

      for(int i = M; i>=0; i--){
         if( (N-3*i)%5 ==0 ) {
            dp.add(i+(N-3*i)/5);
         }
      }
      
      if(dp.isEmpty()){
         bw.write(String.valueOf(-1));
      } else {
         int ans = Collections.min(dp);
         bw.write(String.valueOf(ans));
      }

      bw.flush();
      br.close();
      bw.close();
   }
}