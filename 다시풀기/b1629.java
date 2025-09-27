package 다시풀기;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


// ★ double형은 long보다 정밀도가 낮음....
public class b1629 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   public static void main(String[] args) throws IOException {

      String[] numbs = br.readLine().split(" ");
      int A = Integer.parseInt(numbs[0]);
      int B = Integer.parseInt(numbs[1]);
      int C = Integer.parseInt(numbs[2]);
      
      bw.write(String.valueOf(multiply(A, B, C)));
      
      bw.flush();
      br.close();
      bw.close();
   }

   static long multiply(int A, int B, int C) {
      if(B==1) {
         return A%C;
      }
      long temp = multiply(A, B/2, C)%C;
      int mod = (int)((temp*temp)%C);
      if(B%2!=0) {
         mod = (int)(((A%C)*(long)mod)%C);
      }
      return mod;
   }
}