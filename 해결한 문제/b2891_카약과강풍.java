
import java.util.*;

// https://www.acmicpc.net/problem/2891
public class b2891_카약과강풍 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int S = sc.nextInt();
        int R = sc.nextInt();

        int kayak[] = new int[N+2];
        for(int i=0; i<S; i++) kayak[sc.nextInt()]--;
        for(int i=0; i<R; i++) kayak[sc.nextInt()]++;

        for(int i=1; i<=N; i++) {
            if(kayak[i]==-1) {
                if(kayak[i-1]>0) {
                    kayak[i-1]--;
                    kayak[i]++;
                } else if(kayak[i+1]>0) {
                    kayak[i+1]--;
                    kayak[i]++;
                }
            }
        }

        int ans = 0;
        for(int i=1; i<=N; i++) {
            if(kayak[i]<0) ans++;
        }

        System.out.println(ans);

        sc.close();
    }
}
