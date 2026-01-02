import java.util.Scanner;

//https://www.acmicpc.net/problem/11727
public class b11727_2n타일링2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();

      int arr[] = new int[1001];
      arr[0] = 0;
      arr[1] = 1;
      arr[2] = 3;
      arr[3] = 5;
      arr[4] = 11;
      
      for(int i=5; i<=N; i++) {
         arr[i] = (arr[i-1]+arr[i-2]*2) % 10007;
      }
      
      System.out.println(arr[N]);

      sc.close();
   }
}
