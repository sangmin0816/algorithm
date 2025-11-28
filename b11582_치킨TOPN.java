import java.util.*;

// https://www.acmicpc.net/problem/11582
// 문제가 병합정렬을 유도해서 속았다. 그냥 범위별로 정렬해주면 되는 거였다.
public class b11582_치킨TOPN { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] chickens = new int[N];
        for(int n = 0; n<N; n++) {
            chickens[n] = sc.nextInt();
        }
        int K = sc.nextInt();
        int k = N/K;

        for(int i=0; i+k<=N; i=i+k) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=i; j<i+k; j++) {
                temp.add(chickens[j]);
            }
            Collections.sort(temp);
            for(int ele : temp) {
                System.out.print(ele+" ");
            }
        }

        sc.close();
    }
}