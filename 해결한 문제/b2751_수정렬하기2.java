import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class b2751 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
      
      int N = Integer.parseInt(br.readLine());
      
      int[] array = new int[N];
      for(int i=0; i<N; i++){
         array[i] = Integer.parseInt(br.readLine());
      }

      Arrays.sort(array);

      for(int i=0; i<N; i++){
         bw.write(array[i]+"\n");
         bw.flush();
      }

      br.close();
      bw.close();
   }
   
   
}

class DescendingSort implements Comparator<Integer>{
  public int compare(Integer a, Integer b){
     // b가 a 보다 큰가
     return b.compareTo(a);
  }
}

class AscendingSort implements Comparator<Integer>{
  public int compare(Integer a, Integer b){
     return a.compareTo(b);
  }
}

// ArrayList를 써서 Collectioins.sort() 를 하면 시간초과가 뜬다.