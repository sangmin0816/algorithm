import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// 좌표 압축
public class b18870 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   public static void main(String[] args) throws IOException {

      int N = Integer.parseInt(br.readLine());
      String[] temp = br.readLine().split(" ");
      ArrayList<Integer> arr = new ArrayList<>();
      for(String i : temp) {
         arr.add(Integer.parseInt(i));
      }

      Collections.sort(arr);
      
      HashMap<String, String> dict = new HashMap<>();

      int idx = 0;
      dict.put(String.valueOf(arr.get(0)), String.valueOf(idx));

      for(int i=1; i<N; i++) {
         if(!arr.get(i-1).equals(arr.get(i))) {
            idx++;
         }
         dict.put(String.valueOf(arr.get(i)), String.valueOf(idx));
      }

      for(String s : temp) {
         bw.write(dict.get(s)+" ");
      }

      bw.flush();
      br.close();
      bw.close();
   }
}