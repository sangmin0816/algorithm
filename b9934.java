import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class b9934 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   public static void main(String[] args) throws IOException {

      int K = Integer.parseInt(br.readLine());
      String[] temp = br.readLine().split(" ");
      int[] arr = new int[K];
      for(int k=0; k<K; k++) {
         arr[k] = Integer.parseInt(temp[k]);
      }

      int[] ans = new int[2^K-1];
      
      bw.flush();
      br.close();
      bw.close();
   }
}