package 다시풀기;
import java.util.*;

public class b1072_게임 {
    public static void main(String[] args) { // https://www.acmicpc.net/problem/1072
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();
        long Z = Y*100/X;
        
        long ans = -1;
        long start = 1;
        long end = X;
        
        while(start<=end) {
            long mid = (start+end)/2;
            long x = X+mid;
            long y = Y+mid;
            long z = y*100/x;
            if(z!=Z) {
                ans = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
