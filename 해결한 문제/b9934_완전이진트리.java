import java.util.ArrayList;
import java.util.Scanner;


public class b9934_완전이진트리 { // https://www.acmicpc.net/problem/9934

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int K = sc.nextInt();
      int total = (int)Math.pow(2, K) - 1;

      int[] arr = new int[total];
      int[] ans = new int[total];

      for(int i=0; i<total; i++) {
         arr[i] = sc.nextInt();
      }

      int pointer = (int)Math.pow(2, K-1)-1;

      traversal(arr, ans, pointer, 0, total);
      
      System.out.print(ans[0]);
      int k = 1;
      for(int i=1; i<total; i++) {
         if(i == (int)Math.pow(2, k)-1) {
            k++;
            System.out.println();
         }
         System.out.print(ans[i]+" ");
      }

      sc.close();
   }

   static void traversal(int[] arr, int[] ans, int pointer, int arr_i, int total) {
      // left_child
      int left_child = pointer*2+1;
      int right_child = pointer*2+2;
      if(left_child < total && ans[left_child]==0) {
         traversal(arr, ans, left_child, arr_i, total); // 왼쪽 자식으로 내려감
      } else if(ans[pointer]==0) {
         ans[pointer] = arr[arr_i];
         traversal(arr, ans, pointer, arr_i+1, total);
      } else if(right_child<total && ans[right_child]==0) {
         traversal(arr, ans, right_child, arr_i, total); // 오른쪽 자식으로 내려감
      } else if(pointer!=0){
         traversal(arr, ans, (pointer-1)/2, arr_i, total);
      }
   }

}
