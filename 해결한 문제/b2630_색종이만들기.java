import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class b2630_색종이만들기 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   public static void main(String[] args) throws IOException {

      int N = Integer.parseInt(br.readLine());
      String[][] arr = new String[N][N];
      for(int n=0; n<N; n++) {
         arr[n] = br.readLine().split(" ");
      }

      Map<String, Integer> ans = new HashMap<>();
      ans.put("blue", 0);
      ans.put("white", 0);

      check(N, ans, 0, 0, arr);

      bw.write(String.valueOf(ans.get("white"))+"\n");
      bw.write(String.valueOf(ans.get("blue"))+"\n");

      bw.flush();
      br.close();
      bw.close();
   }

   public static void check(int N, Map<String, Integer> ans, int x, int y, String[][] arr) {
      String previous = arr[x][y];
      if(N>1) {
         for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
               if(!previous.equals(arr[x+i][j+y])) {
                  //divid
                  check(N/2, ans, x, y, arr);
                  check(N/2, ans, x+N/2, y, arr);
                  check(N/2, ans, x+N/2, y+N/2, arr);
                  check(N/2, ans, x, y+N/2, arr);
                  return;
               }
            }
         }
      }
      if(previous.equals("1")) {
         ans.replace("blue", ans.get("blue")+1);
      } else {
         ans.replace("white", ans.get("white")+1);
      }
   }
}