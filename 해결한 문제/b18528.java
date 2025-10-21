import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// 큐2
public class b18528 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int N = Integer.parseInt(br.readLine());

      Deque<String> deq = new ArrayDeque<>();

      for(int i=0; i<N; i++){
         String line = br.readLine();
         String command = line.split(" ")[0];

         if(command.equals("push")) {
            deq.add(line.split(" ")[1]);
         }
         else {
            String isEmpty = deq.isEmpty()? "1":"0";
            if(command.equals("empty"))     bw.write(String.valueOf(isEmpty));
            else if(command.equals("size"))          bw.write(String.valueOf(deq.size()));
            else if(isEmpty.equals("1"))    bw.write("-1");
            else {
               if(command.equals("front"))  bw.write(String.valueOf(deq.getFirst()));
               else if(command.equals("pop"))    bw.write(String.valueOf(deq.poll()));
               else if(command.equals("back"))   bw.write(String.valueOf(deq.getLast()));
            }
            bw.write("\n");
         }
      }
      
      bw.flush(); // flush 하는데 시간이 오래 걸린다. 입력에 바로 출력할 필요는 없는 것 같다.
      
      br.close();
      bw.close();
   }
}