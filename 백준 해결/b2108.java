import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 통계학
public class b2108 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   public static void main(String[] args) throws IOException {

      int N = Integer.parseInt(br.readLine());
      int total = 0;
      Map<Integer, Integer> dict = new HashMap<>();

      ArrayList<Integer> array = new ArrayList<>();
      for(int n=0; n<N; n++) {
         int num = Integer.parseInt(br.readLine());
         array.add(num);
         total += num;
         if(!dict.containsKey(num)) {
            dict.put(num, 0);
         }
         dict.replace(num, dict.get(num)+1);
      }

      Collections.sort(array);  
      
      int maxCnt = Collections.max(dict.values());
      ArrayList<Integer> modeList = new ArrayList<>();
      for(int key : dict.keySet()) {
         int cnt = dict.get(key);
         if(cnt==maxCnt) {
            modeList.add(key);
         }
      }
      
      int avg = (int)Math.round((double)total/N);  // int 형으로 나누면 내림한 결과가 나옴
      int mid = array.get(N/2);
      int mode = modeList.get(0);
      if(modeList.size()>=2) {
         Collections.sort(modeList);
         mode = modeList.get(1);
      }
      int range = Collections.max(array) - Collections.min(array);

      bw.write(String.valueOf(avg)+"\n");
      bw.write(String.valueOf(mid)+"\n");
      bw.write(String.valueOf(mode)+"\n");
      bw.write(String.valueOf(range));

      bw.flush();
      br.close();
      bw.close();
   }
}